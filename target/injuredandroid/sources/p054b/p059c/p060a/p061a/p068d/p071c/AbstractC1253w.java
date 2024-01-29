package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: b.c.a.a.d.c.w */
/* loaded from: classes.dex */
public abstract class AbstractC1253w<E> extends AbstractC1256x<E> implements List<E>, RandomAccess {

    /* renamed from: g */
    private static final AbstractC1218k0<Object> f4015g = new C1262z(C1188c0.f3917j, 0);

    /* renamed from: l */
    public static <E> AbstractC1253w<E> m4647l() {
        return (AbstractC1253w<E>) C1188c0.f3917j;
    }

    /* renamed from: s */
    public static <E> AbstractC1253w<E> m4646s(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8};
        for (int i = 0; i < 8; i++) {
            if (objArr[i] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return new C1188c0(objArr, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static <E> AbstractC1253w<E> m4645u(Object[] objArr) {
        int length = objArr.length;
        return length == 0 ? (AbstractC1253w<E>) C1188c0.f3917j : new C1188c0(objArr, length);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: d */
    public int mo4641d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public final AbstractC1221l0<E> iterator() {
        return (AbstractC1218k0) listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        C1223m.m4697c(this);
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (C1217k.m4704a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = get(i2);
                        i2++;
                        if (!C1217k.m4704a(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (AbstractC1218k0) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        C1223m.m4695e(i, size());
        return isEmpty() ? f4015g : new C1262z(this, i);
    }

    @Override // java.util.List
    /* renamed from: m */
    public AbstractC1253w<E> subList(int i, int i2) {
        C1223m.m4696d(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? (AbstractC1253w<E>) C1188c0.f3917j : new C1259y(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
