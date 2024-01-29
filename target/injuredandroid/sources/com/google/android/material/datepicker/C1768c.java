package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p091x.C1387b;
import p054b.p059c.p060a.p075b.p091x.C1388c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C1768c {

    /* renamed from: a */
    final C1767b f5196a;

    /* renamed from: b */
    final C1767b f5197b;

    /* renamed from: c */
    final C1767b f5198c;

    /* renamed from: d */
    final C1767b f5199d;

    /* renamed from: e */
    final C1767b f5200e;

    /* renamed from: f */
    final C1767b f5201f;

    /* renamed from: g */
    final C1767b f5202g;

    /* renamed from: h */
    final Paint f5203h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1768c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1387b.m4264c(context, C1338b.materialCalendarStyle, C1774h.class.getCanonicalName()), C1349k.MaterialCalendar);
        this.f5196a = C1767b.m3081a(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendar_dayStyle, 0));
        this.f5202g = C1767b.m3081a(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendar_dayInvalidStyle, 0));
        this.f5197b = C1767b.m3081a(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendar_daySelectedStyle, 0));
        this.f5198c = C1767b.m3081a(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList m4262a = C1388c.m4262a(context, obtainStyledAttributes, C1349k.MaterialCalendar_rangeFillColor);
        this.f5199d = C1767b.m3081a(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendar_yearStyle, 0));
        this.f5200e = C1767b.m3081a(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendar_yearSelectedStyle, 0));
        this.f5201f = C1767b.m3081a(context, obtainStyledAttributes.getResourceId(C1349k.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f5203h = paint;
        paint.setColor(m4262a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
