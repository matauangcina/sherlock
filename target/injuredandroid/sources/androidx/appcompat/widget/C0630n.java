package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0775e;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public class C0630n {

    /* renamed from: a */
    private final ImageView f2117a;

    /* renamed from: b */
    private C0650u0 f2118b;

    /* renamed from: c */
    private C0650u0 f2119c;

    /* renamed from: d */
    private C0650u0 f2120d;

    public C0630n(ImageView imageView) {
        this.f2117a = imageView;
    }

    /* renamed from: a */
    private boolean m7324a(Drawable drawable) {
        if (this.f2120d == null) {
            this.f2120d = new C0650u0();
        }
        C0650u0 c0650u0 = this.f2120d;
        c0650u0.m7262a();
        ColorStateList m6652a = C0775e.m6652a(this.f2117a);
        if (m6652a != null) {
            c0650u0.f2197d = true;
            c0650u0.f2194a = m6652a;
        }
        PorterDuff.Mode m6651b = C0775e.m6651b(this.f2117a);
        if (m6651b != null) {
            c0650u0.f2196c = true;
            c0650u0.f2195b = m6651b;
        }
        if (c0650u0.f2197d || c0650u0.f2196c) {
            C0608j.m7404i(drawable, c0650u0, this.f2117a.getDrawableState());
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m7315j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f2118b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7323b() {
        Drawable drawable = this.f2117a.getDrawable();
        if (drawable != null) {
            C0593e0.m7467b(drawable);
        }
        if (drawable != null) {
            if (m7315j() && m7324a(drawable)) {
                return;
            }
            C0650u0 c0650u0 = this.f2119c;
            if (c0650u0 != null) {
                C0608j.m7404i(drawable, c0650u0, this.f2117a.getDrawableState());
                return;
            }
            C0650u0 c0650u02 = this.f2118b;
            if (c0650u02 != null) {
                C0608j.m7404i(drawable, c0650u02, this.f2117a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m7322c() {
        C0650u0 c0650u0 = this.f2119c;
        if (c0650u0 != null) {
            return c0650u0.f2194a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m7321d() {
        C0650u0 c0650u0 = this.f2119c;
        if (c0650u0 != null) {
            return c0650u0.f2195b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m7320e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f2117a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m7319f(AttributeSet attributeSet, int i) {
        int m7220n;
        C0665w0 m7213u = C0665w0.m7213u(this.f2117a.getContext(), attributeSet, C0009j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f2117a.getDrawable();
            if (drawable == null && (m7220n = m7213u.m7220n(C0009j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C0010a.m9577d(this.f2117a.getContext(), m7220n)) != null) {
                this.f2117a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0593e0.m7467b(drawable);
            }
            if (m7213u.m7216r(C0009j.AppCompatImageView_tint)) {
                C0775e.m6650c(this.f2117a, m7213u.m7231c(C0009j.AppCompatImageView_tint));
            }
            if (m7213u.m7216r(C0009j.AppCompatImageView_tintMode)) {
                C0775e.m6649d(this.f2117a, C0593e0.m7465d(m7213u.m7223k(C0009j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            m7213u.m7212v();
        }
    }

    /* renamed from: g */
    public void m7318g(int i) {
        if (i != 0) {
            Drawable m9577d = C0010a.m9577d(this.f2117a.getContext(), i);
            if (m9577d != null) {
                C0593e0.m7467b(m9577d);
            }
            this.f2117a.setImageDrawable(m9577d);
        } else {
            this.f2117a.setImageDrawable(null);
        }
        m7323b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m7317h(ColorStateList colorStateList) {
        if (this.f2119c == null) {
            this.f2119c = new C0650u0();
        }
        C0650u0 c0650u0 = this.f2119c;
        c0650u0.f2194a = colorStateList;
        c0650u0.f2197d = true;
        m7323b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m7316i(PorterDuff.Mode mode) {
        if (this.f2119c == null) {
            this.f2119c = new C0650u0();
        }
        C0650u0 c0650u0 = this.f2119c;
        c0650u0.f2195b = mode;
        c0650u0.f2196c = true;
        m7323b();
    }
}
