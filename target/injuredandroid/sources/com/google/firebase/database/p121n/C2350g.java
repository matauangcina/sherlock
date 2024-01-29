package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.InterfaceC2351h;
import java.util.Comparator;
/* renamed from: com.google.firebase.database.n.g */
/* loaded from: classes.dex */
public class C2350g<K, V> implements InterfaceC2351h<K, V> {

    /* renamed from: a */
    private static final C2350g f6177a = new C2350g();

    private C2350g() {
    }

    /* renamed from: j */
    public static <K, V> C2350g<K, V> m1970j() {
        return f6177a;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: a */
    public InterfaceC2351h<K, V> mo1968a() {
        return this;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: b */
    public InterfaceC2351h<K, V> mo1967b(K k, V v, Comparator<K> comparator) {
        return new C2354i(k, v);
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: c */
    public boolean mo1969c() {
        return false;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: d */
    public InterfaceC2351h<K, V> mo1966d() {
        return this;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: e */
    public InterfaceC2351h<K, V> mo1965e(K k, V v, InterfaceC2351h.EnumC2352a enumC2352a, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2) {
        return this;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: f */
    public InterfaceC2351h<K, V> mo1964f(K k, Comparator<K> comparator) {
        return this;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: g */
    public InterfaceC2351h<K, V> mo1963g() {
        return this;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public K getKey() {
        return null;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public V getValue() {
        return null;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: h */
    public void mo1962h(InterfaceC2351h.AbstractC2353b<K, V> abstractC2353b) {
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: i */
    public InterfaceC2351h<K, V> mo1961i() {
        return this;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public int size() {
        return 0;
    }
}
