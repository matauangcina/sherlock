package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.p.h0.k */
/* loaded from: classes.dex */
public class C2491k {

    /* renamed from: a */
    private final C2475a f6506a;

    /* renamed from: b */
    private final C2475a f6507b;

    public C2491k(C2475a c2475a, C2475a c2475a2) {
        this.f6506a = c2475a;
        this.f6507b = c2475a2;
    }

    /* renamed from: a */
    public InterfaceC2594n m1443a() {
        if (this.f6506a.m1503f()) {
            return this.f6506a.m1507b();
        }
        return null;
    }

    /* renamed from: b */
    public InterfaceC2594n m1442b() {
        if (this.f6507b.m1503f()) {
            return this.f6507b.m1507b();
        }
        return null;
    }

    /* renamed from: c */
    public C2475a m1441c() {
        return this.f6506a;
    }

    /* renamed from: d */
    public C2475a m1440d() {
        return this.f6507b;
    }

    /* renamed from: e */
    public C2491k m1439e(C2587i c2587i, boolean z, boolean z2) {
        return new C2491k(new C2475a(c2587i, z, z2), this.f6507b);
    }

    /* renamed from: f */
    public C2491k m1438f(C2587i c2587i, boolean z, boolean z2) {
        return new C2491k(this.f6506a, new C2475a(c2587i, z, z2));
    }
}
