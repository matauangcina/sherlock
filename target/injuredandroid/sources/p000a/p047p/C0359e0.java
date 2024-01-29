package p000a.p047p;

import android.graphics.Matrix;
import android.view.View;
/* renamed from: a.p.e0 */
/* loaded from: classes.dex */
class C0359e0 extends C0351d0 {

    /* renamed from: f */
    private static boolean f933f = true;

    /* renamed from: g */
    private static boolean f934g = true;

    @Override // p000a.p047p.C0367i0
    /* renamed from: h */
    public void mo8327h(View view, Matrix matrix) {
        if (f933f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f933f = false;
            }
        }
    }

    @Override // p000a.p047p.C0367i0
    /* renamed from: i */
    public void mo8326i(View view, Matrix matrix) {
        if (f934g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f934g = false;
            }
        }
    }
}
