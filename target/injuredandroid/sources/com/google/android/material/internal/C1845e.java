package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
/* renamed from: com.google.android.material.internal.e */
/* loaded from: classes.dex */
public final class C1845e {

    /* renamed from: a */
    private final ArrayList<C1847b> f5486a = new ArrayList<>();

    /* renamed from: b */
    private C1847b f5487b = null;

    /* renamed from: c */
    ValueAnimator f5488c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f5489d = new C1846a();

    /* renamed from: com.google.android.material.internal.e$a */
    /* loaded from: classes.dex */
    class C1846a extends AnimatorListenerAdapter {
        C1846a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1845e c1845e = C1845e.this;
            if (c1845e.f5488c == animator) {
                c1845e.f5488c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.e$b */
    /* loaded from: classes.dex */
    public static class C1847b {

        /* renamed from: a */
        final int[] f5491a;

        /* renamed from: b */
        final ValueAnimator f5492b;

        C1847b(int[] iArr, ValueAnimator valueAnimator) {
            this.f5491a = iArr;
            this.f5492b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m2741b() {
        ValueAnimator valueAnimator = this.f5488c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5488c = null;
        }
    }

    /* renamed from: e */
    private void m2738e(C1847b c1847b) {
        ValueAnimator valueAnimator = c1847b.f5492b;
        this.f5488c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void m2742a(int[] iArr, ValueAnimator valueAnimator) {
        C1847b c1847b = new C1847b(iArr, valueAnimator);
        valueAnimator.addListener(this.f5489d);
        this.f5486a.add(c1847b);
    }

    /* renamed from: c */
    public void m2740c() {
        ValueAnimator valueAnimator = this.f5488c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f5488c = null;
        }
    }

    /* renamed from: d */
    public void m2739d(int[] iArr) {
        C1847b c1847b;
        int size = this.f5486a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1847b = null;
                break;
            }
            c1847b = this.f5486a.get(i);
            if (StateSet.stateSetMatches(c1847b.f5491a, iArr)) {
                break;
            }
            i++;
        }
        C1847b c1847b2 = this.f5487b;
        if (c1847b == c1847b2) {
            return;
        }
        if (c1847b2 != null) {
            m2741b();
        }
        this.f5487b = c1847b;
        if (c1847b != null) {
            m2738e(c1847b);
        }
    }
}
