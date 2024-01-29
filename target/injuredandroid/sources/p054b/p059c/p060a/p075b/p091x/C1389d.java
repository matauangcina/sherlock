package p054b.p059c.p060a.p075b.p091x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p052d.C0752f;
import p054b.p059c.p060a.p075b.C1349k;
/* renamed from: b.c.a.b.x.d */
/* loaded from: classes.dex */
public class C1389d {

    /* renamed from: a */
    public final float f4294a;

    /* renamed from: b */
    public final ColorStateList f4295b;

    /* renamed from: c */
    public final int f4296c;

    /* renamed from: d */
    public final int f4297d;

    /* renamed from: e */
    public final String f4298e;

    /* renamed from: f */
    public final ColorStateList f4299f;

    /* renamed from: g */
    public final float f4300g;

    /* renamed from: h */
    public final float f4301h;

    /* renamed from: i */
    public final float f4302i;

    /* renamed from: j */
    private final int f4303j;

    /* renamed from: k */
    private boolean f4304k = false;

    /* renamed from: l */
    private Typeface f4305l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.x.d$a */
    /* loaded from: classes.dex */
    public class C1390a extends C0752f.AbstractC0755c {

        /* renamed from: a */
        final /* synthetic */ AbstractC1393f f4306a;

        C1390a(AbstractC1393f abstractC1393f) {
            this.f4306a = abstractC1393f;
        }

        @Override // androidx.core.content.p052d.C0752f.AbstractC0755c
        /* renamed from: d */
        public void mo4245d(int i) {
            C1389d.this.f4304k = true;
            this.f4306a.mo2727a(i);
        }

        @Override // androidx.core.content.p052d.C0752f.AbstractC0755c
        /* renamed from: e */
        public void mo4244e(Typeface typeface) {
            C1389d c1389d = C1389d.this;
            c1389d.f4305l = Typeface.create(typeface, c1389d.f4296c);
            C1389d.this.f4304k = true;
            this.f4306a.mo2726b(C1389d.this.f4305l, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.c.a.b.x.d$b */
    /* loaded from: classes.dex */
    public class C1391b extends AbstractC1393f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f4308a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1393f f4309b;

        C1391b(TextPaint textPaint, AbstractC1393f abstractC1393f) {
            this.f4308a = textPaint;
            this.f4309b = abstractC1393f;
        }

        @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
        /* renamed from: a */
        public void mo2727a(int i) {
            this.f4309b.mo2727a(i);
        }

        @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
        /* renamed from: b */
        public void mo2726b(Typeface typeface, boolean z) {
            C1389d.this.m4246k(this.f4308a, typeface);
            this.f4309b.mo2726b(typeface, z);
        }
    }

    public C1389d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1349k.TextAppearance);
        this.f4294a = obtainStyledAttributes.getDimension(C1349k.TextAppearance_android_textSize, 0.0f);
        this.f4295b = C1388c.m4262a(context, obtainStyledAttributes, C1349k.TextAppearance_android_textColor);
        C1388c.m4262a(context, obtainStyledAttributes, C1349k.TextAppearance_android_textColorHint);
        C1388c.m4262a(context, obtainStyledAttributes, C1349k.TextAppearance_android_textColorLink);
        this.f4296c = obtainStyledAttributes.getInt(C1349k.TextAppearance_android_textStyle, 0);
        this.f4297d = obtainStyledAttributes.getInt(C1349k.TextAppearance_android_typeface, 1);
        int m4258e = C1388c.m4258e(obtainStyledAttributes, C1349k.TextAppearance_fontFamily, C1349k.TextAppearance_android_fontFamily);
        this.f4303j = obtainStyledAttributes.getResourceId(m4258e, 0);
        this.f4298e = obtainStyledAttributes.getString(m4258e);
        obtainStyledAttributes.getBoolean(C1349k.TextAppearance_textAllCaps, false);
        this.f4299f = C1388c.m4262a(context, obtainStyledAttributes, C1349k.TextAppearance_android_shadowColor);
        this.f4300g = obtainStyledAttributes.getFloat(C1349k.TextAppearance_android_shadowDx, 0.0f);
        this.f4301h = obtainStyledAttributes.getFloat(C1349k.TextAppearance_android_shadowDy, 0.0f);
        this.f4302i = obtainStyledAttributes.getFloat(C1349k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m4253d() {
        String str;
        if (this.f4305l == null && (str = this.f4298e) != null) {
            this.f4305l = Typeface.create(str, this.f4296c);
        }
        if (this.f4305l == null) {
            int i = this.f4297d;
            this.f4305l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f4305l = Typeface.create(this.f4305l, this.f4296c);
        }
    }

    /* renamed from: e */
    public Typeface m4252e() {
        m4253d();
        return this.f4305l;
    }

    /* renamed from: f */
    public Typeface m4251f(Context context) {
        if (this.f4304k) {
            return this.f4305l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m6800e = C0752f.m6800e(context, this.f4303j);
                this.f4305l = m6800e;
                if (m6800e != null) {
                    this.f4305l = Typeface.create(m6800e, this.f4296c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f4298e, e);
            }
        }
        m4253d();
        this.f4304k = true;
        return this.f4305l;
    }

    /* renamed from: g */
    public void m4250g(Context context, TextPaint textPaint, AbstractC1393f abstractC1393f) {
        m4246k(textPaint, m4252e());
        m4249h(context, new C1391b(textPaint, abstractC1393f));
    }

    /* renamed from: h */
    public void m4249h(Context context, AbstractC1393f abstractC1393f) {
        if (C1392e.m4243a()) {
            m4251f(context);
        } else {
            m4253d();
        }
        if (this.f4303j == 0) {
            this.f4304k = true;
        }
        if (this.f4304k) {
            abstractC1393f.mo2726b(this.f4305l, true);
            return;
        }
        try {
            C0752f.m6798g(context, this.f4303j, new C1390a(abstractC1393f), null);
        } catch (Resources.NotFoundException unused) {
            this.f4304k = true;
            abstractC1393f.mo2727a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f4298e, e);
            this.f4304k = true;
            abstractC1393f.mo2727a(-3);
        }
    }

    /* renamed from: i */
    public void m4248i(Context context, TextPaint textPaint, AbstractC1393f abstractC1393f) {
        m4247j(context, textPaint, abstractC1393f);
        ColorStateList colorStateList = this.f4295b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f4302i;
        float f2 = this.f4300g;
        float f3 = this.f4301h;
        ColorStateList colorStateList2 = this.f4299f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: j */
    public void m4247j(Context context, TextPaint textPaint, AbstractC1393f abstractC1393f) {
        if (C1392e.m4243a()) {
            m4246k(textPaint, m4251f(context));
        } else {
            m4250g(context, textPaint, abstractC1393f);
        }
    }

    /* renamed from: k */
    public void m4246k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f4296c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4294a);
    }
}
