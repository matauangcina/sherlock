package io.flutter.embedding.engine.p152h.p157g;

import io.flutter.embedding.engine.C2820a;
import io.flutter.embedding.engine.p152h.InterfaceC2849a;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.InterfaceC1525m;
/* renamed from: io.flutter.embedding.engine.h.g.a */
/* loaded from: classes.dex */
public class C2863a {

    /* renamed from: a */
    private final C2820a f7088a;

    /* renamed from: b */
    private final Map<String, Object> f7089b = new HashMap();

    /* renamed from: c */
    private final C2865b f7090c = new C2865b();

    /* renamed from: io.flutter.embedding.engine.h.g.a$b */
    /* loaded from: classes.dex */
    private static class C2865b implements InterfaceC2849a, InterfaceC2853a {

        /* renamed from: a */
        private final Set<C2866b> f7091a;

        /* renamed from: b */
        private InterfaceC2849a.C2851b f7092b;

        /* renamed from: c */
        private InterfaceC2855c f7093c;

        private C2865b() {
            this.f7091a = new HashSet();
        }

        /* renamed from: a */
        public void m496a(C2866b c2866b) {
            this.f7091a.add(c2866b);
            InterfaceC2849a.C2851b c2851b = this.f7092b;
            if (c2851b != null) {
                c2866b.mo152c(c2851b);
            }
            InterfaceC2855c interfaceC2855c = this.f7093c;
            if (interfaceC2855c != null) {
                c2866b.mo494b(interfaceC2855c);
            }
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
        /* renamed from: b */
        public void mo494b(InterfaceC2855c interfaceC2855c) {
            this.f7093c = interfaceC2855c;
            for (C2866b c2866b : this.f7091a) {
                c2866b.mo494b(interfaceC2855c);
            }
        }

        @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
        /* renamed from: c */
        public void mo152c(InterfaceC2849a.C2851b c2851b) {
            this.f7092b = c2851b;
            for (C2866b c2866b : this.f7091a) {
                c2866b.mo152c(c2851b);
            }
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
        /* renamed from: d */
        public void mo493d() {
            for (C2866b c2866b : this.f7091a) {
                c2866b.mo493d();
            }
            this.f7093c = null;
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
        /* renamed from: e */
        public void mo492e(InterfaceC2855c interfaceC2855c) {
            this.f7093c = interfaceC2855c;
            for (C2866b c2866b : this.f7091a) {
                c2866b.mo492e(interfaceC2855c);
            }
        }

        @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
        /* renamed from: f */
        public void mo151f(InterfaceC2849a.C2851b c2851b) {
            for (C2866b c2866b : this.f7091a) {
                c2866b.mo151f(c2851b);
            }
            this.f7092b = null;
            this.f7093c = null;
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
        /* renamed from: i */
        public void mo489i() {
            for (C2866b c2866b : this.f7091a) {
                c2866b.mo493d();
            }
            this.f7093c = null;
        }
    }

    public C2863a(C2820a c2820a) {
        this.f7088a = c2820a;
        this.f7088a.m597p().mo520j(this.f7090c);
    }

    /* renamed from: a */
    public InterfaceC1525m m497a(String str) {
        C1499b.m4050d("ShimPluginRegistry", "Creating plugin Registrar for '" + str + "'");
        if (!this.f7089b.containsKey(str)) {
            this.f7089b.put(str, null);
            C2866b c2866b = new C2866b(str, this.f7089b);
            this.f7090c.m496a(c2866b);
            return c2866b;
        }
        throw new IllegalStateException("Plugin key " + str + " is already in use");
    }
}
