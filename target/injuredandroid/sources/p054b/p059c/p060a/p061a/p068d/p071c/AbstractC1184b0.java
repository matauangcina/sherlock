package p054b.p059c.p060a.p061a.p068d.p071c;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: b.c.a.a.d.c.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC1184b0<K, V> implements Serializable, Map<K, V> {

    /* renamed from: f */
    private transient AbstractC1192d0<Map.Entry<K, V>> f3912f;

    /* renamed from: g */
    private transient AbstractC1192d0<K> f3913g;

    /* renamed from: h */
    private transient AbstractC1256x<V> f3914h;

    /* renamed from: a */
    public static <K, V> AbstractC1184b0<K, V> m4731a() {
        return (AbstractC1184b0<K, V>) C1200f0.f3932l;
    }

    /* renamed from: b */
    abstract AbstractC1192d0<Map.Entry<K, V>> mo4721b();

    /* renamed from: c */
    abstract AbstractC1192d0<K> mo4720c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((AbstractC1256x) values()).contains(obj);
    }

    /* renamed from: d */
    abstract AbstractC1256x<V> mo4719d();

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        AbstractC1192d0<Map.Entry<K, V>> abstractC1192d0 = this.f3912f;
        if (abstractC1192d0 == null) {
            AbstractC1192d0<Map.Entry<K, V>> mo4721b = mo4721b();
            this.f3912f = mo4721b;
            return mo4721b;
        }
        return abstractC1192d0;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return C1212i0.m4706a((AbstractC1192d0) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        AbstractC1192d0<K> abstractC1192d0 = this.f3913g;
        if (abstractC1192d0 == null) {
            AbstractC1192d0<K> mo4720c = mo4720c();
            this.f3913g = mo4720c;
            return mo4720c;
        }
        return abstractC1192d0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder("size".length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        AbstractC1256x<V> abstractC1256x = this.f3914h;
        if (abstractC1256x == null) {
            AbstractC1256x<V> mo4719d = mo4719d();
            this.f3914h = mo4719d;
            return mo4719d;
        }
        return abstractC1256x;
    }
}
