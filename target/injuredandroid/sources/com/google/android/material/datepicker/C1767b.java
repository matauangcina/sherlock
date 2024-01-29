package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import p000a.p019g.p027j.C0194i;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p091x.C1388c;
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
final class C1767b {

    /* renamed from: a */
    private final Rect f5190a;

    /* renamed from: b */
    private final ColorStateList f5191b;

    /* renamed from: c */
    private final ColorStateList f5192c;

    /* renamed from: d */
    private final ColorStateList f5193d;

    /* renamed from: e */
    private final int f5194e;

    /* renamed from: f */
    private final C1322k f5195f;

    private C1767b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1322k c1322k, Rect rect) {
        C0194i.m8867b(rect.left);
        C0194i.m8867b(rect.top);
        C0194i.m8867b(rect.right);
        C0194i.m8867b(rect.bottom);
        this.f5190a = rect;
        this.f5191b = colorStateList2;
        this.f5192c = colorStateList;
        this.f5193d = colorStateList3;
        this.f5194e = i;
        this.f5195f = c1322k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1767b m3081a(Context context, int i) {
        C0194i.m8868a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1349k.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C1349k.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C1349k.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C1349k.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C1349k.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList m4262a = C1388c.m4262a(context, obtainStyledAttributes, C1349k.MaterialCalendarItem_itemFillColor);
        ColorStateList m4262a2 = C1388c.m4262a(context, obtainStyledAttributes, C1349k.MaterialCalendarItem_itemTextColor);
        ColorStateList m4262a3 = C1388c.m4262a(context, obtainStyledAttributes, C1349k.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1349k.MaterialCalendarItem_itemStrokeWidth, 0);
        C1322k m4457m = C1322k.m4497b(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C1349k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m4457m();
        obtainStyledAttributes.recycle();
        return new C1767b(m4262a, m4262a2, m4262a3, dimensionPixelSize, m4457m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m3080b() {
        return this.f5190a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m3079c() {
        return this.f5190a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m3078d(TextView textView) {
        C1315g c1315g = new C1315g();
        C1315g c1315g2 = new C1315g();
        c1315g.setShapeAppearanceModel(this.f5195f);
        c1315g2.setShapeAppearanceModel(this.f5195f);
        c1315g.m4544T(this.f5192c);
        c1315g.m4537a0(this.f5194e, this.f5193d);
        textView.setTextColor(this.f5191b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f5191b.withAlpha(30), c1315g, c1315g2) : c1315g;
        Rect rect = this.f5190a;
        C0252s.m8619i0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
