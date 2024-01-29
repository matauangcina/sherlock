package p000a.p047p;

import android.os.Build;
import android.view.View;
/* renamed from: a.p.g0 */
/* loaded from: classes.dex */
class C0363g0 extends C0361f0 {

    /* renamed from: i */
    private static boolean f936i = true;

    @Override // p000a.p047p.C0367i0
    /* renamed from: g */
    public void mo8328g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo8328g(view, i);
        } else if (f936i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f936i = false;
            }
        }
    }
}
