package p000a.p047p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p000a.p019g.p028k.C0252s;
/* renamed from: a.p.d */
/* loaded from: classes.dex */
public class C0348d extends AbstractC0369j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.p.d$a */
    /* loaded from: classes.dex */
    public class C0349a extends C0385n {

        /* renamed from: a */
        final /* synthetic */ View f918a;

        C0349a(C0348d c0348d, View view) {
            this.f918a = view;
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            C0345c0.m8349g(this.f918a, 1.0f);
            C0345c0.m8355a(this.f918a);
            abstractC0377m.mo8265P(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.p.d$b */
    /* loaded from: classes.dex */
    public static class C0350b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f919a;

        /* renamed from: b */
        private boolean f920b = false;

        C0350b(View view) {
            this.f919a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0345c0.m8349g(this.f919a, 1.0f);
            if (this.f920b) {
                this.f919a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0252s.m8654I(this.f919a) && this.f919a.getLayerType() == 0) {
                this.f920b = true;
                this.f919a.setLayerType(2, null);
            }
        }
    }

    public C0348d(int i) {
        m8319i0(i);
    }

    /* renamed from: j0 */
    private Animator m8341j0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0345c0.m8349g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0345c0.f917b, f2);
        ofFloat.addListener(new C0350b(view));
        mo8255a(new C0349a(this, view));
        return ofFloat;
    }

    /* renamed from: k0 */
    private static float m8340k0(C0394s c0394s, float f) {
        Float f2;
        return (c0394s == null || (f2 = (Float) c0394s.f1031a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p000a.p047p.AbstractC0369j0
    /* renamed from: e0 */
    public Animator mo8323e0(ViewGroup viewGroup, View view, C0394s c0394s, C0394s c0394s2) {
        float m8340k0 = m8340k0(c0394s, 0.0f);
        return m8341j0(view, m8340k0 != 1.0f ? m8340k0 : 0.0f, 1.0f);
    }

    @Override // p000a.p047p.AbstractC0369j0
    /* renamed from: g0 */
    public Animator mo8321g0(ViewGroup viewGroup, View view, C0394s c0394s, C0394s c0394s2) {
        C0345c0.m8351e(view);
        return m8341j0(view, m8340k0(c0394s, 1.0f), 0.0f);
    }

    @Override // p000a.p047p.AbstractC0369j0, p000a.p047p.AbstractC0377m
    /* renamed from: j */
    public void mo8242j(C0394s c0394s) {
        super.mo8242j(c0394s);
        c0394s.f1031a.put("android:fade:transitionAlpha", Float.valueOf(C0345c0.m8353c(c0394s.f1032b)));
    }
}
