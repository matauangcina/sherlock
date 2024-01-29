package p054b.p059c.p060a.p075b.p089v;
/* renamed from: b.c.a.b.v.a */
/* loaded from: classes.dex */
public final class C1383a {
    /* renamed from: a */
    public static float m4272a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: b */
    public static float m4271b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m4269d(m4272a(f, f2, f3, f4), m4272a(f, f2, f5, f4), m4272a(f, f2, f5, f6), m4272a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m4270c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m4269d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
