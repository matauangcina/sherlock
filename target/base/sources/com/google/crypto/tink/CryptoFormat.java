package com.google.crypto.tink;

import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class CryptoFormat {
    public static final int LEGACY_PREFIX_SIZE = 5;
    public static final byte LEGACY_START_BYTE = 0;
    public static final int NON_RAW_PREFIX_SIZE = 5;
    public static final byte[] RAW_PREFIX = new byte[0];
    public static final int RAW_PREFIX_SIZE = 0;
    public static final int TINK_PREFIX_SIZE = 5;
    public static final byte TINK_START_BYTE = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.CryptoFormat$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C09371 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public static byte[] getOutputPrefix(Keyset.Key key) throws GeneralSecurityException {
        switch (C09371.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[key.getOutputPrefixType().ordinal()]) {
            case 1:
            case 2:
                return ByteBuffer.allocate(5).put((byte) 0).putInt(key.getKeyId()).array();
            case 3:
                return ByteBuffer.allocate(5).put((byte) 1).putInt(key.getKeyId()).array();
            case 4:
                return RAW_PREFIX;
            default:
                throw new GeneralSecurityException("unknown output prefix type");
        }
    }

    private CryptoFormat() {
    }
}
