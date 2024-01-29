package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1044g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public class C1803q extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* loaded from: classes.dex */
    class C1804a extends C1044g {
        C1804a(C1803q c1803q, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1044g
        /* renamed from: v */
        protected float mo2973v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1803q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0988o
    /* renamed from: I1 */
    public void mo2974I1(RecyclerView recyclerView, RecyclerView.C0968a0 c0968a0, int i) {
        C1804a c1804a = new C1804a(this, recyclerView.getContext());
        c1804a.m5476p(i);
        m5632J1(c1804a);
    }
}
