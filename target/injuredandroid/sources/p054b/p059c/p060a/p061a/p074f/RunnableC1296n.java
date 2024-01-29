package p054b.p059c.p060a.p061a.p074f;
/* renamed from: b.c.a.a.f.n */
/* loaded from: classes.dex */
final class RunnableC1296n implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1295m f4070f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1296n(C1295m c1295m) {
        this.f4070f = c1295m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1283b interfaceC1283b;
        InterfaceC1283b interfaceC1283b2;
        obj = this.f4070f.f4068b;
        synchronized (obj) {
            interfaceC1283b = this.f4070f.f4069c;
            if (interfaceC1283b != null) {
                interfaceC1283b2 = this.f4070f.f4069c;
                interfaceC1283b2.mo4603b();
            }
        }
    }
}
