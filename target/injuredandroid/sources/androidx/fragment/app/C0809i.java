package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p000a.p014d.C0079g;
/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public class C0809i {

    /* renamed from: a */
    private static final C0079g<String, Class<?>> f2912a = new C0079g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m6451b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m6450c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m6450c(ClassLoader classLoader, String str) {
        Class<?> cls = f2912a.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            f2912a.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m6449d(ClassLoader classLoader, String str) {
        try {
            return m6450c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C0788d("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C0788d("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: a */
    public abstract Fragment mo6321a(ClassLoader classLoader, String str);
}
