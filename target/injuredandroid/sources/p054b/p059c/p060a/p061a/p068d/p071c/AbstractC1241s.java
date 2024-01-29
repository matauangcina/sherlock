package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.NoSuchElementException;
/* renamed from: b.c.a.a.d.c.s */
/* loaded from: classes.dex */
abstract class AbstractC1241s<E> extends AbstractC1218k0<E> {

    /* renamed from: f */
    private final int f4001f;

    /* renamed from: g */
    private int f4002g;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1241s(int i, int i2) {
        C1223m.m4695e(i2, i);
        this.f4001f = i;
        this.f4002g = i2;
    }

    /* renamed from: a */
    protected abstract E mo4635a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4002g < this.f4001f;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4002g > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f4002g;
            this.f4002g = i + 1;
            return mo4635a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4002g;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f4002g - 1;
            this.f4002g = i;
            return mo4635a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4002g - 1;
    }
}
