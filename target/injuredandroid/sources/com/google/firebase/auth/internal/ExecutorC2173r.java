package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p054b.p059c.p060a.p061a.p068d.p071c.HandlerC1206g2;
/* renamed from: com.google.firebase.auth.internal.r */
/* loaded from: classes.dex */
public final class ExecutorC2173r implements Executor {

    /* renamed from: b */
    private static ExecutorC2173r f5936b = new ExecutorC2173r();

    /* renamed from: a */
    private Handler f5937a = new HandlerC1206g2(Looper.getMainLooper());

    private ExecutorC2173r() {
    }

    /* renamed from: a */
    public static ExecutorC2173r m2325a() {
        return f5936b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5937a.post(runnable);
    }
}
