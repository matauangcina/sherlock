package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.InterfaceC2146c;
import com.google.firebase.auth.internal.InterfaceC2154g;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.o0 */
/* loaded from: classes.dex */
public final class C2193o0 implements InterfaceC2146c, InterfaceC2154g {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAuth f5956a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2193o0(FirebaseAuth firebaseAuth) {
        this.f5956a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.InterfaceC2146c
    /* renamed from: a */
    public final void mo2288a(C1237q1 c1237q1, AbstractC2190n abstractC2190n) {
        this.f5956a.m2415k(abstractC2190n, c1237q1, true, true);
    }

    @Override // com.google.firebase.auth.internal.InterfaceC2154g
    /* renamed from: e */
    public final void mo2287e(Status status) {
        int m3969b = status.m3969b();
        if (m3969b == 17011 || m3969b == 17021 || m3969b == 17005) {
            this.f5956a.m2420f();
        }
    }
}
