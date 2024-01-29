package com.google.firebase.database.p124p.p126f0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p127g0.C2457d;
import com.google.firebase.database.p124p.p127g0.InterfaceC2465i;
import com.google.firebase.database.p131r.C2570b;
/* renamed from: com.google.firebase.database.p.f0.g */
/* loaded from: classes.dex */
public class C2437g {

    /* renamed from: b */
    private static final InterfaceC2465i<Boolean> f6394b = new C2438a();

    /* renamed from: c */
    private static final InterfaceC2465i<Boolean> f6395c = new C2439b();

    /* renamed from: d */
    private static final C2457d<Boolean> f6396d = new C2457d<>(Boolean.TRUE);

    /* renamed from: e */
    private static final C2457d<Boolean> f6397e = new C2457d<>(Boolean.FALSE);

    /* renamed from: a */
    private final C2457d<Boolean> f6398a;

    /* renamed from: com.google.firebase.database.p.f0.g$a */
    /* loaded from: classes.dex */
    class C2438a implements InterfaceC2465i<Boolean> {
        C2438a() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    /* renamed from: com.google.firebase.database.p.f0.g$b */
    /* loaded from: classes.dex */
    class C2439b implements InterfaceC2465i<Boolean> {
        C2439b() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2465i
        /* renamed from: b */
        public boolean mo1540a(Boolean bool) {
            return bool.booleanValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.firebase.database.p.f0.g$c */
    /* loaded from: classes.dex */
    class C2440c<T> implements C2457d.InterfaceC2460c<Boolean, T> {

        /* renamed from: a */
        final /* synthetic */ C2457d.InterfaceC2460c f6399a;

        C2440c(C2437g c2437g, C2457d.InterfaceC2460c interfaceC2460c) {
            this.f6399a = interfaceC2460c;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public T mo1221a(C2506l c2506l, Boolean bool, T t) {
            return !bool.booleanValue() ? (T) this.f6399a.mo1221a(c2506l, null, t) : t;
        }
    }

    public C2437g() {
        this.f6398a = C2457d.m1561e();
    }

    private C2437g(C2457d<Boolean> c2457d) {
        this.f6398a = c2457d;
    }

    /* renamed from: a */
    public C2437g m1650a(C2570b c2570b) {
        C2457d<Boolean> m1554u = this.f6398a.m1554u(c2570b);
        if (m1554u == null) {
            m1554u = new C2457d<>(this.f6398a.getValue());
        } else if (m1554u.getValue() == null && this.f6398a.getValue() != null) {
            m1554u = m1554u.m1566B(C2506l.m1385w(), this.f6398a.getValue());
        }
        return new C2437g(m1554u);
    }

    /* renamed from: b */
    public <T> T m1649b(T t, C2457d.InterfaceC2460c<Void, T> interfaceC2460c) {
        return (T) this.f6398a.m1557l(t, new C2440c(this, interfaceC2460c));
    }

    /* renamed from: c */
    public C2437g m1648c(C2506l c2506l) {
        return this.f6398a.m1567A(c2506l, f6394b) != null ? this : new C2437g(this.f6398a.m1565C(c2506l, f6397e));
    }

    /* renamed from: d */
    public C2437g m1647d(C2506l c2506l) {
        if (this.f6398a.m1567A(c2506l, f6394b) == null) {
            return this.f6398a.m1567A(c2506l, f6395c) != null ? this : new C2437g(this.f6398a.m1565C(c2506l, f6396d));
        }
        throw new IllegalArgumentException("Can't prune path that was kept previously!");
    }

    /* renamed from: e */
    public boolean m1646e() {
        return this.f6398a.m1562d(f6395c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2437g) && this.f6398a.equals(((C2437g) obj).f6398a);
    }

    /* renamed from: f */
    public boolean m1645f(C2506l c2506l) {
        Boolean m1552x = this.f6398a.m1552x(c2506l);
        return (m1552x == null || m1552x.booleanValue()) ? false : true;
    }

    /* renamed from: g */
    public boolean m1644g(C2506l c2506l) {
        Boolean m1552x = this.f6398a.m1552x(c2506l);
        return m1552x != null && m1552x.booleanValue();
    }

    public int hashCode() {
        return this.f6398a.hashCode();
    }

    public String toString() {
        return "{PruneForest:" + this.f6398a.toString() + "}";
    }
}
