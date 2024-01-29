package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class XYZ {

        /* renamed from: x */
        final long[] f329x;

        /* renamed from: y */
        final long[] f330y;

        /* renamed from: z */
        final long[] f331z;

        XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        XYZ(long[] x, long[] y, long[] z) {
            this.f329x = x;
            this.f330y = y;
            this.f331z = z;
        }

        XYZ(XYZ xyz) {
            this.f329x = Arrays.copyOf(xyz.f329x, 10);
            this.f330y = Arrays.copyOf(xyz.f330y, 10);
            this.f331z = Arrays.copyOf(xyz.f331z, 10);
        }

        XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        static XYZ fromPartialXYZT(XYZ out, PartialXYZT in) {
            Field25519.mult(out.f329x, in.xyz.f329x, in.f328t);
            Field25519.mult(out.f330y, in.xyz.f330y, in.xyz.f331z);
            Field25519.mult(out.f331z, in.xyz.f331z, in.f328t);
            return out;
        }

        byte[] toBytes() {
            long[] recip = new long[10];
            long[] x = new long[10];
            long[] y = new long[10];
            Field25519.inverse(recip, this.f331z);
            Field25519.mult(x, this.f329x, recip);
            Field25519.mult(y, this.f330y, recip);
            byte[] s = Field25519.contract(y);
            s[31] = (byte) (s[31] ^ (Ed25519.getLsb(x) << 7));
            return s;
        }

        boolean isOnCurve() {
            long[] x2 = new long[10];
            Field25519.square(x2, this.f329x);
            long[] y2 = new long[10];
            Field25519.square(y2, this.f330y);
            long[] z2 = new long[10];
            Field25519.square(z2, this.f331z);
            long[] z4 = new long[10];
            Field25519.square(z4, z2);
            long[] lhs = new long[10];
            Field25519.sub(lhs, y2, x2);
            Field25519.mult(lhs, lhs, z2);
            long[] rhs = new long[10];
            Field25519.mult(rhs, x2, y2);
            Field25519.mult(rhs, rhs, Ed25519Constants.f334D);
            Field25519.sum(rhs, z4);
            Field25519.reduce(rhs, rhs);
            return Bytes.equal(Field25519.contract(lhs), Field25519.contract(rhs));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class XYZT {

        /* renamed from: t */
        final long[] f332t;
        final XYZ xyz;

        XYZT() {
            this(new XYZ(), new long[10]);
        }

        XYZT(XYZ xyz, long[] t) {
            this.xyz = xyz;
            this.f332t = t;
        }

        XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromPartialXYZT(XYZT out, PartialXYZT in) {
            Field25519.mult(out.xyz.f329x, in.xyz.f329x, in.f328t);
            Field25519.mult(out.xyz.f330y, in.xyz.f330y, in.xyz.f331z);
            Field25519.mult(out.xyz.f331z, in.xyz.f331z, in.f328t);
            Field25519.mult(out.f332t, in.xyz.f329x, in.xyz.f330y);
            return out;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] s) throws GeneralSecurityException {
            long[] x = new long[10];
            long[] y = Field25519.expand(s);
            long[] z = new long[10];
            z[0] = 1;
            long[] t = new long[10];
            long[] u = new long[10];
            long[] v = new long[10];
            long[] vxx = new long[10];
            long[] check = new long[10];
            Field25519.square(u, y);
            Field25519.mult(v, u, Ed25519Constants.f334D);
            Field25519.sub(u, u, z);
            Field25519.sum(v, v, z);
            long[] v3 = new long[10];
            Field25519.square(v3, v);
            Field25519.mult(v3, v3, v);
            Field25519.square(x, v3);
            Field25519.mult(x, x, v);
            Field25519.mult(x, x, u);
            Ed25519.pow2252m3(x, x);
            Field25519.mult(x, x, v3);
            Field25519.mult(x, x, u);
            Field25519.square(vxx, x);
            Field25519.mult(vxx, vxx, v);
            Field25519.sub(check, vxx, u);
            if (Ed25519.isNonZeroVarTime(check)) {
                Field25519.sum(check, vxx, u);
                if (Ed25519.isNonZeroVarTime(check)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                Field25519.mult(x, x, Ed25519Constants.SQRTM1);
            }
            if (Ed25519.isNonZeroVarTime(x) || ((s[31] & UByte.MAX_VALUE) >> 7) == 0) {
                if (Ed25519.getLsb(x) == ((s[31] & UByte.MAX_VALUE) >> 7)) {
                    Ed25519.neg(x, x);
                }
                Field25519.mult(t, x, y);
                return new XYZT(new XYZ(x, y, z), t);
            }
            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class PartialXYZT {

        /* renamed from: t */
        final long[] f328t;
        final XYZ xyz;

        PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        PartialXYZT(XYZ xyz, long[] t) {
            this.xyz = xyz;
            this.f328t = t;
        }

        PartialXYZT(PartialXYZT other) {
            this.xyz = new XYZ(other.xyz);
            this.f328t = Arrays.copyOf(other.f328t, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CachedXYT(long[] yPlusX, long[] yMinusX, long[] t2d) {
            this.yPlusX = yPlusX;
            this.yMinusX = yMinusX;
            this.t2d = t2d;
        }

        CachedXYT(CachedXYT other) {
            this.yPlusX = Arrays.copyOf(other.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(other.yMinusX, 10);
            this.t2d = Arrays.copyOf(other.t2d, 10);
        }

        void multByZ(long[] output, long[] in) {
            System.arraycopy(in, 0, output, 0, 10);
        }

        void copyConditional(CachedXYT other, int icopy) {
            Curve25519.copyConditional(this.yPlusX, other.yPlusX, icopy);
            Curve25519.copyConditional(this.yMinusX, other.yMinusX, icopy);
            Curve25519.copyConditional(this.t2d, other.t2d, icopy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CachedXYZT extends CachedXYT {

        /* renamed from: z */
        private final long[] f327z;

        CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        CachedXYZT(XYZT xyzt) {
            this();
            Field25519.sum(this.yPlusX, xyzt.xyz.f330y, xyzt.xyz.f329x);
            Field25519.sub(this.yMinusX, xyzt.xyz.f330y, xyzt.xyz.f329x);
            System.arraycopy(xyzt.xyz.f331z, 0, this.f327z, 0, 10);
            Field25519.mult(this.t2d, xyzt.f332t, Ed25519Constants.f335D2);
        }

        CachedXYZT(long[] yPlusX, long[] yMinusX, long[] z, long[] t2d) {
            super(yPlusX, yMinusX, t2d);
            this.f327z = z;
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] output, long[] in) {
            Field25519.mult(output, in, this.f327z);
        }
    }

    private static void add(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] t = new long[10];
        Field25519.sum(partialXYZT.xyz.f329x, extended.xyz.f330y, extended.xyz.f329x);
        Field25519.sub(partialXYZT.xyz.f330y, extended.xyz.f330y, extended.xyz.f329x);
        Field25519.mult(partialXYZT.xyz.f330y, partialXYZT.xyz.f330y, cached.yMinusX);
        Field25519.mult(partialXYZT.xyz.f331z, partialXYZT.xyz.f329x, cached.yPlusX);
        Field25519.mult(partialXYZT.f328t, extended.f332t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.f329x, extended.xyz.f331z);
        Field25519.sum(t, partialXYZT.xyz.f329x, partialXYZT.xyz.f329x);
        Field25519.sub(partialXYZT.xyz.f329x, partialXYZT.xyz.f331z, partialXYZT.xyz.f330y);
        Field25519.sum(partialXYZT.xyz.f330y, partialXYZT.xyz.f331z, partialXYZT.xyz.f330y);
        Field25519.sum(partialXYZT.xyz.f331z, t, partialXYZT.f328t);
        Field25519.sub(partialXYZT.f328t, t, partialXYZT.f328t);
    }

    private static void sub(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] t = new long[10];
        Field25519.sum(partialXYZT.xyz.f329x, extended.xyz.f330y, extended.xyz.f329x);
        Field25519.sub(partialXYZT.xyz.f330y, extended.xyz.f330y, extended.xyz.f329x);
        Field25519.mult(partialXYZT.xyz.f330y, partialXYZT.xyz.f330y, cached.yPlusX);
        Field25519.mult(partialXYZT.xyz.f331z, partialXYZT.xyz.f329x, cached.yMinusX);
        Field25519.mult(partialXYZT.f328t, extended.f332t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.f329x, extended.xyz.f331z);
        Field25519.sum(t, partialXYZT.xyz.f329x, partialXYZT.xyz.f329x);
        Field25519.sub(partialXYZT.xyz.f329x, partialXYZT.xyz.f331z, partialXYZT.xyz.f330y);
        Field25519.sum(partialXYZT.xyz.f330y, partialXYZT.xyz.f331z, partialXYZT.xyz.f330y);
        Field25519.sub(partialXYZT.xyz.f331z, t, partialXYZT.f328t);
        Field25519.sum(partialXYZT.f328t, t, partialXYZT.f328t);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ p) {
        long[] t0 = new long[10];
        Field25519.square(partialXYZT.xyz.f329x, p.f329x);
        Field25519.square(partialXYZT.xyz.f331z, p.f330y);
        Field25519.square(partialXYZT.f328t, p.f331z);
        Field25519.sum(partialXYZT.f328t, partialXYZT.f328t, partialXYZT.f328t);
        Field25519.sum(partialXYZT.xyz.f330y, p.f329x, p.f330y);
        Field25519.square(t0, partialXYZT.xyz.f330y);
        Field25519.sum(partialXYZT.xyz.f330y, partialXYZT.xyz.f331z, partialXYZT.xyz.f329x);
        Field25519.sub(partialXYZT.xyz.f331z, partialXYZT.xyz.f331z, partialXYZT.xyz.f329x);
        Field25519.sub(partialXYZT.xyz.f329x, t0, partialXYZT.xyz.f330y);
        Field25519.sub(partialXYZT.f328t, partialXYZT.f328t, partialXYZT.xyz.f331z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT p) {
        doubleXYZ(partialXYZT, p.xyz);
    }

    /* renamed from: eq */
    private static int m26eq(int a, int b) {
        int r = (~(a ^ b)) & 255;
        int r2 = r & (r << 4);
        int r3 = r2 & (r2 << 2);
        return ((r3 & (r3 << 1)) >> 7) & 1;
    }

    private static void select(CachedXYT t, int pos, byte b) {
        int bnegative = (b & UByte.MAX_VALUE) >> 7;
        int babs = b - (((-bnegative) & b) << 1);
        t.copyConditional(Ed25519Constants.B_TABLE[pos][0], m26eq(babs, 1));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][1], m26eq(babs, 2));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][2], m26eq(babs, 3));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][3], m26eq(babs, 4));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][4], m26eq(babs, 5));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][5], m26eq(babs, 6));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][6], m26eq(babs, 7));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][7], m26eq(babs, 8));
        long[] yPlusX = Arrays.copyOf(t.yMinusX, 10);
        long[] yMinusX = Arrays.copyOf(t.yPlusX, 10);
        long[] t2d = Arrays.copyOf(t.t2d, 10);
        neg(t2d, t2d);
        CachedXYT minust = new CachedXYT(yPlusX, yMinusX, t2d);
        t.copyConditional(minust, bnegative);
    }

    private static XYZ scalarMultWithBase(byte[] a) {
        byte[] e = new byte[64];
        for (int i = 0; i < 32; i++) {
            e[(i * 2) + 0] = (byte) (((a[i] & UByte.MAX_VALUE) >> 0) & 15);
            e[(i * 2) + 1] = (byte) (((a[i] & UByte.MAX_VALUE) >> 4) & 15);
        }
        int carry = 0;
        for (int i2 = 0; i2 < e.length - 1; i2++) {
            e[i2] = (byte) (e[i2] + carry);
            int carry2 = e[i2] + 8;
            carry = carry2 >> 4;
            int carry3 = e[i2];
            e[i2] = (byte) (carry3 - (carry << 4));
        }
        int i3 = e.length;
        int i4 = i3 - 1;
        e[i4] = (byte) (e[i4] + carry);
        PartialXYZT ret = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (int i5 = 1; i5 < e.length; i5 += 2) {
            CachedXYT t = new CachedXYT(CACHED_NEUTRAL);
            select(t, i5 / 2, e[i5]);
            add(ret, XYZT.fromPartialXYZT(xyzt, ret), t);
        }
        XYZ xyz = new XYZ();
        doubleXYZ(ret, XYZ.fromPartialXYZT(xyz, ret));
        doubleXYZ(ret, XYZ.fromPartialXYZT(xyz, ret));
        doubleXYZ(ret, XYZ.fromPartialXYZT(xyz, ret));
        doubleXYZ(ret, XYZ.fromPartialXYZT(xyz, ret));
        for (int i6 = 0; i6 < e.length; i6 += 2) {
            CachedXYT t2 = new CachedXYT(CACHED_NEUTRAL);
            select(t2, i6 / 2, e[i6]);
            add(ret, XYZT.fromPartialXYZT(xyzt, ret), t2);
        }
        XYZ result = new XYZ(ret);
        if (!result.isOnCurve()) {
            throw new IllegalStateException("arithmetic error in scalar multiplication");
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] scalarMultWithBaseToBytes(byte[] a) {
        return scalarMultWithBase(a).toBytes();
    }

    private static byte[] slide(byte[] a) {
        byte[] r = new byte[256];
        for (int i = 0; i < 256; i++) {
            r[i] = (byte) (1 & ((a[i >> 3] & UByte.MAX_VALUE) >> (i & 7)));
        }
        for (int i2 = 0; i2 < 256; i2++) {
            if (r[i2] != 0) {
                for (int b = 1; b <= 6 && i2 + b < 256; b++) {
                    if (r[i2 + b] != 0) {
                        if (r[i2] + (r[i2 + b] << b) <= 15) {
                            r[i2] = (byte) (r[i2] + (r[i2 + b] << b));
                            r[i2 + b] = 0;
                        } else if (r[i2] - (r[i2 + b] << b) >= -15) {
                            r[i2] = (byte) (r[i2] - (r[i2 + b] << b));
                            int k = i2 + b;
                            while (true) {
                                if (k >= 256) {
                                    break;
                                } else if (r[k] == 0) {
                                    r[k] = 1;
                                    break;
                                } else {
                                    r[k] = 0;
                                    k++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return r;
    }

    private static XYZ doubleScalarMultVarTime(byte[] a, XYZT pointA, byte[] b) {
        CachedXYZT[] pointAArray = new CachedXYZT[8];
        pointAArray[0] = new CachedXYZT(pointA);
        PartialXYZT t = new PartialXYZT();
        doubleXYZT(t, pointA);
        XYZT doubleA = new XYZT(t);
        for (int i = 1; i < pointAArray.length; i++) {
            add(t, doubleA, pointAArray[i - 1]);
            pointAArray[i] = new CachedXYZT(new XYZT(t));
        }
        byte[] aSlide = slide(a);
        byte[] bSlide = slide(b);
        PartialXYZT t2 = new PartialXYZT(NEUTRAL);
        XYZT u = new XYZT();
        int i2 = 255;
        while (i2 >= 0 && aSlide[i2] == 0 && bSlide[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            doubleXYZ(t2, new XYZ(t2));
            if (aSlide[i2] > 0) {
                add(t2, XYZT.fromPartialXYZT(u, t2), pointAArray[aSlide[i2] / 2]);
            } else if (aSlide[i2] < 0) {
                sub(t2, XYZT.fromPartialXYZT(u, t2), pointAArray[(-aSlide[i2]) / 2]);
            }
            if (bSlide[i2] > 0) {
                add(t2, XYZT.fromPartialXYZT(u, t2), Ed25519Constants.f333B2[bSlide[i2] / 2]);
            } else if (bSlide[i2] < 0) {
                sub(t2, XYZT.fromPartialXYZT(u, t2), Ed25519Constants.f333B2[(-bSlide[i2]) / 2]);
            }
            i2--;
        }
        return new XYZ(t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] in) {
        long[] inCopy = new long[in.length + 1];
        System.arraycopy(in, 0, inCopy, 0, in.length);
        Field25519.reduceCoefficients(inCopy);
        byte[] bytes = Field25519.contract(inCopy);
        for (byte b : bytes) {
            if (b != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] in) {
        return Field25519.contract(in)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] out, long[] in) {
        for (int i = 0; i < in.length; i++) {
            out[i] = -in[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] out, long[] in) {
        long[] t0 = new long[10];
        long[] t1 = new long[10];
        long[] t2 = new long[10];
        Field25519.square(t0, in);
        Field25519.square(t1, t0);
        for (int i = 1; i < 2; i++) {
            Field25519.square(t1, t1);
        }
        Field25519.mult(t1, in, t1);
        Field25519.mult(t0, t0, t1);
        Field25519.square(t0, t0);
        Field25519.mult(t0, t1, t0);
        Field25519.square(t1, t0);
        for (int i2 = 1; i2 < 5; i2++) {
            Field25519.square(t1, t1);
        }
        Field25519.mult(t0, t1, t0);
        Field25519.square(t1, t0);
        for (int i3 = 1; i3 < 10; i3++) {
            Field25519.square(t1, t1);
        }
        Field25519.mult(t1, t1, t0);
        Field25519.square(t2, t1);
        for (int i4 = 1; i4 < 20; i4++) {
            Field25519.square(t2, t2);
        }
        Field25519.mult(t1, t2, t1);
        Field25519.square(t1, t1);
        for (int i5 = 1; i5 < 10; i5++) {
            Field25519.square(t1, t1);
        }
        Field25519.mult(t0, t1, t0);
        Field25519.square(t1, t0);
        for (int i6 = 1; i6 < 50; i6++) {
            Field25519.square(t1, t1);
        }
        Field25519.mult(t1, t1, t0);
        Field25519.square(t2, t1);
        for (int i7 = 1; i7 < 100; i7++) {
            Field25519.square(t2, t2);
        }
        Field25519.mult(t1, t2, t1);
        Field25519.square(t1, t1);
        for (int i8 = 1; i8 < 50; i8++) {
            Field25519.square(t1, t1);
        }
        Field25519.mult(t0, t1, t0);
        Field25519.square(t0, t0);
        for (int i9 = 1; i9 < 2; i9++) {
            Field25519.square(t0, t0);
        }
        Field25519.mult(out, t0, in);
    }

    private static long load3(byte[] in, int idx) {
        long result = in[idx] & 255;
        return result | ((in[idx + 1] & UByte.MAX_VALUE) << 8) | ((in[idx + 2] & UByte.MAX_VALUE) << 16);
    }

    private static long load4(byte[] in, int idx) {
        long result = load3(in, idx);
        return result | ((in[idx + 3] & UByte.MAX_VALUE) << 24);
    }

    private static void reduce(byte[] s) {
        long s1 = (load4(s, 2) >> 5) & 2097151;
        long s2 = (load3(s, 5) >> 2) & 2097151;
        long s3 = (load4(s, 7) >> 7) & 2097151;
        long s4 = (load4(s, 10) >> 4) & 2097151;
        long s5 = (load3(s, 13) >> 1) & 2097151;
        long s7 = (load3(s, 18) >> 3) & 2097151;
        long s8 = load3(s, 21) & 2097151;
        long s9 = (load4(s, 23) >> 5) & 2097151;
        long s10 = (load3(s, 26) >> 2) & 2097151;
        long s11 = (load4(s, 28) >> 7) & 2097151;
        long s12 = (load4(s, 31) >> 4) & 2097151;
        long s13 = (load3(s, 34) >> 1) & 2097151;
        long s14 = (load4(s, 36) >> 6) & 2097151;
        long s15 = (load3(s, 39) >> 3) & 2097151;
        long s18 = (load3(s, 47) >> 2) & 2097151;
        long s19 = (load4(s, 49) >> 7) & 2097151;
        long s20 = (load4(s, 52) >> 4) & 2097151;
        long s21 = (load3(s, 55) >> 1) & 2097151;
        long s22 = (load4(s, 57) >> 6) & 2097151;
        long s23 = load4(s, 60) >> 3;
        long s16 = (load3(s, 42) & 2097151) - (s23 * 683901);
        long s142 = ((s14 - (s23 * 997805)) + (s22 * 136657)) - (s21 * 683901);
        long s122 = ((((s12 + (s23 * 470296)) + (s22 * 654183)) - (s21 * 997805)) + (s20 * 136657)) - (s19 * 683901);
        long s6 = ((load4(s, 15) >> 6) & 2097151) + (s18 * 666643);
        long s82 = s8 + (s20 * 666643) + (s19 * 470296) + (s18 * 654183);
        long s102 = ((((s10 + (s22 * 666643)) + (s21 * 470296)) + (s20 * 654183)) - (s19 * 997805)) + (s18 * 136657);
        long carry6 = (s6 + 1048576) >> 21;
        long s72 = s7 + (s19 * 666643) + (s18 * 470296) + carry6;
        long carry8 = (s82 + 1048576) >> 21;
        long s92 = ((((s9 + (s21 * 666643)) + (s20 * 470296)) + (s19 * 654183)) - (s18 * 997805)) + carry8;
        long carry10 = (s102 + 1048576) >> 21;
        long s112 = ((((((s11 + (s23 * 666643)) + (s22 * 470296)) + (s21 * 654183)) - (s20 * 997805)) + (s19 * 136657)) - (s18 * 683901)) + carry10;
        long carry12 = (s122 + 1048576) >> 21;
        long s132 = ((((s13 + (s23 * 654183)) - (s22 * 997805)) + (s21 * 136657)) - (s20 * 683901)) + carry12;
        long carry14 = (s142 + 1048576) >> 21;
        long s152 = ((s15 + (s23 * 136657)) - (s22 * 683901)) + carry14;
        long carry16 = (s16 + 1048576) >> 21;
        long s17 = ((load4(s, 44) >> 5) & 2097151) + carry16;
        long carry7 = (s72 + 1048576) >> 21;
        long carry9 = (s92 + 1048576) >> 21;
        long carry11 = (s112 + 1048576) >> 21;
        long s123 = (s122 - (carry12 << 21)) + carry11;
        long carry13 = (s132 + 1048576) >> 21;
        long s143 = (s142 - (carry14 << 21)) + carry13;
        long s133 = s132 - (carry13 << 21);
        long carry15 = (s152 + 1048576) >> 21;
        long s162 = (s16 - (carry16 << 21)) + carry15;
        long s153 = s152 - (carry15 << 21);
        long s103 = ((s102 - (carry10 << 21)) + carry9) - (s17 * 683901);
        long s83 = ((((s82 - (carry8 << 21)) + carry7) - (s17 * 997805)) + (s162 * 136657)) - (s153 * 683901);
        long s62 = (((((s6 - (carry6 << 21)) + (s17 * 470296)) + (s162 * 654183)) - (s153 * 997805)) + (s143 * 136657)) - (s133 * 683901);
        long s0 = (load3(s, 0) & 2097151) + (s123 * 666643);
        long s24 = s2 + (s143 * 666643) + (s133 * 470296) + (s123 * 654183);
        long s42 = ((((s4 + (s162 * 666643)) + (s153 * 470296)) + (s143 * 654183)) - (s133 * 997805)) + (s123 * 136657);
        long carry0 = (s0 + 1048576) >> 21;
        long s110 = s1 + (s133 * 666643) + (s123 * 470296) + carry0;
        long carry2 = (s24 + 1048576) >> 21;
        long s32 = ((((s3 + (s153 * 666643)) + (s143 * 470296)) + (s133 * 654183)) - (s123 * 997805)) + carry2;
        long carry4 = (s42 + 1048576) >> 21;
        long s52 = ((((((s5 + (s17 * 666643)) + (s162 * 470296)) + (s153 * 654183)) - (s143 * 997805)) + (s133 * 136657)) - (s123 * 683901)) + carry4;
        long carry62 = (s62 + 1048576) >> 21;
        long s73 = (((((s72 - (carry7 << 21)) + (s17 * 654183)) - (s162 * 997805)) + (s153 * 136657)) - (s143 * 683901)) + carry62;
        long carry82 = (s83 + 1048576) >> 21;
        long s93 = (((s92 - (carry9 << 21)) + (s17 * 136657)) - (s162 * 683901)) + carry82;
        long carry102 = (s103 + 1048576) >> 21;
        long s113 = (s112 - (carry11 << 21)) + carry102;
        long carry1 = (s110 + 1048576) >> 21;
        long carry3 = (s32 + 1048576) >> 21;
        long carry5 = (s52 + 1048576) >> 21;
        long carry72 = (s73 + 1048576) >> 21;
        long s84 = (s83 - (carry82 << 21)) + carry72;
        long carry92 = (s93 + 1048576) >> 21;
        long s104 = (s103 - (carry102 << 21)) + carry92;
        long carry112 = (s113 + 1048576) >> 21;
        long s124 = 0 + carry112;
        long s02 = (s0 - (carry0 << 21)) + (s124 * 666643);
        long carry02 = s02 >> 21;
        long s111 = (s110 - (carry1 << 21)) + (s124 * 470296) + carry02;
        long carry17 = s111 >> 21;
        long s25 = (s24 - (carry2 << 21)) + carry1 + (s124 * 654183) + carry17;
        long carry22 = s25 >> 21;
        long s33 = ((s32 - (carry3 << 21)) - (s124 * 997805)) + carry22;
        long carry32 = s33 >> 21;
        long s43 = (s42 - (carry4 << 21)) + carry3 + (s124 * 136657) + carry32;
        long carry42 = s43 >> 21;
        long s53 = ((s52 - (carry5 << 21)) - (s124 * 683901)) + carry42;
        long carry52 = s53 >> 21;
        long s63 = (s62 - (carry62 << 21)) + carry5 + carry52;
        long carry63 = s63 >> 21;
        long s74 = (s73 - (carry72 << 21)) + carry63;
        long carry73 = s74 >> 21;
        long s85 = s84 + carry73;
        long carry83 = s85 >> 21;
        long s94 = (s93 - (carry92 << 21)) + carry83;
        long carry93 = s94 >> 21;
        long s105 = s104 + carry93;
        long carry103 = s105 >> 21;
        long s114 = (s113 - (carry112 << 21)) + carry103;
        long carry113 = s114 >> 21;
        long s125 = 0 + carry113;
        long s03 = (s02 - (carry02 << 21)) + (666643 * s125);
        long carry03 = s03 >> 21;
        long s115 = (s111 - (carry17 << 21)) + (470296 * s125) + carry03;
        long s04 = s03 - (carry03 << 21);
        long carry18 = s115 >> 21;
        long s26 = (s25 - (carry22 << 21)) + (654183 * s125) + carry18;
        long s116 = s115 - (carry18 << 21);
        long carry23 = s26 >> 21;
        long s34 = ((s33 - (carry32 << 21)) - (997805 * s125)) + carry23;
        long s27 = s26 - (carry23 << 21);
        long carry33 = s34 >> 21;
        long s44 = (s43 - (carry42 << 21)) + (136657 * s125) + carry33;
        long s35 = s34 - (carry33 << 21);
        long carry43 = s44 >> 21;
        long s54 = ((s53 - (carry52 << 21)) - (683901 * s125)) + carry43;
        long s45 = s44 - (carry43 << 21);
        long carry53 = s54 >> 21;
        long s64 = (s63 - (carry63 << 21)) + carry53;
        long s55 = s54 - (carry53 << 21);
        long carry64 = s64 >> 21;
        long s75 = (s74 - (carry73 << 21)) + carry64;
        long s65 = s64 - (carry64 << 21);
        long carry74 = s75 >> 21;
        long s86 = (s85 - (carry83 << 21)) + carry74;
        long s76 = s75 - (carry74 << 21);
        long carry84 = s86 >> 21;
        long s95 = (s94 - (carry93 << 21)) + carry84;
        long s87 = s86 - (carry84 << 21);
        long s88 = s95 >> 21;
        long s106 = (s105 - (carry103 << 21)) + s88;
        long s96 = s95 - (s88 << 21);
        long carry104 = s106 >> 21;
        long s117 = (s114 - (carry113 << 21)) + carry104;
        long s107 = s106 - (carry104 << 21);
        s[0] = (byte) s04;
        s[1] = (byte) (s04 >> 8);
        s[2] = (byte) ((s04 >> 16) | (s116 << 5));
        s[3] = (byte) (s116 >> 3);
        s[4] = (byte) (s116 >> 11);
        s[5] = (byte) ((s116 >> 19) | (s27 << 2));
        s[6] = (byte) (s27 >> 6);
        s[7] = (byte) ((s27 >> 14) | (s35 << 7));
        s[8] = (byte) (s35 >> 1);
        s[9] = (byte) (s35 >> 9);
        s[10] = (byte) ((s35 >> 17) | (s45 << 4));
        s[11] = (byte) (s45 >> 4);
        s[12] = (byte) (s45 >> 12);
        s[13] = (byte) ((s45 >> 20) | (s55 << 1));
        s[14] = (byte) (s55 >> 7);
        s[15] = (byte) ((s55 >> 15) | (s65 << 6));
        s[16] = (byte) (s65 >> 2);
        s[17] = (byte) (s65 >> 10);
        s[18] = (byte) ((s65 >> 18) | (s76 << 3));
        s[19] = (byte) (s76 >> 5);
        s[20] = (byte) (s76 >> 13);
        s[21] = (byte) s87;
        s[22] = (byte) (s87 >> 8);
        s[23] = (byte) ((s87 >> 16) | (s96 << 5));
        s[24] = (byte) (s96 >> 3);
        s[25] = (byte) (s96 >> 11);
        s[26] = (byte) ((s96 >> 19) | (s107 << 2));
        s[27] = (byte) (s107 >> 6);
        s[28] = (byte) ((s107 >> 14) | (s117 << 7));
        s[29] = (byte) (s117 >> 1);
        s[30] = (byte) (s117 >> 9);
        s[31] = (byte) (s117 >> 17);
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r144v5 ?? I:long A[D('carry10' long)])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    private static void mulAdd(byte[] r194, byte[] r195, byte[] r196, byte[] r197) {
        /*
            Method dump skipped, instructions count: 2234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.Ed25519.mulAdd(byte[], byte[], byte[], byte[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] getHashedScalar(final byte[] privateKey) throws GeneralSecurityException {
        MessageDigest digest = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        digest.update(privateKey, 0, 32);
        byte[] h = digest.digest();
        h[0] = (byte) (h[0] & 248);
        h[31] = (byte) (h[31] & ByteCompanionObject.MAX_VALUE);
        h[31] = (byte) (h[31] | 64);
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] sign(final byte[] message, final byte[] publicKey, final byte[] hashedPrivateKey) throws GeneralSecurityException {
        byte[] messageCopy = Arrays.copyOfRange(message, 0, message.length);
        MessageDigest digest = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        digest.update(hashedPrivateKey, 32, 32);
        digest.update(messageCopy);
        byte[] r = digest.digest();
        reduce(r);
        byte[] rB = Arrays.copyOfRange(scalarMultWithBase(r).toBytes(), 0, 32);
        digest.reset();
        digest.update(rB);
        digest.update(publicKey);
        digest.update(messageCopy);
        byte[] hram = digest.digest();
        reduce(hram);
        byte[] s = new byte[32];
        mulAdd(s, hram, hashedPrivateKey, r);
        return Bytes.concat(rB, s);
    }

    private static boolean isSmallerThanGroupOrder(byte[] s) {
        for (int j = 31; j >= 0; j--) {
            int a = s[j] & UByte.MAX_VALUE;
            int b = GROUP_ORDER[j] & UByte.MAX_VALUE;
            if (a != b) {
                return a < b;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean verify(final byte[] message, final byte[] signature, final byte[] publicKey) throws GeneralSecurityException {
        if (signature.length != 64) {
            return false;
        }
        byte[] s = Arrays.copyOfRange(signature, 32, 64);
        if (isSmallerThanGroupOrder(s)) {
            MessageDigest digest = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
            digest.update(signature, 0, 32);
            digest.update(publicKey);
            digest.update(message);
            byte[] h = digest.digest();
            reduce(h);
            XYZT negPublicKey = XYZT.fromBytesNegateVarTime(publicKey);
            XYZ xyz = doubleScalarMultVarTime(h, negPublicKey, s);
            byte[] expectedR = xyz.toBytes();
            for (int i = 0; i < 32; i++) {
                if (expectedR[i] != signature[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private Ed25519() {
    }
}
