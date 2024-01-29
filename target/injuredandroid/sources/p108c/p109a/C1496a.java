package p108c.p109a;

import io.flutter.embedding.engine.p150f.InterfaceC2840a;
import io.flutter.embedding.engine.p151g.C2843c;
/* renamed from: c.a.a */
/* loaded from: classes.dex */
public final class C1496a {

    /* renamed from: c */
    private static C1496a f4529c;

    /* renamed from: a */
    private C2843c f4530a;

    /* renamed from: b */
    private InterfaceC2840a f4531b;

    /* renamed from: c.a.a$b */
    /* loaded from: classes.dex */
    public static final class C1498b {

        /* renamed from: a */
        private C2843c f4532a;

        /* renamed from: b */
        private InterfaceC2840a f4533b;

        /* renamed from: b */
        private void m4054b() {
            if (this.f4532a == null) {
                this.f4532a = new C2843c();
            }
        }

        /* renamed from: a */
        public C1496a m4055a() {
            m4054b();
            return new C1496a(this.f4532a, this.f4533b);
        }
    }

    private C1496a(C2843c c2843c, InterfaceC2840a interfaceC2840a) {
        this.f4530a = c2843c;
        this.f4531b = interfaceC2840a;
    }

    /* renamed from: c */
    public static C1496a m4056c() {
        if (f4529c == null) {
            f4529c = new C1498b().m4055a();
        }
        return f4529c;
    }

    /* renamed from: a */
    public InterfaceC2840a m4058a() {
        return this.f4531b;
    }

    /* renamed from: b */
    public C2843c m4057b() {
        return this.f4530a;
    }
}
