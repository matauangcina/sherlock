package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C0608j;
import androidx.appcompat.widget.C0630n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0759a;
import androidx.core.widget.InterfaceC0783l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C1820b;
import com.google.android.material.internal.C1842b;
import com.google.android.material.internal.C1851g;
import com.google.android.material.internal.C1852h;
import com.google.android.material.internal.C1853i;
import java.util.List;
import p000a.p019g.p027j.C0194i;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.InterfaceC0251r;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n;
import p054b.p059c.p060a.p075b.p077b0.C1339a;
import p054b.p059c.p060a.p075b.p078l.C1357h;
import p054b.p059c.p060a.p075b.p078l.InterfaceC1360k;
import p054b.p059c.p060a.p075b.p088u.C1382b;
import p054b.p059c.p060a.p075b.p088u.InterfaceC1381a;
import p054b.p059c.p060a.p075b.p091x.C1388c;
import p054b.p059c.p060a.p075b.p093z.InterfaceC1399b;
@CoordinatorLayout.InterfaceC0694d(Behavior.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends C1853i implements InterfaceC0251r, InterfaceC0783l, InterfaceC1381a, InterfaceC1337n {

    /* renamed from: w */
    private static final int f5309w = C1348j.Widget_Design_FloatingActionButton;

    /* renamed from: g */
    private ColorStateList f5310g;

    /* renamed from: h */
    private PorterDuff.Mode f5311h;

    /* renamed from: i */
    private ColorStateList f5312i;

    /* renamed from: j */
    private PorterDuff.Mode f5313j;

    /* renamed from: k */
    private ColorStateList f5314k;

    /* renamed from: l */
    private int f5315l;

    /* renamed from: m */
    private int f5316m;

    /* renamed from: n */
    private int f5317n;

    /* renamed from: o */
    private int f5318o;

    /* renamed from: p */
    private int f5319p;

    /* renamed from: q */
    boolean f5320q;

    /* renamed from: r */
    final Rect f5321r;

    /* renamed from: s */
    private final Rect f5322s;

    /* renamed from: t */
    private final C0630n f5323t;

    /* renamed from: u */
    private final C1382b f5324u;

    /* renamed from: v */
    private C1820b f5325v;

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0693c<T> {

        /* renamed from: a */
        private Rect f5326a;

        /* renamed from: b */
        private AbstractC1814b f5327b;

        /* renamed from: c */
        private boolean f5328c;

        public BaseBehavior() {
            this.f5328c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.FloatingActionButton_Behavior_Layout);
            this.f5328c = obtainStyledAttributes.getBoolean(C1349k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: F */
        private static boolean m2905F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0696f) {
                return ((CoordinatorLayout.C0696f) layoutParams).m7030f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m2904G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f5321r;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0696f c0696f = (CoordinatorLayout.C0696f) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0696f).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0696f).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0696f).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                C0252s.m8644S(floatingActionButton, i);
            }
            if (i2 != 0) {
                C0252s.m8645R(floatingActionButton, i2);
            }
        }

        /* renamed from: J */
        private boolean m2901J(View view, FloatingActionButton floatingActionButton) {
            return this.f5328c && ((CoordinatorLayout.C0696f) floatingActionButton.getLayoutParams()).m7031e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m2900K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (m2901J(appBarLayout, floatingActionButton)) {
                if (this.f5326a == null) {
                    this.f5326a = new Rect();
                }
                Rect rect = this.f5326a;
                C1842b.m2748a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m2915m(this.f5327b, false);
                    return true;
                }
                floatingActionButton.m2908t(this.f5327b, false);
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m2899L(View view, FloatingActionButton floatingActionButton) {
            if (m2901J(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0696f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m2915m(this.f5327b, false);
                    return true;
                }
                floatingActionButton.m2908t(this.f5327b, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: E */
        public boolean mo2898b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f5321r;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: H */
        public boolean mo2461h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m2900K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (m2905F(view)) {
                m2899L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: I */
        public boolean mo2460l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> m7055r = coordinatorLayout.m7055r(floatingActionButton);
            int size = m7055r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m7055r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m2905F(view) && m2899L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m2900K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m7082I(floatingActionButton, i);
            m2904G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: g */
        public void mo2437g(CoordinatorLayout.C0696f c0696f) {
            if (c0696f.f2513h == 0) {
                c0696f.f2513h = 80;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes.dex */
    public class C1813a implements C1820b.InterfaceC1830j {

        /* renamed from: a */
        final /* synthetic */ AbstractC1814b f5329a;

        C1813a(AbstractC1814b abstractC1814b) {
            this.f5329a = abstractC1814b;
        }

        @Override // com.google.android.material.floatingactionbutton.C1820b.InterfaceC1830j
        /* renamed from: a */
        public void mo2834a() {
            this.f5329a.mo2896b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C1820b.InterfaceC1830j
        /* renamed from: b */
        public void mo2833b() {
            this.f5329a.mo2897a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1814b {
        /* renamed from: a */
        public void mo2897a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo2896b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes.dex */
    public class C1815c implements InterfaceC1399b {
        C1815c() {
        }

        @Override // p054b.p059c.p060a.p075b.p093z.InterfaceC1399b
        /* renamed from: a */
        public void mo2895a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f5321r.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f5318o, i2 + FloatingActionButton.this.f5318o, i3 + FloatingActionButton.this.f5318o, i4 + FloatingActionButton.this.f5318o);
        }

        @Override // p054b.p059c.p060a.p075b.p093z.InterfaceC1399b
        /* renamed from: b */
        public void mo2894b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p054b.p059c.p060a.p075b.p093z.InterfaceC1399b
        /* renamed from: c */
        public boolean mo2893c() {
            return FloatingActionButton.this.f5320q;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes.dex */
    class C1816d<T extends FloatingActionButton> implements C1820b.InterfaceC1829i {

        /* renamed from: a */
        private final InterfaceC1360k<T> f5332a;

        C1816d(InterfaceC1360k<T> interfaceC1360k) {
            this.f5332a = interfaceC1360k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C1820b.InterfaceC1829i
        /* renamed from: a */
        public void mo2836a() {
            this.f5332a.m4350a(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C1820b.InterfaceC1829i
        /* renamed from: b */
        public void mo2835b() {
            this.f5332a.m4349b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1816d) && ((C1816d) obj).f5332a.equals(this.f5332a);
        }

        public int hashCode() {
            return this.f5332a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(C1851g.m2719f(context, attributeSet, i, f5309w), attributeSet, i);
        this.f5321r = new Rect();
        this.f5322s = new Rect();
        Context context2 = getContext();
        TypedArray m2714k = C1851g.m2714k(context2, attributeSet, C1349k.FloatingActionButton, i, f5309w, new int[0]);
        this.f5310g = C1388c.m4262a(context2, m2714k, C1349k.FloatingActionButton_backgroundTint);
        this.f5311h = C1852h.m2710c(m2714k.getInt(C1349k.FloatingActionButton_backgroundTintMode, -1), null);
        this.f5314k = C1388c.m4262a(context2, m2714k, C1349k.FloatingActionButton_rippleColor);
        this.f5316m = m2714k.getInt(C1349k.FloatingActionButton_fabSize, -1);
        this.f5317n = m2714k.getDimensionPixelSize(C1349k.FloatingActionButton_fabCustomSize, 0);
        this.f5315l = m2714k.getDimensionPixelSize(C1349k.FloatingActionButton_borderWidth, 0);
        float dimension = m2714k.getDimension(C1349k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = m2714k.getDimension(C1349k.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = m2714k.getDimension(C1349k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f5320q = m2714k.getBoolean(C1349k.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1342d.mtrl_fab_min_touch_target);
        this.f5319p = m2714k.getDimensionPixelSize(C1349k.FloatingActionButton_maxImageSize, 0);
        C1357h m4366b = C1357h.m4366b(context2, m2714k, C1349k.FloatingActionButton_showMotionSpec);
        C1357h m4366b2 = C1357h.m4366b(context2, m2714k, C1349k.FloatingActionButton_hideMotionSpec);
        C1322k m4457m = C1322k.m4492g(context2, attributeSet, i, f5309w, C1322k.f4148m).m4457m();
        boolean z = m2714k.getBoolean(C1349k.FloatingActionButton_ensureMinTouchTargetSize, false);
        m2714k.recycle();
        C0630n c0630n = new C0630n(this);
        this.f5323t = c0630n;
        c0630n.m7319f(attributeSet, i);
        this.f5324u = new C1382b(this);
        getImpl().m2869X(m4457m);
        getImpl().mo2818x(this.f5310g, this.f5311h, this.f5314k, this.f5315l);
        getImpl().m2872T(dimensionPixelSize);
        getImpl().m2878N(dimension);
        getImpl().m2875Q(dimension2);
        getImpl().m2871U(dimension3);
        getImpl().m2873S(this.f5319p);
        getImpl().m2868Y(m4366b);
        getImpl().m2876P(m4366b2);
        getImpl().m2877O(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private C1820b getImpl() {
        if (this.f5325v == null) {
            this.f5325v = m2920h();
        }
        return this.f5325v;
    }

    /* renamed from: h */
    private C1820b m2920h() {
        return Build.VERSION.SDK_INT >= 21 ? new C1833c(this, new C1815c()) : new C1820b(this, new C1815c());
    }

    /* renamed from: k */
    private int m2917k(int i) {
        int i2 = this.f5317n;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? C1342d.design_fab_size_normal : C1342d.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m2917k(1) : m2917k(0);
    }

    /* renamed from: p */
    private void m2912p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f5321r;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m2911q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f5312i;
        if (colorStateList == null) {
            C0759a.m6759c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f5313j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0608j.m7408e(colorForState, mode));
    }

    /* renamed from: r */
    private static int m2910r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    /* renamed from: u */
    private C1820b.InterfaceC1830j m2907u(AbstractC1814b abstractC1814b) {
        if (abstractC1814b == null) {
            return null;
        }
        return new C1813a(abstractC1814b);
    }

    @Override // p054b.p059c.p060a.p075b.p088u.InterfaceC1381a
    /* renamed from: a */
    public boolean mo2926a() {
        return this.f5324u.m4276c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo2829E(getDrawableState());
    }

    /* renamed from: e */
    public void m2923e(Animator.AnimatorListener animatorListener) {
        getImpl().m2861d(animatorListener);
    }

    /* renamed from: f */
    public void m2922f(Animator.AnimatorListener animatorListener) {
        getImpl().m2860e(animatorListener);
    }

    /* renamed from: g */
    public void m2921g(InterfaceC1360k<? extends FloatingActionButton> interfaceC1360k) {
        getImpl().m2858f(new C1816d(interfaceC1360k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f5310g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f5311h;
    }

    public float getCompatElevation() {
        return getImpl().mo2820n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m2846q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m2844t();
    }

    public Drawable getContentBackground() {
        return getImpl().m2851k();
    }

    public int getCustomSize() {
        return this.f5317n;
    }

    public int getExpandedComponentIdHint() {
        return this.f5324u.m4277b();
    }

    public C1357h getHideMotionSpec() {
        return getImpl().m2847p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f5314k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f5314k;
    }

    public C1322k getShapeAppearanceModel() {
        C1322k m2843u = getImpl().m2843u();
        C0194i.m8866c(m2843u);
        return m2843u;
    }

    public C1357h getShowMotionSpec() {
        return getImpl().m2842v();
    }

    public int getSize() {
        return this.f5316m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m2917k(this.f5316m);
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public ColorStateList getSupportImageTintList() {
        return this.f5312i;
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f5313j;
    }

    public boolean getUseCompatPadding() {
        return this.f5320q;
    }

    @Deprecated
    /* renamed from: i */
    public boolean m2919i(Rect rect) {
        if (C0252s.m8650M(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            m2912p(rect);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m2918j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m2912p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo2831A();
    }

    /* renamed from: l */
    public void m2916l(AbstractC1814b abstractC1814b) {
        m2915m(abstractC1814b, true);
    }

    /* renamed from: m */
    void m2915m(AbstractC1814b abstractC1814b, boolean z) {
        getImpl().m2841w(m2907u(abstractC1814b), z);
    }

    /* renamed from: n */
    public boolean m2914n() {
        return getImpl().m2840y();
    }

    /* renamed from: o */
    public boolean m2913o() {
        return getImpl().m2839z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m2886B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m2885D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f5318o = (sizeDimension - this.f5319p) / 2;
        getImpl().m2857f0();
        int min = Math.min(m2910r(sizeDimension, i), m2910r(sizeDimension, i2));
        Rect rect = this.f5321r;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1339a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1339a c1339a = (C1339a) parcelable;
        super.onRestoreInstanceState(c1339a.m8522a());
        C1382b c1382b = this.f5324u;
        Bundle bundle = c1339a.f4210h.get("expandableWidgetHelper");
        C0194i.m8866c(bundle);
        c1382b.m4275d(bundle);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C1339a c1339a = new C1339a(onSaveInstanceState);
        c1339a.f4210h.put("expandableWidgetHelper", this.f5324u.m4274e());
        return c1339a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m2919i(this.f5322s) && !this.f5322s.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: s */
    public void m2909s(AbstractC1814b abstractC1814b) {
        m2908t(abstractC1814b, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f5310g != colorStateList) {
            this.f5310g = colorStateList;
            getImpl().m2880L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f5311h != mode) {
            this.f5311h = mode;
            getImpl().m2879M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m2878N(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m2875Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m2871U(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f5317n) {
            this.f5317n = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m2855g0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m2848o()) {
            getImpl().m2877O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f5324u.m4273f(i);
    }

    public void setHideMotionSpec(C1357h c1357h) {
        getImpl().m2876P(c1357h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1357h.m4365c(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m2859e0();
            if (this.f5312i != null) {
                m2911q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f5323t.m7318g(i);
        m2911q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f5314k != colorStateList) {
            this.f5314k = colorStateList;
            getImpl().mo2826V(this.f5314k);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m2882I();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m2882I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m2870W(z);
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n
    public void setShapeAppearanceModel(C1322k c1322k) {
        getImpl().m2869X(c1322k);
    }

    public void setShowMotionSpec(C1357h c1357h) {
        getImpl().m2868Y(c1357h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1357h.m4365c(getContext(), i));
    }

    public void setSize(int i) {
        this.f5317n = 0;
        if (i != this.f5316m) {
            this.f5316m = i;
            requestLayout();
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f5312i != colorStateList) {
            this.f5312i = colorStateList;
            m2911q();
        }
    }

    @Override // androidx.core.widget.InterfaceC0783l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f5313j != mode) {
            this.f5313j = mode;
            m2911q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m2881J();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m2881J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m2881J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5320q != z) {
            this.f5320q = z;
            getImpl().mo2830C();
        }
    }

    @Override // com.google.android.material.internal.C1853i, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    void m2908t(AbstractC1814b abstractC1814b, boolean z) {
        getImpl().m2862c0(m2907u(abstractC1814b), z);
    }
}
