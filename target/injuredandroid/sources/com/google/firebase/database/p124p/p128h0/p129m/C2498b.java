package com.google.firebase.database.p124p.p128h0.p129m;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p128h0.C2477c;
import com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d;
import com.google.firebase.database.p131r.AbstractC2586h;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.p.h0.m.b */
/* loaded from: classes.dex */
public class C2498b implements InterfaceC2500d {

    /* renamed from: a */
    private final AbstractC2586h f6517a;

    public C2498b(AbstractC2586h abstractC2586h) {
        this.f6517a = abstractC2586h;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: a */
    public InterfaceC2500d mo1421a() {
        return this;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: b */
    public C2587i mo1420b(C2587i c2587i, InterfaceC2594n interfaceC2594n) {
        return c2587i.m1104l().isEmpty() ? c2587i : c2587i.m1100u(interfaceC2594n);
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: c */
    public boolean mo1419c() {
        return false;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: d */
    public AbstractC2586h mo1418d() {
        return this.f6517a;
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: e */
    public C2587i mo1417e(C2587i c2587i, C2570b c2570b, InterfaceC2594n interfaceC2594n, C2506l c2506l, InterfaceC2500d.InterfaceC2501a interfaceC2501a, C2497a c2497a) {
        C2477c m1499c;
        InterfaceC2594n m1104l = c2587i.m1104l();
        InterfaceC2594n mo1079b = m1104l.mo1079b(c2570b);
        if (mo1079b.mo1086h(c2506l).equals(interfaceC2594n.mo1086h(c2506l)) && mo1079b.isEmpty() == interfaceC2594n.isEmpty()) {
            return c2587i;
        }
        if (c2497a != null) {
            if (!interfaceC2594n.isEmpty()) {
                m1499c = mo1079b.isEmpty() ? C2477c.m1499c(c2570b, interfaceC2594n) : C2477c.m1497e(c2570b, interfaceC2594n, mo1079b);
            } else if (m1104l.mo1076o(c2570b)) {
                m1499c = C2477c.m1494h(c2570b, mo1079b);
            }
            c2497a.m1425b(m1499c);
        }
        return (m1104l.mo1085k() && interfaceC2594n.isEmpty()) ? c2587i : c2587i.m1102s(c2570b, interfaceC2594n);
    }

    @Override // com.google.firebase.database.p124p.p128h0.p129m.InterfaceC2500d
    /* renamed from: f */
    public C2587i mo1416f(C2587i c2587i, C2587i c2587i2, C2497a c2497a) {
        C2477c m1499c;
        if (c2497a != null) {
            for (C2593m c2593m : c2587i.m1104l()) {
                if (!c2587i2.m1104l().mo1076o(c2593m.m1089c())) {
                    c2497a.m1425b(C2477c.m1494h(c2593m.m1089c(), c2593m.m1088d()));
                }
            }
            if (!c2587i2.m1104l().mo1085k()) {
                for (C2593m c2593m2 : c2587i2.m1104l()) {
                    if (c2587i.m1104l().mo1076o(c2593m2.m1089c())) {
                        InterfaceC2594n mo1079b = c2587i.m1104l().mo1079b(c2593m2.m1089c());
                        if (!mo1079b.equals(c2593m2.m1088d())) {
                            m1499c = C2477c.m1497e(c2593m2.m1089c(), c2593m2.m1088d(), mo1079b);
                        }
                    } else {
                        m1499c = C2477c.m1499c(c2593m2.m1089c(), c2593m2.m1088d());
                    }
                    c2497a.m1425b(m1499c);
                }
            }
        }
        return c2587i2;
    }
}
