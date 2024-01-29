package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p054b.p059c.p060a.p075b.p078l.C1350a;
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0693c<V> {

    /* renamed from: a */
    private int f4936a;

    /* renamed from: b */
    private int f4937b;

    /* renamed from: c */
    private int f4938c;

    /* renamed from: d */
    private ViewPropertyAnimator f4939d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes.dex */
    public class C1726a extends AnimatorListenerAdapter {
        C1726a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f4939d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f4936a = 0;
        this.f4937b = 2;
        this.f4938c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4936a = 0;
        this.f4937b = 2;
        this.f4938c = 0;
    }

    /* renamed from: F */
    private void m3437F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f4939d = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C1726a());
    }

    /* renamed from: G */
    public void m3436G(V v, int i) {
        this.f4938c = i;
        if (this.f4937b == 1) {
            v.setTranslationY(this.f4936a + i);
        }
    }

    /* renamed from: H */
    public void m3435H(V v) {
        if (this.f4937b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4939d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f4937b = 1;
        m3437F(v, this.f4936a + this.f4938c, 175L, C1350a.f4232c);
    }

    /* renamed from: I */
    public void m3434I(V v) {
        if (this.f4937b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f4939d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f4937b = 2;
        m3437F(v, 0, 225L, C1350a.f4233d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: l */
    public boolean mo2460l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f4936a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo2460l(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: r */
    public void mo3433r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            m3435H(v);
        } else if (i2 < 0) {
            m3434I(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: z */
    public boolean mo3432z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }
}
