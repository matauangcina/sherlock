package p054b.p059c.p060a.p075b.p076a0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.InterfaceC0760b;
import p000a.p019g.p027j.C0189d;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.C1326l;
import p054b.p059c.p060a.p075b.p076a0.C1329m;
import p054b.p059c.p060a.p075b.p084q.C1377a;
import p054b.p059c.p060a.p075b.p087t.C1380a;
import p054b.p059c.p060a.p075b.p093z.C1398a;
/* renamed from: b.c.a.b.a0.g */
/* loaded from: classes.dex */
public class C1315g extends Drawable implements InterfaceC0760b, InterfaceC1337n {

    /* renamed from: A */
    private static final Paint f4100A = new Paint(1);

    /* renamed from: f */
    private C1318c f4101f;

    /* renamed from: g */
    private final C1329m.AbstractC1336g[] f4102g;

    /* renamed from: h */
    private final C1329m.AbstractC1336g[] f4103h;

    /* renamed from: i */
    private boolean f4104i;

    /* renamed from: j */
    private final Matrix f4105j;

    /* renamed from: k */
    private final Path f4106k;

    /* renamed from: l */
    private final Path f4107l;

    /* renamed from: m */
    private final RectF f4108m;

    /* renamed from: n */
    private final RectF f4109n;

    /* renamed from: o */
    private final Region f4110o;

    /* renamed from: p */
    private final Region f4111p;

    /* renamed from: q */
    private C1322k f4112q;

    /* renamed from: r */
    private final Paint f4113r;

    /* renamed from: s */
    private final Paint f4114s;

    /* renamed from: t */
    private final C1398a f4115t;

    /* renamed from: u */
    private final C1326l.InterfaceC1327a f4116u;

    /* renamed from: v */
    private final C1326l f4117v;

    /* renamed from: w */
    private PorterDuffColorFilter f4118w;

    /* renamed from: x */
    private PorterDuffColorFilter f4119x;

    /* renamed from: y */
    private Rect f4120y;

    /* renamed from: z */
    private final RectF f4121z;

    /* renamed from: b.c.a.b.a0.g$a */
    /* loaded from: classes.dex */
    class C1316a implements C1326l.InterfaceC1327a {
        C1316a() {
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1326l.InterfaceC1327a
        /* renamed from: a */
        public void mo4430a(C1329m c1329m, Matrix matrix, int i) {
            C1315g.this.f4103h[i] = c1329m.m4424e(matrix);
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1326l.InterfaceC1327a
        /* renamed from: b */
        public void mo4429b(C1329m c1329m, Matrix matrix, int i) {
            C1315g.this.f4102g[i] = c1329m.m4424e(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.a0.g$b */
    /* loaded from: classes.dex */
    public class C1317b implements C1322k.InterfaceC1325c {

        /* renamed from: a */
        final /* synthetic */ float f4123a;

        C1317b(C1315g c1315g, float f) {
            this.f4123a = f;
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1322k.InterfaceC1325c
        /* renamed from: a */
        public InterfaceC1311c mo4443a(InterfaceC1311c interfaceC1311c) {
            return interfaceC1311c instanceof C1320i ? interfaceC1311c : new C1310b(this.f4123a, interfaceC1311c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.a0.g$c */
    /* loaded from: classes.dex */
    public static final class C1318c extends Drawable.ConstantState {

        /* renamed from: a */
        public C1322k f4124a;

        /* renamed from: b */
        public C1380a f4125b;

        /* renamed from: c */
        public ColorFilter f4126c;

        /* renamed from: d */
        public ColorStateList f4127d;

        /* renamed from: e */
        public ColorStateList f4128e;

        /* renamed from: f */
        public ColorStateList f4129f;

        /* renamed from: g */
        public ColorStateList f4130g;

        /* renamed from: h */
        public PorterDuff.Mode f4131h;

        /* renamed from: i */
        public Rect f4132i;

        /* renamed from: j */
        public float f4133j;

        /* renamed from: k */
        public float f4134k;

        /* renamed from: l */
        public float f4135l;

        /* renamed from: m */
        public int f4136m;

        /* renamed from: n */
        public float f4137n;

        /* renamed from: o */
        public float f4138o;

        /* renamed from: p */
        public float f4139p;

        /* renamed from: q */
        public int f4140q;

        /* renamed from: r */
        public int f4141r;

        /* renamed from: s */
        public int f4142s;

        /* renamed from: t */
        public int f4143t;

        /* renamed from: u */
        public boolean f4144u;

        /* renamed from: v */
        public Paint.Style f4145v;

        public C1318c(C1318c c1318c) {
            this.f4127d = null;
            this.f4128e = null;
            this.f4129f = null;
            this.f4130g = null;
            this.f4131h = PorterDuff.Mode.SRC_IN;
            this.f4132i = null;
            this.f4133j = 1.0f;
            this.f4134k = 1.0f;
            this.f4136m = 255;
            this.f4137n = 0.0f;
            this.f4138o = 0.0f;
            this.f4139p = 0.0f;
            this.f4140q = 0;
            this.f4141r = 0;
            this.f4142s = 0;
            this.f4143t = 0;
            this.f4144u = false;
            this.f4145v = Paint.Style.FILL_AND_STROKE;
            this.f4124a = c1318c.f4124a;
            this.f4125b = c1318c.f4125b;
            this.f4135l = c1318c.f4135l;
            this.f4126c = c1318c.f4126c;
            this.f4127d = c1318c.f4127d;
            this.f4128e = c1318c.f4128e;
            this.f4131h = c1318c.f4131h;
            this.f4130g = c1318c.f4130g;
            this.f4136m = c1318c.f4136m;
            this.f4133j = c1318c.f4133j;
            this.f4142s = c1318c.f4142s;
            this.f4140q = c1318c.f4140q;
            this.f4144u = c1318c.f4144u;
            this.f4134k = c1318c.f4134k;
            this.f4137n = c1318c.f4137n;
            this.f4138o = c1318c.f4138o;
            this.f4139p = c1318c.f4139p;
            this.f4141r = c1318c.f4141r;
            this.f4143t = c1318c.f4143t;
            this.f4129f = c1318c.f4129f;
            this.f4145v = c1318c.f4145v;
            if (c1318c.f4132i != null) {
                this.f4132i = new Rect(c1318c.f4132i);
            }
        }

        public C1318c(C1322k c1322k, C1380a c1380a) {
            this.f4127d = null;
            this.f4128e = null;
            this.f4129f = null;
            this.f4130g = null;
            this.f4131h = PorterDuff.Mode.SRC_IN;
            this.f4132i = null;
            this.f4133j = 1.0f;
            this.f4134k = 1.0f;
            this.f4136m = 255;
            this.f4137n = 0.0f;
            this.f4138o = 0.0f;
            this.f4139p = 0.0f;
            this.f4140q = 0;
            this.f4141r = 0;
            this.f4142s = 0;
            this.f4143t = 0;
            this.f4144u = false;
            this.f4145v = Paint.Style.FILL_AND_STROKE;
            this.f4124a = c1322k;
            this.f4125b = c1380a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1315g c1315g = new C1315g(this, null);
            c1315g.f4104i = true;
            return c1315g;
        }
    }

    public C1315g() {
        this(new C1322k());
    }

    public C1315g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1322k.m4494e(context, attributeSet, i, i2).m4457m());
    }

    private C1315g(C1318c c1318c) {
        this.f4102g = new C1329m.AbstractC1336g[4];
        this.f4103h = new C1329m.AbstractC1336g[4];
        this.f4105j = new Matrix();
        this.f4106k = new Path();
        this.f4107l = new Path();
        this.f4108m = new RectF();
        this.f4109n = new RectF();
        this.f4110o = new Region();
        this.f4111p = new Region();
        this.f4113r = new Paint(1);
        this.f4114s = new Paint(1);
        this.f4115t = new C1398a();
        this.f4117v = new C1326l();
        this.f4121z = new RectF();
        this.f4101f = c1318c;
        this.f4114s.setStyle(Paint.Style.STROKE);
        this.f4113r.setStyle(Paint.Style.FILL);
        f4100A.setColor(-1);
        f4100A.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m4529e0();
        m4531d0(getState());
        this.f4116u = new C1316a();
    }

    /* synthetic */ C1315g(C1318c c1318c, C1316a c1316a) {
        this(c1318c);
    }

    public C1315g(C1322k c1322k) {
        this(new C1318c(c1322k, null));
    }

    /* renamed from: C */
    private float m4561C() {
        if (m4553K()) {
            return this.f4114s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: I */
    private boolean m4555I() {
        C1318c c1318c = this.f4101f;
        int i = c1318c.f4140q;
        return i != 1 && c1318c.f4141r > 0 && (i == 2 || m4546R());
    }

    /* renamed from: J */
    private boolean m4554J() {
        Paint.Style style = this.f4101f.f4145v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: K */
    private boolean m4553K() {
        Paint.Style style = this.f4101f.f4145v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f4114s.getStrokeWidth() > 0.0f;
    }

    /* renamed from: M */
    private void m4551M() {
        super.invalidateSelf();
    }

    /* renamed from: P */
    private static int m4548P(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: Q */
    private void m4547Q(Canvas canvas) {
        int m4508y = m4508y();
        int m4507z = m4507z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f4101f.f4141r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(m4508y, m4507z);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(m4508y, m4507z);
    }

    /* renamed from: R */
    private boolean m4546R() {
        return Build.VERSION.SDK_INT < 21 || !(m4549O() || this.f4106k.isConvex());
    }

    /* renamed from: d0 */
    private boolean m4531d0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4101f.f4127d == null || color2 == (colorForState2 = this.f4101f.f4127d.getColorForState(iArr, (color2 = this.f4113r.getColor())))) {
            z = false;
        } else {
            this.f4113r.setColor(colorForState2);
            z = true;
        }
        if (this.f4101f.f4128e == null || color == (colorForState = this.f4101f.f4128e.getColorForState(iArr, (color = this.f4114s.getColor())))) {
            return z;
        }
        this.f4114s.setColor(colorForState);
        return true;
    }

    /* renamed from: e */
    private PorterDuffColorFilter m4530e(Paint paint, boolean z) {
        int color;
        int m4522k;
        if (!z || (m4522k = m4522k((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(m4522k, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: e0 */
    private boolean m4529e0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4118w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4119x;
        C1318c c1318c = this.f4101f;
        this.f4118w = m4523j(c1318c.f4130g, c1318c.f4131h, this.f4113r, true);
        C1318c c1318c2 = this.f4101f;
        this.f4119x = m4523j(c1318c2.f4129f, c1318c2.f4131h, this.f4114s, false);
        C1318c c1318c3 = this.f4101f;
        if (c1318c3.f4144u) {
            this.f4115t.m4235d(c1318c3.f4130g.getColorForState(getState(), 0));
        }
        return (C0189d.m8873a(porterDuffColorFilter, this.f4118w) && C0189d.m8873a(porterDuffColorFilter2, this.f4119x)) ? false : true;
    }

    /* renamed from: f */
    private void m4528f(RectF rectF, Path path) {
        m4526g(rectF, path);
        if (this.f4101f.f4133j != 1.0f) {
            this.f4105j.reset();
            Matrix matrix = this.f4105j;
            float f = this.f4101f.f4133j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4105j);
        }
        path.computeBounds(this.f4121z, true);
    }

    /* renamed from: f0 */
    private void m4527f0() {
        float m4556H = m4556H();
        this.f4101f.f4141r = (int) Math.ceil(0.75f * m4556H);
        this.f4101f.f4142s = (int) Math.ceil(m4556H * 0.25f);
        m4529e0();
        m4551M();
    }

    /* renamed from: h */
    private void m4525h() {
        C1322k m4475x = m4562B().m4475x(new C1317b(this, -m4561C()));
        this.f4112q = m4475x;
        this.f4117v.m4439d(m4475x, this.f4101f.f4134k, m4512u(), this.f4107l);
    }

    /* renamed from: i */
    private PorterDuffColorFilter m4524i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m4522k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m4523j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m4530e(paint, z) : m4524i(colorStateList, mode, z);
    }

    /* renamed from: k */
    private int m4522k(int i) {
        float m4556H = m4556H() + m4509x();
        C1380a c1380a = this.f4101f.f4125b;
        return c1380a != null ? c1380a.m4281c(i, m4556H) : i;
    }

    /* renamed from: l */
    public static C1315g m4521l(Context context, float f) {
        int m4290b = C1377a.m4290b(context, C1338b.colorSurface, C1315g.class.getSimpleName());
        C1315g c1315g = new C1315g();
        c1315g.m4552L(context);
        c1315g.m4544T(ColorStateList.valueOf(m4290b));
        c1315g.m4545S(f);
        return c1315g;
    }

    /* renamed from: m */
    private void m4520m(Canvas canvas) {
        if (this.f4101f.f4142s != 0) {
            canvas.drawPath(this.f4106k, this.f4115t.m4236c());
        }
        for (int i = 0; i < 4; i++) {
            this.f4102g[i].m4381b(this.f4115t, this.f4101f.f4141r, canvas);
            this.f4103h[i].m4381b(this.f4115t, this.f4101f.f4141r, canvas);
        }
        int m4508y = m4508y();
        int m4507z = m4507z();
        canvas.translate(-m4508y, -m4507z);
        canvas.drawPath(this.f4106k, f4100A);
        canvas.translate(m4508y, m4507z);
    }

    /* renamed from: n */
    private void m4519n(Canvas canvas) {
        m4517p(canvas, this.f4113r, this.f4106k, this.f4101f.f4124a, m4513t());
    }

    /* renamed from: p */
    private void m4517p(Canvas canvas, Paint paint, Path path, C1322k c1322k, RectF rectF) {
        if (!c1322k.m4478u(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float mo4500a = c1322k.m4479t().mo4500a(rectF);
        canvas.drawRoundRect(rectF, mo4500a, mo4500a, paint);
    }

    /* renamed from: q */
    private void m4516q(Canvas canvas) {
        m4517p(canvas, this.f4114s, this.f4107l, this.f4112q, m4512u());
    }

    /* renamed from: u */
    private RectF m4512u() {
        RectF m4513t = m4513t();
        float m4561C = m4561C();
        this.f4109n.set(m4513t.left + m4561C, m4513t.top + m4561C, m4513t.right - m4561C, m4513t.bottom - m4561C);
        return this.f4109n;
    }

    /* renamed from: A */
    public int m4563A() {
        return this.f4101f.f4141r;
    }

    /* renamed from: B */
    public C1322k m4562B() {
        return this.f4101f.f4124a;
    }

    /* renamed from: D */
    public ColorStateList m4560D() {
        return this.f4101f.f4130g;
    }

    /* renamed from: E */
    public float m4559E() {
        return this.f4101f.f4124a.m4481r().mo4500a(m4513t());
    }

    /* renamed from: F */
    public float m4558F() {
        return this.f4101f.f4124a.m4479t().mo4500a(m4513t());
    }

    /* renamed from: G */
    public float m4557G() {
        return this.f4101f.f4139p;
    }

    /* renamed from: H */
    public float m4556H() {
        return m4511v() + m4557G();
    }

    /* renamed from: L */
    public void m4552L(Context context) {
        this.f4101f.f4125b = new C1380a(context);
        m4527f0();
    }

    /* renamed from: N */
    public boolean m4550N() {
        C1380a c1380a = this.f4101f.f4125b;
        return c1380a != null && c1380a.m4280d();
    }

    /* renamed from: O */
    public boolean m4549O() {
        return this.f4101f.f4124a.m4478u(m4513t());
    }

    /* renamed from: S */
    public void m4545S(float f) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4138o != f) {
            c1318c.f4138o = f;
            m4527f0();
        }
    }

    /* renamed from: T */
    public void m4544T(ColorStateList colorStateList) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4127d != colorStateList) {
            c1318c.f4127d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: U */
    public void m4543U(float f) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4134k != f) {
            c1318c.f4134k = f;
            this.f4104i = true;
            invalidateSelf();
        }
    }

    /* renamed from: V */
    public void m4542V(int i, int i2, int i3, int i4) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4132i == null) {
            c1318c.f4132i = new Rect();
        }
        this.f4101f.f4132i.set(i, i2, i3, i4);
        this.f4120y = this.f4101f.f4132i;
        invalidateSelf();
    }

    /* renamed from: W */
    public void m4541W(float f) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4137n != f) {
            c1318c.f4137n = f;
            m4527f0();
        }
    }

    /* renamed from: X */
    public void m4540X(int i) {
        this.f4115t.m4235d(i);
        this.f4101f.f4144u = false;
        m4551M();
    }

    /* renamed from: Y */
    public void m4539Y(int i) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4143t != i) {
            c1318c.f4143t = i;
            m4551M();
        }
    }

    /* renamed from: Z */
    public void m4538Z(float f, int i) {
        m4533c0(f);
        m4535b0(ColorStateList.valueOf(i));
    }

    /* renamed from: a0 */
    public void m4537a0(float f, ColorStateList colorStateList) {
        m4533c0(f);
        m4535b0(colorStateList);
    }

    /* renamed from: b0 */
    public void m4535b0(ColorStateList colorStateList) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4128e != colorStateList) {
            c1318c.f4128e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: c0 */
    public void m4533c0(float f) {
        this.f4101f.f4135l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f4113r.setColorFilter(this.f4118w);
        int alpha = this.f4113r.getAlpha();
        this.f4113r.setAlpha(m4548P(alpha, this.f4101f.f4136m));
        this.f4114s.setColorFilter(this.f4119x);
        this.f4114s.setStrokeWidth(this.f4101f.f4135l);
        int alpha2 = this.f4114s.getAlpha();
        this.f4114s.setAlpha(m4548P(alpha2, this.f4101f.f4136m));
        if (this.f4104i) {
            m4525h();
            m4528f(m4513t(), this.f4106k);
            this.f4104i = false;
        }
        if (m4555I()) {
            canvas.save();
            m4547Q(canvas);
            int width = (int) (this.f4121z.width() - getBounds().width());
            int height = (int) (this.f4121z.height() - getBounds().height());
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f4121z.width()) + (this.f4101f.f4141r * 2) + width, ((int) this.f4121z.height()) + (this.f4101f.f4141r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f4101f.f4141r) - width;
            float f2 = (getBounds().top - this.f4101f.f4141r) - height;
            canvas2.translate(-f, -f2);
            m4520m(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (m4554J()) {
            m4519n(canvas);
        }
        if (m4553K()) {
            m4516q(canvas);
        }
        this.f4113r.setAlpha(alpha);
        this.f4114s.setAlpha(alpha2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m4526g(RectF rectF, Path path) {
        C1326l c1326l = this.f4117v;
        C1318c c1318c = this.f4101f;
        c1326l.m4438e(c1318c.f4124a, c1318c.f4134k, rectF, this.f4116u, path);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4101f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f4101f.f4140q == 2) {
            return;
        }
        if (m4549O()) {
            outline.setRoundRect(getBounds(), m4559E());
            return;
        }
        m4528f(m4513t(), this.f4106k);
        if (this.f4106k.isConvex()) {
            outline.setConvexPath(this.f4106k);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f4120y;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f4110o.set(getBounds());
        m4528f(m4513t(), this.f4106k);
        this.f4111p.setPath(this.f4106k, this.f4110o);
        this.f4110o.op(this.f4111p, Region.Op.DIFFERENCE);
        return this.f4110o;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f4104i = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f4101f.f4130g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f4101f.f4129f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f4101f.f4128e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f4101f.f4127d) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4101f = new C1318c(this.f4101f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m4518o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m4517p(canvas, paint, path, this.f4101f.f4124a, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f4104i = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m4531d0(iArr) || m4529e0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: r */
    public float m4515r() {
        return this.f4101f.f4124a.m4489j().mo4500a(m4513t());
    }

    /* renamed from: s */
    public float m4514s() {
        return this.f4101f.f4124a.m4487l().mo4500a(m4513t());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4136m != i) {
            c1318c.f4136m = i;
            m4551M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4101f.f4126c = colorFilter;
        m4551M();
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n
    public void setShapeAppearanceModel(C1322k c1322k) {
        this.f4101f.f4124a = c1322k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintList(ColorStateList colorStateList) {
        this.f4101f.f4130g = colorStateList;
        m4529e0();
        m4551M();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintMode(PorterDuff.Mode mode) {
        C1318c c1318c = this.f4101f;
        if (c1318c.f4131h != mode) {
            c1318c.f4131h = mode;
            m4529e0();
            m4551M();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public RectF m4513t() {
        Rect bounds = getBounds();
        this.f4108m.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return this.f4108m;
    }

    /* renamed from: v */
    public float m4511v() {
        return this.f4101f.f4138o;
    }

    /* renamed from: w */
    public ColorStateList m4510w() {
        return this.f4101f.f4127d;
    }

    /* renamed from: x */
    public float m4509x() {
        return this.f4101f.f4137n;
    }

    /* renamed from: y */
    public int m4508y() {
        C1318c c1318c = this.f4101f;
        return (int) (c1318c.f4142s * Math.sin(Math.toRadians(c1318c.f4143t)));
    }

    /* renamed from: z */
    public int m4507z() {
        C1318c c1318c = this.f4101f;
        return (int) (c1318c.f4142s * Math.cos(Math.toRadians(c1318c.f4143t)));
    }
}
