package org.apache.commons.p008io;

import java.nio.ByteOrder;
/* renamed from: org.apache.commons.io.ByteOrderParser */
/* loaded from: classes.dex */
public final class ByteOrderParser {
    private ByteOrderParser() {
    }

    public static ByteOrder parseByteOrder(String value) {
        if (ByteOrder.BIG_ENDIAN.toString().equals(value)) {
            return ByteOrder.BIG_ENDIAN;
        }
        if (ByteOrder.LITTLE_ENDIAN.toString().equals(value)) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        throw new IllegalArgumentException("Unsupported byte order setting: " + value + ", expeced one of " + ByteOrder.LITTLE_ENDIAN + ", " + ByteOrder.BIG_ENDIAN);
    }
}
