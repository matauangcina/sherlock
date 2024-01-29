package p054b.p059c.p060a.p075b.p091x;

import android.graphics.Typeface;
/* renamed from: b.c.a.b.x.a */
/* loaded from: classes.dex */
public final class C1385a extends AbstractC1393f {

    /* renamed from: a */
    private final Typeface f4291a;

    /* renamed from: b */
    private final InterfaceC1386a f4292b;

    /* renamed from: c */
    private boolean f4293c;

    /* renamed from: b.c.a.b.x.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1386a {
        /* renamed from: a */
        void mo2749a(Typeface typeface);
    }

    public C1385a(InterfaceC1386a interfaceC1386a, Typeface typeface) {
        this.f4291a = typeface;
        this.f4292b = interfaceC1386a;
    }

    /* renamed from: d */
    private void m4267d(Typeface typeface) {
        if (this.f4293c) {
            return;
        }
        this.f4292b.mo2749a(typeface);
    }

    @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
    /* renamed from: a */
    public void mo2727a(int i) {
        m4267d(this.f4291a);
    }

    @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
    /* renamed from: b */
    public void mo2726b(Typeface typeface, boolean z) {
        m4267d(typeface);
    }

    /* renamed from: c */
    public void m4268c() {
        this.f4293c = true;
    }
}
