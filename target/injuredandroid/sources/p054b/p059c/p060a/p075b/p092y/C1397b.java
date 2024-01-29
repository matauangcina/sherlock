package p054b.p059c.p060a.p075b.p092y;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
/* renamed from: b.c.a.b.y.b */
/* loaded from: classes.dex */
public class C1397b {

    /* renamed from: a */
    public static final boolean f4315a;

    /* renamed from: b */
    private static final int[] f4316b;

    /* renamed from: c */
    static final String f4317c;

    static {
        f4315a = Build.VERSION.SDK_INT >= 21;
        f4316b = new int[]{16842910, 16842919};
        f4317c = C1397b.class.getSimpleName();
    }

    private C1397b() {
    }

    /* renamed from: a */
    public static ColorStateList m4240a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f4316b, 0)) != 0) {
                Log.w(f4317c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: b */
    public static boolean m4239b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
