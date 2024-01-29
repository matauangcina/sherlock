package com.google.firebase.database.p120m;

import com.google.firebase.database.p124p.InterfaceC2407a;
/* renamed from: com.google.firebase.database.m.f */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC2330f implements Runnable {

    /* renamed from: f */
    private final InterfaceC2407a.InterfaceC2409b f6143f;

    private RunnableC2330f(InterfaceC2407a.InterfaceC2409b interfaceC2409b) {
        this.f6143f = interfaceC2409b;
    }

    /* renamed from: a */
    public static Runnable m2021a(InterfaceC2407a.InterfaceC2409b interfaceC2409b) {
        return new RunnableC2330f(interfaceC2409b);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6143f.mo1320a(null);
    }
}
