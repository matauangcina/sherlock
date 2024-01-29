package com.google.firebase.components;
/* renamed from: com.google.firebase.components.n */
/* loaded from: classes.dex */
public final class C2295n {

    /* renamed from: a */
    private final Class<?> f6094a;

    /* renamed from: b */
    private final int f6095b;

    /* renamed from: c */
    private final int f6096c;

    private C2295n(Class<?> cls, int i, int i2) {
        C2302u.m2083c(cls, "Null dependency anInterface.");
        this.f6094a = cls;
        this.f6095b = i;
        this.f6096c = i2;
    }

    /* renamed from: e */
    public static C2295n m2094e(Class<?> cls) {
        return new C2295n(cls, 0, 0);
    }

    /* renamed from: f */
    public static C2295n m2093f(Class<?> cls) {
        return new C2295n(cls, 0, 1);
    }

    /* renamed from: g */
    public static C2295n m2092g(Class<?> cls) {
        return new C2295n(cls, 1, 0);
    }

    /* renamed from: h */
    public static C2295n m2091h(Class<?> cls) {
        return new C2295n(cls, 2, 0);
    }

    /* renamed from: a */
    public Class<?> m2098a() {
        return this.f6094a;
    }

    /* renamed from: b */
    public boolean m2097b() {
        return this.f6096c == 0;
    }

    /* renamed from: c */
    public boolean m2096c() {
        return this.f6095b == 1;
    }

    /* renamed from: d */
    public boolean m2095d() {
        return this.f6095b == 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2295n) {
            C2295n c2295n = (C2295n) obj;
            return this.f6094a == c2295n.f6094a && this.f6095b == c2295n.f6095b && this.f6096c == c2295n.f6096c;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f6094a.hashCode() ^ 1000003) * 1000003) ^ this.f6095b) * 1000003) ^ this.f6096c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f6094a);
        sb.append(", type=");
        int i = this.f6095b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        sb.append(this.f6096c == 0);
        sb.append("}");
        return sb.toString();
    }
}
