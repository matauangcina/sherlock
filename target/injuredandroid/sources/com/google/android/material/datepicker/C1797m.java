package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public class C1797m extends BaseAdapter {

    /* renamed from: j */
    static final int f5276j = C1805r.m2962k().getMaximum(4);

    /* renamed from: f */
    final C1795l f5277f;

    /* renamed from: g */
    final InterfaceC1769d<?> f5278g;

    /* renamed from: h */
    C1768c f5279h;

    /* renamed from: i */
    final C1763a f5280i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1797m(C1795l c1795l, InterfaceC1769d<?> interfaceC1769d, C1763a c1763a) {
        this.f5277f = c1795l;
        this.f5278g = interfaceC1769d;
        this.f5280i = c1763a;
    }

    /* renamed from: e */
    private void m2990e(Context context) {
        if (this.f5279h == null) {
            this.f5279h = new C1768c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m2994a(int i) {
        return m2993b() + (i - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m2993b() {
        return this.f5277f.m2997z();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f5277f.m2997z() || i > m2987h()) {
            return null;
        }
        return Long.valueOf(this.f5277f.m3006A(m2986i(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m2990e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p054b.p059c.p060a.p075b.C1346h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m2993b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L5e
            com.google.android.material.datepicker.l r2 = r5.f5277f
            int r3 = r2.f5274k
            if (r7 < r3) goto L2e
            goto L5e
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f5277f
            long r2 = r2.m3006A(r7)
            com.google.android.material.datepicker.l r7 = r5.f5277f
            int r7 = r7.f5272i
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C1795l.m3001F()
            int r4 = r4.f5272i
            if (r7 != r4) goto L50
            java.lang.String r7 = com.google.android.material.datepicker.C1770e.m3069a(r2)
            goto L54
        L50:
            java.lang.String r7 = com.google.android.material.datepicker.C1770e.m3067c(r2)
        L54:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L66
        L5e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            return r0
        L6d:
            com.google.android.material.datepicker.a r7 = r5.f5280i
            com.google.android.material.datepicker.a$c r7 = r7.m3091j()
            long r2 = r6.longValue()
            boolean r7 = r7.mo3064g(r2)
            if (r7 == 0) goto Lcc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f5278g
            java.util.Collection r7 = r7.m3073l()
            java.util.Iterator r7 = r7.iterator()
        L8a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.C1805r.m2972a(r3)
            long r1 = com.google.android.material.datepicker.C1805r.m2972a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8a
            com.google.android.material.datepicker.c r6 = r5.f5279h
            com.google.android.material.datepicker.b r6 = r6.f5197b
        Lae:
            r6.m3078d(r0)
            return r0
        Lb2:
            java.util.Calendar r7 = com.google.android.material.datepicker.C1805r.m2964i()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lc7
            com.google.android.material.datepicker.c r6 = r5.f5279h
            com.google.android.material.datepicker.b r6 = r6.f5198c
            goto Lae
        Lc7:
            com.google.android.material.datepicker.c r6 = r5.f5279h
            com.google.android.material.datepicker.b r6 = r6.f5196a
            goto Lae
        Lcc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f5279h
            com.google.android.material.datepicker.b r6 = r6.f5202g
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C1797m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m2989f(int i) {
        return i % this.f5277f.f5273j == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m2988g(int i) {
        return (i + 1) % this.f5277f.f5273j == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5277f.f5274k + m2993b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f5277f.f5273j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m2987h() {
        return (this.f5277f.m2997z() + this.f5277f.f5274k) - 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    int m2986i(int i) {
        return (i - this.f5277f.m2997z()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m2985j(int i) {
        return i >= m2993b() && i <= m2987h();
    }
}
