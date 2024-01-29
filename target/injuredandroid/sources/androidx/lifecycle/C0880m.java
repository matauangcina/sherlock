package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public class C0880m {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3147a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends InterfaceC0867d>>> f3148b = new HashMap();

    /* renamed from: a */
    private static InterfaceC0867d m6105a(Constructor<? extends InterfaceC0867d> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends InterfaceC0867d> m6104b(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m6103c = m6103c(canonicalName);
            if (!name.isEmpty()) {
                m6103c = name + "." + m6103c;
            }
            Constructor declaredConstructor = Class.forName(m6103c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m6103c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m6102d(Class<?> cls) {
        Integer num = f3147a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m6099g = m6099g(cls);
        f3147a.put(cls, Integer.valueOf(m6099g));
        return m6099g;
    }

    /* renamed from: e */
    private static boolean m6101e(Class<?> cls) {
        return cls != null && InterfaceC0874i.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static InterfaceC0873h m6100f(Object obj) {
        boolean z = obj instanceof InterfaceC0873h;
        boolean z2 = obj instanceof InterfaceC0866c;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((InterfaceC0866c) obj, (InterfaceC0873h) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((InterfaceC0866c) obj, null);
        }
        if (z) {
            return (InterfaceC0873h) obj;
        }
        Class<?> cls = obj.getClass();
        if (m6102d(cls) == 2) {
            List<Constructor<? extends InterfaceC0867d>> list = f3148b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(m6105a(list.get(0), obj));
            }
            InterfaceC0867d[] interfaceC0867dArr = new InterfaceC0867d[list.size()];
            for (int i = 0; i < list.size(); i++) {
                interfaceC0867dArr[i] = m6105a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC0867dArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    private static int m6099g(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0867d> m6104b = m6104b(cls);
        if (m6104b != null) {
            f3148b.put(cls, Collections.singletonList(m6104b));
            return 2;
        } else if (C0862a.f3121c.m6142d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m6101e(superclass)) {
                if (m6102d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3148b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (m6101e(cls2)) {
                    if (m6102d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3148b.get(cls2));
                }
            }
            if (arrayList != null) {
                f3148b.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
