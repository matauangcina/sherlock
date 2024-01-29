package com.google.crypto.tink.util;

import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
@Immutable
/* loaded from: classes.dex */
public final class Bytes {
    private final byte[] data;

    public static Bytes copyFrom(final byte[] data) {
        if (data == null) {
            throw new NullPointerException("data must be non-null");
        }
        return copyFrom(data, 0, data.length);
    }

    public static Bytes copyFrom(final byte[] data, final int start, final int len) {
        if (data == null) {
            throw new NullPointerException("data must be non-null");
        }
        return new Bytes(data, start, len);
    }

    public byte[] toByteArray() {
        byte[] bArr = this.data;
        byte[] result = new byte[bArr.length];
        System.arraycopy(bArr, 0, result, 0, bArr.length);
        return result;
    }

    public int size() {
        return this.data.length;
    }

    private Bytes(final byte[] buf, final int start, final int len) {
        byte[] bArr = new byte[len];
        this.data = bArr;
        System.arraycopy(buf, start, bArr, 0, len);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Bytes)) {
            return false;
        }
        Bytes other = (Bytes) o;
        return Arrays.equals(other.data, this.data);
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public String toString() {
        return "Bytes(" + Hex.encode(this.data) + ")";
    }
}
