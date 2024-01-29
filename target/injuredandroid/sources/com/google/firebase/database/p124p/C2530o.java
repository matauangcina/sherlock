package com.google.firebase.database.p124p;
/* renamed from: com.google.firebase.database.p.o */
/* loaded from: classes.dex */
public final class C2530o {

    /* renamed from: a */
    public String f6605a;

    /* renamed from: b */
    public boolean f6606b;

    /* renamed from: c */
    public String f6607c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2530o.class != obj.getClass()) {
            return false;
        }
        C2530o c2530o = (C2530o) obj;
        if (this.f6606b == c2530o.f6606b && this.f6605a.equals(c2530o.f6605a)) {
            return this.f6607c.equals(c2530o.f6607c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6605a.hashCode() * 31) + (this.f6606b ? 1 : 0)) * 31) + this.f6607c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f6606b ? "s" : "");
        sb.append("://");
        sb.append(this.f6605a);
        return sb.toString();
    }
}
