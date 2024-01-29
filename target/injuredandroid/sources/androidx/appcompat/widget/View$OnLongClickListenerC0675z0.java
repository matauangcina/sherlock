package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.C0264t;
/* renamed from: androidx.appcompat.widget.z0 */
/* loaded from: classes.dex */
class View$OnLongClickListenerC0675z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o */
    private static View$OnLongClickListenerC0675z0 f2282o;

    /* renamed from: p */
    private static View$OnLongClickListenerC0675z0 f2283p;

    /* renamed from: f */
    private final View f2284f;

    /* renamed from: g */
    private final CharSequence f2285g;

    /* renamed from: h */
    private final int f2286h;

    /* renamed from: i */
    private final Runnable f2287i = new RunnableC0676a();

    /* renamed from: j */
    private final Runnable f2288j = new RunnableC0677b();

    /* renamed from: k */
    private int f2289k;

    /* renamed from: l */
    private int f2290l;

    /* renamed from: m */
    private C0575a1 f2291m;

    /* renamed from: n */
    private boolean f2292n;

    /* renamed from: androidx.appcompat.widget.z0$a */
    /* loaded from: classes.dex */
    class RunnableC0676a implements Runnable {
        RunnableC0676a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0675z0.this.m7132g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$b */
    /* loaded from: classes.dex */
    class RunnableC0677b implements Runnable {
        RunnableC0677b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View$OnLongClickListenerC0675z0.this.m7136c();
        }
    }

    private View$OnLongClickListenerC0675z0(View view, CharSequence charSequence) {
        this.f2284f = view;
        this.f2285g = charSequence;
        this.f2286h = C0264t.m8549c(ViewConfiguration.get(view.getContext()));
        m7137b();
        this.f2284f.setOnLongClickListener(this);
        this.f2284f.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m7138a() {
        this.f2284f.removeCallbacks(this.f2287i);
    }

    /* renamed from: b */
    private void m7137b() {
        this.f2289k = Reader.READ_DONE;
        this.f2290l = Reader.READ_DONE;
    }

    /* renamed from: d */
    private void m7135d() {
        this.f2284f.postDelayed(this.f2287i, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m7134e(View$OnLongClickListenerC0675z0 view$OnLongClickListenerC0675z0) {
        View$OnLongClickListenerC0675z0 view$OnLongClickListenerC0675z02 = f2282o;
        if (view$OnLongClickListenerC0675z02 != null) {
            view$OnLongClickListenerC0675z02.m7138a();
        }
        f2282o = view$OnLongClickListenerC0675z0;
        if (view$OnLongClickListenerC0675z0 != null) {
            view$OnLongClickListenerC0675z0.m7135d();
        }
    }

    /* renamed from: f */
    public static void m7133f(View view, CharSequence charSequence) {
        View$OnLongClickListenerC0675z0 view$OnLongClickListenerC0675z0 = f2282o;
        if (view$OnLongClickListenerC0675z0 != null && view$OnLongClickListenerC0675z0.f2284f == view) {
            m7134e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new View$OnLongClickListenerC0675z0(view, charSequence);
            return;
        }
        View$OnLongClickListenerC0675z0 view$OnLongClickListenerC0675z02 = f2283p;
        if (view$OnLongClickListenerC0675z02 != null && view$OnLongClickListenerC0675z02.f2284f == view) {
            view$OnLongClickListenerC0675z02.m7136c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: h */
    private boolean m7131h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f2289k) > this.f2286h || Math.abs(y - this.f2290l) > this.f2286h) {
            this.f2289k = x;
            this.f2290l = y;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    void m7136c() {
        if (f2283p == this) {
            f2283p = null;
            C0575a1 c0575a1 = this.f2291m;
            if (c0575a1 != null) {
                c0575a1.m7533c();
                this.f2291m = null;
                m7137b();
                this.f2284f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2282o == this) {
            m7134e(null);
        }
        this.f2284f.removeCallbacks(this.f2288j);
    }

    /* renamed from: g */
    void m7132g(boolean z) {
        long longPressTimeout;
        if (C0252s.m8651L(this.f2284f)) {
            m7134e(null);
            View$OnLongClickListenerC0675z0 view$OnLongClickListenerC0675z0 = f2283p;
            if (view$OnLongClickListenerC0675z0 != null) {
                view$OnLongClickListenerC0675z0.m7136c();
            }
            f2283p = this;
            this.f2292n = z;
            C0575a1 c0575a1 = new C0575a1(this.f2284f.getContext());
            this.f2291m = c0575a1;
            c0575a1.m7531e(this.f2284f, this.f2289k, this.f2290l, this.f2292n, this.f2285g);
            this.f2284f.addOnAttachStateChangeListener(this);
            if (this.f2292n) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((C0252s.m8657F(this.f2284f) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f2284f.removeCallbacks(this.f2288j);
            this.f2284f.postDelayed(this.f2288j, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2291m == null || !this.f2292n) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2284f.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    m7137b();
                    m7136c();
                }
            } else if (this.f2284f.isEnabled() && this.f2291m == null && m7131h(motionEvent)) {
                m7134e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2289k = view.getWidth() / 2;
        this.f2290l = view.getHeight() / 2;
        m7132g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m7136c();
    }
}
