package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
/* renamed from: io.flutter.embedding.android.c */
/* loaded from: classes.dex */
public final class C2789c implements InterfaceC2816n {

    /* renamed from: a */
    private final Drawable f6916a;

    /* renamed from: b */
    private final ImageView.ScaleType f6917b;

    /* renamed from: c */
    private final long f6918c;

    /* renamed from: d */
    private C2791b f6919d;

    /* renamed from: io.flutter.embedding.android.c$a */
    /* loaded from: classes.dex */
    class C2790a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f6920a;

        C2790a(C2789c c2789c, Runnable runnable) {
            this.f6920a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6920a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6920a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.c$b */
    /* loaded from: classes.dex */
    public static class C2791b extends ImageView {
        public C2791b(Context context) {
            this(context, null, 0);
        }

        public C2791b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        /* renamed from: a */
        public void m728a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            m728a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public C2789c(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500L);
    }

    public C2789c(Drawable drawable, ImageView.ScaleType scaleType, long j) {
        this.f6916a = drawable;
        this.f6917b = scaleType;
        this.f6918c = j;
    }

    @Override // io.flutter.embedding.android.InterfaceC2816n
    /* renamed from: a */
    public void mo616a(Runnable runnable) {
        C2791b c2791b = this.f6919d;
        if (c2791b == null) {
            runnable.run();
        } else {
            c2791b.animate().alpha(0.0f).setDuration(this.f6918c).setListener(new C2790a(this, runnable));
        }
    }

    @Override // io.flutter.embedding.android.InterfaceC2816n
    /* renamed from: b */
    public /* synthetic */ boolean mo615b() {
        return C2815m.m618a(this);
    }

    @Override // io.flutter.embedding.android.InterfaceC2816n
    /* renamed from: c */
    public View mo614c(Context context, Bundle bundle) {
        C2791b c2791b = new C2791b(context);
        this.f6919d = c2791b;
        c2791b.m728a(this.f6916a, this.f6917b);
        return this.f6919d;
    }

    @Override // io.flutter.embedding.android.InterfaceC2816n
    /* renamed from: d */
    public /* synthetic */ Bundle mo613d() {
        return C2815m.m617b(this);
    }
}
