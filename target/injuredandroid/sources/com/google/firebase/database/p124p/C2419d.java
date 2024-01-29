package com.google.firebase.database.p124p;

import com.google.firebase.database.p122o.InterfaceC2368c;
import com.google.firebase.database.p124p.C2449g;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.database.p.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C2419d implements InterfaceC2368c {

    /* renamed from: a */
    private final InterfaceC2407a f6359a;

    /* renamed from: b */
    private final ScheduledExecutorService f6360b;

    private C2419d(InterfaceC2407a interfaceC2407a, ScheduledExecutorService scheduledExecutorService) {
        this.f6359a = interfaceC2407a;
        this.f6360b = scheduledExecutorService;
    }

    /* renamed from: b */
    public static InterfaceC2368c m1711b(InterfaceC2407a interfaceC2407a, ScheduledExecutorService scheduledExecutorService) {
        return new C2419d(interfaceC2407a, scheduledExecutorService);
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2368c
    /* renamed from: a */
    public void mo1712a(boolean z, InterfaceC2368c.InterfaceC2369a interfaceC2369a) {
        this.f6359a.mo1757a(z, new C2449g.C2450a(this.f6360b, interfaceC2369a));
    }
}
