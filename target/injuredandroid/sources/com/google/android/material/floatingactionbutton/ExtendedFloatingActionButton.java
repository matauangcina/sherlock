package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C1842b;
import java.util.List;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p078l.C1357h;
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0692b {

    /* renamed from: A */
    private final InterfaceC1835d f5294A;

    /* renamed from: B */
    private final CoordinatorLayout.AbstractC0693c<ExtendedFloatingActionButton> f5295B;

    /* renamed from: C */
    private boolean f5296C;

    /* renamed from: w */
    private final Rect f5297w;

    /* renamed from: x */
    private final InterfaceC1835d f5298x;

    /* renamed from: y */
    private final InterfaceC1835d f5299y;

    /* renamed from: z */
    private final InterfaceC1835d f5300z;

    /* loaded from: classes.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0693c<T> {

        /* renamed from: a */
        private Rect f5301a;

        /* renamed from: b */
        private AbstractC1812d f5302b;

        /* renamed from: c */
        private AbstractC1812d f5303c;

        /* renamed from: d */
        private boolean f5304d;

        /* renamed from: e */
        private boolean f5305e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f5304d = false;
            this.f5305e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.ExtendedFloatingActionButton_Behavior_Layout);
            this.f5304d = obtainStyledAttributes.getBoolean(C1349k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f5305e = obtainStyledAttributes.getBoolean(C1349k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: G */
        private static boolean m2938G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0696f) {
                return ((CoordinatorLayout.C0696f) layoutParams).m7030f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: H */
        private void m2937H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect rect = extendedFloatingActionButton.f5297w;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0696f c0696f = (CoordinatorLayout.C0696f) extendedFloatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0696f).rightMargin ? rect.right : extendedFloatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0696f).leftMargin ? -rect.left : 0;
            if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin) {
                i = rect.bottom;
            } else if (extendedFloatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0696f).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                C0252s.m8644S(extendedFloatingActionButton, i);
            }
            if (i2 != 0) {
                C0252s.m8645R(extendedFloatingActionButton, i2);
            }
        }

        /* renamed from: K */
        private boolean m2934K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f5304d || this.f5305e) && ((CoordinatorLayout.C0696f) extendedFloatingActionButton.getLayoutParams()).m7031e() == view.getId();
        }

        /* renamed from: M */
        private boolean m2932M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m2934K(appBarLayout, extendedFloatingActionButton)) {
                if (this.f5301a == null) {
                    this.f5301a = new Rect();
                }
                Rect rect = this.f5301a;
                C1842b.m2748a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    m2933L(extendedFloatingActionButton);
                    return true;
                }
                m2940E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        /* renamed from: N */
        private boolean m2931N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m2934K(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0696f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    m2933L(extendedFloatingActionButton);
                    return true;
                }
                m2940E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        /* renamed from: E */
        protected void m2940E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m2942m(this.f5305e ? extendedFloatingActionButton.f5299y : extendedFloatingActionButton.f5300z, this.f5305e ? this.f5303c : this.f5302b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: F */
        public boolean mo2898b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect rect2 = extendedFloatingActionButton.f5297w;
            rect.set(extendedFloatingActionButton.getLeft() + rect2.left, extendedFloatingActionButton.getTop() + rect2.top, extendedFloatingActionButton.getRight() - rect2.right, extendedFloatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: I */
        public boolean mo2461h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m2932M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m2938G(view)) {
                m2931N(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: J */
        public boolean mo2460l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> m7055r = coordinatorLayout.m7055r(extendedFloatingActionButton);
            int size = m7055r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m7055r.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m2938G(view) && m2931N(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m2932M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m7082I(extendedFloatingActionButton, i);
            m2937H(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        /* renamed from: L */
        protected void m2933L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m2942m(this.f5305e ? extendedFloatingActionButton.f5298x : extendedFloatingActionButton.f5294A, this.f5305e ? this.f5303c : this.f5302b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: g */
        public void mo2437g(CoordinatorLayout.C0696f c0696f) {
            if (c0696f.f2513h == 0) {
                c0696f.f2513h = 80;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes.dex */
    public class C1809a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5306a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC1835d f5307b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1812d f5308c;

        C1809a(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC1835d interfaceC1835d, AbstractC1812d abstractC1812d) {
            this.f5307b = interfaceC1835d;
            this.f5308c = abstractC1812d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5306a = true;
            this.f5307b.m2816b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5307b.m2817a();
            if (this.f5306a) {
                return;
            }
            this.f5307b.m2810h(this.f5308c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5307b.onAnimationStart(animator);
            this.f5306a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes.dex */
    static class C1810b extends Property<View, Float> {
        C1810b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes.dex */
    static class C1811c extends Property<View, Float> {
        C1811c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1812d {
    }

    static {
        new C1810b(Float.class, "width");
        new C1811c(Float.class, "height");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m2942m(InterfaceC1835d interfaceC1835d, AbstractC1812d abstractC1812d) {
        if (interfaceC1835d.m2809i()) {
            return;
        }
        if (!m2941n()) {
            interfaceC1835d.m2814d();
            interfaceC1835d.m2810h(abstractC1812d);
            return;
        }
        measure(0, 0);
        AnimatorSet m2812f = interfaceC1835d.m2812f();
        m2812f.addListener(new C1809a(this, interfaceC1835d, abstractC1812d));
        for (Animator.AnimatorListener animatorListener : interfaceC1835d.m2811g()) {
            m2812f.addListener(animatorListener);
        }
        m2812f.start();
    }

    /* renamed from: n */
    private boolean m2941n() {
        return C0252s.m8650M(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0692b
    public CoordinatorLayout.AbstractC0693c<ExtendedFloatingActionButton> getBehavior() {
        return this.f5295B;
    }

    int getCollapsedSize() {
        return (Math.min(C0252s.m8661B(this), C0252s.m8662A(this)) * 2) + getIconSize();
    }

    public C1357h getExtendMotionSpec() {
        return this.f5299y.m2813e();
    }

    public C1357h getHideMotionSpec() {
        return this.f5294A.m2813e();
    }

    public C1357h getShowMotionSpec() {
        return this.f5300z.m2813e();
    }

    public C1357h getShrinkMotionSpec() {
        return this.f5298x.m2813e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5296C && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f5296C = false;
            this.f5298x.m2814d();
        }
    }

    public void setExtendMotionSpec(C1357h c1357h) {
        this.f5299y.m2815c(c1357h);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C1357h.m4365c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f5296C == z) {
            return;
        }
        InterfaceC1835d interfaceC1835d = z ? this.f5299y : this.f5298x;
        if (interfaceC1835d.m2809i()) {
            return;
        }
        interfaceC1835d.m2814d();
    }

    public void setHideMotionSpec(C1357h c1357h) {
        this.f5294A.m2815c(c1357h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C1357h.m4365c(getContext(), i));
    }

    public void setShowMotionSpec(C1357h c1357h) {
        this.f5300z.m2815c(c1357h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C1357h.m4365c(getContext(), i));
    }

    public void setShrinkMotionSpec(C1357h c1357h) {
        this.f5298x.m2815c(c1357h);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C1357h.m4365c(getContext(), i));
    }
}
