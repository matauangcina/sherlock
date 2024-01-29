package p054b.p059c.p060a.p061a.p074f;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.f.s */
/* loaded from: classes.dex */
public final class C1301s<TResult> implements InterfaceC1303u<TResult> {

    /* renamed from: a */
    private final Executor f4081a;

    /* renamed from: b */
    private final Object f4082b = new Object();

    /* renamed from: c */
    private InterfaceC1286e<? super TResult> f4083c;

    public C1301s(Executor executor, InterfaceC1286e<? super TResult> interfaceC1286e) {
        this.f4081a = executor;
        this.f4083c = interfaceC1286e;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    /* renamed from: a */
    public final void mo4592a(AbstractC1288g<TResult> abstractC1288g) {
        if (abstractC1288g.mo4578l()) {
            synchronized (this.f4082b) {
                if (this.f4083c == null) {
                    return;
                }
                this.f4081a.execute(new RunnableC1302t(this, abstractC1288g));
            }
        }
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    public final void cancel() {
        synchronized (this.f4082b) {
            this.f4083c = null;
        }
    }
}
