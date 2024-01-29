package androidx.appcompat.app;
/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
class C0485j {

    /* renamed from: d */
    private static C0485j f1417d;

    /* renamed from: a */
    public long f1418a;

    /* renamed from: b */
    public long f1419b;

    /* renamed from: c */
    public int f1420c;

    C0485j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0485j m7944b() {
        if (f1417d == null) {
            f1417d = new C0485j();
        }
        return f1417d;
    }

    /* renamed from: a */
    public void m7945a(long j, double d, double d2) {
        float f;
        float f2;
        double d3;
        double d4 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d4) * 0.03341960161924362d) + d4 + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((f - 9.0E-4f) - d3)) + 9.0E-4f + ((-d2) / 360.0d) + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f1420c = 1;
        } else if (sin2 > -1.0d) {
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f1418a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f1419b = round2;
            if (round2 >= j || this.f1418a <= j) {
                this.f1420c = 1;
                return;
            } else {
                this.f1420c = 0;
                return;
            }
        } else {
            this.f1420c = 0;
        }
        this.f1418a = -1L;
        this.f1419b = -1L;
    }
}
