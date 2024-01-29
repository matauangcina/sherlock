package p054b.p059c.p060a.p075b.p076a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p054b.p059c.p060a.p075b.C1349k;
/* renamed from: b.c.a.b.a0.k */
/* loaded from: classes.dex */
public class C1322k {

    /* renamed from: m */
    public static final InterfaceC1311c f4148m = new C1320i(0.5f);

    /* renamed from: a */
    C1312d f4149a;

    /* renamed from: b */
    C1312d f4150b;

    /* renamed from: c */
    C1312d f4151c;

    /* renamed from: d */
    C1312d f4152d;

    /* renamed from: e */
    InterfaceC1311c f4153e;

    /* renamed from: f */
    InterfaceC1311c f4154f;

    /* renamed from: g */
    InterfaceC1311c f4155g;

    /* renamed from: h */
    InterfaceC1311c f4156h;

    /* renamed from: i */
    C1314f f4157i;

    /* renamed from: j */
    C1314f f4158j;

    /* renamed from: k */
    C1314f f4159k;

    /* renamed from: l */
    C1314f f4160l;

    /* renamed from: b.c.a.b.a0.k$b */
    /* loaded from: classes.dex */
    public static final class C1324b {

        /* renamed from: a */
        private C1312d f4161a;

        /* renamed from: b */
        private C1312d f4162b;

        /* renamed from: c */
        private C1312d f4163c;

        /* renamed from: d */
        private C1312d f4164d;

        /* renamed from: e */
        private InterfaceC1311c f4165e;

        /* renamed from: f */
        private InterfaceC1311c f4166f;

        /* renamed from: g */
        private InterfaceC1311c f4167g;

        /* renamed from: h */
        private InterfaceC1311c f4168h;

        /* renamed from: i */
        private C1314f f4169i;

        /* renamed from: j */
        private C1314f f4170j;

        /* renamed from: k */
        private C1314f f4171k;

        /* renamed from: l */
        private C1314f f4172l;

        public C1324b() {
            this.f4161a = C1319h.m4505b();
            this.f4162b = C1319h.m4505b();
            this.f4163c = C1319h.m4505b();
            this.f4164d = C1319h.m4505b();
            this.f4165e = new C1309a(0.0f);
            this.f4166f = new C1309a(0.0f);
            this.f4167g = new C1309a(0.0f);
            this.f4168h = new C1309a(0.0f);
            this.f4169i = C1319h.m4504c();
            this.f4170j = C1319h.m4504c();
            this.f4171k = C1319h.m4504c();
            this.f4172l = C1319h.m4504c();
        }

        public C1324b(C1322k c1322k) {
            this.f4161a = C1319h.m4505b();
            this.f4162b = C1319h.m4505b();
            this.f4163c = C1319h.m4505b();
            this.f4164d = C1319h.m4505b();
            this.f4165e = new C1309a(0.0f);
            this.f4166f = new C1309a(0.0f);
            this.f4167g = new C1309a(0.0f);
            this.f4168h = new C1309a(0.0f);
            this.f4169i = C1319h.m4504c();
            this.f4170j = C1319h.m4504c();
            this.f4171k = C1319h.m4504c();
            this.f4172l = C1319h.m4504c();
            this.f4161a = c1322k.f4149a;
            this.f4162b = c1322k.f4150b;
            this.f4163c = c1322k.f4151c;
            this.f4164d = c1322k.f4152d;
            this.f4165e = c1322k.f4153e;
            this.f4166f = c1322k.f4154f;
            this.f4167g = c1322k.f4155g;
            this.f4168h = c1322k.f4156h;
            this.f4169i = c1322k.f4157i;
            this.f4170j = c1322k.f4158j;
            this.f4171k = c1322k.f4159k;
            this.f4172l = c1322k.f4160l;
        }

        /* renamed from: n */
        private static float m4456n(C1312d c1312d) {
            if (c1312d instanceof C1321j) {
                return ((C1321j) c1312d).f4147a;
            }
            if (c1312d instanceof C1313e) {
                return ((C1313e) c1312d).f4099a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C1324b m4474A(InterfaceC1311c interfaceC1311c) {
            this.f4165e = interfaceC1311c;
            return this;
        }

        /* renamed from: B */
        public C1324b m4473B(int i, InterfaceC1311c interfaceC1311c) {
            m4472C(C1319h.m4506a(i));
            m4470E(interfaceC1311c);
            return this;
        }

        /* renamed from: C */
        public C1324b m4472C(C1312d c1312d) {
            this.f4162b = c1312d;
            float m4456n = m4456n(c1312d);
            if (m4456n != -1.0f) {
                m4471D(m4456n);
            }
            return this;
        }

        /* renamed from: D */
        public C1324b m4471D(float f) {
            this.f4166f = new C1309a(f);
            return this;
        }

        /* renamed from: E */
        public C1324b m4470E(InterfaceC1311c interfaceC1311c) {
            this.f4166f = interfaceC1311c;
            return this;
        }

        /* renamed from: m */
        public C1322k m4457m() {
            return new C1322k(this);
        }

        /* renamed from: o */
        public C1324b m4455o(float f) {
            m4444z(f);
            m4471D(f);
            m4448v(f);
            m4452r(f);
            return this;
        }

        /* renamed from: p */
        public C1324b m4454p(int i, InterfaceC1311c interfaceC1311c) {
            m4453q(C1319h.m4506a(i));
            m4451s(interfaceC1311c);
            return this;
        }

        /* renamed from: q */
        public C1324b m4453q(C1312d c1312d) {
            this.f4164d = c1312d;
            float m4456n = m4456n(c1312d);
            if (m4456n != -1.0f) {
                m4452r(m4456n);
            }
            return this;
        }

        /* renamed from: r */
        public C1324b m4452r(float f) {
            this.f4168h = new C1309a(f);
            return this;
        }

        /* renamed from: s */
        public C1324b m4451s(InterfaceC1311c interfaceC1311c) {
            this.f4168h = interfaceC1311c;
            return this;
        }

        /* renamed from: t */
        public C1324b m4450t(int i, InterfaceC1311c interfaceC1311c) {
            m4449u(C1319h.m4506a(i));
            m4447w(interfaceC1311c);
            return this;
        }

        /* renamed from: u */
        public C1324b m4449u(C1312d c1312d) {
            this.f4163c = c1312d;
            float m4456n = m4456n(c1312d);
            if (m4456n != -1.0f) {
                m4448v(m4456n);
            }
            return this;
        }

        /* renamed from: v */
        public C1324b m4448v(float f) {
            this.f4167g = new C1309a(f);
            return this;
        }

        /* renamed from: w */
        public C1324b m4447w(InterfaceC1311c interfaceC1311c) {
            this.f4167g = interfaceC1311c;
            return this;
        }

        /* renamed from: x */
        public C1324b m4446x(int i, InterfaceC1311c interfaceC1311c) {
            m4445y(C1319h.m4506a(i));
            m4474A(interfaceC1311c);
            return this;
        }

        /* renamed from: y */
        public C1324b m4445y(C1312d c1312d) {
            this.f4161a = c1312d;
            float m4456n = m4456n(c1312d);
            if (m4456n != -1.0f) {
                m4444z(m4456n);
            }
            return this;
        }

        /* renamed from: z */
        public C1324b m4444z(float f) {
            this.f4165e = new C1309a(f);
            return this;
        }
    }

    /* renamed from: b.c.a.b.a0.k$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1325c {
        /* renamed from: a */
        InterfaceC1311c mo4443a(InterfaceC1311c interfaceC1311c);
    }

    public C1322k() {
        this.f4149a = C1319h.m4505b();
        this.f4150b = C1319h.m4505b();
        this.f4151c = C1319h.m4505b();
        this.f4152d = C1319h.m4505b();
        this.f4153e = new C1309a(0.0f);
        this.f4154f = new C1309a(0.0f);
        this.f4155g = new C1309a(0.0f);
        this.f4156h = new C1309a(0.0f);
        this.f4157i = C1319h.m4504c();
        this.f4158j = C1319h.m4504c();
        this.f4159k = C1319h.m4504c();
        this.f4160l = C1319h.m4504c();
    }

    private C1322k(C1324b c1324b) {
        this.f4149a = c1324b.f4161a;
        this.f4150b = c1324b.f4162b;
        this.f4151c = c1324b.f4163c;
        this.f4152d = c1324b.f4164d;
        this.f4153e = c1324b.f4165e;
        this.f4154f = c1324b.f4166f;
        this.f4155g = c1324b.f4167g;
        this.f4156h = c1324b.f4168h;
        this.f4157i = c1324b.f4169i;
        this.f4158j = c1324b.f4170j;
        this.f4159k = c1324b.f4171k;
        this.f4160l = c1324b.f4172l;
    }

    /* renamed from: a */
    public static C1324b m4498a() {
        return new C1324b();
    }

    /* renamed from: b */
    public static C1324b m4497b(Context context, int i, int i2) {
        return m4496c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C1324b m4496c(Context context, int i, int i2, int i3) {
        return m4495d(context, i, i2, new C1309a(i3));
    }

    /* renamed from: d */
    private static C1324b m4495d(Context context, int i, int i2, InterfaceC1311c interfaceC1311c) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1349k.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C1349k.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C1349k.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C1349k.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C1349k.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C1349k.ShapeAppearance_cornerFamilyBottomLeft, i3);
            InterfaceC1311c m4486m = m4486m(obtainStyledAttributes, C1349k.ShapeAppearance_cornerSize, interfaceC1311c);
            InterfaceC1311c m4486m2 = m4486m(obtainStyledAttributes, C1349k.ShapeAppearance_cornerSizeTopLeft, m4486m);
            InterfaceC1311c m4486m3 = m4486m(obtainStyledAttributes, C1349k.ShapeAppearance_cornerSizeTopRight, m4486m);
            InterfaceC1311c m4486m4 = m4486m(obtainStyledAttributes, C1349k.ShapeAppearance_cornerSizeBottomRight, m4486m);
            InterfaceC1311c m4486m5 = m4486m(obtainStyledAttributes, C1349k.ShapeAppearance_cornerSizeBottomLeft, m4486m);
            C1324b c1324b = new C1324b();
            c1324b.m4446x(i4, m4486m2);
            c1324b.m4473B(i5, m4486m3);
            c1324b.m4450t(i6, m4486m4);
            c1324b.m4454p(i7, m4486m5);
            return c1324b;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C1324b m4494e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m4493f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C1324b m4493f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m4492g(context, attributeSet, i, i2, new C1309a(i3));
    }

    /* renamed from: g */
    public static C1324b m4492g(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC1311c interfaceC1311c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C1349k.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C1349k.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m4495d(context, resourceId, resourceId2, interfaceC1311c);
    }

    /* renamed from: m */
    private static InterfaceC1311c m4486m(TypedArray typedArray, int i, InterfaceC1311c interfaceC1311c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC1311c;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C1309a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C1320i(peekValue.getFraction(1.0f, 1.0f)) : interfaceC1311c;
    }

    /* renamed from: h */
    public C1314f m4491h() {
        return this.f4159k;
    }

    /* renamed from: i */
    public C1312d m4490i() {
        return this.f4152d;
    }

    /* renamed from: j */
    public InterfaceC1311c m4489j() {
        return this.f4156h;
    }

    /* renamed from: k */
    public C1312d m4488k() {
        return this.f4151c;
    }

    /* renamed from: l */
    public InterfaceC1311c m4487l() {
        return this.f4155g;
    }

    /* renamed from: n */
    public C1314f m4485n() {
        return this.f4160l;
    }

    /* renamed from: o */
    public C1314f m4484o() {
        return this.f4158j;
    }

    /* renamed from: p */
    public C1314f m4483p() {
        return this.f4157i;
    }

    /* renamed from: q */
    public C1312d m4482q() {
        return this.f4149a;
    }

    /* renamed from: r */
    public InterfaceC1311c m4481r() {
        return this.f4153e;
    }

    /* renamed from: s */
    public C1312d m4480s() {
        return this.f4150b;
    }

    /* renamed from: t */
    public InterfaceC1311c m4479t() {
        return this.f4154f;
    }

    /* renamed from: u */
    public boolean m4478u(RectF rectF) {
        boolean z = this.f4160l.getClass().equals(C1314f.class) && this.f4158j.getClass().equals(C1314f.class) && this.f4157i.getClass().equals(C1314f.class) && this.f4159k.getClass().equals(C1314f.class);
        float mo4500a = this.f4153e.mo4500a(rectF);
        return z && ((this.f4154f.mo4500a(rectF) > mo4500a ? 1 : (this.f4154f.mo4500a(rectF) == mo4500a ? 0 : -1)) == 0 && (this.f4156h.mo4500a(rectF) > mo4500a ? 1 : (this.f4156h.mo4500a(rectF) == mo4500a ? 0 : -1)) == 0 && (this.f4155g.mo4500a(rectF) > mo4500a ? 1 : (this.f4155g.mo4500a(rectF) == mo4500a ? 0 : -1)) == 0) && ((this.f4150b instanceof C1321j) && (this.f4149a instanceof C1321j) && (this.f4151c instanceof C1321j) && (this.f4152d instanceof C1321j));
    }

    /* renamed from: v */
    public C1324b m4477v() {
        return new C1324b(this);
    }

    /* renamed from: w */
    public C1322k m4476w(float f) {
        C1324b m4477v = m4477v();
        m4477v.m4455o(f);
        return m4477v.m4457m();
    }

    /* renamed from: x */
    public C1322k m4475x(InterfaceC1325c interfaceC1325c) {
        C1324b m4477v = m4477v();
        m4477v.m4474A(interfaceC1325c.mo4443a(m4481r()));
        m4477v.m4470E(interfaceC1325c.mo4443a(m4479t()));
        m4477v.m4451s(interfaceC1325c.mo4443a(m4489j()));
        m4477v.m4447w(interfaceC1325c.mo4443a(m4487l()));
        return m4477v.m4457m();
    }
}
