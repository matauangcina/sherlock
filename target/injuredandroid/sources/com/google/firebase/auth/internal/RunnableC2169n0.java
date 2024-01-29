package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.C2194p;
import com.google.firebase.auth.FirebaseAuth;
import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p098c.C1415c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.internal.n0 */
/* loaded from: classes.dex */
public final class RunnableC2169n0 implements Runnable {

    /* renamed from: f */
    private final String f5927f;

    /* renamed from: g */
    final /* synthetic */ C2148d f5928g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2169n0(C2148d c2148d, String str) {
        this.f5928g = c2148d;
        C1679r.m3633f(str);
        this.f5927f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1155a c1155a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C1415c.m4198l(this.f5927f));
        if (firebaseAuth.m2423c() != null) {
            AbstractC1288g<C2194p> mo2380b = firebaseAuth.mo2380b(true);
            c1155a = C2148d.f5886h;
            c1155a.m4763f("Token refreshing started", new Object[0]);
            mo2380b.mo4586d(new C2150e(this));
        }
    }
}
