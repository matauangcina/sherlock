package p054b.p059c.p060a.p061a.p068d.p071c;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* renamed from: b.c.a.a.d.c.x */
/* loaded from: classes.dex */
public abstract class AbstractC1256x<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: f */
    private static final Object[] f4018f = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    int mo4641d(Object[] objArr, int i) {
        AbstractC1221l0 abstractC1221l0 = (AbstractC1221l0) iterator();
        while (abstractC1221l0.hasNext()) {
            objArr[i] = abstractC1221l0.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public abstract AbstractC1221l0<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo4639f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4638g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    int mo4637i() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f4018f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C1223m.m4697c(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo4639f = mo4639f();
            if (mo4639f != null) {
                return (T[]) Arrays.copyOfRange(mo4639f, mo4638g(), mo4637i(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo4641d(tArr, 0);
        return tArr;
    }
}
