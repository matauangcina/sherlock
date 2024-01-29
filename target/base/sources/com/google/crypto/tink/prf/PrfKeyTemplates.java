package com.google.crypto.tink.prf;

import com.google.crypto.tink.proto.AesCmacPrfKeyFormat;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.HkdfPrfParams;
import com.google.crypto.tink.proto.HmacPrfKeyFormat;
import com.google.crypto.tink.proto.HmacPrfParams;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
/* loaded from: classes.dex */
public final class PrfKeyTemplates {
    public static final KeyTemplate HKDF_SHA256 = createHkdfKeyTemplate();
    public static final KeyTemplate HMAC_SHA256_PRF = createHmacTemplate(32, HashType.SHA256);
    public static final KeyTemplate HMAC_SHA512_PRF = createHmacTemplate(64, HashType.SHA512);
    public static final KeyTemplate AES_CMAC_PRF = createAes256CmacTemplate();

    private PrfKeyTemplates() {
    }

    private static KeyTemplate createHkdfKeyTemplate() {
        HkdfPrfKeyFormat format = (HkdfPrfKeyFormat) HkdfPrfKeyFormat.newBuilder().setKeySize(32).setParams(HkdfPrfParams.newBuilder().setHash(HashType.SHA256)).build();
        return (KeyTemplate) KeyTemplate.newBuilder().setValue(format.toByteString()).setTypeUrl(HkdfPrfKeyManager.staticKeyType()).setOutputPrefixType(OutputPrefixType.RAW).build();
    }

    private static KeyTemplate createHmacTemplate(int keySize, HashType hashType) {
        HmacPrfParams params = (HmacPrfParams) HmacPrfParams.newBuilder().setHash(hashType).build();
        HmacPrfKeyFormat format = (HmacPrfKeyFormat) HmacPrfKeyFormat.newBuilder().setParams(params).setKeySize(keySize).build();
        return (KeyTemplate) KeyTemplate.newBuilder().setTypeUrl(new HmacPrfKeyManager().getKeyType()).setValue(format.toByteString()).setOutputPrefixType(OutputPrefixType.RAW).build();
    }

    private static KeyTemplate createAes256CmacTemplate() {
        AesCmacPrfKeyFormat format = (AesCmacPrfKeyFormat) AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build();
        return (KeyTemplate) KeyTemplate.newBuilder().setTypeUrl(new AesCmacPrfKeyManager().getKeyType()).setValue(format.toByteString()).setOutputPrefixType(OutputPrefixType.RAW).build();
    }
}
