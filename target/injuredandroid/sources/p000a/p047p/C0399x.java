package p000a.p047p;

import android.os.Build;
import android.view.ViewGroup;
/* renamed from: a.p.x */
/* loaded from: classes.dex */
class C0399x {

    /* renamed from: a */
    private static boolean f1039a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC0398w m8225a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C0397v(viewGroup) : C0396u.m8228g(viewGroup);
    }

    /* renamed from: b */
    private static void m8224b(ViewGroup viewGroup, boolean z) {
        if (f1039a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f1039a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m8223c(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m8224b(viewGroup, z);
        } else {
            C0400y.m8221b(viewGroup, z);
        }
    }
}
