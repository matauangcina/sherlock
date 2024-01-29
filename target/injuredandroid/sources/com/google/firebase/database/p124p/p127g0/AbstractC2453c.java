package com.google.firebase.database.p124p.p127g0;

import com.google.firebase.database.C2307c;
import com.google.firebase.database.C2310f;
import com.google.firebase.database.p124p.InterfaceC2532q;
import com.google.firebase.database.p124p.InterfaceC2559x;
import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.firebase.database.p.g0.c */
/* loaded from: classes.dex */
public abstract class AbstractC2453c implements InterfaceC2532q {

    /* renamed from: a */
    private ScheduledThreadPoolExecutor f6432a;

    /* renamed from: com.google.firebase.database.p.g0.c$a */
    /* loaded from: classes.dex */
    class C2454a extends ScheduledThreadPoolExecutor {
        C2454a(int i, ThreadFactory threadFactory) {
            super(i, threadFactory);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                Future future = (Future) runnable;
                try {
                    if (future.isDone()) {
                        future.get();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (CancellationException unused2) {
                } catch (ExecutionException e) {
                    th = e.getCause();
                }
            }
            if (th != null) {
                AbstractC2453c.this.mo1569f(th);
            }
        }
    }

    /* renamed from: com.google.firebase.database.p.g0.c$b */
    /* loaded from: classes.dex */
    private class ThreadFactoryC2455b implements ThreadFactory {

        /* renamed from: com.google.firebase.database.p.g0.c$b$a */
        /* loaded from: classes.dex */
        class C2456a implements Thread.UncaughtExceptionHandler {
            C2456a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                AbstractC2453c.this.mo1569f(th);
            }
        }

        private ThreadFactoryC2455b() {
        }

        /* synthetic */ ThreadFactoryC2455b(AbstractC2453c abstractC2453c, C2454a c2454a) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = AbstractC2453c.this.m1571d().newThread(runnable);
            InterfaceC2559x m1570e = AbstractC2453c.this.m1570e();
            m1570e.mo1202a(newThread, "FirebaseDatabaseWorker");
            m1570e.mo1201b(newThread, true);
            m1570e.mo1200c(newThread, new C2456a());
            return newThread;
        }
    }

    public AbstractC2453c() {
        C2454a c2454a = new C2454a(1, new ThreadFactoryC2455b(this, null));
        this.f6432a = c2454a;
        c2454a.setKeepAliveTime(3L, TimeUnit.SECONDS);
    }

    /* renamed from: g */
    public static String m1568g(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            return "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        }
        if (th instanceof NoClassDefFoundError) {
            return "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        if (th instanceof C2307c) {
            return "";
        }
        return "Uncaught exception in Firebase Database runloop (" + C2310f.m2058e() + "). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2532q
    /* renamed from: a */
    public void mo1297a() {
        this.f6432a.setCorePoolSize(1);
    }

    @Override // com.google.firebase.database.p124p.InterfaceC2532q
    /* renamed from: b */
    public void mo1296b(Runnable runnable) {
        this.f6432a.execute(runnable);
    }

    /* renamed from: c */
    public ScheduledExecutorService m1572c() {
        return this.f6432a;
    }

    /* renamed from: d */
    protected ThreadFactory m1571d() {
        return Executors.defaultThreadFactory();
    }

    /* renamed from: e */
    protected InterfaceC2559x m1570e() {
        return InterfaceC2559x.f6680a;
    }

    /* renamed from: f */
    public abstract void mo1569f(Throwable th);
}
