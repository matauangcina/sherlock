package com.google.firebase.database.p124p.p127g0;
/* renamed from: com.google.firebase.database.p.g0.g */
/* loaded from: classes.dex */
public final class C2463g<T, U> {

    /* renamed from: a */
    private final T f6444a;

    /* renamed from: b */
    private final U f6445b;

    public C2463g(T t, U u) {
        this.f6444a = t;
        this.f6445b = u;
    }

    /* renamed from: a */
    public T m1542a() {
        return this.f6444a;
    }

    /* renamed from: b */
    public U m1541b() {
        return this.f6445b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2463g.class != obj.getClass()) {
            return false;
        }
        C2463g c2463g = (C2463g) obj;
        T t = this.f6444a;
        if (t == null ? c2463g.f6444a == null : t.equals(c2463g.f6444a)) {
            U u = this.f6445b;
            U u2 = c2463g.f6445b;
            return u == null ? u2 == null : u.equals(u2);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f6444a;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        U u = this.f6445b;
        return hashCode + (u != null ? u.hashCode() : 0);
    }

    public String toString() {
        return "Pair(" + this.f6444a + "," + this.f6445b + ")";
    }
}
