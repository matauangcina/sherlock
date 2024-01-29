package com.google.firebase.auth.internal;
/* renamed from: com.google.firebase.auth.internal.i */
/* loaded from: classes.dex */
final class RunnableC2158i implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ FederatedSignInActivity f5913f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2158i(FederatedSignInActivity federatedSignInActivity) {
        this.f5913f = federatedSignInActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5913f.m2384v();
        FederatedSignInActivity.m2385u(null);
    }
}
