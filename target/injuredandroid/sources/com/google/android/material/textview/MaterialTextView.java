package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0674z;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p091x.C1387b;
import p054b.p059c.p060a.p075b.p091x.C1388c;
/* loaded from: classes.dex */
public class MaterialTextView extends C0674z {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int m2467h;
        if (m2468g(context)) {
            Resources.Theme theme = context.getTheme();
            if (m2465j(context, theme, attributeSet, i, i2) || (m2467h = m2467h(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            m2469f(theme, m2467h);
        }
    }

    /* renamed from: f */
    private void m2469f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C1349k.MaterialTextAppearance);
        int m2466i = m2466i(getContext(), obtainStyledAttributes, C1349k.MaterialTextAppearance_android_lineHeight, C1349k.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m2466i >= 0) {
            setLineHeight(m2466i);
        }
    }

    /* renamed from: g */
    private static boolean m2468g(Context context) {
        return C1387b.m4265b(context, C1338b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    private static int m2467h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1349k.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C1349k.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m2466i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C1388c.m4260c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    private static boolean m2465j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1349k.MaterialTextView, i, i2);
        int m2466i = m2466i(context, obtainStyledAttributes, C1349k.MaterialTextView_android_lineHeight, C1349k.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return m2466i != -1;
    }

    @Override // androidx.appcompat.widget.C0674z, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m2468g(context)) {
            m2469f(context.getTheme(), i);
        }
    }
}
