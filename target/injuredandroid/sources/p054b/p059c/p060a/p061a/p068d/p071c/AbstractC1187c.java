package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: b.c.a.a.d.c.c */
/* loaded from: classes.dex */
abstract class AbstractC1187c<T> implements Iterator<T> {

    /* renamed from: f */
    private int f3915f = C1195e.f3924b;

    /* renamed from: g */
    private T f3916g;

    /* renamed from: a */
    protected abstract T mo4668a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final T m4730b() {
        this.f3915f = C1195e.f3925c;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3915f != C1195e.f3926d) {
            int i = C1183b.f3911a[this.f3915f - 1];
            if (i != 1) {
                if (i != 2) {
                    this.f3915f = C1195e.f3926d;
                    this.f3916g = mo4668a();
                    if (this.f3915f != C1195e.f3925c) {
                        this.f3915f = C1195e.f3923a;
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f3915f = C1195e.f3924b;
            T t = this.f3916g;
            this.f3916g = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
