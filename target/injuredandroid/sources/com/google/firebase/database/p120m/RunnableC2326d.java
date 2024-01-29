package com.google.firebase.database.p120m;

import com.google.firebase.database.p124p.InterfaceC2407a;
import p054b.p059c.p098c.p102m.C1437b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.database.m.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2326d implements Runnable {

    /* renamed from: f */
    private final InterfaceC2407a.InterfaceC2409b f6140f;

    /* renamed from: g */
    private final C1437b f6141g;

    private RunnableC2326d(InterfaceC2407a.InterfaceC2409b interfaceC2409b, C1437b c1437b) {
        this.f6140f = interfaceC2409b;
        this.f6141g = c1437b;
    }

    /* renamed from: a */
    public static Runnable m2031a(InterfaceC2407a.InterfaceC2409b interfaceC2409b, C1437b c1437b) {
        return new RunnableC2326d(interfaceC2409b, c1437b);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6140f.mo1320a(this.f6141g.m4169a());
    }
}
