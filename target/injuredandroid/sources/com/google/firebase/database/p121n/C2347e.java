package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.AbstractC2343c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.n.e */
/* loaded from: classes.dex */
public class C2347e<T> implements Iterable<T> {

    /* renamed from: f */
    private final AbstractC2343c<T, Void> f6174f;

    /* renamed from: com.google.firebase.database.n.e$a */
    /* loaded from: classes.dex */
    private static class C2348a<T> implements Iterator<T> {

        /* renamed from: f */
        final Iterator<Map.Entry<T, Void>> f6175f;

        public C2348a(Iterator<Map.Entry<T, Void>> it) {
            this.f6175f = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6175f.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f6175f.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f6175f.remove();
        }
    }

    private C2347e(AbstractC2343c<T, Void> abstractC2343c) {
        this.f6174f = abstractC2343c;
    }

    public C2347e(List<T> list, Comparator<T> comparator) {
        this.f6174f = AbstractC2343c.C2344a.m1983a(list, Collections.emptyMap(), AbstractC2343c.C2344a.m1980d(), comparator);
    }

    /* renamed from: d */
    public T m1976d() {
        return this.f6174f.mo1945g();
    }

    /* renamed from: e */
    public T m1975e() {
        return this.f6174f.mo1944i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2347e) {
            return this.f6174f.equals(((C2347e) obj).f6174f);
        }
        return false;
    }

    /* renamed from: f */
    public T m1974f(T t) {
        return this.f6174f.mo1943l(t);
    }

    /* renamed from: g */
    public C2347e<T> m1973g(T t) {
        return new C2347e<>(this.f6174f.mo1941s(t, null));
    }

    public int hashCode() {
        return this.f6174f.hashCode();
    }

    /* renamed from: i */
    public C2347e<T> m1972i(T t) {
        AbstractC2343c<T, Void> mo1939u = this.f6174f.mo1939u(t);
        return mo1939u == this.f6174f ? this : new C2347e<>(mo1939u);
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new C2348a(this.f6174f.iterator());
    }

    /* renamed from: t */
    public Iterator<T> m1971t() {
        return new C2348a(this.f6174f.mo1940t());
    }
}
