package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p000a.p019g.p020d.C0122a;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.C1326l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes.dex */
public class C1817a extends Drawable {

    /* renamed from: b */
    private final Paint f5335b;

    /* renamed from: h */
    float f5341h;

    /* renamed from: i */
    private int f5342i;

    /* renamed from: j */
    private int f5343j;

    /* renamed from: k */
    private int f5344k;

    /* renamed from: l */
    private int f5345l;

    /* renamed from: m */
    private int f5346m;

    /* renamed from: o */
    private C1322k f5348o;

    /* renamed from: p */
    private ColorStateList f5349p;

    /* renamed from: a */
    private final C1326l f5334a = new C1326l();

    /* renamed from: c */
    private final Path f5336c = new Path();

    /* renamed from: d */
    private final Rect f5337d = new Rect();

    /* renamed from: e */
    private final RectF f5338e = new RectF();

    /* renamed from: f */
    private final RectF f5339f = new RectF();

    /* renamed from: g */
    private final C1819b f5340g = new C1819b();

    /* renamed from: n */
    private boolean f5347n = true;

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: classes.dex */
    private class C1819b extends Drawable.ConstantState {
        private C1819b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C1817a.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1817a(C1322k c1322k) {
        this.f5348o = c1322k;
        Paint paint = new Paint(1);
        this.f5335b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private Shader m2892a() {
        Rect rect = this.f5337d;
        copyBounds(rect);
        float height = this.f5341h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C0122a.m9050b(this.f5342i, this.f5346m), C0122a.m9050b(this.f5343j, this.f5346m), C0122a.m9050b(C0122a.m9048d(this.f5343j, 0), this.f5346m), C0122a.m9050b(C0122a.m9048d(this.f5345l, 0), this.f5346m), C0122a.m9050b(this.f5345l, this.f5346m), C0122a.m9050b(this.f5344k, this.f5346m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    protected RectF m2891b() {
        this.f5339f.set(getBounds());
        return this.f5339f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2890c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f5346m = colorStateList.getColorForState(getState(), this.f5346m);
        }
        this.f5349p = colorStateList;
        this.f5347n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m2889d(float f) {
        if (this.f5341h != f) {
            this.f5341h = f;
            this.f5335b.setStrokeWidth(f * 1.3333f);
            this.f5347n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5347n) {
            this.f5335b.setShader(m2892a());
            this.f5347n = false;
        }
        float strokeWidth = this.f5335b.getStrokeWidth() / 2.0f;
        copyBounds(this.f5337d);
        this.f5338e.set(this.f5337d);
        float min = Math.min(this.f5348o.m4481r().mo4500a(m2891b()), this.f5338e.width() / 2.0f);
        if (this.f5348o.m4478u(m2891b())) {
            this.f5338e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f5338e, min, min, this.f5335b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2888e(int i, int i2, int i3, int i4) {
        this.f5342i = i;
        this.f5343j = i2;
        this.f5344k = i3;
        this.f5345l = i4;
    }

    /* renamed from: f */
    public void m2887f(C1322k c1322k) {
        this.f5348o = c1322k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5340g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5341h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5348o.m4478u(m2891b())) {
            outline.setRoundRect(getBounds(), this.f5348o.m4481r().mo4500a(m2891b()));
            return;
        }
        copyBounds(this.f5337d);
        this.f5338e.set(this.f5337d);
        this.f5334a.m4439d(this.f5348o, 1.0f, this.f5338e, this.f5336c);
        if (this.f5336c.isConvex()) {
            outline.setConvexPath(this.f5336c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f5348o.m4478u(m2891b())) {
            int round = Math.round(this.f5341h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f5349p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f5347n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f5349p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f5346m)) != this.f5346m) {
            this.f5347n = true;
            this.f5346m = colorForState;
        }
        if (this.f5347n) {
            invalidateSelf();
        }
        return this.f5347n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5335b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5335b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
