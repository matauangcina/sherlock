package p000a.p019g.p028k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* renamed from: a.g.k.w */
/* loaded from: classes.dex */
public final class C0267w {

    /* renamed from: a */
    private WeakReference<View> f747a;

    /* renamed from: b */
    Runnable f748b = null;

    /* renamed from: c */
    Runnable f749c = null;

    /* renamed from: d */
    int f750d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.k.w$a */
    /* loaded from: classes.dex */
    public class C0268a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0271x f751a;

        /* renamed from: b */
        final /* synthetic */ View f752b;

        C0268a(C0267w c0267w, InterfaceC0271x interfaceC0271x, View view) {
            this.f751a = interfaceC0271x;
            this.f752b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f751a.mo7172a(this.f752b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f751a.mo7171b(this.f752b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f751a.mo7170c(this.f752b);
        }
    }

    /* renamed from: a.g.k.w$b */
    /* loaded from: classes.dex */
    class C0269b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0273z f753a;

        /* renamed from: b */
        final /* synthetic */ View f754b;

        C0269b(C0267w c0267w, InterfaceC0273z interfaceC0273z, View view) {
            this.f753a = interfaceC0273z;
            this.f754b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f753a.mo7909a(this.f754b);
        }
    }

    /* renamed from: a.g.k.w$c */
    /* loaded from: classes.dex */
    static class C0270c implements InterfaceC0271x {

        /* renamed from: a */
        C0267w f755a;

        /* renamed from: b */
        boolean f756b;

        C0270c(C0267w c0267w) {
            this.f755a = c0267w;
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: a */
        public void mo7172a(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC0271x interfaceC0271x = tag instanceof InterfaceC0271x ? (InterfaceC0271x) tag : null;
            if (interfaceC0271x != null) {
                interfaceC0271x.mo7172a(view);
            }
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: b */
        public void mo7171b(View view) {
            int i = this.f755a.f750d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f755a.f750d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f756b) {
                C0267w c0267w = this.f755a;
                Runnable runnable = c0267w.f749c;
                if (runnable != null) {
                    c0267w.f749c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC0271x interfaceC0271x = tag instanceof InterfaceC0271x ? (InterfaceC0271x) tag : null;
                if (interfaceC0271x != null) {
                    interfaceC0271x.mo7171b(view);
                }
                this.f756b = true;
            }
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: c */
        public void mo7170c(View view) {
            this.f756b = false;
            if (this.f755a.f750d > -1) {
                view.setLayerType(2, null);
            }
            C0267w c0267w = this.f755a;
            Runnable runnable = c0267w.f748b;
            if (runnable != null) {
                c0267w.f748b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC0271x interfaceC0271x = tag instanceof InterfaceC0271x ? (InterfaceC0271x) tag : null;
            if (interfaceC0271x != null) {
                interfaceC0271x.mo7170c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0267w(View view) {
        this.f747a = new WeakReference<>(view);
    }

    /* renamed from: g */
    private void m8532g(View view, InterfaceC0271x interfaceC0271x) {
        if (interfaceC0271x != null) {
            view.animate().setListener(new C0268a(this, interfaceC0271x, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0267w m8538a(float f) {
        View view = this.f747a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void m8537b() {
        View view = this.f747a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long m8536c() {
        View view = this.f747a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: d */
    public C0267w m8535d(long j) {
        View view = this.f747a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: e */
    public C0267w m8534e(Interpolator interpolator) {
        View view = this.f747a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C0267w m8533f(InterfaceC0271x interfaceC0271x) {
        View view = this.f747a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, interfaceC0271x);
                interfaceC0271x = new C0270c(this);
            }
            m8532g(view, interfaceC0271x);
        }
        return this;
    }

    /* renamed from: h */
    public C0267w m8531h(long j) {
        View view = this.f747a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: i */
    public C0267w m8530i(InterfaceC0273z interfaceC0273z) {
        View view = this.f747a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC0273z != null ? new C0269b(this, interfaceC0273z, view) : null);
        }
        return this;
    }

    /* renamed from: j */
    public void m8529j() {
        View view = this.f747a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C0267w m8528k(float f) {
        View view = this.f747a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
