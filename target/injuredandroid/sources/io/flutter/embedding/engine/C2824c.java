package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0868e;
import io.flutter.embedding.android.InterfaceC2792d;
import io.flutter.embedding.engine.p151g.C2843c;
import io.flutter.embedding.engine.p152h.InterfaceC2849a;
import io.flutter.embedding.engine.p152h.InterfaceC2852b;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2853a;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b;
import io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c;
import io.flutter.embedding.engine.p152h.p154d.InterfaceC2857a;
import io.flutter.embedding.engine.p152h.p154d.InterfaceC2858b;
import io.flutter.embedding.engine.p152h.p155e.InterfaceC2859a;
import io.flutter.embedding.engine.p152h.p155e.InterfaceC2860b;
import io.flutter.embedding.engine.p152h.p156f.InterfaceC2861a;
import io.flutter.embedding.engine.p152h.p156f.InterfaceC2862b;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.InterfaceC1523k;
import p108c.p109a.p110c.p111a.InterfaceC1524l;
import p108c.p109a.p110c.p111a.InterfaceC1526n;
import p108c.p109a.p110c.p111a.InterfaceC1527o;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.embedding.engine.c */
/* loaded from: classes.dex */
public class C2824c implements InterfaceC2852b, InterfaceC2854b {

    /* renamed from: b */
    private final C2820a f7022b;

    /* renamed from: c */
    private final InterfaceC2849a.C2851b f7023c;
    @Deprecated

    /* renamed from: e */
    private Activity f7025e;

    /* renamed from: f */
    private InterfaceC2792d<Activity> f7026f;

    /* renamed from: g */
    private C2827c f7027g;

    /* renamed from: j */
    private Service f7030j;

    /* renamed from: k */
    private C2830f f7031k;

    /* renamed from: m */
    private BroadcastReceiver f7033m;

    /* renamed from: n */
    private C2828d f7034n;

    /* renamed from: p */
    private ContentProvider f7036p;

    /* renamed from: q */
    private C2829e f7037q;

    /* renamed from: a */
    private final Map<Class<? extends InterfaceC2849a>, InterfaceC2849a> f7021a = new HashMap();

    /* renamed from: d */
    private final Map<Class<? extends InterfaceC2849a>, InterfaceC2853a> f7024d = new HashMap();

    /* renamed from: h */
    private boolean f7028h = false;

    /* renamed from: i */
    private final Map<Class<? extends InterfaceC2849a>, InterfaceC2861a> f7029i = new HashMap();

    /* renamed from: l */
    private final Map<Class<? extends InterfaceC2849a>, InterfaceC2857a> f7032l = new HashMap();

    /* renamed from: o */
    private final Map<Class<? extends InterfaceC2849a>, InterfaceC2859a> f7035o = new HashMap();

    /* renamed from: io.flutter.embedding.engine.c$b */
    /* loaded from: classes.dex */
    private static class C2826b implements InterfaceC2849a.InterfaceC2850a {
        private C2826b(C2843c c2843c) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.embedding.engine.c$c */
    /* loaded from: classes.dex */
    public static class C2827c implements InterfaceC2855c {

        /* renamed from: a */
        private final Activity f7038a;

        /* renamed from: b */
        private final Set<InterfaceC1526n> f7039b = new HashSet();

        /* renamed from: c */
        private final Set<InterfaceC1523k> f7040c = new HashSet();

        /* renamed from: d */
        private final Set<InterfaceC1524l> f7041d = new HashSet();

        /* renamed from: e */
        private final Set<InterfaceC1527o> f7042e = new HashSet();

        /* renamed from: f */
        private final Set<InterfaceC2855c.InterfaceC2856a> f7043f = new HashSet();

        public C2827c(Activity activity, AbstractC0868e abstractC0868e) {
            this.f7038a = activity;
            new HiddenLifecycleReference(abstractC0868e);
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c
        /* renamed from: a */
        public void mo510a(InterfaceC1523k interfaceC1523k) {
            this.f7040c.add(interfaceC1523k);
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c
        /* renamed from: b */
        public void mo509b(InterfaceC1524l interfaceC1524l) {
            this.f7041d.add(interfaceC1524l);
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c
        /* renamed from: c */
        public void mo508c(InterfaceC1526n interfaceC1526n) {
            this.f7039b.add(interfaceC1526n);
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c
        /* renamed from: d */
        public void mo507d(InterfaceC1527o interfaceC1527o) {
            this.f7042e.add(interfaceC1527o);
        }

        @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2855c
        /* renamed from: e */
        public Activity mo506e() {
            return this.f7038a;
        }

        /* renamed from: f */
        boolean m568f(int i, int i2, Intent intent) {
            boolean z;
            Iterator it = new HashSet(this.f7040c).iterator();
            while (true) {
                while (it.hasNext()) {
                    z = ((InterfaceC1523k) it.next()).mo4032a(i, i2, intent) || z;
                }
                return z;
            }
        }

        /* renamed from: g */
        void m567g(Intent intent) {
            for (InterfaceC1524l interfaceC1524l : this.f7041d) {
                interfaceC1524l.m4031c(intent);
            }
        }

        /* renamed from: h */
        boolean m566h(int i, String[] strArr, int[] iArr) {
            boolean z;
            while (true) {
                for (InterfaceC1526n interfaceC1526n : this.f7039b) {
                    z = interfaceC1526n.m4030b(i, strArr, iArr) || z;
                }
                return z;
            }
        }

        /* renamed from: i */
        void m565i(Bundle bundle) {
            for (InterfaceC2855c.InterfaceC2856a interfaceC2856a : this.f7043f) {
                interfaceC2856a.m505d(bundle);
            }
        }

        /* renamed from: j */
        void m564j(Bundle bundle) {
            for (InterfaceC2855c.InterfaceC2856a interfaceC2856a : this.f7043f) {
                interfaceC2856a.m504e(bundle);
            }
        }

        /* renamed from: k */
        void m563k() {
            for (InterfaceC1527o interfaceC1527o : this.f7042e) {
                interfaceC1527o.m4029f();
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$d */
    /* loaded from: classes.dex */
    private static class C2828d implements InterfaceC2858b {
    }

    /* renamed from: io.flutter.embedding.engine.c$e */
    /* loaded from: classes.dex */
    private static class C2829e implements InterfaceC2860b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.embedding.engine.c$f */
    /* loaded from: classes.dex */
    public static class C2830f implements InterfaceC2862b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2824c(Context context, C2820a c2820a, C2843c c2843c) {
        this.f7022b = c2820a;
        this.f7023c = new InterfaceC2849a.C2851b(context, c2820a, c2820a.m605h(), c2820a.m596q(), c2820a.m598o().m228H(), new C2826b(c2843c));
    }

    /* renamed from: k */
    private void m584k(Activity activity, AbstractC0868e abstractC0868e) {
        this.f7027g = new C2827c(activity, abstractC0868e);
        this.f7022b.m598o().m188t(activity, this.f7022b.m596q(), this.f7022b.m605h());
        for (InterfaceC2853a interfaceC2853a : this.f7024d.values()) {
            if (this.f7028h) {
                interfaceC2853a.mo492e(this.f7027g);
            } else {
                interfaceC2853a.mo494b(this.f7027g);
            }
        }
        this.f7028h = false;
    }

    /* renamed from: l */
    private Activity m583l() {
        InterfaceC2792d<Activity> interfaceC2792d = this.f7026f;
        return interfaceC2792d != null ? interfaceC2792d.mo719g() : this.f7025e;
    }

    /* renamed from: n */
    private void m581n() {
        this.f7022b.m598o().m234B();
        this.f7026f = null;
        this.f7025e = null;
        this.f7027g = null;
    }

    /* renamed from: o */
    private void m580o() {
        if (m575t()) {
            mo511i();
        } else if (m572w()) {
            m577r();
        } else if (m574u()) {
            m579p();
        } else if (m573v()) {
            m578q();
        }
    }

    /* renamed from: t */
    private boolean m575t() {
        return (this.f7025e == null && this.f7026f == null) ? false : true;
    }

    /* renamed from: u */
    private boolean m574u() {
        return this.f7033m != null;
    }

    /* renamed from: v */
    private boolean m573v() {
        return this.f7036p != null;
    }

    /* renamed from: w */
    private boolean m572w() {
        return this.f7030j != null;
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: a */
    public boolean mo519a(int i, int i2, Intent intent) {
        C1499b.m4050d("FlutterEngineCxnRegstry", "Forwarding onActivityResult() to plugins.");
        if (m575t()) {
            return this.f7027g.m568f(i, i2, intent);
        }
        C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: b */
    public boolean mo518b(int i, String[] strArr, int[] iArr) {
        C1499b.m4050d("FlutterEngineCxnRegstry", "Forwarding onRequestPermissionsResult() to plugins.");
        if (m575t()) {
            return this.f7027g.m566h(i, strArr, iArr);
        }
        C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: c */
    public void mo517c(Intent intent) {
        C1499b.m4050d("FlutterEngineCxnRegstry", "Forwarding onNewIntent() to plugins.");
        if (m575t()) {
            this.f7027g.m567g(intent);
        } else {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: d */
    public void mo516d(Bundle bundle) {
        C1499b.m4050d("FlutterEngineCxnRegstry", "Forwarding onRestoreInstanceState() to plugins.");
        if (m575t()) {
            this.f7027g.m565i(bundle);
        } else {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: e */
    public void mo515e(Bundle bundle) {
        C1499b.m4050d("FlutterEngineCxnRegstry", "Forwarding onSaveInstanceState() to plugins.");
        if (m575t()) {
            this.f7027g.m564j(bundle);
        } else {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: f */
    public void mo514f() {
        C1499b.m4050d("FlutterEngineCxnRegstry", "Forwarding onUserLeaveHint() to plugins.");
        if (m575t()) {
            this.f7027g.m563k();
        } else {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: g */
    public void mo513g(InterfaceC2792d<Activity> interfaceC2792d, AbstractC0868e abstractC0868e) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Attaching to an exclusive Activity: ");
        sb.append(interfaceC2792d.mo719g());
        if (m575t()) {
            str = " evicting previous activity " + m583l();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(".");
        sb.append(this.f7028h ? " This is after a config change." : "");
        C1499b.m4050d("FlutterEngineCxnRegstry", sb.toString());
        InterfaceC2792d<Activity> interfaceC2792d2 = this.f7026f;
        if (interfaceC2792d2 != null) {
            interfaceC2792d2.mo720f();
        }
        m580o();
        if (this.f7025e != null) {
            throw new AssertionError("Only activity or exclusiveActivity should be set");
        }
        this.f7026f = interfaceC2792d;
        m584k(interfaceC2792d.mo719g(), abstractC0868e);
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: h */
    public void mo512h() {
        if (!m575t()) {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        C1499b.m4050d("FlutterEngineCxnRegstry", "Detaching from an Activity for config changes: " + m583l());
        this.f7028h = true;
        for (InterfaceC2853a interfaceC2853a : this.f7024d.values()) {
            interfaceC2853a.mo489i();
        }
        m581n();
    }

    @Override // io.flutter.embedding.engine.p152h.p153c.InterfaceC2854b
    /* renamed from: i */
    public void mo511i() {
        if (!m575t()) {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        C1499b.m4050d("FlutterEngineCxnRegstry", "Detaching from an Activity: " + m583l());
        for (InterfaceC2853a interfaceC2853a : this.f7024d.values()) {
            interfaceC2853a.mo493d();
        }
        m581n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.p152h.InterfaceC2852b
    /* renamed from: j */
    public void mo520j(InterfaceC2849a interfaceC2849a) {
        if (m576s(interfaceC2849a.getClass())) {
            C1499b.m4049e("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC2849a + ") but it was already registered with this FlutterEngine (" + this.f7022b + ").");
            return;
        }
        C1499b.m4050d("FlutterEngineCxnRegstry", "Adding plugin: " + interfaceC2849a);
        this.f7021a.put(interfaceC2849a.getClass(), interfaceC2849a);
        interfaceC2849a.mo152c(this.f7023c);
        if (interfaceC2849a instanceof InterfaceC2853a) {
            InterfaceC2853a interfaceC2853a = (InterfaceC2853a) interfaceC2849a;
            this.f7024d.put(interfaceC2849a.getClass(), interfaceC2853a);
            if (m575t()) {
                interfaceC2853a.mo494b(this.f7027g);
            }
        }
        if (interfaceC2849a instanceof InterfaceC2861a) {
            InterfaceC2861a interfaceC2861a = (InterfaceC2861a) interfaceC2849a;
            this.f7029i.put(interfaceC2849a.getClass(), interfaceC2861a);
            if (m572w()) {
                interfaceC2861a.m498b(this.f7031k);
            }
        }
        if (interfaceC2849a instanceof InterfaceC2857a) {
            InterfaceC2857a interfaceC2857a = (InterfaceC2857a) interfaceC2849a;
            this.f7032l.put(interfaceC2849a.getClass(), interfaceC2857a);
            if (m574u()) {
                interfaceC2857a.m503a(this.f7034n);
            }
        }
        if (interfaceC2849a instanceof InterfaceC2859a) {
            InterfaceC2859a interfaceC2859a = (InterfaceC2859a) interfaceC2849a;
            this.f7035o.put(interfaceC2849a.getClass(), interfaceC2859a);
            if (m573v()) {
                interfaceC2859a.m500b(this.f7037q);
            }
        }
    }

    /* renamed from: m */
    public void m582m() {
        C1499b.m4050d("FlutterEngineCxnRegstry", "Destroying.");
        m580o();
        m569z();
    }

    /* renamed from: p */
    public void m579p() {
        if (!m574u()) {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        C1499b.m4050d("FlutterEngineCxnRegstry", "Detaching from BroadcastReceiver: " + this.f7033m);
        for (InterfaceC2857a interfaceC2857a : this.f7032l.values()) {
            interfaceC2857a.m502b();
        }
    }

    /* renamed from: q */
    public void m578q() {
        if (!m573v()) {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        C1499b.m4050d("FlutterEngineCxnRegstry", "Detaching from ContentProvider: " + this.f7036p);
        for (InterfaceC2859a interfaceC2859a : this.f7035o.values()) {
            interfaceC2859a.m501a();
        }
    }

    /* renamed from: r */
    public void m577r() {
        if (!m572w()) {
            C1499b.m4052b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        C1499b.m4050d("FlutterEngineCxnRegstry", "Detaching from a Service: " + this.f7030j);
        for (InterfaceC2861a interfaceC2861a : this.f7029i.values()) {
            interfaceC2861a.m499a();
        }
        this.f7030j = null;
        this.f7031k = null;
    }

    /* renamed from: s */
    public boolean m576s(Class<? extends InterfaceC2849a> cls) {
        return this.f7021a.containsKey(cls);
    }

    /* renamed from: x */
    public void m571x(Class<? extends InterfaceC2849a> cls) {
        InterfaceC2849a interfaceC2849a = this.f7021a.get(cls);
        if (interfaceC2849a != null) {
            C1499b.m4050d("FlutterEngineCxnRegstry", "Removing plugin: " + interfaceC2849a);
            if (interfaceC2849a instanceof InterfaceC2853a) {
                if (m575t()) {
                    ((InterfaceC2853a) interfaceC2849a).mo493d();
                }
                this.f7024d.remove(cls);
            }
            if (interfaceC2849a instanceof InterfaceC2861a) {
                if (m572w()) {
                    ((InterfaceC2861a) interfaceC2849a).m499a();
                }
                this.f7029i.remove(cls);
            }
            if (interfaceC2849a instanceof InterfaceC2857a) {
                if (m574u()) {
                    ((InterfaceC2857a) interfaceC2849a).m502b();
                }
                this.f7032l.remove(cls);
            }
            if (interfaceC2849a instanceof InterfaceC2859a) {
                if (m573v()) {
                    ((InterfaceC2859a) interfaceC2849a).m501a();
                }
                this.f7035o.remove(cls);
            }
            interfaceC2849a.mo151f(this.f7023c);
            this.f7021a.remove(cls);
        }
    }

    /* renamed from: y */
    public void m570y(Set<Class<? extends InterfaceC2849a>> set) {
        for (Class<? extends InterfaceC2849a> cls : set) {
            m571x(cls);
        }
    }

    /* renamed from: z */
    public void m569z() {
        m570y(new HashSet(this.f7021a.keySet()));
        this.f7021a.clear();
    }
}
