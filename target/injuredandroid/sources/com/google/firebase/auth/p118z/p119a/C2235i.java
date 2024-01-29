package com.google.firebase.auth.p118z.p119a;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.AbstractC2126b;
import com.google.firebase.auth.AbstractC2190n;
import com.google.firebase.auth.C2128c;
import com.google.firebase.auth.C2194p;
import com.google.firebase.auth.C2202t;
import com.google.firebase.auth.internal.C2149d0;
import com.google.firebase.auth.internal.C2151e0;
import com.google.firebase.auth.internal.C2166m;
import com.google.firebase.auth.internal.C2181z;
import com.google.firebase.auth.internal.InterfaceC2146c;
import com.google.firebase.auth.internal.InterfaceC2176u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import p054b.p059c.p060a.p061a.p068d.p071c.C1210h2;
import p054b.p059c.p060a.p061a.p068d.p071c.C1225m1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1231o1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1249u1;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.C1292j;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.auth.z.a.i */
/* loaded from: classes.dex */
public final class C2235i extends AbstractC2214b<C2264v0> {

    /* renamed from: c */
    private final Context f6001c;

    /* renamed from: d */
    private final C2264v0 f6002d;

    /* renamed from: e */
    private final Future<C2211a<C2264v0>> f6003e = mo2251c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2235i(Context context, C2264v0 c2264v0) {
        this.f6001c = context;
        this.f6002d = c2264v0;
    }

    /* renamed from: g */
    private final <ResultT> AbstractC1288g<ResultT> m2250g(AbstractC1288g<ResultT> abstractC1288g, InterfaceC2223e<InterfaceC2248n0, ResultT> interfaceC2223e) {
        return (AbstractC1288g<ResultT>) abstractC1288g.mo4582h(new C2232h(this, interfaceC2223e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static C2149d0 m2243n(C1415c c1415c, C1225m1 c1225m1) {
        C1679r.m3631h(c1415c);
        C1679r.m3631h(c1225m1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2181z(c1225m1, "firebase"));
        List<C1249u1> m4683r = c1225m1.m4683r();
        if (m4683r != null && !m4683r.isEmpty()) {
            for (int i = 0; i < m4683r.size(); i++) {
                arrayList.add(new C2181z(m4683r.get(i)));
            }
        }
        C2149d0 c2149d0 = new C2149d0(c1415c, arrayList);
        c2149d0.m2373C(new C2151e0(c1225m1.m4685p(), c1225m1.m4686o()));
        c2149d0.m2371E(c1225m1.m4684q());
        c2149d0.m2372D(c1225m1.m4682t());
        c2149d0.mo2295r(C2166m.m2348b(c1225m1.m4681v()));
        return c2149d0;
    }

    @Override // com.google.firebase.auth.p118z.p119a.AbstractC2214b
    /* renamed from: c */
    final Future<C2211a<C2264v0>> mo2251c() {
        Future<C2211a<C2264v0>> future = this.f6003e;
        if (future != null) {
            return future;
        }
        return C1231o1.m4680a().mo4722a(C1210h2.f3951a).submit(new CallableC2244l0(this.f6002d, this.f6001c));
    }

    /* renamed from: h */
    public final AbstractC1288g<Object> m2249h(C1415c c1415c, AbstractC2126b abstractC2126b, String str, InterfaceC2146c interfaceC2146c) {
        C2224e0 c2224e0 = new C2224e0(abstractC2126b, str);
        c2224e0.m2160e(c1415c);
        c2224e0.m2157h(interfaceC2146c);
        C2224e0 c2224e02 = c2224e0;
        return m2250g(m2262e(c2224e02), c2224e02);
    }

    /* renamed from: i */
    public final AbstractC1288g<Object> m2248i(C1415c c1415c, C2128c c2128c, InterfaceC2146c interfaceC2146c) {
        C2236i0 c2236i0 = new C2236i0(c2128c);
        c2236i0.m2160e(c1415c);
        c2236i0.m2157h(interfaceC2146c);
        C2236i0 c2236i02 = c2236i0;
        return m2250g(m2262e(c2236i02), c2236i02);
    }

    /* renamed from: j */
    public final AbstractC1288g<Object> m2247j(C1415c c1415c, AbstractC2190n abstractC2190n, AbstractC2126b abstractC2126b, InterfaceC2176u interfaceC2176u) {
        C1679r.m3631h(c1415c);
        C1679r.m3631h(abstractC2126b);
        C1679r.m3631h(abstractC2190n);
        C1679r.m3631h(interfaceC2176u);
        List<String> mo2298o = abstractC2190n.mo2298o();
        if (mo2298o == null || !mo2298o.contains(abstractC2126b.mo2270b())) {
            if (abstractC2126b instanceof C2128c) {
                C2128c c2128c = (C2128c) abstractC2126b;
                if (c2128c.m2396p()) {
                    C2257s c2257s = new C2257s(c2128c);
                    c2257s.m2160e(c1415c);
                    c2257s.m2159f(abstractC2190n);
                    c2257s.m2157h(interfaceC2176u);
                    c2257s.m2158g(interfaceC2176u);
                    C2257s c2257s2 = c2257s;
                    return m2250g(m2262e(c2257s2), c2257s2);
                }
                C2245m c2245m = new C2245m(c2128c);
                c2245m.m2160e(c1415c);
                c2245m.m2159f(abstractC2190n);
                c2245m.m2157h(interfaceC2176u);
                c2245m.m2158g(interfaceC2176u);
                C2245m c2245m2 = c2245m;
                return m2250g(m2262e(c2245m2), c2245m2);
            } else if (abstractC2126b instanceof C2202t) {
                C2253q c2253q = new C2253q((C2202t) abstractC2126b);
                c2253q.m2160e(c1415c);
                c2253q.m2159f(abstractC2190n);
                c2253q.m2157h(interfaceC2176u);
                c2253q.m2158g(interfaceC2176u);
                C2253q c2253q2 = c2253q;
                return m2250g(m2262e(c2253q2), c2253q2);
            } else {
                C1679r.m3631h(c1415c);
                C1679r.m3631h(abstractC2126b);
                C1679r.m3631h(abstractC2190n);
                C1679r.m3631h(interfaceC2176u);
                C2249o c2249o = new C2249o(abstractC2126b);
                c2249o.m2160e(c1415c);
                c2249o.m2159f(abstractC2190n);
                c2249o.m2157h(interfaceC2176u);
                c2249o.m2158g(interfaceC2176u);
                C2249o c2249o2 = c2249o;
                return m2250g(m2262e(c2249o2), c2249o2);
            }
        }
        return C1292j.m4605a(C2250o0.m2225a(new Status(17015)));
    }

    /* renamed from: k */
    public final AbstractC1288g<C2194p> m2246k(C1415c c1415c, AbstractC2190n abstractC2190n, String str, InterfaceC2176u interfaceC2176u) {
        C2241k c2241k = new C2241k(str);
        c2241k.m2160e(c1415c);
        c2241k.m2159f(abstractC2190n);
        c2241k.m2157h(interfaceC2176u);
        c2241k.m2158g(interfaceC2176u);
        C2241k c2241k2 = c2241k;
        return m2250g(m2264b(c2241k2), c2241k2);
    }

    /* renamed from: l */
    public final AbstractC1288g<Object> m2245l(C1415c c1415c, C2202t c2202t, String str, InterfaceC2146c interfaceC2146c) {
        C2242k0 c2242k0 = new C2242k0(c2202t, str);
        c2242k0.m2160e(c1415c);
        c2242k0.m2157h(interfaceC2146c);
        C2242k0 c2242k02 = c2242k0;
        return m2250g(m2262e(c2242k02), c2242k02);
    }

    /* renamed from: m */
    public final AbstractC1288g<Object> m2244m(C1415c c1415c, InterfaceC2146c interfaceC2146c, String str) {
        C2218c0 c2218c0 = new C2218c0(str);
        c2218c0.m2160e(c1415c);
        c2218c0.m2157h(interfaceC2146c);
        C2218c0 c2218c02 = c2218c0;
        return m2250g(m2262e(c2218c02), c2218c02);
    }

    /* renamed from: o */
    public final AbstractC1288g<Object> m2242o(C1415c c1415c, AbstractC2190n abstractC2190n, AbstractC2126b abstractC2126b, String str, InterfaceC2176u interfaceC2176u) {
        C2261u c2261u = new C2261u(abstractC2126b, str);
        c2261u.m2160e(c1415c);
        c2261u.m2159f(abstractC2190n);
        c2261u.m2157h(interfaceC2176u);
        c2261u.m2158g(interfaceC2176u);
        C2261u c2261u2 = c2261u;
        return m2250g(m2262e(c2261u2), c2261u2);
    }

    /* renamed from: p */
    public final AbstractC1288g<Object> m2241p(C1415c c1415c, AbstractC2190n abstractC2190n, C2128c c2128c, InterfaceC2176u interfaceC2176u) {
        C2265w c2265w = new C2265w(c2128c);
        c2265w.m2160e(c1415c);
        c2265w.m2159f(abstractC2190n);
        c2265w.m2157h(interfaceC2176u);
        c2265w.m2158g(interfaceC2176u);
        C2265w c2265w2 = c2265w;
        return m2250g(m2262e(c2265w2), c2265w2);
    }

    /* renamed from: q */
    public final AbstractC1288g<Object> m2240q(C1415c c1415c, AbstractC2190n abstractC2190n, C2202t c2202t, String str, InterfaceC2176u interfaceC2176u) {
        C2212a0 c2212a0 = new C2212a0(c2202t, str);
        c2212a0.m2160e(c1415c);
        c2212a0.m2159f(abstractC2190n);
        c2212a0.m2157h(interfaceC2176u);
        c2212a0.m2158g(interfaceC2176u);
        C2212a0 c2212a02 = c2212a0;
        return m2250g(m2262e(c2212a02), c2212a02);
    }

    /* renamed from: r */
    public final AbstractC1288g<Object> m2239r(C1415c c1415c, AbstractC2190n abstractC2190n, String str, String str2, String str3, InterfaceC2176u interfaceC2176u) {
        C2269y c2269y = new C2269y(str, str2, str3);
        c2269y.m2160e(c1415c);
        c2269y.m2159f(abstractC2190n);
        c2269y.m2157h(interfaceC2176u);
        c2269y.m2158g(interfaceC2176u);
        C2269y c2269y2 = c2269y;
        return m2250g(m2262e(c2269y2), c2269y2);
    }

    /* renamed from: s */
    public final AbstractC1288g<Object> m2238s(C1415c c1415c, String str, String str2, String str3, InterfaceC2146c interfaceC2146c) {
        C2230g0 c2230g0 = new C2230g0(str, str2, str3);
        c2230g0.m2160e(c1415c);
        c2230g0.m2157h(interfaceC2146c);
        C2230g0 c2230g02 = c2230g0;
        return m2250g(m2262e(c2230g02), c2230g02);
    }
}
