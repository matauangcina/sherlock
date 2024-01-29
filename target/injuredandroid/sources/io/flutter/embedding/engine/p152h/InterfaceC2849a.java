package io.flutter.embedding.engine.p152h;

import android.content.Context;
import io.flutter.embedding.engine.C2820a;
import io.flutter.plugin.platform.InterfaceC2955g;
import io.flutter.view.InterfaceC2987e;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
/* renamed from: io.flutter.embedding.engine.h.a */
/* loaded from: classes.dex */
public interface InterfaceC2849a {

    /* renamed from: io.flutter.embedding.engine.h.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2850a {
    }

    /* renamed from: io.flutter.embedding.engine.h.a$b */
    /* loaded from: classes.dex */
    public static class C2851b {

        /* renamed from: a */
        private final Context f7085a;

        /* renamed from: b */
        private final C2820a f7086b;

        /* renamed from: c */
        private final InterfaceC1507b f7087c;

        public C2851b(Context context, C2820a c2820a, InterfaceC1507b interfaceC1507b, InterfaceC2987e interfaceC2987e, InterfaceC2955g interfaceC2955g, InterfaceC2850a interfaceC2850a) {
            this.f7085a = context;
            this.f7086b = c2820a;
            this.f7087c = interfaceC1507b;
        }

        /* renamed from: a */
        public Context m523a() {
            return this.f7085a;
        }

        /* renamed from: b */
        public InterfaceC1507b m522b() {
            return this.f7087c;
        }

        @Deprecated
        /* renamed from: c */
        public C2820a m521c() {
            return this.f7086b;
        }
    }

    /* renamed from: c */
    void mo152c(C2851b c2851b);

    /* renamed from: f */
    void mo151f(C2851b c2851b);
}
