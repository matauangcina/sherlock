package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
class C0478h {

    /* renamed from: a */
    private static Field f1395a;

    /* renamed from: b */
    private static boolean f1396b;

    /* renamed from: c */
    private static Class<?> f1397c;

    /* renamed from: d */
    private static boolean f1398d;

    /* renamed from: e */
    private static Field f1399e;

    /* renamed from: f */
    private static boolean f1400f;

    /* renamed from: g */
    private static Field f1401g;

    /* renamed from: h */
    private static boolean f1402h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7958a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m7955d(resources);
        } else if (i >= 23) {
            m7956c(resources);
        } else if (i >= 21) {
            m7957b(resources);
        }
    }

    /* renamed from: b */
    private static void m7957b(Resources resources) {
        if (!f1396b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1395a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1396b = true;
        }
        Field field = f1395a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m7956c(Resources resources) {
        if (!f1396b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1395a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1396b = true;
        }
        Object obj = null;
        Field field = f1395a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj == null) {
            return;
        }
        m7954e(obj);
    }

    /* renamed from: d */
    private static void m7955d(Resources resources) {
        Object obj;
        if (!f1402h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1401g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1402h = true;
        }
        Field field = f1401g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1396b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1395a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f1396b = true;
        }
        Field field2 = f1395a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m7954e(obj2);
        }
    }

    /* renamed from: e */
    private static void m7954e(Object obj) {
        if (!f1398d) {
            try {
                f1397c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1398d = true;
        }
        Class<?> cls = f1397c;
        if (cls == null) {
            return;
        }
        if (!f1400f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1399e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f1400f = true;
        }
        Field field = f1399e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
