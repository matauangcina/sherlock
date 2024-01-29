package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p054b.p059c.p060a.p075b.p078l.C1351b;
import p054b.p059c.p060a.p075b.p078l.C1358i;
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C1358i f5744c;

    /* renamed from: d */
    private final C1358i f5745d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes.dex */
    class C1930a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f5746a;

        /* renamed from: b */
        final /* synthetic */ View f5747b;

        C1930a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f5746a = z;
            this.f5747b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5746a) {
                return;
            }
            this.f5747b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f5746a) {
                this.f5747b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f5744c = new C1358i(75L, 150L);
        this.f5745d = new C1358i(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5744c = new C1358i(75L, 150L);
        this.f5745d = new C1358i(0L, 150L);
    }

    /* renamed from: K */
    private void m2434K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        C1358i c1358i = z ? this.f5744c : this.f5745d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        c1358i.m4358a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: D */
    public boolean mo2436D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2436D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo2435J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m2434K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C1351b.m4376a(animatorSet, arrayList);
        animatorSet.addListener(new C1930a(this, z, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: e */
    public boolean mo2433e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
