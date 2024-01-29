package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1500a;
import p108c.p109a.p110c.p111a.C1532s;
/* renamed from: io.flutter.embedding.engine.i.d */
/* loaded from: classes.dex */
public class C2875d {

    /* renamed from: a */
    public final C1500a<String> f7112a;

    public C2875d(C2832a c2832a) {
        this.f7112a = new C1500a<>(c2832a, "flutter/lifecycle", C1532s.f4564b);
    }

    /* renamed from: a */
    public void m469a() {
        C1499b.m4050d("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f7112a.m4045c("AppLifecycleState.detached");
    }

    /* renamed from: b */
    public void m468b() {
        C1499b.m4050d("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f7112a.m4045c("AppLifecycleState.inactive");
    }

    /* renamed from: c */
    public void m467c() {
        C1499b.m4050d("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f7112a.m4045c("AppLifecycleState.paused");
    }

    /* renamed from: d */
    public void m466d() {
        C1499b.m4050d("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f7112a.m4045c("AppLifecycleState.resumed");
    }
}
