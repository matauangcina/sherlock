package io.flutter.plugins.p160a;

import android.content.Context;
import io.flutter.embedding.engine.p152h.InterfaceC2849a;
import p108c.p109a.p110c.p111a.C1516i;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
/* renamed from: io.flutter.plugins.a.b */
/* loaded from: classes.dex */
public class C2968b implements InterfaceC2849a {

    /* renamed from: a */
    private C1516i f7414a;

    /* renamed from: a */
    private void m154a(InterfaceC1507b interfaceC1507b, Context context) {
        this.f7414a = new C1516i(interfaceC1507b, "plugins.flutter.io/shared_preferences");
        this.f7414a.m4034e(new C2966a(context));
    }

    /* renamed from: b */
    private void m153b() {
        this.f7414a.m4034e(null);
        this.f7414a = null;
    }

    @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
    /* renamed from: c */
    public void mo152c(InterfaceC2849a.C2851b c2851b) {
        m154a(c2851b.m522b(), c2851b.m523a());
    }

    @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
    /* renamed from: f */
    public void mo151f(InterfaceC2849a.C2851b c2851b) {
        m153b();
    }
}
