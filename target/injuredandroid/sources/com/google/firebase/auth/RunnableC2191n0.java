package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.InterfaceC2142a;
import java.util.List;
import p054b.p059c.p098c.p102m.C1437b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.n0 */
/* loaded from: classes.dex */
public final class RunnableC2191n0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1437b f5954f;

    /* renamed from: g */
    private final /* synthetic */ FirebaseAuth f5955g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2191n0(FirebaseAuth firebaseAuth, C1437b c1437b) {
        this.f5955g = firebaseAuth;
        this.f5954f = c1437b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<InterfaceC2142a> list;
        List<FirebaseAuth.InterfaceC2121b> list2;
        list = this.f5955g.f5848c;
        for (InterfaceC2142a interfaceC2142a : list) {
            interfaceC2142a.mo2033a(this.f5954f);
        }
        list2 = this.f5955g.f5847b;
        for (FirebaseAuth.InterfaceC2121b interfaceC2121b : list2) {
            interfaceC2121b.m2402a(this.f5955g);
        }
    }
}
