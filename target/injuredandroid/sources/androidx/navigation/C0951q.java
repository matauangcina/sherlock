package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* renamed from: androidx.navigation.q */
/* loaded from: classes.dex */
public final class C0951q {
    /* renamed from: a */
    public static NavController m5859a(View view) {
        NavController m5858b = m5858b(view);
        if (m5858b != null) {
            return m5858b;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: b */
    private static NavController m5858b(View view) {
        while (view != null) {
            NavController m5857c = m5857c(view);
            if (m5857c != null) {
                return m5857c;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: c */
    private static NavController m5857c(View view) {
        Object tag = view.getTag(C0956t.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            tag = ((WeakReference) tag).get();
        } else if (!(tag instanceof NavController)) {
            return null;
        }
        return (NavController) tag;
    }

    /* renamed from: d */
    public static void m5856d(View view, NavController navController) {
        view.setTag(C0956t.nav_controller_view_tag, navController);
    }
}
