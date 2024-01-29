package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C1851g;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C1880b;
import java.util.List;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0197a0;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.InterfaceC0249p;
import p000a.p019g.p028k.p029b0.C0217c;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1346h;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p078l.C1350a;
import p054b.p059c.p060a.p075b.p084q.C1377a;
/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: s */
    static final Handler f5505s;

    /* renamed from: t */
    private static final boolean f5506t;

    /* renamed from: u */
    private static final int[] f5507u;

    /* renamed from: v */
    private static final String f5508v;

    /* renamed from: a */
    private final ViewGroup f5509a;

    /* renamed from: b */
    private final Context f5510b;

    /* renamed from: c */
    protected final C1876v f5511c;

    /* renamed from: d */
    private final InterfaceC1879a f5512d;

    /* renamed from: e */
    private int f5513e;

    /* renamed from: f */
    private boolean f5514f;

    /* renamed from: g */
    private View f5515g;

    /* renamed from: i */
    private Rect f5517i;

    /* renamed from: j */
    private int f5518j;

    /* renamed from: k */
    private int f5519k;

    /* renamed from: l */
    private int f5520l;

    /* renamed from: m */
    private int f5521m;

    /* renamed from: n */
    private int f5522n;

    /* renamed from: o */
    private List<AbstractC1872r<B>> f5523o;

    /* renamed from: p */
    private Behavior f5524p;

    /* renamed from: q */
    private final AccessibilityManager f5525q;

    /* renamed from: h */
    private final Runnable f5516h = new RunnableC1863j();

    /* renamed from: r */
    C1880b.InterfaceC1882b f5526r = new C1866m();

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C1873s f5527k = new C1873s(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public void m2662O(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f5527k.m2652c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo2664E(View view) {
            return this.f5527k.m2654a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: k */
        public boolean mo2661k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f5527k.m2653b(coordinatorLayout, view, motionEvent);
            return super.mo2661k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes.dex */
    public class C1854a extends AnimatorListenerAdapter {
        C1854a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m2700I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes.dex */
    public class C1855b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f5529a;

        C1855b(int i) {
            this.f5529a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m2701H(this.f5529a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes.dex */
    public class C1856c implements ValueAnimator.AnimatorUpdateListener {
        C1856c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f5511c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: classes.dex */
    public class C1857d implements ValueAnimator.AnimatorUpdateListener {
        C1857d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f5511c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f5511c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes.dex */
    public class C1858e extends AnimatorListenerAdapter {
        C1858e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m2700I();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f5512d.mo2639a(70, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: classes.dex */
    public class C1859f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f5534a;

        /* renamed from: b */
        final /* synthetic */ int f5535b;

        C1859f(int i) {
            this.f5535b = i;
            this.f5534a = this.f5535b;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f5506t) {
                C0252s.m8644S(BaseTransientBottomBar.this.f5511c, intValue - this.f5534a);
            } else {
                BaseTransientBottomBar.this.f5511c.setTranslationY(intValue);
            }
            this.f5534a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: classes.dex */
    public class C1860g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f5537a;

        C1860g(int i) {
            this.f5537a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m2701H(this.f5537a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f5512d.mo2638b(0, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: classes.dex */
    public class C1861h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f5539a = 0;

        C1861h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f5506t) {
                C0252s.m8644S(BaseTransientBottomBar.this.f5511c, intValue - this.f5539a);
            } else {
                BaseTransientBottomBar.this.f5511c.setTranslationY(intValue);
            }
            this.f5539a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: classes.dex */
    static class C1862i implements Handler.Callback {
        C1862i() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).m2695O();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).m2704E(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: classes.dex */
    class RunnableC1863j implements Runnable {
        RunnableC1863j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int m2665z;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f5511c == null || baseTransientBottomBar.f5510b == null || (m2665z = (BaseTransientBottomBar.this.m2665z() - BaseTransientBottomBar.this.m2706C()) + ((int) BaseTransientBottomBar.this.f5511c.getTranslationY())) >= BaseTransientBottomBar.this.f5521m) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f5511c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f5508v, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f5521m - m2665z;
            BaseTransientBottomBar.this.f5511c.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: classes.dex */
    class C1864k implements InterfaceC0249p {
        C1864k() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0249p
        /* renamed from: a */
        public C0197a0 mo2660a(View view, C0197a0 c0197a0) {
            BaseTransientBottomBar.this.f5518j = c0197a0.m8853h();
            BaseTransientBottomBar.this.f5519k = c0197a0.m8852i();
            BaseTransientBottomBar.this.f5520l = c0197a0.m8851j();
            BaseTransientBottomBar.this.m2689U();
            return c0197a0;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    /* loaded from: classes.dex */
    class C1865l extends C0195a {
        C1865l() {
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            super.mo2517g(view, c0217c);
            c0217c.m8773a(1048576);
            c0217c.m8768c0(true);
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: j */
        public boolean mo2659j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BaseTransientBottomBar.this.mo2644t();
                return true;
            }
            return super.mo2659j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: classes.dex */
    class C1866m implements C1880b.InterfaceC1882b {
        C1866m() {
        }

        @Override // com.google.android.material.snackbar.C1880b.InterfaceC1882b
        /* renamed from: a */
        public void mo2623a() {
            Handler handler = BaseTransientBottomBar.f5505s;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C1880b.InterfaceC1882b
        /* renamed from: b */
        public void mo2622b(int i) {
            Handler handler = BaseTransientBottomBar.f5505s;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: classes.dex */
    public class C1867n implements InterfaceC1874t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        /* loaded from: classes.dex */
        class RunnableC1868a implements Runnable {
            RunnableC1868a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.m2701H(3);
            }
        }

        C1867n() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC1874t
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f5511c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.f5521m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.m2689U();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC1874t
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.m2703F()) {
                BaseTransientBottomBar.f5505s.post(new RunnableC1868a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: classes.dex */
    public class C1869o implements InterfaceC1875u {
        C1869o() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.InterfaceC1875u
        /* renamed from: a */
        public void mo2651a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f5511c.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.m2694P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    /* loaded from: classes.dex */
    public class C1870p implements SwipeDismissBehavior.InterfaceC1728b {
        C1870p() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC1728b
        /* renamed from: a */
        public void mo2658a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.m2669u(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC1728b
        /* renamed from: b */
        public void mo2657b(int i) {
            if (i == 0) {
                C1880b.m2635c().m2627k(BaseTransientBottomBar.this.f5526r);
            } else if (i == 1 || i == 2) {
                C1880b.m2635c().m2628j(BaseTransientBottomBar.this.f5526r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    /* loaded from: classes.dex */
    public class RunnableC1871q implements Runnable {
        RunnableC1871q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1876v c1876v = BaseTransientBottomBar.this.f5511c;
            if (c1876v == null) {
                return;
            }
            c1876v.setVisibility(0);
            if (BaseTransientBottomBar.this.f5511c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m2693Q();
            } else {
                BaseTransientBottomBar.this.m2691S();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1872r<B> {
        /* renamed from: a */
        public void m2656a(B b, int i) {
        }

        /* renamed from: b */
        public void m2655b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    /* loaded from: classes.dex */
    public static class C1873s {

        /* renamed from: a */
        private C1880b.InterfaceC1882b f5550a;

        public C1873s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m3425L(0.1f);
            swipeDismissBehavior.m3427J(0.6f);
            swipeDismissBehavior.m3424M(0);
        }

        /* renamed from: a */
        public boolean m2654a(View view) {
            return view instanceof C1876v;
        }

        /* renamed from: b */
        public void m2653b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.m7089B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C1880b.m2635c().m2628j(this.f5550a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C1880b.m2635c().m2627k(this.f5550a);
            }
        }

        /* renamed from: c */
        public void m2652c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f5550a = baseTransientBottomBar.f5526r;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    /* loaded from: classes.dex */
    public interface InterfaceC1874t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    /* loaded from: classes.dex */
    public interface InterfaceC1875u {
        /* renamed from: a */
        void mo2651a(View view, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    /* loaded from: classes.dex */
    public static class C1876v extends FrameLayout {

        /* renamed from: k */
        private static final View.OnTouchListener f5551k = new View$OnTouchListenerC1877a();

        /* renamed from: f */
        private InterfaceC1875u f5552f;

        /* renamed from: g */
        private InterfaceC1874t f5553g;

        /* renamed from: h */
        private int f5554h;

        /* renamed from: i */
        private final float f5555i;

        /* renamed from: j */
        private final float f5556j;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        /* loaded from: classes.dex */
        static class View$OnTouchListenerC1877a implements View.OnTouchListener {
            View$OnTouchListenerC1877a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public C1876v(Context context, AttributeSet attributeSet) {
            super(C1851g.m2719f(context, attributeSet, 0, 0), attributeSet);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1349k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C1349k.SnackbarLayout_elevation)) {
                C0252s.m8611m0(this, obtainStyledAttributes.getDimensionPixelSize(C1349k.SnackbarLayout_elevation, 0));
            }
            this.f5554h = obtainStyledAttributes.getInt(C1349k.SnackbarLayout_animationMode, 0);
            this.f5555i = obtainStyledAttributes.getFloat(C1349k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            this.f5556j = obtainStyledAttributes.getFloat(C1349k.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f5551k);
            setFocusable(true);
        }

        float getActionTextColorAlpha() {
            return this.f5556j;
        }

        int getAnimationMode() {
            return this.f5554h;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f5555i;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            InterfaceC1874t interfaceC1874t = this.f5553g;
            if (interfaceC1874t != null) {
                interfaceC1874t.onViewAttachedToWindow(this);
            }
            C0252s.m8629d0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            InterfaceC1874t interfaceC1874t = this.f5553g;
            if (interfaceC1874t != null) {
                interfaceC1874t.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            InterfaceC1875u interfaceC1875u = this.f5552f;
            if (interfaceC1875u != null) {
                interfaceC1875u.mo2651a(this, i, i2, i3, i4);
            }
        }

        void setAnimationMode(int i) {
            this.f5554h = i;
        }

        void setOnAttachStateChangeListener(InterfaceC1874t interfaceC1874t) {
            this.f5553g = interfaceC1874t;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f5551k);
            super.setOnClickListener(onClickListener);
        }

        void setOnLayoutChangeListener(InterfaceC1875u interfaceC1875u) {
            this.f5552f = interfaceC1875u;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f5506t = i >= 16 && i <= 19;
        f5507u = new int[]{C1338b.snackbarStyle};
        f5508v = BaseTransientBottomBar.class.getSimpleName();
        f5505s = new Handler(Looper.getMainLooper(), new C1862i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(ViewGroup viewGroup, View view, InterfaceC1879a interfaceC1879a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC1879a == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f5509a = viewGroup;
        this.f5512d = interfaceC1879a;
        Context context = viewGroup.getContext();
        this.f5510b = context;
        C1851g.m2724a(context);
        C1876v c1876v = (C1876v) LayoutInflater.from(this.f5510b).inflate(m2708A(), this.f5509a, false);
        this.f5511c = c1876v;
        if (c1876v.getBackground() == null) {
            C0252s.m8619i0(this.f5511c, m2670s());
        }
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).m2642c(this.f5511c.getActionTextColorAlpha());
        }
        this.f5511c.addView(view);
        ViewGroup.LayoutParams layoutParams = this.f5511c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f5517i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        C0252s.m8621h0(this.f5511c, 1);
        C0252s.m8605p0(this.f5511c, 1);
        C0252s.m8609n0(this.f5511c, true);
        C0252s.m8601r0(this.f5511c, new C1864k());
        C0252s.m8625f0(this.f5511c, new C1865l());
        this.f5525q = (AccessibilityManager) this.f5510b.getSystemService("accessibility");
    }

    /* renamed from: B */
    private int m2707B() {
        int height = this.f5511c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f5511c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public int m2706C() {
        int[] iArr = new int[2];
        this.f5511c.getLocationOnScreen(iArr);
        return iArr[1] + this.f5511c.getHeight();
    }

    /* renamed from: G */
    private boolean m2702G() {
        ViewGroup.LayoutParams layoutParams = this.f5511c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0696f) && (((CoordinatorLayout.C0696f) layoutParams).m7030f() instanceof SwipeDismissBehavior);
    }

    /* renamed from: K */
    private void m2698K(CoordinatorLayout.C0696f c0696f) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f5524p;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = m2667x();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m2662O(this);
        }
        swipeDismissBehavior.m3426K(new C1870p());
        c0696f.m7021o(swipeDismissBehavior);
        if (this.f5515g == null) {
            c0696f.f2512g = 80;
        }
    }

    /* renamed from: M */
    private boolean m2696M() {
        return this.f5521m > 0 && !this.f5514f && m2702G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m2694P() {
        if (m2697L()) {
            m2673p();
            return;
        }
        this.f5511c.setVisibility(0);
        m2700I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m2693Q() {
        ValueAnimator m2668v = m2668v(0.0f, 1.0f);
        ValueAnimator m2666y = m2666y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m2668v, m2666y);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C1854a());
        animatorSet.start();
    }

    /* renamed from: R */
    private void m2692R(int i) {
        ValueAnimator m2668v = m2668v(1.0f, 0.0f);
        m2668v.setDuration(75L);
        m2668v.addListener(new C1855b(i));
        m2668v.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m2691S() {
        int m2707B = m2707B();
        if (f5506t) {
            C0252s.m8644S(this.f5511c, m2707B);
        } else {
            this.f5511c.setTranslationY(m2707B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m2707B, 0);
        valueAnimator.setInterpolator(C1350a.f4231b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C1858e());
        valueAnimator.addUpdateListener(new C1859f(m2707B));
        valueAnimator.start();
    }

    /* renamed from: T */
    private void m2690T(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m2707B());
        valueAnimator.setInterpolator(C1350a.f4231b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C1860g(i));
        valueAnimator.addUpdateListener(new C1861h());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m2689U() {
        ViewGroup.LayoutParams layoutParams = this.f5511c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f5517i == null) {
            Log.w(f5508v, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        int i = this.f5515g != null ? this.f5522n : this.f5518j;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = this.f5517i;
        marginLayoutParams.bottomMargin = rect.bottom + i;
        marginLayoutParams.leftMargin = rect.left + this.f5519k;
        marginLayoutParams.rightMargin = rect.right + this.f5520l;
        this.f5511c.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !m2696M()) {
            return;
        }
        this.f5511c.removeCallbacks(this.f5516h);
        this.f5511c.post(this.f5516h);
    }

    /* renamed from: q */
    private void m2672q(int i) {
        if (this.f5511c.getAnimationMode() == 1) {
            m2692R(i);
        } else {
            m2690T(i);
        }
    }

    /* renamed from: r */
    private int m2671r() {
        View view = this.f5515g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f5509a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f5509a.getHeight()) - i;
    }

    /* renamed from: s */
    private Drawable m2670s() {
        C1876v c1876v = this.f5511c;
        int m4285g = C1377a.m4285g(c1876v, C1338b.colorSurface, C1338b.colorOnSurface, c1876v.getBackgroundOverlayColorAlpha());
        float dimension = this.f5511c.getResources().getDimension(C1342d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(m4285g);
        gradientDrawable.setCornerRadius(dimension);
        return gradientDrawable;
    }

    /* renamed from: v */
    private ValueAnimator m2668v(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1350a.f4230a);
        ofFloat.addUpdateListener(new C1856c());
        return ofFloat;
    }

    /* renamed from: y */
    private ValueAnimator m2666y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1350a.f4233d);
        ofFloat.addUpdateListener(new C1857d());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public int m2665z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f5510b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: A */
    protected int m2708A() {
        return m2705D() ? C1346h.mtrl_layout_snackbar : C1346h.design_layout_snackbar;
    }

    /* renamed from: D */
    protected boolean m2705D() {
        TypedArray obtainStyledAttributes = this.f5510b.obtainStyledAttributes(f5507u);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: E */
    final void m2704E(int i) {
        if (m2697L() && this.f5511c.getVisibility() == 0) {
            m2672q(i);
        } else {
            m2701H(i);
        }
    }

    /* renamed from: F */
    public boolean m2703F() {
        return C1880b.m2635c().m2633e(this.f5526r);
    }

    /* renamed from: H */
    void m2701H(int i) {
        C1880b.m2635c().m2630h(this.f5526r);
        List<AbstractC1872r<B>> list = this.f5523o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5523o.get(size).m2656a(this, i);
            }
        }
        ViewParent parent = this.f5511c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f5511c);
        }
    }

    /* renamed from: I */
    void m2700I() {
        C1880b.m2635c().m2629i(this.f5526r);
        List<AbstractC1872r<B>> list = this.f5523o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5523o.get(size).m2655b(this);
            }
        }
    }

    /* renamed from: J */
    public B m2699J(int i) {
        this.f5513e = i;
        return this;
    }

    /* renamed from: L */
    boolean m2697L() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f5525q.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* renamed from: N */
    public void mo2650N() {
        C1880b.m2635c().m2625m(mo2643w(), this.f5526r);
    }

    /* renamed from: O */
    final void m2695O() {
        this.f5511c.setOnAttachStateChangeListener(new C1867n());
        if (this.f5511c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f5511c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0696f) {
                m2698K((CoordinatorLayout.C0696f) layoutParams);
            }
            this.f5522n = m2671r();
            m2689U();
            this.f5511c.setVisibility(4);
            this.f5509a.addView(this.f5511c);
        }
        if (C0252s.m8650M(this.f5511c)) {
            m2694P();
        } else {
            this.f5511c.setOnLayoutChangeListener(new C1869o());
        }
    }

    /* renamed from: p */
    void m2673p() {
        this.f5511c.post(new RunnableC1871q());
    }

    /* renamed from: t */
    public void mo2644t() {
        m2669u(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public void m2669u(int i) {
        C1880b.m2635c().m2636b(this.f5526r, i);
    }

    /* renamed from: w */
    public int mo2643w() {
        return this.f5513e;
    }

    /* renamed from: x */
    protected SwipeDismissBehavior<? extends View> m2667x() {
        return new Behavior();
    }
}
