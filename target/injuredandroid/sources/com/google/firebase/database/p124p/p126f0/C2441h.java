package com.google.firebase.database.p124p.p126f0;

import com.google.firebase.database.p124p.p128h0.C2488i;
/* renamed from: com.google.firebase.database.p.f0.h */
/* loaded from: classes.dex */
public final class C2441h {

    /* renamed from: a */
    public final long f6400a;

    /* renamed from: b */
    public final C2488i f6401b;

    /* renamed from: c */
    public final long f6402c;

    /* renamed from: d */
    public final boolean f6403d;

    /* renamed from: e */
    public final boolean f6404e;

    public C2441h(long j, C2488i c2488i, long j2, boolean z, boolean z2) {
        this.f6400a = j;
        if (c2488i.m1454g() && !c2488i.m1455f()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f6401b = c2488i;
        this.f6402c = j2;
        this.f6403d = z;
        this.f6404e = z2;
    }

    /* renamed from: a */
    public C2441h m1640a(boolean z) {
        return new C2441h(this.f6400a, this.f6401b, this.f6402c, this.f6403d, z);
    }

    /* renamed from: b */
    public C2441h m1639b() {
        return new C2441h(this.f6400a, this.f6401b, this.f6402c, true, this.f6404e);
    }

    /* renamed from: c */
    public C2441h m1638c(long j) {
        return new C2441h(this.f6400a, this.f6401b, j, this.f6403d, this.f6404e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C2441h.class) {
            return false;
        }
        C2441h c2441h = (C2441h) obj;
        return this.f6400a == c2441h.f6400a && this.f6401b.equals(c2441h.f6401b) && this.f6402c == c2441h.f6402c && this.f6403d == c2441h.f6403d && this.f6404e == c2441h.f6404e;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.f6400a).hashCode() * 31) + this.f6401b.hashCode()) * 31) + Long.valueOf(this.f6402c).hashCode()) * 31) + Boolean.valueOf(this.f6403d).hashCode()) * 31) + Boolean.valueOf(this.f6404e).hashCode();
    }

    public String toString() {
        return "TrackedQuery{id=" + this.f6400a + ", querySpec=" + this.f6401b + ", lastUse=" + this.f6402c + ", complete=" + this.f6403d + ", active=" + this.f6404e + "}";
    }
}
