package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1774h;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.C1346h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public class C1798n extends RecyclerView.AbstractC0977g<C1800b> {

    /* renamed from: c */
    private final C1763a f5281c;

    /* renamed from: d */
    private final InterfaceC1769d<?> f5282d;

    /* renamed from: e */
    private final C1774h.InterfaceC1786l f5283e;

    /* renamed from: f */
    private final int f5284f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.n$a */
    /* loaded from: classes.dex */
    public class C1799a implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        final /* synthetic */ MaterialCalendarGridView f5285f;

        C1799a(MaterialCalendarGridView materialCalendarGridView) {
            this.f5285f = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f5285f.getAdapter2().m2985j(i)) {
                C1798n.this.f5283e.mo3035a(this.f5285f.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* loaded from: classes.dex */
    public static class C1800b extends RecyclerView.AbstractC0974d0 {

        /* renamed from: t */
        final TextView f5287t;

        /* renamed from: u */
        final MaterialCalendarGridView f5288u;

        C1800b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C1344f.month_title);
            this.f5287t = textView;
            C0252s.m8623g0(textView, true);
            this.f5288u = (MaterialCalendarGridView) linearLayout.findViewById(C1344f.month_grid);
            if (z) {
                return;
            }
            this.f5287t.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1798n(Context context, InterfaceC1769d<?> interfaceC1769d, C1763a c1763a, C1774h.InterfaceC1786l interfaceC1786l) {
        C1795l m3087p = c1763a.m3087p();
        C1795l m3090k = c1763a.m3090k();
        C1795l m3088o = c1763a.m3088o();
        if (m3087p.compareTo(m3088o) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (m3088o.compareTo(m3090k) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5284f = (C1797m.f5276j * C1774h.m3054F1(context)) + (C1787i.m3017Q1(context) ? C1774h.m3054F1(context) : 0);
        this.f5281c = c1763a;
        this.f5282d = interfaceC1769d;
        this.f5283e = interfaceC1786l;
        m5678s(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0977g
    /* renamed from: c */
    public int mo2957c() {
        return this.f5281c.m3089n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0977g
    /* renamed from: d */
    public long mo2984d(int i) {
        return this.f5281c.m3087p().m3003D(i).m3004C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C1795l m2982v(int i) {
        return this.f5281c.m3087p().m3003D(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public CharSequence m2981w(int i) {
        return m2982v(i).m3005B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m2980x(C1795l c1795l) {
        return this.f5281c.m3087p().m3002E(c1795l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0977g
    /* renamed from: y */
    public void mo2956j(C1800b c1800b, int i) {
        C1795l m3003D = this.f5281c.m3087p().m3003D(i);
        c1800b.f5287t.setText(m3003D.m3005B());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c1800b.f5288u.findViewById(C1344f.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !m3003D.equals(materialCalendarGridView.getAdapter2().f5277f)) {
            C1797m c1797m = new C1797m(m3003D, this.f5282d, this.f5281c);
            materialCalendarGridView.setNumColumns(m3003D.f5273j);
            materialCalendarGridView.setAdapter((ListAdapter) c1797m);
        } else {
            materialCalendarGridView.getAdapter2().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C1799a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0977g
    /* renamed from: z */
    public C1800b mo2955l(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1346h.mtrl_calendar_month_labeled, viewGroup, false);
        if (C1787i.m3017Q1(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C0993p(-1, this.f5284f));
            return new C1800b(linearLayout, true);
        }
        return new C1800b(linearLayout, false);
    }
}
