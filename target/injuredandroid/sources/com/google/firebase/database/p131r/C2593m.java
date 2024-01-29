package com.google.firebase.database.p131r;
/* renamed from: com.google.firebase.database.r.m */
/* loaded from: classes.dex */
public final class C2593m {

    /* renamed from: c */
    private static final C2593m f6743c = new C2593m(C2570b.m1160l(), C2585g.m1115s());

    /* renamed from: d */
    private static final C2593m f6744d = new C2593m(C2570b.m1161i(), InterfaceC2594n.f6747b);

    /* renamed from: a */
    private final C2570b f6745a;

    /* renamed from: b */
    private final InterfaceC2594n f6746b;

    public C2593m(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        this.f6745a = c2570b;
        this.f6746b = interfaceC2594n;
    }

    /* renamed from: a */
    public static C2593m m1091a() {
        return f6744d;
    }

    /* renamed from: b */
    public static C2593m m1090b() {
        return f6743c;
    }

    /* renamed from: c */
    public C2570b m1089c() {
        return this.f6745a;
    }

    /* renamed from: d */
    public InterfaceC2594n m1088d() {
        return this.f6746b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2593m.class != obj.getClass()) {
            return false;
        }
        C2593m c2593m = (C2593m) obj;
        return this.f6745a.equals(c2593m.f6745a) && this.f6746b.equals(c2593m.f6746b);
    }

    public int hashCode() {
        return (this.f6745a.hashCode() * 31) + this.f6746b.hashCode();
    }

    public String toString() {
        return "NamedNode{name=" + this.f6745a + ", node=" + this.f6746b + '}';
    }
}
