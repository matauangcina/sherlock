package p000a.p012c.p013a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* renamed from: a.c.a.g */
/* loaded from: classes.dex */
class C0063g extends Drawable {

    /* renamed from: a */
    private float f172a;

    /* renamed from: b */
    private final Paint f173b;

    /* renamed from: c */
    private final RectF f174c;

    /* renamed from: d */
    private final Rect f175d;

    /* renamed from: e */
    private float f176e;

    /* renamed from: f */
    private boolean f177f;

    /* renamed from: g */
    private boolean f178g;

    /* renamed from: h */
    private ColorStateList f179h;

    /* renamed from: i */
    private PorterDuffColorFilter f180i;

    /* renamed from: j */
    private ColorStateList f181j;

    /* renamed from: k */
    private PorterDuff.Mode f182k;

    /* renamed from: a */
    private PorterDuffColorFilter m9429a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m9425e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f179h = colorStateList;
        this.f173b.setColor(colorStateList.getColorForState(getState(), this.f179h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m9421i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f174c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f175d.set(rect);
        if (this.f177f) {
            float m9417d = C0064h.m9417d(this.f176e, this.f172a, this.f178g);
            this.f175d.inset((int) Math.ceil(C0064h.m9418c(this.f176e, this.f172a, this.f178g)), (int) Math.ceil(m9417d));
            this.f174c.set(this.f175d);
        }
    }

    /* renamed from: b */
    public ColorStateList m9428b() {
        return this.f179h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m9427c() {
        return this.f176e;
    }

    /* renamed from: d */
    public float m9426d() {
        return this.f172a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f173b;
        if (this.f180i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f180i);
            z = true;
        }
        RectF rectF = this.f174c;
        float f = this.f172a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m9424f(ColorStateList colorStateList) {
        m9425e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m9423g(float f, boolean z, boolean z2) {
        if (f == this.f176e && this.f177f == z && this.f178g == z2) {
            return;
        }
        this.f176e = f;
        this.f177f = z;
        this.f178g = z2;
        m9421i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f175d, this.f172a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m9422h(float f) {
        if (f == this.f172a) {
            return;
        }
        this.f172a = f;
        m9421i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f181j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f179h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m9421i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f179h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f173b.getColor();
        if (z) {
            this.f173b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f181j;
        if (colorStateList2 == null || (mode = this.f182k) == null) {
            return z;
        }
        this.f180i = m9429a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f173b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f173b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f181j = colorStateList;
        this.f180i = m9429a(colorStateList, this.f182k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f182k = mode;
        this.f180i = m9429a(this.f181j, mode);
        invalidateSelf();
    }
}
