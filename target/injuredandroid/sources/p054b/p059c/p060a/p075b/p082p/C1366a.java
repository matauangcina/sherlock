package p054b.p059c.p060a.p075b.p082p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import p054b.p059c.p060a.p075b.p082p.InterfaceC1370d;
/* renamed from: b.c.a.b.p.a */
/* loaded from: classes.dex */
public final class C1366a {

    /* renamed from: b.c.a.b.p.a$a */
    /* loaded from: classes.dex */
    static class C1367a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1370d f4265a;

        C1367a(InterfaceC1370d interfaceC1370d) {
            this.f4265a = interfaceC1370d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4265a.mo4293a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4265a.mo4292b();
        }
    }

    /* renamed from: a */
    public static Animator m4311a(InterfaceC1370d interfaceC1370d, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC1370d, (Property<InterfaceC1370d, V>) InterfaceC1370d.C1373c.f4270a, (TypeEvaluator) InterfaceC1370d.C1372b.f4268b, (Object[]) new InterfaceC1370d.C1375e[]{new InterfaceC1370d.C1375e(f, f2, f3)});
        if (Build.VERSION.SDK_INT >= 21) {
            InterfaceC1370d.C1375e revealInfo = interfaceC1370d.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC1370d, (int) f, (int) f2, revealInfo.f4274c, f3);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m4310b(InterfaceC1370d interfaceC1370d) {
        return new C1367a(interfaceC1370d);
    }
}
