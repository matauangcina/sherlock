package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p015e.p016a.p017j.C0101f;
/* renamed from: a.e.a.j.a */
/* loaded from: classes.dex */
public class C0092a {
    /* renamed from: a */
    public static void m9236a(C0104g c0104g) {
        if ((c0104g.m9123R0() & 32) != 32) {
            m9227j(c0104g);
            return;
        }
        c0104g.f458D0 = true;
        c0104g.f473x0 = false;
        c0104g.f474y0 = false;
        c0104g.f475z0 = false;
        ArrayList<C0101f> arrayList = c0104g.f521k0;
        List<C0105h> list = c0104g.f472w0;
        boolean z = c0104g.m9143s() == C0101f.EnumC0103b.WRAP_CONTENT;
        boolean z2 = c0104g.m9201B() == C0101f.EnumC0103b.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C0101f c0101f : arrayList) {
            c0101f.f437p = null;
            c0101f.f420d0 = false;
            c0101f.mo9180S();
        }
        for (C0101f c0101f2 : arrayList) {
            if (c0101f2.f437p == null && !m9235b(c0101f2, list, z3)) {
                m9227j(c0104g);
                c0104g.f458D0 = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0105h c0105h : list) {
            i = Math.max(i, m9234c(c0105h, 0));
            i2 = Math.max(i2, m9234c(c0105h, 1));
        }
        if (z) {
            c0104g.m9163g0(C0101f.EnumC0103b.FIXED);
            c0104g.m9130y0(i);
            c0104g.f473x0 = true;
            c0104g.f474y0 = true;
            c0104g.f455A0 = i;
        }
        if (z2) {
            c0104g.m9138u0(C0101f.EnumC0103b.FIXED);
            c0104g.m9171b0(i2);
            c0104g.f473x0 = true;
            c0104g.f475z0 = true;
            c0104g.f456B0 = i2;
        }
        m9228i(list, 0, c0104g.m9197D());
        m9228i(list, 1, c0104g.m9145r());
    }

    /* renamed from: b */
    private static boolean m9235b(C0101f c0101f, List<C0105h> list, boolean z) {
        C0105h c0105h = new C0105h(new ArrayList(), true);
        list.add(c0105h);
        return m9226k(c0101f, c0105h, list, z);
    }

    /* renamed from: c */
    private static int m9234c(C0105h c0105h, int i) {
        int i2 = i * 2;
        List<C0101f> m9107b = c0105h.m9107b(i);
        int size = m9107b.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0101f c0101f = m9107b.get(i4);
            C0096e[] c0096eArr = c0101f.f387A;
            int i5 = i2 + 1;
            i3 = Math.max(i3, m9233d(c0101f, i, c0096eArr[i5].f362d == null || !(c0096eArr[i2].f362d == null || c0096eArr[i5].f362d == null), 0));
        }
        c0105h.f480e[i] = i3;
        return i3;
    }

    /* renamed from: d */
    private static int m9233d(C0101f c0101f, int i, boolean z, int i2) {
        int m9145r;
        int m9160j;
        int i3;
        int i4;
        int i5;
        int m9197D;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (c0101f.f416b0) {
            boolean z2 = c0101f.f444w.f362d != null && i == 1;
            if (z) {
                m9145r = c0101f.m9160j();
                m9160j = c0101f.m9145r() - c0101f.m9160j();
                i4 = i * 2;
                i3 = i4 + 1;
            } else {
                m9145r = c0101f.m9145r() - c0101f.m9160j();
                m9160j = c0101f.m9160j();
                i3 = i * 2;
                i4 = i3 + 1;
            }
            C0096e[] c0096eArr = c0101f.f387A;
            if (c0096eArr[i3].f362d == null || c0096eArr[i4].f362d != null) {
                i5 = 1;
            } else {
                i5 = -1;
                int i10 = i3;
                i3 = i4;
                i4 = i10;
            }
            int i11 = z2 ? i2 - m9145r : i2;
            int m9214d = (c0101f.f387A[i4].m9214d() * i5) + m9232e(c0101f, i);
            int i12 = i11 + m9214d;
            int m9197D2 = (i == 0 ? c0101f.m9197D() : c0101f.m9145r()) * i5;
            Iterator<C0112n> it = c0101f.f387A[i4].m9212f().f509a.iterator();
            while (it.hasNext()) {
                i9 = Math.max(i9, m9233d(((C0110l) it.next()).f497c.f360b, i, z, i12));
            }
            int i13 = 0;
            for (Iterator<C0112n> it2 = c0101f.f387A[i3].m9212f().f509a.iterator(); it2.hasNext(); it2 = it2) {
                i13 = Math.max(i13, m9233d(((C0110l) it2.next()).f497c.f360b, i, z, m9197D2 + i12));
            }
            if (z2) {
                i9 -= m9145r;
                m9197D = i13 + m9160j;
            } else {
                m9197D = i13 + ((i == 0 ? c0101f.m9197D() : c0101f.m9145r()) * i5);
            }
            int i14 = 1;
            if (i == 1) {
                Iterator<C0112n> it3 = c0101f.f444w.m9212f().f509a.iterator();
                int i15 = 0;
                while (it3.hasNext()) {
                    Iterator<C0112n> it4 = it3;
                    C0110l c0110l = (C0110l) it3.next();
                    if (i5 == i14) {
                        i15 = Math.max(i15, m9233d(c0110l.f497c.f360b, i, z, m9145r + i12));
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i15 = Math.max(i15, m9233d(c0110l.f497c.f360b, i, z, (m9160j * i5) + i12));
                    }
                    it3 = it4;
                    i3 = i8;
                    i14 = 1;
                }
                i6 = i3;
                int i16 = i15;
                i7 = (c0101f.f444w.m9212f().f509a.size() <= 0 || z2) ? i16 : i5 == 1 ? i16 + m9145r : i16 - m9160j;
            } else {
                i6 = i3;
                i7 = 0;
            }
            int max = m9214d + Math.max(i9, Math.max(m9197D, i7));
            int i17 = m9197D2 + i12;
            if (i5 == -1) {
                i17 = i12;
                i12 = i17;
            }
            if (z) {
                C0109k.m9084e(c0101f, i, i12);
                c0101f.m9174Z(i12, i17, i);
            } else {
                c0101f.f437p.m9108a(c0101f, i);
                c0101f.m9146q0(i12, i);
            }
            if (c0101f.m9151o(i) == C0101f.EnumC0103b.MATCH_CONSTRAINT && c0101f.f393G != 0.0f) {
                c0101f.f437p.m9108a(c0101f, i);
            }
            C0096e[] c0096eArr2 = c0101f.f387A;
            if (c0096eArr2[i4].f362d != null && c0096eArr2[i6].f362d != null) {
                C0101f m9139u = c0101f.m9139u();
                C0096e[] c0096eArr3 = c0101f.f387A;
                if (c0096eArr3[i4].f362d.f360b == m9139u && c0096eArr3[i6].f362d.f360b == m9139u) {
                    c0101f.f437p.m9108a(c0101f, i);
                }
            }
            return max;
        }
        return 0;
    }

    /* renamed from: e */
    private static int m9232e(C0101f c0101f, int i) {
        C0096e c0096e;
        int i2 = i * 2;
        C0096e[] c0096eArr = c0101f.f387A;
        C0096e c0096e2 = c0096eArr[i2];
        C0096e c0096e3 = c0096eArr[i2 + 1];
        C0096e c0096e4 = c0096e2.f362d;
        if (c0096e4 != null) {
            C0101f c0101f2 = c0096e4.f360b;
            C0101f c0101f3 = c0101f.f390D;
            if (c0101f2 == c0101f3 && (c0096e = c0096e3.f362d) != null && c0096e.f360b == c0101f3) {
                return (int) ((((c0101f3.m9141t(i) - c0096e2.m9214d()) - c0096e3.m9214d()) - c0101f.m9141t(i)) * (i == 0 ? c0101f.f408V : c0101f.f409W));
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: f */
    private static void m9231f(C0104g c0104g, C0101f c0101f, C0105h c0105h) {
        c0105h.f479d = false;
        c0104g.f458D0 = false;
        c0101f.f416b0 = false;
    }

    /* renamed from: g */
    private static int m9230g(C0101f c0101f) {
        if (c0101f.m9143s() == C0101f.EnumC0103b.MATCH_CONSTRAINT) {
            int m9145r = (int) (c0101f.f394H == 0 ? c0101f.m9145r() * c0101f.f393G : c0101f.m9145r() / c0101f.f393G);
            c0101f.m9130y0(m9145r);
            return m9145r;
        } else if (c0101f.m9201B() == C0101f.EnumC0103b.MATCH_CONSTRAINT) {
            int m9197D = (int) (c0101f.f394H == 1 ? c0101f.m9197D() * c0101f.f393G : c0101f.m9197D() / c0101f.f393G);
            c0101f.m9171b0(m9197D);
            return m9197D;
        } else {
            return -1;
        }
    }

    /* renamed from: h */
    private static void m9229h(C0096e c0096e) {
        C0110l m9212f = c0096e.m9212f();
        C0096e c0096e2 = c0096e.f362d;
        if (c0096e2 == null || c0096e2.f362d == c0096e) {
            return;
        }
        c0096e2.m9212f().m9070a(m9212f);
    }

    /* renamed from: i */
    public static void m9228i(List<C0105h> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0101f c0101f : list.get(i3).m9106c(i)) {
                if (c0101f.f416b0) {
                    m9225l(c0101f, i, i2);
                }
            }
        }
    }

    /* renamed from: j */
    private static void m9227j(C0104g c0104g) {
        c0104g.f472w0.clear();
        c0104g.f472w0.add(0, new C0105h(c0104g.f521k0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0181, code lost:
        if (r3.f360b == r4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0128, code lost:
        if (r3.f360b == r4) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c2  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m9226k(p000a.p015e.p016a.p017j.C0101f r8, p000a.p015e.p016a.p017j.C0105h r9, java.util.List<p000a.p015e.p016a.p017j.C0105h> r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.p017j.C0092a.m9226k(a.e.a.j.f, a.e.a.j.h, java.util.List, boolean):boolean");
    }

    /* renamed from: l */
    private static void m9225l(C0101f c0101f, int i, int i2) {
        int i3 = i * 2;
        C0096e[] c0096eArr = c0101f.f387A;
        C0096e c0096e = c0096eArr[i3];
        C0096e c0096e2 = c0096eArr[i3 + 1];
        if ((c0096e.f362d == null || c0096e2.f362d == null) ? false : true) {
            C0109k.m9084e(c0101f, i, m9232e(c0101f, i) + c0096e.m9214d());
        } else if (c0101f.f393G == 0.0f || c0101f.m9151o(i) != C0101f.EnumC0103b.MATCH_CONSTRAINT) {
            int m9137v = i2 - c0101f.m9137v(i);
            int m9141t = m9137v - c0101f.m9141t(i);
            c0101f.m9174Z(m9141t, m9137v, i);
            C0109k.m9084e(c0101f, i, m9141t);
        } else {
            int m9230g = m9230g(c0101f);
            int i4 = (int) c0101f.f387A[i3].m9212f().f501g;
            c0096e2.m9212f().f500f = c0096e.m9212f();
            c0096e2.m9212f().f501g = m9230g;
            c0096e2.m9212f().f510b = 1;
            c0101f.m9174Z(i4, i4 + m9230g, i);
        }
    }
}
