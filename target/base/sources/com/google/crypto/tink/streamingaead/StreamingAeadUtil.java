package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
final class StreamingAeadUtil {

    /* renamed from: com.google.crypto.tink.streamingaead.StreamingAeadUtil$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C12541 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public static String toHmacAlgo(HashType hash) throws NoSuchAlgorithmException {
        switch (C12541.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha224";
            case 3:
                return "HmacSha256";
            case 4:
                return "HmacSha384";
            case 5:
                return "HmacSha512";
            default:
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hash);
        }
    }

    private StreamingAeadUtil() {
    }
}
