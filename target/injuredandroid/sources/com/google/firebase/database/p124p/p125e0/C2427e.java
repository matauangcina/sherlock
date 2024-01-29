package com.google.firebase.database.p124p.p125e0;

import com.google.firebase.database.p124p.p128h0.C2485h;
/* renamed from: com.google.firebase.database.p.e0.e */
/* loaded from: classes.dex */
public class C2427e {

    /* renamed from: d */
    public static final C2427e f6376d = new C2427e(EnumC2428a.User, null, false);

    /* renamed from: e */
    public static final C2427e f6377e = new C2427e(EnumC2428a.Server, null, false);

    /* renamed from: a */
    private final EnumC2428a f6378a;

    /* renamed from: b */
    private final C2485h f6379b;

    /* renamed from: c */
    private final boolean f6380c;

    /* renamed from: com.google.firebase.database.p.e0.e$a */
    /* loaded from: classes.dex */
    private enum EnumC2428a {
        User,
        Server
    }

    public C2427e(EnumC2428a enumC2428a, C2485h c2485h, boolean z) {
        this.f6378a = enumC2428a;
        this.f6379b = c2485h;
        this.f6380c = z;
    }

    /* renamed from: a */
    public static C2427e m1699a(C2485h c2485h) {
        return new C2427e(EnumC2428a.Server, c2485h, true);
    }

    /* renamed from: b */
    public C2485h m1698b() {
        return this.f6379b;
    }

    /* renamed from: c */
    public boolean m1697c() {
        return this.f6378a == EnumC2428a.User;
    }

    /* renamed from: d */
    public boolean m1696d() {
        return this.f6380c;
    }

    public String toString() {
        return "OperationSource{source=" + this.f6378a + ", queryParams=" + this.f6379b + ", tagged=" + this.f6380c + '}';
    }
}
