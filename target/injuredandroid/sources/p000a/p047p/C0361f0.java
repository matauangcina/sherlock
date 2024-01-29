package p000a.p047p;

import android.view.View;
/* renamed from: a.p.f0 */
/* loaded from: classes.dex */
class C0361f0 extends C0359e0 {

    /* renamed from: h */
    private static boolean f935h = true;

    @Override // p000a.p047p.C0367i0
    /* renamed from: e */
    public void mo8330e(View view, int i, int i2, int i3, int i4) {
        if (f935h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f935h = false;
            }
        }
    }
}
