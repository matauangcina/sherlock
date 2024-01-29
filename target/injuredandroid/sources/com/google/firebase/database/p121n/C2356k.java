package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.AbstractC2343c;
import com.google.firebase.database.p121n.InterfaceC2351h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.n.k */
/* loaded from: classes.dex */
public class C2356k<K, V> extends AbstractC2343c<K, V> {

    /* renamed from: f */
    private InterfaceC2351h<K, V> f6185f;

    /* renamed from: g */
    private Comparator<K> f6186g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.n.k$b */
    /* loaded from: classes.dex */
    public static class C2358b<A, B, C> {

        /* renamed from: a */
        private final List<A> f6187a;

        /* renamed from: b */
        private final Map<B, C> f6188b;

        /* renamed from: c */
        private final AbstractC2343c.C2344a.InterfaceC2345a<A, B> f6189c;

        /* renamed from: d */
        private AbstractC2355j<A, C> f6190d;

        /* renamed from: e */
        private AbstractC2355j<A, C> f6191e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.firebase.database.n.k$b$a */
        /* loaded from: classes.dex */
        public static class C2359a implements Iterable<C2361b> {

            /* renamed from: f */
            private long f6192f;

            /* renamed from: g */
            private final int f6193g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.firebase.database.n.k$b$a$a */
            /* loaded from: classes.dex */
            public class C2360a implements Iterator<C2361b> {

                /* renamed from: f */
                private int f6194f;

                C2360a() {
                    this.f6194f = C2359a.this.f6193g - 1;
                }

                @Override // java.util.Iterator
                /* renamed from: a */
                public C2361b next() {
                    C2361b c2361b = new C2361b();
                    c2361b.f6196a = (C2359a.this.f6192f & ((long) (1 << this.f6194f))) == 0;
                    c2361b.f6197b = (int) Math.pow(2.0d, this.f6194f);
                    this.f6194f--;
                    return c2361b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f6194f >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }

            public C2359a(int i) {
                int i2 = i + 1;
                int floor = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
                this.f6193g = floor;
                this.f6192f = (((long) Math.pow(2.0d, floor)) - 1) & i2;
            }

            @Override // java.lang.Iterable
            public Iterator<C2361b> iterator() {
                return new C2360a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.firebase.database.n.k$b$b */
        /* loaded from: classes.dex */
        public static class C2361b {

            /* renamed from: a */
            public boolean f6196a;

            /* renamed from: b */
            public int f6197b;

            C2361b() {
            }
        }

        private C2358b(List<A> list, Map<B, C> map, AbstractC2343c.C2344a.InterfaceC2345a<A, B> interfaceC2345a) {
            this.f6187a = list;
            this.f6188b = map;
            this.f6189c = interfaceC2345a;
        }

        /* renamed from: a */
        private InterfaceC2351h<A, C> m1935a(int i, int i2) {
            if (i2 == 0) {
                return C2350g.m1970j();
            }
            if (i2 == 1) {
                A a = this.f6187a.get(i);
                return new C2349f(a, m1932d(a), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            InterfaceC2351h<A, C> m1935a = m1935a(i, i3);
            InterfaceC2351h<A, C> m1935a2 = m1935a(i4 + 1, i3);
            A a2 = this.f6187a.get(i4);
            return new C2349f(a2, m1932d(a2), m1935a, m1935a2);
        }

        /* renamed from: b */
        public static <A, B, C> C2356k<A, C> m1934b(List<A> list, Map<B, C> map, AbstractC2343c.C2344a.InterfaceC2345a<A, B> interfaceC2345a, Comparator<A> comparator) {
            C2358b c2358b = new C2358b(list, map, interfaceC2345a);
            Collections.sort(list, comparator);
            Iterator<C2361b> it = new C2359a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C2361b next = it.next();
                int i = next.f6197b;
                size -= i;
                if (next.f6196a) {
                    c2358b.m1933c(InterfaceC2351h.EnumC2352a.BLACK, i, size);
                } else {
                    c2358b.m1933c(InterfaceC2351h.EnumC2352a.BLACK, i, size);
                    int i2 = next.f6197b;
                    size -= i2;
                    c2358b.m1933c(InterfaceC2351h.EnumC2352a.RED, i2, size);
                }
            }
            InterfaceC2351h interfaceC2351h = c2358b.f6190d;
            if (interfaceC2351h == null) {
                interfaceC2351h = C2350g.m1970j();
            }
            return new C2356k<>(interfaceC2351h, comparator);
        }

        /* renamed from: c */
        private void m1933c(InterfaceC2351h.EnumC2352a enumC2352a, int i, int i2) {
            InterfaceC2351h<A, C> m1935a = m1935a(i2 + 1, i - 1);
            A a = this.f6187a.get(i2);
            AbstractC2355j<A, C> c2354i = enumC2352a == InterfaceC2351h.EnumC2352a.RED ? new C2354i<>(a, m1932d(a), null, m1935a) : new C2349f<>(a, m1932d(a), null, m1935a);
            if (this.f6190d == null) {
                this.f6190d = c2354i;
            } else {
                this.f6191e.mo1949u(c2354i);
            }
            this.f6191e = c2354i;
        }

        /* renamed from: d */
        private C m1932d(A a) {
            Map<B, C> map = this.f6188b;
            this.f6189c.mo1978a(a);
            return map.get(a);
        }
    }

    private C2356k(InterfaceC2351h<K, V> interfaceC2351h, Comparator<K> comparator) {
        this.f6185f = interfaceC2351h;
        this.f6186g = comparator;
    }

    /* renamed from: w */
    public static <A, B, C> C2356k<A, C> m1938w(List<A> list, Map<B, C> map, AbstractC2343c.C2344a.InterfaceC2345a<A, B> interfaceC2345a, Comparator<A> comparator) {
        return C2358b.m1934b(list, map, interfaceC2345a, comparator);
    }

    /* renamed from: x */
    public static <A, B> C2356k<A, B> m1937x(Map<A, B> map, Comparator<A> comparator) {
        return C2358b.m1934b(new ArrayList(map.keySet()), map, AbstractC2343c.C2344a.m1980d(), comparator);
    }

    /* renamed from: y */
    private InterfaceC2351h<K, V> m1936y(K k) {
        InterfaceC2351h<K, V> interfaceC2351h = this.f6185f;
        while (!interfaceC2351h.isEmpty()) {
            int compare = this.f6186g.compare(k, interfaceC2351h.getKey());
            if (compare < 0) {
                interfaceC2351h = interfaceC2351h.mo1968a();
            } else if (compare == 0) {
                return interfaceC2351h;
            } else {
                interfaceC2351h = interfaceC2351h.mo1966d();
            }
        }
        return null;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: d */
    public boolean mo1948d(K k) {
        return m1936y(k) != null;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: e */
    public V mo1947e(K k) {
        InterfaceC2351h<K, V> m1936y = m1936y(k);
        if (m1936y != null) {
            return m1936y.getValue();
        }
        return null;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: f */
    public Comparator<K> mo1946f() {
        return this.f6186g;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: g */
    public K mo1945g() {
        return this.f6185f.mo1961i().getKey();
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: i */
    public K mo1944i() {
        return this.f6185f.mo1963g().getKey();
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    public boolean isEmpty() {
        return this.f6185f.isEmpty();
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C2346d(this.f6185f, null, this.f6186g, false);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: l */
    public K mo1943l(K k) {
        InterfaceC2351h<K, V> interfaceC2351h = this.f6185f;
        InterfaceC2351h<K, V> interfaceC2351h2 = null;
        while (!interfaceC2351h.isEmpty()) {
            int compare = this.f6186g.compare(k, interfaceC2351h.getKey());
            if (compare == 0) {
                if (interfaceC2351h.mo1968a().isEmpty()) {
                    if (interfaceC2351h2 != null) {
                        return interfaceC2351h2.getKey();
                    }
                    return null;
                }
                InterfaceC2351h<K, V> mo1968a = interfaceC2351h.mo1968a();
                while (!mo1968a.mo1966d().isEmpty()) {
                    mo1968a = mo1968a.mo1966d();
                }
                return mo1968a.getKey();
            } else if (compare < 0) {
                interfaceC2351h = interfaceC2351h.mo1968a();
            } else {
                interfaceC2351h2 = interfaceC2351h;
                interfaceC2351h = interfaceC2351h.mo1966d();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + k);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: m */
    public void mo1942m(InterfaceC2351h.AbstractC2353b<K, V> abstractC2353b) {
        this.f6185f.mo1962h(abstractC2353b);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: s */
    public AbstractC2343c<K, V> mo1941s(K k, V v) {
        return new C2356k(this.f6185f.mo1967b(k, v, this.f6186g).mo1965e(null, null, InterfaceC2351h.EnumC2352a.BLACK, null, null), this.f6186g);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    public int size() {
        return this.f6185f.size();
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: t */
    public Iterator<Map.Entry<K, V>> mo1940t() {
        return new C2346d(this.f6185f, null, this.f6186g, true);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2343c
    /* renamed from: u */
    public AbstractC2343c<K, V> mo1939u(K k) {
        return !mo1948d(k) ? this : new C2356k(this.f6185f.mo1964f(k, this.f6186g).mo1965e(null, null, InterfaceC2351h.EnumC2352a.BLACK, null, null), this.f6186g);
    }
}
