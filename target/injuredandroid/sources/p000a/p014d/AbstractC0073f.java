package p000a.p014d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.d.f */
/* loaded from: classes.dex */
public abstract class AbstractC0073f<K, V> {

    /* renamed from: a */
    AbstractC0073f<K, V>.C0075b f230a;

    /* renamed from: b */
    AbstractC0073f<K, V>.C0076c f231b;

    /* renamed from: c */
    AbstractC0073f<K, V>.C0078e f232c;

    /* renamed from: a.d.f$a */
    /* loaded from: classes.dex */
    final class C0074a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f233f;

        /* renamed from: g */
        int f234g;

        /* renamed from: h */
        int f235h;

        /* renamed from: i */
        boolean f236i = false;

        C0074a(int i) {
            this.f233f = i;
            this.f234g = AbstractC0073f.this.mo9359d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f235h < this.f234g;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC0073f.this.mo9361b(this.f235h, this.f233f);
                this.f235h++;
                this.f236i = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f236i) {
                throw new IllegalStateException();
            }
            int i = this.f235h - 1;
            this.f235h = i;
            this.f234g--;
            this.f236i = false;
            AbstractC0073f.this.mo9355h(i);
        }
    }

    /* renamed from: a.d.f$b */
    /* loaded from: classes.dex */
    final class C0075b implements Set<Map.Entry<K, V>> {
        C0075b() {
        }

        @Override // java.util.Set, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            m9344d((Map.Entry) obj);
            throw null;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo9359d = AbstractC0073f.this.mo9359d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0073f.this.mo9356g(entry.getKey(), entry.getValue());
            }
            return mo9359d != AbstractC0073f.this.mo9359d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0073f.this.mo9362a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int mo9358e = AbstractC0073f.this.mo9358e(entry.getKey());
                if (mo9358e < 0) {
                    return false;
                }
                return C0070c.m9387c(AbstractC0073f.this.mo9361b(mo9358e, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean m9344d(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0073f.m9352k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo9359d = AbstractC0073f.this.mo9359d() - 1; mo9359d >= 0; mo9359d--) {
                Object mo9361b = AbstractC0073f.this.mo9361b(mo9359d, 0);
                Object mo9361b2 = AbstractC0073f.this.mo9361b(mo9359d, 1);
                i += (mo9361b == null ? 0 : mo9361b.hashCode()) ^ (mo9361b2 == null ? 0 : mo9361b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0073f.this.mo9359d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0077d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0073f.this.mo9359d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a.d.f$c */
    /* loaded from: classes.dex */
    final class C0076c implements Set<K> {
        C0076c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC0073f.this.mo9362a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0073f.this.mo9358e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0073f.m9353j(AbstractC0073f.this.mo9360c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC0073f.m9352k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int mo9359d = AbstractC0073f.this.mo9359d() - 1; mo9359d >= 0; mo9359d--) {
                Object mo9361b = AbstractC0073f.this.mo9361b(mo9359d, 0);
                i += mo9361b == null ? 0 : mo9361b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC0073f.this.mo9359d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0074a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo9358e = AbstractC0073f.this.mo9358e(obj);
            if (mo9358e >= 0) {
                AbstractC0073f.this.mo9355h(mo9358e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0073f.m9348o(AbstractC0073f.this.mo9360c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0073f.m9347p(AbstractC0073f.this.mo9360c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC0073f.this.mo9359d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC0073f.this.m9346q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0073f.this.m9345r(tArr, 0);
        }
    }

    /* renamed from: a.d.f$d */
    /* loaded from: classes.dex */
    final class C0077d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f */
        int f240f;

        /* renamed from: h */
        boolean f242h = false;

        /* renamed from: g */
        int f241g = -1;

        C0077d() {
            this.f240f = AbstractC0073f.this.mo9359d() - 1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> m9343a() {
            if (hasNext()) {
                this.f241g++;
                this.f242h = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f242h) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return C0070c.m9387c(entry.getKey(), AbstractC0073f.this.mo9361b(this.f241g, 0)) && C0070c.m9387c(entry.getValue(), AbstractC0073f.this.mo9361b(this.f241g, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f242h) {
                return (K) AbstractC0073f.this.mo9361b(this.f241g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f242h) {
                return (V) AbstractC0073f.this.mo9361b(this.f241g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f241g < this.f240f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f242h) {
                Object mo9361b = AbstractC0073f.this.mo9361b(this.f241g, 0);
                Object mo9361b2 = AbstractC0073f.this.mo9361b(this.f241g, 1);
                return (mo9361b == null ? 0 : mo9361b.hashCode()) ^ (mo9361b2 != null ? mo9361b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            m9343a();
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f242h) {
                throw new IllegalStateException();
            }
            AbstractC0073f.this.mo9355h(this.f241g);
            this.f241g--;
            this.f240f--;
            this.f242h = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f242h) {
                return (V) AbstractC0073f.this.mo9354i(this.f241g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: a.d.f$e */
    /* loaded from: classes.dex */
    final class C0078e implements Collection<V> {
        C0078e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC0073f.this.mo9362a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC0073f.this.mo9357f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC0073f.this.mo9359d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0074a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo9357f = AbstractC0073f.this.mo9357f(obj);
            if (mo9357f >= 0) {
                AbstractC0073f.this.mo9355h(mo9357f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo9359d = AbstractC0073f.this.mo9359d();
            int i = 0;
            boolean z = false;
            while (i < mo9359d) {
                if (collection.contains(AbstractC0073f.this.mo9361b(i, 1))) {
                    AbstractC0073f.this.mo9355h(i);
                    i--;
                    mo9359d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo9359d = AbstractC0073f.this.mo9359d();
            int i = 0;
            boolean z = false;
            while (i < mo9359d) {
                if (!collection.contains(AbstractC0073f.this.mo9361b(i, 1))) {
                    AbstractC0073f.this.mo9355h(i);
                    i--;
                    mo9359d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC0073f.this.mo9359d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC0073f.this.m9346q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0073f.this.m9345r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m9353j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m9352k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m9348o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m9347p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    protected abstract void mo9362a();

    /* renamed from: b */
    protected abstract Object mo9361b(int i, int i2);

    /* renamed from: c */
    protected abstract Map<K, V> mo9360c();

    /* renamed from: d */
    protected abstract int mo9359d();

    /* renamed from: e */
    protected abstract int mo9358e(Object obj);

    /* renamed from: f */
    protected abstract int mo9357f(Object obj);

    /* renamed from: g */
    protected abstract void mo9356g(K k, V v);

    /* renamed from: h */
    protected abstract void mo9355h(int i);

    /* renamed from: i */
    protected abstract V mo9354i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m9351l() {
        if (this.f230a == null) {
            this.f230a = new C0075b();
        }
        return this.f230a;
    }

    /* renamed from: m */
    public Set<K> m9350m() {
        if (this.f231b == null) {
            this.f231b = new C0076c();
        }
        return this.f231b;
    }

    /* renamed from: n */
    public Collection<V> m9349n() {
        if (this.f232c == null) {
            this.f232c = new C0078e();
        }
        return this.f232c;
    }

    /* renamed from: q */
    public Object[] m9346q(int i) {
        int mo9359d = mo9359d();
        Object[] objArr = new Object[mo9359d];
        for (int i2 = 0; i2 < mo9359d; i2++) {
            objArr[i2] = mo9361b(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public <T> T[] m9345r(T[] tArr, int i) {
        int mo9359d = mo9359d();
        if (tArr.length < mo9359d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo9359d));
        }
        for (int i2 = 0; i2 < mo9359d; i2++) {
            tArr[i2] = mo9361b(i2, i);
        }
        if (tArr.length > mo9359d) {
            tArr[mo9359d] = null;
        }
        return tArr;
    }
}
