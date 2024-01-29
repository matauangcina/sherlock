package p000a.p008b.p009a.p011b;

import java.util.HashMap;
import java.util.Map;
import p000a.p008b.p009a.p011b.C0048b;
/* renamed from: a.b.a.b.a */
/* loaded from: classes.dex */
public class C0047a<K, V> extends C0048b<K, V> {

    /* renamed from: j */
    private HashMap<K, C0048b.C0051c<K, V>> f151j = new HashMap<>();

    public boolean contains(K k) {
        return this.f151j.containsKey(k);
    }

    @Override // p000a.p008b.p009a.p011b.C0048b
    /* renamed from: f */
    protected C0048b.C0051c<K, V> mo9464f(K k) {
        return this.f151j.get(k);
    }

    @Override // p000a.p008b.p009a.p011b.C0048b
    /* renamed from: m */
    public V mo9460m(K k, V v) {
        C0048b.C0051c<K, V> mo9464f = mo9464f(k);
        if (mo9464f != null) {
            return mo9464f.f157g;
        }
        this.f151j.put(k, m9461l(k, v));
        return null;
    }

    @Override // p000a.p008b.p009a.p011b.C0048b
    /* renamed from: s */
    public V mo9459s(K k) {
        V v = (V) super.mo9459s(k);
        this.f151j.remove(k);
        return v;
    }

    /* renamed from: u */
    public Map.Entry<K, V> m9467u(K k) {
        if (contains(k)) {
            return this.f151j.get(k).f159i;
        }
        return null;
    }
}
