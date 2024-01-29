package p000a.p047p;

import android.graphics.Matrix;
import android.view.View;
/* renamed from: a.p.h0 */
/* loaded from: classes.dex */
class C0365h0 extends C0363g0 {
    @Override // p000a.p047p.C0351d0, p000a.p047p.C0367i0
    /* renamed from: c */
    public float mo8332c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000a.p047p.C0361f0, p000a.p047p.C0367i0
    /* renamed from: e */
    public void mo8330e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000a.p047p.C0351d0, p000a.p047p.C0367i0
    /* renamed from: f */
    public void mo8329f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000a.p047p.C0363g0, p000a.p047p.C0367i0
    /* renamed from: g */
    public void mo8328g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000a.p047p.C0359e0, p000a.p047p.C0367i0
    /* renamed from: h */
    public void mo8327h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000a.p047p.C0359e0, p000a.p047p.C0367i0
    /* renamed from: i */
    public void mo8326i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
