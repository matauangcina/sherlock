package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.p088u.InterfaceC1381a;
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0693c<View> {

    /* renamed from: a */
    private int f5722a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnPreDrawListenerC1923a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ View f5723f;

        /* renamed from: g */
        final /* synthetic */ int f5724g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC1381a f5725h;

        ViewTreeObserver$OnPreDrawListenerC1923a(View view, int i, InterfaceC1381a interfaceC1381a) {
            this.f5723f = view;
            this.f5724g = i;
            this.f5725h = interfaceC1381a;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f5723f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f5722a == this.f5724g) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC1381a interfaceC1381a = this.f5725h;
                expandableBehavior.mo2432H((View) interfaceC1381a, this.f5723f, interfaceC1381a.mo2926a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f5722a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5722a = 0;
    }

    /* renamed from: F */
    private boolean m2463F(boolean z) {
        if (!z) {
            return this.f5722a == 1;
        }
        int i = this.f5722a;
        return i == 0 || i == 2;
    }

    /* renamed from: G */
    protected InterfaceC1381a m2462G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> m7055r = coordinatorLayout.m7055r(view);
        int size = m7055r.size();
        for (int i = 0; i < size; i++) {
            View view2 = m7055r.get(i);
            if (mo2433e(coordinatorLayout, view, view2)) {
                return (InterfaceC1381a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo2432H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: h */
    public boolean mo2461h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC1381a interfaceC1381a = (InterfaceC1381a) view2;
        if (m2463F(interfaceC1381a.mo2926a())) {
            this.f5722a = interfaceC1381a.mo2926a() ? 1 : 2;
            return mo2432H((View) interfaceC1381a, view, interfaceC1381a.mo2926a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: l */
    public boolean mo2460l(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC1381a m2462G;
        if (C0252s.m8650M(view) || (m2462G = m2462G(coordinatorLayout, view)) == null || !m2463F(m2462G.mo2926a())) {
            return false;
        }
        int i2 = m2462G.mo2926a() ? 1 : 2;
        this.f5722a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC1923a(view, i2, m2462G));
        return false;
    }
}
