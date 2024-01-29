package p054b.p059c.p060a.p061a.p074f;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.f.o */
/* loaded from: classes.dex */
public final class C1297o<TResult> implements InterfaceC1303u<TResult> {

    /* renamed from: a */
    private final Executor f4071a;

    /* renamed from: b */
    private final Object f4072b = new Object();

    /* renamed from: c */
    private InterfaceC1284c<TResult> f4073c;

    public C1297o(Executor executor, InterfaceC1284c<TResult> interfaceC1284c) {
        this.f4071a = executor;
        this.f4073c = interfaceC1284c;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    /* renamed from: a */
    public final void mo4592a(AbstractC1288g<TResult> abstractC1288g) {
        synchronized (this.f4072b) {
            if (this.f4073c == null) {
                return;
            }
            this.f4071a.execute(new RunnableC1298p(this, abstractC1288g));
        }
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    public final void cancel() {
        synchronized (this.f4072b) {
            this.f4073c = null;
        }
    }
}
