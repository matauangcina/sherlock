package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.Iterator;
import java.util.Set;
/* renamed from: b.c.a.a.d.c.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC1192d0<E> extends AbstractC1256x<E> implements Set<E> {

    /* renamed from: g */
    private transient AbstractC1253w<E> f3922g;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C1212i0.m4705b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C1212i0.m4706a(this);
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* renamed from: l */
    AbstractC1253w<E> mo4725l() {
        return AbstractC1253w.m4645u(toArray());
    }

    /* renamed from: m */
    public AbstractC1253w<E> mo4716m() {
        AbstractC1253w<E> abstractC1253w = this.f3922g;
        if (abstractC1253w == null) {
            AbstractC1253w<E> mo4725l = mo4725l();
            this.f3922g = mo4725l;
            return mo4725l;
        }
        return abstractC1253w;
    }
}
