package p000a.p047p;

import android.view.View;
/* renamed from: a.p.d0 */
/* loaded from: classes.dex */
class C0351d0 extends C0367i0 {

    /* renamed from: e */
    private static boolean f921e = true;

    @Override // p000a.p047p.C0367i0
    /* renamed from: a */
    public void mo8334a(View view) {
    }

    @Override // p000a.p047p.C0367i0
    /* renamed from: c */
    public float mo8332c(View view) {
        if (f921e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f921e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p000a.p047p.C0367i0
    /* renamed from: d */
    public void mo8331d(View view) {
    }

    @Override // p000a.p047p.C0367i0
    /* renamed from: f */
    public void mo8329f(View view, float f) {
        if (f921e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f921e = false;
            }
        }
        view.setAlpha(f);
    }
}
