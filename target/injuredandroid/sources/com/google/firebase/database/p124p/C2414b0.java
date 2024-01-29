package com.google.firebase.database.p124p;

import com.google.firebase.database.p124p.p127g0.InterfaceC2465i;
import com.google.firebase.database.p124p.p128h0.C2475a;
import com.google.firebase.database.p131r.AbstractC2586h;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.b0 */
/* loaded from: classes.dex */
public class C2414b0 {

    /* renamed from: d */
    private static final InterfaceC2465i<C2561y> f6346d = new C2416b();

    /* renamed from: a */
    private C2411b f6347a = C2411b.m1745s();

    /* renamed from: b */
    private List<C2561y> f6348b = new ArrayList();

    /* renamed from: c */
    private Long f6349c = -1L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.b0$a */
    /* loaded from: classes.dex */
    public class C2415a implements InterfaceC2465i<C2561y> {

        /* renamed from: b */
        final /* synthetic */ boolean f6350b;

        /* renamed from: c */
        final /* synthetic */ List f6351c;

        /* renamed from: d */
        final /* synthetic */ C2506l f6352d;

        C2415a(C2414b0 c2414b0, boolean z, List list, C2506l c2506l) {
            this.f6350b = z;
            this.f6351c = list;
            this.f6352d = c2506l;
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(C2561y c2561y) {
            return (c2561y.m1194f() || this.f6350b) && !this.f6351c.contains(Long.valueOf(c2561y.m1196d())) && (c2561y.m1197c().m1387s(this.f6352d) || this.f6352d.m1387s(c2561y.m1197c()));
        }
    }

    /* renamed from: com.google.firebase.database.p.b0$b */
    /* loaded from: classes.dex */
    class C2416b implements InterfaceC2465i<C2561y> {
        C2416b() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(C2561y c2561y) {
            return c2561y.m1194f();
        }
    }

    /* renamed from: j */
    private static C2411b m1728j(List<C2561y> list, InterfaceC2465i<C2561y> interfaceC2465i, C2506l c2506l) {
        C2506l m1382z;
        InterfaceC2594n m1198b;
        C2506l m1382z2;
        C2411b m1745s = C2411b.m1745s();
        for (C2561y c2561y : list) {
            if (interfaceC2465i.mo1540a(c2561y)) {
                C2506l m1197c = c2561y.m1197c();
                if (!c2561y.m1195e()) {
                    if (c2506l.m1387s(m1197c)) {
                        m1382z2 = C2506l.m1382z(c2506l, m1197c);
                    } else if (m1197c.m1387s(c2506l)) {
                        C2506l m1382z3 = C2506l.m1382z(m1197c, c2506l);
                        if (m1382z3.isEmpty()) {
                            m1382z2 = C2506l.m1385w();
                        } else {
                            m1198b = c2561y.m1199a().m1741y(m1382z3);
                            if (m1198b != null) {
                                m1382z = C2506l.m1385w();
                                m1745s = m1745s.m1752d(m1382z, m1198b);
                            }
                        }
                    }
                    m1745s = m1745s.m1750f(m1382z2, c2561y.m1199a());
                } else if (c2506l.m1387s(m1197c)) {
                    m1382z = C2506l.m1382z(c2506l, m1197c);
                    m1198b = c2561y.m1198b();
                    m1745s = m1745s.m1752d(m1382z, m1198b);
                } else if (m1197c.m1387s(c2506l)) {
                    m1745s = m1745s.m1752d(C2506l.m1385w(), c2561y.m1198b().mo1086h(C2506l.m1382z(m1197c, c2506l)));
                }
            }
        }
        return m1745s;
    }

    /* renamed from: k */
    private boolean m1727k(C2561y c2561y, C2506l c2506l) {
        if (c2561y.m1195e()) {
            return c2561y.m1197c().m1387s(c2506l);
        }
        Iterator<Map.Entry<C2506l, InterfaceC2594n>> it = c2561y.m1199a().iterator();
        while (it.hasNext()) {
            if (c2561y.m1197c().m1390i(it.next().getKey()).m1387s(c2506l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m1725m() {
        long j;
        this.f6347a = m1728j(this.f6348b, f6346d, C2506l.m1385w());
        if (this.f6348b.size() > 0) {
            List<C2561y> list = this.f6348b;
            j = list.get(list.size() - 1).m1196d();
        } else {
            j = -1;
        }
        this.f6349c = Long.valueOf(j);
    }

    /* renamed from: a */
    public void m1737a(C2506l c2506l, C2411b c2411b, Long l) {
        this.f6348b.add(new C2561y(l.longValue(), c2506l, c2411b));
        this.f6347a = this.f6347a.m1750f(c2506l, c2411b);
        this.f6349c = l;
    }

    /* renamed from: b */
    public void m1736b(C2506l c2506l, InterfaceC2594n interfaceC2594n, Long l, boolean z) {
        this.f6348b.add(new C2561y(l.longValue(), c2506l, interfaceC2594n, z));
        if (z) {
            this.f6347a = this.f6347a.m1752d(c2506l, interfaceC2594n);
        }
        this.f6349c = l;
    }

    /* renamed from: c */
    public InterfaceC2594n m1735c(C2506l c2506l, C2570b c2570b, C2475a c2475a) {
        C2506l m1389l = c2506l.m1389l(c2570b);
        InterfaceC2594n m1741y = this.f6347a.m1741y(m1389l);
        if (m1741y != null) {
            return m1741y;
        }
        if (c2475a.m1506c(c2570b)) {
            return this.f6347a.m1747l(m1389l).m1749g(c2475a.m1507b().mo1079b(c2570b));
        }
        return null;
    }

    /* renamed from: d */
    public InterfaceC2594n m1734d(C2506l c2506l, InterfaceC2594n interfaceC2594n, List<Long> list, boolean z) {
        if (list.isEmpty() && !z) {
            InterfaceC2594n m1741y = this.f6347a.m1741y(c2506l);
            if (m1741y != null) {
                return m1741y;
            }
            C2411b m1747l = this.f6347a.m1747l(c2506l);
            if (m1747l.isEmpty()) {
                return interfaceC2594n;
            }
            if (interfaceC2594n != null || m1747l.m1755A(C2506l.m1385w())) {
                if (interfaceC2594n == null) {
                    interfaceC2594n = C2585g.m1115s();
                }
                return m1747l.m1749g(interfaceC2594n);
            }
            return null;
        }
        C2411b m1747l2 = this.f6347a.m1747l(c2506l);
        if (z || !m1747l2.isEmpty()) {
            if (z || interfaceC2594n != null || m1747l2.m1755A(C2506l.m1385w())) {
                C2411b m1728j = m1728j(this.f6348b, new C2415a(this, z, list, c2506l), c2506l);
                if (interfaceC2594n == null) {
                    interfaceC2594n = C2585g.m1115s();
                }
                return m1728j.m1749g(interfaceC2594n);
            }
            return null;
        }
        return interfaceC2594n;
    }

    /* renamed from: e */
    public InterfaceC2594n m1733e(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        InterfaceC2594n m1115s = C2585g.m1115s();
        InterfaceC2594n m1741y = this.f6347a.m1741y(c2506l);
        if (m1741y != null) {
            if (!m1741y.mo1085k()) {
                for (C2593m c2593m : m1741y) {
                    m1115s = m1115s.mo1083p(c2593m.m1089c(), c2593m.m1088d());
                }
            }
            return m1115s;
        }
        C2411b m1747l = this.f6347a.m1747l(c2506l);
        for (C2593m c2593m2 : interfaceC2594n) {
            m1115s = m1115s.mo1083p(c2593m2.m1089c(), m1747l.m1747l(new C2506l(c2593m2.m1089c())).m1749g(c2593m2.m1088d()));
        }
        for (C2593m c2593m3 : m1747l.m1742x()) {
            m1115s = m1115s.mo1083p(c2593m3.m1089c(), c2593m3.m1088d());
        }
        return m1115s;
    }

    /* renamed from: f */
    public InterfaceC2594n m1732f(C2506l c2506l, C2506l c2506l2, InterfaceC2594n interfaceC2594n, InterfaceC2594n interfaceC2594n2) {
        C2506l m1390i = c2506l.m1390i(c2506l2);
        if (this.f6347a.m1755A(m1390i)) {
            return null;
        }
        C2411b m1747l = this.f6347a.m1747l(m1390i);
        return m1747l.isEmpty() ? interfaceC2594n2.mo1086h(c2506l2) : m1747l.m1749g(interfaceC2594n2.mo1086h(c2506l2));
    }

    /* renamed from: g */
    public C2593m m1731g(C2506l c2506l, InterfaceC2594n interfaceC2594n, C2593m c2593m, boolean z, AbstractC2586h abstractC2586h) {
        C2411b m1747l = this.f6347a.m1747l(c2506l);
        InterfaceC2594n m1741y = m1747l.m1741y(C2506l.m1385w());
        C2593m c2593m2 = null;
        if (m1741y == null) {
            if (interfaceC2594n != null) {
                m1741y = m1747l.m1749g(interfaceC2594n);
            }
            return c2593m2;
        }
        for (C2593m c2593m3 : m1741y) {
            if (abstractC2586h.m1113a(c2593m3, c2593m, z) > 0 && (c2593m2 == null || abstractC2586h.m1113a(c2593m3, c2593m2, z) < 0)) {
                c2593m2 = c2593m3;
            }
        }
        return c2593m2;
    }

    /* renamed from: h */
    public C2418c0 m1730h(C2506l c2506l) {
        return new C2418c0(c2506l, this);
    }

    /* renamed from: i */
    public C2561y m1729i(long j) {
        for (C2561y c2561y : this.f6348b) {
            if (c2561y.m1196d() == j) {
                return c2561y;
            }
        }
        return null;
    }

    /* renamed from: l */
    public boolean m1726l(long j) {
        C2561y c2561y;
        Iterator<C2561y> it = this.f6348b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                c2561y = null;
                break;
            }
            c2561y = it.next();
            if (c2561y.m1196d() == j) {
                break;
            }
            i++;
        }
        this.f6348b.remove(c2561y);
        boolean m1194f = c2561y.m1194f();
        boolean z = false;
        for (int size = this.f6348b.size() - 1; m1194f && size >= 0; size--) {
            C2561y c2561y2 = this.f6348b.get(size);
            if (c2561y2.m1194f()) {
                if (size >= i && m1727k(c2561y2, c2561y.m1197c())) {
                    m1194f = false;
                } else if (c2561y.m1197c().m1387s(c2561y2.m1197c())) {
                    z = true;
                }
            }
        }
        if (m1194f) {
            if (z) {
                m1725m();
                return true;
            }
            if (c2561y.m1195e()) {
                this.f6347a = this.f6347a.m1754B(c2561y.m1197c());
            } else {
                Iterator<Map.Entry<C2506l, InterfaceC2594n>> it2 = c2561y.m1199a().iterator();
                while (it2.hasNext()) {
                    this.f6347a = this.f6347a.m1754B(c2561y.m1197c().m1390i(it2.next().getKey()));
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public InterfaceC2594n m1724n(C2506l c2506l) {
        return this.f6347a.m1741y(c2506l);
    }
}
