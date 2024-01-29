package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1512e;
import p108c.p109a.p110c.p111a.C1516i;
/* renamed from: io.flutter.embedding.engine.i.g */
/* loaded from: classes.dex */
public class C2880g {

    /* renamed from: a */
    public final C1516i f7118a;

    public C2880g(C2832a c2832a) {
        this.f7118a = new C1516i(c2832a, "flutter/navigation", C1512e.f4546a);
    }

    /* renamed from: a */
    public void m461a() {
        C1499b.m4050d("NavigationChannel", "Sending message to pop route.");
        this.f7118a.m4036c("popRoute", null);
    }

    /* renamed from: b */
    public void m460b(String str) {
        C1499b.m4050d("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f7118a.m4036c("pushRoute", str);
    }

    /* renamed from: c */
    public void m459c(String str) {
        C1499b.m4050d("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f7118a.m4036c("setInitialRoute", str);
    }
}
