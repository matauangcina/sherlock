package p000a.p012c.p013a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* renamed from: a.c.a.h */
/* loaded from: classes.dex */
class C0064h extends Drawable {

    /* renamed from: q */
    private static final double f183q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static InterfaceC0065a f184r;

    /* renamed from: a */
    private final int f185a;

    /* renamed from: b */
    private Paint f186b;

    /* renamed from: c */
    private Paint f187c;

    /* renamed from: d */
    private Paint f188d;

    /* renamed from: e */
    private final RectF f189e;

    /* renamed from: f */
    private float f190f;

    /* renamed from: g */
    private Path f191g;

    /* renamed from: h */
    private float f192h;

    /* renamed from: i */
    private float f193i;

    /* renamed from: j */
    private float f194j;

    /* renamed from: k */
    private ColorStateList f195k;

    /* renamed from: l */
    private boolean f196l;

    /* renamed from: m */
    private final int f197m;

    /* renamed from: n */
    private final int f198n;

    /* renamed from: o */
    private boolean f199o;

    /* renamed from: p */
    private boolean f200p;

    /* renamed from: a.c.a.h$a */
    /* loaded from: classes.dex */
    interface InterfaceC0065a {
        /* renamed from: a */
        void mo9400a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* renamed from: a */
    private void m9420a(Rect rect) {
        float f = this.f192h;
        float f2 = 1.5f * f;
        this.f189e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        m9419b();
    }

    /* renamed from: b */
    private void m9419b() {
        float f = this.f190f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f193i;
        rectF2.inset(-f2, -f2);
        Path path = this.f191g;
        if (path == null) {
            this.f191g = new Path();
        } else {
            path.reset();
        }
        this.f191g.setFillType(Path.FillType.EVEN_ODD);
        this.f191g.moveTo(-this.f190f, 0.0f);
        this.f191g.rLineTo(-this.f193i, 0.0f);
        this.f191g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f191g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f191g.close();
        float f3 = this.f190f;
        float f4 = f3 / (this.f193i + f3);
        Paint paint = this.f187c;
        float f5 = this.f190f + this.f193i;
        int i = this.f197m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f198n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f188d;
        float f6 = this.f190f;
        float f7 = this.f193i;
        int i2 = this.f197m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f198n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f188d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m9418c(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f183q) * f2)) : f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m9417d(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        return z ? (float) (f3 + ((1.0d - f183q) * f2)) : f3;
    }

    /* renamed from: e */
    private void m9416e(Canvas canvas) {
        float f = this.f190f;
        float f2 = (-f) - this.f193i;
        float f3 = f + this.f185a + (this.f194j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f189e.width() - f4 > 0.0f;
        boolean z2 = this.f189e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f189e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f191g, this.f187c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f189e.width() - f4, -this.f190f, this.f188d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f189e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f191g, this.f187c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f189e.width() - f4, (-this.f190f) + this.f193i, this.f188d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f189e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f191g, this.f187c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f189e.height() - f4, -this.f190f, this.f188d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f189e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f191g, this.f187c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f189e.height() - f4, -this.f190f, this.f188d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m9407n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f195k = colorStateList;
        this.f186b.setColor(colorStateList.getColorForState(getState(), this.f195k.getDefaultColor()));
    }

    /* renamed from: s */
    private void m9402s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        } else {
            float m9401t = m9401t(f);
            float m9401t2 = m9401t(f2);
            if (m9401t > m9401t2) {
                if (!this.f200p) {
                    this.f200p = true;
                }
                m9401t = m9401t2;
            }
            if (this.f194j == m9401t && this.f192h == m9401t2) {
                return;
            }
            this.f194j = m9401t;
            this.f192h = m9401t2;
            this.f193i = (int) ((m9401t * 1.5f) + this.f185a + 0.5f);
            this.f196l = true;
            invalidateSelf();
        }
    }

    /* renamed from: t */
    private int m9401t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f196l) {
            m9420a(getBounds());
            this.f196l = false;
        }
        canvas.translate(0.0f, this.f194j / 2.0f);
        m9416e(canvas);
        canvas.translate(0.0f, (-this.f194j) / 2.0f);
        f184r.mo9400a(canvas, this.f189e, this.f190f, this.f186b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList m9415f() {
        return this.f195k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m9414g() {
        return this.f190f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m9417d(this.f192h, this.f190f, this.f199o));
        int ceil2 = (int) Math.ceil(m9418c(this.f192h, this.f190f, this.f199o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m9413h(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m9412i() {
        return this.f192h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f195k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m9411j() {
        float f = this.f192h;
        return (Math.max(f, this.f190f + this.f185a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f192h * 1.5f) + this.f185a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m9410k() {
        float f = this.f192h;
        return (Math.max(f, this.f190f + this.f185a + (f / 2.0f)) * 2.0f) + ((this.f192h + this.f185a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m9409l() {
        return this.f194j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m9408m(boolean z) {
        this.f199o = z;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m9406o(ColorStateList colorStateList) {
        m9407n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f196l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f195k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f186b.getColor() == colorForState) {
            return false;
        }
        this.f186b.setColor(colorForState);
        this.f196l = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m9405p(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f190f == f2) {
            return;
        }
        this.f190f = f2;
        this.f196l = true;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m9404q(float f) {
        m9402s(this.f194j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m9403r(float f) {
        m9402s(f, this.f192h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f186b.setAlpha(i);
        this.f187c.setAlpha(i);
        this.f188d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f186b.setColorFilter(colorFilter);
    }
}
