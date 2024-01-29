package com.google.android.gms.common.api.internal;

import p054b.p059c.p060a.p061a.p072e.p073b.C1277l;
/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* loaded from: classes.dex */
final class RunnableC1585e0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1277l f4687f;

    /* renamed from: g */
    private final /* synthetic */ BinderC1578c0 f4688g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1585e0(BinderC1578c0 binderC1578c0, C1277l c1277l) {
        this.f4688g = binderC1578c0;
        this.f4687f = c1277l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4688g.m3898d0(this.f4687f);
    }
}
