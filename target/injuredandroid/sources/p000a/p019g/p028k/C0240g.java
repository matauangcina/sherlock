package p000a.p019g.p028k;

import android.os.Build;
import android.view.ViewGroup;
/* renamed from: a.g.k.g */
/* loaded from: classes.dex */
public final class C0240g {
    /* renamed from: a */
    public static int m8697a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m8696b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }
}
