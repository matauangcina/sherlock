package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.C2306b;
import com.google.firebase.database.p124p.AbstractC2503i;
import com.google.firebase.database.p124p.C2418c0;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p124p.p128h0.C2492l;
import com.google.firebase.database.p124p.p128h0.p129m.C2498b;
import com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.firebase.database.p.h0.j */
/* loaded from: classes.dex */
public class C2489j {

    /* renamed from: a */
    private final C2488i f6499a;

    /* renamed from: b */
    private final C2492l f6500b;

    /* renamed from: c */
    private C2491k f6501c;

    /* renamed from: d */
    private final List<AbstractC2503i> f6502d;

    /* renamed from: e */
    private final C2481f f6503e;

    /* renamed from: com.google.firebase.database.p.h0.j$a */
    /* loaded from: classes.dex */
    public static class C2490a {

        /* renamed from: a */
        public final List<C2478d> f6504a;

        /* renamed from: b */
        public final List<C2477c> f6505b;

        public C2490a(List<C2478d> list, List<C2477c> list2) {
            this.f6504a = list;
            this.f6505b = list2;
        }
    }

    public C2489j(C2488i c2488i, C2491k c2491k) {
        this.f6499a = c2488i;
        C2498b c2498b = new C2498b(c2488i.m1458c());
        InterfaceC2500d m1470h = c2488i.m1457d().m1470h();
        this.f6500b = new C2492l(m1470h);
        C2475a m1440d = c2491k.m1440d();
        C2475a m1441c = c2491k.m1441c();
        C2587i m1107f = C2587i.m1107f(C2585g.m1115s(), c2488i.m1458c());
        C2587i m1508a = m1440d.m1508a();
        c2498b.mo1416f(m1107f, m1508a, null);
        C2587i mo1416f = m1470h.mo1416f(m1107f, m1441c.m1508a(), null);
        this.f6501c = new C2491k(new C2475a(mo1416f, m1441c.m1503f(), m1470h.mo1419c()), new C2475a(m1508a, m1440d.m1503f(), c2498b.mo1419c()));
        this.f6502d = new ArrayList();
        this.f6503e = new C2481f(c2488i);
    }

    /* renamed from: c */
    private List<C2478d> m1451c(List<C2477c> list, C2587i c2587i, AbstractC2503i abstractC2503i) {
        return this.f6503e.m1482d(list, c2587i, abstractC2503i == null ? this.f6502d : Arrays.asList(abstractC2503i));
    }

    /* renamed from: a */
    public void m1453a(AbstractC2503i abstractC2503i) {
        this.f6502d.add(abstractC2503i);
    }

    /* renamed from: b */
    public C2490a m1452b(AbstractC2425d abstractC2425d, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n) {
        if (abstractC2425d.m1700c() == AbstractC2425d.EnumC2426a.Merge) {
            abstractC2425d.m1701b().m1698b();
        }
        C2492l.C2495c m1436b = this.f6500b.m1436b(this.f6501c, abstractC2425d, c2418c0, interfaceC2594n);
        C2491k c2491k = m1436b.f6511a;
        this.f6501c = c2491k;
        return new C2490a(m1451c(m1436b.f6512b, c2491k.m1441c().m1508a(), null), m1436b.f6512b);
    }

    /* renamed from: d */
    public InterfaceC2594n m1450d(C2506l c2506l) {
        InterfaceC2594n m1442b = this.f6501c.m1442b();
        if (m1442b != null) {
            if (this.f6499a.m1454g() || !(c2506l.isEmpty() || m1442b.mo1079b(c2506l.m1384x()).isEmpty())) {
                return m1442b.mo1086h(c2506l);
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public InterfaceC2594n m1449e() {
        return this.f6501c.m1441c().m1507b();
    }

    /* renamed from: f */
    public List<C2478d> m1448f(AbstractC2503i abstractC2503i) {
        C2475a m1441c = this.f6501c.m1441c();
        ArrayList arrayList = new ArrayList();
        for (C2593m c2593m : m1441c.m1507b()) {
            arrayList.add(C2477c.m1499c(c2593m.m1089c(), c2593m.m1088d()));
        }
        if (m1441c.m1503f()) {
            arrayList.add(C2477c.m1489m(m1441c.m1508a()));
        }
        return m1451c(arrayList, m1441c.m1508a(), abstractC2503i);
    }

    /* renamed from: g */
    public C2488i m1447g() {
        return this.f6499a;
    }

    /* renamed from: h */
    public InterfaceC2594n m1446h() {
        return this.f6501c.m1440d().m1507b();
    }

    /* renamed from: i */
    public boolean m1445i() {
        return this.f6502d.isEmpty();
    }

    /* renamed from: j */
    public List<InterfaceC2479e> m1444j(AbstractC2503i abstractC2503i, C2306b c2306b) {
        List<InterfaceC2479e> emptyList;
        if (c2306b != null) {
            emptyList = new ArrayList<>();
            C2506l m1456e = this.f6499a.m1456e();
            for (AbstractC2503i abstractC2503i2 : this.f6502d) {
                emptyList.add(new C2476b(abstractC2503i2, c2306b, m1456e));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        if (abstractC2503i != null) {
            int i = 0;
            int i2 = -1;
            while (true) {
                if (i >= this.f6502d.size()) {
                    i = i2;
                    break;
                }
                AbstractC2503i abstractC2503i3 = this.f6502d.get(i);
                if (abstractC2503i3.mo1405f(abstractC2503i)) {
                    if (abstractC2503i3.m1404g()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            if (i != -1) {
                this.f6502d.remove(i);
                this.f6502d.get(i).m1400k();
            }
        } else {
            for (AbstractC2503i abstractC2503i4 : this.f6502d) {
                abstractC2503i4.m1400k();
            }
            this.f6502d.clear();
        }
        return emptyList;
    }
}
