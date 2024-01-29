package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
class C0592e {

    /* renamed from: a */
    private final View f1982a;

    /* renamed from: d */
    private C0650u0 f1985d;

    /* renamed from: e */
    private C0650u0 f1986e;

    /* renamed from: f */
    private C0650u0 f1987f;

    /* renamed from: c */
    private int f1984c = -1;

    /* renamed from: b */
    private final C0608j f1983b = C0608j.m7411b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0592e(View view) {
        this.f1982a = view;
    }

    /* renamed from: a */
    private boolean m7479a(Drawable drawable) {
        if (this.f1987f == null) {
            this.f1987f = new C0650u0();
        }
        C0650u0 c0650u0 = this.f1987f;
        c0650u0.m7262a();
        ColorStateList m8610n = C0252s.m8610n(this.f1982a);
        if (m8610n != null) {
            c0650u0.f2197d = true;
            c0650u0.f2194a = m8610n;
        }
        PorterDuff.Mode m8608o = C0252s.m8608o(this.f1982a);
        if (m8608o != null) {
            c0650u0.f2196c = true;
            c0650u0.f2195b = m8608o;
        }
        if (c0650u0.f2197d || c0650u0.f2196c) {
            C0608j.m7404i(drawable, c0650u0, this.f1982a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m7469k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1985d != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7478b() {
        Drawable background = this.f1982a.getBackground();
        if (background != null) {
            if (m7469k() && m7479a(background)) {
                return;
            }
            C0650u0 c0650u0 = this.f1986e;
            if (c0650u0 != null) {
                C0608j.m7404i(background, c0650u0, this.f1982a.getDrawableState());
                return;
            }
            C0650u0 c0650u02 = this.f1985d;
            if (c0650u02 != null) {
                C0608j.m7404i(background, c0650u02, this.f1982a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m7477c() {
        C0650u0 c0650u0 = this.f1986e;
        if (c0650u0 != null) {
            return c0650u0.f2194a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m7476d() {
        C0650u0 c0650u0 = this.f1986e;
        if (c0650u0 != null) {
            return c0650u0.f2195b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m7475e(AttributeSet attributeSet, int i) {
        C0665w0 m7213u = C0665w0.m7213u(this.f1982a.getContext(), attributeSet, C0009j.ViewBackgroundHelper, i, 0);
        try {
            if (m7213u.m7216r(C0009j.ViewBackgroundHelper_android_background)) {
                this.f1984c = m7213u.m7220n(C0009j.ViewBackgroundHelper_android_background, -1);
                ColorStateList m7407f = this.f1983b.m7407f(this.f1982a.getContext(), this.f1984c);
                if (m7407f != null) {
                    m7472h(m7407f);
                }
            }
            if (m7213u.m7216r(C0009j.ViewBackgroundHelper_backgroundTint)) {
                C0252s.m8617j0(this.f1982a, m7213u.m7231c(C0009j.ViewBackgroundHelper_backgroundTint));
            }
            if (m7213u.m7216r(C0009j.ViewBackgroundHelper_backgroundTintMode)) {
                C0252s.m8615k0(this.f1982a, C0593e0.m7465d(m7213u.m7223k(C0009j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            m7213u.m7212v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m7474f(Drawable drawable) {
        this.f1984c = -1;
        m7472h(null);
        m7478b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m7473g(int i) {
        this.f1984c = i;
        C0608j c0608j = this.f1983b;
        m7472h(c0608j != null ? c0608j.m7407f(this.f1982a.getContext(), i) : null);
        m7478b();
    }

    /* renamed from: h */
    void m7472h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1985d == null) {
                this.f1985d = new C0650u0();
            }
            C0650u0 c0650u0 = this.f1985d;
            c0650u0.f2194a = colorStateList;
            c0650u0.f2197d = true;
        } else {
            this.f1985d = null;
        }
        m7478b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m7471i(ColorStateList colorStateList) {
        if (this.f1986e == null) {
            this.f1986e = new C0650u0();
        }
        C0650u0 c0650u0 = this.f1986e;
        c0650u0.f2194a = colorStateList;
        c0650u0.f2197d = true;
        m7478b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m7470j(PorterDuff.Mode mode) {
        if (this.f1986e == null) {
            this.f1986e = new C0650u0();
        }
        C0650u0 c0650u0 = this.f1986e;
        c0650u0.f2195b = mode;
        c0650u0.f2196c = true;
        m7478b();
    }
}
