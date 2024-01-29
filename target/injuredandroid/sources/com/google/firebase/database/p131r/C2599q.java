package com.google.firebase.database.p131r;
/* renamed from: com.google.firebase.database.r.q */
/* loaded from: classes.dex */
public class C2599q extends AbstractC2586h {

    /* renamed from: f */
    private static final C2599q f6752f = new C2599q();

    private C2599q() {
    }

    /* renamed from: j */
    public static C2599q m1070j() {
        return f6752f;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: c */
    public String mo1057c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: e */
    public boolean mo1056e(InterfaceC2594n interfaceC2594n) {
        return !interfaceC2594n.mo1078c().isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C2599q;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: f */
    public C2593m mo1055f(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return new C2593m(c2570b, new C2602t("[PRIORITY-POST]", interfaceC2594n));
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: g */
    public C2593m mo1054g() {
        return mo1055f(C2570b.m1161i(), InterfaceC2594n.f6747b);
    }

    public int hashCode() {
        return 3155577;
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C2593m c2593m, C2593m c2593m2) {
        return C2597o.m1073c(c2593m.m1089c(), c2593m.m1088d().mo1078c(), c2593m2.m1089c(), c2593m2.m1088d().mo1078c());
    }

    public String toString() {
        return "PriorityIndex";
    }
}
