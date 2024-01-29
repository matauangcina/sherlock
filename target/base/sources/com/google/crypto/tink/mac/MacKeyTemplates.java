package com.google.crypto.tink.mac;

import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
/* loaded from: classes.dex */
public final class MacKeyTemplates {
    public static final KeyTemplate HMAC_SHA256_128BITTAG = createHmacKeyTemplate(32, 16, HashType.SHA256);
    public static final KeyTemplate HMAC_SHA256_256BITTAG = createHmacKeyTemplate(32, 32, HashType.SHA256);
    public static final KeyTemplate HMAC_SHA512_256BITTAG = createHmacKeyTemplate(64, 32, HashType.SHA512);
    public static final KeyTemplate HMAC_SHA512_512BITTAG = createHmacKeyTemplate(64, 64, HashType.SHA512);
    public static final KeyTemplate AES_CMAC = (KeyTemplate) KeyTemplate.newBuilder().setValue(((AesCmacKeyFormat) AesCmacKeyFormat.newBuilder().setKeySize(32).setParams((AesCmacParams) AesCmacParams.newBuilder().setTagSize(16).build()).build()).toByteString()).setTypeUrl(new AesCmacKeyManager().getKeyType()).setOutputPrefixType(OutputPrefixType.TINK).build();

    public static KeyTemplate createHmacKeyTemplate(int keySize, int tagSize, HashType hashType) {
        HmacParams params = (HmacParams) HmacParams.newBuilder().setHash(hashType).setTagSize(tagSize).build();
        HmacKeyFormat format = (HmacKeyFormat) HmacKeyFormat.newBuilder().setParams(params).setKeySize(keySize).build();
        return (KeyTemplate) KeyTemplate.newBuilder().setValue(format.toByteString()).setTypeUrl(new HmacKeyManager().getKeyType()).setOutputPrefixType(OutputPrefixType.TINK).build();
    }

    private MacKeyTemplates() {
    }
}
