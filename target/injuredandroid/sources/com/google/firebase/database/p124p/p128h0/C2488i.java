package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p131r.AbstractC2586h;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.h0.i */
/* loaded from: classes.dex */
public final class C2488i {

    /* renamed from: a */
    private final C2506l f6497a;

    /* renamed from: b */
    private final C2485h f6498b;

    public C2488i(C2506l c2506l, C2485h c2485h) {
        this.f6497a = c2506l;
        this.f6498b = c2485h;
    }

    /* renamed from: a */
    public static C2488i m1460a(C2506l c2506l) {
        return new C2488i(c2506l, C2485h.f6484i);
    }

    /* renamed from: b */
    public static C2488i m1459b(C2506l c2506l, Map<String, Object> map) {
        return new C2488i(c2506l, C2485h.m1477a(map));
    }

    /* renamed from: c */
    public AbstractC2586h m1458c() {
        return this.f6498b.m1476b();
    }

    /* renamed from: d */
    public C2485h m1457d() {
        return this.f6498b;
    }

    /* renamed from: e */
    public C2506l m1456e() {
        return this.f6497a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2488i.class != obj.getClass()) {
            return false;
        }
        C2488i c2488i = (C2488i) obj;
        return this.f6497a.equals(c2488i.f6497a) && this.f6498b.equals(c2488i.f6498b);
    }

    /* renamed from: f */
    public boolean m1455f() {
        return this.f6498b.m1465m();
    }

    /* renamed from: g */
    public boolean m1454g() {
        return this.f6498b.m1463o();
    }

    public int hashCode() {
        return (this.f6497a.hashCode() * 31) + this.f6498b.hashCode();
    }

    public String toString() {
        return this.f6497a + ":" + this.f6498b;
    }
}
