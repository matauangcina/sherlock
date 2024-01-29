package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.C1548a.InterfaceC1552d;
import com.google.android.gms.common.api.internal.AbstractC1600m;
import com.google.android.gms.common.api.internal.BinderC1578c0;
import com.google.android.gms.common.api.internal.C1572a;
import com.google.android.gms.common.api.internal.C1574b;
import com.google.android.gms.common.api.internal.C1581e;
import com.google.android.gms.common.api.internal.InterfaceC1598l;
import com.google.android.gms.common.internal.C1648d;
import com.google.android.gms.common.internal.C1679r;
import java.util.Collections;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.android.gms.common.api.e */
/* loaded from: classes.dex */
public class C1562e<O extends C1548a.InterfaceC1552d> {

    /* renamed from: a */
    private final Context f4607a;

    /* renamed from: b */
    private final C1548a<O> f4608b;

    /* renamed from: c */
    private final O f4609c;

    /* renamed from: d */
    private final C1574b<O> f4610d;

    /* renamed from: e */
    private final int f4611e;

    /* renamed from: f */
    private final InterfaceC1598l f4612f;

    /* renamed from: g */
    protected final C1581e f4613g;

    /* renamed from: com.google.android.gms.common.api.e$a */
    /* loaded from: classes.dex */
    public static class C1563a {

        /* renamed from: a */
        public final InterfaceC1598l f4614a;

        /* renamed from: b */
        public final Looper f4615b;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        /* loaded from: classes.dex */
        public static class C1564a {

            /* renamed from: a */
            private InterfaceC1598l f4616a;

            /* renamed from: b */
            private Looper f4617b;

            /* renamed from: a */
            public C1563a m3938a() {
                if (this.f4616a == null) {
                    this.f4616a = new C1572a();
                }
                if (this.f4617b == null) {
                    this.f4617b = Looper.getMainLooper();
                }
                return new C1563a(this.f4616a, this.f4617b);
            }

            /* renamed from: b */
            public C1564a m3937b(InterfaceC1598l interfaceC1598l) {
                C1679r.m3630i(interfaceC1598l, "StatusExceptionMapper must not be null.");
                this.f4616a = interfaceC1598l;
                return this;
            }
        }

        static {
            new C1564a().m3938a();
        }

        private C1563a(InterfaceC1598l interfaceC1598l, Account account, Looper looper) {
            this.f4614a = interfaceC1598l;
            this.f4615b = looper;
        }
    }

    public C1562e(Context context, C1548a<O> c1548a, O o, C1563a c1563a) {
        C1679r.m3630i(context, "Null context is not permitted.");
        C1679r.m3630i(c1548a, "Api must not be null.");
        C1679r.m3630i(c1563a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f4607a = context.getApplicationContext();
        this.f4608b = c1548a;
        this.f4609c = o;
        Looper looper = c1563a.f4615b;
        this.f4610d = C1574b.m3910b(c1548a, o);
        C1581e m3892f = C1581e.m3892f(this.f4607a);
        this.f4613g = m3892f;
        this.f4611e = m3892f.m3890h();
        this.f4612f = c1563a.f4614a;
        this.f4613g.m3895c(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1562e(android.content.Context r2, com.google.android.gms.common.api.C1548a<O> r3, O r4, com.google.android.gms.common.api.internal.InterfaceC1598l r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.m3937b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.m3938a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C1562e.<init>(android.content.Context, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.l):void");
    }

    /* renamed from: i */
    private final <TResult, A extends C1548a.InterfaceC1550b> AbstractC1288g<TResult> m3939i(int i, AbstractC1600m<A, TResult> abstractC1600m) {
        C1289h c1289h = new C1289h();
        this.f4613g.m3894d(this, i, abstractC1600m, c1289h, this.f4612f);
        return c1289h.m4610a();
    }

    /* renamed from: a */
    protected C1648d.C1649a m3947a() {
        Account m3962c;
        GoogleSignInAccount m3961a;
        GoogleSignInAccount m3961a2;
        C1648d.C1649a c1649a = new C1648d.C1649a();
        O o = this.f4609c;
        if (!(o instanceof C1548a.InterfaceC1552d.InterfaceC1554b) || (m3961a2 = ((C1548a.InterfaceC1552d.InterfaceC1554b) o).m3961a()) == null) {
            O o2 = this.f4609c;
            m3962c = o2 instanceof C1548a.InterfaceC1552d.InterfaceC1553a ? ((C1548a.InterfaceC1552d.InterfaceC1553a) o2).m3962c() : null;
        } else {
            m3962c = m3961a2.m3989b();
        }
        c1649a.m3712c(m3962c);
        O o3 = this.f4609c;
        c1649a.m3714a((!(o3 instanceof C1548a.InterfaceC1552d.InterfaceC1554b) || (m3961a = ((C1548a.InterfaceC1552d.InterfaceC1554b) o3).m3961a()) == null) ? Collections.emptySet() : m3961a.m3981q());
        c1649a.m3711d(this.f4607a.getClass().getName());
        c1649a.m3710e(this.f4607a.getPackageName());
        return c1649a;
    }

    /* renamed from: b */
    public <TResult, A extends C1548a.InterfaceC1550b> AbstractC1288g<TResult> m3946b(AbstractC1600m<A, TResult> abstractC1600m) {
        return m3939i(0, abstractC1600m);
    }

    /* renamed from: c */
    public <TResult, A extends C1548a.InterfaceC1550b> AbstractC1288g<TResult> m3945c(AbstractC1600m<A, TResult> abstractC1600m) {
        return m3939i(1, abstractC1600m);
    }

    /* renamed from: d */
    public C1574b<O> m3944d() {
        return this.f4610d;
    }

    /* renamed from: e */
    public O m3943e() {
        return this.f4609c;
    }

    /* renamed from: f */
    public final int m3942f() {
        return this.f4611e;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.common.api.a$f] */
    /* renamed from: g */
    public C1548a.InterfaceC1556f m3941g(Looper looper, C1581e.C1582a<O> c1582a) {
        return this.f4608b.m3964b().mo3963a(this.f4607a, looper, m3947a().m3713b(), this.f4609c, c1582a, c1582a);
    }

    /* renamed from: h */
    public BinderC1578c0 m3940h(Context context, Handler handler) {
        return new BinderC1578c0(context, handler, m3947a().m3713b());
    }
}
