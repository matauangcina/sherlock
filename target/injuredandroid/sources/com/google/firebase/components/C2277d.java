package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.firebase.components.d */
/* loaded from: classes.dex */
public final class C2277d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f6065a;

    /* renamed from: b */
    private final Set<C2295n> f6066b;

    /* renamed from: c */
    private final int f6067c;

    /* renamed from: d */
    private final int f6068d;

    /* renamed from: e */
    private final InterfaceC2285g<T> f6069e;

    /* renamed from: f */
    private final Set<Class<?>> f6070f;

    /* renamed from: com.google.firebase.components.d$b */
    /* loaded from: classes.dex */
    public static class C2279b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f6071a;

        /* renamed from: b */
        private final Set<C2295n> f6072b;

        /* renamed from: c */
        private int f6073c;

        /* renamed from: d */
        private int f6074d;

        /* renamed from: e */
        private InterfaceC2285g<T> f6075e;

        /* renamed from: f */
        private Set<Class<?>> f6076f;

        @SafeVarargs
        private C2279b(Class<T> cls, Class<? super T>... clsArr) {
            this.f6071a = new HashSet();
            this.f6072b = new HashSet();
            this.f6073c = 0;
            this.f6074d = 0;
            this.f6076f = new HashSet();
            C2302u.m2083c(cls, "Null interface");
            this.f6071a.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                C2302u.m2083c(cls2, "Null interface");
            }
            Collections.addAll(this.f6071a, clsArr);
        }

        /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
            	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
            	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
            	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
            	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
            	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
            	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
            */
        /* renamed from: a */
        static /* synthetic */ com.google.firebase.components.C2277d.C2279b m2132a(com.google.firebase.components.C2277d.C2279b r0) {
            /*
                r0.m2127f()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C2277d.C2279b.m2132a(com.google.firebase.components.d$b):com.google.firebase.components.d$b");
        }

        /* renamed from: f */
        private C2279b<T> m2127f() {
            this.f6074d = 1;
            return this;
        }

        /* renamed from: g */
        private C2279b<T> m2126g(int i) {
            C2302u.m2082d(this.f6073c == 0, "Instantiation type has already been set.");
            this.f6073c = i;
            return this;
        }

        /* renamed from: h */
        private void m2125h(Class<?> cls) {
            C2302u.m2085a(!this.f6071a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C2279b<T> m2131b(C2295n c2295n) {
            C2302u.m2083c(c2295n, "Null dependency");
            m2125h(c2295n.m2098a());
            this.f6072b.add(c2295n);
            return this;
        }

        /* renamed from: c */
        public C2277d<T> m2130c() {
            C2302u.m2082d(this.f6075e != null, "Missing required property: factory.");
            return new C2277d<>(new HashSet(this.f6071a), new HashSet(this.f6072b), this.f6073c, this.f6074d, this.f6075e, this.f6076f);
        }

        /* renamed from: d */
        public C2279b<T> m2129d() {
            m2126g(2);
            return this;
        }

        /* renamed from: e */
        public C2279b<T> m2128e(InterfaceC2285g<T> interfaceC2285g) {
            C2302u.m2083c(interfaceC2285g, "Null factory");
            this.f6075e = interfaceC2285g;
            return this;
        }
    }

    private C2277d(Set<Class<? super T>> set, Set<C2295n> set2, int i, int i2, InterfaceC2285g<T> interfaceC2285g, Set<Class<?>> set3) {
        this.f6065a = Collections.unmodifiableSet(set);
        this.f6066b = Collections.unmodifiableSet(set2);
        this.f6067c = i;
        this.f6068d = i2;
        this.f6069e = interfaceC2285g;
        this.f6070f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C2279b<T> m2146a(Class<T> cls) {
        return new C2279b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C2279b<T> m2145b(Class<T> cls, Class<? super T>... clsArr) {
        return new C2279b<>(cls, clsArr);
    }

    /* renamed from: g */
    public static <T> C2277d<T> m2140g(T t, Class<T> cls) {
        C2279b m2139h = m2139h(cls);
        m2139h.m2128e(C2276c.m2147b(t));
        return m2139h.m2130c();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.firebase.components.d.b.a(com.google.firebase.components.d$b):com.google.firebase.components.d$b
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:65)
        	... 1 more
        */
    /* renamed from: h */
    public static <T> com.google.firebase.components.C2277d.C2279b<T> m2139h(java.lang.Class<T> r0) {
        /*
            com.google.firebase.components.d$b r0 = m2146a(r0)
            com.google.firebase.components.C2277d.C2279b.m2132a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C2277d.m2139h(java.lang.Class):com.google.firebase.components.d$b");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ Object m2135l(Object obj, InterfaceC2280e interfaceC2280e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static /* synthetic */ Object m2134m(Object obj, InterfaceC2280e interfaceC2280e) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: n */
    public static <T> C2277d<T> m2133n(T t, Class<T> cls, Class<? super T>... clsArr) {
        C2279b m2145b = m2145b(cls, clsArr);
        m2145b.m2128e(C2275b.m2148b(t));
        return m2145b.m2130c();
    }

    /* renamed from: c */
    public Set<C2295n> m2144c() {
        return this.f6066b;
    }

    /* renamed from: d */
    public InterfaceC2285g<T> m2143d() {
        return this.f6069e;
    }

    /* renamed from: e */
    public Set<Class<? super T>> m2142e() {
        return this.f6065a;
    }

    /* renamed from: f */
    public Set<Class<?>> m2141f() {
        return this.f6070f;
    }

    /* renamed from: i */
    public boolean m2138i() {
        return this.f6067c == 1;
    }

    /* renamed from: j */
    public boolean m2137j() {
        return this.f6067c == 2;
    }

    /* renamed from: k */
    public boolean m2136k() {
        return this.f6068d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f6065a.toArray()) + ">{" + this.f6067c + ", type=" + this.f6068d + ", deps=" + Arrays.toString(this.f6066b.toArray()) + "}";
    }
}
