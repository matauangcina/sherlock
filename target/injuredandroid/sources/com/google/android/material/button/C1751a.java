package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0759a;
import com.google.android.material.internal.C1852h;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n;
import p054b.p059c.p060a.p075b.p084q.C1377a;
import p054b.p059c.p060a.p075b.p091x.C1388c;
import p054b.p059c.p060a.p075b.p092y.C1394a;
import p054b.p059c.p060a.p075b.p092y.C1397b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes.dex */
public class C1751a {

    /* renamed from: s */
    private static final boolean f5062s;

    /* renamed from: a */
    private final MaterialButton f5063a;

    /* renamed from: b */
    private C1322k f5064b;

    /* renamed from: c */
    private int f5065c;

    /* renamed from: d */
    private int f5066d;

    /* renamed from: e */
    private int f5067e;

    /* renamed from: f */
    private int f5068f;

    /* renamed from: g */
    private int f5069g;

    /* renamed from: h */
    private int f5070h;

    /* renamed from: i */
    private PorterDuff.Mode f5071i;

    /* renamed from: j */
    private ColorStateList f5072j;

    /* renamed from: k */
    private ColorStateList f5073k;

    /* renamed from: l */
    private ColorStateList f5074l;

    /* renamed from: m */
    private Drawable f5075m;

    /* renamed from: n */
    private boolean f5076n = false;

    /* renamed from: o */
    private boolean f5077o = false;

    /* renamed from: p */
    private boolean f5078p = false;

    /* renamed from: q */
    private boolean f5079q;

    /* renamed from: r */
    private LayerDrawable f5080r;

    static {
        f5062s = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1751a(MaterialButton materialButton, C1322k c1322k) {
        this.f5063a = materialButton;
        this.f5064b = c1322k;
    }

    /* renamed from: A */
    private void m3306A(C1322k c1322k) {
        if (m3299d() != null) {
            m3299d().setShapeAppearanceModel(c1322k);
        }
        if (m3291l() != null) {
            m3291l().setShapeAppearanceModel(c1322k);
        }
        if (m3300c() != null) {
            m3300c().setShapeAppearanceModel(c1322k);
        }
    }

    /* renamed from: C */
    private void m3304C() {
        C1315g m3299d = m3299d();
        C1315g m3291l = m3291l();
        if (m3299d != null) {
            m3299d.m4537a0(this.f5070h, this.f5073k);
            if (m3291l != null) {
                m3291l.m4538Z(this.f5070h, this.f5076n ? C1377a.m4289c(this.f5063a, C1338b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m3303D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f5065c, this.f5067e, this.f5066d, this.f5068f);
    }

    /* renamed from: a */
    private Drawable m3302a() {
        C1315g c1315g = new C1315g(this.f5064b);
        c1315g.m4552L(this.f5063a.getContext());
        C0759a.m6747o(c1315g, this.f5072j);
        PorterDuff.Mode mode = this.f5071i;
        if (mode != null) {
            C0759a.m6746p(c1315g, mode);
        }
        c1315g.m4537a0(this.f5070h, this.f5073k);
        C1315g c1315g2 = new C1315g(this.f5064b);
        c1315g2.setTint(0);
        c1315g2.m4538Z(this.f5070h, this.f5076n ? C1377a.m4289c(this.f5063a, C1338b.colorSurface) : 0);
        if (f5062s) {
            C1315g c1315g3 = new C1315g(this.f5064b);
            this.f5075m = c1315g3;
            C0759a.m6748n(c1315g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C1397b.m4240a(this.f5074l), m3303D(new LayerDrawable(new Drawable[]{c1315g2, c1315g})), this.f5075m);
            this.f5080r = rippleDrawable;
            return rippleDrawable;
        }
        C1394a c1394a = new C1394a(this.f5064b);
        this.f5075m = c1394a;
        C0759a.m6747o(c1394a, C1397b.m4240a(this.f5074l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c1315g2, c1315g, this.f5075m});
        this.f5080r = layerDrawable;
        return m3303D(layerDrawable);
    }

    /* renamed from: e */
    private C1315g m3298e(boolean z) {
        LayerDrawable layerDrawable = this.f5080r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1315g) (f5062s ? (LayerDrawable) ((InsetDrawable) this.f5080r.getDrawable(0)).getDrawable() : this.f5080r).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: l */
    private C1315g m3291l() {
        return m3298e(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m3305B(int i, int i2) {
        Drawable drawable = this.f5075m;
        if (drawable != null) {
            drawable.setBounds(this.f5065c, this.f5067e, i2 - this.f5066d, i - this.f5068f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m3301b() {
        return this.f5069g;
    }

    /* renamed from: c */
    public InterfaceC1337n m3300c() {
        LayerDrawable layerDrawable = this.f5080r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC1337n) (this.f5080r.getNumberOfLayers() > 2 ? this.f5080r.getDrawable(2) : this.f5080r.getDrawable(1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C1315g m3299d() {
        return m3298e(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList m3297f() {
        return this.f5074l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C1322k m3296g() {
        return this.f5064b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m3295h() {
        return this.f5073k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m3294i() {
        return this.f5070h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m3293j() {
        return this.f5072j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m3292k() {
        return this.f5071i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m3290m() {
        return this.f5077o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m3289n() {
        return this.f5079q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m3288o(TypedArray typedArray) {
        this.f5065c = typedArray.getDimensionPixelOffset(C1349k.MaterialButton_android_insetLeft, 0);
        this.f5066d = typedArray.getDimensionPixelOffset(C1349k.MaterialButton_android_insetRight, 0);
        this.f5067e = typedArray.getDimensionPixelOffset(C1349k.MaterialButton_android_insetTop, 0);
        this.f5068f = typedArray.getDimensionPixelOffset(C1349k.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C1349k.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C1349k.MaterialButton_cornerRadius, -1);
            this.f5069g = dimensionPixelSize;
            m3282u(this.f5064b.m4476w(dimensionPixelSize));
            this.f5078p = true;
        }
        this.f5070h = typedArray.getDimensionPixelSize(C1349k.MaterialButton_strokeWidth, 0);
        this.f5071i = C1852h.m2710c(typedArray.getInt(C1349k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f5072j = C1388c.m4262a(this.f5063a.getContext(), typedArray, C1349k.MaterialButton_backgroundTint);
        this.f5073k = C1388c.m4262a(this.f5063a.getContext(), typedArray, C1349k.MaterialButton_strokeColor);
        this.f5074l = C1388c.m4262a(this.f5063a.getContext(), typedArray, C1349k.MaterialButton_rippleColor);
        this.f5079q = typedArray.getBoolean(C1349k.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C1349k.MaterialButton_elevation, 0);
        int m8661B = C0252s.m8661B(this.f5063a);
        int paddingTop = this.f5063a.getPaddingTop();
        int m8662A = C0252s.m8662A(this.f5063a);
        int paddingBottom = this.f5063a.getPaddingBottom();
        this.f5063a.setInternalBackground(m3302a());
        C1315g m3299d = m3299d();
        if (m3299d != null) {
            m3299d.m4545S(dimensionPixelSize2);
        }
        C0252s.m8599s0(this.f5063a, m8661B + this.f5065c, paddingTop + this.f5067e, m8662A + this.f5066d, paddingBottom + this.f5068f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m3287p(int i) {
        if (m3299d() != null) {
            m3299d().setTint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m3286q() {
        this.f5077o = true;
        this.f5063a.setSupportBackgroundTintList(this.f5072j);
        this.f5063a.setSupportBackgroundTintMode(this.f5071i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m3285r(boolean z) {
        this.f5079q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m3284s(int i) {
        if (this.f5078p && this.f5069g == i) {
            return;
        }
        this.f5069g = i;
        this.f5078p = true;
        m3282u(this.f5064b.m4476w(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m3283t(ColorStateList colorStateList) {
        if (this.f5074l != colorStateList) {
            this.f5074l = colorStateList;
            if (f5062s && (this.f5063a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f5063a.getBackground()).setColor(C1397b.m4240a(colorStateList));
            } else if (f5062s || !(this.f5063a.getBackground() instanceof C1394a)) {
            } else {
                ((C1394a) this.f5063a.getBackground()).setTintList(C1397b.m4240a(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m3282u(C1322k c1322k) {
        this.f5064b = c1322k;
        m3306A(c1322k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m3281v(boolean z) {
        this.f5076n = z;
        m3304C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m3280w(ColorStateList colorStateList) {
        if (this.f5073k != colorStateList) {
            this.f5073k = colorStateList;
            m3304C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m3279x(int i) {
        if (this.f5070h != i) {
            this.f5070h = i;
            m3304C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m3278y(ColorStateList colorStateList) {
        if (this.f5072j != colorStateList) {
            this.f5072j = colorStateList;
            if (m3299d() != null) {
                C0759a.m6747o(m3299d(), this.f5072j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m3277z(PorterDuff.Mode mode) {
        if (this.f5071i != mode) {
            this.f5071i = mode;
            if (m3299d() == null || this.f5071i == null) {
                return;
            }
            C0759a.m6746p(m3299d(), this.f5071i);
        }
    }
}
