package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0759a;
import androidx.core.graphics.drawable.InterfaceC0760b;
import com.google.android.material.internal.C1848f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p020d.C0122a;
import p000a.p019g.p026i.C0170a;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p078l.C1357h;
import p054b.p059c.p060a.p075b.p079m.C1361a;
import p054b.p059c.p060a.p075b.p086s.C1379a;
import p054b.p059c.p060a.p075b.p091x.C1389d;
import p054b.p059c.p060a.p075b.p092y.C1397b;
/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes.dex */
public class C1760a extends C1315g implements InterfaceC0760b, Drawable.Callback, C1848f.InterfaceC1850b {

    /* renamed from: K0 */
    private static final int[] f5114K0 = {16842910};

    /* renamed from: L0 */
    private static final ShapeDrawable f5115L0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private ColorStateList f5116A0;

    /* renamed from: B */
    private ColorStateList f5117B;

    /* renamed from: B0 */
    private PorterDuff.Mode f5118B0;

    /* renamed from: C */
    private ColorStateList f5119C;

    /* renamed from: C0 */
    private int[] f5120C0;

    /* renamed from: D */
    private float f5121D;

    /* renamed from: D0 */
    private boolean f5122D0;

    /* renamed from: E */
    private float f5123E;

    /* renamed from: E0 */
    private ColorStateList f5124E0;

    /* renamed from: F */
    private ColorStateList f5125F;

    /* renamed from: F0 */
    private WeakReference<InterfaceC1761a> f5126F0;

    /* renamed from: G */
    private float f5127G;

    /* renamed from: G0 */
    private TextUtils.TruncateAt f5128G0;

    /* renamed from: H */
    private ColorStateList f5129H;

    /* renamed from: H0 */
    private boolean f5130H0;

    /* renamed from: I */
    private CharSequence f5131I;

    /* renamed from: I0 */
    private int f5132I0;

    /* renamed from: J */
    private boolean f5133J;

    /* renamed from: J0 */
    private boolean f5134J0;

    /* renamed from: K */
    private Drawable f5135K;

    /* renamed from: L */
    private ColorStateList f5136L;

    /* renamed from: M */
    private float f5137M;

    /* renamed from: N */
    private boolean f5138N;

    /* renamed from: O */
    private boolean f5139O;

    /* renamed from: P */
    private Drawable f5140P;

    /* renamed from: Q */
    private Drawable f5141Q;

    /* renamed from: R */
    private ColorStateList f5142R;

    /* renamed from: S */
    private float f5143S;

    /* renamed from: T */
    private CharSequence f5144T;

    /* renamed from: U */
    private boolean f5145U;

    /* renamed from: V */
    private boolean f5146V;

    /* renamed from: W */
    private Drawable f5147W;

    /* renamed from: X */
    private C1357h f5148X;

    /* renamed from: Y */
    private C1357h f5149Y;

    /* renamed from: Z */
    private float f5150Z;

    /* renamed from: a0 */
    private float f5151a0;

    /* renamed from: b0 */
    private float f5152b0;

    /* renamed from: c0 */
    private float f5153c0;

    /* renamed from: d0 */
    private float f5154d0;

    /* renamed from: e0 */
    private float f5155e0;

    /* renamed from: f0 */
    private float f5156f0;

    /* renamed from: g0 */
    private float f5157g0;

    /* renamed from: h0 */
    private final Context f5158h0;

    /* renamed from: i0 */
    private final Paint f5159i0;

    /* renamed from: j0 */
    private final Paint f5160j0;

    /* renamed from: k0 */
    private final Paint.FontMetrics f5161k0;

    /* renamed from: l0 */
    private final RectF f5162l0;

    /* renamed from: m0 */
    private final PointF f5163m0;

    /* renamed from: n0 */
    private final Path f5164n0;

    /* renamed from: o0 */
    private final C1848f f5165o0;

    /* renamed from: p0 */
    private int f5166p0;

    /* renamed from: q0 */
    private int f5167q0;

    /* renamed from: r0 */
    private int f5168r0;

    /* renamed from: s0 */
    private int f5169s0;

    /* renamed from: t0 */
    private int f5170t0;

    /* renamed from: u0 */
    private int f5171u0;

    /* renamed from: v0 */
    private boolean f5172v0;

    /* renamed from: w0 */
    private int f5173w0;

    /* renamed from: x0 */
    private int f5174x0;

    /* renamed from: y0 */
    private ColorFilter f5175y0;

    /* renamed from: z0 */
    private PorterDuffColorFilter f5176z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1761a {
        /* renamed from: a */
        void mo3100a();
    }

    private C1760a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5159i0 = new Paint(1);
        this.f5161k0 = new Paint.FontMetrics();
        this.f5162l0 = new RectF();
        this.f5163m0 = new PointF();
        this.f5164n0 = new Path();
        this.f5174x0 = 255;
        this.f5118B0 = PorterDuff.Mode.SRC_IN;
        Paint paint = null;
        this.f5126F0 = new WeakReference<>(null);
        m4552L(context);
        this.f5158h0 = context;
        C1848f c1848f = new C1848f(this);
        this.f5165o0 = c1848f;
        this.f5131I = "";
        c1848f.m2733e().density = context.getResources().getDisplayMetrics().density;
        this.f5160j0 = null;
        if (0 != 0) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(f5114K0);
        m3167c2(f5114K0);
        this.f5130H0 = true;
        if (C1397b.f4315a) {
            f5115L0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m3233A0(Canvas canvas, Rect rect) {
        if (this.f5131I != null) {
            Paint.Align m3133p0 = m3133p0(rect, this.f5163m0);
            m3139n0(rect, this.f5162l0);
            if (this.f5165o0.m2734d() != null) {
                this.f5165o0.m2733e().drawableState = getState();
                this.f5165o0.m2728j(this.f5158h0);
            }
            this.f5165o0.m2733e().setTextAlign(m3133p0);
            int i = 0;
            boolean z = Math.round(this.f5165o0.m2732f(m3172a1().toString())) > Math.round(this.f5162l0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f5162l0);
            }
            CharSequence charSequence = this.f5131I;
            if (z && this.f5128G0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f5165o0.m2733e(), this.f5162l0.width(), this.f5128G0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f5163m0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f5165o0.m2733e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: D2 */
    private boolean m3222D2() {
        return this.f5146V && this.f5147W != null && this.f5172v0;
    }

    /* renamed from: E2 */
    private boolean m3219E2() {
        return this.f5133J && this.f5135K != null;
    }

    /* renamed from: F2 */
    private boolean m3216F2() {
        return this.f5139O && this.f5140P != null;
    }

    /* renamed from: G2 */
    private void m3213G2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: H2 */
    private void m3210H2() {
        this.f5124E0 = this.f5122D0 ? C1397b.m4240a(this.f5129H) : null;
    }

    /* renamed from: I2 */
    private void m3207I2() {
        this.f5141Q = new RippleDrawable(C1397b.m4240a(m3176Y0()), this.f5140P, f5115L0);
    }

    /* renamed from: S1 */
    private void m3187S1(ColorStateList colorStateList) {
        if (this.f5117B != colorStateList) {
            this.f5117B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: e1 */
    private ColorFilter m3164e1() {
        ColorFilter colorFilter = this.f5175y0;
        return colorFilter != null ? colorFilter : this.f5176z0;
    }

    /* renamed from: g0 */
    private void m3160g0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0759a.m6749m(drawable, C0759a.m6756f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5140P) {
            if (drawable.isStateful()) {
                drawable.setState(m3190R0());
            }
            C0759a.m6747o(drawable, this.f5142R);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f5135K;
        if (drawable == drawable2 && this.f5138N) {
            C0759a.m6747o(drawable2, this.f5136L);
        }
    }

    /* renamed from: g1 */
    private static boolean m3159g1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h0 */
    private void m3157h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3219E2() || m3222D2()) {
            float f = this.f5150Z + this.f5151a0;
            if (C0759a.m6756f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.f5137M;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.f5137M;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f5137M;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: j0 */
    private void m3151j0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m3216F2()) {
            float f = this.f5157g0 + this.f5156f0 + this.f5143S + this.f5155e0 + this.f5154d0;
            if (C0759a.m6756f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: k0 */
    private void m3148k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3216F2()) {
            float f = this.f5157g0 + this.f5156f0;
            if (C0759a.m6756f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f5143S;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f5143S;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f5143S;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: k1 */
    private static boolean m3147k1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: l0 */
    private void m3145l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m3216F2()) {
            float f = this.f5157g0 + this.f5156f0 + this.f5143S + this.f5155e0 + this.f5154d0;
            if (C0759a.m6756f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: l1 */
    private static boolean m3144l1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: m1 */
    private static boolean m3141m1(C1389d c1389d) {
        ColorStateList colorStateList;
        return (c1389d == null || (colorStateList = c1389d.f4295b) == null || !colorStateList.isStateful()) ? false : true;
    }

    /* renamed from: n0 */
    private void m3139n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f5131I != null) {
            float m3154i0 = this.f5150Z + m3154i0() + this.f5153c0;
            float m3142m0 = this.f5157g0 + m3142m0() + this.f5154d0;
            if (C0759a.m6756f(this) == 0) {
                rectF.left = rect.left + m3154i0;
                rectF.right = rect.right - m3142m0;
            } else {
                rectF.left = rect.left + m3142m0;
                rectF.right = rect.right - m3154i0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* renamed from: n1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m3138n1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C1760a.m3138n1(android.util.AttributeSet, int, int):void");
    }

    /* renamed from: o0 */
    private float m3136o0() {
        this.f5165o0.m2733e().getFontMetrics(this.f5161k0);
        Paint.FontMetrics fontMetrics = this.f5161k0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014a  */
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m3132p1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C1760a.m3132p1(int[], int[]):boolean");
    }

    /* renamed from: q0 */
    private boolean m3130q0() {
        return this.f5146V && this.f5147W != null && this.f5145U;
    }

    /* renamed from: r0 */
    public static C1760a m3127r0(Context context, AttributeSet attributeSet, int i, int i2) {
        C1760a c1760a = new C1760a(context, attributeSet, i, i2);
        c1760a.m3138n1(attributeSet, i, i2);
        return c1760a;
    }

    /* renamed from: s0 */
    private void m3124s0(Canvas canvas, Rect rect) {
        if (m3222D2()) {
            m3157h0(rect, this.f5162l0);
            RectF rectF = this.f5162l0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f5147W.setBounds(0, 0, (int) this.f5162l0.width(), (int) this.f5162l0.height());
            this.f5147W.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: t0 */
    private void m3121t0(Canvas canvas, Rect rect) {
        if (this.f5134J0) {
            return;
        }
        this.f5159i0.setColor(this.f5167q0);
        this.f5159i0.setStyle(Paint.Style.FILL);
        this.f5159i0.setColorFilter(m3164e1());
        this.f5162l0.set(rect);
        canvas.drawRoundRect(this.f5162l0, m3224D0(), m3224D0(), this.f5159i0);
    }

    /* renamed from: u0 */
    private void m3118u0(Canvas canvas, Rect rect) {
        if (m3219E2()) {
            m3157h0(rect, this.f5162l0);
            RectF rectF = this.f5162l0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f5135K.setBounds(0, 0, (int) this.f5162l0.width(), (int) this.f5162l0.height());
            this.f5135K.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: v0 */
    private void m3115v0(Canvas canvas, Rect rect) {
        if (this.f5127G <= 0.0f || this.f5134J0) {
            return;
        }
        this.f5159i0.setColor(this.f5169s0);
        this.f5159i0.setStyle(Paint.Style.STROKE);
        if (!this.f5134J0) {
            this.f5159i0.setColorFilter(m3164e1());
        }
        RectF rectF = this.f5162l0;
        float f = this.f5127G;
        rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.f5123E - (this.f5127G / 2.0f);
        canvas.drawRoundRect(this.f5162l0, f2, f2, this.f5159i0);
    }

    /* renamed from: w0 */
    private void m3112w0(Canvas canvas, Rect rect) {
        if (this.f5134J0) {
            return;
        }
        this.f5159i0.setColor(this.f5166p0);
        this.f5159i0.setStyle(Paint.Style.FILL);
        this.f5162l0.set(rect);
        canvas.drawRoundRect(this.f5162l0, m3224D0(), m3224D0(), this.f5159i0);
    }

    /* renamed from: x0 */
    private void m3109x0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (m3216F2()) {
            m3148k0(rect, this.f5162l0);
            RectF rectF = this.f5162l0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f5140P.setBounds(0, 0, (int) this.f5162l0.width(), (int) this.f5162l0.height());
            if (C1397b.f4315a) {
                this.f5141Q.setBounds(this.f5140P.getBounds());
                this.f5141Q.jumpToCurrentState();
                drawable = this.f5141Q;
            } else {
                drawable = this.f5140P;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: y0 */
    private void m3106y0(Canvas canvas, Rect rect) {
        this.f5159i0.setColor(this.f5170t0);
        this.f5159i0.setStyle(Paint.Style.FILL);
        this.f5162l0.set(rect);
        if (!this.f5134J0) {
            canvas.drawRoundRect(this.f5162l0, m3224D0(), m3224D0(), this.f5159i0);
            return;
        }
        m4526g(new RectF(rect), this.f5164n0);
        super.m4518o(canvas, this.f5159i0, this.f5164n0, m4513t());
    }

    /* renamed from: z0 */
    private void m3103z0(Canvas canvas, Rect rect) {
        Paint paint = this.f5160j0;
        if (paint != null) {
            paint.setColor(C0122a.m9048d(-16777216, 127));
            canvas.drawRect(rect, this.f5160j0);
            if (m3219E2() || m3222D2()) {
                m3157h0(rect, this.f5162l0);
                canvas.drawRect(this.f5162l0, this.f5160j0);
            }
            if (this.f5131I != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f5160j0);
            }
            if (m3216F2()) {
                m3148k0(rect, this.f5162l0);
                canvas.drawRect(this.f5162l0, this.f5160j0);
            }
            this.f5160j0.setColor(C0122a.m9048d(-65536, 127));
            m3151j0(rect, this.f5162l0);
            canvas.drawRect(this.f5162l0, this.f5160j0);
            this.f5160j0.setColor(C0122a.m9048d(-16711936, 127));
            m3145l0(rect, this.f5162l0);
            canvas.drawRect(this.f5162l0, this.f5160j0);
        }
    }

    /* renamed from: A1 */
    public void m3232A1(float f) {
        if (this.f5157g0 != f) {
            this.f5157g0 = f;
            invalidateSelf();
            m3135o1();
        }
    }

    /* renamed from: A2 */
    public void m3231A2(int i) {
        m3101z2(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: B0 */
    public Drawable m3230B0() {
        return this.f5147W;
    }

    /* renamed from: B1 */
    public void m3229B1(int i) {
        m3232A1(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: B2 */
    public void m3228B2(boolean z) {
        if (this.f5122D0 != z) {
            this.f5122D0 = z;
            m3210H2();
            onStateChange(getState());
        }
    }

    /* renamed from: C0 */
    public ColorStateList m3227C0() {
        return this.f5119C;
    }

    /* renamed from: C1 */
    public void m3226C1(Drawable drawable) {
        Drawable m3218F0 = m3218F0();
        if (m3218F0 != drawable) {
            float m3154i0 = m3154i0();
            this.f5135K = drawable != null ? C0759a.m6744r(drawable).mutate() : null;
            float m3154i02 = m3154i0();
            m3213G2(m3218F0);
            if (m3219E2()) {
                m3160g0(this.f5135K);
            }
            invalidateSelf();
            if (m3154i0 != m3154i02) {
                m3135o1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C2 */
    public boolean m3225C2() {
        return this.f5130H0;
    }

    /* renamed from: D0 */
    public float m3224D0() {
        return this.f5134J0 ? m4559E() : this.f5123E;
    }

    /* renamed from: D1 */
    public void m3223D1(int i) {
        m3226C1(C0010a.m9577d(this.f5158h0, i));
    }

    /* renamed from: E0 */
    public float m3221E0() {
        return this.f5157g0;
    }

    /* renamed from: E1 */
    public void m3220E1(float f) {
        if (this.f5137M != f) {
            float m3154i0 = m3154i0();
            this.f5137M = f;
            float m3154i02 = m3154i0();
            invalidateSelf();
            if (m3154i0 != m3154i02) {
                m3135o1();
            }
        }
    }

    /* renamed from: F0 */
    public Drawable m3218F0() {
        Drawable drawable = this.f5135K;
        if (drawable != null) {
            return C0759a.m6745q(drawable);
        }
        return null;
    }

    /* renamed from: F1 */
    public void m3217F1(int i) {
        m3220E1(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: G0 */
    public float m3215G0() {
        return this.f5137M;
    }

    /* renamed from: G1 */
    public void m3214G1(ColorStateList colorStateList) {
        this.f5138N = true;
        if (this.f5136L != colorStateList) {
            this.f5136L = colorStateList;
            if (m3219E2()) {
                C0759a.m6747o(this.f5135K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H0 */
    public ColorStateList m3212H0() {
        return this.f5136L;
    }

    /* renamed from: H1 */
    public void m3211H1(int i) {
        m3214G1(C0010a.m9578c(this.f5158h0, i));
    }

    /* renamed from: I0 */
    public float m3209I0() {
        return this.f5121D;
    }

    /* renamed from: I1 */
    public void m3208I1(int i) {
        m3205J1(this.f5158h0.getResources().getBoolean(i));
    }

    /* renamed from: J0 */
    public float m3206J0() {
        return this.f5150Z;
    }

    /* renamed from: J1 */
    public void m3205J1(boolean z) {
        if (this.f5133J != z) {
            boolean m3219E2 = m3219E2();
            this.f5133J = z;
            boolean m3219E22 = m3219E2();
            if (m3219E2 != m3219E22) {
                if (m3219E22) {
                    m3160g0(this.f5135K);
                } else {
                    m3213G2(this.f5135K);
                }
                invalidateSelf();
                m3135o1();
            }
        }
    }

    /* renamed from: K0 */
    public ColorStateList m3204K0() {
        return this.f5125F;
    }

    /* renamed from: K1 */
    public void m3203K1(float f) {
        if (this.f5121D != f) {
            this.f5121D = f;
            invalidateSelf();
            m3135o1();
        }
    }

    /* renamed from: L0 */
    public float m3202L0() {
        return this.f5127G;
    }

    /* renamed from: L1 */
    public void m3201L1(int i) {
        m3203K1(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: M0 */
    public Drawable m3200M0() {
        Drawable drawable = this.f5140P;
        if (drawable != null) {
            return C0759a.m6745q(drawable);
        }
        return null;
    }

    /* renamed from: M1 */
    public void m3199M1(float f) {
        if (this.f5150Z != f) {
            this.f5150Z = f;
            invalidateSelf();
            m3135o1();
        }
    }

    /* renamed from: N0 */
    public CharSequence m3198N0() {
        return this.f5144T;
    }

    /* renamed from: N1 */
    public void m3197N1(int i) {
        m3199M1(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: O0 */
    public float m3196O0() {
        return this.f5156f0;
    }

    /* renamed from: O1 */
    public void m3195O1(ColorStateList colorStateList) {
        if (this.f5125F != colorStateList) {
            this.f5125F = colorStateList;
            if (this.f5134J0) {
                m4535b0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P0 */
    public float m3194P0() {
        return this.f5143S;
    }

    /* renamed from: P1 */
    public void m3193P1(int i) {
        m3195O1(C0010a.m9578c(this.f5158h0, i));
    }

    /* renamed from: Q0 */
    public float m3192Q0() {
        return this.f5155e0;
    }

    /* renamed from: Q1 */
    public void m3191Q1(float f) {
        if (this.f5127G != f) {
            this.f5127G = f;
            this.f5159i0.setStrokeWidth(f);
            if (this.f5134J0) {
                super.m4533c0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: R0 */
    public int[] m3190R0() {
        return this.f5120C0;
    }

    /* renamed from: R1 */
    public void m3189R1(int i) {
        m3191Q1(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: S0 */
    public ColorStateList m3188S0() {
        return this.f5142R;
    }

    /* renamed from: T0 */
    public void m3186T0(RectF rectF) {
        m3145l0(getBounds(), rectF);
    }

    /* renamed from: T1 */
    public void m3185T1(Drawable drawable) {
        Drawable m3200M0 = m3200M0();
        if (m3200M0 != drawable) {
            float m3142m0 = m3142m0();
            this.f5140P = drawable != null ? C0759a.m6744r(drawable).mutate() : null;
            if (C1397b.f4315a) {
                m3207I2();
            }
            float m3142m02 = m3142m0();
            m3213G2(m3200M0);
            if (m3216F2()) {
                m3160g0(this.f5140P);
            }
            invalidateSelf();
            if (m3142m0 != m3142m02) {
                m3135o1();
            }
        }
    }

    /* renamed from: U0 */
    public TextUtils.TruncateAt m3184U0() {
        return this.f5128G0;
    }

    /* renamed from: U1 */
    public void m3183U1(CharSequence charSequence) {
        if (this.f5144T != charSequence) {
            this.f5144T = C0170a.m8917c().m8912h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: V0 */
    public C1357h m3182V0() {
        return this.f5149Y;
    }

    /* renamed from: V1 */
    public void m3181V1(float f) {
        if (this.f5156f0 != f) {
            this.f5156f0 = f;
            invalidateSelf();
            if (m3216F2()) {
                m3135o1();
            }
        }
    }

    /* renamed from: W0 */
    public float m3180W0() {
        return this.f5152b0;
    }

    /* renamed from: W1 */
    public void m3179W1(int i) {
        m3181V1(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: X0 */
    public float m3178X0() {
        return this.f5151a0;
    }

    /* renamed from: X1 */
    public void m3177X1(int i) {
        m3185T1(C0010a.m9577d(this.f5158h0, i));
    }

    /* renamed from: Y0 */
    public ColorStateList m3176Y0() {
        return this.f5129H;
    }

    /* renamed from: Y1 */
    public void m3175Y1(float f) {
        if (this.f5143S != f) {
            this.f5143S = f;
            invalidateSelf();
            if (m3216F2()) {
                m3135o1();
            }
        }
    }

    /* renamed from: Z0 */
    public C1357h m3174Z0() {
        return this.f5148X;
    }

    /* renamed from: Z1 */
    public void m3173Z1(int i) {
        m3175Y1(this.f5158h0.getResources().getDimension(i));
    }

    @Override // com.google.android.material.internal.C1848f.InterfaceC1850b
    /* renamed from: a */
    public void mo2725a() {
        m3135o1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public CharSequence m3172a1() {
        return this.f5131I;
    }

    /* renamed from: a2 */
    public void m3171a2(float f) {
        if (this.f5155e0 != f) {
            this.f5155e0 = f;
            invalidateSelf();
            if (m3216F2()) {
                m3135o1();
            }
        }
    }

    /* renamed from: b1 */
    public C1389d m3170b1() {
        return this.f5165o0.m2734d();
    }

    /* renamed from: b2 */
    public void m3169b2(int i) {
        m3171a2(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: c1 */
    public float m3168c1() {
        return this.f5154d0;
    }

    /* renamed from: c2 */
    public boolean m3167c2(int[] iArr) {
        if (Arrays.equals(this.f5120C0, iArr)) {
            return false;
        }
        this.f5120C0 = iArr;
        if (m3216F2()) {
            return m3132p1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: d1 */
    public float m3166d1() {
        return this.f5153c0;
    }

    /* renamed from: d2 */
    public void m3165d2(ColorStateList colorStateList) {
        if (this.f5142R != colorStateList) {
            this.f5142R = colorStateList;
            if (m3216F2()) {
                C0759a.m6747o(this.f5140P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.f5174x0;
        int m4348a = i < 255 ? C1361a.m4348a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        m3112w0(canvas, bounds);
        m3121t0(canvas, bounds);
        if (this.f5134J0) {
            super.draw(canvas);
        }
        m3115v0(canvas, bounds);
        m3106y0(canvas, bounds);
        m3118u0(canvas, bounds);
        m3124s0(canvas, bounds);
        if (this.f5130H0) {
            m3233A0(canvas, bounds);
        }
        m3109x0(canvas, bounds);
        m3103z0(canvas, bounds);
        if (this.f5174x0 < 255) {
            canvas.restoreToCount(m4348a);
        }
    }

    /* renamed from: e2 */
    public void m3163e2(int i) {
        m3165d2(C0010a.m9578c(this.f5158h0, i));
    }

    /* renamed from: f1 */
    public boolean m3162f1() {
        return this.f5122D0;
    }

    /* renamed from: f2 */
    public void m3161f2(boolean z) {
        if (this.f5139O != z) {
            boolean m3216F2 = m3216F2();
            this.f5139O = z;
            boolean m3216F22 = m3216F2();
            if (m3216F2 != m3216F22) {
                if (m3216F22) {
                    m3160g0(this.f5140P);
                } else {
                    m3213G2(this.f5140P);
                }
                invalidateSelf();
                m3135o1();
            }
        }
    }

    /* renamed from: g2 */
    public void m3158g2(InterfaceC1761a interfaceC1761a) {
        this.f5126F0 = new WeakReference<>(interfaceC1761a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5174x0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f5175y0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f5121D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f5150Z + m3154i0() + this.f5153c0 + this.f5165o0.m2732f(m3172a1().toString()) + this.f5154d0 + m3142m0() + this.f5157g0), this.f5132I0);
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5134J0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f5123E);
        } else {
            outline.setRoundRect(bounds, this.f5123E);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public boolean m3156h1() {
        return this.f5145U;
    }

    /* renamed from: h2 */
    public void m3155h2(TextUtils.TruncateAt truncateAt) {
        this.f5128G0 = truncateAt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public float m3154i0() {
        if (m3219E2() || m3222D2()) {
            return this.f5151a0 + this.f5137M + this.f5152b0;
        }
        return 0.0f;
    }

    /* renamed from: i1 */
    public boolean m3153i1() {
        return m3144l1(this.f5140P);
    }

    /* renamed from: i2 */
    public void m3152i2(C1357h c1357h) {
        this.f5149Y = c1357h;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return m3147k1(this.f5117B) || m3147k1(this.f5119C) || m3147k1(this.f5125F) || (this.f5122D0 && m3147k1(this.f5124E0)) || m3141m1(this.f5165o0.m2734d()) || m3130q0() || m3144l1(this.f5135K) || m3144l1(this.f5147W) || m3147k1(this.f5116A0);
    }

    /* renamed from: j1 */
    public boolean m3150j1() {
        return this.f5139O;
    }

    /* renamed from: j2 */
    public void m3149j2(int i) {
        m3152i2(C1357h.m4365c(this.f5158h0, i));
    }

    /* renamed from: k2 */
    public void m3146k2(float f) {
        if (this.f5152b0 != f) {
            float m3154i0 = m3154i0();
            this.f5152b0 = f;
            float m3154i02 = m3154i0();
            invalidateSelf();
            if (m3154i0 != m3154i02) {
                m3135o1();
            }
        }
    }

    /* renamed from: l2 */
    public void m3143l2(int i) {
        m3146k2(this.f5158h0.getResources().getDimension(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public float m3142m0() {
        if (m3216F2()) {
            return this.f5155e0 + this.f5143S + this.f5156f0;
        }
        return 0.0f;
    }

    /* renamed from: m2 */
    public void m3140m2(float f) {
        if (this.f5151a0 != f) {
            float m3154i0 = m3154i0();
            this.f5151a0 = f;
            float m3154i02 = m3154i0();
            invalidateSelf();
            if (m3154i0 != m3154i02) {
                m3135o1();
            }
        }
    }

    /* renamed from: n2 */
    public void m3137n2(int i) {
        m3140m2(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: o1 */
    protected void m3135o1() {
        InterfaceC1761a interfaceC1761a = this.f5126F0.get();
        if (interfaceC1761a != null) {
            interfaceC1761a.mo3100a();
        }
    }

    /* renamed from: o2 */
    public void m3134o2(int i) {
        this.f5132I0 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m3219E2()) {
            onLayoutDirectionChanged |= C0759a.m6749m(this.f5135K, i);
        }
        if (m3222D2()) {
            onLayoutDirectionChanged |= C0759a.m6749m(this.f5147W, i);
        }
        if (m3216F2()) {
            onLayoutDirectionChanged |= C0759a.m6749m(this.f5140P, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m3219E2()) {
            onLevelChange |= this.f5135K.setLevel(i);
        }
        if (m3222D2()) {
            onLevelChange |= this.f5147W.setLevel(i);
        }
        if (m3216F2()) {
            onLevelChange |= this.f5140P.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f5134J0) {
            super.onStateChange(iArr);
        }
        return m3132p1(iArr, m3190R0());
    }

    /* renamed from: p0 */
    Paint.Align m3133p0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f5131I != null) {
            float m3154i0 = this.f5150Z + m3154i0() + this.f5153c0;
            if (C0759a.m6756f(this) == 0) {
                pointF.x = rect.left + m3154i0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m3154i0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m3136o0();
        }
        return align;
    }

    /* renamed from: p2 */
    public void m3131p2(ColorStateList colorStateList) {
        if (this.f5129H != colorStateList) {
            this.f5129H = colorStateList;
            m3210H2();
            onStateChange(getState());
        }
    }

    /* renamed from: q1 */
    public void m3129q1(boolean z) {
        if (this.f5145U != z) {
            this.f5145U = z;
            float m3154i0 = m3154i0();
            if (!z && this.f5172v0) {
                this.f5172v0 = false;
            }
            float m3154i02 = m3154i0();
            invalidateSelf();
            if (m3154i0 != m3154i02) {
                m3135o1();
            }
        }
    }

    /* renamed from: q2 */
    public void m3128q2(int i) {
        m3131p2(C0010a.m9578c(this.f5158h0, i));
    }

    /* renamed from: r1 */
    public void m3126r1(int i) {
        m3129q1(this.f5158h0.getResources().getBoolean(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2 */
    public void m3125r2(boolean z) {
        this.f5130H0 = z;
    }

    /* renamed from: s1 */
    public void m3123s1(Drawable drawable) {
        if (this.f5147W != drawable) {
            float m3154i0 = m3154i0();
            this.f5147W = drawable;
            float m3154i02 = m3154i0();
            m3213G2(this.f5147W);
            m3160g0(this.f5147W);
            invalidateSelf();
            if (m3154i0 != m3154i02) {
                m3135o1();
            }
        }
    }

    /* renamed from: s2 */
    public void m3122s2(C1357h c1357h) {
        this.f5148X = c1357h;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f5174x0 != i) {
            this.f5174x0 = i;
            invalidateSelf();
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5175y0 != colorFilter) {
            this.f5175y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f5116A0 != colorStateList) {
            this.f5116A0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f5118B0 != mode) {
            this.f5118B0 = mode;
            this.f5176z0 = C1379a.m4284a(this, this.f5116A0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m3219E2()) {
            visible |= this.f5135K.setVisible(z, z2);
        }
        if (m3222D2()) {
            visible |= this.f5147W.setVisible(z, z2);
        }
        if (m3216F2()) {
            visible |= this.f5140P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public void m3120t1(int i) {
        m3123s1(C0010a.m9577d(this.f5158h0, i));
    }

    /* renamed from: t2 */
    public void m3119t2(int i) {
        m3122s2(C1357h.m4365c(this.f5158h0, i));
    }

    /* renamed from: u1 */
    public void m3117u1(int i) {
        m3114v1(this.f5158h0.getResources().getBoolean(i));
    }

    /* renamed from: u2 */
    public void m3116u2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f5131I, charSequence)) {
            return;
        }
        this.f5131I = charSequence;
        this.f5165o0.m2729i(true);
        invalidateSelf();
        m3135o1();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public void m3114v1(boolean z) {
        if (this.f5146V != z) {
            boolean m3222D2 = m3222D2();
            this.f5146V = z;
            boolean m3222D22 = m3222D2();
            if (m3222D2 != m3222D22) {
                if (m3222D22) {
                    m3160g0(this.f5147W);
                } else {
                    m3213G2(this.f5147W);
                }
                invalidateSelf();
                m3135o1();
            }
        }
    }

    /* renamed from: v2 */
    public void m3113v2(C1389d c1389d) {
        this.f5165o0.m2730h(c1389d, this.f5158h0);
    }

    /* renamed from: w1 */
    public void m3111w1(ColorStateList colorStateList) {
        if (this.f5119C != colorStateList) {
            this.f5119C = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: w2 */
    public void m3110w2(int i) {
        m3113v2(new C1389d(this.f5158h0, i));
    }

    /* renamed from: x1 */
    public void m3108x1(int i) {
        m3111w1(C0010a.m9578c(this.f5158h0, i));
    }

    /* renamed from: x2 */
    public void m3107x2(float f) {
        if (this.f5154d0 != f) {
            this.f5154d0 = f;
            invalidateSelf();
            m3135o1();
        }
    }

    @Deprecated
    /* renamed from: y1 */
    public void m3105y1(float f) {
        if (this.f5123E != f) {
            this.f5123E = f;
            setShapeAppearanceModel(m4562B().m4476w(f));
        }
    }

    /* renamed from: y2 */
    public void m3104y2(int i) {
        m3107x2(this.f5158h0.getResources().getDimension(i));
    }

    @Deprecated
    /* renamed from: z1 */
    public void m3102z1(int i) {
        m3105y1(this.f5158h0.getResources().getDimension(i));
    }

    /* renamed from: z2 */
    public void m3101z2(float f) {
        if (this.f5153c0 != f) {
            this.f5153c0 = f;
            invalidateSelf();
            m3135o1();
        }
    }
}
