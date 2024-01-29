package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0504e;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0578b1;
import androidx.appcompat.widget.C0588c1;
import androidx.appcompat.widget.C0608j;
import androidx.appcompat.widget.C0665w0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0587c0;
import androidx.appcompat.widget.InterfaceC0599g0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0704a;
import androidx.core.app.C0715f;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0875j;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p000a.p001a.C0000a;
import p000a.p001a.C0002c;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0008i;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p001a.p007n.AbstractC0030b;
import p000a.p001a.p007n.C0033d;
import p000a.p001a.p007n.C0035f;
import p000a.p001a.p007n.C0037g;
import p000a.p001a.p007n.Window$CallbackC0042i;
import p000a.p014d.C0066a;
import p000a.p019g.p028k.C0197a0;
import p000a.p019g.p028k.C0237e;
import p000a.p019g.p028k.C0239f;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.C0267w;
import p000a.p019g.p028k.C0272y;
import p000a.p019g.p028k.InterfaceC0249p;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0456f extends AbstractC0455e implements C0507g.InterfaceC0508a, LayoutInflater.Factory2 {

    /* renamed from: f0 */
    private static final Map<Class<?>, Integer> f1297f0 = new C0066a();

    /* renamed from: g0 */
    private static final boolean f1298g0;

    /* renamed from: h0 */
    private static final int[] f1299h0;

    /* renamed from: i0 */
    private static boolean f1300i0;

    /* renamed from: j0 */
    private static final boolean f1301j0;

    /* renamed from: A */
    private ViewGroup f1302A;

    /* renamed from: B */
    private TextView f1303B;

    /* renamed from: C */
    private View f1304C;

    /* renamed from: D */
    private boolean f1305D;

    /* renamed from: E */
    private boolean f1306E;

    /* renamed from: F */
    boolean f1307F;

    /* renamed from: G */
    boolean f1308G;

    /* renamed from: H */
    boolean f1309H;

    /* renamed from: I */
    boolean f1310I;

    /* renamed from: J */
    boolean f1311J;

    /* renamed from: K */
    private boolean f1312K;

    /* renamed from: L */
    private C0474o[] f1313L;

    /* renamed from: M */
    private C0474o f1314M;

    /* renamed from: N */
    private boolean f1315N;

    /* renamed from: O */
    private boolean f1316O;

    /* renamed from: P */
    private boolean f1317P;

    /* renamed from: Q */
    private boolean f1318Q;

    /* renamed from: R */
    boolean f1319R;

    /* renamed from: S */
    private int f1320S;

    /* renamed from: T */
    private int f1321T;

    /* renamed from: U */
    private boolean f1322U;

    /* renamed from: V */
    private boolean f1323V;

    /* renamed from: W */
    private AbstractC0470l f1324W;

    /* renamed from: X */
    private AbstractC0470l f1325X;

    /* renamed from: Y */
    boolean f1326Y;

    /* renamed from: Z */
    int f1327Z;

    /* renamed from: a0 */
    private final Runnable f1328a0;

    /* renamed from: b0 */
    private boolean f1329b0;

    /* renamed from: c0 */
    private Rect f1330c0;

    /* renamed from: d0 */
    private Rect f1331d0;

    /* renamed from: e0 */
    private AppCompatViewInflater f1332e0;

    /* renamed from: i */
    final Object f1333i;

    /* renamed from: j */
    final Context f1334j;

    /* renamed from: k */
    Window f1335k;

    /* renamed from: l */
    private C0468j f1336l;

    /* renamed from: m */
    final InterfaceC0454d f1337m;

    /* renamed from: n */
    AbstractC0447a f1338n;

    /* renamed from: o */
    MenuInflater f1339o;

    /* renamed from: p */
    private CharSequence f1340p;

    /* renamed from: q */
    private InterfaceC0587c0 f1341q;

    /* renamed from: r */
    private C0465h f1342r;

    /* renamed from: s */
    private C0475p f1343s;

    /* renamed from: t */
    AbstractC0030b f1344t;

    /* renamed from: u */
    ActionBarContextView f1345u;

    /* renamed from: v */
    PopupWindow f1346v;

    /* renamed from: w */
    Runnable f1347w;

    /* renamed from: x */
    C0267w f1348x;

    /* renamed from: y */
    private boolean f1349y;

    /* renamed from: z */
    private boolean f1350z;

    /* renamed from: androidx.appcompat.app.f$a */
    /* loaded from: classes.dex */
    static class C0457a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1351a;

        C0457a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1351a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m7981a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!m7981a(th)) {
                this.f1351a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f1351a.uncaughtException(thread, notFoundException);
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    /* loaded from: classes.dex */
    class RunnableC0458b implements Runnable {
        RunnableC0458b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f = LayoutInflater$Factory2C0456f.this;
            if ((layoutInflater$Factory2C0456f.f1327Z & 1) != 0) {
                layoutInflater$Factory2C0456f.m8029V(0);
            }
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f2 = LayoutInflater$Factory2C0456f.this;
            if ((layoutInflater$Factory2C0456f2.f1327Z & 4096) != 0) {
                layoutInflater$Factory2C0456f2.m8029V(108);
            }
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f3 = LayoutInflater$Factory2C0456f.this;
            layoutInflater$Factory2C0456f3.f1326Y = false;
            layoutInflater$Factory2C0456f3.f1327Z = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$c */
    /* loaded from: classes.dex */
    public class C0459c implements InterfaceC0249p {
        C0459c() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0249p
        /* renamed from: a */
        public C0197a0 mo2660a(View view, C0197a0 c0197a0) {
            int m8850k = c0197a0.m8850k();
            int m8039L0 = LayoutInflater$Factory2C0456f.this.m8039L0(m8850k);
            if (m8850k != m8039L0) {
                c0197a0 = c0197a0.m8848m(c0197a0.m8852i(), m8039L0, c0197a0.m8851j(), c0197a0.m8853h());
            }
            return C0252s.m8643T(view, c0197a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$d */
    /* loaded from: classes.dex */
    public class C0460d implements InterfaceC0599g0.InterfaceC0600a {
        C0460d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0599g0.InterfaceC0600a
        /* renamed from: a */
        public void mo7450a(Rect rect) {
            rect.top = LayoutInflater$Factory2C0456f.this.m8039L0(rect.top);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$e */
    /* loaded from: classes.dex */
    public class C0461e implements ContentFrameLayout.InterfaceC0544a {
        C0461e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0544a
        /* renamed from: a */
        public void mo7677a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0544a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0456f.this.m8031T();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$f */
    /* loaded from: classes.dex */
    public class RunnableC0462f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        /* loaded from: classes.dex */
        class C0463a extends C0272y {
            C0463a() {
            }

            @Override // p000a.p019g.p028k.InterfaceC0271x
            /* renamed from: b */
            public void mo7171b(View view) {
                LayoutInflater$Factory2C0456f.this.f1345u.setAlpha(1.0f);
                LayoutInflater$Factory2C0456f.this.f1348x.m8533f(null);
                LayoutInflater$Factory2C0456f.this.f1348x = null;
            }

            @Override // p000a.p019g.p028k.C0272y, p000a.p019g.p028k.InterfaceC0271x
            /* renamed from: c */
            public void mo7170c(View view) {
                LayoutInflater$Factory2C0456f.this.f1345u.setVisibility(0);
            }
        }

        RunnableC0462f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f = LayoutInflater$Factory2C0456f.this;
            layoutInflater$Factory2C0456f.f1346v.showAtLocation(layoutInflater$Factory2C0456f.f1345u, 55, 0, 0);
            LayoutInflater$Factory2C0456f.this.m8028W();
            if (!LayoutInflater$Factory2C0456f.this.m8054D0()) {
                LayoutInflater$Factory2C0456f.this.f1345u.setAlpha(1.0f);
                LayoutInflater$Factory2C0456f.this.f1345u.setVisibility(0);
                return;
            }
            LayoutInflater$Factory2C0456f.this.f1345u.setAlpha(0.0f);
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f2 = LayoutInflater$Factory2C0456f.this;
            C0267w m8632c = C0252s.m8632c(layoutInflater$Factory2C0456f2.f1345u);
            m8632c.m8538a(1.0f);
            layoutInflater$Factory2C0456f2.f1348x = m8632c;
            LayoutInflater$Factory2C0456f.this.f1348x.m8533f(new C0463a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$g */
    /* loaded from: classes.dex */
    public class C0464g extends C0272y {
        C0464g() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: b */
        public void mo7171b(View view) {
            LayoutInflater$Factory2C0456f.this.f1345u.setAlpha(1.0f);
            LayoutInflater$Factory2C0456f.this.f1348x.m8533f(null);
            LayoutInflater$Factory2C0456f.this.f1348x = null;
        }

        @Override // p000a.p019g.p028k.C0272y, p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: c */
        public void mo7170c(View view) {
            LayoutInflater$Factory2C0456f.this.f1345u.setVisibility(0);
            LayoutInflater$Factory2C0456f.this.f1345u.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C0456f.this.f1345u.getParent() instanceof View) {
                C0252s.m8629d0((View) LayoutInflater$Factory2C0456f.this.f1345u.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$h */
    /* loaded from: classes.dex */
    public final class C0465h implements InterfaceC0522m.InterfaceC0523a {
        C0465h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: b */
        public void mo7494b(C0507g c0507g, boolean z) {
            LayoutInflater$Factory2C0456f.this.m8037N(c0507g);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: c */
        public boolean mo7493c(C0507g c0507g) {
            Window.Callback m8016f0 = LayoutInflater$Factory2C0456f.this.m8016f0();
            if (m8016f0 != null) {
                m8016f0.onMenuOpened(108, c0507g);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$i */
    /* loaded from: classes.dex */
    public class C0466i implements AbstractC0030b.InterfaceC0031a {

        /* renamed from: a */
        private AbstractC0030b.InterfaceC0031a f1360a;

        /* renamed from: androidx.appcompat.app.f$i$a */
        /* loaded from: classes.dex */
        class C0467a extends C0272y {
            C0467a() {
            }

            @Override // p000a.p019g.p028k.InterfaceC0271x
            /* renamed from: b */
            public void mo7171b(View view) {
                LayoutInflater$Factory2C0456f.this.f1345u.setVisibility(8);
                LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f = LayoutInflater$Factory2C0456f.this;
                PopupWindow popupWindow = layoutInflater$Factory2C0456f.f1346v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0456f.f1345u.getParent() instanceof View) {
                    C0252s.m8629d0((View) LayoutInflater$Factory2C0456f.this.f1345u.getParent());
                }
                LayoutInflater$Factory2C0456f.this.f1345u.removeAllViews();
                LayoutInflater$Factory2C0456f.this.f1348x.m8533f(null);
                LayoutInflater$Factory2C0456f.this.f1348x = null;
            }
        }

        public C0466i(AbstractC0030b.InterfaceC0031a interfaceC0031a) {
            this.f1360a = interfaceC0031a;
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: a */
        public boolean mo7980a(AbstractC0030b abstractC0030b, Menu menu) {
            return this.f1360a.mo7980a(abstractC0030b, menu);
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: b */
        public void mo7979b(AbstractC0030b abstractC0030b) {
            this.f1360a.mo7979b(abstractC0030b);
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f = LayoutInflater$Factory2C0456f.this;
            if (layoutInflater$Factory2C0456f.f1346v != null) {
                layoutInflater$Factory2C0456f.f1335k.getDecorView().removeCallbacks(LayoutInflater$Factory2C0456f.this.f1347w);
            }
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f2 = LayoutInflater$Factory2C0456f.this;
            if (layoutInflater$Factory2C0456f2.f1345u != null) {
                layoutInflater$Factory2C0456f2.m8028W();
                LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f3 = LayoutInflater$Factory2C0456f.this;
                C0267w m8632c = C0252s.m8632c(layoutInflater$Factory2C0456f3.f1345u);
                m8632c.m8538a(0.0f);
                layoutInflater$Factory2C0456f3.f1348x = m8632c;
                LayoutInflater$Factory2C0456f.this.f1348x.m8533f(new C0467a());
            }
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f4 = LayoutInflater$Factory2C0456f.this;
            InterfaceC0454d interfaceC0454d = layoutInflater$Factory2C0456f4.f1337m;
            if (interfaceC0454d != null) {
                interfaceC0454d.mo7962d(layoutInflater$Factory2C0456f4.f1344t);
            }
            LayoutInflater$Factory2C0456f.this.f1344t = null;
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: c */
        public boolean mo7978c(AbstractC0030b abstractC0030b, MenuItem menuItem) {
            return this.f1360a.mo7978c(abstractC0030b, menuItem);
        }

        @Override // p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a
        /* renamed from: d */
        public boolean mo7977d(AbstractC0030b abstractC0030b, Menu menu) {
            return this.f1360a.mo7977d(abstractC0030b, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$j */
    /* loaded from: classes.dex */
    public class C0468j extends Window$CallbackC0042i {
        C0468j(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m7976b(ActionMode.Callback callback) {
            C0035f.C0036a c0036a = new C0035f.C0036a(LayoutInflater$Factory2C0456f.this.f1334j, callback);
            AbstractC0030b m8051F0 = LayoutInflater$Factory2C0456f.this.m8051F0(c0036a);
            if (m8051F0 != null) {
                return c0036a.m9493e(m8051F0);
            }
            return null;
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0456f.this.m8030U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C0456f.this.m7997r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0507g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0456f.this.m7991u0(i);
            return true;
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0456f.this.m7989v0(i);
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0507g c0507g = menu instanceof C0507g ? (C0507g) menu : null;
            if (i == 0 && c0507g == null) {
                return false;
            }
            if (c0507g != null) {
                c0507g.m7833a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0507g != null) {
                c0507g.m7833a0(false);
            }
            return onPreparePanel;
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0507g c0507g;
            C0474o m8019d0 = LayoutInflater$Factory2C0456f.this.m8019d0(0, true);
            if (m8019d0 == null || (c0507g = m8019d0.f1381j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, c0507g, i);
            }
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflater$Factory2C0456f.this.m8005m0() ? m7976b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p000a.p001a.p007n.Window$CallbackC0042i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (LayoutInflater$Factory2C0456f.this.m8005m0() && i == 0) ? m7976b(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$k */
    /* loaded from: classes.dex */
    public class C0469k extends AbstractC0470l {

        /* renamed from: c */
        private final PowerManager f1364c;

        C0469k(Context context) {
            super();
            this.f1364c = (PowerManager) context.getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0456f.AbstractC0470l
        /* renamed from: b */
        IntentFilter mo7973b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0456f.AbstractC0470l
        /* renamed from: c */
        public int mo7972c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f1364c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0456f.AbstractC0470l
        /* renamed from: d */
        public void mo7971d() {
            LayoutInflater$Factory2C0456f.this.mo8020d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$l */
    /* loaded from: classes.dex */
    public abstract class AbstractC0470l {

        /* renamed from: a */
        private BroadcastReceiver f1366a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.f$l$a */
        /* loaded from: classes.dex */
        public class C0471a extends BroadcastReceiver {
            C0471a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC0470l.this.mo7971d();
            }
        }

        AbstractC0470l() {
        }

        /* renamed from: a */
        void m7975a() {
            BroadcastReceiver broadcastReceiver = this.f1366a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C0456f.this.f1334j.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1366a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo7973b();

        /* renamed from: c */
        abstract int mo7972c();

        /* renamed from: d */
        abstract void mo7971d();

        /* renamed from: e */
        void m7974e() {
            m7975a();
            IntentFilter mo7973b = mo7973b();
            if (mo7973b == null || mo7973b.countActions() == 0) {
                return;
            }
            if (this.f1366a == null) {
                this.f1366a = new C0471a();
            }
            LayoutInflater$Factory2C0456f.this.f1334j.registerReceiver(this.f1366a, mo7973b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$m */
    /* loaded from: classes.dex */
    public class C0472m extends AbstractC0470l {

        /* renamed from: c */
        private final C0486k f1369c;

        C0472m(C0486k c0486k) {
            super();
            this.f1369c = c0486k;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0456f.AbstractC0470l
        /* renamed from: b */
        IntentFilter mo7973b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0456f.AbstractC0470l
        /* renamed from: c */
        public int mo7972c() {
            return this.f1369c.m7940d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0456f.AbstractC0470l
        /* renamed from: d */
        public void mo7971d() {
            LayoutInflater$Factory2C0456f.this.mo8020d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$n */
    /* loaded from: classes.dex */
    public class C0473n extends ContentFrameLayout {
        public C0473n(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m7970c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0456f.this.m8030U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m7970c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflater$Factory2C0456f.this.m8035P(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0010a.m9577d(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.f$o */
    /* loaded from: classes.dex */
    public static final class C0474o {

        /* renamed from: a */
        int f1372a;

        /* renamed from: b */
        int f1373b;

        /* renamed from: c */
        int f1374c;

        /* renamed from: d */
        int f1375d;

        /* renamed from: e */
        int f1376e;

        /* renamed from: f */
        int f1377f;

        /* renamed from: g */
        ViewGroup f1378g;

        /* renamed from: h */
        View f1379h;

        /* renamed from: i */
        View f1380i;

        /* renamed from: j */
        C0507g f1381j;

        /* renamed from: k */
        C0504e f1382k;

        /* renamed from: l */
        Context f1383l;

        /* renamed from: m */
        boolean f1384m;

        /* renamed from: n */
        boolean f1385n;

        /* renamed from: o */
        boolean f1386o;

        /* renamed from: p */
        public boolean f1387p;

        /* renamed from: q */
        boolean f1388q = false;

        /* renamed from: r */
        boolean f1389r;

        /* renamed from: s */
        Bundle f1390s;

        C0474o(int i) {
            this.f1372a = i;
        }

        /* renamed from: a */
        InterfaceC0524n m7969a(InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
            if (this.f1381j == null) {
                return null;
            }
            if (this.f1382k == null) {
                C0504e c0504e = new C0504e(this.f1383l, C0006g.abc_list_menu_item_layout);
                this.f1382k = c0504e;
                c0504e.mo7580k(interfaceC0523a);
                this.f1381j.m7832b(this.f1382k);
            }
            return this.f1382k.m7862c(this.f1378g);
        }

        /* renamed from: b */
        public boolean m7968b() {
            if (this.f1379h == null) {
                return false;
            }
            return this.f1380i != null || this.f1382k.m7863a().getCount() > 0;
        }

        /* renamed from: c */
        void m7967c(C0507g c0507g) {
            C0504e c0504e;
            C0507g c0507g2 = this.f1381j;
            if (c0507g == c0507g2) {
                return;
            }
            if (c0507g2 != null) {
                c0507g2.m7845O(this.f1382k);
            }
            this.f1381j = c0507g;
            if (c0507g == null || (c0504e = this.f1382k) == null) {
                return;
            }
            c0507g.m7832b(c0504e);
        }

        /* renamed from: d */
        void m7966d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0000a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0000a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0008i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0033d c0033d = new C0033d(context, 0);
            c0033d.getTheme().setTo(newTheme);
            this.f1383l = c0033d;
            TypedArray obtainStyledAttributes = c0033d.obtainStyledAttributes(C0009j.AppCompatTheme);
            this.f1373b = obtainStyledAttributes.getResourceId(C0009j.AppCompatTheme_panelBackground, 0);
            this.f1377f = obtainStyledAttributes.getResourceId(C0009j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$p */
    /* loaded from: classes.dex */
    public final class C0475p implements InterfaceC0522m.InterfaceC0523a {
        C0475p() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: b */
        public void mo7494b(C0507g c0507g, boolean z) {
            C0507g mo7740D = c0507g.mo7740D();
            boolean z2 = mo7740D != c0507g;
            LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f = LayoutInflater$Factory2C0456f.this;
            if (z2) {
                c0507g = mo7740D;
            }
            C0474o m8025Z = layoutInflater$Factory2C0456f.m8025Z(c0507g);
            if (m8025Z != null) {
                if (!z2) {
                    LayoutInflater$Factory2C0456f.this.m8034Q(m8025Z, z);
                    return;
                }
                LayoutInflater$Factory2C0456f.this.m8038M(m8025Z.f1372a, m8025Z, mo7740D);
                LayoutInflater$Factory2C0456f.this.m8034Q(m8025Z, true);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: c */
        public boolean mo7493c(C0507g c0507g) {
            Window.Callback m8016f0;
            if (c0507g == null) {
                LayoutInflater$Factory2C0456f layoutInflater$Factory2C0456f = LayoutInflater$Factory2C0456f.this;
                if (!layoutInflater$Factory2C0456f.f1307F || (m8016f0 = layoutInflater$Factory2C0456f.m8016f0()) == null || LayoutInflater$Factory2C0456f.this.f1319R) {
                    return true;
                }
                m8016f0.onMenuOpened(108, c0507g);
                return true;
            }
            return true;
        }
    }

    static {
        boolean z = false;
        f1298g0 = Build.VERSION.SDK_INT < 21;
        f1299h0 = new int[]{16842836};
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f1301j0 = z;
        if (!f1298g0 || f1300i0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0457a(Thread.getDefaultUncaughtExceptionHandler()));
        f1300i0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0456f(Activity activity, InterfaceC0454d interfaceC0454d) {
        this(activity, null, interfaceC0454d, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0456f(Dialog dialog, InterfaceC0454d interfaceC0454d) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0454d, dialog);
    }

    private LayoutInflater$Factory2C0456f(Context context, Window window, InterfaceC0454d interfaceC0454d, Object obj) {
        Integer num;
        ActivityC0453c m8045I0;
        this.f1348x = null;
        this.f1349y = true;
        this.f1320S = -100;
        this.f1328a0 = new RunnableC0458b();
        this.f1334j = context;
        this.f1337m = interfaceC0454d;
        this.f1333i = obj;
        if (this.f1320S == -100 && (obj instanceof Dialog) && (m8045I0 = m8045I0()) != null) {
            this.f1320S = m8045I0.m8075u().mo8010k();
        }
        if (this.f1320S == -100 && (num = f1297f0.get(this.f1333i.getClass())) != null) {
            this.f1320S = num.intValue();
            f1297f0.remove(this.f1333i.getClass());
        }
        if (window != null) {
            m8042K(window);
        }
        C0608j.m7405h();
    }

    /* renamed from: A0 */
    private boolean m8060A0(C0474o c0474o, KeyEvent keyEvent) {
        InterfaceC0587c0 interfaceC0587c0;
        InterfaceC0587c0 interfaceC0587c02;
        InterfaceC0587c0 interfaceC0587c03;
        if (this.f1319R) {
            return false;
        }
        if (c0474o.f1384m) {
            return true;
        }
        C0474o c0474o2 = this.f1314M;
        if (c0474o2 != null && c0474o2 != c0474o) {
            m8034Q(c0474o2, false);
        }
        Window.Callback m8016f0 = m8016f0();
        if (m8016f0 != null) {
            c0474o.f1380i = m8016f0.onCreatePanelView(c0474o.f1372a);
        }
        int i = c0474o.f1372a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0587c03 = this.f1341q) != null) {
            interfaceC0587c03.mo7490d();
        }
        if (c0474o.f1380i == null && (!z || !(m7983y0() instanceof C0479i))) {
            if (c0474o.f1381j == null || c0474o.f1389r) {
                if (c0474o.f1381j == null && (!m8011j0(c0474o) || c0474o.f1381j == null)) {
                    return false;
                }
                if (z && this.f1341q != null) {
                    if (this.f1342r == null) {
                        this.f1342r = new C0465h();
                    }
                    this.f1341q.mo7492a(c0474o.f1381j, this.f1342r);
                }
                c0474o.f1381j.m7827d0();
                if (!m8016f0.onCreatePanelMenu(c0474o.f1372a, c0474o.f1381j)) {
                    c0474o.m7967c(null);
                    if (z && (interfaceC0587c0 = this.f1341q) != null) {
                        interfaceC0587c0.mo7492a(null, this.f1342r);
                    }
                    return false;
                }
                c0474o.f1389r = false;
            }
            c0474o.f1381j.m7827d0();
            Bundle bundle = c0474o.f1390s;
            if (bundle != null) {
                c0474o.f1381j.m7844P(bundle);
                c0474o.f1390s = null;
            }
            if (!m8016f0.onPreparePanel(0, c0474o.f1380i, c0474o.f1381j)) {
                if (z && (interfaceC0587c02 = this.f1341q) != null) {
                    interfaceC0587c02.mo7492a(null, this.f1342r);
                }
                c0474o.f1381j.m7829c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0474o.f1387p = z2;
            c0474o.f1381j.setQwertyMode(z2);
            c0474o.f1381j.m7829c0();
        }
        c0474o.f1384m = true;
        c0474o.f1385n = false;
        this.f1314M = c0474o;
        return true;
    }

    /* renamed from: B0 */
    private void m8058B0(C0507g c0507g, boolean z) {
        InterfaceC0587c0 interfaceC0587c0 = this.f1341q;
        if (interfaceC0587c0 == null || !interfaceC0587c0.mo7486h() || (ViewConfiguration.get(this.f1334j).hasPermanentMenuKey() && !this.f1341q.mo7489e())) {
            C0474o m8019d0 = m8019d0(0, true);
            m8019d0.f1388q = true;
            m8034Q(m8019d0, false);
            m7985x0(m8019d0, null);
            return;
        }
        Window.Callback m8016f0 = m8016f0();
        if (this.f1341q.mo7491b() && z) {
            this.f1341q.mo7488f();
            if (this.f1319R) {
                return;
            }
            m8016f0.onPanelClosed(108, m8019d0(0, true).f1381j);
        } else if (m8016f0 == null || this.f1319R) {
        } else {
            if (this.f1326Y && (this.f1327Z & 1) != 0) {
                this.f1335k.getDecorView().removeCallbacks(this.f1328a0);
                this.f1328a0.run();
            }
            C0474o m8019d02 = m8019d0(0, true);
            C0507g c0507g2 = m8019d02.f1381j;
            if (c0507g2 == null || m8019d02.f1389r || !m8016f0.onPreparePanel(0, m8019d02.f1380i, c0507g2)) {
                return;
            }
            m8016f0.onMenuOpened(108, m8019d02.f1381j);
            this.f1341q.mo7487g();
        }
    }

    /* renamed from: C0 */
    private int m8056C0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i;
        }
    }

    /* renamed from: E0 */
    private boolean m8053E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1335k.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0252s.m8651L((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: H0 */
    private void m8047H0() {
        if (this.f1350z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    private boolean m8046I(boolean z) {
        if (this.f1319R) {
            return false;
        }
        int m8040L = m8040L();
        boolean m8043J0 = m8043J0(m8003n0(m8040L), z);
        if (m8040L == 0) {
            m8021c0().m7974e();
        } else {
            AbstractC0470l abstractC0470l = this.f1324W;
            if (abstractC0470l != null) {
                abstractC0470l.m7975a();
            }
        }
        if (m8040L == 3) {
            m8023b0().m7974e();
        } else {
            AbstractC0470l abstractC0470l2 = this.f1325X;
            if (abstractC0470l2 != null) {
                abstractC0470l2.m7975a();
            }
        }
        return m8043J0;
    }

    /* renamed from: I0 */
    private ActivityC0453c m8045I0() {
        for (Context context = this.f1334j; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0453c) {
                return (ActivityC0453c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: J */
    private void m8044J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1302A.findViewById(16908290);
        View decorView = this.f1335k.getDecorView();
        contentFrameLayout.m7678b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1334j.obtainStyledAttributes(C0009j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0009j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: J0 */
    private boolean m8043J0(int i, boolean z) {
        int i2 = this.f1334j.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean m8007l0 = m8007l0();
        boolean z3 = false;
        if ((f1301j0 || i3 != i2) && !m8007l0 && Build.VERSION.SDK_INT >= 17 && !this.f1316O && (this.f1333i instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i3;
            try {
                ((ContextThemeWrapper) this.f1333i).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f1334j.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i3 && z && !m8007l0 && this.f1316O && (Build.VERSION.SDK_INT >= 17 || this.f1317P)) {
            Object obj = this.f1333i;
            if (obj instanceof Activity) {
                C0704a.m6993l((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i3) {
            z2 = z3;
        } else {
            m8041K0(i3, m8007l0);
        }
        if (z2) {
            Object obj2 = this.f1333i;
            if (obj2 instanceof ActivityC0453c) {
                ((ActivityC0453c) obj2).m8072x(i);
            }
        }
        return z2;
    }

    /* renamed from: K */
    private void m8042K(Window window) {
        if (this.f1335k != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C0468j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C0468j c0468j = new C0468j(callback);
        this.f1336l = c0468j;
        window.setCallback(c0468j);
        C0665w0 m7214t = C0665w0.m7214t(this.f1334j, null, f1299h0);
        Drawable m7226h = m7214t.m7226h(0);
        if (m7226h != null) {
            window.setBackgroundDrawable(m7226h);
        }
        m7214t.m7212v();
        this.f1335k = window;
    }

    /* renamed from: K0 */
    private void m8041K0(int i, boolean z) {
        Resources resources = this.f1334j.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        if (Build.VERSION.SDK_INT < 26) {
            C0478h.m7958a(resources);
        }
        int i2 = this.f1321T;
        if (i2 != 0) {
            this.f1334j.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.f1334j.getTheme().applyStyle(this.f1321T, true);
            }
        }
        if (z) {
            Object obj = this.f1333i;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0875j) {
                    if (!((InterfaceC0875j) activity).mo698a().mo6123b().m6128d(AbstractC0868e.EnumC0870b.STARTED)) {
                        return;
                    }
                } else if (!this.f1318Q) {
                    return;
                }
                activity.onConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: L */
    private int m8040L() {
        int i = this.f1320S;
        return i != -100 ? i : AbstractC0455e.m8065j();
    }

    /* renamed from: O */
    private void m8036O() {
        AbstractC0470l abstractC0470l = this.f1324W;
        if (abstractC0470l != null) {
            abstractC0470l.m7975a();
        }
        AbstractC0470l abstractC0470l2 = this.f1325X;
        if (abstractC0470l2 != null) {
            abstractC0470l2.m7975a();
        }
    }

    /* renamed from: R */
    private ViewGroup m8033R() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1334j.obtainStyledAttributes(C0009j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C0009j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowNoTitle, false)) {
            mo8061A(1);
        } else if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionBar, false)) {
            mo8061A(108);
        }
        if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionBarOverlay, false)) {
            mo8061A(109);
        }
        if (obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_windowActionModeOverlay, false)) {
            mo8061A(10);
        }
        this.f1310I = obtainStyledAttributes.getBoolean(C0009j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        m8026Y();
        this.f1335k.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1334j);
        if (this.f1311J) {
            viewGroup = (ViewGroup) from.inflate(this.f1309H ? C0006g.abc_screen_simple_overlay_action_mode : C0006g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C0252s.m8601r0(viewGroup, new C0459c());
            } else {
                ((InterfaceC0599g0) viewGroup).setOnFitSystemWindowsListener(new C0460d());
            }
        } else if (this.f1310I) {
            viewGroup = (ViewGroup) from.inflate(C0006g.abc_dialog_title_material, (ViewGroup) null);
            this.f1308G = false;
            this.f1307F = false;
        } else if (this.f1307F) {
            TypedValue typedValue = new TypedValue();
            this.f1334j.getTheme().resolveAttribute(C0000a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0033d(this.f1334j, typedValue.resourceId) : this.f1334j).inflate(C0006g.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0587c0 interfaceC0587c0 = (InterfaceC0587c0) viewGroup.findViewById(C0005f.decor_content_parent);
            this.f1341q = interfaceC0587c0;
            interfaceC0587c0.setWindowCallback(m8016f0());
            if (this.f1308G) {
                this.f1341q.mo7485k(109);
            }
            if (this.f1305D) {
                this.f1341q.mo7485k(2);
            }
            if (this.f1306E) {
                this.f1341q.mo7485k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1307F + ", windowActionBarOverlay: " + this.f1308G + ", android:windowIsFloating: " + this.f1310I + ", windowActionModeOverlay: " + this.f1309H + ", windowNoTitle: " + this.f1311J + " }");
        }
        if (this.f1341q == null) {
            this.f1303B = (TextView) viewGroup.findViewById(C0005f.title);
        }
        C0588c1.m7481c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0005f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1335k.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1335k.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0461e());
        return viewGroup;
    }

    /* renamed from: X */
    private void m8027X() {
        if (this.f1350z) {
            return;
        }
        this.f1302A = m8033R();
        CharSequence m8018e0 = m8018e0();
        if (!TextUtils.isEmpty(m8018e0)) {
            InterfaceC0587c0 interfaceC0587c0 = this.f1341q;
            if (interfaceC0587c0 != null) {
                interfaceC0587c0.setWindowTitle(m8018e0);
            } else if (m7983y0() != null) {
                m7983y0().mo7916t(m8018e0);
            } else {
                TextView textView = this.f1303B;
                if (textView != null) {
                    textView.setText(m8018e0);
                }
            }
        }
        m8044J();
        m7987w0(this.f1302A);
        this.f1350z = true;
        C0474o m8019d0 = m8019d0(0, false);
        if (this.f1319R) {
            return;
        }
        if (m8019d0 == null || m8019d0.f1381j == null) {
            m8009k0(108);
        }
    }

    /* renamed from: Y */
    private void m8026Y() {
        if (this.f1335k == null) {
            Object obj = this.f1333i;
            if (obj instanceof Activity) {
                m8042K(((Activity) obj).getWindow());
            }
        }
        if (this.f1335k == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: b0 */
    private AbstractC0470l m8023b0() {
        if (this.f1325X == null) {
            this.f1325X = new C0469k(this.f1334j);
        }
        return this.f1325X;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m8015g0() {
        /*
            r3 = this;
            r3.m8027X()
            boolean r0 = r3.f1307F
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f1338n
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f1333i
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            java.lang.Object r1 = r3.f1333i
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f1308G
            r0.<init>(r1, r2)
        L1d:
            r3.f1338n = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.l r0 = new androidx.appcompat.app.l
            java.lang.Object r1 = r3.f1333i
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f1338n
            if (r0 == 0) goto L37
            boolean r1 = r3.f1329b0
            r0.mo7918r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0456f.m8015g0():void");
    }

    /* renamed from: h0 */
    private boolean m8014h0(C0474o c0474o) {
        View view = c0474o.f1380i;
        if (view != null) {
            c0474o.f1379h = view;
            return true;
        } else if (c0474o.f1381j == null) {
            return false;
        } else {
            if (this.f1343s == null) {
                this.f1343s = new C0475p();
            }
            View view2 = (View) c0474o.m7969a(this.f1343s);
            c0474o.f1379h = view2;
            return view2 != null;
        }
    }

    /* renamed from: i0 */
    private boolean m8012i0(C0474o c0474o) {
        c0474o.m7966d(m8024a0());
        c0474o.f1378g = new C0473n(c0474o.f1383l);
        c0474o.f1374c = 81;
        return true;
    }

    /* renamed from: j0 */
    private boolean m8011j0(C0474o c0474o) {
        Context context = this.f1334j;
        int i = c0474o.f1372a;
        if ((i == 0 || i == 108) && this.f1341q != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0000a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0033d c0033d = new C0033d(context, 0);
                c0033d.getTheme().setTo(theme2);
                context = c0033d;
            }
        }
        C0507g c0507g = new C0507g(context);
        c0507g.mo7736R(this);
        c0474o.m7967c(c0507g);
        return true;
    }

    /* renamed from: k0 */
    private void m8009k0(int i) {
        this.f1327Z = (1 << i) | this.f1327Z;
        if (this.f1326Y) {
            return;
        }
        C0252s.m8638Y(this.f1335k.getDecorView(), this.f1328a0);
        this.f1326Y = true;
    }

    /* renamed from: l0 */
    private boolean m8007l0() {
        if (!this.f1323V && (this.f1333i instanceof Activity)) {
            PackageManager packageManager = this.f1334j.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f1334j, this.f1333i.getClass()), 0);
                this.f1322U = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f1322U = false;
            }
        }
        this.f1323V = true;
        return this.f1322U;
    }

    /* renamed from: q0 */
    private boolean m7999q0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0474o m8019d0 = m8019d0(i, true);
            if (m8019d0.f1386o) {
                return false;
            }
            return m8060A0(m8019d0, keyEvent);
        }
        return false;
    }

    /* renamed from: t0 */
    private boolean m7993t0(int i, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0587c0 interfaceC0587c0;
        if (this.f1344t != null) {
            return false;
        }
        boolean z2 = true;
        C0474o m8019d0 = m8019d0(i, true);
        if (i != 0 || (interfaceC0587c0 = this.f1341q) == null || !interfaceC0587c0.mo7486h() || ViewConfiguration.get(this.f1334j).hasPermanentMenuKey()) {
            if (m8019d0.f1386o || m8019d0.f1385n) {
                boolean z3 = m8019d0.f1386o;
                m8034Q(m8019d0, true);
                z2 = z3;
            } else {
                if (m8019d0.f1384m) {
                    if (m8019d0.f1389r) {
                        m8019d0.f1384m = false;
                        z = m8060A0(m8019d0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m7985x0(m8019d0, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.f1341q.mo7491b()) {
            z2 = this.f1341q.mo7488f();
        } else {
            if (!this.f1319R && m8060A0(m8019d0, keyEvent)) {
                z2 = this.f1341q.mo7487g();
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f1334j.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: x0 */
    private void m7985x0(C0474o c0474o, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0474o.f1386o || this.f1319R) {
            return;
        }
        if (c0474o.f1372a == 0) {
            if ((this.f1334j.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m8016f0 = m8016f0();
        if (m8016f0 != null && !m8016f0.onMenuOpened(c0474o.f1372a, c0474o.f1381j)) {
            m8034Q(c0474o, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1334j.getSystemService("window");
        if (windowManager != null && m8060A0(c0474o, keyEvent)) {
            if (c0474o.f1378g == null || c0474o.f1388q) {
                ViewGroup viewGroup = c0474o.f1378g;
                if (viewGroup == null) {
                    if (!m8012i0(c0474o) || c0474o.f1378g == null) {
                        return;
                    }
                } else if (c0474o.f1388q && viewGroup.getChildCount() > 0) {
                    c0474o.f1378g.removeAllViews();
                }
                if (!m8014h0(c0474o) || !c0474o.m7968b()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = c0474o.f1379h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0474o.f1378g.setBackgroundResource(c0474o.f1373b);
                ViewParent parent = c0474o.f1379h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0474o.f1379h);
                }
                c0474o.f1378g.addView(c0474o.f1379h, layoutParams2);
                if (!c0474o.f1379h.hasFocus()) {
                    c0474o.f1379h.requestFocus();
                }
            } else {
                View view = c0474o.f1380i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    c0474o.f1385n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, c0474o.f1375d, c0474o.f1376e, 1002, 8519680, -3);
                    layoutParams3.gravity = c0474o.f1374c;
                    layoutParams3.windowAnimations = c0474o.f1377f;
                    windowManager.addView(c0474o.f1378g, layoutParams3);
                    c0474o.f1386o = true;
                }
            }
            i = -2;
            c0474o.f1385n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, c0474o.f1375d, c0474o.f1376e, 1002, 8519680, -3);
            layoutParams32.gravity = c0474o.f1374c;
            layoutParams32.windowAnimations = c0474o.f1377f;
            windowManager.addView(c0474o.f1378g, layoutParams32);
            c0474o.f1386o = true;
        }
    }

    /* renamed from: z0 */
    private boolean m7982z0(C0474o c0474o, int i, KeyEvent keyEvent, int i2) {
        C0507g c0507g;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0474o.f1384m || m8060A0(c0474o, keyEvent)) && (c0507g = c0474o.f1381j) != null) {
            z = c0507g.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1341q == null) {
            m8034Q(c0474o, true);
        }
        return z;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: A */
    public boolean mo8061A(int i) {
        int m8056C0 = m8056C0(i);
        if (this.f1311J && m8056C0 == 108) {
            return false;
        }
        if (this.f1307F && m8056C0 == 1) {
            this.f1307F = false;
        }
        if (m8056C0 == 1) {
            m8047H0();
            this.f1311J = true;
            return true;
        } else if (m8056C0 == 2) {
            m8047H0();
            this.f1305D = true;
            return true;
        } else if (m8056C0 == 5) {
            m8047H0();
            this.f1306E = true;
            return true;
        } else if (m8056C0 == 10) {
            m8047H0();
            this.f1309H = true;
            return true;
        } else if (m8056C0 == 108) {
            m8047H0();
            this.f1307F = true;
            return true;
        } else if (m8056C0 != 109) {
            return this.f1335k.requestFeature(m8056C0);
        } else {
            m8047H0();
            this.f1308G = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: B */
    public void mo8059B(int i) {
        m8027X();
        ViewGroup viewGroup = (ViewGroup) this.f1302A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1334j).inflate(i, viewGroup);
        this.f1336l.m9470a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: C */
    public void mo8057C(View view) {
        m8027X();
        ViewGroup viewGroup = (ViewGroup) this.f1302A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1336l.m9470a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: D */
    public void mo8055D(View view, ViewGroup.LayoutParams layoutParams) {
        m8027X();
        ViewGroup viewGroup = (ViewGroup) this.f1302A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1336l.m9470a().onContentChanged();
    }

    /* renamed from: D0 */
    final boolean m8054D0() {
        ViewGroup viewGroup;
        return this.f1350z && (viewGroup = this.f1302A) != null && C0252s.m8650M(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: F */
    public void mo8052F(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f1333i instanceof Activity) {
            AbstractC0447a mo8006m = mo8006m();
            if (mo8006m instanceof C0488l) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f1339o = null;
            if (mo8006m != null) {
                mo8006m.mo7951n();
            }
            if (toolbar != null) {
                C0479i c0479i = new C0479i(toolbar, m8018e0(), this.f1336l);
                this.f1338n = c0479i;
                window = this.f1335k;
                callback = c0479i.m7947w();
            } else {
                this.f1338n = null;
                window = this.f1335k;
                callback = this.f1336l;
            }
            window.setCallback(callback);
            mo8002o();
        }
    }

    /* renamed from: F0 */
    public AbstractC0030b m8051F0(AbstractC0030b.InterfaceC0031a interfaceC0031a) {
        InterfaceC0454d interfaceC0454d;
        if (interfaceC0031a != null) {
            AbstractC0030b abstractC0030b = this.f1344t;
            if (abstractC0030b != null) {
                abstractC0030b.mo7908c();
            }
            C0466i c0466i = new C0466i(interfaceC0031a);
            AbstractC0447a mo8006m = mo8006m();
            if (mo8006m != null) {
                AbstractC0030b mo7915u = mo8006m.mo7915u(c0466i);
                this.f1344t = mo7915u;
                if (mo7915u != null && (interfaceC0454d = this.f1337m) != null) {
                    interfaceC0454d.mo7963c(mo7915u);
                }
            }
            if (this.f1344t == null) {
                this.f1344t = m8049G0(c0466i);
            }
            return this.f1344t;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: G */
    public void mo8050G(int i) {
        this.f1321T = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    p000a.p001a.p007n.AbstractC0030b m8049G0(p000a.p001a.p007n.AbstractC0030b.InterfaceC0031a r8) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0456f.m8049G0(a.a.n.b$a):a.a.n.b");
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: H */
    public final void mo8048H(CharSequence charSequence) {
        this.f1340p = charSequence;
        InterfaceC0587c0 interfaceC0587c0 = this.f1341q;
        if (interfaceC0587c0 != null) {
            interfaceC0587c0.setWindowTitle(charSequence);
        } else if (m7983y0() != null) {
            m7983y0().mo7916t(charSequence);
        } else {
            TextView textView = this.f1303B;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: L0 */
    int m8039L0(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f1345u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1345u.getLayoutParams();
            if (this.f1345u.isShown()) {
                if (this.f1330c0 == null) {
                    this.f1330c0 = new Rect();
                    this.f1331d0 = new Rect();
                }
                Rect rect = this.f1330c0;
                Rect rect2 = this.f1331d0;
                rect.set(0, i, 0, 0);
                C0588c1.m7483a(this.f1302A, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f1304C;
                    if (view == null) {
                        View view2 = new View(this.f1334j);
                        this.f1304C = view2;
                        view2.setBackgroundColor(this.f1334j.getResources().getColor(C0002c.abc_input_method_navigation_guard));
                        this.f1302A.addView(this.f1304C, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1304C.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                r3 = this.f1304C != null;
                if (!this.f1309H && r3) {
                    i = 0;
                }
                boolean z3 = r3;
                r3 = z2;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r3 = false;
            }
            if (r3) {
                this.f1345u.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f1304C;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    /* renamed from: M */
    void m8038M(int i, C0474o c0474o, Menu menu) {
        if (menu == null) {
            if (c0474o == null && i >= 0) {
                C0474o[] c0474oArr = this.f1313L;
                if (i < c0474oArr.length) {
                    c0474o = c0474oArr[i];
                }
            }
            if (c0474o != null) {
                menu = c0474o.f1381j;
            }
        }
        if ((c0474o == null || c0474o.f1386o) && !this.f1319R) {
            this.f1336l.m9470a().onPanelClosed(i, menu);
        }
    }

    /* renamed from: N */
    void m8037N(C0507g c0507g) {
        if (this.f1312K) {
            return;
        }
        this.f1312K = true;
        this.f1341q.mo7484l();
        Window.Callback m8016f0 = m8016f0();
        if (m8016f0 != null && !this.f1319R) {
            m8016f0.onPanelClosed(108, c0507g);
        }
        this.f1312K = false;
    }

    /* renamed from: P */
    void m8035P(int i) {
        m8034Q(m8019d0(i, true), true);
    }

    /* renamed from: Q */
    void m8034Q(C0474o c0474o, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0587c0 interfaceC0587c0;
        if (z && c0474o.f1372a == 0 && (interfaceC0587c0 = this.f1341q) != null && interfaceC0587c0.mo7491b()) {
            m8037N(c0474o.f1381j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1334j.getSystemService("window");
        if (windowManager != null && c0474o.f1386o && (viewGroup = c0474o.f1378g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m8038M(c0474o.f1372a, c0474o, null);
            }
        }
        c0474o.f1384m = false;
        c0474o.f1385n = false;
        c0474o.f1386o = false;
        c0474o.f1379h = null;
        c0474o.f1388q = true;
        if (this.f1314M == c0474o) {
            this.f1314M = null;
        }
    }

    /* renamed from: S */
    public View m8032S(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f1332e0 == null) {
            String string = this.f1334j.obtainStyledAttributes(C0009j.AppCompatTheme).getString(C0009j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f1332e0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f1332e0 = appCompatViewInflater;
        }
        if (f1298g0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m8053E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f1332e0.createView(view, str, context, attributeSet, z, f1298g0, true, C0578b1.m7529b());
    }

    /* renamed from: T */
    void m8031T() {
        C0507g c0507g;
        InterfaceC0587c0 interfaceC0587c0 = this.f1341q;
        if (interfaceC0587c0 != null) {
            interfaceC0587c0.mo7484l();
        }
        if (this.f1346v != null) {
            this.f1335k.getDecorView().removeCallbacks(this.f1347w);
            if (this.f1346v.isShowing()) {
                try {
                    this.f1346v.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1346v = null;
        }
        m8028W();
        C0474o m8019d0 = m8019d0(0, false);
        if (m8019d0 == null || (c0507g = m8019d0.f1381j) == null) {
            return;
        }
        c0507g.close();
    }

    /* renamed from: U */
    boolean m8030U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1333i;
        if (((obj instanceof C0237e.InterfaceC0238a) || (obj instanceof DialogC0476g)) && (decorView = this.f1335k.getDecorView()) != null && C0237e.m8702d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1336l.m9470a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m8000p0(keyCode, keyEvent) : m7995s0(keyCode, keyEvent);
    }

    /* renamed from: V */
    void m8029V(int i) {
        C0474o m8019d0;
        C0474o m8019d02 = m8019d0(i, true);
        if (m8019d02.f1381j != null) {
            Bundle bundle = new Bundle();
            m8019d02.f1381j.m7843Q(bundle);
            if (bundle.size() > 0) {
                m8019d02.f1390s = bundle;
            }
            m8019d02.f1381j.m7827d0();
            m8019d02.f1381j.clear();
        }
        m8019d02.f1389r = true;
        m8019d02.f1388q = true;
        if ((i != 108 && i != 0) || this.f1341q == null || (m8019d0 = m8019d0(0, false)) == null) {
            return;
        }
        m8019d0.f1384m = false;
        m8060A0(m8019d0, null);
    }

    /* renamed from: W */
    void m8028W() {
        C0267w c0267w = this.f1348x;
        if (c0267w != null) {
            c0267w.m8537b();
        }
    }

    /* renamed from: Z */
    C0474o m8025Z(Menu menu) {
        C0474o[] c0474oArr = this.f1313L;
        int length = c0474oArr != null ? c0474oArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0474o c0474o = c0474oArr[i];
            if (c0474o != null && c0474o.f1381j == menu) {
                return c0474o;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
    /* renamed from: a */
    public boolean mo7687a(C0507g c0507g, MenuItem menuItem) {
        C0474o m8025Z;
        Window.Callback m8016f0 = m8016f0();
        if (m8016f0 == null || this.f1319R || (m8025Z = m8025Z(c0507g.mo7740D())) == null) {
            return false;
        }
        return m8016f0.onMenuItemSelected(m8025Z.f1372a, menuItem);
    }

    /* renamed from: a0 */
    final Context m8024a0() {
        AbstractC0447a mo8006m = mo8006m();
        Context mo7921k = mo8006m != null ? mo8006m.mo7921k() : null;
        return mo7921k == null ? this.f1334j : mo7921k;
    }

    @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
    /* renamed from: b */
    public void mo7686b(C0507g c0507g) {
        m8058B0(c0507g, true);
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: c */
    public void mo8022c(View view, ViewGroup.LayoutParams layoutParams) {
        m8027X();
        ((ViewGroup) this.f1302A.findViewById(16908290)).addView(view, layoutParams);
        this.f1336l.m9470a().onContentChanged();
    }

    /* renamed from: c0 */
    final AbstractC0470l m8021c0() {
        if (this.f1324W == null) {
            this.f1324W = new C0472m(C0486k.m7943a(this.f1334j));
        }
        return this.f1324W;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: d */
    public boolean mo8020d() {
        return m8046I(true);
    }

    /* renamed from: d0 */
    protected C0474o m8019d0(int i, boolean z) {
        C0474o[] c0474oArr = this.f1313L;
        if (c0474oArr == null || c0474oArr.length <= i) {
            C0474o[] c0474oArr2 = new C0474o[i + 1];
            if (c0474oArr != null) {
                System.arraycopy(c0474oArr, 0, c0474oArr2, 0, c0474oArr.length);
            }
            this.f1313L = c0474oArr2;
            c0474oArr = c0474oArr2;
        }
        C0474o c0474o = c0474oArr[i];
        if (c0474o == null) {
            C0474o c0474o2 = new C0474o(i);
            c0474oArr[i] = c0474o2;
            return c0474o2;
        }
        return c0474o;
    }

    /* renamed from: e0 */
    final CharSequence m8018e0() {
        Object obj = this.f1333i;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1340p;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: f */
    public void mo8017f(Context context) {
        m8046I(false);
        this.f1316O = true;
    }

    /* renamed from: f0 */
    final Window.Callback m8016f0() {
        return this.f1335k.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: i */
    public <T extends View> T mo8013i(int i) {
        m8027X();
        return (T) this.f1335k.findViewById(i);
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: k */
    public int mo8010k() {
        return this.f1320S;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: l */
    public MenuInflater mo8008l() {
        if (this.f1339o == null) {
            m8015g0();
            AbstractC0447a abstractC0447a = this.f1338n;
            this.f1339o = new C0037g(abstractC0447a != null ? abstractC0447a.mo7921k() : this.f1334j);
        }
        return this.f1339o;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: m */
    public AbstractC0447a mo8006m() {
        m8015g0();
        return this.f1338n;
    }

    /* renamed from: m0 */
    public boolean m8005m0() {
        return this.f1349y;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: n */
    public void mo8004n() {
        LayoutInflater from = LayoutInflater.from(this.f1334j);
        if (from.getFactory() == null) {
            C0239f.m8698b(from, this);
        } else if (from.getFactory2() instanceof LayoutInflater$Factory2C0456f) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: n0 */
    int m8003n0(int i) {
        AbstractC0470l m8021c0;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        m8021c0 = m8023b0();
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f1334j.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                } else {
                    m8021c0 = m8021c0();
                }
                return m8021c0.mo7972c();
            }
            return i;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: o */
    public void mo8002o() {
        AbstractC0447a mo8006m = mo8006m();
        if (mo8006m == null || !mo8006m.mo7952l()) {
            m8009k0(0);
        }
    }

    /* renamed from: o0 */
    boolean m8001o0() {
        AbstractC0030b abstractC0030b = this.f1344t;
        if (abstractC0030b != null) {
            abstractC0030b.mo7908c();
            return true;
        }
        AbstractC0447a mo8006m = mo8006m();
        return mo8006m != null && mo8006m.mo7924h();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m8032S(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p0 */
    boolean m8000p0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.f1315N = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            m7999q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: r */
    public void mo7998r(Configuration configuration) {
        AbstractC0447a mo8006m;
        if (this.f1307F && this.f1350z && (mo8006m = mo8006m()) != null) {
            mo8006m.mo7920m(configuration);
        }
        C0608j.m7411b().m7406g(this.f1334j);
        m8046I(false);
    }

    /* renamed from: r0 */
    boolean m7997r0(int i, KeyEvent keyEvent) {
        AbstractC0447a mo8006m = mo8006m();
        if (mo8006m == null || !mo8006m.mo7919o(i, keyEvent)) {
            C0474o c0474o = this.f1314M;
            if (c0474o != null && m7982z0(c0474o, keyEvent.getKeyCode(), keyEvent, 1)) {
                C0474o c0474o2 = this.f1314M;
                if (c0474o2 != null) {
                    c0474o2.f1385n = true;
                }
                return true;
            }
            if (this.f1314M == null) {
                C0474o m8019d0 = m8019d0(0, true);
                m8060A0(m8019d0, keyEvent);
                boolean m7982z0 = m7982z0(m8019d0, keyEvent.getKeyCode(), keyEvent, 1);
                m8019d0.f1384m = false;
                if (m7982z0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: s */
    public void mo7996s(Bundle bundle) {
        this.f1316O = true;
        m8046I(false);
        m8026Y();
        Object obj = this.f1333i;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0715f.m6976c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0447a m7983y0 = m7983y0();
                if (m7983y0 == null) {
                    this.f1329b0 = true;
                } else {
                    m7983y0.mo7918r(true);
                }
            }
        }
        this.f1317P = true;
    }

    /* renamed from: s0 */
    boolean m7995s0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f1315N;
            this.f1315N = false;
            C0474o m8019d0 = m8019d0(0, false);
            if (m8019d0 != null && m8019d0.f1386o) {
                if (!z) {
                    m8034Q(m8019d0, true);
                }
                return true;
            } else if (m8001o0()) {
                return true;
            }
        } else if (i == 82) {
            m7993t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: t */
    public void mo7994t() {
        AbstractC0455e.m8063q(this);
        if (this.f1326Y) {
            this.f1335k.getDecorView().removeCallbacks(this.f1328a0);
        }
        this.f1318Q = false;
        this.f1319R = true;
        AbstractC0447a abstractC0447a = this.f1338n;
        if (abstractC0447a != null) {
            abstractC0447a.mo7951n();
        }
        m8036O();
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: u */
    public void mo7992u(Bundle bundle) {
        m8027X();
    }

    /* renamed from: u0 */
    void m7991u0(int i) {
        AbstractC0447a mo8006m;
        if (i != 108 || (mo8006m = mo8006m()) == null) {
            return;
        }
        mo8006m.mo7923i(true);
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: v */
    public void mo7990v() {
        AbstractC0447a mo8006m = mo8006m();
        if (mo8006m != null) {
            mo8006m.mo7917s(true);
        }
    }

    /* renamed from: v0 */
    void m7989v0(int i) {
        if (i == 108) {
            AbstractC0447a mo8006m = mo8006m();
            if (mo8006m != null) {
                mo8006m.mo7923i(false);
            }
        } else if (i == 0) {
            C0474o m8019d0 = m8019d0(i, true);
            if (m8019d0.f1386o) {
                m8034Q(m8019d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: w */
    public void mo7988w(Bundle bundle) {
        if (this.f1320S != -100) {
            f1297f0.put(this.f1333i.getClass(), Integer.valueOf(this.f1320S));
        }
    }

    /* renamed from: w0 */
    void m7987w0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: x */
    public void mo7986x() {
        this.f1318Q = true;
        mo8020d();
        AbstractC0455e.m8064p(this);
    }

    @Override // androidx.appcompat.app.AbstractC0455e
    /* renamed from: y */
    public void mo7984y() {
        this.f1318Q = false;
        AbstractC0455e.m8063q(this);
        AbstractC0447a mo8006m = mo8006m();
        if (mo8006m != null) {
            mo8006m.mo7917s(false);
        }
        if (this.f1333i instanceof Dialog) {
            m8036O();
        }
    }

    /* renamed from: y0 */
    final AbstractC0447a m7983y0() {
        return this.f1338n;
    }
}
