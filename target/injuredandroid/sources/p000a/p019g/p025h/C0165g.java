package p000a.p019g.p025h;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000a.p019g.p027j.InterfaceC0186a;
/* renamed from: a.g.h.g */
/* loaded from: classes.dex */
class C0165g {

    /* renamed from: a.g.h.g$a */
    /* loaded from: classes.dex */
    private static class ThreadFactoryC0166a implements ThreadFactory {

        /* renamed from: a */
        private String f591a;

        /* renamed from: b */
        private int f592b;

        /* renamed from: a.g.h.g$a$a */
        /* loaded from: classes.dex */
        private static class C0167a extends Thread {

            /* renamed from: f */
            private final int f593f;

            C0167a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f593f = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f593f);
                super.run();
            }
        }

        ThreadFactoryC0166a(String str, int i) {
            this.f591a = str;
            this.f592b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0167a(runnable, this.f591a, this.f592b);
        }
    }

    /* renamed from: a.g.h.g$b */
    /* loaded from: classes.dex */
    private static class RunnableC0168b<T> implements Runnable {

        /* renamed from: f */
        private Callable<T> f594f;

        /* renamed from: g */
        private InterfaceC0186a<T> f595g;

        /* renamed from: h */
        private Handler f596h;

        /* renamed from: a.g.h.g$b$a */
        /* loaded from: classes.dex */
        class RunnableC0169a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ InterfaceC0186a f597f;

            /* renamed from: g */
            final /* synthetic */ Object f598g;

            RunnableC0169a(RunnableC0168b runnableC0168b, InterfaceC0186a interfaceC0186a, Object obj) {
                this.f597f = interfaceC0186a;
                this.f598g = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f597f.mo8876a(this.f598g);
            }
        }

        RunnableC0168b(Handler handler, Callable<T> callable, InterfaceC0186a<T> interfaceC0186a) {
            this.f594f = callable;
            this.f595g = interfaceC0186a;
            this.f596h = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f594f.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f596h.post(new RunnableC0169a(this, this.f595g, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m8922a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0166a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> void m8921b(Executor executor, Callable<T> callable, InterfaceC0186a<T> interfaceC0186a) {
        executor.execute(new RunnableC0168b(C0151b.m8959a(), callable, interfaceC0186a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> T m8920c(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
