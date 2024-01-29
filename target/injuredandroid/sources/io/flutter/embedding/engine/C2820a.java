package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.p149e.C2832a;
import io.flutter.embedding.engine.p151g.C2843c;
import io.flutter.embedding.engine.p152h.InterfaceC2852b;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b;
import io.flutter.embedding.engine.p159i.C2869b;
import io.flutter.embedding.engine.p159i.C2872c;
import io.flutter.embedding.engine.p159i.C2875d;
import io.flutter.embedding.engine.p159i.C2876e;
import io.flutter.embedding.engine.p159i.C2877f;
import io.flutter.embedding.engine.p159i.C2880g;
import io.flutter.embedding.engine.p159i.C2881h;
import io.flutter.embedding.engine.p159i.C2900j;
import io.flutter.embedding.engine.p159i.C2903k;
import io.flutter.embedding.engine.p159i.C2906l;
import io.flutter.embedding.engine.p159i.C2907m;
import io.flutter.embedding.engine.renderer.C2919a;
import io.flutter.plugin.platform.C2958j;
import java.util.HashSet;
import java.util.Set;
import p108c.p109a.C1496a;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p112b.C1533a;
/* renamed from: io.flutter.embedding.engine.a */
/* loaded from: classes.dex */
public class C2820a {

    /* renamed from: a */
    private final FlutterJNI f6999a;

    /* renamed from: b */
    private final C2919a f7000b;

    /* renamed from: c */
    private final C2832a f7001c;

    /* renamed from: d */
    private final C2824c f7002d;

    /* renamed from: e */
    private final C1533a f7003e;

    /* renamed from: f */
    private final C2869b f7004f;

    /* renamed from: g */
    private final C2872c f7005g;

    /* renamed from: h */
    private final C2875d f7006h;

    /* renamed from: i */
    private final C2876e f7007i;

    /* renamed from: j */
    private final C2877f f7008j;

    /* renamed from: k */
    private final C2880g f7009k;

    /* renamed from: l */
    private final C2900j f7010l;

    /* renamed from: m */
    private final C2881h f7011m;

    /* renamed from: n */
    private final C2903k f7012n;

    /* renamed from: o */
    private final C2906l f7013o;

    /* renamed from: p */
    private final C2907m f7014p;

    /* renamed from: q */
    private final C2958j f7015q;

    /* renamed from: r */
    private final Set<InterfaceC2822b> f7016r;

    /* renamed from: s */
    private final InterfaceC2822b f7017s;

    /* renamed from: io.flutter.embedding.engine.a$a */
    /* loaded from: classes.dex */
    class C2821a implements InterfaceC2822b {
        C2821a() {
        }

        @Override // io.flutter.embedding.engine.C2820a.InterfaceC2822b
        /* renamed from: a */
        public void mo589a() {
            C1499b.m4050d("FlutterEngine", "onPreEngineRestart()");
            for (InterfaceC2822b interfaceC2822b : C2820a.this.f7016r) {
                interfaceC2822b.mo589a();
            }
            C2820a.this.f7015q.m217S();
            C2820a.this.f7010l.m425g();
        }
    }

    /* renamed from: io.flutter.embedding.engine.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2822b {
        /* renamed from: a */
        void mo589a();
    }

    public C2820a(Context context, C2843c c2843c, FlutterJNI flutterJNI, C2958j c2958j, String[] strArr, boolean z, boolean z2) {
        AssetManager assets;
        this.f7016r = new HashSet();
        this.f7017s = new C2821a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C2832a c2832a = new C2832a(flutterJNI, assets);
        this.f7001c = c2832a;
        c2832a.m553j();
        this.f7004f = new C2869b(this.f7001c, flutterJNI);
        this.f7005g = new C2872c(this.f7001c);
        this.f7006h = new C2875d(this.f7001c);
        this.f7007i = new C2876e(this.f7001c);
        this.f7008j = new C2877f(this.f7001c);
        this.f7009k = new C2880g(this.f7001c);
        this.f7011m = new C2881h(this.f7001c);
        this.f7010l = new C2900j(this.f7001c, z2);
        this.f7012n = new C2903k(this.f7001c);
        this.f7013o = new C2906l(this.f7001c);
        this.f7014p = new C2907m(this.f7001c);
        this.f7003e = new C1533a(context, this.f7007i);
        this.f6999a = flutterJNI;
        c2843c = c2843c == null ? C1496a.m4056c().m4057b() : c2843c;
        c2843c.m528f(context.getApplicationContext());
        c2843c.m531c(context, strArr);
        flutterJNI.addEngineLifecycleListener(this.f7017s);
        flutterJNI.setPlatformViewsController(c2958j);
        flutterJNI.setLocalizationPlugin(this.f7003e);
        flutterJNI.setDynamicFeatureManager(C1496a.m4056c().m4058a());
        m609d();
        this.f7000b = new C2919a(flutterJNI);
        this.f7015q = c2958j;
        c2958j.m223M();
        this.f7002d = new C2824c(context.getApplicationContext(), this, c2843c);
        if (z) {
            m590w();
        }
    }

    public C2820a(Context context, String[] strArr, boolean z, boolean z2) {
        this(context, null, new FlutterJNI(), new C2958j(), strArr, z, z2);
    }

    /* renamed from: d */
    private void m609d() {
        C1499b.m4050d("FlutterEngine", "Attaching to JNI.");
        this.f6999a.attachToNative(false);
        if (!m591v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    /* renamed from: v */
    private boolean m591v() {
        return this.f6999a.isAttached();
    }

    /* renamed from: w */
    private void m590w() {
        try {
            Class.forName("io.flutter.plugins.GeneratedPluginRegistrant").getDeclaredMethod("registerWith", C2820a.class).invoke(null, this);
        } catch (Exception unused) {
            C1499b.m4049e("FlutterEngine", "Tried to automatically register plugins with FlutterEngine (" + this + ") but could not find and invoke the GeneratedPluginRegistrant.");
        }
    }

    /* renamed from: e */
    public void m608e() {
        C1499b.m4050d("FlutterEngine", "Destroying.");
        this.f7002d.m582m();
        this.f7015q.m221O();
        this.f7001c.m552k();
        this.f6999a.removeEngineLifecycleListener(this.f7017s);
        this.f6999a.setDynamicFeatureManager(null);
        this.f6999a.detachFromNativeAndReleaseResources();
        if (C1496a.m4056c().m4058a() != null) {
            C1496a.m4056c().m4058a().m541c();
        }
    }

    /* renamed from: f */
    public C2869b m607f() {
        return this.f7004f;
    }

    /* renamed from: g */
    public InterfaceC2854b m606g() {
        return this.f7002d;
    }

    /* renamed from: h */
    public C2832a m605h() {
        return this.f7001c;
    }

    /* renamed from: i */
    public C2872c m604i() {
        return this.f7005g;
    }

    /* renamed from: j */
    public C2875d m603j() {
        return this.f7006h;
    }

    /* renamed from: k */
    public C1533a m602k() {
        return this.f7003e;
    }

    /* renamed from: l */
    public C2877f m601l() {
        return this.f7008j;
    }

    /* renamed from: m */
    public C2880g m600m() {
        return this.f7009k;
    }

    /* renamed from: n */
    public C2881h m599n() {
        return this.f7011m;
    }

    /* renamed from: o */
    public C2958j m598o() {
        return this.f7015q;
    }

    /* renamed from: p */
    public InterfaceC2852b m597p() {
        return this.f7002d;
    }

    /* renamed from: q */
    public C2919a m596q() {
        return this.f7000b;
    }

    /* renamed from: r */
    public C2900j m595r() {
        return this.f7010l;
    }

    /* renamed from: s */
    public C2903k m594s() {
        return this.f7012n;
    }

    /* renamed from: t */
    public C2906l m593t() {
        return this.f7013o;
    }

    /* renamed from: u */
    public C2907m m592u() {
        return this.f7014p;
    }
}
