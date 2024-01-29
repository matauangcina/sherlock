package com.google.firebase.database.p121n;

import java.util.Comparator;
/* renamed from: com.google.firebase.database.n.h */
/* loaded from: classes.dex */
public interface InterfaceC2351h<K, V> {

    /* renamed from: com.google.firebase.database.n.h$a */
    /* loaded from: classes.dex */
    public enum EnumC2352a {
        RED,
        BLACK
    }

    /* renamed from: com.google.firebase.database.n.h$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2353b<K, V> {
        /* renamed from: a */
        public abstract void mo1147a(K k, V v);
    }

    /* renamed from: a */
    InterfaceC2351h<K, V> mo1968a();

    /* renamed from: b */
    InterfaceC2351h<K, V> mo1967b(K k, V v, Comparator<K> comparator);

    /* renamed from: c */
    boolean mo1969c();

    /* renamed from: d */
    InterfaceC2351h<K, V> mo1966d();

    /* renamed from: e */
    InterfaceC2351h<K, V> mo1965e(K k, V v, EnumC2352a enumC2352a, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2);

    /* renamed from: f */
    InterfaceC2351h<K, V> mo1964f(K k, Comparator<K> comparator);

    /* renamed from: g */
    InterfaceC2351h<K, V> mo1963g();

    K getKey();

    V getValue();

    /* renamed from: h */
    void mo1962h(AbstractC2353b<K, V> abstractC2353b);

    /* renamed from: i */
    InterfaceC2351h<K, V> mo1961i();

    boolean isEmpty();

    int size();
}
