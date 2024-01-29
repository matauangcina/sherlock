package p054b.p059c.p060a.p061a.p074f;
/* renamed from: b.c.a.a.f.t */
/* loaded from: classes.dex */
final class RunnableC1302t implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AbstractC1288g f4084f;

    /* renamed from: g */
    private final /* synthetic */ C1301s f4085g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1302t(C1301s c1301s, AbstractC1288g abstractC1288g) {
        this.f4085g = c1301s;
        this.f4084f = abstractC1288g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1286e interfaceC1286e;
        InterfaceC1286e interfaceC1286e2;
        obj = this.f4085g.f4082b;
        synchronized (obj) {
            interfaceC1286e = this.f4085g.f4083c;
            if (interfaceC1286e != null) {
                interfaceC1286e2 = this.f4085g.f4083c;
                interfaceC1286e2.mo2036c(this.f4084f.mo4580j());
            }
        }
    }
}
