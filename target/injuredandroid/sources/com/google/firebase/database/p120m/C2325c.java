package com.google.firebase.database.p120m;

import com.google.firebase.auth.internal.InterfaceC2142a;
import com.google.firebase.database.p124p.InterfaceC2407a;
import java.util.concurrent.ExecutorService;
import p054b.p059c.p098c.p102m.C1437b;
/* renamed from: com.google.firebase.database.m.c */
/* loaded from: classes.dex */
final /* synthetic */ class C2325c implements InterfaceC2142a {

    /* renamed from: a */
    private final ExecutorService f6138a;

    /* renamed from: b */
    private final InterfaceC2407a.InterfaceC2409b f6139b;

    private C2325c(ExecutorService executorService, InterfaceC2407a.InterfaceC2409b interfaceC2409b) {
        this.f6138a = executorService;
        this.f6139b = interfaceC2409b;
    }

    /* renamed from: b */
    public static InterfaceC2142a m2032b(ExecutorService executorService, InterfaceC2407a.InterfaceC2409b interfaceC2409b) {
        return new C2325c(executorService, interfaceC2409b);
    }

    @Override // com.google.firebase.auth.internal.InterfaceC2142a
    /* renamed from: a */
    public void mo2033a(C1437b c1437b) {
        this.f6138a.execute(RunnableC2326d.m2031a(this.f6139b, c1437b));
    }
}
