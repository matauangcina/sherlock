package com.google.firebase.database.p124p;

import com.google.firebase.database.C2306b;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p124p.p126f0.InterfaceC2435e;
import com.google.firebase.database.p124p.p127g0.C2463g;
import com.google.firebase.database.p124p.p128h0.C2475a;
import com.google.firebase.database.p124p.p128h0.C2477c;
import com.google.firebase.database.p124p.p128h0.C2478d;
import com.google.firebase.database.p124p.p128h0.C2485h;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p124p.p128h0.C2489j;
import com.google.firebase.database.p124p.p128h0.C2491k;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.u */
/* loaded from: classes.dex */
public class C2540u {

    /* renamed from: a */
    private final Map<C2485h, C2489j> f6618a = new HashMap();

    /* renamed from: b */
    private final InterfaceC2435e f6619b;

    public C2540u(InterfaceC2435e interfaceC2435e) {
        this.f6619b = interfaceC2435e;
    }

    /* renamed from: c */
    private List<C2478d> m1279c(C2489j c2489j, AbstractC2425d abstractC2425d, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n) {
        C2489j.C2490a m1452b = c2489j.m1452b(abstractC2425d, c2418c0, interfaceC2594n);
        if (!c2489j.m1447g().m1454g()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C2477c c2477c : m1452b.f6505b) {
                InterfaceC2479e.EnumC2480a m1492j = c2477c.m1492j();
                if (m1492j == InterfaceC2479e.EnumC2480a.CHILD_ADDED) {
                    hashSet2.add(c2477c.m1493i());
                } else if (m1492j == InterfaceC2479e.EnumC2480a.CHILD_REMOVED) {
                    hashSet.add(c2477c.m1493i());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.f6619b.mo1680g(c2489j.m1447g(), hashSet2, hashSet);
            }
        }
        return m1452b.f6504a;
    }

    /* renamed from: a */
    public List<C2478d> m1281a(AbstractC2503i abstractC2503i, C2418c0 c2418c0, C2475a c2475a) {
        boolean z;
        C2488i mo1406e = abstractC2503i.mo1406e();
        C2489j c2489j = this.f6618a.get(mo1406e.m1457d());
        if (c2489j == null) {
            InterfaceC2594n m1720b = c2418c0.m1720b(c2475a.m1503f() ? c2475a.m1507b() : null);
            if (m1720b != null) {
                z = true;
            } else {
                m1720b = c2418c0.m1717e(c2475a.m1507b());
                z = false;
            }
            c2489j = new C2489j(mo1406e, new C2491k(new C2475a(C2587i.m1107f(m1720b, mo1406e.m1458c()), z, false), c2475a));
            if (!mo1406e.m1454g()) {
                HashSet hashSet = new HashSet();
                for (C2593m c2593m : c2489j.m1449e()) {
                    hashSet.add(c2593m.m1089c());
                }
                this.f6619b.mo1679h(mo1406e, hashSet);
            }
            this.f6618a.put(mo1406e.m1457d(), c2489j);
        }
        c2489j.m1453a(abstractC2503i);
        return c2489j.m1448f(abstractC2503i);
    }

    /* renamed from: b */
    public List<C2478d> m1280b(AbstractC2425d abstractC2425d, C2418c0 c2418c0, InterfaceC2594n interfaceC2594n) {
        C2485h m1698b = abstractC2425d.m1701b().m1698b();
        if (m1698b != null) {
            return m1279c(this.f6618a.get(m1698b), abstractC2425d, c2418c0, interfaceC2594n);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C2485h, C2489j> entry : this.f6618a.entrySet()) {
            arrayList.addAll(m1279c(entry.getValue(), abstractC2425d, c2418c0, interfaceC2594n));
        }
        return arrayList;
    }

    /* renamed from: d */
    public InterfaceC2594n m1278d(C2506l c2506l) {
        for (C2489j c2489j : this.f6618a.values()) {
            if (c2489j.m1450d(c2506l) != null) {
                return c2489j.m1450d(c2506l);
            }
        }
        return null;
    }

    /* renamed from: e */
    public C2489j m1277e() {
        for (Map.Entry<C2485h, C2489j> entry : this.f6618a.entrySet()) {
            C2489j value = entry.getValue();
            if (value.m1447g().m1454g()) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: f */
    public List<C2489j> m1276f() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C2485h, C2489j> entry : this.f6618a.entrySet()) {
            C2489j value = entry.getValue();
            if (!value.m1447g().m1454g()) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public boolean m1275g() {
        return m1277e() != null;
    }

    /* renamed from: h */
    public boolean m1274h() {
        return this.f6618a.isEmpty();
    }

    /* renamed from: i */
    public C2463g<List<C2488i>, List<InterfaceC2479e>> m1273i(C2488i c2488i, AbstractC2503i abstractC2503i, C2306b c2306b) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean m1275g = m1275g();
        if (c2488i.m1455f()) {
            Iterator<Map.Entry<C2485h, C2489j>> it = this.f6618a.entrySet().iterator();
            while (it.hasNext()) {
                C2489j value = it.next().getValue();
                arrayList2.addAll(value.m1444j(abstractC2503i, c2306b));
                if (value.m1445i()) {
                    it.remove();
                    if (!value.m1447g().m1454g()) {
                        arrayList.add(value.m1447g());
                    }
                }
            }
        } else {
            C2489j c2489j = this.f6618a.get(c2488i.m1457d());
            if (c2489j != null) {
                arrayList2.addAll(c2489j.m1444j(abstractC2503i, c2306b));
                if (c2489j.m1445i()) {
                    this.f6618a.remove(c2488i.m1457d());
                    if (!c2489j.m1447g().m1454g()) {
                        arrayList.add(c2489j.m1447g());
                    }
                }
            }
        }
        if (m1275g && !m1275g()) {
            arrayList.add(C2488i.m1460a(c2488i.m1456e()));
        }
        return new C2463g<>(arrayList, arrayList2);
    }

    /* renamed from: j */
    public boolean m1272j(C2488i c2488i) {
        return m1271k(c2488i) != null;
    }

    /* renamed from: k */
    public C2489j m1271k(C2488i c2488i) {
        return c2488i.m1454g() ? m1277e() : this.f6618a.get(c2488i.m1457d());
    }
}
