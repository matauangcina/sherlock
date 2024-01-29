package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0432c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0704a;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0876k;
import androidx.lifecycle.C0894v;
import androidx.lifecycle.InterfaceC0895w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p014d.C0080h;
import p000a.p039l.p040a.AbstractC0302a;
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public class ActivityC0797d extends ComponentActivity {

    /* renamed from: n */
    boolean f2882n;

    /* renamed from: o */
    boolean f2883o;

    /* renamed from: q */
    boolean f2885q;

    /* renamed from: r */
    boolean f2886r;

    /* renamed from: s */
    int f2887s;

    /* renamed from: t */
    C0080h<String> f2888t;

    /* renamed from: l */
    final C0808h f2880l = C0808h.m6475b(new C0798a());

    /* renamed from: m */
    final C0876k f2881m = new C0876k(this);

    /* renamed from: p */
    boolean f2884p = true;

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    class C0798a extends AbstractC0810j<ActivityC0797d> implements InterfaceC0895w, InterfaceC0432c {
        public C0798a() {
            super(ActivityC0797d.this);
        }

        @Override // androidx.lifecycle.InterfaceC0875j
        /* renamed from: a */
        public AbstractC0868e mo698a() {
            return ActivityC0797d.this.f2881m;
        }

        @Override // androidx.fragment.app.AbstractC0810j, androidx.fragment.app.AbstractC0806f
        /* renamed from: c */
        public View mo6448c(int i) {
            return ActivityC0797d.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC0810j, androidx.fragment.app.AbstractC0806f
        /* renamed from: d */
        public boolean mo6447d() {
            Window window = ActivityC0797d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.InterfaceC0895w
        /* renamed from: f */
        public C0894v mo6025f() {
            return ActivityC0797d.this.mo6025f();
        }

        @Override // androidx.activity.InterfaceC0432c
        /* renamed from: i */
        public OnBackPressedDispatcher mo6484i() {
            return ActivityC0797d.this.mo6484i();
        }

        @Override // androidx.fragment.app.AbstractC0810j
        /* renamed from: k */
        public void mo6443k(Fragment fragment) {
            ActivityC0797d.this.m6488q(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0810j
        /* renamed from: m */
        public LayoutInflater mo6441m() {
            return ActivityC0797d.this.getLayoutInflater().cloneInContext(ActivityC0797d.this);
        }

        @Override // androidx.fragment.app.AbstractC0810j
        /* renamed from: n */
        public boolean mo6440n(Fragment fragment) {
            return !ActivityC0797d.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0810j
        /* renamed from: o */
        public void mo6439o() {
            ActivityC0797d.this.mo6485t();
        }

        @Override // androidx.fragment.app.AbstractC0810j
        /* renamed from: p */
        public ActivityC0797d mo6442l() {
            return ActivityC0797d.this;
        }
    }

    /* renamed from: l */
    static void m6493l(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: o */
    private void m6490o() {
        do {
        } while (m6489p(m6491n(), AbstractC0868e.EnumC0870b.CREATED));
    }

    /* renamed from: p */
    private static boolean m6489p(AbstractC0814m abstractC0814m, AbstractC0868e.EnumC0870b enumC0870b) {
        boolean z = false;
        for (Fragment fragment : abstractC0814m.m6362f0()) {
            if (fragment != null) {
                if (fragment.m6529w() != null) {
                    z |= m6489p(fragment.m6540q(), enumC0870b);
                }
                if (fragment.mo698a().mo6123b().m6128d(AbstractC0868e.EnumC0870b.STARTED)) {
                    fragment.f2799V.m6109p(enumC0870b);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2882n);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2883o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2884p);
        if (getApplication() != null) {
            AbstractC0302a.m8426b(this).mo8425a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2880l.m6456u().m6400M(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: m */
    final View m6492m(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2880l.m6454w(view, str, context, attributeSet);
    }

    /* renamed from: n */
    public AbstractC0814m m6491n() {
        return this.f2880l.m6456u();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f2880l.m6455v();
        int i3 = i >> 16;
        if (i3 == 0) {
            C0704a.InterfaceC0706b m6994k = C0704a.m6994k();
            if (m6994k == null || !m6994k.m6992a(this, i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        int i4 = i3 - 1;
        String m9325e = this.f2888t.m9325e(i4);
        this.f2888t.m9320j(i4);
        if (m9325e == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment m6457t = this.f2880l.m6457t(m9325e);
        if (m6457t != null) {
            m6457t.mo3788Z(i & 65535, i2, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m9325e);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2880l.m6455v();
        this.f2880l.m6473d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f2880l.m6476a(null);
        if (bundle != null) {
            this.f2880l.m6453x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2887s = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2888t = new C0080h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f2888t.m9321i(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f2888t == null) {
            this.f2888t = new C0080h<>();
            this.f2887s = 0;
        }
        super.onCreate(bundle);
        this.f2881m.m6116i(AbstractC0868e.EnumC0869a.ON_CREATE);
        this.f2880l.m6471f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f2880l.m6470g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m6492m = m6492m(view, str, context, attributeSet);
        return m6492m == null ? super.onCreateView(view, str, context, attributeSet) : m6492m;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m6492m = m6492m(null, str, context, attributeSet);
        return m6492m == null ? super.onCreateView(str, context, attributeSet) : m6492m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2880l.m6469h();
        this.f2881m.m6116i(AbstractC0868e.EnumC0869a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2880l.m6468i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.f2880l.m6472e(menuItem);
        }
        return this.f2880l.m6466k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f2880l.m6467j(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f2880l.m6455v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2880l.m6465l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f2883o = false;
        this.f2880l.m6464m();
        this.f2881m.m6116i(AbstractC0868e.EnumC0869a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f2880l.m6463n(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m6486s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? m6487r(view, menu) | this.f2880l.m6462o(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2880l.m6455v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m9325e = this.f2888t.m9325e(i3);
            this.f2888t.m9320j(i3);
            if (m9325e == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment m6457t = this.f2880l.m6457t(m9325e);
            if (m6457t != null) {
                m6457t.m6525y0(i & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m9325e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f2883o = true;
        this.f2880l.m6455v();
        this.f2880l.m6458s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m6490o();
        this.f2881m.m6116i(AbstractC0868e.EnumC0869a.ON_STOP);
        Parcelable m6452y = this.f2880l.m6452y();
        if (m6452y != null) {
            bundle.putParcelable("android:support:fragments", m6452y);
        }
        if (this.f2888t.m9318l() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2887s);
            int[] iArr = new int[this.f2888t.m9318l()];
            String[] strArr = new String[this.f2888t.m9318l()];
            for (int i = 0; i < this.f2888t.m9318l(); i++) {
                iArr[i] = this.f2888t.m9322h(i);
                strArr[i] = this.f2888t.m9317m(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f2884p = false;
        if (!this.f2882n) {
            this.f2882n = true;
            this.f2880l.m6474c();
        }
        this.f2880l.m6455v();
        this.f2880l.m6458s();
        this.f2881m.m6116i(AbstractC0868e.EnumC0869a.ON_START);
        this.f2880l.m6460q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2880l.m6455v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2884p = true;
        m6490o();
        this.f2880l.m6459r();
        this.f2881m.m6116i(AbstractC0868e.EnumC0869a.ON_STOP);
    }

    /* renamed from: q */
    public void m6488q(Fragment fragment) {
    }

    @Deprecated
    /* renamed from: r */
    protected boolean m6487r(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: s */
    protected void m6486s() {
        this.f2881m.m6116i(AbstractC0868e.EnumC0869a.ON_RESUME);
        this.f2880l.m6461p();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f2886r && i != -1) {
            m6493l(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f2886r && i != -1) {
            m6493l(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f2885q && i != -1) {
            m6493l(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f2885q && i != -1) {
            m6493l(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Deprecated
    /* renamed from: t */
    public void mo6485t() {
        invalidateOptionsMenu();
    }
}
