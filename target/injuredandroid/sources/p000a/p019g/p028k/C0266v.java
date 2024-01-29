package p000a.p019g.p028k;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
/* renamed from: a.g.k.v */
/* loaded from: classes.dex */
public final class C0266v {
    /* renamed from: a */
    public static boolean m8545a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0247n) {
                return ((InterfaceC0247n) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m8544b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof InterfaceC0247n) {
                return ((InterfaceC0247n) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: c */
    public static void m8543c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC0245l) {
            ((InterfaceC0245l) viewParent).mo6709j(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0247n) {
                    ((InterfaceC0247n) viewParent).onNestedPreScroll(view, i, i2, iArr);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: d */
    public static void m8542d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof InterfaceC0246m) {
            ((InterfaceC0246m) viewParent).mo6706m(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof InterfaceC0245l) {
            ((InterfaceC0245l) viewParent).mo6705n(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0247n) {
                    ((InterfaceC0247n) viewParent).onNestedScroll(view, i, i2, i3, i4);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* renamed from: e */
    public static void m8541e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0245l) {
            ((InterfaceC0245l) viewParent).mo6716c(view, view2, i, i2);
        } else if (i2 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0247n) {
                    ((InterfaceC0247n) viewParent).onNestedScrollAccepted(view, view2, i);
                    return;
                }
                return;
            }
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: f */
    public static boolean m8540f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC0245l) {
            return ((InterfaceC0245l) viewParent).mo6704o(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0247n) {
                    return ((InterfaceC0247n) viewParent).onStartNestedScroll(view, view2, i);
                }
                return false;
            }
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m8539g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC0245l) {
            ((InterfaceC0245l) viewParent).mo6710i(view, i);
        } else if (i == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof InterfaceC0247n) {
                    ((InterfaceC0247n) viewParent).onStopNestedScroll(view);
                    return;
                }
                return;
            }
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }
}
