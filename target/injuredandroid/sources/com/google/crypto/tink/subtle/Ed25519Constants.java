package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Ed25519;
import java.lang.reflect.Array;
import java.math.BigInteger;
/* loaded from: classes.dex */
final class Ed25519Constants {

    /* renamed from: B2 */
    static final Ed25519.CachedXYT[] f5839B2;
    static final Ed25519.CachedXYT[][] B_TABLE;

    /* renamed from: D */
    static final long[] f5840D;

    /* renamed from: D2 */
    static final long[] f5841D2;
    static final long[] SQRTM1;
    private static final BigInteger P_BI = BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));
    private static final BigInteger D_BI = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(P_BI)).mod(P_BI);
    private static final BigInteger D2_BI = BigInteger.valueOf(2).multiply(D_BI).mod(P_BI);
    private static final BigInteger SQRTM1_BI = BigInteger.valueOf(2).modPow(P_BI.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), P_BI);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Point {

        /* renamed from: x */
        private BigInteger f5842x;

        /* renamed from: y */
        private BigInteger f5843y;

        private Point() {
        }
    }

    static {
        Point point = new Point();
        point.f5843y = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(P_BI)).mod(P_BI);
        point.f5842x = recoverX(point.f5843y);
        f5840D = Field25519.expand(toLittleEndian(D_BI));
        f5841D2 = Field25519.expand(toLittleEndian(D2_BI));
        SQRTM1 = Field25519.expand(toLittleEndian(SQRTM1_BI));
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance(Ed25519.CachedXYT.class, 32, 8);
        Point point2 = point;
        for (int i = 0; i < 32; i++) {
            Point point3 = point2;
            for (int i2 = 0; i2 < 8; i2++) {
                B_TABLE[i][i2] = getCachedXYT(point3);
                point3 = edwards(point3, point2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                point2 = edwards(point2, point2);
            }
        }
        Point edwards = edwards(point, point);
        f5839B2 = new Ed25519.CachedXYT[8];
        for (int i4 = 0; i4 < 8; i4++) {
            f5839B2[i4] = getCachedXYT(point);
            point = edwards(point, edwards);
        }
    }

    Ed25519Constants() {
    }

    private static Point edwards(Point point, Point point2) {
        Point point3 = new Point();
        BigInteger mod = D_BI.multiply(point.f5842x.multiply(point2.f5842x).multiply(point.f5843y).multiply(point2.f5843y)).mod(P_BI);
        point3.f5842x = point.f5842x.multiply(point2.f5843y).add(point2.f5842x.multiply(point.f5843y)).multiply(BigInteger.ONE.add(mod).modInverse(P_BI)).mod(P_BI);
        point3.f5843y = point.f5843y.multiply(point2.f5843y).add(point.f5842x.multiply(point2.f5842x)).multiply(BigInteger.ONE.subtract(mod).modInverse(P_BI)).mod(P_BI);
        return point3;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point point) {
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(point.f5843y.add(point.f5842x).mod(P_BI))), Field25519.expand(toLittleEndian(point.f5843y.subtract(point.f5842x).mod(P_BI))), Field25519.expand(toLittleEndian(D2_BI.multiply(point.f5842x).multiply(point.f5843y).mod(P_BI))));
    }

    private static BigInteger recoverX(BigInteger bigInteger) {
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(D_BI.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(P_BI));
        BigInteger modPow = multiply.modPow(P_BI.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), P_BI);
        if (!modPow.pow(2).subtract(multiply).mod(P_BI).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(SQRTM1_BI).mod(P_BI);
        }
        return modPow.testBit(0) ? P_BI.subtract(modPow) : modPow;
    }

    private static byte[] toLittleEndian(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = (32 - i) - 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
