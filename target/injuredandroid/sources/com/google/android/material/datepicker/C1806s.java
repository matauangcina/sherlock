package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1774h;
import java.util.Calendar;
import java.util.Locale;
import p054b.p059c.p060a.p075b.C1346h;
import p054b.p059c.p060a.p075b.C1347i;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes.dex */
public class C1806s extends RecyclerView.AbstractC0977g<C1808b> {

    /* renamed from: c */
    private final C1774h<?> f5290c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.s$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1807a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f5291f;

        View$OnClickListenerC1807a(int i) {
            this.f5291f = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1806s.this.f5290c.m3050J1(C1795l.m2999x(this.f5291f, C1806s.this.f5290c.m3056D1().f5271h));
            C1806s.this.f5290c.m3049K1(C1774h.EnumC1785k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.s$b */
    /* loaded from: classes.dex */
    public static class C1808b extends RecyclerView.AbstractC0974d0 {

        /* renamed from: t */
        final TextView f5293t;

        C1808b(TextView textView) {
            super(textView);
            this.f5293t = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1806s(C1774h<?> c1774h) {
        this.f5290c = c1774h;
    }

    /* renamed from: v */
    private View.OnClickListener m2953v(int i) {
        return new View$OnClickListenerC1807a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0977g
    /* renamed from: c */
    public int mo2957c() {
        return this.f5290c.m3058B1().m3086q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public int m2952w(int i) {
        return i - this.f5290c.m3058B1().m3087p().f5272i;
    }

    /* renamed from: x */
    int m2951x(int i) {
        return this.f5290c.m3058B1().m3087p().f5272i + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0977g
    /* renamed from: y */
    public void mo2956j(C1808b c1808b, int i) {
        int m2951x = m2951x(i);
        String string = c1808b.f5293t.getContext().getString(C1347i.mtrl_picker_navigate_to_year_description);
        c1808b.f5293t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m2951x)));
        c1808b.f5293t.setContentDescription(String.format(string, Integer.valueOf(m2951x)));
        C1768c m3057C1 = this.f5290c.m3057C1();
        Calendar m2964i = C1805r.m2964i();
        C1767b c1767b = m2964i.get(1) == m2951x ? m3057C1.f5201f : m3057C1.f5199d;
        for (Long l : this.f5290c.m3055E1().m3073l()) {
            m2964i.setTimeInMillis(l.longValue());
            if (m2964i.get(1) == m2951x) {
                c1767b = m3057C1.f5200e;
            }
        }
        c1767b.m3078d(c1808b.f5293t);
        c1808b.f5293t.setOnClickListener(m2953v(m2951x));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0977g
    /* renamed from: z */
    public C1808b mo2955l(ViewGroup viewGroup, int i) {
        return new C1808b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1346h.mtrl_calendar_year, viewGroup, false));
    }
}
