package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0759a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p019g.p028k.C0252s;
import p000a.p032i.p033a.AbstractC0280a;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1319h;
import p054b.p059c.p060a.p075b.p078l.InterfaceC1360k;
/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0692b {

    /* renamed from: U */
    private final int f4957U;

    /* renamed from: V */
    private final C1315g f4958V;

    /* renamed from: W */
    private Animator f4959W;

    /* renamed from: a0 */
    private Animator f4960a0;

    /* renamed from: b0 */
    private int f4961b0;

    /* renamed from: c0 */
    private int f4962c0;

    /* renamed from: d0 */
    private boolean f4963d0;

    /* renamed from: e0 */
    private int f4964e0;

    /* renamed from: f0 */
    private ArrayList<InterfaceC1737f> f4965f0;

    /* renamed from: g0 */
    private boolean f4966g0;

    /* renamed from: h0 */
    private Behavior f4967h0;

    /* renamed from: i0 */
    private int f4968i0;

    /* renamed from: j0 */
    AnimatorListenerAdapter f4969j0;

    /* renamed from: k0 */
    InterfaceC1360k<FloatingActionButton> f4970k0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f4971e;

        /* renamed from: f */
        private WeakReference<BottomAppBar> f4972f;

        /* renamed from: g */
        private int f4973g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f4974h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes.dex */
        class View$OnLayoutChangeListenerC1730a implements View.OnLayoutChangeListener {
            View$OnLayoutChangeListenerC1730a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f4972f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.m2918j(Behavior.this.f4971e);
                int height = Behavior.this.f4971e.height();
                bottomAppBar.m3393q0(height);
                CoordinatorLayout.C0696f c0696f = (CoordinatorLayout.C0696f) view.getLayoutParams();
                if (Behavior.this.f4973g == 0) {
                    int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(C1342d.mtrl_bottomappbar_fab_bottom_margin);
                    ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                }
            }
        }

        public Behavior() {
            this.f4974h = new View$OnLayoutChangeListenerC1730a();
            this.f4971e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4974h = new View$OnLayoutChangeListenerC1730a();
            this.f4971e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: M */
        public boolean mo2460l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f4972f = new WeakReference<>(bottomAppBar);
            View m3401i0 = bottomAppBar.m3401i0();
            if (m3401i0 != null && !C0252s.m8650M(m3401i0)) {
                CoordinatorLayout.C0696f c0696f = (CoordinatorLayout.C0696f) m3401i0.getLayoutParams();
                c0696f.f2509d = 49;
                this.f4973g = ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin;
                if (m3401i0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m3401i0;
                    floatingActionButton.addOnLayoutChangeListener(this.f4974h);
                    bottomAppBar.m3409a0(floatingActionButton);
                }
                bottomAppBar.m3394p0();
            }
            coordinatorLayout.m7082I(bottomAppBar, i);
            return super.mo2460l(coordinatorLayout, bottomAppBar, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
        /* renamed from: N */
        public boolean mo3371A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo3371A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes.dex */
    public class C1731a extends AnimatorListenerAdapter {
        C1731a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m3404f0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m3403g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes.dex */
    public class C1732b extends FloatingActionButton.AbstractC1814b {

        /* renamed from: a */
        final /* synthetic */ int f4977a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        /* loaded from: classes.dex */
        class C1733a extends FloatingActionButton.AbstractC1814b {
            C1733a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1814b
            /* renamed from: b */
            public void mo2896b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m3404f0();
            }
        }

        C1732b(int i) {
            this.f4977a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1814b
        /* renamed from: a */
        public void mo2897a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m3399k0(this.f4977a));
            floatingActionButton.m2909s(new C1733a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes.dex */
    public class C1734c extends AnimatorListenerAdapter {
        C1734c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m3404f0();
            BottomAppBar.this.f4960a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m3403g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes.dex */
    public class C1735d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4981a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f4982b;

        /* renamed from: c */
        final /* synthetic */ int f4983c;

        /* renamed from: d */
        final /* synthetic */ boolean f4984d;

        C1735d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f4982b = actionMenuView;
            this.f4983c = i;
            this.f4984d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4981a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4981a) {
                return;
            }
            BottomAppBar.this.m3392r0(this.f4982b, this.f4983c, this.f4984d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes.dex */
    public class C1736e extends AnimatorListenerAdapter {
        C1736e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f4969j0.onAnimationStart(animator);
            FloatingActionButton m3402h0 = BottomAppBar.this.m3402h0();
            if (m3402h0 != null) {
                m3402h0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1737f {
        /* renamed from: a */
        void m3386a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void m3385b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes.dex */
    public static class C1738g extends AbstractC0280a {
        public static final Parcelable.Creator<C1738g> CREATOR = new C1739a();

        /* renamed from: h */
        int f4987h;

        /* renamed from: i */
        boolean f4988i;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g$a */
        /* loaded from: classes.dex */
        static class C1739a implements Parcelable.ClassLoaderCreator<C1738g> {
            C1739a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1738g createFromParcel(Parcel parcel) {
                return new C1738g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1738g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1738g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1738g[] newArray(int i) {
                return new C1738g[i];
            }
        }

        public C1738g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4987h = parcel.readInt();
            this.f4988i = parcel.readInt() != 0;
        }

        public C1738g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4987h);
            parcel.writeInt(this.f4988i ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m3409a0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m2923e(this.f4969j0);
        floatingActionButton.m2922f(new C1736e());
        floatingActionButton.m2921g(this.f4970k0);
    }

    /* renamed from: b0 */
    private void m3408b0() {
        Animator animator = this.f4960a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f4959W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: d0 */
    private void m3406d0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m3402h0(), "translationX", m3399k0(i));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: e0 */
    private void m3405e0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m3400j0(actionMenuView, i, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
                return;
            }
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
        ofFloat2.addListener(new C1735d(actionMenuView, i, z));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playSequentially(ofFloat2, ofFloat);
        list.add(animatorSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m3404f0() {
        ArrayList<InterfaceC1737f> arrayList;
        int i = this.f4964e0 - 1;
        this.f4964e0 = i;
        if (i != 0 || (arrayList = this.f4965f0) == null) {
            return;
        }
        Iterator<InterfaceC1737f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m3386a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m3403g0() {
        ArrayList<InterfaceC1737f> arrayList;
        int i = this.f4964e0;
        this.f4964e0 = i + 1;
        if (i != 0 || (arrayList = this.f4965f0) == null) {
            return;
        }
        Iterator<InterfaceC1737f> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m3385b(this);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f4968i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m3399k0(this.f4961b0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m3380b();
    }

    private C1740a getTopEdgeTreatment() {
        return (C1740a) this.f4958V.m4562B().m4483p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public FloatingActionButton m3402h0() {
        View m3401i0 = m3401i0();
        if (m3401i0 instanceof FloatingActionButton) {
            return (FloatingActionButton) m3401i0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View m3401i0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.m7054s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m3401i0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public float m3399k0(int i) {
        boolean z = C0252s.m8592w(this) == 1;
        if (i == 1) {
            return ((getMeasuredWidth() / 2) - this.f4957U) * (z ? -1 : 1);
        }
        return 0.0f;
    }

    /* renamed from: l0 */
    private boolean m3398l0() {
        FloatingActionButton m3402h0 = m3402h0();
        return m3402h0 != null && m3402h0.m2913o();
    }

    /* renamed from: m0 */
    private void m3397m0(int i, boolean z) {
        if (C0252s.m8650M(this)) {
            Animator animator = this.f4960a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m3398l0()) {
                i = 0;
                z = false;
            }
            m3405e0(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f4960a0 = animatorSet;
            animatorSet.addListener(new C1734c());
            this.f4960a0.start();
        }
    }

    /* renamed from: n0 */
    private void m3396n0(int i) {
        if (this.f4961b0 == i || !C0252s.m8650M(this)) {
            return;
        }
        Animator animator = this.f4959W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f4962c0 == 1) {
            m3406d0(i, arrayList);
        } else {
            m3407c0(i, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f4959W = animatorSet;
        animatorSet.addListener(new C1731a());
        this.f4959W.start();
    }

    /* renamed from: o0 */
    private void m3395o0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (m3398l0()) {
                m3392r0(actionMenuView, this.f4961b0, this.f4966g0);
            } else {
                m3392r0(actionMenuView, 0, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public void m3394p0() {
        getTopEdgeTreatment().m3372j(getFabTranslationX());
        View m3401i0 = m3401i0();
        this.f4958V.m4543U((this.f4966g0 && m3398l0()) ? 1.0f : 0.0f);
        if (m3401i0 != null) {
            m3401i0.setTranslationY(getFabTranslationY());
            m3401i0.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public void m3392r0(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX(m3400j0(actionMenuView, i, z));
    }

    /* renamed from: c0 */
    protected void m3407c0(int i, List<Animator> list) {
        FloatingActionButton m3402h0 = m3402h0();
        if (m3402h0 == null || m3402h0.m2914n()) {
            return;
        }
        m3403g0();
        m3402h0.m2916l(new C1732b(i));
    }

    public ColorStateList getBackgroundTint() {
        return this.f4958V.m4560D();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0692b
    public Behavior getBehavior() {
        if (this.f4967h0 == null) {
            this.f4967h0 = new Behavior();
        }
        return this.f4967h0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m3380b();
    }

    public int getFabAlignmentMode() {
        return this.f4961b0;
    }

    public int getFabAnimationMode() {
        return this.f4962c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m3379c();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m3378d();
    }

    public boolean getHideOnScroll() {
        return this.f4963d0;
    }

    /* renamed from: j0 */
    protected int m3400j0(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C0252s.m8592w(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0567e) && (((Toolbar.C0567e) childAt.getLayoutParams()).f1288a & 8388615) == 8388611) {
                measuredWidth = z2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i == 1 && z) {
            return right;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1319h.m4501f(this, this.f4958V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m3408b0();
            m3394p0();
        }
        m3395o0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1738g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1738g c1738g = (C1738g) parcelable;
        super.onRestoreInstanceState(c1738g.m8522a());
        this.f4961b0 = c1738g.f4987h;
        this.f4966g0 = c1738g.f4988i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        C1738g c1738g = new C1738g(super.onSaveInstanceState());
        c1738g.f4987h = this.f4961b0;
        c1738g.f4988i = this.f4966g0;
        return c1738g;
    }

    /* renamed from: q0 */
    boolean m3393q0(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().m3377e()) {
            getTopEdgeTreatment().m3373i(f);
            this.f4958V.invalidateSelf();
            return true;
        }
        return false;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0759a.m6747o(this.f4958V, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m3376f(f);
            this.f4958V.invalidateSelf();
            m3394p0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.f4958V.m4545S(f);
        getBehavior().m3436G(this, this.f4958V.m4563A() - this.f4958V.m4507z());
    }

    public void setFabAlignmentMode(int i) {
        m3396n0(i);
        m3397m0(i, this.f4966g0);
        this.f4961b0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f4962c0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m3375g(f);
            this.f4958V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m3374h(f);
            this.f4958V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f4963d0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
