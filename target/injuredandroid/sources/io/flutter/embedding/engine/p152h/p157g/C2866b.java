package io.flutter.embedding.engine.p152h.p157g;

import android.app.Activity;
import io.flutter.embedding.engine.p152h.InterfaceC2849a;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
import p108c.p109a.p110c.p111a.InterfaceC1523k;
import p108c.p109a.p110c.p111a.InterfaceC1524l;
import p108c.p109a.p110c.p111a.InterfaceC1525m;
import p108c.p109a.p110c.p111a.InterfaceC1526n;
import p108c.p109a.p110c.p111a.InterfaceC1527o;
import p108c.p109a.p110c.p111a.InterfaceC1528p;
/* renamed from: io.flutter.embedding.engine.h.g.b */
/* loaded from: classes.dex */
class C2866b implements InterfaceC1525m, InterfaceC2849a, InterfaceC2853a {

    /* renamed from: a */
    private final Set<InterfaceC1528p> f7094a = new HashSet();

    /* renamed from: b */
    private final Set<InterfaceC1526n> f7095b = new HashSet();

    /* renamed from: c */
    private final Set<InterfaceC1523k> f7096c = new HashSet();

    /* renamed from: d */
    private final Set<InterfaceC1524l> f7097d = new HashSet();

    /* renamed from: e */
    private final Set<InterfaceC1527o> f7098e = new HashSet();

    /* renamed from: f */
    private InterfaceC2849a.C2851b f7099f;

    /* renamed from: g */
    private InterfaceC2855c f7100g;

    public C2866b(String str, Map<String, Object> map) {
    }

    /* renamed from: j */
    private void m488j() {
        for (InterfaceC1526n interfaceC1526n : this.f7095b) {
            this.f7100g.mo508c(interfaceC1526n);
        }
        for (InterfaceC1523k interfaceC1523k : this.f7096c) {
            this.f7100g.mo510a(interfaceC1523k);
        }
        for (InterfaceC1524l interfaceC1524l : this.f7097d) {
            this.f7100g.mo509b(interfaceC1524l);
        }
        for (InterfaceC1527o interfaceC1527o : this.f7098e) {
            this.f7100g.mo507d(interfaceC1527o);
        }
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1525m
    /* renamed from: a */
    public InterfaceC1525m mo495a(InterfaceC1523k interfaceC1523k) {
        this.f7096c.add(interfaceC1523k);
        InterfaceC2855c interfaceC2855c = this.f7100g;
        if (interfaceC2855c != null) {
            interfaceC2855c.mo510a(interfaceC1523k);
        }
        return this;
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
    /* renamed from: b */
    public void mo494b(InterfaceC2855c interfaceC2855c) {
        C1499b.m4050d("ShimRegistrar", "Attached to an Activity.");
        this.f7100g = interfaceC2855c;
        m488j();
    }

    @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
    /* renamed from: c */
    public void mo152c(InterfaceC2849a.C2851b c2851b) {
        C1499b.m4050d("ShimRegistrar", "Attached to FlutterEngine.");
        this.f7099f = c2851b;
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
    /* renamed from: d */
    public void mo493d() {
        C1499b.m4050d("ShimRegistrar", "Detached from an Activity.");
        this.f7100g = null;
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
    /* renamed from: e */
    public void mo492e(InterfaceC2855c interfaceC2855c) {
        C1499b.m4050d("ShimRegistrar", "Reconnected to an Activity after config changes.");
        this.f7100g = interfaceC2855c;
        m488j();
    }

    @Override // io.flutter.embedding.engine.p152h.InterfaceC2849a
    /* renamed from: f */
    public void mo151f(InterfaceC2849a.C2851b c2851b) {
        C1499b.m4050d("ShimRegistrar", "Detached from FlutterEngine.");
        for (InterfaceC1528p interfaceC1528p : this.f7094a) {
            interfaceC1528p.m4028a(null);
        }
        this.f7099f = null;
        this.f7100g = null;
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1525m
    /* renamed from: g */
    public Activity mo491g() {
        InterfaceC2855c interfaceC2855c = this.f7100g;
        if (interfaceC2855c != null) {
            return interfaceC2855c.mo506e();
        }
        return null;
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1525m
    /* renamed from: h */
    public InterfaceC1507b mo490h() {
        InterfaceC2849a.C2851b c2851b = this.f7099f;
        if (c2851b != null) {
            return c2851b.m522b();
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a
    /* renamed from: i */
    public void mo489i() {
        C1499b.m4050d("ShimRegistrar", "Detached from an Activity for config changes.");
        this.f7100g = null;
    }
}
