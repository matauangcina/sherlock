package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p052d.C0752f;
import p000a.p001a.p002k.p003a.C0010a;
/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes.dex */
public class C0665w0 {

    /* renamed from: a */
    private final Context f2233a;

    /* renamed from: b */
    private final TypedArray f2234b;

    /* renamed from: c */
    private TypedValue f2235c;

    private C0665w0(Context context, TypedArray typedArray) {
        this.f2233a = context;
        this.f2234b = typedArray;
    }

    /* renamed from: s */
    public static C0665w0 m7215s(Context context, int i, int[] iArr) {
        return new C0665w0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: t */
    public static C0665w0 m7214t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0665w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: u */
    public static C0665w0 m7213u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0665w0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m7233a(int i, boolean z) {
        return this.f2234b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m7232b(int i, int i2) {
        return this.f2234b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m7231c(int i) {
        int resourceId;
        ColorStateList m9578c;
        return (!this.f2234b.hasValue(i) || (resourceId = this.f2234b.getResourceId(i, 0)) == 0 || (m9578c = C0010a.m9578c(this.f2233a, resourceId)) == null) ? this.f2234b.getColorStateList(i) : m9578c;
    }

    /* renamed from: d */
    public float m7230d(int i, float f) {
        return this.f2234b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m7229e(int i, int i2) {
        return this.f2234b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m7228f(int i, int i2) {
        return this.f2234b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m7227g(int i) {
        int resourceId;
        return (!this.f2234b.hasValue(i) || (resourceId = this.f2234b.getResourceId(i, 0)) == 0) ? this.f2234b.getDrawable(i) : C0010a.m9577d(this.f2233a, resourceId);
    }

    /* renamed from: h */
    public Drawable m7226h(int i) {
        int resourceId;
        if (!this.f2234b.hasValue(i) || (resourceId = this.f2234b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0608j.m7411b().m7409d(this.f2233a, resourceId, true);
    }

    /* renamed from: i */
    public float m7225i(int i, float f) {
        return this.f2234b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m7224j(int i, int i2, C0752f.AbstractC0755c abstractC0755c) {
        int resourceId = this.f2234b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2235c == null) {
            this.f2235c = new TypedValue();
        }
        return C0752f.m6799f(this.f2233a, resourceId, this.f2235c, i2, abstractC0755c);
    }

    /* renamed from: k */
    public int m7223k(int i, int i2) {
        return this.f2234b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m7222l(int i, int i2) {
        return this.f2234b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m7221m(int i, int i2) {
        return this.f2234b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m7220n(int i, int i2) {
        return this.f2234b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m7219o(int i) {
        return this.f2234b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m7218p(int i) {
        return this.f2234b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m7217q(int i) {
        return this.f2234b.getTextArray(i);
    }

    /* renamed from: r */
    public boolean m7216r(int i) {
        return this.f2234b.hasValue(i);
    }

    /* renamed from: v */
    public void m7212v() {
        this.f2234b.recycle();
    }
}
