package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.p019g.p023f.C0142a;
import p000a.p019g.p028k.C0197a0;
import p000a.p019g.p028k.C0236d;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
public abstract class AbstractC1722b extends C1723c<View> {

    /* renamed from: d */
    final Rect f4921d;

    /* renamed from: e */
    final Rect f4922e;

    /* renamed from: f */
    private int f4923f;

    /* renamed from: g */
    private int f4924g;

    public AbstractC1722b() {
        this.f4921d = new Rect();
        this.f4922e = new Rect();
        this.f4923f = 0;
    }

    public AbstractC1722b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4921d = new Rect();
        this.f4922e = new Rect();
        this.f4923f = 0;
    }

    /* renamed from: N */
    private static int m3453N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.C1723c
    /* renamed from: F */
    public void mo3448F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View mo3459H = mo3459H(coordinatorLayout.m7055r(view));
        if (mo3459H != null) {
            CoordinatorLayout.C0696f c0696f = (CoordinatorLayout.C0696f) view.getLayoutParams();
            Rect rect = this.f4921d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0696f).leftMargin, mo3459H.getBottom() + ((ViewGroup.MarginLayoutParams) c0696f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0696f).rightMargin, ((coordinatorLayout.getHeight() + mo3459H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0696f).bottomMargin);
            C0197a0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0252s.m8598t(coordinatorLayout) && !C0252s.m8598t(view)) {
                rect.left += lastWindowInsets.m8852i();
                rect.right -= lastWindowInsets.m8851j();
            }
            Rect rect2 = this.f4922e;
            C0236d.m8707a(m3453N(c0696f.f2508c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int m3458I = m3458I(mo3459H);
            view.layout(rect2.left, rect2.top - m3458I, rect2.right, rect2.bottom - m3458I);
            i2 = rect2.top - mo3459H.getBottom();
        } else {
            super.mo3448F(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f4923f = i2;
    }

    /* renamed from: H */
    abstract View mo3459H(List<View> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final int m3458I(View view) {
        if (this.f4924g == 0) {
            return 0;
        }
        float mo3457J = mo3457J(view);
        int i = this.f4924g;
        return C0142a.m8971b((int) (mo3457J * i), 0, i);
    }

    /* renamed from: J */
    abstract float mo3457J(View view);

    /* renamed from: K */
    public final int m3456K() {
        return this.f4924g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo3455L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final int m3454M() {
        return this.f4923f;
    }

    /* renamed from: O */
    public final void m3452O(int i) {
        this.f4924g = i;
    }

    /* renamed from: P */
    protected boolean m3451P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: m */
    public boolean mo3450m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo3459H;
        C0197a0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (mo3459H = mo3459H(coordinatorLayout.m7055r(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (C0252s.m8598t(mo3459H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m8850k() + lastWindowInsets.m8853h();
            }
            int mo3455L = size + mo3455L(mo3459H);
            int measuredHeight = mo3459H.getMeasuredHeight();
            if (m3451P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                mo3455L -= measuredHeight;
            }
            coordinatorLayout.m7081J(view, i, i2, View.MeasureSpec.makeMeasureSpec(mo3455L, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
            return true;
        }
        return false;
    }
}
