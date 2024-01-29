package com.google.firebase.database.p124p.p126f0;

import com.google.firebase.database.p124p.C2411b;
import com.google.firebase.database.p124p.C2449g;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2561y;
import com.google.firebase.database.p124p.p127g0.C2452b;
import com.google.firebase.database.p124p.p127g0.InterfaceC2451a;
import com.google.firebase.database.p124p.p128h0.C2475a;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* renamed from: com.google.firebase.database.p.f0.b */
/* loaded from: classes.dex */
public class C2432b implements InterfaceC2435e {

    /* renamed from: a */
    private final InterfaceC2436f f6387a;

    /* renamed from: b */
    private final C2442i f6388b;

    /* renamed from: c */
    private final C2566c f6389c;

    /* renamed from: d */
    private final InterfaceC2431a f6390d;

    /* renamed from: e */
    private long f6391e;

    public C2432b(C2449g c2449g, InterfaceC2436f interfaceC2436f, InterfaceC2431a interfaceC2431a) {
        this(c2449g, interfaceC2436f, interfaceC2431a, new C2452b());
    }

    public C2432b(C2449g c2449g, InterfaceC2436f interfaceC2436f, InterfaceC2431a interfaceC2431a, InterfaceC2451a interfaceC2451a) {
        this.f6391e = 0L;
        this.f6387a = interfaceC2436f;
        this.f6389c = c2449g.m1589n("Persistence");
        this.f6388b = new C2442i(this.f6387a, this.f6389c, interfaceC2451a);
        this.f6390d = interfaceC2431a;
    }

    /* renamed from: p */
    private void m1692p() {
        long j = this.f6391e + 1;
        this.f6391e = j;
        if (this.f6390d.mo1688d(j)) {
            if (this.f6389c.m1174f()) {
                this.f6389c.m1178b("Reached prune check threshold.", new Object[0]);
            }
            this.f6391e = 0L;
            boolean z = true;
            long mo1658n = this.f6387a.mo1658n();
            if (this.f6389c.m1174f()) {
                C2566c c2566c = this.f6389c;
                c2566c.m1178b("Cache size: " + mo1658n, new Object[0]);
            }
            while (z && this.f6390d.mo1691a(mo1658n, this.f6388b.m1632f())) {
                C2437g m1622p = this.f6388b.m1622p(this.f6390d);
                if (m1622p.m1646e()) {
                    this.f6387a.mo1651u(C2506l.m1385w(), m1622p);
                } else {
                    z = false;
                }
                mo1658n = this.f6387a.mo1658n();
                if (this.f6389c.m1174f()) {
                    C2566c c2566c2 = this.f6389c;
                    c2566c2.m1178b("Cache size after prune: " + mo1658n, new Object[0]);
                }
            }
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: a */
    public void mo1686a(long j) {
        this.f6387a.mo1671a(j);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: b */
    public void mo1685b(C2506l c2506l, C2411b c2411b, long j) {
        this.f6387a.mo1670b(c2506l, c2411b, j);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: c */
    public List<C2561y> mo1684c() {
        return this.f6387a.mo1669c();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: d */
    public void mo1683d(C2506l c2506l, InterfaceC2594n interfaceC2594n, long j) {
        this.f6387a.mo1668d(c2506l, interfaceC2594n, j);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: e */
    public void mo1682e(C2488i c2488i) {
        this.f6388b.m1614x(c2488i);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: f */
    public void mo1681f(C2488i c2488i) {
        if (c2488i.m1454g()) {
            this.f6388b.m1618t(c2488i.m1456e());
        } else {
            this.f6388b.m1615w(c2488i);
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: g */
    public void mo1680g(C2488i c2488i, Set<C2570b> set, Set<C2570b> set2) {
        this.f6387a.mo1653s(this.f6388b.m1629i(c2488i).f6400a, set, set2);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: h */
    public void mo1679h(C2488i c2488i, Set<C2570b> set) {
        this.f6387a.mo1661k(this.f6388b.m1629i(c2488i).f6400a, set);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: i */
    public <T> T mo1678i(Callable<T> callable) {
        this.f6387a.mo1666f();
        try {
            T call = callable.call();
            this.f6387a.mo1654r();
            return call;
        } finally {
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: j */
    public void mo1677j(C2488i c2488i, InterfaceC2594n interfaceC2594n) {
        if (c2488i.m1454g()) {
            this.f6387a.mo1659m(c2488i.m1456e(), interfaceC2594n);
        } else {
            this.f6387a.mo1662j(c2488i.m1456e(), interfaceC2594n);
        }
        mo1681f(c2488i);
        m1692p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: k */
    public void mo1676k(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        if (this.f6388b.m1626l(c2506l)) {
            return;
        }
        this.f6387a.mo1659m(c2506l, interfaceC2594n);
        this.f6388b.m1631g(c2506l);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: l */
    public void mo1675l(C2488i c2488i) {
        this.f6388b.m1617u(c2488i);
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: m */
    public void mo1674m(C2506l c2506l, C2411b c2411b) {
        Iterator<Map.Entry<C2506l, InterfaceC2594n>> it = c2411b.iterator();
        while (it.hasNext()) {
            Map.Entry<C2506l, InterfaceC2594n> next = it.next();
            mo1676k(c2506l.m1390i(next.getKey()), next.getValue());
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: n */
    public void mo1673n(C2506l c2506l, C2411b c2411b) {
        this.f6387a.mo1657o(c2506l, c2411b);
        m1692p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: o */
    public C2475a mo1672o(C2488i c2488i) {
        Set<C2570b> m1628j;
        boolean z;
        if (this.f6388b.m1624n(c2488i)) {
            C2441h m1629i = this.f6388b.m1629i(c2488i);
            m1628j = (c2488i.m1454g() || m1629i == null || !m1629i.f6403d) ? null : this.f6387a.mo1664h(m1629i.f6400a);
            z = true;
        } else {
            m1628j = this.f6388b.m1628j(c2488i.m1456e());
            z = false;
        }
        InterfaceC2594n mo1655q = this.f6387a.mo1655q(c2488i.m1456e());
        if (m1628j != null) {
            InterfaceC2594n m1115s = C2585g.m1115s();
            for (C2570b c2570b : m1628j) {
                m1115s = m1115s.mo1083p(c2570b, mo1655q.mo1079b(c2570b));
            }
            return new C2475a(C2587i.m1107f(m1115s, c2488i.m1458c()), z, true);
        }
        return new C2475a(C2587i.m1107f(mo1655q, c2488i.m1458c()), z, false);
    }
}
