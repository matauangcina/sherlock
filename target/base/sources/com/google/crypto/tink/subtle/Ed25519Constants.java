package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Ed25519;
import java.lang.reflect.Array;
import java.math.BigInteger;
/* loaded from: classes.dex */
final class Ed25519Constants {

    /* renamed from: B2 */
    static final Ed25519.CachedXYT[] f333B2;
    static final Ed25519.CachedXYT[][] B_TABLE;

    /* renamed from: D */
    static final long[] f334D;

    /* renamed from: D2 */
    static final long[] f335D2;
    private static final BigInteger D2_BI;
    private static final BigInteger D_BI;
    private static final BigInteger P_BI;
    static final long[] SQRTM1;
    private static final BigInteger SQRTM1_BI;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        P_BI = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        D_BI = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        D2_BI = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        SQRTM1_BI = modPow;
        Point b = new Point();
        b.f337y = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        b.f336x = recoverX(b.f337y);
        f334D = Field25519.expand(toLittleEndian(mod));
        f335D2 = Field25519.expand(toLittleEndian(mod2));
        SQRTM1 = Field25519.expand(toLittleEndian(modPow));
        Point bi = b;
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance(Ed25519.CachedXYT.class, 32, 8);
        for (int i = 0; i < 32; i++) {
            Point bij = bi;
            for (int j = 0; j < 8; j++) {
                B_TABLE[i][j] = getCachedXYT(bij);
                bij = edwards(bij, bi);
            }
            for (int j2 = 0; j2 < 8; j2++) {
                bi = edwards(bi, bi);
            }
        }
        Point bi2 = b;
        Point b2 = edwards(b, b);
        f333B2 = new Ed25519.CachedXYT[8];
        for (int i2 = 0; i2 < 8; i2++) {
            f333B2[i2] = getCachedXYT(bi2);
            bi2 = edwards(bi2, b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Point {

        /* renamed from: x */
        private BigInteger f336x;

        /* renamed from: y */
        private BigInteger f337y;

        private Point() {
        }
    }

    private static BigInteger recoverX(BigInteger y) {
        BigInteger subtract = y.pow(2).subtract(BigInteger.ONE);
        BigInteger add = D_BI.multiply(y.pow(2)).add(BigInteger.ONE);
        BigInteger bigInteger = P_BI;
        BigInteger xx = subtract.multiply(add.modInverse(bigInteger));
        BigInteger x = xx.modPow(bigInteger.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger);
        if (!x.pow(2).subtract(xx).mod(bigInteger).equals(BigInteger.ZERO)) {
            x = x.multiply(SQRTM1_BI).mod(bigInteger);
        }
        if (x.testBit(0)) {
            return bigInteger.subtract(x);
        }
        return x;
    }

    private static Point edwards(Point a, Point b) {
        Point o = new Point();
        BigInteger multiply = D_BI.multiply(a.f336x.multiply(b.f336x).multiply(a.f337y).multiply(b.f337y));
        BigInteger bigInteger = P_BI;
        BigInteger xxyy = multiply.mod(bigInteger);
        o.f336x = a.f336x.multiply(b.f337y).add(b.f336x.multiply(a.f337y)).multiply(BigInteger.ONE.add(xxyy).modInverse(bigInteger)).mod(bigInteger);
        o.f337y = a.f337y.multiply(b.f337y).add(a.f336x.multiply(b.f336x)).multiply(BigInteger.ONE.subtract(xxyy).modInverse(bigInteger)).mod(bigInteger);
        return o;
    }

    private static byte[] toLittleEndian(BigInteger n) {
        byte[] b = new byte[32];
        byte[] nBytes = n.toByteArray();
        System.arraycopy(nBytes, 0, b, 32 - nBytes.length, nBytes.length);
        for (int i = 0; i < b.length / 2; i++) {
            byte t = b[i];
            b[i] = b[(b.length - i) - 1];
            b[(b.length - i) - 1] = t;
        }
        return b;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point p) {
        BigInteger add = p.f337y.add(p.f336x);
        BigInteger bigInteger = P_BI;
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(add.mod(bigInteger))), Field25519.expand(toLittleEndian(p.f337y.subtract(p.f336x).mod(bigInteger))), Field25519.expand(toLittleEndian(D2_BI.multiply(p.f336x).multiply(p.f337y).mod(bigInteger))));
    }

    private Ed25519Constants() {
    }
}
