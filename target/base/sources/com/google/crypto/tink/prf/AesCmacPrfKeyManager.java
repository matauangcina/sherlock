package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.AesCmacPrfKey;
import com.google.crypto.tink.proto.AesCmacPrfKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.PrfAesCmac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AesCmacPrfKeyManager extends KeyTypeManager<AesCmacPrfKey> {
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int VERSION = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AesCmacPrfKeyManager() {
        super(AesCmacPrfKey.class, new PrimitiveFactory<Prf, AesCmacPrfKey>(Prf.class) { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public Prf getPrimitive(AesCmacPrfKey key) throws GeneralSecurityException {
                return new PrfAesCmac(key.getKeyValue().toByteArray());
            }
        });
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacPrfKey";
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
    public void validateKey(AesCmacPrfKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        validateSize(key.getKeyValue().size());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public AesCmacPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesCmacPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateSize(int size) throws GeneralSecurityException {
        if (size != 32) {
            throw new GeneralSecurityException("AesCmacPrfKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, AesCmacPrfKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesCmacPrfKeyFormat, AesCmacPrfKey>(AesCmacPrfKeyFormat.class) { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager.2
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesCmacPrfKeyFormat format) throws GeneralSecurityException {
                AesCmacPrfKeyManager.validateSize(format.getKeySize());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public AesCmacPrfKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return AesCmacPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public AesCmacPrfKey createKey(AesCmacPrfKeyFormat format) {
                return (AesCmacPrfKey) AesCmacPrfKey.newBuilder().setVersion(0).setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).build();
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesCmacPrfKeyFormat>> keyFormats() throws GeneralSecurityException {
                Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesCmacPrfKeyFormat>> result = new HashMap<>();
                result.put("AES256_CMAC_PRF", new KeyTypeManager.KeyFactory.KeyFormat<>((AesCmacPrfKeyFormat) AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build(), KeyTemplate.OutputPrefixType.RAW));
                result.put("AES_CMAC_PRF", new KeyTypeManager.KeyFactory.KeyFormat<>((AesCmacPrfKeyFormat) AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build(), KeyTemplate.OutputPrefixType.RAW));
                return Collections.unmodifiableMap(result);
            }
        };
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCmacPrfKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate aes256CmacTemplate() {
        AesCmacPrfKeyFormat format = (AesCmacPrfKeyFormat) AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build();
        return KeyTemplate.create(new AesCmacPrfKeyManager().getKeyType(), format.toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }
}
