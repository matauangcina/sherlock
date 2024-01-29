package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.p052d.C0752f;
import androidx.core.widget.C0779i;
import androidx.core.widget.InterfaceC0772b;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p000a.p001a.C0009j;
/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
class C0670y {

    /* renamed from: a */
    private final TextView f2260a;

    /* renamed from: b */
    private C0650u0 f2261b;

    /* renamed from: c */
    private C0650u0 f2262c;

    /* renamed from: d */
    private C0650u0 f2263d;

    /* renamed from: e */
    private C0650u0 f2264e;

    /* renamed from: f */
    private C0650u0 f2265f;

    /* renamed from: g */
    private C0650u0 f2266g;

    /* renamed from: h */
    private C0650u0 f2267h;

    /* renamed from: i */
    private final C0574a0 f2268i;

    /* renamed from: j */
    private int f2269j = 0;

    /* renamed from: k */
    private int f2270k = -1;

    /* renamed from: l */
    private Typeface f2271l;

    /* renamed from: m */
    private boolean f2272m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.y$a */
    /* loaded from: classes.dex */
    public static class C0671a extends C0752f.AbstractC0755c {

        /* renamed from: a */
        private final WeakReference<C0670y> f2273a;

        /* renamed from: b */
        private final int f2274b;

        /* renamed from: c */
        private final int f2275c;

        /* renamed from: androidx.appcompat.widget.y$a$a */
        /* loaded from: classes.dex */
        private class RunnableC0672a implements Runnable {

            /* renamed from: f */
            private final WeakReference<C0670y> f2276f;

            /* renamed from: g */
            private final Typeface f2277g;

            RunnableC0672a(C0671a c0671a, WeakReference<C0670y> weakReference, Typeface typeface) {
                this.f2276f = weakReference;
                this.f2277g = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0670y c0670y = this.f2276f.get();
                if (c0670y == null) {
                    return;
                }
                c0670y.m7168B(this.f2277g);
            }
        }

        C0671a(C0670y c0670y, int i, int i2) {
            this.f2273a = new WeakReference<>(c0670y);
            this.f2274b = i;
            this.f2275c = i2;
        }

        @Override // androidx.core.content.p052d.C0752f.AbstractC0755c
        /* renamed from: d */
        public void mo4245d(int i) {
        }

        @Override // androidx.core.content.p052d.C0752f.AbstractC0755c
        /* renamed from: e */
        public void mo4244e(Typeface typeface) {
            int i;
            C0670y c0670y = this.f2273a.get();
            if (c0670y == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f2274b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f2275c & 2) != 0);
            }
            c0670y.m7150q(new RunnableC0672a(this, this.f2273a, typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0670y(TextView textView) {
        this.f2260a = textView;
        this.f2268i = new C0574a0(this.f2260a);
    }

    /* renamed from: A */
    private void m7169A(int i, float f) {
        this.f2268i.m7537y(i, f);
    }

    /* renamed from: C */
    private void m7167C(Context context, C0665w0 c0665w0) {
        String m7219o;
        Typeface create;
        Typeface typeface;
        this.f2269j = c0665w0.m7223k(C0009j.TextAppearance_android_textStyle, this.f2269j);
        if (Build.VERSION.SDK_INT >= 28) {
            int m7223k = c0665w0.m7223k(C0009j.TextAppearance_android_textFontWeight, -1);
            this.f2270k = m7223k;
            if (m7223k != -1) {
                this.f2269j = (this.f2269j & 2) | 0;
            }
        }
        if (!c0665w0.m7216r(C0009j.TextAppearance_android_fontFamily) && !c0665w0.m7216r(C0009j.TextAppearance_fontFamily)) {
            if (c0665w0.m7216r(C0009j.TextAppearance_android_typeface)) {
                this.f2272m = false;
                int m7223k2 = c0665w0.m7223k(C0009j.TextAppearance_android_typeface, 1);
                if (m7223k2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m7223k2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m7223k2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f2271l = typeface;
                return;
            }
            return;
        }
        this.f2271l = null;
        int i = c0665w0.m7216r(C0009j.TextAppearance_fontFamily) ? C0009j.TextAppearance_fontFamily : C0009j.TextAppearance_android_fontFamily;
        int i2 = this.f2270k;
        int i3 = this.f2269j;
        if (!context.isRestricted()) {
            try {
                Typeface m7224j = c0665w0.m7224j(i, this.f2269j, new C0671a(this, i2, i3));
                if (m7224j != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.f2270k != -1) {
                        m7224j = Typeface.create(Typeface.create(m7224j, 0), this.f2270k, (this.f2269j & 2) != 0);
                    }
                    this.f2271l = m7224j;
                }
                this.f2272m = this.f2271l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2271l != null || (m7219o = c0665w0.m7219o(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2270k == -1) {
            create = Typeface.create(m7219o, this.f2269j);
        } else {
            create = Typeface.create(Typeface.create(m7219o, 0), this.f2270k, (this.f2269j & 2) != 0);
        }
        this.f2271l = create;
    }

    /* renamed from: a */
    private void m7166a(Drawable drawable, C0650u0 c0650u0) {
        if (drawable == null || c0650u0 == null) {
            return;
        }
        C0608j.m7404i(drawable, c0650u0, this.f2260a.getDrawableState());
    }

    /* renamed from: d */
    private static C0650u0 m7163d(Context context, C0608j c0608j, int i) {
        ColorStateList m7407f = c0608j.m7407f(context, i);
        if (m7407f != null) {
            C0650u0 c0650u0 = new C0650u0();
            c0650u0.f2197d = true;
            c0650u0.f2194a = m7407f;
            return c0650u0;
        }
        return null;
    }

    /* renamed from: x */
    private void m7143x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (Build.VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f2260a.getCompoundDrawablesRelative();
            TextView textView = this.f2260a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f2260a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f2260a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f2260a.getCompoundDrawables();
            TextView textView3 = this.f2260a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: y */
    private void m7142y() {
        C0650u0 c0650u0 = this.f2267h;
        this.f2261b = c0650u0;
        this.f2262c = c0650u0;
        this.f2263d = c0650u0;
        this.f2264e = c0650u0;
        this.f2265f = c0650u0;
        this.f2266g = c0650u0;
    }

    /* renamed from: B */
    public void m7168B(Typeface typeface) {
        if (this.f2272m) {
            this.f2260a.setTypeface(typeface);
            this.f2271l = typeface;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7165b() {
        if (this.f2261b != null || this.f2262c != null || this.f2263d != null || this.f2264e != null) {
            Drawable[] compoundDrawables = this.f2260a.getCompoundDrawables();
            m7166a(compoundDrawables[0], this.f2261b);
            m7166a(compoundDrawables[1], this.f2262c);
            m7166a(compoundDrawables[2], this.f2263d);
            m7166a(compoundDrawables[3], this.f2264e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f2265f == null && this.f2266g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f2260a.getCompoundDrawablesRelative();
            m7166a(compoundDrawablesRelative[0], this.f2265f);
            m7166a(compoundDrawablesRelative[2], this.f2266g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m7164c() {
        this.f2268i.m7560b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m7162e() {
        return this.f2268i.m7552j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m7161f() {
        return this.f2268i.m7551k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m7160g() {
        return this.f2268i.m7550l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] m7159h() {
        return this.f2268i.m7549m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m7158i() {
        return this.f2268i.m7548n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m7157j() {
        C0650u0 c0650u0 = this.f2267h;
        if (c0650u0 != null) {
            return c0650u0.f2194a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode m7156k() {
        C0650u0 c0650u0 = this.f2267h;
        if (c0650u0 != null) {
            return c0650u0.f2195b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m7155l() {
        return this.f2268i.m7543s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m7154m(AttributeSet attributeSet, int i) {
        String str;
        ColorStateList colorStateList;
        String str2;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        ColorStateList colorStateList3;
        C0608j c0608j;
        int i2;
        Context context = this.f2260a.getContext();
        C0608j m7411b = C0608j.m7411b();
        C0665w0 m7213u = C0665w0.m7213u(context, attributeSet, C0009j.AppCompatTextHelper, i, 0);
        int m7220n = m7213u.m7220n(C0009j.AppCompatTextHelper_android_textAppearance, -1);
        if (m7213u.m7216r(C0009j.AppCompatTextHelper_android_drawableLeft)) {
            this.f2261b = m7163d(context, m7411b, m7213u.m7220n(C0009j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (m7213u.m7216r(C0009j.AppCompatTextHelper_android_drawableTop)) {
            this.f2262c = m7163d(context, m7411b, m7213u.m7220n(C0009j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (m7213u.m7216r(C0009j.AppCompatTextHelper_android_drawableRight)) {
            this.f2263d = m7163d(context, m7411b, m7213u.m7220n(C0009j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (m7213u.m7216r(C0009j.AppCompatTextHelper_android_drawableBottom)) {
            this.f2264e = m7163d(context, m7411b, m7213u.m7220n(C0009j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (m7213u.m7216r(C0009j.AppCompatTextHelper_android_drawableStart)) {
                this.f2265f = m7163d(context, m7411b, m7213u.m7220n(C0009j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (m7213u.m7216r(C0009j.AppCompatTextHelper_android_drawableEnd)) {
                this.f2266g = m7163d(context, m7411b, m7213u.m7220n(C0009j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        m7213u.m7212v();
        boolean z3 = this.f2260a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m7220n != -1) {
            C0665w0 m7215s = C0665w0.m7215s(context, m7220n, C0009j.TextAppearance);
            if (z3 || !m7215s.m7216r(C0009j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = m7215s.m7233a(C0009j.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m7167C(context, m7215s);
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList3 = m7215s.m7216r(C0009j.TextAppearance_android_textColor) ? m7215s.m7231c(C0009j.TextAppearance_android_textColor) : null;
                colorStateList = m7215s.m7216r(C0009j.TextAppearance_android_textColorHint) ? m7215s.m7231c(C0009j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = m7215s.m7216r(C0009j.TextAppearance_android_textColorLink) ? m7215s.m7231c(C0009j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList = null;
                colorStateList2 = null;
                colorStateList3 = null;
            }
            str = m7215s.m7216r(C0009j.TextAppearance_textLocale) ? m7215s.m7219o(C0009j.TextAppearance_textLocale) : null;
            str2 = (Build.VERSION.SDK_INT < 26 || !m7215s.m7216r(C0009j.TextAppearance_fontVariationSettings)) ? null : m7215s.m7219o(C0009j.TextAppearance_fontVariationSettings);
            m7215s.m7212v();
        } else {
            str = null;
            colorStateList = null;
            str2 = null;
            colorStateList2 = null;
            z = false;
            z2 = false;
            colorStateList3 = null;
        }
        C0665w0 m7213u2 = C0665w0.m7213u(context, attributeSet, C0009j.TextAppearance, i, 0);
        if (!z3 && m7213u2.m7216r(C0009j.TextAppearance_textAllCaps)) {
            z = m7213u2.m7233a(C0009j.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (m7213u2.m7216r(C0009j.TextAppearance_android_textColor)) {
                colorStateList3 = m7213u2.m7231c(C0009j.TextAppearance_android_textColor);
            }
            if (m7213u2.m7216r(C0009j.TextAppearance_android_textColorHint)) {
                colorStateList = m7213u2.m7231c(C0009j.TextAppearance_android_textColorHint);
            }
            if (m7213u2.m7216r(C0009j.TextAppearance_android_textColorLink)) {
                colorStateList2 = m7213u2.m7231c(C0009j.TextAppearance_android_textColorLink);
            }
        }
        if (m7213u2.m7216r(C0009j.TextAppearance_textLocale)) {
            str = m7213u2.m7219o(C0009j.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 26 && m7213u2.m7216r(C0009j.TextAppearance_fontVariationSettings)) {
            str2 = m7213u2.m7219o(C0009j.TextAppearance_fontVariationSettings);
        }
        if (Build.VERSION.SDK_INT >= 28 && m7213u2.m7216r(C0009j.TextAppearance_android_textSize) && m7213u2.m7228f(C0009j.TextAppearance_android_textSize, -1) == 0) {
            c0608j = m7411b;
            this.f2260a.setTextSize(0, 0.0f);
        } else {
            c0608j = m7411b;
        }
        m7167C(context, m7213u2);
        m7213u2.m7212v();
        if (colorStateList3 != null) {
            this.f2260a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f2260a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f2260a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z2) {
            m7149r(z);
        }
        Typeface typeface = this.f2271l;
        if (typeface != null) {
            if (this.f2270k == -1) {
                this.f2260a.setTypeface(typeface, this.f2269j);
            } else {
                this.f2260a.setTypeface(typeface);
            }
        }
        if (str2 != null) {
            this.f2260a.setFontVariationSettings(str2);
        }
        if (str != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24) {
                this.f2260a.setTextLocales(LocaleList.forLanguageTags(str));
            } else if (i3 >= 21) {
                this.f2260a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
            }
        }
        this.f2268i.m7542t(attributeSet, i);
        if (InterfaceC0772b.f2763a && this.f2268i.m7548n() != 0) {
            int[] m7549m = this.f2268i.m7549m();
            if (m7549m.length > 0) {
                if (this.f2260a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f2260a.setAutoSizeTextTypeUniformWithConfiguration(this.f2268i.m7551k(), this.f2268i.m7552j(), this.f2268i.m7550l(), 0);
                } else {
                    this.f2260a.setAutoSizeTextTypeUniformWithPresetSizes(m7549m, 0);
                }
            }
        }
        C0665w0 m7214t = C0665w0.m7214t(context, attributeSet, C0009j.AppCompatTextView);
        int m7220n2 = m7214t.m7220n(C0009j.AppCompatTextView_drawableLeftCompat, -1);
        C0608j c0608j2 = c0608j;
        Drawable m7410c = m7220n2 != -1 ? c0608j2.m7410c(context, m7220n2) : null;
        int m7220n3 = m7214t.m7220n(C0009j.AppCompatTextView_drawableTopCompat, -1);
        Drawable m7410c2 = m7220n3 != -1 ? c0608j2.m7410c(context, m7220n3) : null;
        int m7220n4 = m7214t.m7220n(C0009j.AppCompatTextView_drawableRightCompat, -1);
        Drawable m7410c3 = m7220n4 != -1 ? c0608j2.m7410c(context, m7220n4) : null;
        int m7220n5 = m7214t.m7220n(C0009j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable m7410c4 = m7220n5 != -1 ? c0608j2.m7410c(context, m7220n5) : null;
        int m7220n6 = m7214t.m7220n(C0009j.AppCompatTextView_drawableStartCompat, -1);
        Drawable m7410c5 = m7220n6 != -1 ? c0608j2.m7410c(context, m7220n6) : null;
        int m7220n7 = m7214t.m7220n(C0009j.AppCompatTextView_drawableEndCompat, -1);
        m7143x(m7410c, m7410c2, m7410c3, m7410c4, m7410c5, m7220n7 != -1 ? c0608j2.m7410c(context, m7220n7) : null);
        if (m7214t.m7216r(C0009j.AppCompatTextView_drawableTint)) {
            C0779i.m6635g(this.f2260a, m7214t.m7231c(C0009j.AppCompatTextView_drawableTint));
        }
        if (m7214t.m7216r(C0009j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            C0779i.m6634h(this.f2260a, C0593e0.m7465d(m7214t.m7223k(C0009j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i2 = -1;
        }
        int m7228f = m7214t.m7228f(C0009j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int m7228f2 = m7214t.m7228f(C0009j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int m7228f3 = m7214t.m7228f(C0009j.AppCompatTextView_lineHeight, i2);
        m7214t.m7212v();
        if (m7228f != i2) {
            C0779i.m6632j(this.f2260a, m7228f);
        }
        if (m7228f2 != i2) {
            C0779i.m6631k(this.f2260a, m7228f2);
        }
        if (m7228f3 != i2) {
            C0779i.m6630l(this.f2260a, m7228f3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m7153n(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC0772b.f2763a) {
            return;
        }
        m7164c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m7152o() {
        m7165b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m7151p(Context context, int i) {
        String m7219o;
        ColorStateList m7231c;
        C0665w0 m7215s = C0665w0.m7215s(context, i, C0009j.TextAppearance);
        if (m7215s.m7216r(C0009j.TextAppearance_textAllCaps)) {
            m7149r(m7215s.m7233a(C0009j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && m7215s.m7216r(C0009j.TextAppearance_android_textColor) && (m7231c = m7215s.m7231c(C0009j.TextAppearance_android_textColor)) != null) {
            this.f2260a.setTextColor(m7231c);
        }
        if (m7215s.m7216r(C0009j.TextAppearance_android_textSize) && m7215s.m7228f(C0009j.TextAppearance_android_textSize, -1) == 0) {
            this.f2260a.setTextSize(0, 0.0f);
        }
        m7167C(context, m7215s);
        if (Build.VERSION.SDK_INT >= 26 && m7215s.m7216r(C0009j.TextAppearance_fontVariationSettings) && (m7219o = m7215s.m7219o(C0009j.TextAppearance_fontVariationSettings)) != null) {
            this.f2260a.setFontVariationSettings(m7219o);
        }
        m7215s.m7212v();
        Typeface typeface = this.f2271l;
        if (typeface != null) {
            this.f2260a.setTypeface(typeface, this.f2269j);
        }
    }

    /* renamed from: q */
    public void m7150q(Runnable runnable) {
        this.f2260a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m7149r(boolean z) {
        this.f2260a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m7148s(int i, int i2, int i3, int i4) {
        this.f2268i.m7541u(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m7147t(int[] iArr, int i) {
        this.f2268i.m7540v(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m7146u(int i) {
        this.f2268i.m7539w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m7145v(ColorStateList colorStateList) {
        if (this.f2267h == null) {
            this.f2267h = new C0650u0();
        }
        C0650u0 c0650u0 = this.f2267h;
        c0650u0.f2194a = colorStateList;
        c0650u0.f2197d = colorStateList != null;
        m7142y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m7144w(PorterDuff.Mode mode) {
        if (this.f2267h == null) {
            this.f2267h = new C0650u0();
        }
        C0650u0 c0650u0 = this.f2267h;
        c0650u0.f2195b = mode;
        c0650u0.f2196c = mode != null;
        m7142y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m7141z(int i, float f) {
        if (InterfaceC0772b.f2763a || m7155l()) {
            return;
        }
        m7169A(i, f);
    }
}
