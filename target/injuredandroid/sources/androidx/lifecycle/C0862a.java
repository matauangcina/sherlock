package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
class C0862a {

    /* renamed from: c */
    static C0862a f3121c = new C0862a();

    /* renamed from: a */
    private final Map<Class<?>, C0863a> f3122a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3123b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$a */
    /* loaded from: classes.dex */
    public static class C0863a {

        /* renamed from: a */
        final Map<AbstractC0868e.EnumC0869a, List<C0864b>> f3124a = new HashMap();

        /* renamed from: b */
        final Map<C0864b, AbstractC0868e.EnumC0869a> f3125b;

        C0863a(Map<C0864b, AbstractC0868e.EnumC0869a> map) {
            this.f3125b = map;
            for (Map.Entry<C0864b, AbstractC0868e.EnumC0869a> entry : map.entrySet()) {
                AbstractC0868e.EnumC0869a value = entry.getValue();
                List<C0864b> list = this.f3124a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f3124a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m6139b(List<C0864b> list, InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m6138a(interfaceC0875j, enumC0869a, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m6140a(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a, Object obj) {
            m6139b(this.f3124a.get(enumC0869a), interfaceC0875j, enumC0869a, obj);
            m6139b(this.f3124a.get(AbstractC0868e.EnumC0869a.ON_ANY), interfaceC0875j, enumC0869a, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.a$b */
    /* loaded from: classes.dex */
    public static class C0864b {

        /* renamed from: a */
        final int f3126a;

        /* renamed from: b */
        final Method f3127b;

        C0864b(int i, Method method) {
            this.f3126a = i;
            this.f3127b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m6138a(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a, Object obj) {
            try {
                int i = this.f3126a;
                if (i == 0) {
                    this.f3127b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3127b.invoke(obj, interfaceC0875j);
                } else if (i != 2) {
                } else {
                    this.f3127b.invoke(obj, interfaceC0875j, enumC0869a);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0864b.class != obj.getClass()) {
                return false;
            }
            C0864b c0864b = (C0864b) obj;
            return this.f3126a == c0864b.f3126a && this.f3127b.getName().equals(c0864b.f3127b.getName());
        }

        public int hashCode() {
            return (this.f3126a * 31) + this.f3127b.getName().hashCode();
        }
    }

    C0862a() {
    }

    /* renamed from: a */
    private C0863a m6145a(Class<?> cls, Method[] methodArr) {
        int i;
        C0863a m6143c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m6143c = m6143c(superclass)) != null) {
            hashMap.putAll(m6143c.f3125b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0864b, AbstractC0868e.EnumC0869a> entry : m6143c(cls2).f3125b.entrySet()) {
                m6141e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m6144b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0884q interfaceC0884q = (InterfaceC0884q) method.getAnnotation(InterfaceC0884q.class);
            if (interfaceC0884q != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(InterfaceC0875j.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                AbstractC0868e.EnumC0869a value = interfaceC0884q.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0868e.EnumC0869a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0868e.EnumC0869a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m6141e(hashMap, new C0864b(i, method), value, cls);
                z = true;
            }
        }
        C0863a c0863a = new C0863a(hashMap);
        this.f3122a.put(cls, c0863a);
        this.f3123b.put(cls, Boolean.valueOf(z));
        return c0863a;
    }

    /* renamed from: b */
    private Method[] m6144b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m6141e(Map<C0864b, AbstractC0868e.EnumC0869a> map, C0864b c0864b, AbstractC0868e.EnumC0869a enumC0869a, Class<?> cls) {
        AbstractC0868e.EnumC0869a enumC0869a2 = map.get(c0864b);
        if (enumC0869a2 == null || enumC0869a == enumC0869a2) {
            if (enumC0869a2 == null) {
                map.put(c0864b, enumC0869a);
                return;
            }
            return;
        }
        Method method = c0864b.f3127b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0869a2 + ", new value " + enumC0869a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C0863a m6143c(Class<?> cls) {
        C0863a c0863a = this.f3122a.get(cls);
        return c0863a != null ? c0863a : m6145a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m6142d(Class<?> cls) {
        Boolean bool = this.f3123b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m6144b = m6144b(cls);
        for (Method method : m6144b) {
            if (((InterfaceC0884q) method.getAnnotation(InterfaceC0884q.class)) != null) {
                m6145a(cls, m6144b);
                return true;
            }
        }
        this.f3123b.put(cls, Boolean.FALSE);
        return false;
    }
}
