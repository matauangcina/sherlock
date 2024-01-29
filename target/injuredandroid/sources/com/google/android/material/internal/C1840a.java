package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import p000a.p019g.p023f.C0142a;
import p000a.p019g.p026i.C0178e;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.p078l.C1350a;
import p054b.p059c.p060a.p075b.p091x.C1385a;
import p054b.p059c.p060a.p075b.p091x.C1389d;
/* renamed from: com.google.android.material.internal.a */
/* loaded from: classes.dex */
public final class C1840a {

    /* renamed from: V */
    private static final boolean f5425V;

    /* renamed from: W */
    private static final Paint f5426W;

    /* renamed from: A */
    private boolean f5427A;

    /* renamed from: B */
    private Bitmap f5428B;

    /* renamed from: C */
    private Paint f5429C;

    /* renamed from: D */
    private float f5430D;

    /* renamed from: E */
    private float f5431E;

    /* renamed from: F */
    private float f5432F;

    /* renamed from: G */
    private float f5433G;

    /* renamed from: H */
    private int[] f5434H;

    /* renamed from: I */
    private boolean f5435I;

    /* renamed from: L */
    private TimeInterpolator f5438L;

    /* renamed from: M */
    private TimeInterpolator f5439M;

    /* renamed from: N */
    private float f5440N;

    /* renamed from: O */
    private float f5441O;

    /* renamed from: P */
    private float f5442P;

    /* renamed from: Q */
    private ColorStateList f5443Q;

    /* renamed from: R */
    private float f5444R;

    /* renamed from: S */
    private float f5445S;

    /* renamed from: T */
    private float f5446T;

    /* renamed from: U */
    private ColorStateList f5447U;

    /* renamed from: a */
    private final View f5448a;

    /* renamed from: b */
    private boolean f5449b;

    /* renamed from: c */
    private float f5450c;

    /* renamed from: k */
    private ColorStateList f5458k;

    /* renamed from: l */
    private ColorStateList f5459l;

    /* renamed from: m */
    private float f5460m;

    /* renamed from: n */
    private float f5461n;

    /* renamed from: o */
    private float f5462o;

    /* renamed from: p */
    private float f5463p;

    /* renamed from: q */
    private float f5464q;

    /* renamed from: r */
    private float f5465r;

    /* renamed from: s */
    private Typeface f5466s;

    /* renamed from: t */
    private Typeface f5467t;

    /* renamed from: u */
    private Typeface f5468u;

    /* renamed from: v */
    private C1385a f5469v;

    /* renamed from: w */
    private C1385a f5470w;

    /* renamed from: x */
    private CharSequence f5471x;

    /* renamed from: y */
    private CharSequence f5472y;

    /* renamed from: z */
    private boolean f5473z;

    /* renamed from: g */
    private int f5454g = 16;

    /* renamed from: h */
    private int f5455h = 16;

    /* renamed from: i */
    private float f5456i = 15.0f;

    /* renamed from: j */
    private float f5457j = 15.0f;

    /* renamed from: J */
    private final TextPaint f5436J = new TextPaint(129);

    /* renamed from: K */
    private final TextPaint f5437K = new TextPaint(this.f5436J);

    /* renamed from: e */
    private final Rect f5452e = new Rect();

    /* renamed from: d */
    private final Rect f5451d = new Rect();

    /* renamed from: f */
    private final RectF f5453f = new RectF();

    /* renamed from: com.google.android.material.internal.a$a */
    /* loaded from: classes.dex */
    class C1841a implements C1385a.InterfaceC1386a {
        C1841a() {
        }

        @Override // p054b.p059c.p060a.p075b.p091x.C1385a.InterfaceC1386a
        /* renamed from: a */
        public void mo2749a(Typeface typeface) {
            C1840a.this.m2790G(typeface);
        }
    }

    static {
        f5425V = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f5426W = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            f5426W.setColor(-65281);
        }
    }

    public C1840a(View view) {
        this.f5448a = view;
    }

    /* renamed from: A */
    private static boolean m2796A(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: H */
    private boolean m2789H(Typeface typeface) {
        C1385a c1385a = this.f5470w;
        if (c1385a != null) {
            c1385a.m4268c();
        }
        if (this.f5466s != typeface) {
            this.f5466s = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private boolean m2783N(Typeface typeface) {
        C1385a c1385a = this.f5469v;
        if (c1385a != null) {
            c1385a.m4268c();
        }
        if (this.f5467t != typeface) {
            this.f5467t = typeface;
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private void m2781P(float f) {
        m2769g(f);
        boolean z = f5425V && this.f5432F != 1.0f;
        this.f5427A = z;
        if (z) {
            m2766j();
        }
        C0252s.m8639X(this.f5448a);
    }

    /* renamed from: a */
    private static int m2775a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2774b() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C1840a.m2774b():void");
    }

    /* renamed from: d */
    private void m2772d() {
        m2770f(this.f5450c);
    }

    /* renamed from: e */
    private boolean m2771e(CharSequence charSequence) {
        return (C0252s.m8592w(this.f5448a) == 1 ? C0178e.f632d : C0178e.f631c).mo8881a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m2770f(float f) {
        TextPaint textPaint;
        int m2762n;
        m2755u(f);
        this.f5464q = m2752x(this.f5462o, this.f5463p, f, this.f5438L);
        this.f5465r = m2752x(this.f5460m, this.f5461n, f, this.f5438L);
        m2781P(m2752x(this.f5456i, this.f5457j, f, this.f5439M));
        if (this.f5459l != this.f5458k) {
            textPaint = this.f5436J;
            m2762n = m2775a(m2760p(), m2762n(), f);
        } else {
            textPaint = this.f5436J;
            m2762n = m2762n();
        }
        textPaint.setColor(m2762n);
        this.f5436J.setShadowLayer(m2752x(this.f5444R, this.f5440N, f, null), m2752x(this.f5445S, this.f5441O, f, null), m2752x(this.f5446T, this.f5442P, f, null), m2775a(m2761o(this.f5447U), m2761o(this.f5443Q), f));
        C0252s.m8639X(this.f5448a);
    }

    /* renamed from: g */
    private void m2769g(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f5471x == null) {
            return;
        }
        float width = this.f5452e.width();
        float width2 = this.f5451d.width();
        if (m2754v(f, this.f5457j)) {
            f2 = this.f5457j;
            this.f5432F = 1.0f;
            Typeface typeface = this.f5468u;
            Typeface typeface2 = this.f5466s;
            if (typeface != typeface2) {
                this.f5468u = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f3 = this.f5456i;
            Typeface typeface3 = this.f5468u;
            Typeface typeface4 = this.f5467t;
            if (typeface3 != typeface4) {
                this.f5468u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (m2754v(f, this.f5456i)) {
                this.f5432F = 1.0f;
            } else {
                this.f5432F = f / this.f5456i;
            }
            float f4 = this.f5457j / this.f5456i;
            width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            f2 = f3;
            z2 = z;
        }
        if (width > 0.0f) {
            z2 = this.f5433G != f2 || this.f5435I || z2;
            this.f5433G = f2;
            this.f5435I = false;
        }
        if (this.f5472y == null || z2) {
            this.f5436J.setTextSize(this.f5433G);
            this.f5436J.setTypeface(this.f5468u);
            this.f5436J.setLinearText(this.f5432F != 1.0f);
            CharSequence ellipsize = TextUtils.ellipsize(this.f5471x, this.f5436J, width, TextUtils.TruncateAt.END);
            if (TextUtils.equals(ellipsize, this.f5472y)) {
                return;
            }
            this.f5472y = ellipsize;
            this.f5473z = m2771e(ellipsize);
        }
    }

    /* renamed from: h */
    private void m2768h() {
        Bitmap bitmap = this.f5428B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f5428B = null;
        }
    }

    /* renamed from: j */
    private void m2766j() {
        if (this.f5428B != null || this.f5451d.isEmpty() || TextUtils.isEmpty(this.f5472y)) {
            return;
        }
        m2770f(0.0f);
        this.f5430D = this.f5436J.ascent();
        this.f5431E = this.f5436J.descent();
        TextPaint textPaint = this.f5436J;
        CharSequence charSequence = this.f5472y;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.f5431E - this.f5430D);
        if (round <= 0 || round2 <= 0) {
            return;
        }
        this.f5428B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f5428B);
        CharSequence charSequence2 = this.f5472y;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, round2 - this.f5436J.descent(), this.f5436J);
        if (this.f5429C == null) {
            this.f5429C = new Paint(3);
        }
    }

    /* renamed from: o */
    private int m2761o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f5434H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: p */
    private int m2760p() {
        return m2761o(this.f5458k);
    }

    /* renamed from: s */
    private void m2757s(TextPaint textPaint) {
        textPaint.setTextSize(this.f5457j);
        textPaint.setTypeface(this.f5466s);
    }

    /* renamed from: t */
    private void m2756t(TextPaint textPaint) {
        textPaint.setTextSize(this.f5456i);
        textPaint.setTypeface(this.f5467t);
    }

    /* renamed from: u */
    private void m2755u(float f) {
        this.f5453f.left = m2752x(this.f5451d.left, this.f5452e.left, f, this.f5438L);
        this.f5453f.top = m2752x(this.f5460m, this.f5461n, f, this.f5438L);
        this.f5453f.right = m2752x(this.f5451d.right, this.f5452e.right, f, this.f5438L);
        this.f5453f.bottom = m2752x(this.f5451d.bottom, this.f5452e.bottom, f, this.f5438L);
    }

    /* renamed from: v */
    private static boolean m2754v(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: x */
    private static float m2752x(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C1350a.m4377a(f, f2, f3);
    }

    /* renamed from: B */
    public void m2795B(int i, int i2, int i3, int i4) {
        if (m2796A(this.f5452e, i, i2, i3, i4)) {
            return;
        }
        this.f5452e.set(i, i2, i3, i4);
        this.f5435I = true;
        m2751y();
    }

    /* renamed from: C */
    public void m2794C(Rect rect) {
        m2795B(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: D */
    public void m2793D(int i) {
        C1389d c1389d = new C1389d(this.f5448a.getContext(), i);
        ColorStateList colorStateList = c1389d.f4295b;
        if (colorStateList != null) {
            this.f5459l = colorStateList;
        }
        float f = c1389d.f4294a;
        if (f != 0.0f) {
            this.f5457j = f;
        }
        ColorStateList colorStateList2 = c1389d.f4299f;
        if (colorStateList2 != null) {
            this.f5443Q = colorStateList2;
        }
        this.f5441O = c1389d.f4300g;
        this.f5442P = c1389d.f4301h;
        this.f5440N = c1389d.f4302i;
        C1385a c1385a = this.f5470w;
        if (c1385a != null) {
            c1385a.m4268c();
        }
        this.f5470w = new C1385a(new C1841a(), c1389d.m4252e());
        c1389d.m4249h(this.f5448a.getContext(), this.f5470w);
        m2750z();
    }

    /* renamed from: E */
    public void m2792E(ColorStateList colorStateList) {
        if (this.f5459l != colorStateList) {
            this.f5459l = colorStateList;
            m2750z();
        }
    }

    /* renamed from: F */
    public void m2791F(int i) {
        if (this.f5455h != i) {
            this.f5455h = i;
            m2750z();
        }
    }

    /* renamed from: G */
    public void m2790G(Typeface typeface) {
        if (m2789H(typeface)) {
            m2750z();
        }
    }

    /* renamed from: I */
    public void m2788I(int i, int i2, int i3, int i4) {
        if (m2796A(this.f5451d, i, i2, i3, i4)) {
            return;
        }
        this.f5451d.set(i, i2, i3, i4);
        this.f5435I = true;
        m2751y();
    }

    /* renamed from: J */
    public void m2787J(Rect rect) {
        m2788I(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: K */
    public void m2786K(ColorStateList colorStateList) {
        if (this.f5458k != colorStateList) {
            this.f5458k = colorStateList;
            m2750z();
        }
    }

    /* renamed from: L */
    public void m2785L(int i) {
        if (this.f5454g != i) {
            this.f5454g = i;
            m2750z();
        }
    }

    /* renamed from: M */
    public void m2784M(float f) {
        if (this.f5456i != f) {
            this.f5456i = f;
            m2750z();
        }
    }

    /* renamed from: O */
    public void m2782O(float f) {
        float m8972a = C0142a.m8972a(f, 0.0f, 1.0f);
        if (m8972a != this.f5450c) {
            this.f5450c = m8972a;
            m2772d();
        }
    }

    /* renamed from: Q */
    public void m2780Q(TimeInterpolator timeInterpolator) {
        this.f5438L = timeInterpolator;
        m2750z();
    }

    /* renamed from: R */
    public final boolean m2779R(int[] iArr) {
        this.f5434H = iArr;
        if (m2753w()) {
            m2750z();
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m2778S(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f5471x, charSequence)) {
            this.f5471x = charSequence;
            this.f5472y = null;
            m2768h();
            m2750z();
        }
    }

    /* renamed from: T */
    public void m2777T(TimeInterpolator timeInterpolator) {
        this.f5439M = timeInterpolator;
        m2750z();
    }

    /* renamed from: U */
    public void m2776U(Typeface typeface) {
        boolean m2789H = m2789H(typeface);
        boolean m2783N = m2783N(typeface);
        if (m2789H || m2783N) {
            m2750z();
        }
    }

    /* renamed from: c */
    public float m2773c() {
        if (this.f5471x == null) {
            return 0.0f;
        }
        m2757s(this.f5437K);
        TextPaint textPaint = this.f5437K;
        CharSequence charSequence = this.f5471x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: i */
    public void m2767i(Canvas canvas) {
        float ascent;
        int save = canvas.save();
        if (this.f5472y != null && this.f5449b) {
            float f = this.f5464q;
            float f2 = this.f5465r;
            boolean z = this.f5427A && this.f5428B != null;
            if (z) {
                ascent = this.f5430D * this.f5432F;
            } else {
                ascent = this.f5436J.ascent() * this.f5432F;
                this.f5436J.descent();
            }
            if (z) {
                f2 += ascent;
            }
            float f3 = f2;
            float f4 = this.f5432F;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f, f3);
            }
            if (z) {
                canvas.drawBitmap(this.f5428B, f, f3, this.f5429C);
            } else {
                CharSequence charSequence = this.f5472y;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f3, this.f5436J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: k */
    public void m2765k(RectF rectF) {
        boolean m2771e = m2771e(this.f5471x);
        Rect rect = this.f5452e;
        float m2773c = !m2771e ? rect.left : rect.right - m2773c();
        rectF.left = m2773c;
        Rect rect2 = this.f5452e;
        rectF.top = rect2.top;
        rectF.right = !m2771e ? m2773c + m2773c() : rect2.right;
        rectF.bottom = this.f5452e.top + m2763m();
    }

    /* renamed from: l */
    public ColorStateList m2764l() {
        return this.f5459l;
    }

    /* renamed from: m */
    public float m2763m() {
        m2757s(this.f5437K);
        return -this.f5437K.ascent();
    }

    /* renamed from: n */
    public int m2762n() {
        return m2761o(this.f5459l);
    }

    /* renamed from: q */
    public float m2759q() {
        m2756t(this.f5437K);
        return -this.f5437K.ascent();
    }

    /* renamed from: r */
    public float m2758r() {
        return this.f5450c;
    }

    /* renamed from: w */
    public final boolean m2753w() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5459l;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f5458k) != null && colorStateList.isStateful());
    }

    /* renamed from: y */
    void m2751y() {
        this.f5449b = this.f5452e.width() > 0 && this.f5452e.height() > 0 && this.f5451d.width() > 0 && this.f5451d.height() > 0;
    }

    /* renamed from: z */
    public void m2750z() {
        if (this.f5448a.getHeight() <= 0 || this.f5448a.getWidth() <= 0) {
            return;
        }
        m2774b();
        m2772d();
    }
}
