package p054b.p059c.p060a.p061a.p074f;
/* renamed from: b.c.a.a.f.p */
/* loaded from: classes.dex */
final class RunnableC1298p implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AbstractC1288g f4074f;

    /* renamed from: g */
    private final /* synthetic */ C1297o f4075g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1298p(C1297o c1297o, AbstractC1288g abstractC1288g) {
        this.f4075g = c1297o;
        this.f4074f = abstractC1288g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC1284c interfaceC1284c;
        InterfaceC1284c interfaceC1284c2;
        obj = this.f4075g.f4072b;
        synchronized (obj) {
            interfaceC1284c = this.f4075g.f4073c;
            if (interfaceC1284c != null) {
                interfaceC1284c2 = this.f4075g.f4073c;
                interfaceC1284c2.mo3802a(this.f4074f);
            }
        }
    }
}
