package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import p000a.p015e.p016a.C0085e;
import p000a.p015e.p016a.C0090i;
import p000a.p015e.p016a.p017j.C0101f;
/* renamed from: a.e.a.j.b */
/* loaded from: classes.dex */
public class C0093b extends C0108j {

    /* renamed from: m0 */
    private int f339m0 = 0;

    /* renamed from: n0 */
    private ArrayList<C0110l> f340n0 = new ArrayList<>(4);

    /* renamed from: o0 */
    private boolean f341o0 = true;

    /* renamed from: K0 */
    public void m9224K0(boolean z) {
        this.f341o0 = z;
    }

    /* renamed from: L0 */
    public void m9223L0(int i) {
        this.f339m0 = i;
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: S */
    public void mo9180S() {
        super.mo9180S();
        this.f340n0.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9179U() {
        /*
            r11 = this;
            int r0 = r11.f339m0
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L20
            if (r0 == r4) goto L18
            if (r0 == r3) goto L15
            if (r0 == r2) goto L12
            return
        L12:
            a.e.a.j.e r0 = r11.f443v
            goto L1a
        L15:
            a.e.a.j.e r0 = r11.f441t
            goto L22
        L18:
            a.e.a.j.e r0 = r11.f442u
        L1a:
            a.e.a.j.l r0 = r0.m9212f()
            r1 = 0
            goto L26
        L20:
            a.e.a.j.e r0 = r11.f440s
        L22:
            a.e.a.j.l r0 = r0.m9212f()
        L26:
            java.util.ArrayList<a.e.a.j.l> r5 = r11.f340n0
            int r5 = r5.size()
            r6 = 0
            r7 = 0
        L2e:
            if (r7 >= r5) goto L58
            java.util.ArrayList<a.e.a.j.l> r8 = r11.f340n0
            java.lang.Object r8 = r8.get(r7)
            a.e.a.j.l r8 = (p000a.p015e.p016a.p017j.C0110l) r8
            int r9 = r8.f510b
            if (r9 == r4) goto L3d
            return
        L3d:
            int r9 = r11.f339m0
            if (r9 == 0) goto L4b
            if (r9 != r3) goto L44
            goto L4b
        L44:
            float r9 = r8.f501g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L55
            goto L51
        L4b:
            float r9 = r8.f501g
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L55
        L51:
            a.e.a.j.l r1 = r8.f500f
            r6 = r1
            r1 = r9
        L55:
            int r7 = r7 + 1
            goto L2e
        L58:
            a.e.a.f r5 = p000a.p015e.p016a.C0085e.m9251x()
            if (r5 == 0) goto L69
            a.e.a.f r5 = p000a.p015e.p016a.C0085e.m9251x()
            long r7 = r5.f318y
            r9 = 1
            long r7 = r7 + r9
            r5.f318y = r7
        L69:
            r0.f500f = r6
            r0.f501g = r1
            r0.m9069b()
            int r0 = r11.f339m0
            if (r0 == 0) goto L84
            if (r0 == r4) goto L81
            if (r0 == r3) goto L7e
            if (r0 == r2) goto L7b
            return
        L7b:
            a.e.a.j.e r0 = r11.f441t
            goto L86
        L7e:
            a.e.a.j.e r0 = r11.f443v
            goto L86
        L81:
            a.e.a.j.e r0 = r11.f440s
            goto L86
        L84:
            a.e.a.j.e r0 = r11.f442u
        L86:
            a.e.a.j.l r0 = r0.m9212f()
            r0.m9078l(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.p017j.C0093b.mo9179U():void");
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: b */
    public void mo9095b(C0085e c0085e) {
        Object[] objArr;
        boolean z;
        C0090i c0090i;
        C0096e c0096e;
        int i;
        int i2;
        C0096e[] c0096eArr = this.f387A;
        c0096eArr[0] = this.f440s;
        c0096eArr[2] = this.f441t;
        c0096eArr[1] = this.f442u;
        c0096eArr[3] = this.f443v;
        int i3 = 0;
        while (true) {
            objArr = this.f387A;
            if (i3 >= objArr.length) {
                break;
            }
            objArr[i3].f367i = c0085e.m9257r(objArr[i3]);
            i3++;
        }
        int i4 = this.f339m0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0096e c0096e2 = objArr[i4];
        for (int i5 = 0; i5 < this.f495l0; i5++) {
            C0101f c0101f = this.f494k0[i5];
            if ((this.f341o0 || c0101f.mo9094c()) && ((((i = this.f339m0) == 0 || i == 1) && c0101f.m9143s() == C0101f.EnumC0103b.MATCH_CONSTRAINT) || (((i2 = this.f339m0) == 2 || i2 == 3) && c0101f.m9201B() == C0101f.EnumC0103b.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
        }
        z = false;
        int i6 = this.f339m0;
        if (i6 == 0 || i6 == 1 ? m9139u().m9143s() == C0101f.EnumC0103b.WRAP_CONTENT : m9139u().m9201B() == C0101f.EnumC0103b.WRAP_CONTENT) {
            z = false;
        }
        for (int i7 = 0; i7 < this.f495l0; i7++) {
            C0101f c0101f2 = this.f494k0[i7];
            if (this.f341o0 || c0101f2.mo9094c()) {
                C0090i m9257r = c0085e.m9257r(c0101f2.f387A[this.f339m0]);
                C0096e[] c0096eArr2 = c0101f2.f387A;
                int i8 = this.f339m0;
                c0096eArr2[i8].f367i = m9257r;
                if (i8 == 0 || i8 == 2) {
                    c0085e.m9265j(c0096e2.f367i, m9257r, z);
                } else {
                    c0085e.m9267h(c0096e2.f367i, m9257r, z);
                }
            }
        }
        int i9 = this.f339m0;
        if (i9 == 0) {
            c0085e.m9270e(this.f442u.f367i, this.f440s.f367i, 0, 6);
            if (z) {
                return;
            }
            c0090i = this.f440s.f367i;
            c0096e = this.f390D.f442u;
        } else if (i9 == 1) {
            c0085e.m9270e(this.f440s.f367i, this.f442u.f367i, 0, 6);
            if (z) {
                return;
            }
            c0090i = this.f440s.f367i;
            c0096e = this.f390D.f440s;
        } else if (i9 == 2) {
            c0085e.m9270e(this.f443v.f367i, this.f441t.f367i, 0, 6);
            if (z) {
                return;
            }
            c0090i = this.f441t.f367i;
            c0096e = this.f390D.f443v;
        } else if (i9 != 3) {
            return;
        } else {
            c0085e.m9270e(this.f441t.f367i, this.f443v.f367i, 0, 6);
            if (z) {
                return;
            }
            c0090i = this.f441t.f367i;
            c0096e = this.f390D.f441t;
        }
        c0085e.m9270e(c0090i, c0096e.f367i, 0, 5);
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: c */
    public boolean mo9094c() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094 A[SYNTHETIC] */
    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9093d(int r8) {
        /*
            r7 = this;
            a.e.a.j.f r8 = r7.f390D
            if (r8 != 0) goto L5
            return
        L5:
            a.e.a.j.g r8 = (p000a.p015e.p016a.p017j.C0104g) r8
            r0 = 2
            boolean r8 = r8.m9117X0(r0)
            if (r8 != 0) goto Lf
            return
        Lf:
            int r8 = r7.f339m0
            r1 = 3
            r2 = 1
            if (r8 == 0) goto L25
            if (r8 == r2) goto L22
            if (r8 == r0) goto L1f
            if (r8 == r1) goto L1c
            return
        L1c:
            a.e.a.j.e r8 = r7.f443v
            goto L27
        L1f:
            a.e.a.j.e r8 = r7.f441t
            goto L27
        L22:
            a.e.a.j.e r8 = r7.f442u
            goto L27
        L25:
            a.e.a.j.e r8 = r7.f440s
        L27:
            a.e.a.j.l r8 = r8.m9212f()
            r3 = 5
            r8.m9074p(r3)
            int r3 = r7.f339m0
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L44
            if (r3 != r2) goto L38
            goto L44
        L38:
            a.e.a.j.e r3 = r7.f440s
            a.e.a.j.l r3 = r3.m9212f()
            r3.m9078l(r5, r4)
            a.e.a.j.e r3 = r7.f442u
            goto L4f
        L44:
            a.e.a.j.e r3 = r7.f441t
            a.e.a.j.l r3 = r3.m9212f()
            r3.m9078l(r5, r4)
            a.e.a.j.e r3 = r7.f443v
        L4f:
            a.e.a.j.l r3 = r3.m9212f()
            r3.m9078l(r5, r4)
            java.util.ArrayList<a.e.a.j.l> r3 = r7.f340n0
            r3.clear()
            r3 = 0
        L5c:
            int r4 = r7.f495l0
            if (r3 >= r4) goto L97
            a.e.a.j.f[] r4 = r7.f494k0
            r4 = r4[r3]
            boolean r6 = r7.f341o0
            if (r6 != 0) goto L6f
            boolean r6 = r4.mo9094c()
            if (r6 != 0) goto L6f
            goto L94
        L6f:
            int r6 = r7.f339m0
            if (r6 == 0) goto L84
            if (r6 == r2) goto L81
            if (r6 == r0) goto L7e
            if (r6 == r1) goto L7b
            r4 = r5
            goto L8a
        L7b:
            a.e.a.j.e r4 = r4.f443v
            goto L86
        L7e:
            a.e.a.j.e r4 = r4.f441t
            goto L86
        L81:
            a.e.a.j.e r4 = r4.f442u
            goto L86
        L84:
            a.e.a.j.e r4 = r4.f440s
        L86:
            a.e.a.j.l r4 = r4.m9212f()
        L8a:
            if (r4 == 0) goto L94
            java.util.ArrayList<a.e.a.j.l> r6 = r7.f340n0
            r6.add(r4)
            r4.m9070a(r8)
        L94:
            int r3 = r3 + 1
            goto L5c
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.p017j.C0093b.mo9093d(int):void");
    }
}
