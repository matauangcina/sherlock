package p054b.p059c.p060a.p061a.p074f;
/* renamed from: b.c.a.a.f.l */
/* loaded from: classes.dex */
final class RunnableC1294l implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AbstractC1288g f4065f;

    /* renamed from: g */
    private final /* synthetic */ C1293k f4066g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1294l(C1293k c1293k, AbstractC1288g abstractC1288g) {
        this.f4066g = c1293k;
        this.f4065f = abstractC1288g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1306x c1306x;
        C1306x c1306x2;
        C1306x c1306x3;
        InterfaceC1282a interfaceC1282a;
        try {
            interfaceC1282a = this.f4066g.f4063b;
            AbstractC1288g abstractC1288g = (AbstractC1288g) interfaceC1282a.mo2252a(this.f4065f);
            if (abstractC1288g == null) {
                this.f4066g.mo2034d(new NullPointerException("Continuation returned null"));
                return;
            }
            abstractC1288g.mo4583g(C1290i.f4060b, this.f4066g);
            abstractC1288g.mo4585e(C1290i.f4060b, this.f4066g);
            abstractC1288g.mo4589a(C1290i.f4060b, this.f4066g);
        } catch (C1287f e) {
            if (e.getCause() instanceof Exception) {
                c1306x3 = this.f4066g.f4064c;
                c1306x3.m4575o((Exception) e.getCause());
                return;
            }
            c1306x2 = this.f4066g.f4064c;
            c1306x2.m4575o(e);
        } catch (Exception e2) {
            c1306x = this.f4066g.f4064c;
            c1306x.m4575o(e2);
        }
    }
}
