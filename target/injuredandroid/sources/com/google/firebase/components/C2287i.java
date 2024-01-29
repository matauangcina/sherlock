package com.google.firebase.components;

import p054b.p059c.p098c.p101l.InterfaceC1435a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C2287i implements InterfaceC1435a {

    /* renamed from: a */
    private final C2290l f6080a;

    /* renamed from: b */
    private final C2277d f6081b;

    private C2287i(C2290l c2290l, C2277d c2277d) {
        this.f6080a = c2290l;
        this.f6081b = c2277d;
    }

    /* renamed from: a */
    public static InterfaceC1435a m2118a(C2290l c2290l, C2277d c2277d) {
        return new C2287i(c2290l, c2277d);
    }

    @Override // p054b.p059c.p098c.p101l.InterfaceC1435a
    public Object get() {
        Object mo986a;
        mo986a = r1.m2143d().mo986a(new C2303v(this.f6081b, this.f6080a));
        return mo986a;
    }
}
