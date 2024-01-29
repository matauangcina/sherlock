package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p054b.p059c.p098c.p099j.InterfaceC1429c;
import p054b.p059c.p098c.p101l.InterfaceC1435a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.v */
/* loaded from: classes.dex */
public final class C2303v extends AbstractC2274a {

    /* renamed from: a */
    private final Set<Class<?>> f6104a;

    /* renamed from: b */
    private final Set<Class<?>> f6105b;

    /* renamed from: c */
    private final Set<Class<?>> f6106c;

    /* renamed from: d */
    private final Set<Class<?>> f6107d;

    /* renamed from: e */
    private final Set<Class<?>> f6108e;

    /* renamed from: f */
    private final InterfaceC2280e f6109f;

    /* renamed from: com.google.firebase.components.v$a */
    /* loaded from: classes.dex */
    private static class C2304a implements InterfaceC1429c {
        public C2304a(Set<Class<?>> set, InterfaceC1429c interfaceC1429c) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2303v(C2277d<?> c2277d, InterfaceC2280e interfaceC2280e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C2295n c2295n : c2277d.m2144c()) {
            if (c2295n.m2097b()) {
                boolean m2095d = c2295n.m2095d();
                Class<?> m2098a = c2295n.m2098a();
                if (m2095d) {
                    hashSet3.add(m2098a);
                } else {
                    hashSet.add(m2098a);
                }
            } else {
                boolean m2095d2 = c2295n.m2095d();
                Class<?> m2098a2 = c2295n.m2098a();
                if (m2095d2) {
                    hashSet4.add(m2098a2);
                } else {
                    hashSet2.add(m2098a2);
                }
            }
        }
        if (!c2277d.m2141f().isEmpty()) {
            hashSet.add(InterfaceC1429c.class);
        }
        this.f6104a = Collections.unmodifiableSet(hashSet);
        this.f6105b = Collections.unmodifiableSet(hashSet2);
        this.f6106c = Collections.unmodifiableSet(hashSet3);
        this.f6107d = Collections.unmodifiableSet(hashSet4);
        this.f6108e = c2277d.m2141f();
        this.f6109f = interfaceC2280e;
    }

    @Override // com.google.firebase.components.AbstractC2274a, com.google.firebase.components.InterfaceC2280e
    /* renamed from: a */
    public <T> T mo2081a(Class<T> cls) {
        if (this.f6104a.contains(cls)) {
            T t = (T) this.f6109f.mo2081a(cls);
            return !cls.equals(InterfaceC1429c.class) ? t : (T) new C2304a(this.f6108e, (InterfaceC1429c) t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.AbstractC2274a, com.google.firebase.components.InterfaceC2280e
    /* renamed from: b */
    public <T> Set<T> mo2080b(Class<T> cls) {
        if (this.f6106c.contains(cls)) {
            return this.f6109f.mo2080b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.InterfaceC2280e
    /* renamed from: c */
    public <T> InterfaceC1435a<T> mo2079c(Class<T> cls) {
        if (this.f6105b.contains(cls)) {
            return this.f6109f.mo2079c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.InterfaceC2280e
    /* renamed from: d */
    public <T> InterfaceC1435a<Set<T>> mo2078d(Class<T> cls) {
        if (this.f6107d.contains(cls)) {
            return this.f6109f.mo2078d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
