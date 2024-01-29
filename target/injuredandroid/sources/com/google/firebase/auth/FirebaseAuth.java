package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.internal.C2149d0;
import com.google.firebase.auth.internal.C2156h;
import com.google.firebase.auth.internal.C2162k;
import com.google.firebase.auth.internal.C2171p;
import com.google.firebase.auth.internal.C2172q;
import com.google.firebase.auth.internal.C2179x;
import com.google.firebase.auth.internal.ExecutorC2173r;
import com.google.firebase.auth.internal.InterfaceC2142a;
import com.google.firebase.auth.internal.InterfaceC2144b;
import com.google.firebase.auth.internal.InterfaceC2146c;
import com.google.firebase.auth.internal.InterfaceC2154g;
import com.google.firebase.auth.p118z.p119a.C2235i;
import com.google.firebase.auth.p118z.p119a.C2250o0;
import com.google.firebase.auth.p118z.p119a.C2262u0;
import com.google.firebase.auth.p118z.p119a.C2270y0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.C1292j;
import p054b.p059c.p098c.C1415c;
import p054b.p059c.p098c.p102m.C1437b;
/* loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC2144b {

    /* renamed from: a */
    private C1415c f5846a;

    /* renamed from: b */
    private final List<InterfaceC2121b> f5847b;

    /* renamed from: c */
    private final List<InterfaceC2142a> f5848c;

    /* renamed from: d */
    private List<InterfaceC2120a> f5849d;

    /* renamed from: e */
    private C2235i f5850e;

    /* renamed from: f */
    private AbstractC2190n f5851f;

    /* renamed from: g */
    private final Object f5852g;

    /* renamed from: h */
    private String f5853h;

    /* renamed from: i */
    private final C2172q f5854i;

    /* renamed from: j */
    private final C2156h f5855j;

    /* renamed from: k */
    private C2171p f5856k;

    /* renamed from: l */
    private ExecutorC2173r f5857l;

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2120a {
        /* renamed from: a */
        void m2403a(FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2121b {
        /* renamed from: a */
        void m2402a(FirebaseAuth firebaseAuth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.auth.FirebaseAuth$c */
    /* loaded from: classes.dex */
    public class C2122c implements InterfaceC2146c {
        C2122c() {
        }

        @Override // com.google.firebase.auth.internal.InterfaceC2146c
        /* renamed from: a */
        public final void mo2288a(C1237q1 c1237q1, AbstractC2190n abstractC2190n) {
            C1679r.m3631h(c1237q1);
            C1679r.m3631h(abstractC2190n);
            abstractC2190n.mo2297p(c1237q1);
            FirebaseAuth.this.m2416j(abstractC2190n, c1237q1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.auth.FirebaseAuth$d */
    /* loaded from: classes.dex */
    public class C2123d implements InterfaceC2146c, InterfaceC2154g {
        C2123d() {
        }

        @Override // com.google.firebase.auth.internal.InterfaceC2146c
        /* renamed from: a */
        public final void mo2288a(C1237q1 c1237q1, AbstractC2190n abstractC2190n) {
            C1679r.m3631h(c1237q1);
            C1679r.m3631h(abstractC2190n);
            abstractC2190n.mo2297p(c1237q1);
            FirebaseAuth.this.m2415k(abstractC2190n, c1237q1, true, true);
        }

        @Override // com.google.firebase.auth.internal.InterfaceC2154g
        /* renamed from: e */
        public final void mo2287e(Status status) {
            if (status.m3969b() == 17011 || status.m3969b() == 17021 || status.m3969b() == 17005 || status.m3969b() == 17091) {
                FirebaseAuth.this.m2420f();
            }
        }
    }

    public FirebaseAuth(C1415c c1415c) {
        this(c1415c, C2262u0.m2173a(c1415c.m4200j(), new C2270y0(c1415c.m4196n().m4180b()).m2163a()), new C2172q(c1415c.m4200j(), c1415c.m4195o()), C2156h.m2361a());
    }

    private FirebaseAuth(C1415c c1415c, C2235i c2235i, C2172q c2172q, C2156h c2156h) {
        C1237q1 m2327f;
        this.f5852g = new Object();
        C1679r.m3631h(c1415c);
        this.f5846a = c1415c;
        C1679r.m3631h(c2235i);
        this.f5850e = c2235i;
        C1679r.m3631h(c2172q);
        this.f5854i = c2172q;
        C1679r.m3631h(c2156h);
        this.f5855j = c2156h;
        this.f5847b = new CopyOnWriteArrayList();
        this.f5848c = new CopyOnWriteArrayList();
        this.f5849d = new CopyOnWriteArrayList();
        this.f5857l = ExecutorC2173r.m2325a();
        AbstractC2190n m2332a = this.f5854i.m2332a();
        this.f5851f = m2332a;
        if (m2332a != null && (m2327f = this.f5854i.m2327f(m2332a)) != null) {
            m2416j(this.f5851f, m2327f, false);
        }
        this.f5855j.m2359c(this);
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C1415c.m4199k().m4202h(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(C1415c c1415c) {
        return (FirebaseAuth) c1415c.m4202h(FirebaseAuth.class);
    }

    /* renamed from: l */
    private final synchronized void m2414l(C2171p c2171p) {
        this.f5856k = c2171p;
    }

    /* renamed from: q */
    private final boolean m2409q(String str) {
        C2139h0 m2393a = C2139h0.m2393a(str);
        return (m2393a == null || TextUtils.equals(this.f5853h, m2393a.m2391c())) ? false : true;
    }

    /* renamed from: t */
    private final void m2406t(AbstractC2190n abstractC2190n) {
        String str;
        if (abstractC2190n != null) {
            String mo2303c = abstractC2190n.mo2303c();
            StringBuilder sb = new StringBuilder(String.valueOf(mo2303c).length() + 45);
            sb.append("Notifying id token listeners about user ( ");
            sb.append(mo2303c);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        this.f5857l.execute(new RunnableC2191n0(this, new C1437b(abstractC2190n != null ? abstractC2190n.mo2290y() : null)));
    }

    /* renamed from: u */
    private final synchronized C2171p m2405u() {
        if (this.f5856k == null) {
            m2414l(new C2171p(this.f5846a));
        }
        return this.f5856k;
    }

    /* renamed from: v */
    private final void m2404v(AbstractC2190n abstractC2190n) {
        String str;
        if (abstractC2190n != null) {
            String mo2303c = abstractC2190n.mo2303c();
            StringBuilder sb = new StringBuilder(String.valueOf(mo2303c).length() + 47);
            sb.append("Notifying auth state listeners about user ( ");
            sb.append(mo2303c);
            sb.append(" ).");
            str = sb.toString();
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        this.f5857l.execute(new RunnableC2195p0(this));
    }

    @Override // com.google.firebase.auth.internal.InterfaceC2144b
    /* renamed from: a */
    public void mo2381a(InterfaceC2142a interfaceC2142a) {
        C1679r.m3631h(interfaceC2142a);
        this.f5848c.add(interfaceC2142a);
        m2405u().m2338b(this.f5848c.size());
    }

    @Override // com.google.firebase.auth.internal.InterfaceC2144b
    /* renamed from: b */
    public AbstractC1288g<C2194p> mo2380b(boolean z) {
        return m2419g(this.f5851f, z);
    }

    /* renamed from: c */
    public AbstractC2190n m2423c() {
        return this.f5851f;
    }

    /* renamed from: d */
    public AbstractC1288g<Object> m2422d() {
        AbstractC2190n abstractC2190n = this.f5851f;
        if (abstractC2190n == null || !abstractC2190n.mo2302h()) {
            return this.f5850e.m2244m(this.f5846a, new C2122c(), this.f5853h);
        }
        C2149d0 c2149d0 = (C2149d0) this.f5851f;
        c2149d0.m2371E(false);
        return C1292j.m4604b(new C2179x(c2149d0));
    }

    /* renamed from: e */
    public AbstractC1288g<Object> m2421e(AbstractC2126b abstractC2126b) {
        C1679r.m3631h(abstractC2126b);
        AbstractC2126b mo2269c = abstractC2126b.mo2269c();
        if (mo2269c instanceof C2128c) {
            C2128c c2128c = (C2128c) mo2269c;
            return !c2128c.m2396p() ? this.f5850e.m2238s(this.f5846a, c2128c.m2399k(), c2128c.m2398n(), this.f5853h, new C2122c()) : m2409q(c2128c.m2397o()) ? C1292j.m4605a(C2250o0.m2225a(new Status(17072))) : this.f5850e.m2248i(this.f5846a, c2128c, new C2122c());
        } else if (mo2269c instanceof C2202t) {
            return this.f5850e.m2245l(this.f5846a, (C2202t) mo2269c, this.f5853h, new C2122c());
        } else {
            return this.f5850e.m2249h(this.f5846a, mo2269c, this.f5853h, new C2122c());
        }
    }

    /* renamed from: f */
    public void m2420f() {
        m2417i();
        C2171p c2171p = this.f5856k;
        if (c2171p != null) {
            c2171p.m2339a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.o0] */
    /* renamed from: g */
    public final AbstractC1288g<C2194p> m2419g(AbstractC2190n abstractC2190n, boolean z) {
        if (abstractC2190n == null) {
            return C1292j.m4605a(C2250o0.m2225a(new Status(17495)));
        }
        C1237q1 mo2292w = abstractC2190n.mo2292w();
        return (!mo2292w.m4674h() || z) ? this.f5850e.m2246k(this.f5846a, abstractC2190n, mo2292w.m4673j(), new C2193o0(this)) : C1292j.m4604b(C2162k.m2353a(mo2292w.m4672k()));
    }

    /* renamed from: i */
    public final void m2417i() {
        AbstractC2190n abstractC2190n = this.f5851f;
        if (abstractC2190n != null) {
            C2172q c2172q = this.f5854i;
            C1679r.m3631h(abstractC2190n);
            c2172q.m2328e(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC2190n.mo2303c()));
            this.f5851f = null;
        }
        this.f5854i.m2328e("com.google.firebase.auth.FIREBASE_USER");
        m2406t(null);
        m2404v(null);
    }

    /* renamed from: j */
    public final void m2416j(AbstractC2190n abstractC2190n, C1237q1 c1237q1, boolean z) {
        m2415k(abstractC2190n, c1237q1, z, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r0 == false) goto L12;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2415k(com.google.firebase.auth.AbstractC2190n r5, p054b.p059c.p060a.p061a.p068d.p071c.C1237q1 r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.C1679r.m3631h(r5)
            com.google.android.gms.common.internal.C1679r.m3631h(r6)
            com.google.firebase.auth.n r0 = r4.f5851f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            java.lang.String r0 = r5.mo2303c()
            com.google.firebase.auth.n r3 = r4.f5851f
            java.lang.String r3 = r3.mo2303c()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L24
            if (r8 == 0) goto L24
            return
        L24:
            com.google.firebase.auth.n r8 = r4.f5851f
            if (r8 != 0) goto L2a
        L28:
            r1 = 1
            goto L46
        L2a:
            b.c.a.a.d.c.q1 r8 = r8.mo2292w()
            java.lang.String r8 = r8.m4672k()
            java.lang.String r3 = r6.m4672k()
            boolean r8 = r8.equals(r3)
            r8 = r8 ^ r2
            if (r0 == 0) goto L41
            if (r8 != 0) goto L41
            r8 = 0
            goto L42
        L41:
            r8 = 1
        L42:
            r2 = r8
            if (r0 != 0) goto L46
            goto L28
        L46:
            com.google.android.gms.common.internal.C1679r.m3631h(r5)
            com.google.firebase.auth.n r8 = r4.f5851f
            if (r8 != 0) goto L50
            r4.f5851f = r5
            goto L6f
        L50:
            java.util.List r0 = r5.mo2304b()
            r8.mo2299n(r0)
            boolean r8 = r5.mo2302h()
            if (r8 != 0) goto L62
            com.google.firebase.auth.n r8 = r4.f5851f
            r8.mo2296q()
        L62:
            com.google.firebase.auth.v0 r8 = r5.mo2289z()
            java.util.List r8 = r8.mo2272a()
            com.google.firebase.auth.n r0 = r4.f5851f
            r0.mo2295r(r8)
        L6f:
            if (r7 == 0) goto L78
            com.google.firebase.auth.internal.q r8 = r4.f5854i
            com.google.firebase.auth.n r0 = r4.f5851f
            r8.m2330c(r0)
        L78:
            if (r2 == 0) goto L86
            com.google.firebase.auth.n r8 = r4.f5851f
            if (r8 == 0) goto L81
            r8.mo2297p(r6)
        L81:
            com.google.firebase.auth.n r8 = r4.f5851f
            r4.m2406t(r8)
        L86:
            if (r1 == 0) goto L8d
            com.google.firebase.auth.n r8 = r4.f5851f
            r4.m2404v(r8)
        L8d:
            if (r7 == 0) goto L94
            com.google.firebase.auth.internal.q r7 = r4.f5854i
            r7.m2329d(r5, r6)
        L94:
            com.google.firebase.auth.internal.p r5 = r4.m2405u()
            com.google.firebase.auth.n r6 = r4.f5851f
            b.c.a.a.d.c.q1 r6 = r6.mo2292w()
            r5.m2337c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.m2415k(com.google.firebase.auth.n, b.c.a.a.d.c.q1, boolean, boolean):void");
    }

    /* renamed from: m */
    public final void m2413m(String str) {
        C1679r.m3633f(str);
        synchronized (this.f5852g) {
            this.f5853h = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* renamed from: n */
    public final AbstractC1288g<Object> m2412n(AbstractC2190n abstractC2190n, AbstractC2126b abstractC2126b) {
        C1679r.m3631h(abstractC2190n);
        C1679r.m3631h(abstractC2126b);
        AbstractC2126b mo2269c = abstractC2126b.mo2269c();
        if (!(mo2269c instanceof C2128c)) {
            return mo2269c instanceof C2202t ? this.f5850e.m2240q(this.f5846a, abstractC2190n, (C2202t) mo2269c, this.f5853h, new C2123d()) : this.f5850e.m2242o(this.f5846a, abstractC2190n, mo2269c, abstractC2190n.mo2293v(), new C2123d());
        }
        C2128c c2128c = (C2128c) mo2269c;
        return "password".equals(c2128c.m2401h()) ? this.f5850e.m2239r(this.f5846a, abstractC2190n, c2128c.m2399k(), c2128c.m2398n(), abstractC2190n.mo2293v(), new C2123d()) : m2409q(c2128c.m2397o()) ? C1292j.m4605a(C2250o0.m2225a(new Status(17072))) : this.f5850e.m2241p(this.f5846a, abstractC2190n, c2128c, new C2123d());
    }

    /* renamed from: o */
    public final C1415c m2411o() {
        return this.f5846a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.u, com.google.firebase.auth.FirebaseAuth$d] */
    /* renamed from: r */
    public final AbstractC1288g<Object> m2408r(AbstractC2190n abstractC2190n, AbstractC2126b abstractC2126b) {
        C1679r.m3631h(abstractC2126b);
        C1679r.m3631h(abstractC2190n);
        return this.f5850e.m2247j(this.f5846a, abstractC2190n, abstractC2126b.mo2269c(), new C2123d());
    }
}
