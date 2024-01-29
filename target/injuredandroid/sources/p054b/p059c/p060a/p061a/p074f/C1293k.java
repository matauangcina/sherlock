package p054b.p059c.p060a.p061a.p074f;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.f.k */
/* loaded from: classes.dex */
public final class C1293k<TResult, TContinuationResult> implements InterfaceC1283b, InterfaceC1285d, InterfaceC1286e<TContinuationResult>, InterfaceC1303u<TResult> {

    /* renamed from: a */
    private final Executor f4062a;

    /* renamed from: b */
    private final InterfaceC1282a<TResult, AbstractC1288g<TContinuationResult>> f4063b;

    /* renamed from: c */
    private final C1306x<TContinuationResult> f4064c;

    public C1293k(Executor executor, InterfaceC1282a<TResult, AbstractC1288g<TContinuationResult>> interfaceC1282a, C1306x<TContinuationResult> c1306x) {
        this.f4062a = executor;
        this.f4063b = interfaceC1282a;
        this.f4064c = c1306x;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    /* renamed from: a */
    public final void mo4592a(AbstractC1288g<TResult> abstractC1288g) {
        this.f4062a.execute(new RunnableC1294l(this, abstractC1288g));
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1283b
    /* renamed from: b */
    public final void mo4603b() {
        this.f4064c.m4571s();
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1286e
    /* renamed from: c */
    public final void mo2036c(TContinuationResult tcontinuationresult) {
        this.f4064c.m4574p(tcontinuationresult);
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1303u
    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1285d
    /* renamed from: d */
    public final void mo2034d(Exception exc) {
        this.f4064c.m4575o(exc);
    }
}
