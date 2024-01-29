package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f5727b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes.dex */
    class C1924a extends AnimatorListenerAdapter {
        C1924a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f5727b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo2432H(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f5727b != null;
        if (z3) {
            this.f5727b.cancel();
        }
        AnimatorSet mo2435J = mo2435J(view, view2, z, z3);
        this.f5727b = mo2435J;
        mo2435J.addListener(new C1924a());
        this.f5727b.start();
        if (!z2) {
            this.f5727b.end();
        }
        return true;
    }

    /* renamed from: J */
    protected abstract AnimatorSet mo2435J(View view, View view2, boolean z, boolean z2);
}
