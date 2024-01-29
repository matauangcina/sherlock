package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.p0 */
/* loaded from: classes.dex */
public final class RunnableC2195p0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ FirebaseAuth f5959f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2195p0(FirebaseAuth firebaseAuth) {
        this.f5959f = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<FirebaseAuth.InterfaceC2120a> list;
        list = this.f5959f.f5849d;
        for (FirebaseAuth.InterfaceC2120a interfaceC2120a : list) {
            interfaceC2120a.m2403a(this.f5959f);
        }
    }
}
