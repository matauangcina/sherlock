package com.google.firebase.database.p131r;
/* renamed from: com.google.firebase.database.r.u */
/* loaded from: classes.dex */
public class C2604u extends AbstractC2586h {

    /* renamed from: f */
    private static final C2604u f6758f = new C2604u();

    private C2604u() {
    }

    /* renamed from: j */
    public static C2604u m1052j() {
        return f6758f;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: c */
    public String mo1057c() {
        return ".value";
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: e */
    public boolean mo1056e(InterfaceC2594n interfaceC2594n) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C2604u;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: f */
    public C2593m mo1055f(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return new C2593m(c2570b, interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: g */
    public C2593m mo1054g() {
        return new C2593m(C2570b.m1161i(), InterfaceC2594n.f6747b);
    }

    public int hashCode() {
        return 4;
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C2593m c2593m, C2593m c2593m2) {
        int compareTo = c2593m.m1088d().compareTo(c2593m2.m1088d());
        return compareTo == 0 ? c2593m.m1089c().compareTo(c2593m2.m1089c()) : compareTo;
    }

    public String toString() {
        return "ValueIndex";
    }
}
