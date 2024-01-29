package p000a.p014d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: a.d.a */
/* loaded from: classes.dex */
public class C0066a<K, V> extends C0079g<K, V> implements Map<K, V> {

    /* renamed from: m */
    AbstractC0073f<K, V> f201m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.d.a$a */
    /* loaded from: classes.dex */
    public class C0067a extends AbstractC0073f<K, V> {
        C0067a() {
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: a */
        protected void mo9362a() {
            C0066a.this.clear();
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: b */
        protected Object mo9361b(int i, int i2) {
            return C0066a.this.f250g[(i << 1) + i2];
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: c */
        protected Map<K, V> mo9360c() {
            return C0066a.this;
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: d */
        protected int mo9359d() {
            return C0066a.this.f251h;
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: e */
        protected int mo9358e(Object obj) {
            return C0066a.this.m9337f(obj);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: f */
        protected int mo9357f(Object obj) {
            return C0066a.this.m9335h(obj);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: g */
        protected void mo9356g(K k, V v) {
            C0066a.this.put(k, v);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: h */
        protected void mo9355h(int i) {
            C0066a.this.m9332k(i);
        }

        @Override // p000a.p014d.AbstractC0073f
        /* renamed from: i */
        protected V mo9354i(int i, V v) {
            return C0066a.this.m9331l(i, v);
        }
    }

    public C0066a() {
    }

    public C0066a(int i) {
        super(i);
    }

    public C0066a(C0079g c0079g) {
        super(c0079g);
    }

    /* renamed from: n */
    private AbstractC0073f<K, V> m9399n() {
        if (this.f201m == null) {
            this.f201m = new C0067a();
        }
        return this.f201m;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m9399n().m9351l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m9399n().m9350m();
    }

    /* renamed from: o */
    public boolean m9398o(Collection<?> collection) {
        return AbstractC0073f.m9347p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m9340c(this.f251h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m9399n().m9349n();
    }
}
