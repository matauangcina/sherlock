package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.C2506l;
/* renamed from: com.google.firebase.database.r.p */
/* loaded from: classes.dex */
public final class C2598p extends AbstractC2586h {

    /* renamed from: f */
    private final C2506l f6751f;

    public C2598p(C2506l c2506l) {
        if (c2506l.size() == 1 && c2506l.m1384x().m1158w()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f6751f = c2506l;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: c */
    public String mo1057c() {
        return this.f6751f.m1395B();
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: e */
    public boolean mo1056e(InterfaceC2594n interfaceC2594n) {
        return !interfaceC2594n.mo1086h(this.f6751f).isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2598p.class == obj.getClass() && this.f6751f.equals(((C2598p) obj).f6751f);
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: f */
    public C2593m mo1055f(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return new C2593m(c2570b, C2585g.m1115s().mo1082q(this.f6751f, interfaceC2594n));
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: g */
    public C2593m mo1054g() {
        return new C2593m(C2570b.m1161i(), C2585g.m1115s().mo1082q(this.f6751f, InterfaceC2594n.f6747b));
    }

    public int hashCode() {
        return this.f6751f.hashCode();
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C2593m c2593m, C2593m c2593m2) {
        int compareTo = c2593m.m1088d().mo1086h(this.f6751f).compareTo(c2593m2.m1088d().mo1086h(this.f6751f));
        return compareTo == 0 ? c2593m.m1089c().compareTo(c2593m2.m1089c()) : compareTo;
    }
}
