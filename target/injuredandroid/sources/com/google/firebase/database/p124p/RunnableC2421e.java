package com.google.firebase.database.p124p;

import com.google.firebase.database.p122o.InterfaceC2368c;
/* renamed from: com.google.firebase.database.p.e */
/* loaded from: classes.dex */
final /* synthetic */ class RunnableC2421e implements Runnable {

    /* renamed from: f */
    private final InterfaceC2368c.InterfaceC2369a f6363f;

    /* renamed from: g */
    private final String f6364g;

    private RunnableC2421e(InterfaceC2368c.InterfaceC2369a interfaceC2369a, String str) {
        this.f6363f = interfaceC2369a;
        this.f6364g = str;
    }

    /* renamed from: a */
    public static Runnable m1706a(InterfaceC2368c.InterfaceC2369a interfaceC2369a, String str) {
        return new RunnableC2421e(interfaceC2369a, str);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6363f.mo1825a(this.f6364g);
    }
}
