package io.flutter.embedding.android;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import io.flutter.embedding.android.C2798g;
import io.flutter.embedding.engine.C2820a;
import io.flutter.embedding.engine.p159i.C2903k;
import io.flutter.embedding.engine.renderer.C2919a;
import io.flutter.embedding.engine.renderer.InterfaceC2924b;
import io.flutter.embedding.engine.renderer.InterfaceC2925c;
import io.flutter.plugin.editing.C2934d;
import io.flutter.view.C2974c;
import java.util.HashSet;
import java.util.Set;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p112b.C1533a;
import p108c.p109a.p110c.p113c.C1534a;
/* renamed from: io.flutter.embedding.android.j */
/* loaded from: classes.dex */
public class C2806j extends FrameLayout implements C1534a.InterfaceC1537c {

    /* renamed from: f */
    private C2801h f6958f;

    /* renamed from: g */
    private C2804i f6959g;

    /* renamed from: h */
    private C2798g f6960h;

    /* renamed from: i */
    private InterfaceC2925c f6961i;

    /* renamed from: j */
    private InterfaceC2925c f6962j;

    /* renamed from: k */
    private final Set<InterfaceC2924b> f6963k;

    /* renamed from: l */
    private boolean f6964l;

    /* renamed from: m */
    private C2820a f6965m;

    /* renamed from: n */
    private final Set<InterfaceC2810d> f6966n;

    /* renamed from: o */
    private C1534a f6967o;

    /* renamed from: p */
    private C2934d f6968p;

    /* renamed from: q */
    private C1533a f6969q;

    /* renamed from: r */
    private C2786a f6970r;

    /* renamed from: s */
    private C2788b f6971s;

    /* renamed from: t */
    private C2974c f6972t;

    /* renamed from: u */
    private final C2919a.C2923c f6973u;

    /* renamed from: v */
    private final C2974c.InterfaceC2983i f6974v;

    /* renamed from: w */
    private final InterfaceC2924b f6975w;

    /* renamed from: io.flutter.embedding.android.j$a */
    /* loaded from: classes.dex */
    class C2807a implements C2974c.InterfaceC2983i {
        C2807a() {
        }

        @Override // io.flutter.view.C2974c.InterfaceC2983i
        /* renamed from: a */
        public void mo80a(boolean z, boolean z2) {
            C2806j.this.m631u(z, z2);
        }
    }

    /* renamed from: io.flutter.embedding.android.j$b */
    /* loaded from: classes.dex */
    class C2808b implements InterfaceC2924b {
        C2808b() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: d */
        public void mo366d() {
            C2806j.this.f6964l = false;
            for (InterfaceC2924b interfaceC2924b : C2806j.this.f6963k) {
                interfaceC2924b.mo366d();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: g */
        public void mo365g() {
            C2806j.this.f6964l = true;
            for (InterfaceC2924b interfaceC2924b : C2806j.this.f6963k) {
                interfaceC2924b.mo365g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.android.j$c */
    /* loaded from: classes.dex */
    public class C2809c implements InterfaceC2924b {

        /* renamed from: a */
        final /* synthetic */ C2919a f6978a;

        /* renamed from: b */
        final /* synthetic */ Runnable f6979b;

        C2809c(C2919a c2919a, Runnable runnable) {
            this.f6978a = c2919a;
            this.f6979b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: d */
        public void mo366d() {
        }

        @Override // io.flutter.embedding.engine.renderer.InterfaceC2924b
        /* renamed from: g */
        public void mo365g() {
            this.f6978a.m377l(this);
            this.f6979b.run();
            C2806j.this.f6960h.mo364a();
        }
    }

    /* renamed from: io.flutter.embedding.android.j$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2810d {
        /* renamed from: a */
        void mo627a();

        /* renamed from: b */
        void mo626b(C2820a c2820a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.embedding.android.j$e */
    /* loaded from: classes.dex */
    public enum EnumC2811e {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private C2806j(Context context, AttributeSet attributeSet, C2801h c2801h) {
        super(context, attributeSet);
        this.f6963k = new HashSet();
        this.f6966n = new HashSet();
        this.f6973u = new C2919a.C2923c();
        this.f6974v = new C2807a();
        this.f6975w = new C2808b();
        this.f6958f = c2801h;
        this.f6961i = c2801h;
        m635q();
    }

    private C2806j(Context context, AttributeSet attributeSet, C2804i c2804i) {
        super(context, attributeSet);
        this.f6963k = new HashSet();
        this.f6966n = new HashSet();
        this.f6973u = new C2919a.C2923c();
        this.f6974v = new C2807a();
        this.f6975w = new C2808b();
        this.f6959g = c2804i;
        this.f6961i = c2804i;
        m635q();
    }

    public C2806j(Context context, C2801h c2801h) {
        this(context, (AttributeSet) null, c2801h);
    }

    public C2806j(Context context, C2804i c2804i) {
        this(context, (AttributeSet) null, c2804i);
    }

    /* renamed from: k */
    private EnumC2811e m641k() {
        Context context = getContext();
        int i = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 2) {
            if (rotation == 1) {
                return EnumC2811e.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? EnumC2811e.LEFT : EnumC2811e.RIGHT;
            } else if (rotation == 0 || rotation == 2) {
                return EnumC2811e.BOTH;
            }
        }
        return EnumC2811e.NONE;
    }

    /* renamed from: o */
    private int m637o(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    /* renamed from: q */
    private void m635q() {
        View view;
        C1499b.m4050d("FlutterView", "Initializing FlutterView");
        if (this.f6958f != null) {
            C1499b.m4050d("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f6958f;
        } else if (this.f6959g != null) {
            C1499b.m4050d("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f6959g;
        } else {
            C1499b.m4050d("FlutterView", "Internally using a FlutterImageView.");
            view = this.f6960h;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m631u(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.f6965m.m596q().m380i() && !z && !z2) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    /* renamed from: x */
    private void m628x() {
        if (!m634r()) {
            C1499b.m4049e("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f6973u.f7276a = getResources().getDisplayMetrics().density;
        this.f6965m.m596q().m375n(this.f6973u);
    }

    @Override // p108c.p109a.p110c.p113c.C1534a.InterfaceC1537c
    /* renamed from: a */
    public PointerIcon mo651a(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f6968p.m322i(sparseArray);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        C2820a c2820a = this.f6965m;
        return c2820a != null ? c2820a.m598o().m184x(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (m634r() && this.f6970r.m742d(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public boolean m646f() {
        C2798g c2798g = this.f6960h;
        if (c2798g != null) {
            return c2798g.m675d();
        }
        return false;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT <= 19) {
            C2919a.C2923c c2923c = this.f6973u;
            c2923c.f7279d = rect.top;
            c2923c.f7280e = rect.right;
            c2923c.f7281f = 0;
            c2923c.f7282g = rect.left;
            c2923c.f7283h = 0;
            c2923c.f7284i = 0;
            c2923c.f7285j = rect.bottom;
            c2923c.f7286k = 0;
            C1499b.m4050d("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.f6973u.f7279d + ", Left: " + this.f6973u.f7282g + ", Right: " + this.f6973u.f7280e + "\nKeyboard insets: Bottom: " + this.f6973u.f7285j + ", Left: " + this.f6973u.f7286k + ", Right: " + this.f6973u.f7284i);
            m628x();
            return true;
        }
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public void m645g(InterfaceC2810d interfaceC2810d) {
        this.f6966n.add(interfaceC2810d);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        C2974c c2974c = this.f6972t;
        if (c2974c == null || !c2974c.m100w()) {
            return null;
        }
        return this.f6972t;
    }

    public C2820a getAttachedFlutterEngine() {
        return this.f6965m;
    }

    /* renamed from: h */
    public void m644h(InterfaceC2924b interfaceC2924b) {
        this.f6963k.add(interfaceC2924b);
    }

    /* renamed from: i */
    public void m643i(C2798g c2798g) {
        C2820a c2820a = this.f6965m;
        if (c2820a != null) {
            c2798g.mo363b(c2820a.m596q());
        }
    }

    /* renamed from: j */
    public void m642j(C2820a c2820a) {
        C1499b.m4050d("FlutterView", "Attaching to a FlutterEngine: " + c2820a);
        if (m634r()) {
            if (c2820a == this.f6965m) {
                C1499b.m4050d("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                C1499b.m4050d("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                m638n();
            }
        }
        this.f6965m = c2820a;
        C2919a m596q = c2820a.m596q();
        this.f6964l = m596q.m381h();
        this.f6961i.mo363b(m596q);
        m596q.m383f(this.f6975w);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f6967o = new C1534a(this, this.f6965m.m601l());
        }
        this.f6968p = new C2934d(this, this.f6965m.m592u(), this.f6965m.m598o());
        this.f6969q = this.f6965m.m602k();
        this.f6970r = new C2786a(this, this.f6965m.m604i(), this.f6968p);
        this.f6971s = new C2788b(this.f6965m.m596q(), false);
        C2974c c2974c = new C2974c(this, c2820a.m607f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f6965m.m598o());
        this.f6972t = c2974c;
        c2974c.m127K(this.f6974v);
        m631u(this.f6972t.m100w(), this.f6972t.m99x());
        this.f6965m.m598o().mo209a(this.f6972t);
        this.f6965m.m598o().m186v(this.f6965m.m596q());
        this.f6968p.m317n().restartInput(this);
        m629w();
        this.f6969q.m4001b(getResources().getConfiguration());
        m628x();
        c2820a.m598o().m185w(this);
        for (InterfaceC2810d interfaceC2810d : this.f6966n) {
            interfaceC2810d.mo626b(c2820a);
        }
        if (this.f6964l) {
            this.f6975w.mo365g();
        }
    }

    /* renamed from: l */
    public void m640l() {
        this.f6961i.mo362c();
        C2798g c2798g = this.f6960h;
        if (c2798g == null) {
            C2798g m639m = m639m();
            this.f6960h = m639m;
            addView(m639m);
        } else {
            c2798g.m672g(getWidth(), getHeight());
        }
        this.f6962j = this.f6961i;
        C2798g c2798g2 = this.f6960h;
        this.f6961i = c2798g2;
        C2820a c2820a = this.f6965m;
        if (c2820a != null) {
            c2798g2.mo363b(c2820a.m596q());
        }
    }

    /* renamed from: m */
    public C2798g m639m() {
        return new C2798g(getContext(), getWidth(), getHeight(), C2798g.EnumC2800b.background);
    }

    /* renamed from: n */
    public void m638n() {
        C1499b.m4050d("FlutterView", "Detaching from a FlutterEngine: " + this.f6965m);
        if (!m634r()) {
            C1499b.m4050d("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (InterfaceC2810d interfaceC2810d : this.f6966n) {
            interfaceC2810d.mo627a();
        }
        this.f6965m.m598o().m233C();
        this.f6965m.m598o().mo207b();
        this.f6972t.m133E();
        this.f6972t = null;
        this.f6968p.m317n().restartInput(this);
        this.f6968p.m318m();
        this.f6970r.m744b();
        C1534a c1534a = this.f6967o;
        if (c1534a != null) {
            c1534a.m3998c();
        }
        C2919a m596q = this.f6965m.m596q();
        this.f6964l = false;
        m596q.m377l(this.f6975w);
        m596q.m373p();
        m596q.m376m(false);
        this.f6961i.mo364a();
        this.f6960h = null;
        this.f6962j = null;
        this.f6965m = null;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (Build.VERSION.SDK_INT == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            C2919a.C2923c c2923c = this.f6973u;
            c2923c.f7287l = systemGestureInsets.top;
            c2923c.f7288m = systemGestureInsets.right;
            c2923c.f7289n = systemGestureInsets.bottom;
            c2923c.f7290o = systemGestureInsets.left;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (Build.VERSION.SDK_INT >= 30) {
            int navigationBars = z2 ? 0 | WindowInsets.Type.navigationBars() : 0;
            if (z) {
                navigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(navigationBars);
            C2919a.C2923c c2923c2 = this.f6973u;
            c2923c2.f7279d = insets.top;
            c2923c2.f7280e = insets.right;
            c2923c2.f7281f = insets.bottom;
            c2923c2.f7282g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            C2919a.C2923c c2923c3 = this.f6973u;
            c2923c3.f7283h = insets2.top;
            c2923c3.f7284i = insets2.right;
            c2923c3.f7285j = insets2.bottom;
            c2923c3.f7286k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            C2919a.C2923c c2923c4 = this.f6973u;
            c2923c4.f7287l = insets3.top;
            c2923c4.f7288m = insets3.right;
            c2923c4.f7289n = insets3.bottom;
            c2923c4.f7290o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                C2919a.C2923c c2923c5 = this.f6973u;
                c2923c5.f7279d = Math.max(Math.max(c2923c5.f7279d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                C2919a.C2923c c2923c6 = this.f6973u;
                c2923c6.f7280e = Math.max(Math.max(c2923c6.f7280e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                C2919a.C2923c c2923c7 = this.f6973u;
                c2923c7.f7281f = Math.max(Math.max(c2923c7.f7281f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                C2919a.C2923c c2923c8 = this.f6973u;
                c2923c8.f7282g = Math.max(Math.max(c2923c8.f7282g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            EnumC2811e enumC2811e = EnumC2811e.NONE;
            if (!z2) {
                enumC2811e = m641k();
            }
            this.f6973u.f7279d = z ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f6973u.f7280e = (enumC2811e == EnumC2811e.RIGHT || enumC2811e == EnumC2811e.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f6973u.f7281f = (z2 && m637o(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f6973u.f7282g = (enumC2811e == EnumC2811e.LEFT || enumC2811e == EnumC2811e.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            C2919a.C2923c c2923c9 = this.f6973u;
            c2923c9.f7283h = 0;
            c2923c9.f7284i = 0;
            c2923c9.f7285j = m637o(windowInsets);
            this.f6973u.f7286k = 0;
        }
        C1499b.m4050d("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f6973u.f7279d + ", Left: " + this.f6973u.f7282g + ", Right: " + this.f6973u.f7280e + "\nKeyboard insets: Bottom: " + this.f6973u.f7285j + ", Left: " + this.f6973u.f7286k + ", Right: " + this.f6973u.f7284i + "System Gesture Insets - Left: " + this.f6973u.f7290o + ", Top: " + this.f6973u.f7287l + ", Right: " + this.f6973u.f7288m + ", Bottom: " + this.f6973u.f7285j);
        m628x();
        return onApplyWindowInsets;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f6965m != null) {
            C1499b.m4050d("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f6969q.m4001b(configuration);
            m629w();
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !m634r() ? super.onCreateInputConnection(editorInfo) : this.f6968p.m319l(this, editorInfo);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (m634r() && this.f6971s.m731d(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !m634r() ? super.onHoverEvent(motionEvent) : this.f6972t.m136B(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        this.f6968p.m307x(viewStructure, i);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C1499b.m4050d("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i3 + " x " + i4 + ", it is now " + i + " x " + i2);
        C2919a.C2923c c2923c = this.f6973u;
        c2923c.f7277b = i;
        c2923c.f7278c = i2;
        m628x();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m634r()) {
            if (Build.VERSION.SDK_INT >= 21) {
                requestUnbufferedDispatch(motionEvent);
            }
            return this.f6971s.m730e(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public boolean m636p() {
        return this.f6964l;
    }

    /* renamed from: r */
    public boolean m634r() {
        C2820a c2820a = this.f6965m;
        return c2820a != null && c2820a.m596q() == this.f6961i.getAttachedRenderer();
    }

    /* renamed from: s */
    public void m633s(InterfaceC2810d interfaceC2810d) {
        this.f6966n.remove(interfaceC2810d);
    }

    /* renamed from: t */
    public void m632t(InterfaceC2924b interfaceC2924b) {
        this.f6963k.remove(interfaceC2924b);
    }

    /* renamed from: v */
    public void m630v(Runnable runnable) {
        C2798g c2798g = this.f6960h;
        if (c2798g == null) {
            C1499b.m4050d("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        InterfaceC2925c interfaceC2925c = this.f6962j;
        if (interfaceC2925c == null) {
            C1499b.m4050d("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f6961i = interfaceC2925c;
        this.f6962j = null;
        C2820a c2820a = this.f6965m;
        if (c2820a == null) {
            c2798g.mo364a();
            runnable.run();
            return;
        }
        C2919a m596q = c2820a.m596q();
        if (m596q == null) {
            this.f6960h.mo364a();
            runnable.run();
            return;
        }
        this.f6961i.mo363b(m596q);
        m596q.m383f(new C2809c(m596q, runnable));
    }

    /* renamed from: w */
    void m629w() {
        C2903k.EnumC2905b enumC2905b = (getResources().getConfiguration().uiMode & 48) == 32 ? C2903k.EnumC2905b.dark : C2903k.EnumC2905b.light;
        C2903k.C2904a m418a = this.f6965m.m594s().m418a();
        m418a.m415c(getResources().getConfiguration().fontScale);
        m418a.m414d(DateFormat.is24HourFormat(getContext()));
        m418a.m416b(enumC2905b);
        m418a.m417a();
    }
}
