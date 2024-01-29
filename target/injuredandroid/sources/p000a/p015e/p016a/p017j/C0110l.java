package p000a.p015e.p016a.p017j;

import p000a.p015e.p016a.C0085e;
import p000a.p015e.p016a.C0090i;
import p000a.p015e.p016a.p017j.C0096e;
/* renamed from: a.e.a.j.l */
/* loaded from: classes.dex */
public class C0110l extends C0112n {

    /* renamed from: c */
    C0096e f497c;

    /* renamed from: d */
    C0110l f498d;

    /* renamed from: e */
    float f499e;

    /* renamed from: f */
    C0110l f500f;

    /* renamed from: g */
    float f501g;

    /* renamed from: i */
    private C0110l f503i;

    /* renamed from: h */
    int f502h = 0;

    /* renamed from: j */
    private C0111m f504j = null;

    /* renamed from: k */
    private int f505k = 1;

    /* renamed from: l */
    private C0111m f506l = null;

    /* renamed from: m */
    private int f507m = 1;

    public C0110l(C0096e c0096e) {
        this.f497c = c0096e;
    }

    @Override // p000a.p015e.p016a.p017j.C0112n
    /* renamed from: e */
    public void mo9066e() {
        super.mo9066e();
        this.f498d = null;
        this.f499e = 0.0f;
        this.f504j = null;
        this.f505k = 1;
        this.f506l = null;
        this.f507m = 1;
        this.f500f = null;
        this.f501g = 0.0f;
        this.f503i = null;
        this.f502h = 0;
    }

    @Override // p000a.p015e.p016a.p017j.C0112n
    /* renamed from: f */
    public void mo9065f() {
        C0110l c0110l;
        C0110l c0110l2;
        C0110l c0110l3;
        C0110l c0110l4;
        C0110l c0110l5;
        C0110l c0110l6;
        float f;
        C0110l c0110l7;
        C0096e c0096e;
        float m9197D;
        float f2;
        C0110l c0110l8;
        float f3;
        boolean z = true;
        if (this.f510b == 1 || this.f502h == 4) {
            return;
        }
        C0111m c0111m = this.f504j;
        if (c0111m != null) {
            if (c0111m.f510b != 1) {
                return;
            }
            this.f499e = this.f505k * c0111m.f508c;
        }
        C0111m c0111m2 = this.f506l;
        if (c0111m2 != null) {
            if (c0111m2.f510b != 1) {
                return;
            }
            float f4 = c0111m2.f508c;
        }
        if (this.f502h == 1 && ((c0110l8 = this.f498d) == null || c0110l8.f510b == 1)) {
            C0110l c0110l9 = this.f498d;
            if (c0110l9 == null) {
                this.f500f = this;
                f3 = this.f499e;
            } else {
                this.f500f = c0110l9.f500f;
                f3 = c0110l9.f501g + this.f499e;
            }
            this.f501g = f3;
            m9069b();
            return;
        }
        if (this.f502h == 2 && (c0110l4 = this.f498d) != null && c0110l4.f510b == 1 && (c0110l5 = this.f503i) != null && (c0110l6 = c0110l5.f498d) != null && c0110l6.f510b == 1) {
            if (C0085e.m9251x() != null) {
                C0085e.m9251x().f315v++;
            }
            this.f500f = this.f498d.f500f;
            C0110l c0110l10 = this.f503i;
            c0110l10.f500f = c0110l10.f498d.f500f;
            C0096e.EnumC0100d enumC0100d = this.f497c.f361c;
            int i = 0;
            if (enumC0100d != C0096e.EnumC0100d.RIGHT && enumC0100d != C0096e.EnumC0100d.BOTTOM) {
                z = false;
            }
            if (z) {
                f = this.f498d.f501g;
                c0110l7 = this.f503i.f498d;
            } else {
                f = this.f503i.f498d.f501g;
                c0110l7 = this.f498d;
            }
            float f5 = f - c0110l7.f501g;
            C0096e.EnumC0100d enumC0100d2 = this.f497c.f361c;
            if (enumC0100d2 == C0096e.EnumC0100d.LEFT || enumC0100d2 == C0096e.EnumC0100d.RIGHT) {
                m9197D = f5 - this.f497c.f360b.m9197D();
                f2 = this.f497c.f360b.f408V;
            } else {
                m9197D = f5 - c0096e.f360b.m9145r();
                f2 = this.f497c.f360b.f409W;
            }
            int m9214d = this.f497c.m9214d();
            int m9214d2 = this.f503i.f497c.m9214d();
            if (this.f497c.m9209i() == this.f503i.f497c.m9209i()) {
                f2 = 0.5f;
                m9214d2 = 0;
            } else {
                i = m9214d;
            }
            float f6 = i;
            float f7 = m9214d2;
            float f8 = (m9197D - f6) - f7;
            if (z) {
                C0110l c0110l11 = this.f503i;
                c0110l11.f501g = c0110l11.f498d.f501g + f7 + (f8 * f2);
                this.f501g = (this.f498d.f501g - f6) - (f8 * (1.0f - f2));
            } else {
                this.f501g = this.f498d.f501g + f6 + (f8 * f2);
                C0110l c0110l12 = this.f503i;
                c0110l12.f501g = (c0110l12.f498d.f501g - f7) - (f8 * (1.0f - f2));
            }
        } else if (this.f502h != 3 || (c0110l = this.f498d) == null || c0110l.f510b != 1 || (c0110l2 = this.f503i) == null || (c0110l3 = c0110l2.f498d) == null || c0110l3.f510b != 1) {
            if (this.f502h == 5) {
                this.f497c.f360b.mo9179U();
                return;
            }
            return;
        } else {
            if (C0085e.m9251x() != null) {
                C0085e.m9251x().f316w++;
            }
            C0110l c0110l13 = this.f498d;
            this.f500f = c0110l13.f500f;
            C0110l c0110l14 = this.f503i;
            C0110l c0110l15 = c0110l14.f498d;
            c0110l14.f500f = c0110l15.f500f;
            this.f501g = c0110l13.f501g + this.f499e;
            c0110l14.f501g = c0110l15.f501g + c0110l14.f499e;
        }
        m9069b();
        this.f503i.m9069b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m9083g(C0085e c0085e) {
        C0090i m9211g = this.f497c.m9211g();
        C0110l c0110l = this.f500f;
        if (c0110l == null) {
            c0085e.m9269f(m9211g, (int) (this.f501g + 0.5f));
        } else {
            c0085e.m9270e(m9211g, c0085e.m9257r(c0110l.f497c), (int) (this.f501g + 0.5f), 6);
        }
    }

    /* renamed from: h */
    public void m9082h(int i, C0110l c0110l, int i2) {
        this.f502h = i;
        this.f498d = c0110l;
        this.f499e = i2;
        c0110l.m9070a(this);
    }

    /* renamed from: i */
    public void m9081i(C0110l c0110l, int i) {
        this.f498d = c0110l;
        this.f499e = i;
        c0110l.m9070a(this);
    }

    /* renamed from: j */
    public void m9080j(C0110l c0110l, int i, C0111m c0111m) {
        this.f498d = c0110l;
        c0110l.m9070a(this);
        this.f504j = c0111m;
        this.f505k = i;
        c0111m.m9070a(this);
    }

    /* renamed from: k */
    public float m9079k() {
        return this.f501g;
    }

    /* renamed from: l */
    public void m9078l(C0110l c0110l, float f) {
        if (this.f510b == 0 || !(this.f500f == c0110l || this.f501g == f)) {
            this.f500f = c0110l;
            this.f501g = f;
            if (this.f510b == 1) {
                m9068c();
            }
            m9069b();
        }
    }

    /* renamed from: m */
    String m9077m(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: n */
    public void m9076n(C0110l c0110l, float f) {
        this.f503i = c0110l;
    }

    /* renamed from: o */
    public void m9075o(C0110l c0110l, int i, C0111m c0111m) {
        this.f503i = c0110l;
        this.f506l = c0111m;
        this.f507m = i;
    }

    /* renamed from: p */
    public void m9074p(int i) {
        this.f502h = i;
    }

    /* renamed from: q */
    public void m9073q() {
        C0096e m9209i = this.f497c.m9209i();
        if (m9209i == null) {
            return;
        }
        if (m9209i.m9209i() == this.f497c) {
            this.f502h = 4;
            m9209i.m9212f().f502h = 4;
        }
        int m9214d = this.f497c.m9214d();
        C0096e.EnumC0100d enumC0100d = this.f497c.f361c;
        if (enumC0100d == C0096e.EnumC0100d.RIGHT || enumC0100d == C0096e.EnumC0100d.BOTTOM) {
            m9214d = -m9214d;
        }
        m9081i(m9209i.m9212f(), m9214d);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f510b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f497c);
            str = " UNRESOLVED} type: ";
        } else if (this.f500f == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f497c);
            sb.append(", RESOLVED: ");
            sb.append(this.f501g);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f497c);
            sb.append(", RESOLVED: ");
            sb.append(this.f500f);
            sb.append(":");
            sb.append(this.f501g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(m9077m(this.f502h));
        return sb.toString();
    }
}
