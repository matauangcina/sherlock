package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import p000a.p015e.p016a.C0085e;
import p000a.p015e.p016a.C0090i;
import p000a.p015e.p016a.p017j.C0096e;
import p000a.p015e.p016a.p017j.C0101f;
/* renamed from: a.e.a.j.i */
/* loaded from: classes.dex */
public class C0106i extends C0101f {

    /* renamed from: k0 */
    protected float f487k0 = -1.0f;

    /* renamed from: l0 */
    protected int f488l0 = -1;

    /* renamed from: m0 */
    protected int f489m0 = -1;

    /* renamed from: n0 */
    private C0096e f490n0 = this.f441t;

    /* renamed from: o0 */
    private int f491o0 = 0;

    /* renamed from: p0 */
    private boolean f492p0 = false;

    /* renamed from: a.e.a.j.i$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0107a {

        /* renamed from: a */
        static final /* synthetic */ int[] f493a;

        static {
            int[] iArr = new int[C0096e.EnumC0100d.values().length];
            f493a = iArr;
            try {
                iArr[C0096e.EnumC0100d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f493a[C0096e.EnumC0100d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f493a[C0096e.EnumC0100d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f493a[C0096e.EnumC0100d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f493a[C0096e.EnumC0100d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f493a[C0096e.EnumC0100d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f493a[C0096e.EnumC0100d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f493a[C0096e.EnumC0100d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f493a[C0096e.EnumC0100d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0106i() {
        this.f388B.clear();
        this.f388B.add(this.f490n0);
        int length = this.f387A.length;
        for (int i = 0; i < length; i++) {
            this.f387A[i] = this.f490n0;
        }
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: G0 */
    public void mo9101G0(C0085e c0085e) {
        if (m9139u() == null) {
            return;
        }
        int m9250y = c0085e.m9250y(this.f490n0);
        if (this.f491o0 == 1) {
            m9198C0(m9250y);
            m9196D0(0);
            m9171b0(m9139u().m9145r());
            m9130y0(0);
            return;
        }
        m9198C0(0);
        m9196D0(m9250y);
        m9130y0(m9139u().m9197D());
        m9171b0(0);
    }

    /* renamed from: I0 */
    public int m9100I0() {
        return this.f491o0;
    }

    /* renamed from: J0 */
    public void m9099J0(int i) {
        if (i > -1) {
            this.f487k0 = -1.0f;
            this.f488l0 = i;
            this.f489m0 = -1;
        }
    }

    /* renamed from: K0 */
    public void m9098K0(int i) {
        if (i > -1) {
            this.f487k0 = -1.0f;
            this.f488l0 = -1;
            this.f489m0 = i;
        }
    }

    /* renamed from: L0 */
    public void m9097L0(float f) {
        if (f > -1.0f) {
            this.f487k0 = f;
            this.f488l0 = -1;
            this.f489m0 = -1;
        }
    }

    /* renamed from: M0 */
    public void m9096M0(int i) {
        if (this.f491o0 == i) {
            return;
        }
        this.f491o0 = i;
        this.f388B.clear();
        this.f490n0 = this.f491o0 == 1 ? this.f440s : this.f441t;
        this.f388B.add(this.f490n0);
        int length = this.f387A.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f387A[i2] = this.f490n0;
        }
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: b */
    public void mo9095b(C0085e c0085e) {
        C0104g c0104g = (C0104g) m9139u();
        if (c0104g == null) {
            return;
        }
        C0096e mo9092h = c0104g.mo9092h(C0096e.EnumC0100d.LEFT);
        C0096e mo9092h2 = c0104g.mo9092h(C0096e.EnumC0100d.RIGHT);
        C0101f c0101f = this.f390D;
        boolean z = true;
        boolean z2 = c0101f != null && c0101f.f389C[0] == C0101f.EnumC0103b.WRAP_CONTENT;
        if (this.f491o0 == 0) {
            mo9092h = c0104g.mo9092h(C0096e.EnumC0100d.TOP);
            mo9092h2 = c0104g.mo9092h(C0096e.EnumC0100d.BOTTOM);
            C0101f c0101f2 = this.f390D;
            z2 = (c0101f2 == null || c0101f2.f389C[1] != C0101f.EnumC0103b.WRAP_CONTENT) ? false : false;
        }
        if (this.f488l0 != -1) {
            C0090i m9257r = c0085e.m9257r(this.f490n0);
            c0085e.m9270e(m9257r, c0085e.m9257r(mo9092h), this.f488l0, 6);
            if (z2) {
                c0085e.m9266i(c0085e.m9257r(mo9092h2), m9257r, 0, 5);
            }
        } else if (this.f489m0 == -1) {
            if (this.f487k0 != -1.0f) {
                c0085e.m9271d(C0085e.m9255t(c0085e, c0085e.m9257r(this.f490n0), c0085e.m9257r(mo9092h), c0085e.m9257r(mo9092h2), this.f487k0, this.f492p0));
            }
        } else {
            C0090i m9257r2 = c0085e.m9257r(this.f490n0);
            C0090i m9257r3 = c0085e.m9257r(mo9092h2);
            c0085e.m9270e(m9257r2, m9257r3, -this.f489m0, 6);
            if (z2) {
                c0085e.m9266i(m9257r2, c0085e.m9257r(mo9092h), 0, 5);
                c0085e.m9266i(m9257r3, m9257r2, 0, 5);
            }
        }
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: c */
    public boolean mo9094c() {
        return true;
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: d */
    public void mo9093d(int i) {
        int i2;
        C0110l m9212f;
        C0096e c0096e;
        C0110l m9212f2;
        C0096e c0096e2;
        C0096e c0096e3;
        C0110l m9212f3;
        int i3;
        C0101f m9139u = m9139u();
        if (m9139u == null) {
            return;
        }
        if (m9100I0() == 1) {
            this.f441t.m9212f().m9082h(1, m9139u.f441t.m9212f(), 0);
            this.f443v.m9212f().m9082h(1, m9139u.f441t.m9212f(), 0);
            if (this.f488l0 != -1) {
                this.f440s.m9212f().m9082h(1, m9139u.f440s.m9212f(), this.f488l0);
                m9212f2 = this.f442u.m9212f();
                c0096e3 = m9139u.f440s;
                m9212f3 = c0096e3.m9212f();
                i3 = this.f488l0;
            } else if (this.f489m0 == -1) {
                if (this.f487k0 == -1.0f || m9139u.m9143s() != C0101f.EnumC0103b.FIXED) {
                    return;
                }
                i2 = (int) (m9139u.f391E * this.f487k0);
                this.f440s.m9212f().m9082h(1, m9139u.f440s.m9212f(), i2);
                m9212f = this.f442u.m9212f();
                c0096e = m9139u.f440s;
                m9212f.m9082h(1, c0096e.m9212f(), i2);
                return;
            } else {
                this.f440s.m9212f().m9082h(1, m9139u.f442u.m9212f(), -this.f489m0);
                m9212f2 = this.f442u.m9212f();
                c0096e2 = m9139u.f442u;
                m9212f3 = c0096e2.m9212f();
                i3 = -this.f489m0;
            }
        } else {
            this.f440s.m9212f().m9082h(1, m9139u.f440s.m9212f(), 0);
            this.f442u.m9212f().m9082h(1, m9139u.f440s.m9212f(), 0);
            if (this.f488l0 != -1) {
                this.f441t.m9212f().m9082h(1, m9139u.f441t.m9212f(), this.f488l0);
                m9212f2 = this.f443v.m9212f();
                c0096e3 = m9139u.f441t;
                m9212f3 = c0096e3.m9212f();
                i3 = this.f488l0;
            } else if (this.f489m0 == -1) {
                if (this.f487k0 == -1.0f || m9139u.m9201B() != C0101f.EnumC0103b.FIXED) {
                    return;
                }
                i2 = (int) (m9139u.f392F * this.f487k0);
                this.f441t.m9212f().m9082h(1, m9139u.f441t.m9212f(), i2);
                m9212f = this.f443v.m9212f();
                c0096e = m9139u.f441t;
                m9212f.m9082h(1, c0096e.m9212f(), i2);
                return;
            } else {
                this.f441t.m9212f().m9082h(1, m9139u.f443v.m9212f(), -this.f489m0);
                m9212f2 = this.f443v.m9212f();
                c0096e2 = m9139u.f443v;
                m9212f3 = c0096e2.m9212f();
                i3 = -this.f489m0;
            }
        }
        m9212f2.m9082h(1, m9212f3, i3);
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: h */
    public C0096e mo9092h(C0096e.EnumC0100d enumC0100d) {
        switch (C0107a.f493a[enumC0100d.ordinal()]) {
            case 1:
            case 2:
                if (this.f491o0 == 1) {
                    return this.f490n0;
                }
                break;
            case 3:
            case 4:
                if (this.f491o0 == 0) {
                    return this.f490n0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC0100d.name());
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: i */
    public ArrayList<C0096e> mo9091i() {
        return this.f388B;
    }
}
