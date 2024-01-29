package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: b.c.a.a.d.c.e2 */
/* loaded from: classes.dex */
final class C1198e2 implements InterfaceC1190c2 {
    private C1198e2() {
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.InterfaceC1190c2
    /* renamed from: a */
    public final ExecutorService mo4722a(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
