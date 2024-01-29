package p135d.p136o;

import java.util.Iterator;
/* renamed from: d.o.v */
/* loaded from: classes.dex */
public abstract class AbstractC2666v implements Iterator<Integer> {
    @Override // java.util.Iterator
    /* renamed from: a */
    public final Integer next() {
        return Integer.valueOf(mo853b());
    }

    /* renamed from: b */
    public abstract int mo853b();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
