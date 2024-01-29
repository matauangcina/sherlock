package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0759a;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
class C0651v extends C0643r {

    /* renamed from: d */
    private final SeekBar f2198d;

    /* renamed from: e */
    private Drawable f2199e;

    /* renamed from: f */
    private ColorStateList f2200f;

    /* renamed from: g */
    private PorterDuff.Mode f2201g;

    /* renamed from: h */
    private boolean f2202h;

    /* renamed from: i */
    private boolean f2203i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0651v(SeekBar seekBar) {
        super(seekBar);
        this.f2200f = null;
        this.f2201g = null;
        this.f2202h = false;
        this.f2203i = false;
        this.f2198d = seekBar;
    }

    /* renamed from: f */
    private void m7260f() {
        if (this.f2199e != null) {
            if (this.f2202h || this.f2203i) {
                Drawable m6744r = C0759a.m6744r(this.f2199e.mutate());
                this.f2199e = m6744r;
                if (this.f2202h) {
                    C0759a.m6747o(m6744r, this.f2200f);
                }
                if (this.f2203i) {
                    C0759a.m6746p(this.f2199e, this.f2201g);
                }
                if (this.f2199e.isStateful()) {
                    this.f2199e.setState(this.f2198d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0643r
    /* renamed from: c */
    public void mo7261c(AttributeSet attributeSet, int i) {
        super.mo7261c(attributeSet, i);
        C0665w0 m7213u = C0665w0.m7213u(this.f2198d.getContext(), attributeSet, C0009j.AppCompatSeekBar, i, 0);
        Drawable m7226h = m7213u.m7226h(C0009j.AppCompatSeekBar_android_thumb);
        if (m7226h != null) {
            this.f2198d.setThumb(m7226h);
        }
        m7256j(m7213u.m7227g(C0009j.AppCompatSeekBar_tickMark));
        if (m7213u.m7216r(C0009j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f2201g = C0593e0.m7465d(m7213u.m7223k(C0009j.AppCompatSeekBar_tickMarkTintMode, -1), this.f2201g);
            this.f2203i = true;
        }
        if (m7213u.m7216r(C0009j.AppCompatSeekBar_tickMarkTint)) {
            this.f2200f = m7213u.m7231c(C0009j.AppCompatSeekBar_tickMarkTint);
            this.f2202h = true;
        }
        m7213u.m7212v();
        m7260f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m7259g(Canvas canvas) {
        if (this.f2199e != null) {
            int max = this.f2198d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2199e.getIntrinsicWidth();
                int intrinsicHeight = this.f2199e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2199e.setBounds(-i, -i2, i, i2);
                float width = ((this.f2198d.getWidth() - this.f2198d.getPaddingLeft()) - this.f2198d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f2198d.getPaddingLeft(), this.f2198d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2199e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m7258h() {
        Drawable drawable = this.f2199e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f2198d.getDrawableState())) {
            this.f2198d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m7257i() {
        Drawable drawable = this.f2199e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m7256j(Drawable drawable) {
        Drawable drawable2 = this.f2199e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2199e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f2198d);
            C0759a.m6749m(drawable, C0252s.m8592w(this.f2198d));
            if (drawable.isStateful()) {
                drawable.setState(this.f2198d.getDrawableState());
            }
            m7260f();
        }
        this.f2198d.invalidate();
    }
}
