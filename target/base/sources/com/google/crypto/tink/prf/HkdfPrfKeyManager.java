package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.HkdfPrfParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Enums;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.crypto.tink.subtle.prf.HkdfStreamingPrf;
import com.google.crypto.tink.subtle.prf.PrfImpl;
import com.google.crypto.tink.subtle.prf.StreamingPrf;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class HkdfPrfKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.HkdfPrfKey> {
    private static final int MIN_KEY_SIZE = 32;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.prf.HkdfPrfKeyManager$4 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C10534 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Enums.HashType convertHash(HashType hashType) throws GeneralSecurityException {
        switch (C10534.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()]) {
            case 1:
                return Enums.HashType.SHA1;
            case 2:
                return Enums.HashType.SHA256;
            case 3:
                return Enums.HashType.SHA384;
            case 4:
                return Enums.HashType.SHA512;
            default:
                throw new GeneralSecurityException("HashType " + hashType.name() + " not known in");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HkdfPrfKeyManager() {
        super(com.google.crypto.tink.proto.HkdfPrfKey.class, new PrimitiveFactory<StreamingPrf, com.google.crypto.tink.proto.HkdfPrfKey>(StreamingPrf.class) { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public StreamingPrf getPrimitive(com.google.crypto.tink.proto.HkdfPrfKey key) throws GeneralSecurityException {
                return new HkdfStreamingPrf(HkdfPrfKeyManager.convertHash(key.getParams().getHash()), key.getKeyValue().toByteArray(), key.getParams().getSalt().toByteArray());
            }
        }, new PrimitiveFactory<Prf, com.google.crypto.tink.proto.HkdfPrfKey>(Prf.class) { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager.2
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public Prf getPrimitive(com.google.crypto.tink.proto.HkdfPrfKey key) throws GeneralSecurityException {
                return PrfImpl.wrap(new HkdfStreamingPrf(HkdfPrfKeyManager.convertHash(key.getParams().getHash()), key.getKeyValue().toByteArray(), key.getParams().getSalt().toByteArray()));
            }
        });
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HkdfPrfKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.HkdfPrfKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        validateKeySize(key.getKeyValue().size());
        validateParams(key.getParams());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.HkdfPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.HkdfPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, com.google.crypto.tink.proto.HkdfPrfKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<HkdfPrfKeyFormat, com.google.crypto.tink.proto.HkdfPrfKey>(HkdfPrfKeyFormat.class) { // from class: com.google.crypto.tink.prf.HkdfPrfKeyManager.3
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(HkdfPrfKeyFormat format) throws GeneralSecurityException {
                HkdfPrfKeyManager.validateKeySize(format.getKeySize());
                HkdfPrfKeyManager.validateParams(format.getParams());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public HkdfPrfKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return HkdfPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public com.google.crypto.tink.proto.HkdfPrfKey createKey(HkdfPrfKeyFormat format) throws GeneralSecurityException {
                return (com.google.crypto.tink.proto.HkdfPrfKey) com.google.crypto.tink.proto.HkdfPrfKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).setVersion(HkdfPrfKeyManager.this.getVersion()).setParams(format.getParams()).build();
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<HkdfPrfKeyFormat>> keyFormats() throws GeneralSecurityException {
                Map<String, KeyTypeManager.KeyFactory.KeyFormat<HkdfPrfKeyFormat>> result = new HashMap<>();
                result.put("HKDF_SHA256", new KeyTypeManager.KeyFactory.KeyFormat<>((HkdfPrfKeyFormat) HkdfPrfKeyFormat.newBuilder().setKeySize(32).setParams(HkdfPrfParams.newBuilder().setHash(HashType.SHA256)).build(), KeyTemplate.OutputPrefixType.RAW));
                return Collections.unmodifiableMap(result);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateKeySize(int keySize) throws GeneralSecurityException {
        if (keySize < 32) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateParams(HkdfPrfParams params) throws GeneralSecurityException {
        if (params.getHash() != HashType.SHA256 && params.getHash() != HashType.SHA512) {
            throw new GeneralSecurityException("Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash");
        }
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new HkdfPrfKeyManager(), newKeyAllowed);
        HkdfPrfProtoSerialization.register();
    }

    public static String staticKeyType() {
        return new HkdfPrfKeyManager().getKeyType();
    }

    public static final KeyTemplate hkdfSha256Template() {
        HkdfPrfKeyFormat format = (HkdfPrfKeyFormat) HkdfPrfKeyFormat.newBuilder().setKeySize(32).setParams(HkdfPrfParams.newBuilder().setHash(HashType.SHA256)).build();
        return KeyTemplate.create(staticKeyType(), format.toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }
}
