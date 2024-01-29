package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p054b.p059c.p098c.p099j.InterfaceC1429c;
import p054b.p059c.p098c.p099j.InterfaceC1430d;
import p054b.p059c.p098c.p101l.InterfaceC1435a;
/* renamed from: com.google.firebase.components.l */
/* loaded from: classes.dex */
public class C2290l extends AbstractC2274a {

    /* renamed from: e */
    private static final InterfaceC1435a<Set<Object>> f6084e = C2289k.m2116a();

    /* renamed from: a */
    private final Map<C2277d<?>, C2300s<?>> f6085a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C2300s<?>> f6086b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C2300s<Set<?>>> f6087c = new HashMap();

    /* renamed from: d */
    private final C2299r f6088d;

    public C2290l(Executor executor, Iterable<InterfaceC2286h> iterable, C2277d<?>... c2277dArr) {
        this.f6088d = new C2299r(executor);
        ArrayList<C2277d<?>> arrayList = new ArrayList();
        arrayList.add(C2277d.m2133n(this.f6088d, C2299r.class, InterfaceC1430d.class, InterfaceC1429c.class));
        for (InterfaceC2286h interfaceC2286h : iterable) {
            arrayList.addAll(interfaceC2286h.getComponents());
        }
        for (C2277d<?> c2277d : c2277dArr) {
            if (c2277d != null) {
                arrayList.add(c2277d);
            }
        }
        C2291m.m2109a(arrayList);
        for (C2277d<?> c2277d2 : arrayList) {
            this.f6085a.put(c2277d2, new C2300s<>(C2287i.m2118a(this, c2277d2)));
        }
        m2112h();
        m2111i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ Set m2113g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C2300s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: h */
    private void m2112h() {
        for (Map.Entry<C2277d<?>, C2300s<?>> entry : this.f6085a.entrySet()) {
            C2277d<?> key = entry.getKey();
            if (key.m2136k()) {
                C2300s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m2142e()) {
                    this.f6086b.put(cls, value);
                }
            }
        }
        m2110j();
    }

    /* renamed from: i */
    private void m2111i() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<C2277d<?>, C2300s<?>> entry : this.f6085a.entrySet()) {
            C2277d<?> key = entry.getKey();
            if (!key.m2136k()) {
                C2300s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.m2142e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.f6087c.put((Class) entry2.getKey(), new C2300s<>(C2288j.m2117a((Set) entry2.getValue())));
        }
    }

    /* renamed from: j */
    private void m2110j() {
        for (C2277d<?> c2277d : this.f6085a.keySet()) {
            for (C2295n c2295n : c2277d.m2144c()) {
                if (c2295n.m2096c() && !this.f6086b.containsKey(c2295n.m2098a())) {
                    throw new C2301t(String.format("Unsatisfied dependency for component %s: %s", c2277d, c2295n.m2098a()));
                }
            }
        }
    }

    @Override // com.google.firebase.components.InterfaceC2280e
    /* renamed from: c */
    public <T> InterfaceC1435a<T> mo2079c(Class<T> cls) {
        C2302u.m2083c(cls, "Null interface requested.");
        return this.f6086b.get(cls);
    }

    @Override // com.google.firebase.components.InterfaceC2280e
    /* renamed from: d */
    public <T> InterfaceC1435a<Set<T>> mo2078d(Class<T> cls) {
        C2300s<Set<?>> c2300s = this.f6087c.get(cls);
        return c2300s != null ? c2300s : (InterfaceC1435a<Set<T>>) f6084e;
    }

    /* renamed from: e */
    public void m2115e(boolean z) {
        for (Map.Entry<C2277d<?>, C2300s<?>> entry : this.f6085a.entrySet()) {
            C2277d<?> key = entry.getKey();
            C2300s<?> value = entry.getValue();
            if (key.m2138i() || (key.m2137j() && z)) {
                value.get();
            }
        }
        this.f6088d.m2089a();
    }
}
