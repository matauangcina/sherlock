package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.hybrid.subtle.AeadOrDaead;
import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.AesSivKey;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RegistryEciesAeadHkdfDemHelper implements EciesAeadHkdfDemHelper {
    private AesCtrHmacAeadKey aesCtrHmacAeadKey;
    private int aesCtrKeySize;
    private AesGcmKey aesGcmKey;
    private AesSivKey aesSivKey;
    private final String demKeyTypeUrl;
    private final int symmetricKeySize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegistryEciesAeadHkdfDemHelper(KeyTemplate demTemplate) throws GeneralSecurityException {
        String typeUrl = demTemplate.getTypeUrl();
        this.demKeyTypeUrl = typeUrl;
        if (typeUrl.equals(AeadConfig.AES_GCM_TYPE_URL)) {
            try {
                AesGcmKeyFormat gcmKeyFormat = AesGcmKeyFormat.parseFrom(demTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.aesGcmKey = (AesGcmKey) Registry.newKey(demTemplate);
                this.symmetricKeySize = gcmKeyFormat.getKeySize();
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (typeUrl.equals(AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL)) {
            try {
                AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = AesCtrHmacAeadKeyFormat.parseFrom(demTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.aesCtrHmacAeadKey = (AesCtrHmacAeadKey) Registry.newKey(demTemplate);
                this.aesCtrKeySize = aesCtrHmacAeadKeyFormat.getAesCtrKeyFormat().getKeySize();
                int hmacKeySize = aesCtrHmacAeadKeyFormat.getHmacKeyFormat().getKeySize();
                this.symmetricKeySize = this.aesCtrKeySize + hmacKeySize;
            } catch (InvalidProtocolBufferException e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (typeUrl.equals(DeterministicAeadConfig.AES_SIV_TYPE_URL)) {
            try {
                AesSivKeyFormat aesSivKeyFormat = AesSivKeyFormat.parseFrom(demTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.aesSivKey = (AesSivKey) Registry.newKey(demTemplate);
                this.symmetricKeySize = aesSivKeyFormat.getKeySize();
            } catch (InvalidProtocolBufferException e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: " + typeUrl);
        }
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public int getSymmetricKeySizeInBytes() {
        return this.symmetricKeySize;
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public AeadOrDaead getAeadOrDaead(final byte[] symmetricKeyValue) throws GeneralSecurityException {
        if (symmetricKeyValue.length != getSymmetricKeySizeInBytes()) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.demKeyTypeUrl.equals(AeadConfig.AES_GCM_TYPE_URL)) {
            AesGcmKey aeadKey = (AesGcmKey) AesGcmKey.newBuilder().mergeFrom((AesGcmKey.Builder) this.aesGcmKey).setKeyValue(ByteString.copyFrom(symmetricKeyValue, 0, this.symmetricKeySize)).build();
            return new AeadOrDaead((Aead) Registry.getPrimitive(this.demKeyTypeUrl, aeadKey, Aead.class));
        } else if (this.demKeyTypeUrl.equals(AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL)) {
            byte[] aesCtrKeyValue = Arrays.copyOfRange(symmetricKeyValue, 0, this.aesCtrKeySize);
            byte[] hmacKeyValue = Arrays.copyOfRange(symmetricKeyValue, this.aesCtrKeySize, this.symmetricKeySize);
            AesCtrKey aesCtrKey = (AesCtrKey) AesCtrKey.newBuilder().mergeFrom((AesCtrKey.Builder) this.aesCtrHmacAeadKey.getAesCtrKey()).setKeyValue(ByteString.copyFrom(aesCtrKeyValue)).build();
            HmacKey hmacKey = (HmacKey) HmacKey.newBuilder().mergeFrom((HmacKey.Builder) this.aesCtrHmacAeadKey.getHmacKey()).setKeyValue(ByteString.copyFrom(hmacKeyValue)).build();
            AesCtrHmacAeadKey aeadKey2 = (AesCtrHmacAeadKey) AesCtrHmacAeadKey.newBuilder().setVersion(this.aesCtrHmacAeadKey.getVersion()).setAesCtrKey(aesCtrKey).setHmacKey(hmacKey).build();
            return new AeadOrDaead((Aead) Registry.getPrimitive(this.demKeyTypeUrl, aeadKey2, Aead.class));
        } else if (this.demKeyTypeUrl.equals(DeterministicAeadConfig.AES_SIV_TYPE_URL)) {
            AesSivKey daeadKey = (AesSivKey) AesSivKey.newBuilder().mergeFrom((AesSivKey.Builder) this.aesSivKey).setKeyValue(ByteString.copyFrom(symmetricKeyValue, 0, this.symmetricKeySize)).build();
            return new AeadOrDaead((DeterministicAead) Registry.getPrimitive(this.demKeyTypeUrl, daeadKey, DeterministicAead.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
