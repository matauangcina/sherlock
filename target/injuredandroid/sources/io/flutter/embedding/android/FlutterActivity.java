package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0876k;
import androidx.lifecycle.InterfaceC0875j;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.embedding.android.C2793e;
import io.flutter.embedding.android.C2796f;
import io.flutter.embedding.engine.C2820a;
import io.flutter.embedding.engine.C2831d;
import io.flutter.embedding.engine.p152h.p158h.C2867a;
import io.flutter.plugin.platform.C2949d;
import p108c.p109a.C1499b;
/* loaded from: classes.dex */
public class FlutterActivity extends Activity implements C2793e.InterfaceC2795b, InterfaceC0875j {

    /* renamed from: f */
    protected C2793e f6888f;

    /* renamed from: g */
    private C0876k f6889g = new C0876k(this);

    /* renamed from: io.flutter.embedding.android.FlutterActivity$a */
    /* loaded from: classes.dex */
    public static class C2781a {

        /* renamed from: a */
        private final Class<? extends FlutterActivity> f6890a;

        /* renamed from: b */
        private String f6891b = "/";

        /* renamed from: c */
        private String f6892c = C2796f.f6929a;

        public C2781a(Class<? extends FlutterActivity> cls) {
            this.f6890a = cls;
        }

        /* renamed from: a */
        public Intent m761a(Context context) {
            return new Intent(context, this.f6890a).putExtra("route", this.f6891b).putExtra("background_mode", this.f6892c).putExtra("destroy_engine_with_activity", true);
        }

        /* renamed from: b */
        public C2781a m760b(String str) {
            this.f6891b = str;
            return this;
        }
    }

    /* renamed from: B */
    private void m773B() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    /* renamed from: C */
    private void m772C() {
        if (m770E() == C2796f.EnumC2797a.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: D */
    private View m771D() {
        return this.f6888f.m713m(null, null, null);
    }

    /* renamed from: H */
    private Drawable m767H() {
        try {
            Bundle m768G = m768G();
            int i = m768G != null ? m768G.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i != 0) {
                return Build.VERSION.SDK_INT > 21 ? getResources().getDrawable(i, getTheme()) : getResources().getDrawable(i);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: I */
    private boolean m766I() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: J */
    private void m765J() {
        this.f6888f.m712n();
        this.f6888f.m711o();
        this.f6888f.m727A();
        this.f6888f = null;
    }

    /* renamed from: K */
    private boolean m764K(String str) {
        if (this.f6888f == null) {
            C1499b.m4050d("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        return true;
    }

    /* renamed from: L */
    private void m763L() {
        try {
            Bundle m768G = m768G();
            if (m768G != null) {
                int i = m768G.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i != -1) {
                    setTheme(i);
                }
            } else {
                C1499b.m4050d("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C1499b.m4052b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    /* renamed from: M */
    public static C2781a m762M() {
        return new C2781a(FlutterActivity.class);
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: A */
    public void mo699A(C2820a c2820a) {
        C2867a.m487a(c2820a);
    }

    /* renamed from: E */
    protected C2796f.EnumC2797a m770E() {
        return getIntent().hasExtra("background_mode") ? C2796f.EnumC2797a.valueOf(getIntent().getStringExtra("background_mode")) : C2796f.EnumC2797a.opaque;
    }

    /* renamed from: F */
    protected C2820a m769F() {
        return this.f6888f.m721e();
    }

    /* renamed from: G */
    protected Bundle m768G() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b, androidx.lifecycle.InterfaceC0875j
    /* renamed from: a */
    public AbstractC0868e mo698a() {
        return this.f6889g;
    }

    @Override // io.flutter.plugin.platform.C2949d.InterfaceC2952c
    /* renamed from: b */
    public boolean mo245b() {
        return false;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: c */
    public Context mo697c() {
        return this;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: d */
    public void mo696d() {
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: e */
    public Activity mo695e() {
        return this;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: f */
    public void mo694f() {
        C1499b.m4050d("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + m769F() + " evicted by another attaching activity");
        m765J();
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: g */
    public void mo693g() {
        if (Build.VERSION.SDK_INT >= 21) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: h */
    public String mo692h() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle m768G = m768G();
            if (m768G != null) {
                return m768G.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: k */
    public boolean mo691k() {
        return true;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: l */
    public boolean mo690l() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (mo689m() != null || this.f6888f.m718h()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: m */
    public String mo689m() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: n */
    public boolean mo688n() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : mo689m() == null;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: o */
    public String mo687o() {
        try {
            Bundle m768G = m768G();
            String string = m768G != null ? m768G.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (m764K("onActivityResult")) {
            this.f6888f.m716j(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (m764K("onBackPressed")) {
            this.f6888f.m714l();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        m763L();
        super.onCreate(bundle);
        C2793e c2793e = new C2793e(this);
        this.f6888f = c2793e;
        c2793e.m715k(this);
        this.f6888f.m706t(bundle);
        this.f6889g.m6116i(AbstractC0868e.EnumC0869a.ON_CREATE);
        m772C();
        setContentView(m771D());
        m773B();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (m764K("onDestroy")) {
            m765J();
        }
        this.f6889g.m6116i(AbstractC0868e.EnumC0869a.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m764K("onNewIntent")) {
            this.f6888f.m710p(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f6888f.m709q();
        this.f6889g.m6116i(AbstractC0868e.EnumC0869a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f6888f.m708r();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (m764K("onRequestPermissionsResult")) {
            this.f6888f.m707s(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f6889g.m6116i(AbstractC0868e.EnumC0869a.ON_RESUME);
        this.f6888f.m705u();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (m764K("onSaveInstanceState")) {
            this.f6888f.m704v(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f6889g.m6116i(AbstractC0868e.EnumC0869a.ON_START);
        this.f6888f.m703w();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (m764K("onStop")) {
            this.f6888f.m702x();
        }
        this.f6889g.m6116i(AbstractC0868e.EnumC0869a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (m764K("onTrimMemory")) {
            this.f6888f.m701y(i);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (m764K("onUserLeaveHint")) {
            this.f6888f.m700z();
        }
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: p */
    public void mo686p(C2820a c2820a) {
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: q */
    public C2949d mo685q(Activity activity, C2820a c2820a) {
        mo695e();
        return new C2949d(this, c2820a.m599n(), this);
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: r */
    public void mo684r(C2801h c2801h) {
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: s */
    public String mo683s() {
        String dataString;
        if (m766I() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: t */
    public boolean mo682t() {
        try {
            Bundle m768G = m768G();
            if (m768G != null) {
                return m768G.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: u */
    public C2831d mo681u() {
        return C2831d.m562a(getIntent());
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: v */
    public EnumC2814l mo680v() {
        return m770E() == C2796f.EnumC2797a.opaque ? EnumC2814l.surface : EnumC2814l.texture;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: w */
    public InterfaceC2816n mo679w() {
        Drawable m767H = m767H();
        if (m767H != null) {
            return new C2789c(m767H);
        }
        return null;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: x */
    public C2820a mo678x(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: y */
    public EnumC2817o mo677y() {
        return m770E() == C2796f.EnumC2797a.opaque ? EnumC2817o.opaque : EnumC2817o.transparent;
    }

    @Override // io.flutter.embedding.android.C2793e.InterfaceC2795b
    /* renamed from: z */
    public void mo676z(C2804i c2804i) {
    }
}
