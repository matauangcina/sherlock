package p054b.p059c.p060a.p075b.p076a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* renamed from: b.c.a.b.a0.l */
/* loaded from: classes.dex */
public class C1326l {

    /* renamed from: a */
    private final C1329m[] f4173a = new C1329m[4];

    /* renamed from: b */
    private final Matrix[] f4174b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f4175c = new Matrix[4];

    /* renamed from: d */
    private final PointF f4176d = new PointF();

    /* renamed from: e */
    private final C1329m f4177e = new C1329m();

    /* renamed from: f */
    private final float[] f4178f = new float[2];

    /* renamed from: g */
    private final float[] f4179g = new float[2];

    /* renamed from: b.c.a.b.a0.l$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1327a {
        /* renamed from: a */
        void mo4430a(C1329m c1329m, Matrix matrix, int i);

        /* renamed from: b */
        void mo4429b(C1329m c1329m, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.a0.l$b */
    /* loaded from: classes.dex */
    public static final class C1328b {

        /* renamed from: a */
        public final C1322k f4180a;

        /* renamed from: b */
        public final Path f4181b;

        /* renamed from: c */
        public final RectF f4182c;

        /* renamed from: d */
        public final InterfaceC1327a f4183d;

        /* renamed from: e */
        public final float f4184e;

        C1328b(C1322k c1322k, float f, RectF rectF, InterfaceC1327a interfaceC1327a, Path path) {
            this.f4183d = interfaceC1327a;
            this.f4180a = c1322k;
            this.f4184e = f;
            this.f4182c = rectF;
            this.f4181b = path;
        }
    }

    public C1326l() {
        for (int i = 0; i < 4; i++) {
            this.f4173a[i] = new C1329m();
            this.f4174b[i] = new Matrix();
            this.f4175c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m4442a(int i) {
        return (i + 1) * 90;
    }

    /* renamed from: b */
    private void m4441b(C1328b c1328b, int i) {
        this.f4178f[0] = this.f4173a[i].m4419j();
        this.f4178f[1] = this.f4173a[i].m4418k();
        this.f4174b[i].mapPoints(this.f4178f);
        Path path = c1328b.f4181b;
        float[] fArr = this.f4178f;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f4173a[i].m4425d(this.f4174b[i], c1328b.f4181b);
        InterfaceC1327a interfaceC1327a = c1328b.f4183d;
        if (interfaceC1327a != null) {
            interfaceC1327a.mo4429b(this.f4173a[i], this.f4174b[i], i);
        }
    }

    /* renamed from: c */
    private void m4440c(C1328b c1328b, int i) {
        int i2 = (i + 1) % 4;
        this.f4178f[0] = this.f4173a[i].m4421h();
        this.f4178f[1] = this.f4173a[i].m4420i();
        this.f4174b[i].mapPoints(this.f4178f);
        this.f4179g[0] = this.f4173a[i2].m4419j();
        this.f4179g[1] = this.f4173a[i2].m4418k();
        this.f4174b[i2].mapPoints(this.f4179g);
        float[] fArr = this.f4178f;
        float f = fArr[0];
        float[] fArr2 = this.f4179g;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m4434i = m4434i(c1328b.f4182c, i);
        this.f4177e.m4416m(0.0f, 0.0f);
        m4433j(i, c1328b.f4180a).mo3381a(max, m4434i, c1328b.f4184e, this.f4177e);
        this.f4177e.m4425d(this.f4175c[i], c1328b.f4181b);
        InterfaceC1327a interfaceC1327a = c1328b.f4183d;
        if (interfaceC1327a != null) {
            interfaceC1327a.mo4430a(this.f4177e, this.f4175c[i], i);
        }
    }

    /* renamed from: f */
    private void m4437f(int i, RectF rectF, PointF pointF) {
        float f;
        float f2;
        if (i == 1) {
            f = rectF.right;
        } else if (i != 2) {
            f = i != 3 ? rectF.right : rectF.left;
            f2 = rectF.top;
            pointF.set(f, f2);
        } else {
            f = rectF.left;
        }
        f2 = rectF.bottom;
        pointF.set(f, f2);
    }

    /* renamed from: g */
    private InterfaceC1311c m4436g(int i, C1322k c1322k) {
        return i != 1 ? i != 2 ? i != 3 ? c1322k.m4479t() : c1322k.m4481r() : c1322k.m4489j() : c1322k.m4487l();
    }

    /* renamed from: h */
    private C1312d m4435h(int i, C1322k c1322k) {
        return i != 1 ? i != 2 ? i != 3 ? c1322k.m4480s() : c1322k.m4482q() : c1322k.m4490i() : c1322k.m4488k();
    }

    /* renamed from: i */
    private float m4434i(RectF rectF, int i) {
        float centerX;
        float f;
        float[] fArr = this.f4178f;
        C1329m[] c1329mArr = this.f4173a;
        fArr[0] = c1329mArr[i].f4187c;
        fArr[1] = c1329mArr[i].f4188d;
        this.f4174b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            centerX = rectF.centerX();
            f = this.f4178f[0];
        } else {
            centerX = rectF.centerY();
            f = this.f4178f[1];
        }
        return Math.abs(centerX - f);
    }

    /* renamed from: j */
    private C1314f m4433j(int i, C1322k c1322k) {
        return i != 1 ? i != 2 ? i != 3 ? c1322k.m4484o() : c1322k.m4483p() : c1322k.m4485n() : c1322k.m4491h();
    }

    /* renamed from: k */
    private void m4432k(C1328b c1328b, int i) {
        m4435h(i, c1328b.f4180a).m4564b(this.f4173a[i], 90.0f, c1328b.f4184e, c1328b.f4182c, m4436g(i, c1328b.f4180a));
        float m4442a = m4442a(i);
        this.f4174b[i].reset();
        m4437f(i, c1328b.f4182c, this.f4176d);
        Matrix matrix = this.f4174b[i];
        PointF pointF = this.f4176d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f4174b[i].preRotate(m4442a);
    }

    /* renamed from: l */
    private void m4431l(int i) {
        this.f4178f[0] = this.f4173a[i].m4421h();
        this.f4178f[1] = this.f4173a[i].m4420i();
        this.f4174b[i].mapPoints(this.f4178f);
        float m4442a = m4442a(i);
        this.f4175c[i].reset();
        Matrix matrix = this.f4175c[i];
        float[] fArr = this.f4178f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f4175c[i].preRotate(m4442a);
    }

    /* renamed from: d */
    public void m4439d(C1322k c1322k, float f, RectF rectF, Path path) {
        m4438e(c1322k, f, rectF, null, path);
    }

    /* renamed from: e */
    public void m4438e(C1322k c1322k, float f, RectF rectF, InterfaceC1327a interfaceC1327a, Path path) {
        path.rewind();
        C1328b c1328b = new C1328b(c1322k, f, rectF, interfaceC1327a, path);
        for (int i = 0; i < 4; i++) {
            m4432k(c1328b, i);
            m4431l(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m4441b(c1328b, i2);
            m4440c(c1328b, i2);
        }
        path.close();
    }
}
