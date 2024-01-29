package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
public class C1723c<V extends View> extends CoordinatorLayout.AbstractC0693c<V> {

    /* renamed from: a */
    private C1724d f4925a;

    /* renamed from: b */
    private int f4926b;

    /* renamed from: c */
    private int f4927c;

    public C1723c() {
        this.f4926b = 0;
        this.f4927c = 0;
    }

    public C1723c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4926b = 0;
        this.f4927c = 0;
    }

    /* renamed from: E */
    public int m3449E() {
        C1724d c1724d = this.f4925a;
        if (c1724d != null) {
            return c1724d.m3445b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo3448F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m7082I(v, i);
    }

    /* renamed from: G */
    public boolean m3447G(int i) {
        C1724d c1724d = this.f4925a;
        if (c1724d != null) {
            return c1724d.m3442e(i);
        }
        this.f4926b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: l */
    public boolean mo2460l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo3448F(coordinatorLayout, v, i);
        if (this.f4925a == null) {
            this.f4925a = new C1724d(v);
        }
        this.f4925a.m3444c();
        this.f4925a.m3446a();
        int i2 = this.f4926b;
        if (i2 != 0) {
            this.f4925a.m3442e(i2);
            this.f4926b = 0;
        }
        int i3 = this.f4927c;
        if (i3 != 0) {
            this.f4925a.m3443d(i3);
            this.f4927c = 0;
            return true;
        }
        return true;
    }
}
