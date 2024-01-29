package com.google.firebase.components;

import java.util.Set;
import p054b.p059c.p098c.p101l.InterfaceC1435a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C2288j implements InterfaceC1435a {

    /* renamed from: a */
    private final Set f6082a;

    private C2288j(Set set) {
        this.f6082a = set;
    }

    /* renamed from: a */
    public static InterfaceC1435a m2117a(Set set) {
        return new C2288j(set);
    }

    @Override // p054b.p059c.p098c.p101l.InterfaceC1435a
    public Object get() {
        return C2290l.m2113g(this.f6082a);
    }
}
