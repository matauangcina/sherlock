package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0759a {

    /* renamed from: a */
    private static Method f2688a;

    /* renamed from: b */
    private static boolean f2689b;

    /* renamed from: c */
    private static Method f2690c;

    /* renamed from: d */
    private static boolean f2691d;

    /* renamed from: a */
    public static void m6761a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: b */
    public static boolean m6760b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: c */
    public static void m6759c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable mo6742b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 || i < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            mo6742b = ((InsetDrawable) drawable).getDrawable();
        } else if (!(drawable instanceof InterfaceC0761c)) {
            if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                return;
            }
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable child = drawableContainerState.getChild(i2);
                if (child != null) {
                    m6759c(child);
                }
            }
            return;
        } else {
            mo6742b = ((InterfaceC0761c) drawable).mo6742b();
        }
        m6759c(mo6742b);
    }

    /* renamed from: d */
    public static int m6758d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: e */
    public static ColorFilter m6757e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: f */
    public static int m6756f(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f2691d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2690c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f2691d = true;
            }
            Method method = f2690c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f2690c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m6755g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: h */
    public static boolean m6754h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: i */
    public static void m6753i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m6752j(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: k */
    public static void m6751k(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: l */
    public static void m6750l(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: m */
    public static boolean m6749m(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f2689b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f2688a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f2689b = true;
            }
            Method method = f2688a;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f2688a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m6748n(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC0760b) {
            ((InterfaceC0760b) drawable).setTint(i);
        }
    }

    /* renamed from: o */
    public static void m6747o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC0760b) {
            ((InterfaceC0760b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: p */
    public static void m6746p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC0760b) {
            ((InterfaceC0760b) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m6745q(Drawable drawable) {
        return drawable instanceof InterfaceC0761c ? (T) ((InterfaceC0761c) drawable).mo6742b() : drawable;
    }

    /* renamed from: r */
    public static Drawable m6744r(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof InterfaceC0760b) ? new C0763e(drawable) : drawable : !(drawable instanceof InterfaceC0760b) ? new C0762d(drawable) : drawable;
    }
}
