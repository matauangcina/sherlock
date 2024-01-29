package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.content.p052d.C0752f;
import java.io.File;
/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public class C0734a {

    /* renamed from: a */
    private static final Object f2647a = new Object();

    /* renamed from: b */
    private static TypedValue f2648b;

    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes.dex */
    static class C0735a {
        /* renamed from: a */
        static void m6868a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m6867b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes.dex */
    static class C0736b {
        /* renamed from: a */
        static File[] m6866a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m6865b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m6864c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes.dex */
    static class C0737c {
        /* renamed from: a */
        static File m6863a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m6862b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m6861c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes.dex */
    static class C0738d {
        /* renamed from: a */
        static int m6860a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static ColorStateList m6859b(Context context, int i) {
            return context.getColorStateList(i);
        }

        /* renamed from: c */
        static <T> T m6858c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: d */
        static String m6857d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes.dex */
    static class C0739e {
        /* renamed from: a */
        static Context m6856a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m6855b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m6854c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: a */
    public static Context m6877a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0739e.m6856a(context);
        }
        return null;
    }

    /* renamed from: b */
    public static int m6876b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? C0738d.m6860a(context, i) : context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static ColorStateList m6875c(Context context, int i) {
        return C0752f.m6802c(context.getResources(), i, context.getTheme());
    }

    /* renamed from: d */
    public static Drawable m6874d(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return C0737c.m6862b(context, i);
        }
        if (i2 < 16) {
            synchronized (f2647a) {
                if (f2648b == null) {
                    f2648b = new TypedValue();
                }
                context.getResources().getValue(i, f2648b, true);
                i = f2648b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: e */
    public static File[] m6873e(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? C0736b.m6866a(context) : new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: f */
    public static File[] m6872f(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? C0736b.m6865b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: g */
    public static boolean m6871g(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0739e.m6854c(context);
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m6870h(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0735a.m6868a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: i */
    public static void m6869i(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0735a.m6867b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
