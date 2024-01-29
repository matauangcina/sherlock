package p000a.p008b.p009a.p011b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: a.b.a.b.b */
/* loaded from: classes.dex */
public class C0048b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f */
    C0051c<K, V> f152f;

    /* renamed from: g */
    private C0051c<K, V> f153g;

    /* renamed from: h */
    private WeakHashMap<InterfaceC0054f<K, V>, Boolean> f154h = new WeakHashMap<>();

    /* renamed from: i */
    private int f155i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.a.b.b$a */
    /* loaded from: classes.dex */
    public static class C0049a<K, V> extends AbstractC0053e<K, V> {
        C0049a(C0051c<K, V> c0051c, C0051c<K, V> c0051c2) {
            super(c0051c, c0051c2);
        }

        @Override // p000a.p008b.p009a.p011b.C0048b.AbstractC0053e
        /* renamed from: b */
        C0051c<K, V> mo9457b(C0051c<K, V> c0051c) {
            return c0051c.f159i;
        }

        @Override // p000a.p008b.p009a.p011b.C0048b.AbstractC0053e
        /* renamed from: c */
        C0051c<K, V> mo9456c(C0051c<K, V> c0051c) {
            return c0051c.f158h;
        }
    }

    /* renamed from: a.b.a.b.b$b */
    /* loaded from: classes.dex */
    private static class C0050b<K, V> extends AbstractC0053e<K, V> {
        C0050b(C0051c<K, V> c0051c, C0051c<K, V> c0051c2) {
            super(c0051c, c0051c2);
        }

        @Override // p000a.p008b.p009a.p011b.C0048b.AbstractC0053e
        /* renamed from: b */
        C0051c<K, V> mo9457b(C0051c<K, V> c0051c) {
            return c0051c.f158h;
        }

        @Override // p000a.p008b.p009a.p011b.C0048b.AbstractC0053e
        /* renamed from: c */
        C0051c<K, V> mo9456c(C0051c<K, V> c0051c) {
            return c0051c.f159i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.a.b.b$c */
    /* loaded from: classes.dex */
    public static class C0051c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        final K f156f;

        /* renamed from: g */
        final V f157g;

        /* renamed from: h */
        C0051c<K, V> f158h;

        /* renamed from: i */
        C0051c<K, V> f159i;

        C0051c(K k, V v) {
            this.f156f = k;
            this.f157g = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0051c) {
                C0051c c0051c = (C0051c) obj;
                return this.f156f.equals(c0051c.f156f) && this.f157g.equals(c0051c.f157g);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f156f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f157g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f156f.hashCode() ^ this.f157g.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f156f + "=" + this.f157g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.b.a.b.b$d */
    /* loaded from: classes.dex */
    public class C0052d implements Iterator<Map.Entry<K, V>>, InterfaceC0054f<K, V> {

        /* renamed from: f */
        private C0051c<K, V> f160f;

        /* renamed from: g */
        private boolean f161g = true;

        C0052d() {
        }

        @Override // p000a.p008b.p009a.p011b.C0048b.InterfaceC0054f
        /* renamed from: a */
        public void mo9453a(C0051c<K, V> c0051c) {
            C0051c<K, V> c0051c2 = this.f160f;
            if (c0051c == c0051c2) {
                C0051c<K, V> c0051c3 = c0051c2.f159i;
                this.f160f = c0051c3;
                this.f161g = c0051c3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C0051c<K, V> c0051c;
            if (this.f161g) {
                this.f161g = false;
                c0051c = C0048b.this.f152f;
            } else {
                C0051c<K, V> c0051c2 = this.f160f;
                c0051c = c0051c2 != null ? c0051c2.f158h : null;
            }
            this.f160f = c0051c;
            return this.f160f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f161g) {
                return C0048b.this.f152f != null;
            }
            C0051c<K, V> c0051c = this.f160f;
            return (c0051c == null || c0051c.f158h == null) ? false : true;
        }
    }

    /* renamed from: a.b.a.b.b$e */
    /* loaded from: classes.dex */
    private static abstract class AbstractC0053e<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC0054f<K, V> {

        /* renamed from: f */
        C0051c<K, V> f163f;

        /* renamed from: g */
        C0051c<K, V> f164g;

        AbstractC0053e(C0051c<K, V> c0051c, C0051c<K, V> c0051c2) {
            this.f163f = c0051c2;
            this.f164g = c0051c;
        }

        /* renamed from: e */
        private C0051c<K, V> m9454e() {
            C0051c<K, V> c0051c = this.f164g;
            C0051c<K, V> c0051c2 = this.f163f;
            if (c0051c == c0051c2 || c0051c2 == null) {
                return null;
            }
            return mo9456c(c0051c);
        }

        @Override // p000a.p008b.p009a.p011b.C0048b.InterfaceC0054f
        /* renamed from: a */
        public void mo9453a(C0051c<K, V> c0051c) {
            if (this.f163f == c0051c && c0051c == this.f164g) {
                this.f164g = null;
                this.f163f = null;
            }
            C0051c<K, V> c0051c2 = this.f163f;
            if (c0051c2 == c0051c) {
                this.f163f = mo9457b(c0051c2);
            }
            if (this.f164g == c0051c) {
                this.f164g = m9454e();
            }
        }

        /* renamed from: b */
        abstract C0051c<K, V> mo9457b(C0051c<K, V> c0051c);

        /* renamed from: c */
        abstract C0051c<K, V> mo9456c(C0051c<K, V> c0051c);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C0051c<K, V> c0051c = this.f164g;
            this.f164g = m9454e();
            return c0051c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f164g != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.b.a.b.b$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0054f<K, V> {
        /* renamed from: a */
        void mo9453a(C0051c<K, V> c0051c);
    }

    /* renamed from: d */
    public Iterator<Map.Entry<K, V>> m9466d() {
        C0050b c0050b = new C0050b(this.f153g, this.f152f);
        this.f154h.put(c0050b, Boolean.FALSE);
        return c0050b;
    }

    /* renamed from: e */
    public Map.Entry<K, V> m9465e() {
        return this.f152f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0048b) {
            C0048b c0048b = (C0048b) obj;
            if (size() != c0048b.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = c0048b.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    /* renamed from: f */
    protected C0051c<K, V> mo9464f(K k) {
        C0051c<K, V> c0051c = this.f152f;
        while (c0051c != null && !c0051c.f156f.equals(k)) {
            c0051c = c0051c.f158h;
        }
        return c0051c;
    }

    /* renamed from: g */
    public C0048b<K, V>.C0052d m9463g() {
        C0048b<K, V>.C0052d c0052d = new C0052d();
        this.f154h.put(c0052d, Boolean.FALSE);
        return c0052d;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public Map.Entry<K, V> m9462i() {
        return this.f153g;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C0049a c0049a = new C0049a(this.f152f, this.f153g);
        this.f154h.put(c0049a, Boolean.FALSE);
        return c0049a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public C0051c<K, V> m9461l(K k, V v) {
        C0051c<K, V> c0051c = new C0051c<>(k, v);
        this.f155i++;
        C0051c<K, V> c0051c2 = this.f153g;
        if (c0051c2 == null) {
            this.f152f = c0051c;
        } else {
            c0051c2.f158h = c0051c;
            c0051c.f159i = c0051c2;
        }
        this.f153g = c0051c;
        return c0051c;
    }

    /* renamed from: m */
    public V mo9460m(K k, V v) {
        C0051c<K, V> mo9464f = mo9464f(k);
        if (mo9464f != null) {
            return mo9464f.f157g;
        }
        m9461l(k, v);
        return null;
    }

    /* renamed from: s */
    public V mo9459s(K k) {
        C0051c<K, V> mo9464f = mo9464f(k);
        if (mo9464f == null) {
            return null;
        }
        this.f155i--;
        if (!this.f154h.isEmpty()) {
            for (InterfaceC0054f<K, V> interfaceC0054f : this.f154h.keySet()) {
                interfaceC0054f.mo9453a(mo9464f);
            }
        }
        C0051c<K, V> c0051c = mo9464f.f159i;
        if (c0051c != null) {
            c0051c.f158h = mo9464f.f158h;
        } else {
            this.f152f = mo9464f.f158h;
        }
        C0051c<K, V> c0051c2 = mo9464f.f158h;
        if (c0051c2 != null) {
            c0051c2.f159i = mo9464f.f159i;
        } else {
            this.f153g = mo9464f.f159i;
        }
        mo9464f.f158h = null;
        mo9464f.f159i = null;
        return mo9464f.f157g;
    }

    public int size() {
        return this.f155i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
