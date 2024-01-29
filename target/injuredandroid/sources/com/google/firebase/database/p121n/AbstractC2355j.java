package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.InterfaceC2351h;
import java.util.Comparator;
/* renamed from: com.google.firebase.database.n.j */
/* loaded from: classes.dex */
public abstract class AbstractC2355j<K, V> implements InterfaceC2351h<K, V> {

    /* renamed from: a */
    private final K f6181a;

    /* renamed from: b */
    private final V f6182b;

    /* renamed from: c */
    private InterfaceC2351h<K, V> f6183c;

    /* renamed from: d */
    private final InterfaceC2351h<K, V> f6184d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2355j(K k, V v, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2) {
        this.f6181a = k;
        this.f6182b = v;
        this.f6183c = interfaceC2351h == null ? C2350g.m1970j() : interfaceC2351h;
        this.f6184d = interfaceC2351h2 == null ? C2350g.m1970j() : interfaceC2351h2;
    }

    /* renamed from: j */
    private AbstractC2355j<K, V> m1960j() {
        InterfaceC2351h<K, V> interfaceC2351h = this.f6183c;
        InterfaceC2351h<K, V> mo1965e = interfaceC2351h.mo1965e(null, null, m1953q(interfaceC2351h), null, null);
        InterfaceC2351h<K, V> interfaceC2351h2 = this.f6184d;
        return mo1965e(null, null, m1953q(this), mo1965e, interfaceC2351h2.mo1965e(null, null, m1953q(interfaceC2351h2), null, null));
    }

    /* renamed from: m */
    private AbstractC2355j<K, V> m1957m() {
        AbstractC2355j<K, V> m1951s = (!this.f6184d.mo1969c() || this.f6183c.mo1969c()) ? this : m1951s();
        if (m1951s.f6183c.mo1969c() && ((AbstractC2355j) m1951s.f6183c).f6183c.mo1969c()) {
            m1951s = m1951s.m1950t();
        }
        return (m1951s.f6183c.mo1969c() && m1951s.f6184d.mo1969c()) ? m1951s.m1960j() : m1951s;
    }

    /* renamed from: o */
    private AbstractC2355j<K, V> m1955o() {
        AbstractC2355j<K, V> m1960j = m1960j();
        return m1960j.mo1966d().mo1968a().mo1969c() ? m1960j.mo1958l(null, null, null, ((AbstractC2355j) m1960j.mo1966d()).m1950t()).m1951s().m1960j() : m1960j;
    }

    /* renamed from: p */
    private AbstractC2355j<K, V> m1954p() {
        AbstractC2355j<K, V> m1960j = m1960j();
        return m1960j.mo1968a().mo1968a().mo1969c() ? m1960j.m1950t().m1960j() : m1960j;
    }

    /* renamed from: q */
    private static InterfaceC2351h.EnumC2352a m1953q(InterfaceC2351h interfaceC2351h) {
        return interfaceC2351h.mo1969c() ? InterfaceC2351h.EnumC2352a.BLACK : InterfaceC2351h.EnumC2352a.RED;
    }

    /* renamed from: r */
    private InterfaceC2351h<K, V> m1952r() {
        if (this.f6183c.isEmpty()) {
            return C2350g.m1970j();
        }
        AbstractC2355j<K, V> m1955o = (mo1968a().mo1969c() || mo1968a().mo1968a().mo1969c()) ? this : m1955o();
        return m1955o.mo1958l(null, null, ((AbstractC2355j) m1955o.f6183c).m1952r(), null).m1957m();
    }

    /* renamed from: s */
    private AbstractC2355j<K, V> m1951s() {
        return (AbstractC2355j) this.f6184d.mo1965e(null, null, mo1956n(), mo1965e(null, null, InterfaceC2351h.EnumC2352a.RED, null, ((AbstractC2355j) this.f6184d).f6183c), null);
    }

    /* renamed from: t */
    private AbstractC2355j<K, V> m1950t() {
        return (AbstractC2355j) this.f6183c.mo1965e(null, null, mo1956n(), null, mo1965e(null, null, InterfaceC2351h.EnumC2352a.RED, ((AbstractC2355j) this.f6183c).f6184d, null));
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: a */
    public InterfaceC2351h<K, V> mo1968a() {
        return this.f6183c;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: b */
    public InterfaceC2351h<K, V> mo1967b(K k, V v, Comparator<K> comparator) {
        int compare = comparator.compare(k, this.f6181a);
        return (compare < 0 ? mo1958l(null, null, this.f6183c.mo1967b(k, v, comparator), null) : compare == 0 ? mo1958l(k, v, null, null) : mo1958l(null, null, null, this.f6184d.mo1967b(k, v, comparator))).m1957m();
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: d */
    public InterfaceC2351h<K, V> mo1966d() {
        return this.f6184d;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: f */
    public InterfaceC2351h<K, V> mo1964f(K k, Comparator<K> comparator) {
        AbstractC2355j<K, V> mo1958l;
        if (comparator.compare(k, this.f6181a) < 0) {
            AbstractC2355j<K, V> m1955o = (this.f6183c.isEmpty() || this.f6183c.mo1969c() || ((AbstractC2355j) this.f6183c).f6183c.mo1969c()) ? this : m1955o();
            mo1958l = m1955o.mo1958l(null, null, m1955o.f6183c.mo1964f(k, comparator), null);
        } else {
            AbstractC2355j<K, V> m1950t = this.f6183c.mo1969c() ? m1950t() : this;
            if (!m1950t.f6184d.isEmpty() && !m1950t.f6184d.mo1969c() && !((AbstractC2355j) m1950t.f6184d).f6183c.mo1969c()) {
                m1950t = m1950t.m1954p();
            }
            if (comparator.compare(k, m1950t.f6181a) == 0) {
                if (m1950t.f6184d.isEmpty()) {
                    return C2350g.m1970j();
                }
                InterfaceC2351h<K, V> mo1963g = m1950t.f6184d.mo1963g();
                m1950t = m1950t.mo1958l(mo1963g.getKey(), mo1963g.getValue(), null, ((AbstractC2355j) m1950t.f6184d).m1952r());
            }
            mo1958l = m1950t.mo1958l(null, null, null, m1950t.f6184d.mo1964f(k, comparator));
        }
        return mo1958l.m1957m();
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: g */
    public InterfaceC2351h<K, V> mo1963g() {
        return this.f6183c.isEmpty() ? this : this.f6183c.mo1963g();
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public K getKey() {
        return this.f6181a;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public V getValue() {
        return this.f6182b;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: h */
    public void mo1962h(InterfaceC2351h.AbstractC2353b<K, V> abstractC2353b) {
        this.f6183c.mo1962h(abstractC2353b);
        abstractC2353b.mo1147a(this.f6181a, this.f6182b);
        this.f6184d.mo1962h(abstractC2353b);
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: i */
    public InterfaceC2351h<K, V> mo1961i() {
        return this.f6184d.isEmpty() ? this : this.f6184d.mo1961i();
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: k */
    public AbstractC2355j<K, V> mo1965e(K k, V v, InterfaceC2351h.EnumC2352a enumC2352a, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2) {
        if (k == null) {
            k = this.f6181a;
        }
        if (v == null) {
            v = this.f6182b;
        }
        if (interfaceC2351h == null) {
            interfaceC2351h = this.f6183c;
        }
        if (interfaceC2351h2 == null) {
            interfaceC2351h2 = this.f6184d;
        }
        return enumC2352a == InterfaceC2351h.EnumC2352a.RED ? new C2354i(k, v, interfaceC2351h, interfaceC2351h2) : new C2349f(k, v, interfaceC2351h, interfaceC2351h2);
    }

    /* renamed from: l */
    protected abstract AbstractC2355j<K, V> mo1958l(K k, V v, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2);

    /* renamed from: n */
    protected abstract InterfaceC2351h.EnumC2352a mo1956n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1949u(InterfaceC2351h<K, V> interfaceC2351h) {
        this.f6183c = interfaceC2351h;
    }
}
