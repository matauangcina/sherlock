package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
/* renamed from: com.google.firebase.auth.internal.h */
/* loaded from: classes.dex */
public final class C2156h {

    /* renamed from: b */
    private static final C2156h f5911b = new C2156h();

    /* renamed from: a */
    private final C2168n f5912a;

    private C2156h() {
        this(C2168n.m2345a(), C2152f.m2362a());
    }

    private C2156h(C2168n c2168n, C2152f c2152f) {
        this.f5912a = c2168n;
    }

    /* renamed from: a */
    public static C2156h m2361a() {
        return f5911b;
    }

    /* renamed from: b */
    public final void m2360b(Context context) {
        this.f5912a.m2344b(context);
    }

    /* renamed from: c */
    public final void m2359c(FirebaseAuth firebaseAuth) {
        this.f5912a.m2340f(firebaseAuth);
    }
}
