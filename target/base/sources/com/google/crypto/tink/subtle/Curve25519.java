package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes.dex */
final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}};

    private static void monty(long[] x2, long[] z2, long[] x3, long[] z3, long[] x, long[] z, long[] xprime, long[] zprime, long[] qmqp) {
        long[] origx = Arrays.copyOf(x, 10);
        long[] zzz = new long[19];
        long[] xx = new long[19];
        long[] zz = new long[19];
        long[] xxprime = new long[19];
        long[] zzprime = new long[19];
        long[] zzzprime = new long[19];
        long[] xxxprime = new long[19];
        Field25519.sum(x, z);
        Field25519.sub(z, origx);
        long[] origxprime = Arrays.copyOf(xprime, 10);
        Field25519.sum(xprime, zprime);
        Field25519.sub(zprime, origxprime);
        Field25519.product(xxprime, xprime, z);
        Field25519.product(zzprime, x, zprime);
        Field25519.reduceSizeByModularReduction(xxprime);
        Field25519.reduceCoefficients(xxprime);
        Field25519.reduceSizeByModularReduction(zzprime);
        Field25519.reduceCoefficients(zzprime);
        System.arraycopy(xxprime, 0, origxprime, 0, 10);
        Field25519.sum(xxprime, zzprime);
        Field25519.sub(zzprime, origxprime);
        Field25519.square(xxxprime, xxprime);
        Field25519.square(zzzprime, zzprime);
        Field25519.product(zzprime, zzzprime, qmqp);
        Field25519.reduceSizeByModularReduction(zzprime);
        Field25519.reduceCoefficients(zzprime);
        System.arraycopy(xxxprime, 0, x3, 0, 10);
        System.arraycopy(zzprime, 0, z3, 0, 10);
        Field25519.square(xx, x);
        Field25519.square(zz, z);
        Field25519.product(x2, xx, zz);
        Field25519.reduceSizeByModularReduction(x2);
        Field25519.reduceCoefficients(x2);
        Field25519.sub(zz, xx);
        Arrays.fill(zzz, 10, zzz.length - 1, 0L);
        Field25519.scalarProduct(zzz, zz, 121665L);
        Field25519.reduceCoefficients(zzz);
        Field25519.sum(zzz, xx);
        Field25519.product(z2, zz, zzz);
        Field25519.reduceSizeByModularReduction(z2);
        Field25519.reduceCoefficients(z2);
    }

    static void swapConditional(long[] a, long[] b, int iswap) {
        int swap = -iswap;
        for (int i = 0; i < 10; i++) {
            int x = (((int) a[i]) ^ ((int) b[i])) & swap;
            a[i] = ((int) a[i]) ^ x;
            b[i] = ((int) b[i]) ^ x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyConditional(long[] a, long[] b, int icopy) {
        int copy = -icopy;
        for (int i = 0; i < 10; i++) {
            int x = (((int) a[i]) ^ ((int) b[i])) & copy;
            a[i] = ((int) a[i]) ^ x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void curveMult(long[] resultx, byte[] n, byte[] qBytes) throws InvalidKeyException {
        byte[] qBytesWithoutMsb = validatePubKeyAndClearMsb(qBytes);
        long[] q = Field25519.expand(qBytesWithoutMsb);
        long[] nqpqx = new long[19];
        long[] nqpqz = new long[19];
        nqpqz[0] = 1;
        long[] nqx = new long[19];
        nqx[0] = 1;
        long[] nqz = new long[19];
        long[] nqpqz2 = new long[19];
        long[] nqpqz22 = new long[19];
        nqpqz22[0] = 1;
        long[] nqpqz23 = new long[19];
        long[] nqpqx2 = new long[19];
        nqpqx2[0] = 1;
        long[] nqz2 = new long[19];
        System.arraycopy(q, 0, nqpqx, 0, 10);
        int i = 0;
        long[] nqpqz24 = nqpqz22;
        while (i < 32) {
            int b = n[(32 - i) - 1] & UByte.MAX_VALUE;
            long[] jArr = nqpqz23;
            long[] nqx2 = nqz2;
            long[] nqz22 = nqpqx2;
            long[] nqpqx3 = nqpqx;
            long[] nqpqx4 = nqpqz2;
            long[] nqpqx22 = nqpqz;
            long[] nqpqz3 = jArr;
            long[] jArr2 = nqz;
            long[] nqz3 = nqpqz24;
            long[] nqpqz25 = jArr2;
            long[] jArr3 = nqx;
            int j = 0;
            long[] nqx3 = jArr3;
            while (j < 8) {
                int bit = (b >> (7 - j)) & 1;
                swapConditional(nqx3, nqpqx3, bit);
                swapConditional(nqpqz25, nqpqx22, bit);
                long[] nqz23 = nqz22;
                long[] nqz24 = nqpqz3;
                long[] nqpqx23 = nqpqx4;
                byte[] qBytesWithoutMsb2 = qBytesWithoutMsb;
                long[] nqx22 = nqpqz3;
                long[] nqz4 = nqpqz25;
                long[] nqx4 = nqx3;
                long[] t = nqz3;
                long[] nqpqz4 = nqpqx22;
                monty(nqz24, nqz23, nqpqx23, nqz3, nqx3, nqz4, nqpqx3, nqpqx22, q);
                swapConditional(nqx22, nqpqx23, bit);
                swapConditional(nqz23, t, bit);
                nqx3 = nqx22;
                nqpqz3 = nqx4;
                nqpqz25 = nqz23;
                nqz22 = nqz4;
                long[] t2 = nqpqx3;
                nqpqx3 = nqpqx23;
                nqpqx4 = t2;
                nqpqx22 = t;
                nqz3 = nqpqz4;
                j++;
                nqx2 = nqpqz4;
                qBytesWithoutMsb = qBytesWithoutMsb2;
                b = b;
            }
            byte[] qBytesWithoutMsb3 = qBytesWithoutMsb;
            long[] nqx23 = nqpqz3;
            long[] nqz5 = nqpqz25;
            long[] nqpqz5 = nqpqx22;
            long[] t3 = nqx2;
            nqpqz2 = nqpqx4;
            long[] t4 = nqz3;
            i++;
            nqpqz24 = t4;
            nqpqx = nqpqx3;
            nqz = nqz5;
            nqx = nqx3;
            nqpqz = nqpqz5;
            nqpqz23 = nqx23;
            nqpqx2 = nqz22;
            qBytesWithoutMsb = qBytesWithoutMsb3;
            nqz2 = t3;
        }
        long[] zmone = new long[10];
        Field25519.inverse(zmone, nqz);
        Field25519.mult(resultx, nqx, zmone);
        if (!isCollinear(q, resultx, nqpqx, nqpqz)) {
            throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + Hex.encode(qBytes));
        }
    }

    private static byte[] validatePubKeyAndClearMsb(byte[] pubKey) throws InvalidKeyException {
        if (pubKey.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] pubKeyWithoutMsb = Arrays.copyOf(pubKey, pubKey.length);
        pubKeyWithoutMsb[31] = (byte) (pubKeyWithoutMsb[31] & ByteCompanionObject.MAX_VALUE);
        int i = 0;
        while (true) {
            byte[][] bArr = BANNED_PUBLIC_KEYS;
            if (i < bArr.length) {
                if (!Bytes.equal(bArr[i], pubKeyWithoutMsb)) {
                    i++;
                } else {
                    throw new InvalidKeyException("Banned public key: " + Hex.encode(bArr[i]));
                }
            } else {
                return pubKeyWithoutMsb;
            }
        }
    }

    private static boolean isCollinear(long[] x1, long[] x2, long[] x3, long[] z3) {
        long[] x1multx2 = new long[10];
        long[] x1addx2 = new long[10];
        long[] lhs = new long[11];
        long[] t = new long[11];
        long[] t2 = new long[11];
        Field25519.mult(x1multx2, x1, x2);
        Field25519.sum(x1addx2, x1, x2);
        long[] a = new long[10];
        a[0] = 486662;
        Field25519.sum(t, x1addx2, a);
        Field25519.mult(t, t, z3);
        Field25519.sum(t, x3);
        Field25519.mult(t, t, x1multx2);
        Field25519.mult(t, t, x3);
        Field25519.scalarProduct(lhs, t, 4L);
        Field25519.reduceCoefficients(lhs);
        Field25519.mult(t, x1multx2, z3);
        Field25519.sub(t, t, z3);
        Field25519.mult(t2, x1addx2, x3);
        Field25519.sum(t, t, t2);
        Field25519.square(t, t);
        return Bytes.equal(Field25519.contract(lhs), Field25519.contract(t));
    }

    private Curve25519() {
    }
}
