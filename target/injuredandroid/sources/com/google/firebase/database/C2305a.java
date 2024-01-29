package com.google.firebase.database;

import com.google.firebase.database.p131r.C2587i;
/* renamed from: com.google.firebase.database.a */
/* loaded from: classes.dex */
public class C2305a {

    /* renamed from: a */
    private final C2587i f6110a;

    /* renamed from: b */
    private final C2308d f6111b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2305a(C2308d c2308d, C2587i c2587i) {
        this.f6110a = c2587i;
        this.f6111b = c2308d;
    }

    /* renamed from: a */
    public String m2077a() {
        return this.f6111b.m2065i();
    }

    /* renamed from: b */
    public C2308d m2076b() {
        return this.f6111b;
    }

    /* renamed from: c */
    public Object m2075c() {
        return this.f6110a.m1104l().getValue();
    }

    /* renamed from: d */
    public Object m2074d(boolean z) {
        return this.f6110a.m1104l().mo1081r(z);
    }

    public String toString() {
        return "DataSnapshot { key = " + this.f6111b.m2065i() + ", value = " + this.f6110a.m1104l().mo1081r(true) + " }";
    }
}
