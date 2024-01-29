package p000a.p014d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: a.d.b */
/* loaded from: classes.dex */
public final class C0068b<E> implements Collection<E>, Set<E> {

    /* renamed from: j */
    private static final int[] f203j = new int[0];

    /* renamed from: k */
    private static final Object[] f204k = new Object[0];

    /* renamed from: l */
    private static Object[] f205l;

    /* renamed from: m */
    private static int f206m;

    /* renamed from: n */
    private static Object[] f207n;

    /* renamed from: o */
    private static int f208o;

    /* renamed from: f */
    private int[] f209f;

    /* renamed from: g */
    Object[] f210g;

    /* renamed from: h */
    int f211h;

    /* renamed from: i */
    private AbstractC0073f<E, E> f212i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.d.b$a */
    /* loaded from: classes.dex */
    public class C0069a extends AbstractC0073f<E, E> {
        C0069a() {
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: a */
        protected void mo9362a() {
            C0068b.this.clear();
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: b */
        protected Object mo9361b(int i, int i2) {
            return C0068b.this.f210g[i];
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: c */
        protected Map<E, E> mo9360c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: d */
        protected int mo9359d() {
            return C0068b.this.f211h;
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: e */
        protected int mo9358e(Object obj) {
            return C0068b.this.indexOf(obj);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: f */
        protected int mo9357f(Object obj) {
            return C0068b.this.indexOf(obj);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: g */
        protected void mo9356g(E e, E e2) {
            C0068b.this.add(e);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: h */
        protected void mo9355h(int i) {
            C0068b.this.m9391m(i);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: i */
        protected E mo9354i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0068b() {
        this(0);
    }

    public C0068b(int i) {
        if (i == 0) {
            this.f209f = f203j;
            this.f210g = f204k;
        } else {
            m9397d(i);
        }
        this.f211h = 0;
    }

    /* renamed from: d */
    private void m9397d(int i) {
        if (i == 8) {
            synchronized (C0068b.class) {
                if (f207n != null) {
                    Object[] objArr = f207n;
                    this.f210g = objArr;
                    f207n = (Object[]) objArr[0];
                    this.f209f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f208o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0068b.class) {
                if (f205l != null) {
                    Object[] objArr2 = f205l;
                    this.f210g = objArr2;
                    f205l = (Object[]) objArr2[0];
                    this.f209f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f206m--;
                    return;
                }
            }
        }
        this.f209f = new int[i];
        this.f210g = new Object[i];
    }

    /* renamed from: f */
    private static void m9395f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0068b.class) {
                if (f208o < 10) {
                    objArr[0] = f207n;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f207n = objArr;
                    f208o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0068b.class) {
                if (f206m < 10) {
                    objArr[0] = f205l;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f205l = objArr;
                    f206m++;
                }
            }
        }
    }

    /* renamed from: g */
    private AbstractC0073f<E, E> m9394g() {
        if (this.f212i == null) {
            this.f212i = new C0069a();
        }
        return this.f212i;
    }

    /* renamed from: i */
    private int m9393i(Object obj, int i) {
        int i2 = this.f211h;
        if (i2 == 0) {
            return -1;
        }
        int m9389a = C0070c.m9389a(this.f209f, i2, i);
        if (m9389a >= 0 && !obj.equals(this.f210g[m9389a])) {
            int i3 = m9389a + 1;
            while (i3 < i2 && this.f209f[i3] == i) {
                if (obj.equals(this.f210g[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m9389a - 1; i4 >= 0 && this.f209f[i4] == i; i4--) {
                if (obj.equals(this.f210g[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return m9389a;
    }

    /* renamed from: l */
    private int m9392l() {
        int i = this.f211h;
        if (i == 0) {
            return -1;
        }
        int m9389a = C0070c.m9389a(this.f209f, i, 0);
        if (m9389a >= 0 && this.f210g[m9389a] != null) {
            int i2 = m9389a + 1;
            while (i2 < i && this.f209f[i2] == 0) {
                if (this.f210g[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = m9389a - 1; i3 >= 0 && this.f209f[i3] == 0; i3--) {
                if (this.f210g[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return m9389a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int m9393i;
        if (e == null) {
            m9393i = m9392l();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            m9393i = m9393i(e, hashCode);
        }
        if (m9393i >= 0) {
            return false;
        }
        int i2 = ~m9393i;
        int i3 = this.f211h;
        if (i3 >= this.f209f.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f209f;
            Object[] objArr = this.f210g;
            m9397d(i4);
            int[] iArr2 = this.f209f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f210g, 0, objArr.length);
            }
            m9395f(iArr, objArr, this.f211h);
        }
        int i5 = this.f211h;
        if (i2 < i5) {
            int[] iArr3 = this.f209f;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f210g;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f211h - i2);
        }
        this.f209f[i2] = i;
        this.f210g[i2] = e;
        this.f211h++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m9396e(this.f211h + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f211h;
        if (i != 0) {
            m9395f(this.f209f, this.f210g, i);
            this.f209f = f203j;
            this.f210g = f204k;
            this.f211h = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void m9396e(int i) {
        int[] iArr = this.f209f;
        if (iArr.length < i) {
            Object[] objArr = this.f210g;
            m9397d(i);
            int i2 = this.f211h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f209f, 0, i2);
                System.arraycopy(objArr, 0, this.f210g, 0, this.f211h);
            }
            m9395f(iArr, objArr, this.f211h);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f211h; i++) {
                try {
                    if (!set.contains(m9390s(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f209f;
        int i = this.f211h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m9392l() : m9393i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f211h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m9394g().m9350m().iterator();
    }

    /* renamed from: m */
    public E m9391m(int i) {
        Object[] objArr = this.f210g;
        E e = (E) objArr[i];
        int i2 = this.f211h;
        if (i2 <= 1) {
            m9395f(this.f209f, objArr, i2);
            this.f209f = f203j;
            this.f210g = f204k;
            this.f211h = 0;
        } else {
            int[] iArr = this.f209f;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = this.f211h - 1;
                this.f211h = i3;
                if (i < i3) {
                    int[] iArr2 = this.f209f;
                    int i4 = i + 1;
                    System.arraycopy(iArr2, i4, iArr2, i, i3 - i);
                    Object[] objArr2 = this.f210g;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f211h - i);
                }
                this.f210g[this.f211h] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr3 = this.f209f;
                Object[] objArr3 = this.f210g;
                m9397d(i5);
                this.f211h--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f209f, 0, i);
                    System.arraycopy(objArr3, 0, this.f210g, 0, i);
                }
                int i6 = this.f211h;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f209f, i, i6 - i);
                    System.arraycopy(objArr3, i7, this.f210g, i, this.f211h - i);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m9391m(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f211h - 1; i >= 0; i--) {
            if (!collection.contains(this.f210g[i])) {
                m9391m(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: s */
    public E m9390s(int i) {
        return (E) this.f210g[i];
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f211h;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f211h;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f210g, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f211h) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f211h));
        }
        System.arraycopy(this.f210g, 0, tArr, 0, this.f211h);
        int length = tArr.length;
        int i = this.f211h;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f211h * 14);
        sb.append('{');
        for (int i = 0; i < this.f211h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E m9390s = m9390s(i);
            if (m9390s != this) {
                sb.append(m9390s);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
