package com.google.firebase.database.p124p;

import com.google.firebase.database.p124p.p127g0.C2457d;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.C2597o;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.b */
/* loaded from: classes.dex */
public final class C2411b implements Iterable<Map.Entry<C2506l, InterfaceC2594n>> {

    /* renamed from: g */
    private static final C2411b f6341g = new C2411b(new C2457d(null));

    /* renamed from: f */
    private final C2457d<InterfaceC2594n> f6342f;

    /* renamed from: com.google.firebase.database.p.b$a */
    /* loaded from: classes.dex */
    class C2412a implements C2457d.InterfaceC2460c<InterfaceC2594n, C2411b> {

        /* renamed from: a */
        final /* synthetic */ C2506l f6343a;

        C2412a(C2411b c2411b, C2506l c2506l) {
            this.f6343a = c2506l;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public C2411b mo1221a(C2506l c2506l, InterfaceC2594n interfaceC2594n, C2411b c2411b) {
            return c2411b.m1752d(this.f6343a.m1390i(c2506l), interfaceC2594n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.b$b */
    /* loaded from: classes.dex */
    public class C2413b implements C2457d.InterfaceC2460c<InterfaceC2594n, Void> {

        /* renamed from: a */
        final /* synthetic */ Map f6344a;

        /* renamed from: b */
        final /* synthetic */ boolean f6345b;

        C2413b(C2411b c2411b, Map map, boolean z) {
            this.f6344a = map;
            this.f6345b = z;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public Void mo1221a(C2506l c2506l, InterfaceC2594n interfaceC2594n, Void r4) {
            this.f6344a.put(c2506l.m1395B(), interfaceC2594n.mo1081r(this.f6345b));
            return null;
        }
    }

    private C2411b(C2457d<InterfaceC2594n> c2457d) {
        this.f6342f = c2457d;
    }

    /* renamed from: i */
    private InterfaceC2594n m1748i(C2506l c2506l, C2457d<InterfaceC2594n> c2457d, InterfaceC2594n interfaceC2594n) {
        if (c2457d.getValue() != null) {
            return interfaceC2594n.mo1082q(c2506l, c2457d.getValue());
        }
        InterfaceC2594n interfaceC2594n2 = null;
        Iterator<Map.Entry<C2570b, C2457d<InterfaceC2594n>>> it = c2457d.m1553w().iterator();
        while (it.hasNext()) {
            Map.Entry<C2570b, C2457d<InterfaceC2594n>> next = it.next();
            C2457d<InterfaceC2594n> value = next.getValue();
            C2570b key = next.getKey();
            if (key.m1158w()) {
                interfaceC2594n2 = value.getValue();
            } else {
                interfaceC2594n = m1748i(c2506l.m1389l(key), value, interfaceC2594n);
            }
        }
        return (interfaceC2594n.mo1086h(c2506l).isEmpty() || interfaceC2594n2 == null) ? interfaceC2594n : interfaceC2594n.mo1082q(c2506l.m1389l(C2570b.m1159m()), interfaceC2594n2);
    }

    /* renamed from: s */
    public static C2411b m1745s() {
        return f6341g;
    }

    /* renamed from: u */
    public static C2411b m1744u(Map<C2506l, InterfaceC2594n> map) {
        C2457d m1561e = C2457d.m1561e();
        for (Map.Entry<C2506l, InterfaceC2594n> entry : map.entrySet()) {
            m1561e = m1561e.m1565C(entry.getKey(), new C2457d(entry.getValue()));
        }
        return new C2411b(m1561e);
    }

    /* renamed from: w */
    public static C2411b m1743w(Map<String, Object> map) {
        C2457d m1561e = C2457d.m1561e();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m1561e = m1561e.m1565C(new C2506l(entry.getKey()), new C2457d(C2597o.m1075a(entry.getValue())));
        }
        return new C2411b(m1561e);
    }

    /* renamed from: A */
    public boolean m1755A(C2506l c2506l) {
        return m1741y(c2506l) != null;
    }

    /* renamed from: B */
    public C2411b m1754B(C2506l c2506l) {
        return c2506l.isEmpty() ? f6341g : new C2411b(this.f6342f.m1565C(c2506l, C2457d.m1561e()));
    }

    /* renamed from: C */
    public InterfaceC2594n m1753C() {
        return this.f6342f.getValue();
    }

    /* renamed from: d */
    public C2411b m1752d(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        if (c2506l.isEmpty()) {
            return new C2411b(new C2457d(interfaceC2594n));
        }
        C2506l m1559g = this.f6342f.m1559g(c2506l);
        if (m1559g == null) {
            return new C2411b(this.f6342f.m1565C(c2506l, new C2457d<>(interfaceC2594n)));
        }
        C2506l m1382z = C2506l.m1382z(m1559g, c2506l);
        InterfaceC2594n m1555s = this.f6342f.m1555s(m1559g);
        C2570b m1386u = m1382z.m1386u();
        if (m1386u != null && m1386u.m1158w() && m1555s.mo1086h(m1382z.m1383y()).isEmpty()) {
            return this;
        }
        return new C2411b(this.f6342f.m1566B(m1559g, m1555s.mo1082q(m1382z, interfaceC2594n)));
    }

    /* renamed from: e */
    public C2411b m1751e(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return m1752d(new C2506l(c2570b), interfaceC2594n);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C2411b.class) {
            return false;
        }
        return ((C2411b) obj).m1740z(true).equals(m1740z(true));
    }

    /* renamed from: f */
    public C2411b m1750f(C2506l c2506l, C2411b c2411b) {
        return (C2411b) c2411b.f6342f.m1557l(this, new C2412a(this, c2506l));
    }

    /* renamed from: g */
    public InterfaceC2594n m1749g(InterfaceC2594n interfaceC2594n) {
        return m1748i(C2506l.m1385w(), this.f6342f, interfaceC2594n);
    }

    public int hashCode() {
        return m1740z(true).hashCode();
    }

    public boolean isEmpty() {
        return this.f6342f.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<C2506l, InterfaceC2594n>> iterator() {
        return this.f6342f.iterator();
    }

    /* renamed from: l */
    public C2411b m1747l(C2506l c2506l) {
        if (c2506l.isEmpty()) {
            return this;
        }
        InterfaceC2594n m1741y = m1741y(c2506l);
        return m1741y != null ? new C2411b(new C2457d(m1741y)) : new C2411b(this.f6342f.m1564D(c2506l));
    }

    /* renamed from: m */
    public Map<C2570b, C2411b> m1746m() {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<C2570b, C2457d<InterfaceC2594n>>> it = this.f6342f.m1553w().iterator();
        while (it.hasNext()) {
            Map.Entry<C2570b, C2457d<InterfaceC2594n>> next = it.next();
            hashMap.put(next.getKey(), new C2411b(next.getValue()));
        }
        return hashMap;
    }

    public String toString() {
        return "CompoundWrite{" + m1740z(true).toString() + "}";
    }

    /* renamed from: x */
    public List<C2593m> m1742x() {
        ArrayList arrayList = new ArrayList();
        if (this.f6342f.getValue() != null) {
            for (C2593m c2593m : this.f6342f.getValue()) {
                arrayList.add(new C2593m(c2593m.m1089c(), c2593m.m1088d()));
            }
        } else {
            Iterator<Map.Entry<C2570b, C2457d<InterfaceC2594n>>> it = this.f6342f.m1553w().iterator();
            while (it.hasNext()) {
                Map.Entry<C2570b, C2457d<InterfaceC2594n>> next = it.next();
                C2457d<InterfaceC2594n> value = next.getValue();
                if (value.getValue() != null) {
                    arrayList.add(new C2593m(next.getKey(), value.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public InterfaceC2594n m1741y(C2506l c2506l) {
        C2506l m1559g = this.f6342f.m1559g(c2506l);
        if (m1559g != null) {
            return this.f6342f.m1555s(m1559g).mo1086h(C2506l.m1382z(m1559g, c2506l));
        }
        return null;
    }

    /* renamed from: z */
    public Map<String, Object> m1740z(boolean z) {
        HashMap hashMap = new HashMap();
        this.f6342f.m1556m(new C2413b(this, hashMap, z));
        return hashMap;
    }
}
