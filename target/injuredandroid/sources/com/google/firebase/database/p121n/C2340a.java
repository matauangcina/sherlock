package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.AbstractC2343c;
import com.google.firebase.database.p121n.InterfaceC2351h;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.n.a */
/* loaded from: classes.dex */
public class C2340a<K, V> extends AbstractC2343c<K, V> {

    /* renamed from: f */
    private final K[] f6163f;

    /* renamed from: g */
    private final V[] f6164g;

    /* renamed from: h */
    private final Comparator<K> f6165h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.n.a$a */
    /* loaded from: classes.dex */
    public class C2341a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f */
        int f6166f;

        /* renamed from: g */
        final /* synthetic */ int f6167g;

        /* renamed from: h */
        final /* synthetic */ boolean f6168h;

        C2341a(int i, boolean z) {
            this.f6167g = i;
            this.f6168h = z;
            this.f6166f = this.f6167g;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            Object obj = C2340a.this.f6163f[this.f6166f];
            Object[] objArr = C2340a.this.f6164g;
            int i = this.f6166f;
            Object obj2 = objArr[i];
            this.f6166f = this.f6168h ? i - 1 : i + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6168h) {
                if (this.f6166f >= 0) {
                    return true;
                }
            } else if (this.f6166f < C2340a.this.f6163f.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public C2340a(Comparator<K> comparator) {
        this.f6163f = (K[]) new Object[0];
        this.f6164g = (V[]) new Object[0];
        this.f6165h = comparator;
    }

    private C2340a(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f6163f = kArr;
        this.f6164g = vArr;
        this.f6165h = comparator;
    }

    /* renamed from: A */
    private int m1995A(K k) {
        int i = 0;
        for (K k2 : this.f6163f) {
            if (this.f6165h.compare(k, k2) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: B */
    private int m1994B(K k) {
        int i = 0;
        while (true) {
            K[] kArr = this.f6163f;
            if (i >= kArr.length || this.f6165h.compare(kArr[i], k) >= 0) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: C */
    public static <K, V> C2340a<K, V> m1993C(Map<K, V> map, Comparator<K> comparator) {
        return m1986z(new ArrayList(map.keySet()), map, AbstractC2343c.C2344a.m1980d(), comparator);
    }

    /* renamed from: D */
    private Iterator<Map.Entry<K, V>> m1992D(int i, boolean z) {
        return new C2341a(i, z);
    }

    /* renamed from: E */
    private static <T> T[] m1991E(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    /* renamed from: F */
    private static <T> T[] m1990F(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    /* renamed from: y */
    private static <T> T[] m1987y(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (length - i) - 1);
        return tArr2;
    }

    /* renamed from: z */
    public static <A, B, C> C2340a<A, C> m1986z(List<A> list, Map<B, C> map, AbstractC2343c.C2344a.InterfaceC2345a<A, B> interfaceC2345a, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A a : list) {
            objArr[i] = a;
            interfaceC2345a.mo1978a(a);
            objArr2[i] = map.get(a);
            i++;
        }
        return new C2340a<>(comparator, objArr, objArr2);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: d */
    public boolean mo1948d(K k) {
        return m1995A(k) != -1;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: e */
    public V mo1947e(K k) {
        int m1995A = m1995A(k);
        if (m1995A != -1) {
            return this.f6164g[m1995A];
        }
        return null;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: f */
    public Comparator<K> mo1946f() {
        return this.f6165h;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: g */
    public K mo1945g() {
        K[] kArr = this.f6163f;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: i */
    public K mo1944i() {
        K[] kArr = this.f6163f;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    public boolean isEmpty() {
        return this.f6163f.length == 0;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return m1992D(0, false);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: l */
    public K mo1943l(K k) {
        int m1995A = m1995A(k);
        if (m1995A != -1) {
            if (m1995A > 0) {
                return this.f6163f[m1995A - 1];
            }
            return null;
        }
        throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: m */
    public void mo1942m(InterfaceC2351h.AbstractC2353b<K, V> abstractC2353b) {
        int i = 0;
        while (true) {
            K[] kArr = this.f6163f;
            if (i >= kArr.length) {
                return;
            }
            abstractC2353b.mo1147a(kArr[i], this.f6164g[i]);
            i++;
        }
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: s */
    public AbstractC2343c<K, V> mo1941s(K k, V v) {
        int m1995A = m1995A(k);
        if (m1995A != -1) {
            if (this.f6163f[m1995A] == k && this.f6164g[m1995A] == v) {
                return this;
            }
            return new C2340a(this.f6165h, m1990F(this.f6163f, m1995A, k), m1990F(this.f6164g, m1995A, v));
        } else if (this.f6163f.length <= 25) {
            int m1994B = m1994B(k);
            return new C2340a(this.f6165h, m1987y(this.f6163f, m1994B, k), m1987y(this.f6164g, m1994B, v));
        } else {
            HashMap hashMap = new HashMap(this.f6163f.length + 1);
            int i = 0;
            while (true) {
                K[] kArr = this.f6163f;
                if (i >= kArr.length) {
                    hashMap.put(k, v);
                    return C2356k.m1937x(hashMap, this.f6165h);
                }
                hashMap.put(kArr[i], this.f6164g[i]);
                i++;
            }
        }
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    public int size() {
        return this.f6163f.length;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: t */
    public Iterator<Map.Entry<K, V>> mo1940t() {
        return m1992D(this.f6163f.length - 1, true);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: u */
    public AbstractC2343c<K, V> mo1939u(K k) {
        int m1995A = m1995A(k);
        if (m1995A == -1) {
            return this;
        }
        return new C2340a(this.f6165h, m1991E(this.f6163f, m1995A), m1991E(this.f6164g, m1995A));
    }
}
