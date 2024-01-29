package p054b.p059c.p060a.p075b.p076a0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p054b.p059c.p060a.p075b.p093z.C1398a;
/* renamed from: b.c.a.b.a0.m */
/* loaded from: classes.dex */
public class C1329m {
    @Deprecated

    /* renamed from: a */
    public float f4185a;
    @Deprecated

    /* renamed from: b */
    public float f4186b;
    @Deprecated

    /* renamed from: c */
    public float f4187c;
    @Deprecated

    /* renamed from: d */
    public float f4188d;
    @Deprecated

    /* renamed from: e */
    public float f4189e;
    @Deprecated

    /* renamed from: f */
    public float f4190f;

    /* renamed from: g */
    private final List<AbstractC1335f> f4191g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC1336g> f4192h = new ArrayList();

    /* renamed from: b.c.a.b.a0.m$a */
    /* loaded from: classes.dex */
    class C1330a extends AbstractC1336g {

        /* renamed from: b */
        final /* synthetic */ List f4193b;

        /* renamed from: c */
        final /* synthetic */ Matrix f4194c;

        C1330a(C1329m c1329m, List list, Matrix matrix) {
            this.f4193b = list;
            this.f4194c = matrix;
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1329m.AbstractC1336g
        /* renamed from: a */
        public void mo4382a(Matrix matrix, C1398a c1398a, int i, Canvas canvas) {
            for (AbstractC1336g abstractC1336g : this.f4193b) {
                abstractC1336g.mo4382a(this.f4194c, c1398a, i, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.a0.m$b */
    /* loaded from: classes.dex */
    public static class C1331b extends AbstractC1336g {

        /* renamed from: b */
        private final C1333d f4195b;

        public C1331b(C1333d c1333d) {
            this.f4195b = c1333d;
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1329m.AbstractC1336g
        /* renamed from: a */
        public void mo4382a(Matrix matrix, C1398a c1398a, int i, Canvas canvas) {
            c1398a.m4238a(canvas, matrix, new RectF(this.f4195b.m4398k(), this.f4195b.m4394o(), this.f4195b.m4397l(), this.f4195b.m4399j()), i, this.f4195b.m4396m(), this.f4195b.m4395n());
        }
    }

    /* renamed from: b.c.a.b.a0.m$c */
    /* loaded from: classes.dex */
    static class C1332c extends AbstractC1336g {

        /* renamed from: b */
        private final C1334e f4196b;

        /* renamed from: c */
        private final float f4197c;

        /* renamed from: d */
        private final float f4198d;

        public C1332c(C1334e c1334e, float f, float f2) {
            this.f4196b = c1334e;
            this.f4197c = f;
            this.f4198d = f2;
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1329m.AbstractC1336g
        /* renamed from: a */
        public void mo4382a(Matrix matrix, C1398a c1398a, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f4196b.f4207c - this.f4198d, this.f4196b.f4206b - this.f4197c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4197c, this.f4198d);
            matrix2.preRotate(m4408c());
            c1398a.m4237b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        float m4408c() {
            return (float) Math.toDegrees(Math.atan((this.f4196b.f4207c - this.f4198d) / (this.f4196b.f4206b - this.f4197c)));
        }
    }

    /* renamed from: b.c.a.b.a0.m$d */
    /* loaded from: classes.dex */
    public static class C1333d extends AbstractC1335f {

        /* renamed from: h */
        private static final RectF f4199h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f4200b;
        @Deprecated

        /* renamed from: c */
        public float f4201c;
        @Deprecated

        /* renamed from: d */
        public float f4202d;
        @Deprecated

        /* renamed from: e */
        public float f4203e;
        @Deprecated

        /* renamed from: f */
        public float f4204f;
        @Deprecated

        /* renamed from: g */
        public float f4205g;

        public C1333d(float f, float f2, float f3, float f4) {
            m4392q(f);
            m4388u(f2);
            m4391r(f3);
            m4393p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public float m4399j() {
            return this.f4203e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public float m4398k() {
            return this.f4200b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public float m4397l() {
            return this.f4202d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public float m4396m() {
            return this.f4204f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public float m4395n() {
            return this.f4205g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public float m4394o() {
            return this.f4201c;
        }

        /* renamed from: p */
        private void m4393p(float f) {
            this.f4203e = f;
        }

        /* renamed from: q */
        private void m4392q(float f) {
            this.f4200b = f;
        }

        /* renamed from: r */
        private void m4391r(float f) {
            this.f4202d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public void m4390s(float f) {
            this.f4204f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public void m4389t(float f) {
            this.f4205g = f;
        }

        /* renamed from: u */
        private void m4388u(float f) {
            this.f4201c = f;
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1329m.AbstractC1335f
        /* renamed from: a */
        public void mo4383a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4208a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f4199h.set(m4398k(), m4394o(), m4397l(), m4399j());
            path.arcTo(f4199h, m4396m(), m4395n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: b.c.a.b.a0.m$e */
    /* loaded from: classes.dex */
    public static class C1334e extends AbstractC1335f {

        /* renamed from: b */
        private float f4206b;

        /* renamed from: c */
        private float f4207c;

        @Override // p054b.p059c.p060a.p075b.p076a0.C1329m.AbstractC1335f
        /* renamed from: a */
        public void mo4383a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4208a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4206b, this.f4207c);
            path.transform(matrix);
        }
    }

    /* renamed from: b.c.a.b.a0.m$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1335f {

        /* renamed from: a */
        protected final Matrix f4208a = new Matrix();

        /* renamed from: a */
        public abstract void mo4383a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.a0.m$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1336g {

        /* renamed from: a */
        static final Matrix f4209a = new Matrix();

        AbstractC1336g() {
        }

        /* renamed from: a */
        public abstract void mo4382a(Matrix matrix, C1398a c1398a, int i, Canvas canvas);

        /* renamed from: b */
        public final void m4381b(C1398a c1398a, int i, Canvas canvas) {
            mo4382a(f4209a, c1398a, i, canvas);
        }
    }

    public C1329m() {
        m4416m(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m4427b(float f) {
        if (m4423f() == f) {
            return;
        }
        float m4423f = ((f - m4423f()) + 360.0f) % 360.0f;
        if (m4423f > 180.0f) {
            return;
        }
        C1333d c1333d = new C1333d(m4421h(), m4420i(), m4421h(), m4420i());
        c1333d.m4390s(m4423f());
        c1333d.m4389t(m4423f);
        this.f4192h.add(new C1331b(c1333d));
        m4414o(f);
    }

    /* renamed from: c */
    private void m4426c(AbstractC1336g abstractC1336g, float f, float f2) {
        m4427b(f);
        this.f4192h.add(abstractC1336g);
        m4414o(f2);
    }

    /* renamed from: f */
    private float m4423f() {
        return this.f4189e;
    }

    /* renamed from: g */
    private float m4422g() {
        return this.f4190f;
    }

    /* renamed from: o */
    private void m4414o(float f) {
        this.f4189e = f;
    }

    /* renamed from: p */
    private void m4413p(float f) {
        this.f4190f = f;
    }

    /* renamed from: q */
    private void m4412q(float f) {
        this.f4187c = f;
    }

    /* renamed from: r */
    private void m4411r(float f) {
        this.f4188d = f;
    }

    /* renamed from: s */
    private void m4410s(float f) {
        this.f4185a = f;
    }

    /* renamed from: t */
    private void m4409t(float f) {
        this.f4186b = f;
    }

    /* renamed from: a */
    public void m4428a(float f, float f2, float f3, float f4, float f5, float f6) {
        C1333d c1333d = new C1333d(f, f2, f3, f4);
        c1333d.m4390s(f5);
        c1333d.m4389t(f6);
        this.f4191g.add(c1333d);
        C1331b c1331b = new C1331b(c1333d);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m4426c(c1331b, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = f7;
        m4412q(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m4411r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void m4425d(Matrix matrix, Path path) {
        int size = this.f4191g.size();
        for (int i = 0; i < size; i++) {
            this.f4191g.get(i).mo4383a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC1336g m4424e(Matrix matrix) {
        m4427b(m4422g());
        return new C1330a(this, new ArrayList(this.f4192h), matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m4421h() {
        return this.f4187c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m4420i() {
        return this.f4188d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m4419j() {
        return this.f4185a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m4418k() {
        return this.f4186b;
    }

    /* renamed from: l */
    public void m4417l(float f, float f2) {
        C1334e c1334e = new C1334e();
        c1334e.f4206b = f;
        c1334e.f4207c = f2;
        this.f4191g.add(c1334e);
        C1332c c1332c = new C1332c(c1334e, m4421h(), m4420i());
        m4426c(c1332c, c1332c.m4408c() + 270.0f, c1332c.m4408c() + 270.0f);
        m4412q(f);
        m4411r(f2);
    }

    /* renamed from: m */
    public void m4416m(float f, float f2) {
        m4415n(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: n */
    public void m4415n(float f, float f2, float f3, float f4) {
        m4410s(f);
        m4409t(f2);
        m4412q(f);
        m4411r(f2);
        m4414o(f3);
        m4413p((f3 + f4) % 360.0f);
        this.f4191g.clear();
        this.f4192h.clear();
    }
}
