package com.google.firebase.database.p124p.p127g0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2530o;
/* renamed from: com.google.firebase.database.p.g0.h */
/* loaded from: classes.dex */
public final class C2464h {

    /* renamed from: a */
    public C2530o f6446a;

    /* renamed from: b */
    public C2506l f6447b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2464h.class != obj.getClass()) {
            return false;
        }
        C2464h c2464h = (C2464h) obj;
        if (this.f6446a.equals(c2464h.f6446a)) {
            return this.f6447b.equals(c2464h.f6447b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6446a.hashCode() * 31) + this.f6447b.hashCode();
    }
}
