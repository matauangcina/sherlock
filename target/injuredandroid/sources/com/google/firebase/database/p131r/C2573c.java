package com.google.firebase.database.p131r;

import com.google.firebase.database.p121n.AbstractC2343c;
import com.google.firebase.database.p121n.InterfaceC2351h;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.firebase.database.r.c */
/* loaded from: classes.dex */
public class C2573c implements InterfaceC2594n {

    /* renamed from: i */
    public static Comparator<C2570b> f6706i = new C2574a();

    /* renamed from: f */
    private final AbstractC2343c<C2570b, InterfaceC2594n> f6707f;

    /* renamed from: g */
    private final InterfaceC2594n f6708g;

    /* renamed from: h */
    private String f6709h;

    /* renamed from: com.google.firebase.database.r.c$a */
    /* loaded from: classes.dex */
    class C2574a implements Comparator<C2570b> {
        C2574a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C2570b c2570b, C2570b c2570b2) {
            return c2570b.compareTo(c2570b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.r.c$b */
    /* loaded from: classes.dex */
    public class C2575b extends InterfaceC2351h.AbstractC2353b<C2570b, InterfaceC2594n> {

        /* renamed from: a */
        boolean f6710a = false;

        /* renamed from: b */
        final /* synthetic */ AbstractC2576c f6711b;

        C2575b(AbstractC2576c abstractC2576c) {
            this.f6711b = abstractC2576c;
        }

        @Override // com.google.firebase.database.p121n.InterfaceC2351h.AbstractC2353b
        /* renamed from: b */
        public void mo1147a(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
            if (!this.f6710a && c2570b.compareTo(C2570b.m1159m()) > 0) {
                this.f6710a = true;
                this.f6711b.mo1138b(C2570b.m1159m(), C2573c.this.mo1078c());
            }
            this.f6711b.mo1138b(c2570b, interfaceC2594n);
        }
    }

    /* renamed from: com.google.firebase.database.r.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2576c extends InterfaceC2351h.AbstractC2353b<C2570b, InterfaceC2594n> {
        /* renamed from: b */
        public abstract void mo1138b(C2570b c2570b, InterfaceC2594n interfaceC2594n);

        @Override // com.google.firebase.database.p121n.InterfaceC2351h.AbstractC2353b
        /* renamed from: c */
        public void mo1147a(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
            mo1138b(c2570b, interfaceC2594n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.r.c$d */
    /* loaded from: classes.dex */
    public static class C2577d implements Iterator<C2593m> {

        /* renamed from: f */
        private final Iterator<Map.Entry<C2570b, InterfaceC2594n>> f6713f;

        public C2577d(Iterator<Map.Entry<C2570b, InterfaceC2594n>> it) {
            this.f6713f = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C2593m next() {
            Map.Entry<C2570b, InterfaceC2594n> next = this.f6713f.next();
            return new C2593m(next.getKey(), next.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6713f.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f6713f.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2573c() {
        this.f6709h = null;
        this.f6707f = AbstractC2343c.C2344a.m1982b(f6706i);
        this.f6708g = C2600r.m1069a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2573c(AbstractC2343c<C2570b, InterfaceC2594n> abstractC2343c, InterfaceC2594n interfaceC2594n) {
        this.f6709h = null;
        if (abstractC2343c.isEmpty() && !interfaceC2594n.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f6708g = interfaceC2594n;
        this.f6707f = abstractC2343c;
    }

    /* renamed from: d */
    private static void m1155d(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
    }

    /* renamed from: m */
    private void m1150m(StringBuilder sb, int i) {
        String str;
        if (this.f6707f.isEmpty() && this.f6708g.isEmpty()) {
            str = "{ }";
        } else {
            sb.append("{\n");
            Iterator<Map.Entry<C2570b, InterfaceC2594n>> it = this.f6707f.iterator();
            while (it.hasNext()) {
                Map.Entry<C2570b, InterfaceC2594n> next = it.next();
                int i2 = i + 2;
                m1155d(sb, i2);
                sb.append(next.getKey().m1164e());
                sb.append("=");
                boolean z = next.getValue() instanceof C2573c;
                InterfaceC2594n value = next.getValue();
                if (z) {
                    ((C2573c) value).m1150m(sb, i2);
                } else {
                    sb.append(value.toString());
                }
                sb.append("\n");
            }
            if (!this.f6708g.isEmpty()) {
                m1155d(sb, i + 2);
                sb.append(".priority=");
                sb.append(this.f6708g.toString());
                sb.append("\n");
            }
            m1155d(sb, i);
            str = "}";
        }
        sb.append(str);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: a */
    public int mo1087a() {
        return this.f6707f.size();
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: b */
    public InterfaceC2594n mo1079b(C2570b c2570b) {
        return (!c2570b.m1158w() || this.f6708g.isEmpty()) ? this.f6707f.mo1948d(c2570b) ? this.f6707f.mo1947e(c2570b) : C2585g.m1115s() : this.f6708g;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: c */
    public InterfaceC2594n mo1078c() {
        return this.f6708g;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(InterfaceC2594n interfaceC2594n) {
        if (isEmpty()) {
            return interfaceC2594n.isEmpty() ? 0 : -1;
        } else if (interfaceC2594n.mo1085k() || interfaceC2594n.isEmpty()) {
            return 1;
        } else {
            return interfaceC2594n == InterfaceC2594n.f6747b ? -1 : 0;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2573c) {
            C2573c c2573c = (C2573c) obj;
            if (mo1078c().equals(c2573c.mo1078c()) && this.f6707f.size() == c2573c.f6707f.size()) {
                Iterator<Map.Entry<C2570b, InterfaceC2594n>> it = this.f6707f.iterator();
                Iterator<Map.Entry<C2570b, InterfaceC2594n>> it2 = c2573c.f6707f.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry<C2570b, InterfaceC2594n> next = it.next();
                    Map.Entry<C2570b, InterfaceC2594n> next2 = it2.next();
                    if (next.getKey().equals(next2.getKey()) || !next.getValue().equals(next2.getValue())) {
                        return false;
                    }
                    while (it.hasNext()) {
                        Map.Entry<C2570b, InterfaceC2594n> next3 = it.next();
                        Map.Entry<C2570b, InterfaceC2594n> next22 = it2.next();
                        if (next3.getKey().equals(next22.getKey())) {
                        }
                        return false;
                    }
                }
                if (it.hasNext() || it2.hasNext()) {
                    throw new IllegalStateException("Something went wrong internally.");
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public void m1154f(AbstractC2576c abstractC2576c) {
        m1153g(abstractC2576c, false);
    }

    /* renamed from: g */
    public void m1153g(AbstractC2576c abstractC2576c, boolean z) {
        if (!z || mo1078c().isEmpty()) {
            this.f6707f.mo1942m(abstractC2576c);
        } else {
            this.f6707f.mo1942m(new C2575b(abstractC2576c));
        }
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public String getHash() {
        if (this.f6709h == null) {
            String mo1058v = mo1058v(InterfaceC2594n.EnumC2596b.V1);
            this.f6709h = mo1058v.isEmpty() ? "" : C2472l.m1517h(mo1058v);
        }
        return this.f6709h;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public Object getValue() {
        return mo1081r(false);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: h */
    public InterfaceC2594n mo1086h(C2506l c2506l) {
        C2570b m1384x = c2506l.m1384x();
        return m1384x == null ? this : mo1079b(m1384x).mo1086h(c2506l.m1396A());
    }

    public int hashCode() {
        Iterator<C2593m> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            C2593m next = it.next();
            i = (((i * 31) + next.m1089c().hashCode()) * 17) + next.m1088d().hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public C2570b m1152i() {
        return this.f6707f.mo1944i();
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public boolean isEmpty() {
        return this.f6707f.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<C2593m> iterator() {
        return new C2577d(this.f6707f.iterator());
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: j */
    public InterfaceC2594n mo1061j(InterfaceC2594n interfaceC2594n) {
        return this.f6707f.isEmpty() ? C2585g.m1115s() : new C2573c(this.f6707f, interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: k */
    public boolean mo1085k() {
        return false;
    }

    /* renamed from: l */
    public C2570b m1151l() {
        return this.f6707f.mo1945g();
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: n */
    public C2570b mo1084n(C2570b c2570b) {
        return this.f6707f.mo1943l(c2570b);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: o */
    public boolean mo1076o(C2570b c2570b) {
        return !mo1079b(c2570b).isEmpty();
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: p */
    public InterfaceC2594n mo1083p(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        if (c2570b.m1158w()) {
            return mo1061j(interfaceC2594n);
        }
        AbstractC2343c<C2570b, InterfaceC2594n> abstractC2343c = this.f6707f;
        if (abstractC2343c.mo1948d(c2570b)) {
            abstractC2343c = abstractC2343c.mo1939u(c2570b);
        }
        if (!interfaceC2594n.isEmpty()) {
            abstractC2343c = abstractC2343c.mo1941s(c2570b, interfaceC2594n);
        }
        return abstractC2343c.isEmpty() ? C2585g.m1115s() : new C2573c(abstractC2343c, this.f6708g);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: q */
    public InterfaceC2594n mo1082q(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        C2570b m1384x = c2506l.m1384x();
        return m1384x == null ? interfaceC2594n : m1384x.m1158w() ? mo1061j(interfaceC2594n) : mo1083p(m1384x, mo1079b(m1384x).mo1082q(c2506l.m1396A(), interfaceC2594n));
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: r */
    public Object mo1081r(boolean z) {
        Integer m1515j;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<C2570b, InterfaceC2594n>> it = this.f6707f.iterator();
        int i = 0;
        boolean z2 = true;
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry<C2570b, InterfaceC2594n> next = it.next();
            String m1164e = next.getKey().m1164e();
            hashMap.put(m1164e, next.getValue().mo1081r(z));
            i++;
            if (z2) {
                if ((m1164e.length() > 1 && m1164e.charAt(0) == '0') || (m1515j = C2472l.m1515j(m1164e)) == null || m1515j.intValue() < 0) {
                    z2 = false;
                } else if (m1515j.intValue() > i2) {
                    i2 = m1515j.intValue();
                }
            }
        }
        if (z || !z2 || i2 >= i * 2) {
            if (z && !this.f6708g.isEmpty()) {
                hashMap.put(".priority", this.f6708g.getValue());
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i2 + 1);
        for (int i3 = 0; i3 <= i2; i3++) {
            arrayList.add(hashMap.get("" + i3));
        }
        return arrayList;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: t */
    public Iterator<C2593m> mo1080t() {
        return new C2577d(this.f6707f.mo1940t());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m1150m(sb, 0);
        return sb.toString();
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: v */
    public String mo1058v(InterfaceC2594n.EnumC2596b enumC2596b) {
        boolean z;
        if (enumC2596b == InterfaceC2594n.EnumC2596b.V1) {
            StringBuilder sb = new StringBuilder();
            if (!this.f6708g.isEmpty()) {
                sb.append("priority:");
                sb.append(this.f6708g.mo1058v(InterfaceC2594n.EnumC2596b.V1));
                sb.append(":");
            }
            ArrayList<C2593m> arrayList = new ArrayList();
            Iterator<C2593m> it = iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    C2593m next = it.next();
                    arrayList.add(next);
                    z = z || !next.m1088d().mo1078c().isEmpty();
                }
            }
            if (z) {
                Collections.sort(arrayList, C2599q.m1070j());
            }
            for (C2593m c2593m : arrayList) {
                String hash = c2593m.m1088d().getHash();
                if (!hash.equals("")) {
                    sb.append(":");
                    sb.append(c2593m.m1089c().m1164e());
                    sb.append(":");
                    sb.append(hash);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
    }
}
