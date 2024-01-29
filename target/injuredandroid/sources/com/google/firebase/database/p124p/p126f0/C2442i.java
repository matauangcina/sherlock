package com.google.firebase.database.p124p.p126f0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p127g0.C2457d;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p124p.p127g0.InterfaceC2451a;
import com.google.firebase.database.p124p.p127g0.InterfaceC2465i;
import com.google.firebase.database.p124p.p128h0.C2485h;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p131r.C2570b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.firebase.database.p.f0.i */
/* loaded from: classes.dex */
public class C2442i {

    /* renamed from: f */
    private static final InterfaceC2465i<Map<C2485h, C2441h>> f6405f = new C2443a();

    /* renamed from: g */
    private static final InterfaceC2465i<Map<C2485h, C2441h>> f6406g = new C2444b();

    /* renamed from: h */
    private static final InterfaceC2465i<C2441h> f6407h = new C2445c();

    /* renamed from: i */
    private static final InterfaceC2465i<C2441h> f6408i = new C2446d();

    /* renamed from: a */
    private C2457d<Map<C2485h, C2441h>> f6409a = new C2457d<>(null);

    /* renamed from: b */
    private final InterfaceC2436f f6410b;

    /* renamed from: c */
    private final C2566c f6411c;

    /* renamed from: d */
    private final InterfaceC2451a f6412d;

    /* renamed from: e */
    private long f6413e;

    /* renamed from: com.google.firebase.database.p.f0.i$a */
    /* loaded from: classes.dex */
    class C2443a implements InterfaceC2465i<Map<C2485h, C2441h>> {
        C2443a() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(Map<C2485h, C2441h> map) {
            C2441h c2441h = map.get(C2485h.f6484i);
            return c2441h != null && c2441h.f6403d;
        }
    }

    /* renamed from: com.google.firebase.database.p.f0.i$b */
    /* loaded from: classes.dex */
    class C2444b implements InterfaceC2465i<Map<C2485h, C2441h>> {
        C2444b() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(Map<C2485h, C2441h> map) {
            C2441h c2441h = map.get(C2485h.f6484i);
            return c2441h != null && c2441h.f6404e;
        }
    }

    /* renamed from: com.google.firebase.database.p.f0.i$c */
    /* loaded from: classes.dex */
    class C2445c implements InterfaceC2465i<C2441h> {
        C2445c() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(C2441h c2441h) {
            return !c2441h.f6404e;
        }
    }

    /* renamed from: com.google.firebase.database.p.f0.i$d */
    /* loaded from: classes.dex */
    class C2446d implements InterfaceC2465i<C2441h> {
        C2446d() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(C2441h c2441h) {
            return !C2442i.f6407h.mo1540a(c2441h);
        }
    }

    /* renamed from: com.google.firebase.database.p.f0.i$e */
    /* loaded from: classes.dex */
    class C2447e implements C2457d.InterfaceC2460c<Map<C2485h, C2441h>, Void> {
        C2447e() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public Void mo1221a(C2506l c2506l, Map<C2485h, C2441h> map, Void r3) {
            for (Map.Entry<C2485h, C2441h> entry : map.entrySet()) {
                C2441h value = entry.getValue();
                if (!value.f6403d) {
                    C2442i.this.m1619s(value.m1639b());
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.firebase.database.p.f0.i$f */
    /* loaded from: classes.dex */
    class C2448f implements Comparator<C2441h> {
        C2448f(C2442i c2442i) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C2441h c2441h, C2441h c2441h2) {
            return C2472l.m1523b(c2441h.f6402c, c2441h2.f6402c);
        }
    }

    public C2442i(InterfaceC2436f interfaceC2436f, C2566c c2566c, InterfaceC2451a interfaceC2451a) {
        this.f6413e = 0L;
        this.f6410b = interfaceC2436f;
        this.f6411c = c2566c;
        this.f6412d = interfaceC2451a;
        m1620r();
        for (C2441h c2441h : this.f6410b.mo1656p()) {
            this.f6413e = Math.max(c2441h.f6400a + 1, this.f6413e);
            m1634d(c2441h);
        }
    }

    /* renamed from: c */
    private static void m1635c(C2488i c2488i) {
        C2472l.m1519f(!c2488i.m1454g() || c2488i.m1455f(), "Can't have tracked non-default query that loads all data");
    }

    /* renamed from: d */
    private void m1634d(C2441h c2441h) {
        m1635c(c2441h.f6401b);
        Map<C2485h, C2441h> m1555s = this.f6409a.m1555s(c2441h.f6401b.m1456e());
        if (m1555s == null) {
            m1555s = new HashMap<>();
            this.f6409a = this.f6409a.m1566B(c2441h.f6401b.m1456e(), m1555s);
        }
        C2441h c2441h2 = m1555s.get(c2441h.f6401b.m1457d());
        C2472l.m1520e(c2441h2 == null || c2441h2.f6400a == c2441h.f6400a);
        m1555s.put(c2441h.f6401b.m1457d(), c2441h);
    }

    /* renamed from: e */
    private static long m1633e(InterfaceC2431a interfaceC2431a, long j) {
        return j - Math.min((long) Math.floor(((float) j) * (1.0f - interfaceC2431a.mo1690b())), interfaceC2431a.mo1689c());
    }

    /* renamed from: h */
    private Set<Long> m1630h(C2506l c2506l) {
        HashSet hashSet = new HashSet();
        Map<C2485h, C2441h> m1555s = this.f6409a.m1555s(c2506l);
        if (m1555s != null) {
            for (C2441h c2441h : m1555s.values()) {
                if (!c2441h.f6401b.m1454g()) {
                    hashSet.add(Long.valueOf(c2441h.f6400a));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: k */
    private List<C2441h> m1627k(InterfaceC2465i<C2441h> interfaceC2465i) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<C2506l, Map<C2485h, C2441h>>> it = this.f6409a.iterator();
        while (it.hasNext()) {
            for (C2441h c2441h : it.next().getValue().values()) {
                if (interfaceC2465i.mo1540a(c2441h)) {
                    arrayList.add(c2441h);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private boolean m1625m(C2506l c2506l) {
        return this.f6409a.m1560f(c2506l, f6405f) != null;
    }

    /* renamed from: o */
    private static C2488i m1623o(C2488i c2488i) {
        return c2488i.m1454g() ? C2488i.m1460a(c2488i.m1456e()) : c2488i;
    }

    /* renamed from: r */
    private void m1620r() {
        try {
            this.f6410b.mo1666f();
            this.f6410b.mo1663i(this.f6412d.mo1544a());
            this.f6410b.mo1654r();
        } finally {
            this.f6410b.mo1667e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m1619s(C2441h c2441h) {
        m1634d(c2441h);
        this.f6410b.mo1660l(c2441h);
    }

    /* renamed from: v */
    private void m1616v(C2488i c2488i, boolean z) {
        C2441h c2441h;
        C2488i m1623o = m1623o(c2488i);
        C2441h m1629i = m1629i(m1623o);
        long mo1544a = this.f6412d.mo1544a();
        if (m1629i != null) {
            c2441h = m1629i.m1638c(mo1544a).m1640a(z);
        } else {
            long j = this.f6413e;
            this.f6413e = 1 + j;
            c2441h = new C2441h(j, m1623o, mo1544a, false, z);
        }
        m1619s(c2441h);
    }

    /* renamed from: f */
    public long m1632f() {
        return m1627k(f6407h).size();
    }

    /* renamed from: g */
    public void m1631g(C2506l c2506l) {
        C2441h m1639b;
        if (m1625m(c2506l)) {
            return;
        }
        C2488i m1460a = C2488i.m1460a(c2506l);
        C2441h m1629i = m1629i(m1460a);
        if (m1629i == null) {
            long j = this.f6413e;
            this.f6413e = 1 + j;
            m1639b = new C2441h(j, m1460a, this.f6412d.mo1544a(), true, false);
        } else {
            m1639b = m1629i.m1639b();
        }
        m1619s(m1639b);
    }

    /* renamed from: i */
    public C2441h m1629i(C2488i c2488i) {
        C2488i m1623o = m1623o(c2488i);
        Map<C2485h, C2441h> m1555s = this.f6409a.m1555s(m1623o.m1456e());
        if (m1555s != null) {
            return m1555s.get(m1623o.m1457d());
        }
        return null;
    }

    /* renamed from: j */
    public Set<C2570b> m1628j(C2506l c2506l) {
        HashSet hashSet = new HashSet();
        Set<Long> m1630h = m1630h(c2506l);
        if (!m1630h.isEmpty()) {
            hashSet.addAll(this.f6410b.mo1652t(m1630h));
        }
        Iterator<Map.Entry<C2570b, C2457d<Map<C2485h, C2441h>>>> it = this.f6409a.m1564D(c2506l).m1553w().iterator();
        while (it.hasNext()) {
            Map.Entry<C2570b, C2457d<Map<C2485h, C2441h>>> next = it.next();
            C2570b key = next.getKey();
            C2457d<Map<C2485h, C2441h>> value = next.getValue();
            if (value.getValue() != null && f6405f.mo1540a(value.getValue())) {
                hashSet.add(key);
            }
        }
        return hashSet;
    }

    /* renamed from: l */
    public boolean m1626l(C2506l c2506l) {
        return this.f6409a.m1567A(c2506l, f6406g) != null;
    }

    /* renamed from: n */
    public boolean m1624n(C2488i c2488i) {
        Map<C2485h, C2441h> m1555s;
        if (m1625m(c2488i.m1456e())) {
            return true;
        }
        return !c2488i.m1454g() && (m1555s = this.f6409a.m1555s(c2488i.m1456e())) != null && m1555s.containsKey(c2488i.m1457d()) && m1555s.get(c2488i.m1457d()).f6403d;
    }

    /* renamed from: p */
    public C2437g m1622p(InterfaceC2431a interfaceC2431a) {
        List<C2441h> m1627k = m1627k(f6407h);
        long m1633e = m1633e(interfaceC2431a, m1627k.size());
        C2437g c2437g = new C2437g();
        if (this.f6411c.m1174f()) {
            C2566c c2566c = this.f6411c;
            c2566c.m1178b("Pruning old queries.  Prunable: " + m1627k.size() + " Count to prune: " + m1633e, new Object[0]);
        }
        Collections.sort(m1627k, new C2448f(this));
        for (int i = 0; i < m1633e; i++) {
            C2441h c2441h = m1627k.get(i);
            c2437g = c2437g.m1647d(c2441h.f6401b.m1456e());
            m1621q(c2441h.f6401b);
        }
        for (int i2 = (int) m1633e; i2 < m1627k.size(); i2++) {
            c2437g = c2437g.m1648c(m1627k.get(i2).f6401b.m1456e());
        }
        List<C2441h> m1627k2 = m1627k(f6408i);
        if (this.f6411c.m1174f()) {
            C2566c c2566c2 = this.f6411c;
            c2566c2.m1178b("Unprunable queries: " + m1627k2.size(), new Object[0]);
        }
        for (C2441h c2441h2 : m1627k2) {
            c2437g = c2437g.m1648c(c2441h2.f6401b.m1456e());
        }
        return c2437g;
    }

    /* renamed from: q */
    public void m1621q(C2488i c2488i) {
        C2488i m1623o = m1623o(c2488i);
        this.f6410b.mo1665g(m1629i(m1623o).f6400a);
        Map<C2485h, C2441h> m1555s = this.f6409a.m1555s(m1623o.m1456e());
        m1555s.remove(m1623o.m1457d());
        if (m1555s.isEmpty()) {
            this.f6409a = this.f6409a.m1550z(m1623o.m1456e());
        }
    }

    /* renamed from: t */
    public void m1618t(C2506l c2506l) {
        this.f6409a.m1564D(c2506l).m1556m(new C2447e());
    }

    /* renamed from: u */
    public void m1617u(C2488i c2488i) {
        m1616v(c2488i, true);
    }

    /* renamed from: w */
    public void m1615w(C2488i c2488i) {
        C2441h m1629i = m1629i(m1623o(c2488i));
        if (m1629i == null || m1629i.f6403d) {
            return;
        }
        m1619s(m1629i.m1639b());
    }

    /* renamed from: x */
    public void m1614x(C2488i c2488i) {
        m1616v(c2488i, false);
    }
}
