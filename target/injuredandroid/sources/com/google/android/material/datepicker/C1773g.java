package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p054b.p059c.p060a.p075b.C1346h;
import p054b.p059c.p060a.p075b.C1347i;
/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
class C1773g extends BaseAdapter {

    /* renamed from: i */
    private static final int f5205i;

    /* renamed from: f */
    private final Calendar f5206f;

    /* renamed from: g */
    private final int f5207g;

    /* renamed from: h */
    private final int f5208h;

    static {
        f5205i = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C1773g() {
        Calendar m2962k = C1805r.m2962k();
        this.f5206f = m2962k;
        this.f5207g = m2962k.getMaximum(7);
        this.f5208h = this.f5206f.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m3060b(int i) {
        int i2 = i + this.f5208h;
        int i3 = this.f5207g;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f5207g) {
            return null;
        }
        return Integer.valueOf(m3060b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5207g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1346h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f5206f.set(7, m3060b(i));
        textView.setText(this.f5206f.getDisplayName(7, f5205i, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C1347i.mtrl_picker_day_of_week_column_header), this.f5206f.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
