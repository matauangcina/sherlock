package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.p.h0.a */
/* loaded from: classes.dex */
public class C2475a {

    /* renamed from: a */
    private final C2587i f6458a;

    /* renamed from: b */
    private final boolean f6459b;

    /* renamed from: c */
    private final boolean f6460c;

    public C2475a(C2587i c2587i, boolean z, boolean z2) {
        this.f6458a = c2587i;
        this.f6459b = z;
        this.f6460c = z2;
    }

    /* renamed from: a */
    public C2587i m1508a() {
        return this.f6458a;
    }

    /* renamed from: b */
    public InterfaceC2594n m1507b() {
        return this.f6458a.m1104l();
    }

    /* renamed from: c */
    public boolean m1506c(C2570b c2570b) {
        return (m1503f() && !this.f6460c) || this.f6458a.m1104l().mo1076o(c2570b);
    }

    /* renamed from: d */
    public boolean m1505d(C2506l c2506l) {
        return c2506l.isEmpty() ? m1503f() && !this.f6460c : m1506c(c2506l.m1384x());
    }

    /* renamed from: e */
    public boolean m1504e() {
        return this.f6460c;
    }

    /* renamed from: f */
    public boolean m1503f() {
        return this.f6459b;
    }
}
