package p054b.p059c.p060a.p061a.p074f;
/* renamed from: b.c.a.a.f.r */
/* loaded from: classes.dex */
final class RunnableC1300r implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AbstractC1288g f4079f;

    /* renamed from: g */
    private final /* synthetic */ C1299q f4080g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1300r(C1299q c1299q, AbstractC1288g abstractC1288g) {
        this.f4080g = c1299q;
        this.f4079f = abstractC1288g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1285d interfaceC1285d;
        InterfaceC1285d interfaceC1285d2;
        obj = this.f4080g.f4077b;
        synchronized (obj) {
            interfaceC1285d = this.f4080g.f4078c;
            if (interfaceC1285d != null) {
                interfaceC1285d2 = this.f4080g.f4078c;
                interfaceC1285d2.mo2034d(this.f4079f.mo4581i());
            }
        }
    }
}
