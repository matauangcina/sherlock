package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000a.p015e.p016a.C0085e;
import p000a.p015e.p016a.p017j.C0096e;
import p000a.p015e.p016a.p017j.C0101f;
/* renamed from: a.e.a.j.g */
/* loaded from: classes.dex */
public class C0104g extends C0115p {

    /* renamed from: n0 */
    private C0113o f463n0;

    /* renamed from: o0 */
    int f464o0;

    /* renamed from: p0 */
    int f465p0;

    /* renamed from: q0 */
    int f466q0;

    /* renamed from: r0 */
    int f467r0;

    /* renamed from: l0 */
    private boolean f461l0 = false;

    /* renamed from: m0 */
    protected C0085e f462m0 = new C0085e();

    /* renamed from: s0 */
    int f468s0 = 0;

    /* renamed from: t0 */
    int f469t0 = 0;

    /* renamed from: u0 */
    C0095d[] f470u0 = new C0095d[4];

    /* renamed from: v0 */
    C0095d[] f471v0 = new C0095d[4];

    /* renamed from: w0 */
    public List<C0105h> f472w0 = new ArrayList();

    /* renamed from: x0 */
    public boolean f473x0 = false;

    /* renamed from: y0 */
    public boolean f474y0 = false;

    /* renamed from: z0 */
    public boolean f475z0 = false;

    /* renamed from: A0 */
    public int f455A0 = 0;

    /* renamed from: B0 */
    public int f456B0 = 0;

    /* renamed from: C0 */
    private int f457C0 = 7;

    /* renamed from: D0 */
    public boolean f458D0 = false;

    /* renamed from: E0 */
    private boolean f459E0 = false;

    /* renamed from: F0 */
    private boolean f460F0 = false;

    /* renamed from: P0 */
    private void m9125P0(C0101f c0101f) {
        int i = this.f468s0 + 1;
        C0095d[] c0095dArr = this.f471v0;
        if (i >= c0095dArr.length) {
            this.f471v0 = (C0095d[]) Arrays.copyOf(c0095dArr, c0095dArr.length * 2);
        }
        this.f471v0[this.f468s0] = new C0095d(c0101f, 0, m9120U0());
        this.f468s0++;
    }

    /* renamed from: Q0 */
    private void m9124Q0(C0101f c0101f) {
        int i = this.f469t0 + 1;
        C0095d[] c0095dArr = this.f470u0;
        if (i >= c0095dArr.length) {
            this.f470u0 = (C0095d[]) Arrays.copyOf(c0095dArr, c0095dArr.length * 2);
        }
        this.f470u0[this.f469t0] = new C0095d(c0101f, 1, m9120U0());
        this.f469t0++;
    }

    /* renamed from: b1 */
    private void m9113b1() {
        this.f468s0 = 0;
        this.f469t0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d6  */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // p000a.p015e.p016a.p017j.C0115p
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9057K0() {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.p017j.C0104g.mo9057K0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m9127N0(C0101f c0101f, int i) {
        if (i == 0) {
            m9125P0(c0101f);
        } else if (i == 1) {
            m9124Q0(c0101f);
        }
    }

    /* renamed from: O0 */
    public boolean m9126O0(C0085e c0085e) {
        mo9095b(c0085e);
        int size = this.f521k0.size();
        for (int i = 0; i < size; i++) {
            C0101f c0101f = this.f521k0.get(i);
            if (c0101f instanceof C0104g) {
                C0101f.EnumC0103b[] enumC0103bArr = c0101f.f389C;
                C0101f.EnumC0103b enumC0103b = enumC0103bArr[0];
                C0101f.EnumC0103b enumC0103b2 = enumC0103bArr[1];
                if (enumC0103b == C0101f.EnumC0103b.WRAP_CONTENT) {
                    c0101f.m9163g0(C0101f.EnumC0103b.FIXED);
                }
                if (enumC0103b2 == C0101f.EnumC0103b.WRAP_CONTENT) {
                    c0101f.m9138u0(C0101f.EnumC0103b.FIXED);
                }
                c0101f.mo9095b(c0085e);
                if (enumC0103b == C0101f.EnumC0103b.WRAP_CONTENT) {
                    c0101f.m9163g0(enumC0103b);
                }
                if (enumC0103b2 == C0101f.EnumC0103b.WRAP_CONTENT) {
                    c0101f.m9138u0(enumC0103b2);
                }
            } else {
                C0109k.m9086c(this, c0085e, c0101f);
                c0101f.mo9095b(c0085e);
            }
        }
        if (this.f468s0 > 0) {
            C0094c.m9222a(this, c0085e, 0);
        }
        if (this.f469t0 > 0) {
            C0094c.m9222a(this, c0085e, 1);
        }
        return true;
    }

    @Override // p000a.p015e.p016a.p017j.C0115p, p000a.p015e.p016a.p017j.C0101f
    /* renamed from: Q */
    public void mo9054Q() {
        this.f462m0.m9276E();
        this.f464o0 = 0;
        this.f466q0 = 0;
        this.f465p0 = 0;
        this.f467r0 = 0;
        this.f472w0.clear();
        this.f458D0 = false;
        super.mo9054Q();
    }

    /* renamed from: R0 */
    public int m9123R0() {
        return this.f457C0;
    }

    /* renamed from: S0 */
    public boolean m9122S0() {
        return false;
    }

    /* renamed from: T0 */
    public boolean m9121T0() {
        return this.f460F0;
    }

    /* renamed from: U0 */
    public boolean m9120U0() {
        return this.f461l0;
    }

    /* renamed from: V0 */
    public boolean m9119V0() {
        return this.f459E0;
    }

    /* renamed from: W0 */
    public void m9118W0() {
        if (!m9117X0(8)) {
            mo9093d(this.f457C0);
        }
        m9110e1();
    }

    /* renamed from: X0 */
    public boolean m9117X0(int i) {
        return (this.f457C0 & i) == i;
    }

    /* renamed from: Y0 */
    public void m9116Y0(int i, int i2) {
        C0111m c0111m;
        C0111m c0111m2;
        if (this.f389C[0] != C0101f.EnumC0103b.WRAP_CONTENT && (c0111m2 = this.f417c) != null) {
            c0111m2.m9071h(i);
        }
        if (this.f389C[1] == C0101f.EnumC0103b.WRAP_CONTENT || (c0111m = this.f419d) == null) {
            return;
        }
        c0111m.m9071h(i2);
    }

    /* renamed from: Z0 */
    public void m9115Z0() {
        int size = this.f521k0.size();
        mo9180S();
        for (int i = 0; i < size; i++) {
            this.f521k0.get(i).mo9180S();
        }
    }

    /* renamed from: a1 */
    public void m9114a1() {
        m9115Z0();
        mo9093d(this.f457C0);
    }

    /* renamed from: c1 */
    public void m9112c1(int i) {
        this.f457C0 = i;
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: d */
    public void mo9093d(int i) {
        super.mo9093d(i);
        int size = this.f521k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f521k0.get(i2).mo9093d(i);
        }
    }

    /* renamed from: d1 */
    public void m9111d1(boolean z) {
        this.f461l0 = z;
    }

    /* renamed from: e1 */
    public void m9110e1() {
        C0110l m9212f = mo9092h(C0096e.EnumC0100d.LEFT).m9212f();
        C0110l m9212f2 = mo9092h(C0096e.EnumC0100d.TOP).m9212f();
        m9212f.m9078l(null, 0.0f);
        m9212f2.m9078l(null, 0.0f);
    }

    /* renamed from: f1 */
    public void m9109f1(C0085e c0085e, boolean[] zArr) {
        zArr[2] = false;
        mo9101G0(c0085e);
        int size = this.f521k0.size();
        for (int i = 0; i < size; i++) {
            C0101f c0101f = this.f521k0.get(i);
            c0101f.mo9101G0(c0085e);
            if (c0101f.f389C[0] == C0101f.EnumC0103b.MATCH_CONSTRAINT && c0101f.m9197D() < c0101f.m9193F()) {
                zArr[2] = true;
            }
            if (c0101f.f389C[1] == C0101f.EnumC0103b.MATCH_CONSTRAINT && c0101f.m9145r() < c0101f.m9195E()) {
                zArr[2] = true;
            }
        }
    }
}
