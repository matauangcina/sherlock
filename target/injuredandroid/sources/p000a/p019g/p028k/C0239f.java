package p000a.p019g.p028k;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;
/* renamed from: a.g.k.f */
/* loaded from: classes.dex */
public final class C0239f {

    /* renamed from: a */
    private static Field f713a;

    /* renamed from: b */
    private static boolean f714b;

    /* renamed from: a */
    private static void m8699a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f714b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f713a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f714b = true;
        }
        Field field = f713a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m8698b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m8699a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m8699a(layoutInflater, factory2);
            }
        }
    }
}
