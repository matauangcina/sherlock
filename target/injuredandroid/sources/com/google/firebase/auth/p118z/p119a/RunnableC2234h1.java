package com.google.firebase.auth.p118z.p119a;
/* renamed from: com.google.firebase.auth.z.a.h1 */
/* loaded from: classes.dex */
final class RunnableC2234h1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ InterfaceC2231g1 f5999f;

    /* renamed from: g */
    private final /* synthetic */ BinderC2216b1 f6000g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2234h1(BinderC2216b1 binderC2216b1, InterfaceC2231g1 interfaceC2231g1) {
        this.f6000g = binderC2216b1;
        this.f5999f = interfaceC2231g1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6000g.f5982a.f6046h) {
            if (!this.f6000g.f5982a.f6046h.isEmpty()) {
                this.f5999f.mo2253a(this.f6000g.f5982a.f6046h.get(0), new Object[0]);
            }
        }
    }
}
