package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0868e;
import io.flutter.embedding.engine.C2820a;
import io.flutter.embedding.engine.C2823b;
import io.flutter.embedding.engine.C2831d;
import io.flutter.embedding.engine.p149e.C2832a;
import io.flutter.embedding.engine.renderer.InterfaceC2924b;
import io.flutter.plugin.platform.C2949d;
import java.util.Arrays;
import p108c.p109a.C1496a;
import p108c.p109a.C1499b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.embedding.android.e */
/* loaded from: classes.dex */
public class C2793e implements InterfaceC2792d<Activity> {

    /* renamed from: a */
    private InterfaceC2795b f6921a;

    /* renamed from: b */
    private C2820a f6922b;

    /* renamed from: c */
    private FlutterSplashView f6923c;

    /* renamed from: d */
    private C2806j f6924d;

    /* renamed from: e */
    private C2949d f6925e;

    /* renamed from: f */
    private boolean f6926f;

    /* renamed from: g */
    private final InterfaceC2924b f6927g = new C2794a();

    /* renamed from: io.flutter.embedding.android.e$a */
    /* loaded from: classes.dex */
    class C2794a implements InterfaceC2924b {
        C2794a() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: d */
        public void mo366d() {
            C2793e.this.f6921a.mo696d();
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: g */
        public void mo365g() {
            C2793e.this.f6921a.mo693g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.android.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2795b extends C2949d.InterfaceC2952c {
        /* renamed from: A */
        void mo699A(C2820a c2820a);

        /* renamed from: a */
        AbstractC0868e mo698a();

        /* renamed from: c */
        Context mo697c();

        /* renamed from: d */
        void mo696d();

        /* renamed from: e */
        Activity mo695e();

        /* renamed from: f */
        void mo694f();

        /* renamed from: g */
        void mo693g();

        /* renamed from: h */
        String mo692h();

        /* renamed from: k */
        boolean mo691k();

        /* renamed from: l */
        boolean mo690l();

        /* renamed from: m */
        String mo689m();

        /* renamed from: n */
        boolean mo688n();

        /* renamed from: o */
        String mo687o();

        /* renamed from: p */
        void mo686p(C2820a c2820a);

        /* renamed from: q */
        C2949d mo685q(Activity activity, C2820a c2820a);

        /* renamed from: r */
        void mo684r(C2801h c2801h);

        /* renamed from: s */
        String mo683s();

        /* renamed from: t */
        boolean mo682t();

        /* renamed from: u */
        C2831d mo681u();

        /* renamed from: v */
        EnumC2814l mo680v();

        /* renamed from: w */
        InterfaceC2816n mo679w();

        /* renamed from: x */
        C2820a mo678x(Context context);

        /* renamed from: y */
        EnumC2817o mo677y();

        /* renamed from: z */
        void mo676z(C2804i c2804i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2793e(InterfaceC2795b interfaceC2795b) {
        this.f6921a = interfaceC2795b;
    }

    /* renamed from: b */
    private void m724b() {
        if (this.f6921a.mo689m() == null && !this.f6922b.m605h().m555h()) {
            String mo692h = this.f6921a.mo692h();
            if (mo692h == null && (mo692h = m717i(this.f6921a.mo695e().getIntent())) == null) {
                mo692h = "/";
            }
            C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Executing Dart entrypoint: " + this.f6921a.mo687o() + ", and sending initial route: " + mo692h);
            this.f6922b.m600m().m459c(mo692h);
            String mo683s = this.f6921a.mo683s();
            if (mo683s == null || mo683s.isEmpty()) {
                mo683s = C1496a.m4056c().m4057b().m530d();
            }
            this.f6922b.m605h().m557f(new C2832a.C2834b(mo683s, this.f6921a.mo687o()));
        }
    }

    /* renamed from: c */
    private void m723c() {
        if (this.f6921a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* renamed from: i */
    private String m717i(Intent intent) {
        Uri data;
        if (!this.f6921a.mo682t() || (data = intent.getData()) == null || data.toString().isEmpty()) {
            return null;
        }
        return data.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m727A() {
        this.f6921a = null;
        this.f6922b = null;
        this.f6924d = null;
        this.f6925e = null;
    }

    /* renamed from: B */
    void m726B() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String mo689m = this.f6921a.mo689m();
        if (mo689m != null) {
            C2820a m588a = C2823b.m587b().m588a(mo689m);
            this.f6922b = m588a;
            this.f6926f = true;
            if (m588a != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + mo689m + "'");
        }
        InterfaceC2795b interfaceC2795b = this.f6921a;
        C2820a mo678x = interfaceC2795b.mo678x(interfaceC2795b.mo697c());
        this.f6922b = mo678x;
        if (mo678x != null) {
            this.f6926f = true;
            return;
        }
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f6922b = new C2820a(this.f6921a.mo697c(), this.f6921a.mo681u().m561b(), false, this.f6921a.mo688n());
        this.f6926f = false;
    }

    @Override // io.flutter.embedding.android.InterfaceC2792d
    /* renamed from: d */
    public Activity mo719g() {
        Activity mo695e = this.f6921a.mo695e();
        if (mo695e != null) {
            return mo695e;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C2820a m721e() {
        return this.f6922b;
    }

    @Override // io.flutter.embedding.android.InterfaceC2792d
    /* renamed from: f */
    public void mo720f() {
        if (!this.f6921a.mo690l()) {
            this.f6921a.mo694f();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f6921a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m718h() {
        return this.f6926f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m716j(int i, int i2, Intent intent) {
        m723c();
        if (this.f6922b == null) {
            C1499b.m4049e("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
        this.f6922b.m606g().mo519a(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m715k(Context context) {
        m723c();
        if (this.f6922b == null) {
            m726B();
        }
        if (this.f6921a.mo691k()) {
            C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f6922b.m606g().mo513g(this, this.f6921a.mo698a());
        }
        InterfaceC2795b interfaceC2795b = this.f6921a;
        this.f6925e = interfaceC2795b.mo685q(interfaceC2795b.mo695e(), this.f6922b);
        this.f6921a.mo699A(this.f6922b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m714l() {
        m723c();
        if (this.f6922b == null) {
            C1499b.m4049e("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            return;
        }
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
        this.f6922b.m600m().m461a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public View m713m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2806j c2806j;
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        m723c();
        if (this.f6921a.mo680v() == EnumC2814l.surface) {
            C2801h c2801h = new C2801h(this.f6921a.mo695e(), this.f6921a.mo677y() == EnumC2817o.transparent);
            this.f6921a.mo684r(c2801h);
            c2806j = new C2806j(this.f6921a.mo695e(), c2801h);
        } else {
            C2804i c2804i = new C2804i(this.f6921a.mo695e());
            this.f6921a.mo676z(c2804i);
            c2806j = new C2806j(this.f6921a.mo695e(), c2804i);
        }
        this.f6924d = c2806j;
        this.f6924d.m644h(this.f6927g);
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f6921a.mo697c());
        this.f6923c = flutterSplashView;
        flutterSplashView.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : 486947586);
        this.f6923c.m753g(this.f6924d, this.f6921a.mo679w());
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f6924d.m642j(this.f6922b);
        return this.f6923c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m712n() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        m723c();
        this.f6924d.m638n();
        this.f6924d.m632t(this.f6927g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m711o() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onDetach()");
        m723c();
        this.f6921a.mo686p(this.f6922b);
        if (this.f6921a.mo691k()) {
            C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f6921a.mo695e().isChangingConfigurations()) {
                this.f6922b.m606g().mo512h();
            } else {
                this.f6922b.m606g().mo511i();
            }
        }
        C2949d c2949d = this.f6925e;
        if (c2949d != null) {
            c2949d.m268j();
            this.f6925e = null;
        }
        this.f6922b.m603j().m469a();
        if (this.f6921a.mo690l()) {
            this.f6922b.m608e();
            if (this.f6921a.mo689m() != null) {
                C2823b.m587b().m585d(this.f6921a.mo689m());
            }
            this.f6922b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m710p(Intent intent) {
        m723c();
        if (this.f6922b == null) {
            C1499b.m4049e("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
        this.f6922b.m606g().mo517c(intent);
        String m717i = m717i(intent);
        if (m717i == null || m717i.isEmpty()) {
            return;
        }
        this.f6922b.m600m().m460b(m717i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m709q() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onPause()");
        m723c();
        this.f6922b.m603j().m468b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m708r() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onPostResume()");
        m723c();
        if (this.f6922b == null) {
            C1499b.m4049e("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        C2949d c2949d = this.f6925e;
        if (c2949d != null) {
            c2949d.m258t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m707s(int i, String[] strArr, int[] iArr) {
        m723c();
        if (this.f6922b == null) {
            C1499b.m4049e("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f6922b.m606g().mo518b(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m706t(Bundle bundle) {
        Bundle bundle2;
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        m723c();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f6921a.mo688n()) {
            this.f6922b.m595r().m422j(bArr);
        }
        if (this.f6921a.mo691k()) {
            this.f6922b.m606g().mo516d(bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m705u() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onResume()");
        m723c();
        this.f6922b.m603j().m466d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m704v(Bundle bundle) {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        m723c();
        if (this.f6921a.mo688n()) {
            bundle.putByteArray("framework", this.f6922b.m595r().m424h());
        }
        if (this.f6921a.mo691k()) {
            Bundle bundle2 = new Bundle();
            this.f6922b.m606g().mo515e(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m703w() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onStart()");
        m723c();
        m724b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m702x() {
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "onStop()");
        m723c();
        this.f6922b.m603j().m467c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m701y(int i) {
        m723c();
        C2820a c2820a = this.f6922b;
        if (c2820a == null) {
            C1499b.m4049e("FlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        c2820a.m605h().m554i();
        if (i == 10) {
            C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Forwarding onTrimMemory() to FlutterEngine. Level: " + i);
            this.f6922b.m593t().m413a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m700z() {
        m723c();
        if (this.f6922b == null) {
            C1499b.m4049e("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        C1499b.m4050d("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
        this.f6922b.m606g().mo514f();
    }
}
