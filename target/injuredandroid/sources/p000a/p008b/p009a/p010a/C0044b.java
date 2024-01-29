package p000a.p008b.p009a.p010a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: a.b.a.a.b */
/* loaded from: classes.dex */
public class C0044b extends AbstractC0046c {

    /* renamed from: a */
    private final Object f148a = new Object();

    /* renamed from: b */
    private final ExecutorService f149b = Executors.newFixedThreadPool(4, new ThreadFactoryC0045a(this));

    /* renamed from: a.b.a.a.b$a */
    /* loaded from: classes.dex */
    class ThreadFactoryC0045a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f150a = new AtomicInteger(0);

        ThreadFactoryC0045a(C0044b c0044b) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f150a.getAndIncrement())));
            return thread;
        }
    }

    @Override // p000a.p008b.p009a.p010a.AbstractC0046c
    /* renamed from: a */
    public boolean mo9468a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
