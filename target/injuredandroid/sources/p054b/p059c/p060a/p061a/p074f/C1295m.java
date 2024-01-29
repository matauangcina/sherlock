package p054b.p059c.p060a.p061a.p074f;

import java.util.concurrent.Executor;
/* renamed from: b.c.a.a.f.m */
/* loaded from: classes.dex */
final class C1295m<TResult> implements InterfaceC1303u<TResult> {

    /* renamed from: a */
    private final Executor f4067a;

    /* renamed from: b */
    private final Object f4068b = new Object();

    /* renamed from: c */
    private InterfaceC1283b f4069c;

    public C1295m(Executor executor, InterfaceC1283b interfaceC1283b) {
        this.f4067a = executor;
        this.f4069c = interfaceC1283b;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    /* renamed from: a */
    public final void mo4592a(AbstractC1288g abstractC1288g) {
        if (abstractC1288g.mo4579k()) {
            synchronized (this.f4068b) {
                if (this.f4069c == null) {
                    return;
                }
                this.f4067a.execute(new RunnableC1296n(this));
            }
        }
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    public final void cancel() {
        synchronized (this.f4068b) {
            this.f4069c = null;
        }
    }
}
