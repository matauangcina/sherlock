package com.google.firebase.database.p124p.p128h0.p129m;

import com.google.firebase.database.p124p.C2506l;
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
/* renamed from: com.google.firebase.database.p.h0.m.e */
/* loaded from: classes.dex */
public class C2502e implements InterfaceC2500d {

    /* renamed from: a */
    private final C2498b f6522a;

    /* renamed from: b */
    private final AbstractC2586h f6523b;

    /* renamed from: c */
    private final C2593m f6524c;

    /* renamed from: d */
    private final C2593m f6525d;

    public C2502e(C2485h c2485h) {
        this.f6522a = new C2498b(c2485h.m1476b());
        this.f6523b = c2485h.m1476b();
        this.f6524c = m1412j(c2485h);
        this.f6525d = m1414h(c2485h);
    }

    /* renamed from: h */
    private static C2593m m1414h(C2485h c2485h) {
        if (c2485h.m1468j()) {
            return c2485h.m1476b().mo1055f(c2485h.m1475c(), c2485h.m1474d());
        }
        return c2485h.m1476b().mo1054g();
    }

    /* renamed from: j */
    private static C2593m m1412j(C2485h c2485h) {
        if (c2485h.m1466l()) {
            return c2485h.m1476b().mo1055f(c2485h.m1473e(), c2485h.m1472f());
        }
        return c2485h.m1476b().m1110h();
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: a */
    public InterfaceC2500d mo1421a() {
        return this.f6522a;
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
        return this.f6523b;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: e */
    public C2587i mo1417e(C2587i c2587i, C2570b c2570b, InterfaceC2594n interfaceC2594n, C2506l c2506l, InterfaceC2500d.InterfaceC2501a interfaceC2501a, C2497a c2497a) {
        if (!m1411k(new C2593m(c2570b, interfaceC2594n))) {
            interfaceC2594n = C2585g.m1115s();
        }
        return this.f6522a.mo1417e(c2587i, c2570b, interfaceC2594n, c2506l, interfaceC2501a, c2497a);
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: f */
    public C2587i mo1416f(C2587i c2587i, C2587i c2587i2, C2497a c2497a) {
        C2587i c2587i3;
        if (c2587i2.m1104l().mo1085k()) {
            c2587i3 = C2587i.m1107f(C2585g.m1115s(), this.f6523b);
        } else {
            C2587i m1100u = c2587i2.m1100u(C2600r.m1069a());
            Iterator<C2593m> it = c2587i2.iterator();
            while (it.hasNext()) {
                C2593m next = it.next();
                if (!m1411k(next)) {
                    m1100u = m1100u.m1102s(next.m1089c(), C2585g.m1115s());
                }
            }
            c2587i3 = m1100u;
        }
        this.f6522a.mo1416f(c2587i, c2587i3, c2497a);
        return c2587i3;
    }

    /* renamed from: g */
    public C2593m m1415g() {
        return this.f6525d;
    }

    /* renamed from: i */
    public C2593m m1413i() {
        return this.f6524c;
    }

    /* renamed from: k */
    public boolean m1411k(C2593m c2593m) {
        return this.f6523b.compare(m1413i(), c2593m) <= 0 && this.f6523b.compare(c2593m, m1415g()) <= 0;
    }
}
