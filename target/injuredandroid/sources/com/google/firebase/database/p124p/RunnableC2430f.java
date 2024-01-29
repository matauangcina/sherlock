package com.google.firebase.database.p124p;

import com.google.firebase.database.p122o.InterfaceC2368c;
/* renamed from: com.google.firebase.database.p.f */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC2430f implements Runnable {

    /* renamed from: f */
    private final InterfaceC2368c.InterfaceC2369a f6385f;

    /* renamed from: g */
    private final String f6386g;

    private RunnableC2430f(InterfaceC2368c.InterfaceC2369a interfaceC2369a, String str) {
        this.f6385f = interfaceC2369a;
        this.f6386g = str;
    }

    /* renamed from: a */
    public static Runnable m1693a(InterfaceC2368c.InterfaceC2369a interfaceC2369a, String str) {
        return new RunnableC2430f(interfaceC2369a, str);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6385f.mo1824b(this.f6386g);
    }
}
