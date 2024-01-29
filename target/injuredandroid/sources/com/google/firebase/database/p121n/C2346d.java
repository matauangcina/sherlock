package com.google.firebase.database.p121n;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: com.google.firebase.database.n.d */
/* loaded from: classes.dex */
public class C2346d<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f */
    private final ArrayDeque<AbstractC2355j<K, V>> f6172f = new ArrayDeque<>();

    /* renamed from: g */
    private final boolean f6173g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2346d(InterfaceC2351h<K, V> interfaceC2351h, K k, Comparator<K> comparator, boolean z) {
        int i;
        this.f6173g = z;
        while (!interfaceC2351h.isEmpty()) {
            if (k != null) {
                K key = interfaceC2351h.getKey();
                i = z ? comparator.compare(k, key) : comparator.compare(key, k);
            } else {
                i = 1;
            }
            if (i < 0) {
                interfaceC2351h = z ? interfaceC2351h.mo1968a() : interfaceC2351h.mo1966d();
            } else if (i == 0) {
                this.f6172f.push((AbstractC2355j) interfaceC2351h);
                return;
            } else {
                this.f6172f.push((AbstractC2355j) interfaceC2351h);
                if (z) {
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public Map.Entry<K, V> next() {
        try {
            AbstractC2355j<K, V> pop = this.f6172f.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.f6173g) {
                for (InterfaceC2351h<K, V> mo1968a = pop.mo1968a(); !mo1968a.isEmpty(); mo1968a = mo1968a.mo1966d()) {
                    this.f6172f.push((AbstractC2355j) mo1968a);
                }
            } else {
                for (InterfaceC2351h<K, V> mo1966d = pop.mo1966d(); !mo1966d.isEmpty(); mo1966d = mo1966d.mo1968a()) {
                    this.f6172f.push((AbstractC2355j) mo1966d);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6172f.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
