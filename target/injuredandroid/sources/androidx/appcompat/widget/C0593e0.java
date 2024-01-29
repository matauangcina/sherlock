package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.InterfaceC0761c;
import p000a.p001a.p004l.p005a.C0024c;
/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: classes.dex */
public class C0593e0 {

    /* renamed from: a */
    private static final int[] f1988a = {16842912};

    /* renamed from: b */
    private static final int[] f1989b = new int[0];

    static {
        new Rect();
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m7468a(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT >= 15 || !(drawable instanceof InsetDrawable)) {
            if (Build.VERSION.SDK_INT >= 15 || !(drawable instanceof GradientDrawable)) {
                if (Build.VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
                    if (!(drawable instanceof DrawableContainer)) {
                        if (drawable instanceof InterfaceC0761c) {
                            drawable2 = ((InterfaceC0761c) drawable).mo6742b();
                        } else if (drawable instanceof C0024c) {
                            drawable2 = ((C0024c) drawable).m9518a();
                        } else if (!(drawable instanceof ScaleDrawable)) {
                            return true;
                        } else {
                            drawable2 = ((ScaleDrawable) drawable).getDrawable();
                        }
                        return m7468a(drawable2);
                    }
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState instanceof DrawableContainer.DrawableContainerState) {
                        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                            if (!m7468a(drawable3)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m7467b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m7466c(drawable);
        }
    }

    /* renamed from: c */
    private static void m7466c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1988a);
        } else {
            drawable.setState(f1989b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static PorterDuff.Mode m7465d(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
