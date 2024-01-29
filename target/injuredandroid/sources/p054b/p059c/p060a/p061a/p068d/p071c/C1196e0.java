package p054b.p059c.p060a.p061a.p068d.p071c;

import java.util.Map;
/* renamed from: b.c.a.a.d.c.e0 */
/* loaded from: classes.dex */
final class C1196e0<K, V> extends AbstractC1192d0<Map.Entry<K, V>> {

    /* renamed from: h */
    private final transient AbstractC1184b0<K, V> f3928h;

    /* renamed from: i */
    private final transient Object[] f3929i;

    /* renamed from: j */
    private final transient int f3930j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1196e0(AbstractC1184b0<K, V> abstractC1184b0, Object[] objArr, int i, int i2) {
        this.f3928h = abstractC1184b0;
        this.f3929i = objArr;
        this.f3930j = i2;
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3928h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x
    /* renamed from: d */
    final int mo4641d(Object[] objArr, int i) {
        return mo4716m().mo4641d(objArr, i);
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1192d0, p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1256x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public final AbstractC1221l0<Map.Entry<K, V>> iterator() {
        return (AbstractC1221l0) mo4716m().iterator();
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1192d0
    /* renamed from: l */
    final AbstractC1253w<Map.Entry<K, V>> mo4725l() {
        return new C1208h0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3930j;
    }
}
