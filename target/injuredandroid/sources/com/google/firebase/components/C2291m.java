package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.google.firebase.components.m */
/* loaded from: classes.dex */
class C2291m {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.components.m$b */
    /* loaded from: classes.dex */
    public static class C2293b {

        /* renamed from: a */
        private final C2277d<?> f6089a;

        /* renamed from: b */
        private final Set<C2293b> f6090b = new HashSet();

        /* renamed from: c */
        private final Set<C2293b> f6091c = new HashSet();

        C2293b(C2277d<?> c2277d) {
            this.f6089a = c2277d;
        }

        /* renamed from: a */
        void m2106a(C2293b c2293b) {
            this.f6090b.add(c2293b);
        }

        /* renamed from: b */
        void m2105b(C2293b c2293b) {
            this.f6091c.add(c2293b);
        }

        /* renamed from: c */
        C2277d<?> m2104c() {
            return this.f6089a;
        }

        /* renamed from: d */
        Set<C2293b> m2103d() {
            return this.f6090b;
        }

        /* renamed from: e */
        boolean m2102e() {
            return this.f6090b.isEmpty();
        }

        /* renamed from: f */
        boolean m2101f() {
            return this.f6091c.isEmpty();
        }

        /* renamed from: g */
        void m2100g(C2293b c2293b) {
            this.f6091c.remove(c2293b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.components.m$c */
    /* loaded from: classes.dex */
    public static class C2294c {

        /* renamed from: a */
        private final Class<?> f6092a;

        /* renamed from: b */
        private final boolean f6093b;

        private C2294c(Class<?> cls, boolean z) {
            this.f6092a = cls;
            this.f6093b = z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2294c) {
                C2294c c2294c = (C2294c) obj;
                return c2294c.f6092a.equals(this.f6092a) && c2294c.f6093b == this.f6093b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f6092a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f6093b).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2109a(List<C2277d<?>> list) {
        Set<C2293b> m2107c = m2107c(list);
        Set<C2293b> m2108b = m2108b(m2107c);
        int i = 0;
        while (!m2108b.isEmpty()) {
            C2293b next = m2108b.iterator().next();
            m2108b.remove(next);
            i++;
            for (C2293b c2293b : next.m2103d()) {
                c2293b.m2100g(next);
                if (c2293b.m2101f()) {
                    m2108b.add(c2293b);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C2293b c2293b2 : m2107c) {
            if (!c2293b2.m2101f() && !c2293b2.m2102e()) {
                arrayList.add(c2293b2.m2104c());
            }
        }
        throw new C2296o(arrayList);
    }

    /* renamed from: b */
    private static Set<C2293b> m2108b(Set<C2293b> set) {
        HashSet hashSet = new HashSet();
        for (C2293b c2293b : set) {
            if (c2293b.m2101f()) {
                hashSet.add(c2293b);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C2293b> m2107c(List<C2277d<?>> list) {
        Set<C2293b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C2277d<?> c2277d : list) {
            C2293b c2293b = new C2293b(c2277d);
            for (Class<? super Object> cls : c2277d.m2142e()) {
                C2294c c2294c = new C2294c(cls, !c2277d.m2136k());
                if (!hashMap.containsKey(c2294c)) {
                    hashMap.put(c2294c, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c2294c);
                if (!set2.isEmpty() && !c2294c.f6093b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(c2293b);
            }
        }
        for (Set<C2293b> set3 : hashMap.values()) {
            for (C2293b c2293b2 : set3) {
                for (C2295n c2295n : c2293b2.m2104c().m2144c()) {
                    if (c2295n.m2097b() && (set = (Set) hashMap.get(new C2294c(c2295n.m2098a(), c2295n.m2095d()))) != null) {
                        for (C2293b c2293b3 : set) {
                            c2293b2.m2106a(c2293b3);
                            c2293b3.m2105b(c2293b2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
