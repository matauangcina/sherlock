package com.google.firebase.database.p124p.p128h0.p129m;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p128h0.C2477c;
import com.google.firebase.database.p124p.p128h0.C2485h;
import com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d;
import com.google.firebase.database.p131r.AbstractC2586h;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.C2600r;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Iterator;
/* renamed from: com.google.firebase.database.p.h0.m.c */
/* loaded from: classes.dex */
public class C2499c implements InterfaceC2500d {

    /* renamed from: a */
    private final C2502e f6518a;

    /* renamed from: b */
    private final AbstractC2586h f6519b;

    /* renamed from: c */
    private final int f6520c;

    /* renamed from: d */
    private final boolean f6521d;

    public C2499c(C2485h c2485h) {
        this.f6518a = new C2502e(c2485h);
        this.f6519b = c2485h.m1476b();
        this.f6520c = c2485h.m1471g();
        this.f6521d = !c2485h.m1464n();
    }

    /* renamed from: g */
    private C2587i m1424g(C2587i c2587i, C2570b c2570b, InterfaceC2594n interfaceC2594n, InterfaceC2500d.InterfaceC2501a interfaceC2501a, C2497a c2497a) {
        C2587i m1102s;
        C2570b m1089c;
        InterfaceC2594n m1115s;
        C2593m c2593m = new C2593m(c2570b, interfaceC2594n);
        C2593m m1106g = this.f6521d ? c2587i.m1106g() : c2587i.m1105i();
        boolean m1411k = this.f6518a.m1411k(c2593m);
        if (c2587i.m1104l().mo1076o(c2570b)) {
            InterfaceC2594n mo1079b = c2587i.m1104l().mo1079b(c2570b);
            while (true) {
                m1106g = interfaceC2501a.mo1423a(this.f6519b, m1106g, this.f6521d);
                if (m1106g == null || (!m1106g.m1089c().equals(c2570b) && !c2587i.m1104l().mo1076o(m1106g.m1089c()))) {
                    break;
                }
            }
            boolean z = true;
            if (m1411k && !interfaceC2594n.isEmpty() && (m1106g == null ? 1 : this.f6519b.m1113a(m1106g, c2593m, this.f6521d)) >= 0) {
                if (c2497a != null) {
                    c2497a.m1425b(C2477c.m1497e(c2570b, interfaceC2594n, mo1079b));
                }
                return c2587i.m1102s(c2570b, interfaceC2594n);
            }
            if (c2497a != null) {
                c2497a.m1425b(C2477c.m1494h(c2570b, mo1079b));
            }
            m1102s = c2587i.m1102s(c2570b, C2585g.m1115s());
            if (!((m1106g == null || !this.f6518a.m1411k(m1106g)) ? false : false)) {
                return m1102s;
            }
            if (c2497a != null) {
                c2497a.m1425b(C2477c.m1499c(m1106g.m1089c(), m1106g.m1088d()));
            }
            m1089c = m1106g.m1089c();
            m1115s = m1106g.m1088d();
        } else if (interfaceC2594n.isEmpty() || !m1411k || this.f6519b.m1113a(m1106g, c2593m, this.f6521d) < 0) {
            return c2587i;
        } else {
            if (c2497a != null) {
                c2497a.m1425b(C2477c.m1494h(m1106g.m1089c(), m1106g.m1088d()));
                c2497a.m1425b(C2477c.m1499c(c2570b, interfaceC2594n));
            }
            m1102s = c2587i.m1102s(c2570b, interfaceC2594n);
            m1089c = m1106g.m1089c();
            m1115s = C2585g.m1115s();
        }
        return m1102s.m1102s(m1089c, m1115s);
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: a */
    public InterfaceC2500d mo1421a() {
        return this.f6518a.mo1421a();
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: b */
    public C2587i mo1420b(C2587i c2587i, InterfaceC2594n interfaceC2594n) {
        return c2587i;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: c */
    public boolean mo1419c() {
        return true;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: d */
    public AbstractC2586h mo1418d() {
        return this.f6519b;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: e */
    public C2587i mo1417e(C2587i c2587i, C2570b c2570b, InterfaceC2594n interfaceC2594n, C2506l c2506l, InterfaceC2500d.InterfaceC2501a interfaceC2501a, C2497a c2497a) {
        if (!this.f6518a.m1411k(new C2593m(c2570b, interfaceC2594n))) {
            interfaceC2594n = C2585g.m1115s();
        }
        InterfaceC2594n interfaceC2594n2 = interfaceC2594n;
        return c2587i.m1104l().mo1079b(c2570b).equals(interfaceC2594n2) ? c2587i : c2587i.m1104l().mo1087a() < this.f6520c ? this.f6518a.mo1421a().mo1417e(c2587i, c2570b, interfaceC2594n2, c2506l, interfaceC2501a, c2497a) : m1424g(c2587i, c2570b, interfaceC2594n2, interfaceC2501a, c2497a);
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: f */
    public C2587i mo1416f(C2587i c2587i, C2587i c2587i2, C2497a c2497a) {
        C2587i m1107f;
        Iterator<C2593m> it;
        C2593m m1413i;
        C2593m m1415g;
        int i;
        if (c2587i2.m1104l().mo1085k() || c2587i2.m1104l().isEmpty()) {
            m1107f = C2587i.m1107f(C2585g.m1115s(), this.f6519b);
        } else {
            m1107f = c2587i2.m1100u(C2600r.m1069a());
            if (this.f6521d) {
                it = c2587i2.m1101t();
                m1413i = this.f6518a.m1415g();
                m1415g = this.f6518a.m1413i();
                i = -1;
            } else {
                it = c2587i2.iterator();
                m1413i = this.f6518a.m1413i();
                m1415g = this.f6518a.m1415g();
                i = 1;
            }
            boolean z = false;
            int i2 = 0;
            while (it.hasNext()) {
                C2593m next = it.next();
                if (!z && this.f6519b.compare(m1413i, next) * i <= 0) {
                    z = true;
                }
                if (z && i2 < this.f6520c && this.f6519b.compare(next, m1415g) * i <= 0) {
                    i2++;
                } else {
                    m1107f = m1107f.m1102s(next.m1089c(), C2585g.m1115s());
                }
            }
        }
        return this.f6518a.mo1421a().mo1416f(c2587i, m1107f, c2497a);
    }
}
