package com.google.crypto.tink.mac.internal;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes.dex */
public final class AesUtil {
    public static final int BLOCK_SIZE = 16;

    public static byte[] dbl(final byte[] value) {
        if (value.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] res = new byte[16];
        for (int i = 0; i < 16; i++) {
            res[i] = (byte) ((value[i] << 1) & 254);
            if (i < 15) {
                res[i] = (byte) (res[i] | ((byte) ((value[i + 1] >> 7) & 1)));
            }
        }
        res[15] = (byte) (res[15] ^ ((byte) ((value[0] >> 7) & 135)));
        return res;
    }

    public static byte[] cmacPad(final byte[] x) {
        if (x.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] result = Arrays.copyOf(x, 16);
        result[x.length] = ByteCompanionObject.MIN_VALUE;
        return result;
    }

    private AesUtil() {
    }
}
