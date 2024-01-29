package com.google.firebase.database.p124p.p127g0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p131r.C2570b;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.g0.j */
/* loaded from: classes.dex */
public class C2467j<T> {

    /* renamed from: a */
    private C2570b f6449a;

    /* renamed from: b */
    private C2467j<T> f6450b;

    /* renamed from: c */
    private C2471k<T> f6451c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.g0.j$a */
    /* loaded from: classes.dex */
    public class C2468a implements InterfaceC2470c<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2470c f6452a;

        /* renamed from: b */
        final /* synthetic */ boolean f6453b;

        C2468a(C2467j c2467j, InterfaceC2470c interfaceC2470c, boolean z) {
            this.f6452a = interfaceC2470c;
            this.f6453b = z;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2467j.InterfaceC2470c
        /* renamed from: a */
        public void mo1321a(C2467j<T> c2467j) {
            c2467j.m1535e(this.f6452a, true, this.f6453b);
        }
    }

    /* renamed from: com.google.firebase.database.p.g0.j$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2469b<T> {
        /* renamed from: a */
        boolean mo1322a(C2467j<T> c2467j);
    }

    /* renamed from: com.google.firebase.database.p.g0.j$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2470c<T> {
        /* renamed from: a */
        void mo1321a(C2467j<T> c2467j);
    }

    public C2467j() {
        this(null, null, new C2471k());
    }

    public C2467j(C2570b c2570b, C2467j<T> c2467j, C2471k<T> c2471k) {
        this.f6449a = c2570b;
        this.f6450b = c2467j;
        this.f6451c = c2471k;
    }

    /* renamed from: m */
    private void m1527m(C2570b c2570b, C2467j<T> c2467j) {
        boolean m1531i = c2467j.m1531i();
        boolean containsKey = this.f6451c.f6454a.containsKey(c2570b);
        if (m1531i && containsKey) {
            this.f6451c.f6454a.remove(c2570b);
        } else if (m1531i || containsKey) {
            return;
        } else {
            this.f6451c.f6454a.put(c2570b, c2467j.f6451c);
        }
        m1526n();
    }

    /* renamed from: n */
    private void m1526n() {
        C2467j<T> c2467j = this.f6450b;
        if (c2467j != null) {
            c2467j.m1527m(this.f6449a, this);
        }
    }

    /* renamed from: a */
    public boolean m1539a(InterfaceC2469b<T> interfaceC2469b) {
        return m1538b(interfaceC2469b, false);
    }

    /* renamed from: b */
    public boolean m1538b(InterfaceC2469b<T> interfaceC2469b, boolean z) {
        for (C2467j<T> c2467j = z ? this : this.f6450b; c2467j != null; c2467j = c2467j.f6450b) {
            if (interfaceC2469b.mo1322a(c2467j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m1537c(InterfaceC2470c<T> interfaceC2470c) {
        for (Object obj : this.f6451c.f6454a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            interfaceC2470c.mo1321a(new C2467j<>((C2570b) entry.getKey(), this, (C2471k) entry.getValue()));
        }
    }

    /* renamed from: d */
    public void m1536d(InterfaceC2470c<T> interfaceC2470c) {
        m1535e(interfaceC2470c, false, false);
    }

    /* renamed from: e */
    public void m1535e(InterfaceC2470c<T> interfaceC2470c, boolean z, boolean z2) {
        if (z && !z2) {
            interfaceC2470c.mo1321a(this);
        }
        m1537c(new C2468a(this, interfaceC2470c, z2));
        if (z && z2) {
            interfaceC2470c.mo1321a(this);
        }
    }

    /* renamed from: f */
    public C2506l m1534f() {
        C2467j<T> c2467j = this.f6450b;
        return c2467j != null ? c2467j.m1534f().m1389l(this.f6449a) : this.f6449a != null ? new C2506l(this.f6449a) : C2506l.m1385w();
    }

    /* renamed from: g */
    public T m1533g() {
        return this.f6451c.f6455b;
    }

    /* renamed from: h */
    public boolean m1532h() {
        return !this.f6451c.f6454a.isEmpty();
    }

    /* renamed from: i */
    public boolean m1531i() {
        C2471k<T> c2471k = this.f6451c;
        return c2471k.f6455b == null && c2471k.f6454a.isEmpty();
    }

    /* renamed from: j */
    public void m1530j(T t) {
        this.f6451c.f6455b = t;
        m1526n();
    }

    /* renamed from: k */
    public C2467j<T> m1529k(C2506l c2506l) {
        C2570b m1384x = c2506l.m1384x();
        C2467j<T> c2467j = this;
        while (m1384x != null) {
            C2467j<T> c2467j2 = new C2467j<>(m1384x, c2467j, c2467j.f6451c.f6454a.containsKey(m1384x) ? c2467j.f6451c.f6454a.get(m1384x) : new C2471k<>());
            c2506l = c2506l.m1396A();
            m1384x = c2506l.m1384x();
            c2467j = c2467j2;
        }
        return c2467j;
    }

    /* renamed from: l */
    String m1528l(String str) {
        C2570b c2570b = this.f6449a;
        String m1164e = c2570b == null ? "<anon>" : c2570b.m1164e();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m1164e);
        sb.append("\n");
        C2471k<T> c2471k = this.f6451c;
        sb.append(c2471k.m1525a(str + "\t"));
        return sb.toString();
    }

    public String toString() {
        return m1528l("");
    }
}
