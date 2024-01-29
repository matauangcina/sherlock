package com.google.firebase.database.p131r;
/* renamed from: com.google.firebase.database.r.j */
/* loaded from: classes.dex */
public class C2588j extends AbstractC2586h {

    /* renamed from: f */
    private static final C2588j f6733f = new C2588j();

    private C2588j() {
    }

    /* renamed from: j */
    public static C2588j m1098j() {
        return f6733f;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: c */
    public String mo1057c() {
        return ".key";
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: e */
    public boolean mo1056e(InterfaceC2594n interfaceC2594n) {
        return true;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        return obj instanceof C2588j;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: f */
    public C2593m mo1055f(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return new C2593m(C2570b.m1162g((String) interfaceC2594n.getValue()), C2585g.m1115s());
    }

    @Override // com.google.firebase.database.p131r.AbstractC2586h
    /* renamed from: g */
    public C2593m mo1054g() {
        return C2593m.m1091a();
    }

    public int hashCode() {
        return 37;
    }

    @Override // java.util.Comparator
    /* renamed from: i */
    public int compare(C2593m c2593m, C2593m c2593m2) {
        return c2593m.m1089c().compareTo(c2593m2.m1089c());
    }

    public String toString() {
        return "KeyIndex";
    }
}
