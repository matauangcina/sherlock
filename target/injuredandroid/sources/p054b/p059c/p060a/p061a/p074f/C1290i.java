package p054b.p059c.p060a.p061a.p074f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: b.c.a.a.f.i */
/* loaded from: classes.dex */
public final class C1290i {

    /* renamed from: a */
    public static final Executor f4059a = new ExecutorC1291a();

    /* renamed from: b */
    static final Executor f4060b = new ExecutorC1305w();

    /* renamed from: b.c.a.a.f.i$a */
    /* loaded from: classes.dex */
    private static final class ExecutorC1291a implements Executor {

        /* renamed from: a */
        private final Handler f4061a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f4061a.post(runnable);
        }
    }
}
