package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C1851g;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1345g;
/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes.dex */
class C1725e {

    /* renamed from: a */
    private static final int[] f4935a = {16843848};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3441a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m3440b(View view, float f) {
        int integer = view.getResources().getInteger(C1345g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842766, C1338b.state_liftable, -C1338b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m3439c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray m2714k = C1851g.m2714k(context, attributeSet, f4935a, i, i2, new int[0]);
        try {
            if (m2714k.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m2714k.getResourceId(0, 0)));
            }
        } finally {
            m2714k.recycle();
        }
    }
}
