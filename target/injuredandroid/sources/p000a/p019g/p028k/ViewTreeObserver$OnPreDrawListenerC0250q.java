package p000a.p019g.p028k;

import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: a.g.k.q */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0250q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f722f;

    /* renamed from: g */
    private ViewTreeObserver f723g;

    /* renamed from: h */
    private final Runnable f724h;

    private ViewTreeObserver$OnPreDrawListenerC0250q(View view, Runnable runnable) {
        this.f722f = view;
        this.f723g = view.getViewTreeObserver();
        this.f724h = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserver$OnPreDrawListenerC0250q m8664a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserver$OnPreDrawListenerC0250q viewTreeObserver$OnPreDrawListenerC0250q = new ViewTreeObserver$OnPreDrawListenerC0250q(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0250q);
                view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC0250q);
                return viewTreeObserver$OnPreDrawListenerC0250q;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void m8663b() {
        (this.f723g.isAlive() ? this.f723g : this.f722f.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f722f.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m8663b();
        this.f724h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f723g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m8663b();
    }
}
