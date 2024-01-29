package p054b.p059c.p060a.p061a.p068d.p071c;
/* renamed from: b.c.a.a.d.c.g0 */
/* loaded from: classes.dex */
final class C1204g0<K> extends AbstractC1192d0<K> {

    /* renamed from: h */
    private final transient AbstractC1184b0<K, ?> f3940h;

    /* renamed from: i */
    private final transient AbstractC1253w<K> f3941i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1204g0(AbstractC1184b0<K, ?> abstractC1184b0, AbstractC1253w<K> abstractC1253w) {
        this.f3940h = abstractC1184b0;
        this.f3941i = abstractC1253w;
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3940h.get(obj) != null;
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: d */
    final int mo4641d(Object[] objArr, int i) {
        return mo4716m().mo4641d(objArr, i);
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1192d0, p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public final AbstractC1221l0<K> iterator() {
        return (AbstractC1221l0) mo4716m().iterator();
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1192d0
    /* renamed from: m */
    public final AbstractC1253w<K> mo4716m() {
        return this.f3941i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3940h.size();
    }
}
