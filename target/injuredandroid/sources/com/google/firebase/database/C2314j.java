package com.google.firebase.database;

import com.google.firebase.database.p124p.AbstractC2503i;
import com.google.firebase.database.p124p.C2410a0;
import com.google.firebase.database.p124p.C2420d0;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2509n;
import com.google.firebase.database.p124p.p128h0.C2485h;
import com.google.firebase.database.p124p.p128h0.C2488i;
/* renamed from: com.google.firebase.database.j */
/* loaded from: classes.dex */
public class C2314j {

    /* renamed from: a */
    protected final C2509n f6125a;

    /* renamed from: b */
    protected final C2506l f6126b;

    /* renamed from: c */
    protected final C2485h f6127c = C2485h.f6484i;

    /* renamed from: com.google.firebase.database.j$a */
    /* loaded from: classes.dex */
    class C2315a implements InterfaceC2322l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2322l f6128a;

        C2315a(InterfaceC2322l interfaceC2322l) {
            this.f6128a = interfaceC2322l;
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: a */
        public void mo2039a(C2306b c2306b) {
            this.f6128a.mo2039a(c2306b);
        }

        @Override // com.google.firebase.database.InterfaceC2322l
        /* renamed from: b */
        public void mo2038b(C2305a c2305a) {
            C2314j.this.m2046f(this);
            this.f6128a.mo2038b(c2305a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.j$b */
    /* loaded from: classes.dex */
    public class RunnableC2316b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC2503i f6130f;

        RunnableC2316b(AbstractC2503i abstractC2503i) {
            this.f6130f = abstractC2503i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2314j.this.f6125a.m1359O(this.f6130f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.j$c */
    /* loaded from: classes.dex */
    public class RunnableC2317c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC2503i f6132f;

        RunnableC2317c(AbstractC2503i abstractC2503i) {
            this.f6132f = abstractC2503i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2314j.this.f6125a.m1371C(this.f6132f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2314j(C2509n c2509n, C2506l c2506l) {
        this.f6125a = c2509n;
        this.f6126b = c2506l;
    }

    /* renamed from: a */
    private void m2051a(AbstractC2503i abstractC2503i) {
        C2420d0.m1710b().m1709c(abstractC2503i);
        this.f6125a.m1354T(new RunnableC2317c(abstractC2503i));
    }

    /* renamed from: g */
    private void m2045g(AbstractC2503i abstractC2503i) {
        C2420d0.m1710b().m1707e(abstractC2503i);
        this.f6125a.m1354T(new RunnableC2316b(abstractC2503i));
    }

    /* renamed from: b */
    public void m2050b(InterfaceC2322l interfaceC2322l) {
        m2051a(new C2410a0(this.f6125a, new C2315a(interfaceC2322l), m2047e()));
    }

    /* renamed from: c */
    public InterfaceC2322l m2049c(InterfaceC2322l interfaceC2322l) {
        m2051a(new C2410a0(this.f6125a, interfaceC2322l, m2047e()));
        return interfaceC2322l;
    }

    /* renamed from: d */
    public C2506l m2048d() {
        return this.f6126b;
    }

    /* renamed from: e */
    public C2488i m2047e() {
        return new C2488i(this.f6126b, this.f6127c);
    }

    /* renamed from: f */
    public void m2046f(InterfaceC2322l interfaceC2322l) {
        if (interfaceC2322l == null) {
            throw new NullPointerException("listener must not be null");
        }
        m2045g(new C2410a0(this.f6125a, interfaceC2322l, m2047e()));
    }
}
