package p000a.p019g.p028k;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
/* renamed from: a.g.k.d */
/* loaded from: classes.dex */
public final class C0236d {
    /* renamed from: a */
    public static void m8707a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: b */
    public static int m8706b(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }
}
