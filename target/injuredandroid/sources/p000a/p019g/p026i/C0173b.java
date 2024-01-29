package p000a.p019g.p026i;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* renamed from: a.g.i.b */
/* loaded from: classes.dex */
public final class C0173b {

    /* renamed from: a */
    private static Method f616a;

    /* renamed from: b */
    private static Method f617b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 24) {
                try {
                    f617b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f616a = cls.getMethod("getScript", String.class);
                f617b = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception e2) {
            f616a = null;
            f617b = null;
            Log.w("ICUCompat", e2);
        }
    }

    /* renamed from: a */
    private static String m8898a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f617b != null) {
                return (String) f617b.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m8897b(String str) {
        try {
            if (f616a != null) {
                return (String) f616a.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    /* renamed from: c */
    public static String m8896c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f617b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        }
        String m8898a = m8898a(locale);
        if (m8898a != null) {
            return m8897b(m8898a);
        }
        return null;
    }
}
