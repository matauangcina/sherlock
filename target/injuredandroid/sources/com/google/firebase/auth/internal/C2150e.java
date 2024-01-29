package com.google.firebase.auth.internal;

import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p074f.InterfaceC1285d;
import p054b.p059c.p098c.C1424g;
/* renamed from: com.google.firebase.auth.internal.e */
/* loaded from: classes.dex */
final class C2150e implements InterfaceC1285d {

    /* renamed from: a */
    private final /* synthetic */ RunnableC2169n0 f5906a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2150e(RunnableC2169n0 runnableC2169n0) {
        this.f5906a = runnableC2169n0;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1285d
    /* renamed from: d */
    public final void mo2034d(Exception exc) {
        C1155a c1155a;
        if (exc instanceof C1424g) {
            c1155a = C2148d.f5886h;
            c1155a.m4763f("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f5906a.f5928g.m2378b();
        }
    }
}
