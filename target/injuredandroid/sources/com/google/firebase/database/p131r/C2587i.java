package com.google.firebase.database.p131r;

import com.google.android.gms.common.internal.C1677q;
import com.google.firebase.database.p121n.C2347e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.google.firebase.database.r.i */
/* loaded from: classes.dex */
public class C2587i implements Iterable<C2593m> {

    /* renamed from: i */
    private static final C2347e<C2593m> f6729i = new C2347e<>(Collections.emptyList(), null);

    /* renamed from: f */
    private final InterfaceC2594n f6730f;

    /* renamed from: g */
    private C2347e<C2593m> f6731g;

    /* renamed from: h */
    private final AbstractC2586h f6732h;

    private C2587i(InterfaceC2594n interfaceC2594n, AbstractC2586h abstractC2586h) {
        this.f6732h = abstractC2586h;
        this.f6730f = interfaceC2594n;
        this.f6731g = null;
    }

    private C2587i(InterfaceC2594n interfaceC2594n, AbstractC2586h abstractC2586h, C2347e<C2593m> c2347e) {
        this.f6732h = abstractC2586h;
        this.f6730f = interfaceC2594n;
        this.f6731g = c2347e;
    }

    /* renamed from: d */
    private void m1109d() {
        if (this.f6731g == null) {
            if (!this.f6732h.equals(C2588j.m1098j())) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (C2593m c2593m : this.f6730f) {
                    z = z || this.f6732h.mo1056e(c2593m.m1088d());
                    arrayList.add(new C2593m(c2593m.m1089c(), c2593m.m1088d()));
                }
                if (z) {
                    this.f6731g = new C2347e<>(arrayList, this.f6732h);
                    return;
                }
            }
            this.f6731g = f6729i;
        }
    }

    /* renamed from: e */
    public static C2587i m1108e(InterfaceC2594n interfaceC2594n) {
        return new C2587i(interfaceC2594n, C2599q.m1070j());
    }

    /* renamed from: f */
    public static C2587i m1107f(InterfaceC2594n interfaceC2594n, AbstractC2586h abstractC2586h) {
        return new C2587i(interfaceC2594n, abstractC2586h);
    }

    /* renamed from: g */
    public C2593m m1106g() {
        if (this.f6730f instanceof C2573c) {
            m1109d();
            if (C1677q.m3642a(this.f6731g, f6729i)) {
                C2570b m1152i = ((C2573c) this.f6730f).m1152i();
                return new C2593m(m1152i, this.f6730f.mo1079b(m1152i));
            }
            return this.f6731g.m1975e();
        }
        return null;
    }

    /* renamed from: i */
    public C2593m m1105i() {
        if (this.f6730f instanceof C2573c) {
            m1109d();
            if (C1677q.m3642a(this.f6731g, f6729i)) {
                C2570b m1151l = ((C2573c) this.f6730f).m1151l();
                return new C2593m(m1151l, this.f6730f.mo1079b(m1151l));
            }
            return this.f6731g.m1976d();
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<C2593m> iterator() {
        m1109d();
        return C1677q.m3642a(this.f6731g, f6729i) ? this.f6730f.iterator() : this.f6731g.iterator();
    }

    /* renamed from: l */
    public InterfaceC2594n m1104l() {
        return this.f6730f;
    }

    /* renamed from: m */
    public C2570b m1103m(C2570b c2570b, InterfaceC2594n interfaceC2594n, AbstractC2586h abstractC2586h) {
        if (this.f6732h.equals(C2588j.m1098j()) || this.f6732h.equals(abstractC2586h)) {
            m1109d();
            if (C1677q.m3642a(this.f6731g, f6729i)) {
                return this.f6730f.mo1084n(c2570b);
            }
            C2593m m1974f = this.f6731g.m1974f(new C2593m(c2570b, interfaceC2594n));
            if (m1974f != null) {
                return m1974f.m1089c();
            }
            return null;
        }
        throw new IllegalArgumentException("Index not available in IndexedNode!");
    }

    /* renamed from: s */
    public C2587i m1102s(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        InterfaceC2594n mo1083p = this.f6730f.mo1083p(c2570b, interfaceC2594n);
        if (!C1677q.m3642a(this.f6731g, f6729i) || this.f6732h.mo1056e(interfaceC2594n)) {
            C2347e<C2593m> c2347e = this.f6731g;
            if (c2347e == null || C1677q.m3642a(c2347e, f6729i)) {
                return new C2587i(mo1083p, this.f6732h, null);
            }
            C2347e<C2593m> m1972i = this.f6731g.m1972i(new C2593m(c2570b, this.f6730f.mo1079b(c2570b)));
            if (!interfaceC2594n.isEmpty()) {
                m1972i = m1972i.m1973g(new C2593m(c2570b, interfaceC2594n));
            }
            return new C2587i(mo1083p, this.f6732h, m1972i);
        }
        return new C2587i(mo1083p, this.f6732h, f6729i);
    }

    /* renamed from: t */
    public Iterator<C2593m> m1101t() {
        m1109d();
        return C1677q.m3642a(this.f6731g, f6729i) ? this.f6730f.mo1080t() : this.f6731g.m1971t();
    }

    /* renamed from: u */
    public C2587i m1100u(InterfaceC2594n interfaceC2594n) {
        return new C2587i(this.f6730f.mo1061j(interfaceC2594n), this.f6732h, this.f6731g);
    }
}
