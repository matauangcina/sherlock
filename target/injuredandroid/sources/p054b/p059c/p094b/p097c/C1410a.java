package p054b.p059c.p094b.p097c;

import java.math.RoundingMode;
/* renamed from: b.c.b.c.a */
/* loaded from: classes.dex */
public final class C1410a {

    /* renamed from: b.c.b.c.a$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C1411a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4341a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f4341a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4341a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4341a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4341a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4341a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4341a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4341a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4341a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r1 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r5 > 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r5 < 0) goto L32;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m4216a(int r5, int r6, java.math.RoundingMode r7) {
        /*
            p054b.p059c.p094b.p095a.C1403d.m4226g(r7)
            if (r6 == 0) goto L5c
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            return r0
        Le:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = p054b.p059c.p094b.p097c.C1410a.C1411a.f4341a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L50;
                case 2: goto L57;
                case 3: goto L4d;
                case 4: goto L58;
                case 5: goto L4a;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L47
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L58
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3b
            r6 = 1
            goto L3c
        L3b:
            r6 = 0
        L3c:
            r7 = r0 & 1
            if (r7 == 0) goto L42
            r7 = 1
            goto L43
        L42:
            r7 = 0
        L43:
            r6 = r6 & r7
            if (r6 == 0) goto L57
            goto L58
        L47:
            if (r1 <= 0) goto L57
            goto L58
        L4a:
            if (r5 <= 0) goto L57
            goto L58
        L4d:
            if (r5 >= 0) goto L57
            goto L58
        L50:
            if (r1 != 0) goto L53
            goto L54
        L53:
            r2 = 0
        L54:
            p054b.p059c.p094b.p097c.C1412b.m4211b(r2)
        L57:
            r2 = 0
        L58:
            if (r2 == 0) goto L5b
            int r0 = r0 + r5
        L5b:
            return r0
        L5c:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p054b.p059c.p094b.p097c.C1410a.m4216a(int, int, java.math.RoundingMode):int");
    }

    /* renamed from: b */
    public static boolean m4215b(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    /* renamed from: c */
    static int m4214c(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d */
    public static int m4213d(int i, RoundingMode roundingMode) {
        C1412b.m4212a("x", i);
        switch (C1411a.f4341a[roundingMode.ordinal()]) {
            case 1:
                C1412b.m4211b(m4215b(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + m4214c((-1257966797) >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
