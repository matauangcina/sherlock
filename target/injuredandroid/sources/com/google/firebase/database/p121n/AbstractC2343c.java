package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.InterfaceC2351h;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.n.c */
/* loaded from: classes.dex */
public abstract class AbstractC2343c<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: com.google.firebase.database.n.c$a */
    /* loaded from: classes.dex */
    public static class C2344a {

        /* renamed from: a */
        private static final InterfaceC2345a f6171a = C2342b.m1984b();

        /* renamed from: com.google.firebase.database.n.c$a$a */
        /* loaded from: classes.dex */
        public interface InterfaceC2345a<C, D> {
            /* renamed from: a */
            D mo1978a(C c);
        }

        /* renamed from: a */
        public static <A, B, C> AbstractC2343c<A, C> m1983a(List<A> list, Map<B, C> map, InterfaceC2345a<A, B> interfaceC2345a, Comparator<A> comparator) {
            return list.size() < 25 ? C2340a.m1986z(list, map, interfaceC2345a, comparator) : C2356k.m1938w(list, map, interfaceC2345a, comparator);
        }

        /* renamed from: b */
        public static <K, V> AbstractC2343c<K, V> m1982b(Comparator<K> comparator) {
            return new C2340a(comparator);
        }

        /* renamed from: c */
        public static <A, B> AbstractC2343c<A, B> m1981c(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? C2340a.m1993C(map, comparator) : C2356k.m1937x(map, comparator);
        }

        /* renamed from: d */
        public static <A> InterfaceC2345a<A, A> m1980d() {
            return f6171a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public static /* synthetic */ Object m1979e(Object obj) {
            return obj;
        }
    }

    /* renamed from: d */
    public abstract boolean mo1948d(K k);

    /* renamed from: e */
    public abstract V mo1947e(K k);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC2343c) {
            AbstractC2343c abstractC2343c = (AbstractC2343c) obj;
            if (mo1946f().equals(abstractC2343c.mo1946f()) && size() == abstractC2343c.size()) {
                Iterator<Map.Entry<K, V>> it = iterator();
                Iterator<Map.Entry<K, V>> it2 = abstractC2343c.iterator();
                while (it.hasNext()) {
                    if (!it.next().equals(it2.next())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public abstract Comparator<K> mo1946f();

    /* renamed from: g */
    public abstract K mo1945g();

    public int hashCode() {
        int hashCode = mo1946f().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    /* renamed from: i */
    public abstract K mo1944i();

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    /* renamed from: l */
    public abstract K mo1943l(K k);

    /* renamed from: m */
    public abstract void mo1942m(InterfaceC2351h.AbstractC2353b<K, V> abstractC2353b);

    /* renamed from: s */
    public abstract AbstractC2343c<K, V> mo1941s(K k, V v);

    public abstract int size();

    /* renamed from: t */
    public abstract Iterator<Map.Entry<K, V>> mo1940t();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    /* renamed from: u */
    public abstract AbstractC2343c<K, V> mo1939u(K k);
}
