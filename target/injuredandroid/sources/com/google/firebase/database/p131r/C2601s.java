package com.google.firebase.database.p131r;

import com.google.firebase.database.p122o.C2391j;
import com.google.firebase.database.p124p.C2506l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.firebase.database.r.s */
/* loaded from: classes.dex */
public class C2601s {

    /* renamed from: a */
    private final C2506l f6753a;

    /* renamed from: b */
    private final C2506l f6754b;

    /* renamed from: c */
    private final InterfaceC2594n f6755c;

    public C2601s(C2391j c2391j) {
        List<String> m1806a = c2391j.m1806a();
        this.f6753a = m1806a != null ? new C2506l(m1806a) : null;
        List<String> m1805b = c2391j.m1805b();
        this.f6754b = m1805b != null ? new C2506l(m1805b) : null;
        this.f6755c = C2597o.m1075a(c2391j.m1804c());
    }

    /* renamed from: b */
    private InterfaceC2594n m1064b(C2506l c2506l, InterfaceC2594n interfaceC2594n, InterfaceC2594n interfaceC2594n2) {
        C2506l c2506l2 = this.f6753a;
        int compareTo = c2506l2 == null ? 1 : c2506l.compareTo(c2506l2);
        C2506l c2506l3 = this.f6754b;
        int compareTo2 = c2506l3 == null ? -1 : c2506l.compareTo(c2506l3);
        C2506l c2506l4 = this.f6753a;
        boolean z = false;
        boolean z2 = c2506l4 != null && c2506l.m1387s(c2506l4);
        C2506l c2506l5 = this.f6754b;
        if (c2506l5 != null && c2506l.m1387s(c2506l5)) {
            z = true;
        }
        if (compareTo <= 0 || compareTo2 >= 0 || z) {
            if (compareTo > 0 && z && interfaceC2594n2.mo1085k()) {
                return interfaceC2594n2;
            }
            if (compareTo > 0 && compareTo2 == 0) {
                return interfaceC2594n.mo1085k() ? C2585g.m1115s() : interfaceC2594n;
            } else if (z2 || z) {
                HashSet hashSet = new HashSet();
                Iterator<C2593m> it = interfaceC2594n.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().m1089c());
                }
                Iterator<C2593m> it2 = interfaceC2594n2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next().m1089c());
                }
                ArrayList<C2570b> arrayList = new ArrayList(hashSet.size() + 1);
                arrayList.addAll(hashSet);
                if (!interfaceC2594n2.mo1078c().isEmpty() || !interfaceC2594n.mo1078c().isEmpty()) {
                    arrayList.add(C2570b.m1159m());
                }
                InterfaceC2594n interfaceC2594n3 = interfaceC2594n;
                for (C2570b c2570b : arrayList) {
                    InterfaceC2594n mo1079b = interfaceC2594n.mo1079b(c2570b);
                    InterfaceC2594n m1064b = m1064b(c2506l.m1389l(c2570b), interfaceC2594n.mo1079b(c2570b), interfaceC2594n2.mo1079b(c2570b));
                    if (m1064b != mo1079b) {
                        interfaceC2594n3 = interfaceC2594n3.mo1083p(c2570b, m1064b);
                    }
                }
                return interfaceC2594n3;
            } else {
                return interfaceC2594n;
            }
        }
        return interfaceC2594n2;
    }

    /* renamed from: a */
    public InterfaceC2594n m1065a(InterfaceC2594n interfaceC2594n) {
        return m1064b(C2506l.m1385w(), interfaceC2594n, this.f6755c);
    }

    public String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f6753a + ", optInclusiveEnd=" + this.f6754b + ", snap=" + this.f6755c + '}';
    }
}
