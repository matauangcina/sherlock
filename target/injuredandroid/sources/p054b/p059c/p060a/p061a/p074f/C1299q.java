package p054b.p059c.p060a.p061a.p074f;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.f.q */
/* loaded from: classes.dex */
public final class C1299q<TResult> implements InterfaceC1303u<TResult> {

    /* renamed from: a */
    private final Executor f4076a;

    /* renamed from: b */
    private final Object f4077b = new Object();

    /* renamed from: c */
    private InterfaceC1285d f4078c;

    public C1299q(Executor executor, InterfaceC1285d interfaceC1285d) {
        this.f4076a = executor;
        this.f4078c = interfaceC1285d;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    /* renamed from: a */
    public final void mo4592a(AbstractC1288g<TResult> abstractC1288g) {
        if (abstractC1288g.mo4578l() || abstractC1288g.mo4579k()) {
            return;
        }
        synchronized (this.f4077b) {
            if (this.f4078c == null) {
                return;
            }
            this.f4076a.execute(new RunnableC1300r(this, abstractC1288g));
        }
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    public final void cancel() {
        synchronized (this.f4077b) {
            this.f4078c = null;
        }
    }
}
