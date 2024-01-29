package p000a.p008b.p009a.p010a;
/* renamed from: a.b.a.a.a */
/* loaded from: classes.dex */
public class C0043a extends AbstractC0046c {

    /* renamed from: c */
    private static volatile C0043a f145c;

    /* renamed from: a */
    private AbstractC0046c f146a;

    /* renamed from: b */
    private AbstractC0046c f147b;

    private C0043a() {
        C0044b c0044b = new C0044b();
        this.f147b = c0044b;
        this.f146a = c0044b;
    }

    /* renamed from: b */
    public static C0043a m9469b() {
        if (f145c != null) {
            return f145c;
        }
        synchronized (C0043a.class) {
            if (f145c == null) {
                f145c = new C0043a();
            }
        }
        return f145c;
    }

    @Override // p000a.p008b.p009a.p010a.AbstractC0046c
    /* renamed from: a */
    public boolean mo9468a() {
        return this.f146a.mo9468a();
    }
}
