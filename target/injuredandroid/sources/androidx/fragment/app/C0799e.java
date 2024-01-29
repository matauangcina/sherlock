package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0837u;
import p000a.p019g.p024g.C0144b;
import p000a.p019g.p028k.ViewTreeObserver$OnPreDrawListenerC0250q;
import p000a.p035j.C0295a;
import p000a.p035j.C0296b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public class C0799e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes.dex */
    public static class C0800a implements C0144b.InterfaceC0145a {

        /* renamed from: a */
        final /* synthetic */ Fragment f2890a;

        C0800a(Fragment fragment) {
            this.f2890a = fragment;
        }

        @Override // p000a.p019g.p024g.C0144b.InterfaceC0145a
        /* renamed from: a */
        public void mo6479a() {
            if (this.f2890a.m6548n() != null) {
                View m6548n = this.f2890a.m6548n();
                this.f2890a.m6558h1(null);
                m6548n.clearAnimation();
            }
            this.f2890a.m6557i1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$b  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class animationAnimation$AnimationListenerC0801b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2891a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2892b;

        /* renamed from: c */
        final /* synthetic */ C0837u.InterfaceC0844g f2893c;

        /* renamed from: d */
        final /* synthetic */ C0144b f2894d;

        /* renamed from: androidx.fragment.app.e$b$a */
        /* loaded from: classes.dex */
        class RunnableC0802a implements Runnable {
            RunnableC0802a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (animationAnimation$AnimationListenerC0801b.this.f2892b.m6548n() != null) {
                    animationAnimation$AnimationListenerC0801b.this.f2892b.m6558h1(null);
                    animationAnimation$AnimationListenerC0801b animationanimation_animationlistenerc0801b = animationAnimation$AnimationListenerC0801b.this;
                    animationanimation_animationlistenerc0801b.f2893c.mo6198a(animationanimation_animationlistenerc0801b.f2892b, animationanimation_animationlistenerc0801b.f2894d);
                }
            }
        }

        animationAnimation$AnimationListenerC0801b(ViewGroup viewGroup, Fragment fragment, C0837u.InterfaceC0844g interfaceC0844g, C0144b c0144b) {
            this.f2891a = viewGroup;
            this.f2892b = fragment;
            this.f2893c = interfaceC0844g;
            this.f2894d = c0144b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2891a.post(new RunnableC0802a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$c */
    /* loaded from: classes.dex */
    public static class C0803c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2896a;

        /* renamed from: b */
        final /* synthetic */ View f2897b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2898c;

        /* renamed from: d */
        final /* synthetic */ C0837u.InterfaceC0844g f2899d;

        /* renamed from: e */
        final /* synthetic */ C0144b f2900e;

        C0803c(ViewGroup viewGroup, View view, Fragment fragment, C0837u.InterfaceC0844g interfaceC0844g, C0144b c0144b) {
            this.f2896a = viewGroup;
            this.f2897b = view;
            this.f2898c = fragment;
            this.f2899d = interfaceC0844g;
            this.f2900e = c0144b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2896a.endViewTransition(this.f2897b);
            Animator m6546o = this.f2898c.m6546o();
            this.f2898c.m6557i1(null);
            if (m6546o == null || this.f2896a.indexOfChild(this.f2897b) >= 0) {
                return;
            }
            this.f2899d.mo6198a(this.f2898c, this.f2900e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.e$d */
    /* loaded from: classes.dex */
    public static class C0804d {

        /* renamed from: a */
        public final Animation f2901a;

        /* renamed from: b */
        public final Animator f2902b;

        C0804d(Animator animator) {
            this.f2901a = null;
            this.f2902b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0804d(Animation animation) {
            this.f2901a = animation;
            this.f2902b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.e$e */
    /* loaded from: classes.dex */
    public static class RunnableC0805e extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f2903f;

        /* renamed from: g */
        private final View f2904g;

        /* renamed from: h */
        private boolean f2905h;

        /* renamed from: i */
        private boolean f2906i;

        /* renamed from: j */
        private boolean f2907j;

        RunnableC0805e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2907j = true;
            this.f2903f = viewGroup;
            this.f2904g = view;
            addAnimation(animation);
            this.f2903f.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f2907j = true;
            if (this.f2905h) {
                return !this.f2906i;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2905h = true;
                ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(this.f2903f, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f2907j = true;
            if (this.f2905h) {
                return !this.f2906i;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2905h = true;
                ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(this.f2903f, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2905h || !this.f2907j) {
                this.f2903f.endViewTransition(this.f2904g);
                this.f2906i = true;
                return;
            }
            this.f2907j = false;
            this.f2903f.post(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6482a(Fragment fragment, C0804d c0804d, C0837u.InterfaceC0844g interfaceC0844g) {
        View view = fragment.f2789L;
        ViewGroup viewGroup = fragment.f2788K;
        viewGroup.startViewTransition(view);
        C0144b c0144b = new C0144b();
        c0144b.m8967c(new C0800a(fragment));
        interfaceC0844g.mo6197b(fragment, c0144b);
        if (c0804d.f2901a != null) {
            RunnableC0805e runnableC0805e = new RunnableC0805e(c0804d.f2901a, viewGroup, view);
            fragment.m6558h1(fragment.f2789L);
            runnableC0805e.setAnimationListener(new animationAnimation$AnimationListenerC0801b(viewGroup, fragment, interfaceC0844g, c0144b));
            fragment.f2789L.startAnimation(runnableC0805e);
            return;
        }
        Animator animator = c0804d.f2902b;
        fragment.m6557i1(animator);
        animator.addListener(new C0803c(viewGroup, view, fragment, interfaceC0844g, c0144b));
        animator.setTarget(fragment.f2789L);
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0804d m6481b(Context context, AbstractC0806f abstractC0806f, Fragment fragment, boolean z) {
        int m6480c;
        int m6619A = fragment.m6619A();
        int m6524z = fragment.m6524z();
        boolean z2 = false;
        fragment.m6551l1(0);
        View mo6448c = abstractC0806f.mo6448c(fragment.f2779B);
        if (mo6448c != null && mo6448c.getTag(C0296b.visible_removing_fragment_view_tag) != null) {
            mo6448c.setTag(C0296b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup = fragment.f2788K;
        if (viewGroup == null || viewGroup.getLayoutTransition() == null) {
            Animation m6565f0 = fragment.m6565f0(m6619A, z, m6524z);
            if (m6565f0 != null) {
                return new C0804d(m6565f0);
            }
            Animator m6562g0 = fragment.m6562g0(m6619A, z, m6524z);
            if (m6562g0 != null) {
                return new C0804d(m6562g0);
            }
            if (m6524z != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(m6524z));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, m6524z);
                        if (loadAnimation != null) {
                            return new C0804d(loadAnimation);
                        }
                        z2 = true;
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z2) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, m6524z);
                        if (loadAnimator != null) {
                            return new C0804d(loadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m6524z);
                        if (loadAnimation2 != null) {
                            return new C0804d(loadAnimation2);
                        }
                    }
                }
            }
            if (m6619A != 0 && (m6480c = m6480c(m6619A, z)) >= 0) {
                return new C0804d(AnimationUtils.loadAnimation(context, m6480c));
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    private static int m6480c(int i, boolean z) {
        if (i == 4097) {
            return z ? C0295a.fragment_open_enter : C0295a.fragment_open_exit;
        } else if (i == 4099) {
            return z ? C0295a.fragment_fade_enter : C0295a.fragment_fade_exit;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? C0295a.fragment_close_enter : C0295a.fragment_close_exit;
        }
    }
}
