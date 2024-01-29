package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p124p.C2411b;
import com.google.firebase.database.p124p.C2418c0;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p124p.p125e0.C2422a;
import com.google.firebase.database.p124p.p125e0.C2424c;
import com.google.firebase.database.p124p.p125e0.C2429f;
import com.google.firebase.database.p124p.p127g0.C2457d;
import com.google.firebase.database.p124p.p128h0.p129m.C2497a;
import com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d;
import com.google.firebase.database.p131r.AbstractC2586h;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2573c;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2588j;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.h0.l */
/* loaded from: classes.dex */
public class C2492l {

    /* renamed from: b */
    private static InterfaceC2500d.InterfaceC2501a f6508b = new C2493a();

    /* renamed from: a */
    private final InterfaceC2500d f6509a;

    /* renamed from: com.google.firebase.database.p.h0.l$a */
    /* loaded from: classes.dex */
    class C2493a implements InterfaceC2500d.InterfaceC2501a {
        C2493a() {
        }

        @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d.InterfaceC2501a
        /* renamed from: a */
        public C2593m mo1423a(AbstractC2586h abstractC2586h, C2593m c2593m, boolean z) {
            return null;
        }

        @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d.InterfaceC2501a
        /* renamed from: b */
        public InterfaceC2594n mo1422b(C2570b c2570b) {
            return null;
        }
    }

    /* renamed from: com.google.firebase.database.p.h0.l$b */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2494b {

        /* renamed from: a */
        static final /* synthetic */ int[] f6510a;

        static {
            int[] iArr = new int[AbstractC2425d.EnumC2426a.values().length];
            f6510a = iArr;
            try {
                iArr[AbstractC2425d.EnumC2426a.Overwrite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6510a[AbstractC2425d.EnumC2426a.Merge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6510a[AbstractC2425d.EnumC2426a.AckUserWrite.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6510a[AbstractC2425d.EnumC2426a.ListenComplete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.google.firebase.database.p.h0.l$c */
    /* loaded from: classes.dex */
    public static class C2495c {

        /* renamed from: a */
        public final C2491k f6511a;

        /* renamed from: b */
        public final List<C2477c> f6512b;

        public C2495c(C2491k c2491k, List<C2477c> list) {
            this.f6511a = c2491k;
            this.f6512b = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.p.h0.l$d */
    /* loaded from: classes.dex */
    public static class C2496d implements InterfaceC2500d.InterfaceC2501a {

        /* renamed from: a */
        private final C2418c0 f6513a;

        /* renamed from: b */
        private final C2491k f6514b;

        /* renamed from: c */
        private final InterfaceC2594n f6515c;

        public C2496d(C2418c0 c2418c0, C2491k c2491k, InterfaceC2594n interfaceC2594n) {
            this.f6513a = c2418c0;
            this.f6514b = c2491k;
            this.f6515c = interfaceC2594n;
        }

        @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d.InterfaceC2501a
        /* renamed from: a */
        public C2593m mo1423a(AbstractC2586h abstractC2586h, C2593m c2593m, boolean z) {
            InterfaceC2594n interfaceC2594n = this.f6515c;
            if (interfaceC2594n == null) {
                interfaceC2594n = this.f6514b.m1442b();
            }
            return this.f6513a.m1715g(interfaceC2594n, c2593m, z, abstractC2586h);
        }

        @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d.InterfaceC2501a
        /* renamed from: b */
        public InterfaceC2594n mo1422b(C2570b c2570b) {
            C2475a m1441c = this.f6514b.m1441c();
            if (m1441c.m1506c(c2570b)) {
                return m1441c.m1507b().mo1079b(c2570b);
            }
            InterfaceC2594n interfaceC2594n = this.f6515c;
            return this.f6513a.m1721a(c2570b, interfaceC2594n != null ? new C2475a(C2587i.m1107f(interfaceC2594n, C2588j.m1098j()), true, false) : this.f6514b.m1440d());
        }
    }

    public C2492l(InterfaceC2500d interfaceC2500d) {
        this.f6509a = interfaceC2500d;
    }

    /* renamed from: a */
    private C2491k m1437a(C2491k c2491k, C2506l c2506l, C2457d<Boolean> c2457d, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n, C2497a c2497a) {
        if (c2418c0.m1713i(c2506l) != null) {
            return c2491k;
        }
        boolean m1504e = c2491k.m1440d().m1504e();
        C2475a m1440d = c2491k.m1440d();
        if (c2457d.getValue() == null) {
            C2411b m1745s = C2411b.m1745s();
            Iterator<Map.Entry<C2506l, Boolean>> it = c2457d.iterator();
            C2411b c2411b = m1745s;
            while (it.hasNext()) {
                C2506l key = it.next().getKey();
                C2506l m1390i = c2506l.m1390i(key);
                if (m1440d.m1505d(m1390i)) {
                    c2411b = c2411b.m1752d(key, m1440d.m1507b().mo1086h(m1390i));
                }
            }
            return m1435c(c2491k, c2506l, c2411b, c2418c0, interfaceC2594n, m1504e, c2497a);
        } else if ((c2506l.isEmpty() && m1440d.m1503f()) || m1440d.m1505d(c2506l)) {
            return m1434d(c2491k, c2506l, m1440d.m1507b().mo1086h(c2506l), c2418c0, interfaceC2594n, m1504e, c2497a);
        } else {
            if (c2506l.isEmpty()) {
                C2411b m1745s2 = C2411b.m1745s();
                C2411b c2411b2 = m1745s2;
                for (C2593m c2593m : m1440d.m1507b()) {
                    c2411b2 = c2411b2.m1751e(c2593m.m1089c(), c2593m.m1088d());
                }
                return m1435c(c2491k, c2506l, c2411b2, c2418c0, interfaceC2594n, m1504e, c2497a);
            }
            return c2491k;
        }
    }

    /* renamed from: c */
    private C2491k m1435c(C2491k c2491k, C2506l c2506l, C2411b c2411b, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n, boolean z, C2497a c2497a) {
        if (!c2491k.m1440d().m1507b().isEmpty() || c2491k.m1440d().m1503f()) {
            C2411b m1750f = c2506l.isEmpty() ? c2411b : C2411b.m1745s().m1750f(c2506l, c2411b);
            InterfaceC2594n m1507b = c2491k.m1440d().m1507b();
            Map<C2570b, C2411b> m1746m = m1750f.m1746m();
            C2491k c2491k2 = c2491k;
            for (Map.Entry<C2570b, C2411b> entry : m1746m.entrySet()) {
                C2570b key = entry.getKey();
                if (m1507b.mo1076o(key)) {
                    c2491k2 = m1434d(c2491k2, new C2506l(key), entry.getValue().m1749g(m1507b.mo1079b(key)), c2418c0, interfaceC2594n, z, c2497a);
                }
            }
            C2491k c2491k3 = c2491k2;
            for (Map.Entry<C2570b, C2411b> entry2 : m1746m.entrySet()) {
                C2570b key2 = entry2.getKey();
                boolean z2 = !c2491k.m1440d().m1506c(key2) && entry2.getValue().m1753C() == null;
                if (!m1507b.mo1076o(key2) && !z2) {
                    c2491k3 = m1434d(c2491k3, new C2506l(key2), entry2.getValue().m1749g(m1507b.mo1079b(key2)), c2418c0, interfaceC2594n, z, c2497a);
                }
            }
            return c2491k3;
        }
        return c2491k;
    }

    /* renamed from: d */
    private C2491k m1434d(C2491k c2491k, C2506l c2506l, InterfaceC2594n interfaceC2594n, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n2, boolean z, C2497a c2497a) {
        C2587i mo1417e;
        C2587i m1102s;
        C2587i m1508a;
        C2475a m1440d = c2491k.m1440d();
        InterfaceC2500d interfaceC2500d = this.f6509a;
        if (!z) {
            interfaceC2500d = interfaceC2500d.mo1421a();
        }
        boolean z2 = true;
        if (c2506l.isEmpty()) {
            m1508a = m1440d.m1508a();
            m1102s = C2587i.m1107f(interfaceC2594n, interfaceC2500d.mo1418d());
        } else if (!interfaceC2500d.mo1419c() || m1440d.m1504e()) {
            C2570b m1384x = c2506l.m1384x();
            if (m1440d.m1505d(c2506l) || c2506l.size() <= 1) {
                C2506l m1396A = c2506l.m1396A();
                InterfaceC2594n mo1082q = m1440d.m1507b().mo1079b(m1384x).mo1082q(m1396A, interfaceC2594n);
                if (m1384x.m1158w()) {
                    mo1417e = interfaceC2500d.mo1420b(m1440d.m1508a(), mo1082q);
                } else {
                    mo1417e = interfaceC2500d.mo1417e(m1440d.m1508a(), m1384x, mo1082q, m1396A, f6508b, null);
                }
                if (!m1440d.m1503f() && !c2506l.isEmpty()) {
                    z2 = false;
                }
                C2491k m1438f = c2491k.m1438f(mo1417e, z2, interfaceC2500d.mo1419c());
                return m1430h(m1438f, c2506l, c2418c0, new C2496d(c2418c0, m1438f, interfaceC2594n2), c2497a);
            }
            return c2491k;
        } else {
            C2570b m1384x2 = c2506l.m1384x();
            m1102s = m1440d.m1508a().m1102s(m1384x2, m1440d.m1507b().mo1079b(m1384x2).mo1082q(c2506l.m1396A(), interfaceC2594n));
            m1508a = m1440d.m1508a();
        }
        mo1417e = interfaceC2500d.mo1416f(m1508a, m1102s, null);
        if (!m1440d.m1503f()) {
            z2 = false;
        }
        C2491k m1438f2 = c2491k.m1438f(mo1417e, z2, interfaceC2500d.mo1419c());
        return m1430h(m1438f2, c2506l, c2418c0, new C2496d(c2418c0, m1438f2, interfaceC2594n2), c2497a);
    }

    /* renamed from: e */
    private C2491k m1433e(C2491k c2491k, C2506l c2506l, C2411b c2411b, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n, C2497a c2497a) {
        Iterator<Map.Entry<C2506l, InterfaceC2594n>> it = c2411b.iterator();
        C2491k c2491k2 = c2491k;
        while (it.hasNext()) {
            Map.Entry<C2506l, InterfaceC2594n> next = it.next();
            C2506l m1390i = c2506l.m1390i(next.getKey());
            if (m1431g(c2491k, m1390i.m1384x())) {
                c2491k2 = m1432f(c2491k2, m1390i, next.getValue(), c2418c0, interfaceC2594n, c2497a);
            }
        }
        Iterator<Map.Entry<C2506l, InterfaceC2594n>> it2 = c2411b.iterator();
        C2491k c2491k3 = c2491k2;
        while (it2.hasNext()) {
            Map.Entry<C2506l, InterfaceC2594n> next2 = it2.next();
            C2506l m1390i2 = c2506l.m1390i(next2.getKey());
            if (!m1431g(c2491k, m1390i2.m1384x())) {
                c2491k3 = m1432f(c2491k3, m1390i2, next2.getValue(), c2418c0, interfaceC2594n, c2497a);
            }
        }
        return c2491k3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.firebase.database.p124p.p128h0.C2491k m1432f(com.google.firebase.database.p124p.p128h0.C2491k r9, com.google.firebase.database.p124p.C2506l r10, com.google.firebase.database.p131r.InterfaceC2594n r11, com.google.firebase.database.p124p.C2418c0 r12, com.google.firebase.database.p131r.InterfaceC2594n r13, com.google.firebase.database.p124p.p128h0.p129m.C2497a r14) {
        /*
            r8 = this;
            com.google.firebase.database.p.h0.a r0 = r9.m1441c()
            com.google.firebase.database.p.h0.l$d r6 = new com.google.firebase.database.p.h0.l$d
            r6.<init>(r12, r9, r13)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L34
            com.google.firebase.database.p.h0.m.d r10 = r8.f6509a
            com.google.firebase.database.r.h r10 = r10.mo1418d()
            com.google.firebase.database.r.i r10 = com.google.firebase.database.p131r.C2587i.m1107f(r11, r10)
            com.google.firebase.database.p.h0.m.d r11 = r8.f6509a
            com.google.firebase.database.p.h0.a r12 = r9.m1441c()
            com.google.firebase.database.r.i r12 = r12.m1508a()
            com.google.firebase.database.r.i r10 = r11.mo1416f(r12, r10, r14)
            r11 = 1
        L28:
            com.google.firebase.database.p.h0.m.d r12 = r8.f6509a
            boolean r12 = r12.mo1419c()
        L2e:
            com.google.firebase.database.p.h0.k r9 = r9.m1439e(r10, r11, r12)
            goto Laa
        L34:
            com.google.firebase.database.r.b r3 = r10.m1384x()
            boolean r12 = r3.m1158w()
            if (r12 == 0) goto L55
            com.google.firebase.database.p.h0.m.d r10 = r8.f6509a
            com.google.firebase.database.p.h0.a r12 = r9.m1441c()
            com.google.firebase.database.r.i r12 = r12.m1508a()
            com.google.firebase.database.r.i r10 = r10.mo1420b(r12, r11)
            boolean r11 = r0.m1503f()
            boolean r12 = r0.m1504e()
            goto L2e
        L55:
            com.google.firebase.database.p.l r5 = r10.m1396A()
            com.google.firebase.database.r.n r10 = r0.m1507b()
            com.google.firebase.database.r.n r10 = r10.mo1079b(r3)
            boolean r12 = r5.isEmpty()
            if (r12 == 0) goto L69
        L67:
            r4 = r11
            goto L93
        L69:
            com.google.firebase.database.r.n r12 = r6.mo1422b(r3)
            if (r12 == 0) goto L8e
            com.google.firebase.database.r.b r13 = r5.m1386u()
            boolean r13 = r13.m1158w()
            if (r13 == 0) goto L89
            com.google.firebase.database.p.l r13 = r5.m1383y()
            com.google.firebase.database.r.n r13 = r12.mo1086h(r13)
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L89
            r4 = r12
            goto L93
        L89:
            com.google.firebase.database.r.n r11 = r12.mo1082q(r5, r11)
            goto L67
        L8e:
            com.google.firebase.database.r.g r11 = com.google.firebase.database.p131r.C2585g.m1115s()
            goto L67
        L93:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto Laa
            com.google.firebase.database.p.h0.m.d r1 = r8.f6509a
            com.google.firebase.database.r.i r2 = r0.m1508a()
            r7 = r14
            com.google.firebase.database.r.i r10 = r1.mo1417e(r2, r3, r4, r5, r6, r7)
            boolean r11 = r0.m1503f()
            goto L28
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.p124p.p128h0.C2492l.m1432f(com.google.firebase.database.p.h0.k, com.google.firebase.database.p.l, com.google.firebase.database.r.n, com.google.firebase.database.p.c0, com.google.firebase.database.r.n, com.google.firebase.database.p.h0.m.a):com.google.firebase.database.p.h0.k");
    }

    /* renamed from: g */
    private static boolean m1431g(C2491k c2491k, C2570b c2570b) {
        return c2491k.m1441c().m1506c(c2570b);
    }

    /* renamed from: h */
    private C2491k m1430h(C2491k c2491k, C2506l c2506l, C2418c0 c2418c0, InterfaceC2500d.InterfaceC2501a interfaceC2501a, C2497a c2497a) {
        InterfaceC2594n m1721a;
        C2587i mo1417e;
        InterfaceC2594n m1720b;
        C2475a m1441c = c2491k.m1441c();
        if (c2418c0.m1713i(c2506l) != null) {
            return c2491k;
        }
        if (c2506l.isEmpty()) {
            if (c2491k.m1440d().m1504e()) {
                InterfaceC2594n m1442b = c2491k.m1442b();
                if (!(m1442b instanceof C2573c)) {
                    m1442b = C2585g.m1115s();
                }
                m1720b = c2418c0.m1717e(m1442b);
            } else {
                m1720b = c2418c0.m1720b(c2491k.m1442b());
            }
            mo1417e = this.f6509a.mo1416f(c2491k.m1441c().m1508a(), C2587i.m1107f(m1720b, this.f6509a.mo1418d()), c2497a);
        } else {
            C2570b m1384x = c2506l.m1384x();
            if (m1384x.m1158w()) {
                InterfaceC2594n m1716f = c2418c0.m1716f(c2506l, m1441c.m1507b(), c2491k.m1440d().m1507b());
                if (m1716f != null) {
                    mo1417e = this.f6509a.mo1420b(m1441c.m1508a(), m1716f);
                }
                mo1417e = m1441c.m1508a();
            } else {
                C2506l m1396A = c2506l.m1396A();
                if (m1441c.m1506c(m1384x)) {
                    InterfaceC2594n m1716f2 = c2418c0.m1716f(c2506l, m1441c.m1507b(), c2491k.m1440d().m1507b());
                    m1721a = m1716f2 != null ? m1441c.m1507b().mo1079b(m1384x).mo1082q(m1396A, m1716f2) : m1441c.m1507b().mo1079b(m1384x);
                } else {
                    m1721a = c2418c0.m1721a(m1384x, c2491k.m1440d());
                }
                InterfaceC2594n interfaceC2594n = m1721a;
                if (interfaceC2594n != null) {
                    mo1417e = this.f6509a.mo1417e(m1441c.m1508a(), m1384x, interfaceC2594n, m1396A, interfaceC2501a, c2497a);
                }
                mo1417e = m1441c.m1508a();
            }
        }
        return c2491k.m1439e(mo1417e, m1441c.m1503f() || c2506l.isEmpty(), this.f6509a.mo1419c());
    }

    /* renamed from: i */
    private C2491k m1429i(C2491k c2491k, C2506l c2506l, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n, C2497a c2497a) {
        C2475a m1440d = c2491k.m1440d();
        return m1430h(c2491k.m1438f(m1440d.m1508a(), m1440d.m1503f() || c2506l.isEmpty(), m1440d.m1504e()), c2506l, c2418c0, f6508b, c2497a);
    }

    /* renamed from: j */
    private void m1428j(C2491k c2491k, C2491k c2491k2, List<C2477c> list) {
        C2475a m1441c = c2491k2.m1441c();
        if (m1441c.m1503f()) {
            boolean z = m1441c.m1507b().mo1085k() || m1441c.m1507b().isEmpty();
            if (list.isEmpty() && c2491k.m1441c().m1503f() && ((!z || m1441c.m1507b().equals(c2491k.m1443a())) && m1441c.m1507b().mo1078c().equals(c2491k.m1443a().mo1078c()))) {
                return;
            }
            list.add(C2477c.m1489m(m1441c.m1508a()));
        }
    }

    /* renamed from: b */
    public C2495c m1436b(C2491k c2491k, AbstractC2425d abstractC2425d, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n) {
        C2491k m1434d;
        C2497a c2497a = new C2497a();
        int i = C2494b.f6510a[abstractC2425d.m1700c().ordinal()];
        if (i == 1) {
            C2429f c2429f = (C2429f) abstractC2425d;
            if (c2429f.m1701b().m1697c()) {
                m1434d = m1432f(c2491k, c2429f.m1702a(), c2429f.m1694e(), c2418c0, interfaceC2594n, c2497a);
            } else {
                m1434d = m1434d(c2491k, c2429f.m1702a(), c2429f.m1694e(), c2418c0, interfaceC2594n, c2429f.m1701b().m1696d() || (c2491k.m1440d().m1504e() && !c2429f.m1702a().isEmpty()), c2497a);
            }
        } else if (i == 2) {
            C2424c c2424c = (C2424c) abstractC2425d;
            if (c2424c.m1701b().m1697c()) {
                m1434d = m1433e(c2491k, c2424c.m1702a(), c2424c.m1703e(), c2418c0, interfaceC2594n, c2497a);
            } else {
                m1434d = m1435c(c2491k, c2424c.m1702a(), c2424c.m1703e(), c2418c0, interfaceC2594n, c2424c.m1701b().m1696d() || c2491k.m1440d().m1504e(), c2497a);
            }
        } else if (i == 3) {
            C2422a c2422a = (C2422a) abstractC2425d;
            boolean m1704f = c2422a.m1704f();
            C2506l m1702a = c2422a.m1702a();
            m1434d = !m1704f ? m1437a(c2491k, m1702a, c2422a.m1705e(), c2418c0, interfaceC2594n, c2497a) : m1427k(c2491k, m1702a, c2418c0, interfaceC2594n, c2497a);
        } else if (i != 4) {
            throw new AssertionError("Unknown operation: " + abstractC2425d.m1700c());
        } else {
            m1434d = m1429i(c2491k, abstractC2425d.m1702a(), c2418c0, interfaceC2594n, c2497a);
        }
        ArrayList arrayList = new ArrayList(c2497a.m1426a());
        m1428j(c2491k, m1434d, arrayList);
        return new C2495c(m1434d, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
        if (r10.mo1085k() == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.firebase.database.p124p.p128h0.C2491k m1427k(com.google.firebase.database.p124p.p128h0.C2491k r9, com.google.firebase.database.p124p.C2506l r10, com.google.firebase.database.p124p.C2418c0 r11, com.google.firebase.database.p131r.InterfaceC2594n r12, com.google.firebase.database.p124p.p128h0.p129m.C2497a r13) {
        /*
            r8 = this;
            com.google.firebase.database.r.n r0 = r11.m1713i(r10)
            if (r0 == 0) goto L7
            return r9
        L7:
            com.google.firebase.database.p.h0.l$d r6 = new com.google.firebase.database.p.h0.l$d
            r6.<init>(r11, r9, r12)
            com.google.firebase.database.p.h0.a r12 = r9.m1441c()
            com.google.firebase.database.r.i r2 = r12.m1508a()
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L8e
            com.google.firebase.database.r.b r12 = r10.m1384x()
            boolean r12 = r12.m1158w()
            if (r12 == 0) goto L25
            goto L8e
        L25:
            com.google.firebase.database.r.b r3 = r10.m1384x()
            com.google.firebase.database.p.h0.a r12 = r9.m1440d()
            com.google.firebase.database.r.n r12 = r11.m1721a(r3, r12)
            if (r12 != 0) goto L45
            com.google.firebase.database.p.h0.a r0 = r9.m1440d()
            boolean r0 = r0.m1506c(r3)
            if (r0 == 0) goto L45
            com.google.firebase.database.r.n r12 = r2.m1104l()
            com.google.firebase.database.r.n r12 = r12.mo1079b(r3)
        L45:
            r4 = r12
            if (r4 == 0) goto L54
            com.google.firebase.database.p.h0.m.d r1 = r8.f6509a
        L4a:
            com.google.firebase.database.p.l r5 = r10.m1396A()
            r7 = r13
            com.google.firebase.database.r.i r2 = r1.mo1417e(r2, r3, r4, r5, r6, r7)
            goto L6b
        L54:
            if (r4 != 0) goto L6b
            com.google.firebase.database.p.h0.a r12 = r9.m1441c()
            com.google.firebase.database.r.n r12 = r12.m1507b()
            boolean r12 = r12.mo1076o(r3)
            if (r12 == 0) goto L6b
            com.google.firebase.database.p.h0.m.d r1 = r8.f6509a
            com.google.firebase.database.r.g r4 = com.google.firebase.database.p131r.C2585g.m1115s()
            goto L4a
        L6b:
            com.google.firebase.database.r.n r10 = r2.m1104l()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto Lbd
            com.google.firebase.database.p.h0.a r10 = r9.m1440d()
            boolean r10 = r10.m1503f()
            if (r10 == 0) goto Lbd
            com.google.firebase.database.r.n r10 = r9.m1442b()
            com.google.firebase.database.r.n r10 = r11.m1720b(r10)
            boolean r12 = r10.mo1085k()
            if (r12 == 0) goto Lbd
            goto Lad
        L8e:
            com.google.firebase.database.p.h0.a r10 = r9.m1440d()
            boolean r10 = r10.m1503f()
            if (r10 == 0) goto La1
            com.google.firebase.database.r.n r10 = r9.m1442b()
            com.google.firebase.database.r.n r10 = r11.m1720b(r10)
            goto Lad
        La1:
            com.google.firebase.database.p.h0.a r10 = r9.m1440d()
            com.google.firebase.database.r.n r10 = r10.m1507b()
            com.google.firebase.database.r.n r10 = r11.m1717e(r10)
        Lad:
            com.google.firebase.database.p.h0.m.d r12 = r8.f6509a
            com.google.firebase.database.r.h r12 = r12.mo1418d()
            com.google.firebase.database.r.i r10 = com.google.firebase.database.p131r.C2587i.m1107f(r10, r12)
            com.google.firebase.database.p.h0.m.d r12 = r8.f6509a
            com.google.firebase.database.r.i r2 = r12.mo1416f(r2, r10, r13)
        Lbd:
            com.google.firebase.database.p.h0.a r10 = r9.m1440d()
            boolean r10 = r10.m1503f()
            if (r10 != 0) goto Ld4
            com.google.firebase.database.p.l r10 = com.google.firebase.database.p124p.C2506l.m1385w()
            com.google.firebase.database.r.n r10 = r11.m1713i(r10)
            if (r10 == 0) goto Ld2
            goto Ld4
        Ld2:
            r10 = 0
            goto Ld5
        Ld4:
            r10 = 1
        Ld5:
            com.google.firebase.database.p.h0.m.d r11 = r8.f6509a
            boolean r11 = r11.mo1419c()
            com.google.firebase.database.p.h0.k r9 = r9.m1439e(r2, r10, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.p124p.p128h0.C2492l.m1427k(com.google.firebase.database.p.h0.k, com.google.firebase.database.p.l, com.google.firebase.database.p.c0, com.google.firebase.database.r.n, com.google.firebase.database.p.h0.m.a):com.google.firebase.database.p.h0.k");
    }
}
