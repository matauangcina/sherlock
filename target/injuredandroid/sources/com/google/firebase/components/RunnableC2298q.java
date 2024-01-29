package com.google.firebase.components;

import java.util.Map;
import p054b.p059c.p098c.p099j.C1427a;
import p054b.p059c.p098c.p099j.InterfaceC1428b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.q */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2298q implements Runnable {

    /* renamed from: f */
    private final Map.Entry f6097f;

    /* renamed from: g */
    private final C1427a f6098g;

    private RunnableC2298q(Map.Entry entry, C1427a c1427a) {
        this.f6097f = entry;
        this.f6098g = c1427a;
    }

    /* renamed from: a */
    public static Runnable m2090a(Map.Entry entry, C1427a c1427a) {
        return new RunnableC2298q(entry, c1427a);
    }

    @Override // java.lang.Runnable
    public void run() {
        ((InterfaceC1428b) this.f6097f.getKey()).m4176a(this.f6098g);
    }
}
