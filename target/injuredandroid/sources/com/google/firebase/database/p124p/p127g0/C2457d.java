package com.google.firebase.database.p124p.p127g0;

import com.google.firebase.database.p121n.AbstractC2343c;
import com.google.firebase.database.p121n.C2362l;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p131r.C2570b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.g0.d */
/* loaded from: classes.dex */
public final class C2457d<T> implements Iterable<Map.Entry<C2506l, T>> {

    /* renamed from: h */
    private static final AbstractC2343c f6436h;

    /* renamed from: i */
    private static final C2457d f6437i;

    /* renamed from: f */
    private final T f6438f;

    /* renamed from: g */
    private final AbstractC2343c<C2570b, C2457d<T>> f6439g;

    /* renamed from: com.google.firebase.database.p.g0.d$a */
    /* loaded from: classes.dex */
    class C2458a implements InterfaceC2460c<T, Void> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6440a;

        C2458a(C2457d c2457d, ArrayList arrayList) {
            this.f6440a = arrayList;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public Void mo1221a(C2506l c2506l, T t, Void r3) {
            this.f6440a.add(t);
            return null;
        }
    }

    /* renamed from: com.google.firebase.database.p.g0.d$b */
    /* loaded from: classes.dex */
    class C2459b implements InterfaceC2460c<T, Void> {

        /* renamed from: a */
        final /* synthetic */ List f6441a;

        C2459b(C2457d c2457d, List list) {
            this.f6441a = list;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public Void mo1221a(C2506l c2506l, T t, Void r4) {
            this.f6441a.add(new AbstractMap.SimpleImmutableEntry(c2506l, t));
            return null;
        }
    }

    /* renamed from: com.google.firebase.database.p.g0.d$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2460c<T, R> {
        /* renamed from: a */
        R mo1221a(C2506l c2506l, T t, R r);
    }

    static {
        AbstractC2343c m1982b = AbstractC2343c.C2344a.m1982b(C2362l.m1927b(C2570b.class));
        f6436h = m1982b;
        f6437i = new C2457d(null, m1982b);
    }

    public C2457d(T t) {
        this(t, f6436h);
    }

    public C2457d(T t, AbstractC2343c<C2570b, C2457d<T>> abstractC2343c) {
        this.f6438f = t;
        this.f6439g = abstractC2343c;
    }

    /* renamed from: e */
    public static <V> C2457d<V> m1561e() {
        return f6437i;
    }

    /* renamed from: i */
    private <R> R m1558i(C2506l c2506l, InterfaceC2460c<? super T, R> interfaceC2460c, R r) {
        Iterator<Map.Entry<C2570b, C2457d<T>>> it = this.f6439g.iterator();
        while (it.hasNext()) {
            Map.Entry<C2570b, C2457d<T>> next = it.next();
            r = (R) next.getValue().m1558i(c2506l.m1389l(next.getKey()), interfaceC2460c, r);
        }
        Object obj = this.f6438f;
        return obj != null ? interfaceC2460c.mo1221a(c2506l, obj, r) : r;
    }

    /* renamed from: A */
    public T m1567A(C2506l c2506l, InterfaceC2465i<? super T> interfaceC2465i) {
        Object obj = (T) this.f6438f;
        if (obj == null || !interfaceC2465i.mo1540a(obj)) {
            Iterator<C2570b> it = c2506l.iterator();
            C2457d<T> c2457d = this;
            while (it.hasNext()) {
                c2457d = c2457d.f6439g.mo1947e(it.next());
                if (c2457d == null) {
                    return null;
                }
                Object obj2 = (T) c2457d.f6438f;
                if (obj2 != null && interfaceC2465i.mo1540a(obj2)) {
                    return c2457d.f6438f;
                }
            }
            return null;
        }
        return this.f6438f;
    }

    /* renamed from: B */
    public C2457d<T> m1566B(C2506l c2506l, T t) {
        if (c2506l.isEmpty()) {
            return new C2457d<>(t, this.f6439g);
        }
        C2570b m1384x = c2506l.m1384x();
        C2457d<T> mo1947e = this.f6439g.mo1947e(m1384x);
        if (mo1947e == null) {
            mo1947e = m1561e();
        }
        return new C2457d<>(this.f6438f, this.f6439g.mo1941s(m1384x, mo1947e.m1566B(c2506l.m1396A(), t)));
    }

    /* renamed from: C */
    public C2457d<T> m1565C(C2506l c2506l, C2457d<T> c2457d) {
        if (c2506l.isEmpty()) {
            return c2457d;
        }
        C2570b m1384x = c2506l.m1384x();
        C2457d<T> mo1947e = this.f6439g.mo1947e(m1384x);
        if (mo1947e == null) {
            mo1947e = m1561e();
        }
        C2457d<T> m1565C = mo1947e.m1565C(c2506l.m1396A(), c2457d);
        return new C2457d<>(this.f6438f, m1565C.isEmpty() ? this.f6439g.mo1939u(m1384x) : this.f6439g.mo1941s(m1384x, m1565C));
    }

    /* renamed from: D */
    public C2457d<T> m1564D(C2506l c2506l) {
        if (c2506l.isEmpty()) {
            return this;
        }
        C2457d<T> mo1947e = this.f6439g.mo1947e(c2506l.m1384x());
        return mo1947e != null ? mo1947e.m1564D(c2506l.m1396A()) : m1561e();
    }

    /* renamed from: E */
    public Collection<T> m1563E() {
        ArrayList arrayList = new ArrayList();
        m1556m(new C2458a(this, arrayList));
        return arrayList;
    }

    /* renamed from: d */
    public boolean m1562d(InterfaceC2465i<? super T> interfaceC2465i) {
        Object obj = (T) this.f6438f;
        if (obj == null || !interfaceC2465i.mo1540a(obj)) {
            Iterator<Map.Entry<C2570b, C2457d<T>>> it = this.f6439g.iterator();
            while (it.hasNext()) {
                if (it.next().getValue().m1562d(interfaceC2465i)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2457d.class != obj.getClass()) {
            return false;
        }
        C2457d c2457d = (C2457d) obj;
        AbstractC2343c<C2570b, C2457d<T>> abstractC2343c = this.f6439g;
        if (abstractC2343c == null ? c2457d.f6439g == null : abstractC2343c.equals(c2457d.f6439g)) {
            T t = this.f6438f;
            T t2 = c2457d.f6438f;
            return t == null ? t2 == null : t.equals(t2);
        }
        return false;
    }

    /* renamed from: f */
    public C2506l m1560f(C2506l c2506l, InterfaceC2465i<? super T> interfaceC2465i) {
        C2570b m1384x;
        C2457d<T> mo1947e;
        C2506l m1560f;
        Object obj = (T) this.f6438f;
        if (obj == null || !interfaceC2465i.mo1540a(obj)) {
            if (c2506l.isEmpty() || (mo1947e = this.f6439g.mo1947e((m1384x = c2506l.m1384x()))) == null || (m1560f = mo1947e.m1560f(c2506l.m1396A(), interfaceC2465i)) == null) {
                return null;
            }
            return new C2506l(m1384x).m1390i(m1560f);
        }
        return C2506l.m1385w();
    }

    /* renamed from: g */
    public C2506l m1559g(C2506l c2506l) {
        return m1560f(c2506l, InterfaceC2465i.f6448a);
    }

    public T getValue() {
        return this.f6438f;
    }

    public int hashCode() {
        T t = this.f6438f;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        AbstractC2343c<C2570b, C2457d<T>> abstractC2343c = this.f6439g;
        return hashCode + (abstractC2343c != null ? abstractC2343c.hashCode() : 0);
    }

    public boolean isEmpty() {
        return this.f6438f == null && this.f6439g.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<C2506l, T>> iterator() {
        ArrayList arrayList = new ArrayList();
        m1556m(new C2459b(this, arrayList));
        return arrayList.iterator();
    }

    /* renamed from: l */
    public <R> R m1557l(R r, InterfaceC2460c<? super T, R> interfaceC2460c) {
        return (R) m1558i(C2506l.m1385w(), interfaceC2460c, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public void m1556m(InterfaceC2460c<T, Void> interfaceC2460c) {
        m1558i(C2506l.m1385w(), interfaceC2460c, null);
    }

    /* renamed from: s */
    public T m1555s(C2506l c2506l) {
        if (c2506l.isEmpty()) {
            return this.f6438f;
        }
        C2457d<T> mo1947e = this.f6439g.mo1947e(c2506l.m1384x());
        if (mo1947e != null) {
            return mo1947e.m1555s(c2506l.m1396A());
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(getValue());
        sb.append(", children={");
        Iterator<Map.Entry<C2570b, C2457d<T>>> it = this.f6439g.iterator();
        while (it.hasNext()) {
            Map.Entry<C2570b, C2457d<T>> next = it.next();
            sb.append(next.getKey().m1164e());
            sb.append("=");
            sb.append(next.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    /* renamed from: u */
    public C2457d<T> m1554u(C2570b c2570b) {
        C2457d<T> mo1947e = this.f6439g.mo1947e(c2570b);
        return mo1947e != null ? mo1947e : m1561e();
    }

    /* renamed from: w */
    public AbstractC2343c<C2570b, C2457d<T>> m1553w() {
        return this.f6439g;
    }

    /* renamed from: x */
    public T m1552x(C2506l c2506l) {
        return m1551y(c2506l, InterfaceC2465i.f6448a);
    }

    /* renamed from: y */
    public T m1551y(C2506l c2506l, InterfaceC2465i<? super T> interfaceC2465i) {
        Object obj = (T) this.f6438f;
        T t = (obj == null || !interfaceC2465i.mo1540a(obj)) ? null : this.f6438f;
        Iterator<C2570b> it = c2506l.iterator();
        C2457d<T> c2457d = this;
        while (it.hasNext()) {
            c2457d = c2457d.f6439g.mo1947e(it.next());
            if (c2457d == null) {
                return t;
            }
            Object obj2 = (T) c2457d.f6438f;
            if (obj2 != null && interfaceC2465i.mo1540a(obj2)) {
                t = c2457d.f6438f;
            }
        }
        return t;
    }

    /* renamed from: z */
    public C2457d<T> m1550z(C2506l c2506l) {
        if (c2506l.isEmpty()) {
            return this.f6439g.isEmpty() ? m1561e() : new C2457d<>(null, this.f6439g);
        }
        C2570b m1384x = c2506l.m1384x();
        C2457d<T> mo1947e = this.f6439g.mo1947e(m1384x);
        if (mo1947e != null) {
            C2457d<T> m1550z = mo1947e.m1550z(c2506l.m1396A());
            AbstractC2343c<C2570b, C2457d<T>> mo1939u = m1550z.isEmpty() ? this.f6439g.mo1939u(m1384x) : this.f6439g.mo1941s(m1384x, m1550z);
            return (this.f6438f == null && mo1939u.isEmpty()) ? m1561e() : new C2457d<>(this.f6438f, mo1939u);
        }
        return this;
    }
}
