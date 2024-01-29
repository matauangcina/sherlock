package com.google.firebase.database.p124p;

import com.google.firebase.database.C2306b;
import com.google.firebase.database.p121n.InterfaceC2351h;
import com.google.firebase.database.p122o.C2363a;
import com.google.firebase.database.p122o.InterfaceC2373g;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p124p.p125e0.C2422a;
import com.google.firebase.database.p124p.p125e0.C2423b;
import com.google.firebase.database.p124p.p125e0.C2424c;
import com.google.firebase.database.p124p.p125e0.C2427e;
import com.google.firebase.database.p124p.p125e0.C2429f;
import com.google.firebase.database.p124p.p126f0.InterfaceC2435e;
import com.google.firebase.database.p124p.p127g0.C2457d;
import com.google.firebase.database.p124p.p127g0.C2461e;
import com.google.firebase.database.p124p.p127g0.C2463g;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p124p.p127g0.InterfaceC2451a;
import com.google.firebase.database.p124p.p128h0.C2475a;
import com.google.firebase.database.p124p.p128h0.C2478d;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p124p.p128h0.C2489j;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2578d;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.C2601s;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: com.google.firebase.database.p.v */
/* loaded from: classes.dex */
public class C2541v {

    /* renamed from: e */
    private final InterfaceC2557p f6624e;

    /* renamed from: f */
    private final InterfaceC2435e f6625f;

    /* renamed from: g */
    private final C2566c f6626g;

    /* renamed from: h */
    private long f6627h = 1;

    /* renamed from: a */
    private C2457d<C2540u> f6620a = C2457d.m1561e();

    /* renamed from: b */
    private final C2414b0 f6621b = new C2414b0();

    /* renamed from: c */
    private final Map<C2558w, C2488i> f6622c = new HashMap();

    /* renamed from: d */
    private final Map<C2488i, C2558w> f6623d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$a */
    /* loaded from: classes.dex */
    public class CallableC2542a implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ C2558w f6628a;

        /* renamed from: b */
        final /* synthetic */ C2506l f6629b;

        /* renamed from: c */
        final /* synthetic */ Map f6630c;

        CallableC2542a(C2558w c2558w, C2506l c2506l, Map map) {
            this.f6628a = c2558w;
            this.f6629b = c2506l;
            this.f6630c = map;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            C2488i m1257N = C2541v.this.m1257N(this.f6628a);
            if (m1257N != null) {
                C2506l m1382z = C2506l.m1382z(m1257N.m1456e(), this.f6629b);
                C2411b m1744u = C2411b.m1744u(this.f6630c);
                C2541v.this.f6625f.mo1673n(this.f6629b, m1744u);
                return C2541v.this.m1268C(m1257N, new C2424c(C2427e.m1699a(m1257N.m1457d()), m1382z, m1744u));
            }
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$b */
    /* loaded from: classes.dex */
    public class CallableC2543b implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC2503i f6632a;

        CallableC2543b(AbstractC2503i abstractC2503i) {
            this.f6632a = abstractC2503i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            C2475a mo1672o;
            InterfaceC2594n m1278d;
            C2488i mo1406e = this.f6632a.mo1406e();
            C2506l m1456e = mo1406e.m1456e();
            C2457d c2457d = C2541v.this.f6620a;
            InterfaceC2594n interfaceC2594n = null;
            C2506l c2506l = m1456e;
            boolean z = false;
            while (!c2457d.isEmpty()) {
                C2540u c2540u = (C2540u) c2457d.getValue();
                if (c2540u != null) {
                    if (interfaceC2594n == null) {
                        interfaceC2594n = c2540u.m1278d(c2506l);
                    }
                    z = z || c2540u.m1275g();
                }
                c2457d = c2457d.m1554u(c2506l.isEmpty() ? C2570b.m1162g("") : c2506l.m1384x());
                c2506l = c2506l.m1396A();
            }
            C2540u c2540u2 = (C2540u) C2541v.this.f6620a.m1555s(m1456e);
            if (c2540u2 == null) {
                c2540u2 = new C2540u(C2541v.this.f6625f);
                C2541v c2541v = C2541v.this;
                c2541v.f6620a = c2541v.f6620a.m1566B(m1456e, c2540u2);
            } else {
                z = z || c2540u2.m1275g();
                if (interfaceC2594n == null) {
                    interfaceC2594n = c2540u2.m1278d(C2506l.m1385w());
                }
            }
            C2541v.this.f6625f.mo1675l(mo1406e);
            if (interfaceC2594n != null) {
                mo1672o = new C2475a(C2587i.m1107f(interfaceC2594n, mo1406e.m1458c()), true, false);
            } else {
                mo1672o = C2541v.this.f6625f.mo1672o(mo1406e);
                if (!mo1672o.m1503f()) {
                    InterfaceC2594n m1115s = C2585g.m1115s();
                    Iterator it = C2541v.this.f6620a.m1564D(m1456e).m1553w().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        C2540u c2540u3 = (C2540u) ((C2457d) entry.getValue()).getValue();
                        if (c2540u3 != null && (m1278d = c2540u3.m1278d(C2506l.m1385w())) != null) {
                            m1115s = m1115s.mo1083p((C2570b) entry.getKey(), m1278d);
                        }
                    }
                    for (C2593m c2593m : mo1672o.m1507b()) {
                        if (!m1115s.mo1076o(c2593m.m1089c())) {
                            m1115s = m1115s.mo1083p(c2593m.m1089c(), c2593m.m1088d());
                        }
                    }
                    mo1672o = new C2475a(C2587i.m1107f(m1115s, mo1406e.m1458c()), false, false);
                }
            }
            boolean m1272j = c2540u2.m1272j(mo1406e);
            if (!m1272j && !mo1406e.m1454g()) {
                C2558w m1259L = C2541v.this.m1259L();
                C2541v.this.f6623d.put(mo1406e, m1259L);
                C2541v.this.f6622c.put(m1259L, mo1406e);
            }
            List<C2478d> m1281a = c2540u2.m1281a(this.f6632a, C2541v.this.f6621b.m1730h(m1456e), mo1672o);
            if (!m1272j && !z) {
                C2541v.this.m1252S(mo1406e, c2540u2.m1271k(mo1406e));
            }
            return m1281a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$c */
    /* loaded from: classes.dex */
    public class CallableC2544c implements Callable<List<InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ C2488i f6634a;

        /* renamed from: b */
        final /* synthetic */ AbstractC2503i f6635b;

        /* renamed from: c */
        final /* synthetic */ C2306b f6636c;

        CallableC2544c(C2488i c2488i, AbstractC2503i abstractC2503i, C2306b c2306b) {
            this.f6634a = c2488i;
            this.f6635b = abstractC2503i;
            this.f6636c = c2306b;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<InterfaceC2479e> call() {
            boolean z;
            C2506l m1456e = this.f6634a.m1456e();
            C2540u c2540u = (C2540u) C2541v.this.f6620a.m1555s(m1456e);
            List<InterfaceC2479e> arrayList = new ArrayList<>();
            if (c2540u != null && (this.f6634a.m1455f() || c2540u.m1272j(this.f6634a))) {
                C2463g<List<C2488i>, List<InterfaceC2479e>> m1273i = c2540u.m1273i(this.f6634a, this.f6635b, this.f6636c);
                if (c2540u.m1274h()) {
                    C2541v c2541v = C2541v.this;
                    c2541v.f6620a = c2541v.f6620a.m1550z(m1456e);
                }
                List<C2488i> m1542a = m1273i.m1542a();
                arrayList = m1273i.m1541b();
                loop0: while (true) {
                    for (C2488i c2488i : m1542a) {
                        C2541v.this.f6625f.mo1682e(this.f6634a);
                        z = z || c2488i.m1454g();
                    }
                }
                C2457d c2457d = C2541v.this.f6620a;
                boolean z2 = c2457d.getValue() != null && ((C2540u) c2457d.getValue()).m1275g();
                Iterator<C2570b> it = m1456e.iterator();
                while (it.hasNext()) {
                    c2457d = c2457d.m1554u(it.next());
                    z2 = z2 || (c2457d.getValue() != null && ((C2540u) c2457d.getValue()).m1275g());
                    if (z2) {
                        break;
                    } else if (c2457d.isEmpty()) {
                        break;
                    }
                }
                if (z && !z2) {
                    C2457d m1564D = C2541v.this.f6620a.m1564D(m1456e);
                    if (!m1564D.isEmpty()) {
                        for (C2489j c2489j : C2541v.this.m1261J(m1564D)) {
                            C2556o c2556o = new C2556o(c2489j);
                            C2541v.this.f6624e.mo1205a(C2541v.this.m1258M(c2489j.m1447g()), c2556o.f6677b, c2556o, c2556o);
                        }
                    }
                }
                if (!z2 && !m1542a.isEmpty() && this.f6636c == null) {
                    if (z) {
                        C2541v.this.f6624e.mo1204b(C2541v.this.m1258M(this.f6634a), null);
                    } else {
                        for (C2488i c2488i2 : m1542a) {
                            C2541v.this.f6624e.mo1204b(C2541v.this.m1258M(c2488i2), C2541v.this.m1251T(c2488i2));
                        }
                    }
                }
                C2541v.this.m1253R(m1542a);
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$d */
    /* loaded from: classes.dex */
    public class C2545d implements C2457d.InterfaceC2460c<C2540u, Void> {
        C2545d() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2457d.InterfaceC2460c
        /* renamed from: b */
        public Void mo1221a(C2506l c2506l, C2540u c2540u, Void r5) {
            if (!c2506l.isEmpty() && c2540u.m1275g()) {
                C2488i m1447g = c2540u.m1277e().m1447g();
                C2541v.this.f6624e.mo1204b(C2541v.this.m1258M(m1447g), C2541v.this.m1251T(m1447g));
                return null;
            }
            for (C2489j c2489j : c2540u.m1276f()) {
                C2488i m1447g2 = c2489j.m1447g();
                C2541v.this.f6624e.mo1204b(C2541v.this.m1258M(m1447g2), C2541v.this.m1251T(m1447g2));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$e */
    /* loaded from: classes.dex */
    public class C2546e extends InterfaceC2351h.AbstractC2353b<C2570b, C2457d<C2540u>> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2594n f6639a;

        /* renamed from: b */
        final /* synthetic */ C2418c0 f6640b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2425d f6641c;

        /* renamed from: d */
        final /* synthetic */ List f6642d;

        C2546e(InterfaceC2594n interfaceC2594n, C2418c0 c2418c0, AbstractC2425d abstractC2425d, List list) {
            this.f6639a = interfaceC2594n;
            this.f6640b = c2418c0;
            this.f6641c = abstractC2425d;
            this.f6642d = list;
        }

        @Override // com.google.firebase.database.p121n.InterfaceC2351h.AbstractC2353b
        /* renamed from: b */
        public void mo1147a(C2570b c2570b, C2457d<C2540u> c2457d) {
            InterfaceC2594n interfaceC2594n = this.f6639a;
            InterfaceC2594n mo1079b = interfaceC2594n != null ? interfaceC2594n.mo1079b(c2570b) : null;
            C2418c0 m1714h = this.f6640b.m1714h(c2570b);
            AbstractC2425d mo1695d = this.f6641c.mo1695d(c2570b);
            if (mo1695d != null) {
                this.f6642d.addAll(C2541v.this.m1229v(mo1695d, c2457d, mo1079b, m1714h));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$f */
    /* loaded from: classes.dex */
    public class CallableC2547f implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ boolean f6644a;

        /* renamed from: b */
        final /* synthetic */ C2506l f6645b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC2594n f6646c;

        /* renamed from: d */
        final /* synthetic */ long f6647d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC2594n f6648e;

        /* renamed from: f */
        final /* synthetic */ boolean f6649f;

        CallableC2547f(boolean z, C2506l c2506l, InterfaceC2594n interfaceC2594n, long j, InterfaceC2594n interfaceC2594n2, boolean z2) {
            this.f6644a = z;
            this.f6645b = c2506l;
            this.f6646c = interfaceC2594n;
            this.f6647d = j;
            this.f6648e = interfaceC2594n2;
            this.f6649f = z2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            if (this.f6644a) {
                C2541v.this.f6625f.mo1683d(this.f6645b, this.f6646c, this.f6647d);
            }
            C2541v.this.f6621b.m1736b(this.f6645b, this.f6648e, Long.valueOf(this.f6647d), this.f6649f);
            return !this.f6649f ? Collections.emptyList() : C2541v.this.m1227x(new C2429f(C2427e.f6376d, this.f6645b, this.f6648e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$g */
    /* loaded from: classes.dex */
    public class CallableC2548g implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ boolean f6651a;

        /* renamed from: b */
        final /* synthetic */ C2506l f6652b;

        /* renamed from: c */
        final /* synthetic */ C2411b f6653c;

        /* renamed from: d */
        final /* synthetic */ long f6654d;

        /* renamed from: e */
        final /* synthetic */ C2411b f6655e;

        CallableC2548g(boolean z, C2506l c2506l, C2411b c2411b, long j, C2411b c2411b2) {
            this.f6651a = z;
            this.f6652b = c2506l;
            this.f6653c = c2411b;
            this.f6654d = j;
            this.f6655e = c2411b2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            if (this.f6651a) {
                C2541v.this.f6625f.mo1685b(this.f6652b, this.f6653c, this.f6654d);
            }
            C2541v.this.f6621b.m1737a(this.f6652b, this.f6655e, Long.valueOf(this.f6654d));
            return C2541v.this.m1227x(new C2424c(C2427e.f6376d, this.f6652b, this.f6655e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$h */
    /* loaded from: classes.dex */
    public class CallableC2549h implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ boolean f6657a;

        /* renamed from: b */
        final /* synthetic */ long f6658b;

        /* renamed from: c */
        final /* synthetic */ boolean f6659c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC2451a f6660d;

        CallableC2549h(boolean z, long j, boolean z2, InterfaceC2451a interfaceC2451a) {
            this.f6657a = z;
            this.f6658b = j;
            this.f6659c = z2;
            this.f6660d = interfaceC2451a;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            if (this.f6657a) {
                C2541v.this.f6625f.mo1686a(this.f6658b);
            }
            C2561y m1729i = C2541v.this.f6621b.m1729i(this.f6658b);
            boolean m1726l = C2541v.this.f6621b.m1726l(this.f6658b);
            if (m1729i.m1194f() && !this.f6659c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(m1729i.m1196d()));
                InterfaceC2594n m1262I = C2541v.this.m1262I(m1729i.m1197c(), arrayList);
                Map<String, Object> m1294b = C2533r.m1294b(this.f6660d);
                if (m1729i.m1195e()) {
                    C2541v.this.f6625f.mo1676k(m1729i.m1197c(), C2533r.m1290f(m1729i.m1198b(), m1262I, m1294b));
                } else {
                    C2541v.this.f6625f.mo1674m(m1729i.m1197c(), C2533r.m1291e(m1729i.m1199a(), m1262I, m1294b));
                }
            }
            if (m1726l) {
                C2457d m1561e = C2457d.m1561e();
                if (m1729i.m1195e()) {
                    m1561e = m1561e.m1566B(C2506l.m1385w(), Boolean.TRUE);
                } else {
                    Iterator<Map.Entry<C2506l, InterfaceC2594n>> it = m1729i.m1199a().iterator();
                    while (it.hasNext()) {
                        m1561e = m1561e.m1566B(it.next().getKey(), Boolean.TRUE);
                    }
                }
                return C2541v.this.m1227x(new C2422a(m1729i.m1197c(), m1561e, this.f6659c));
            }
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$i */
    /* loaded from: classes.dex */
    public class CallableC2550i implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ C2506l f6662a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2594n f6663b;

        CallableC2550i(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
            this.f6662a = c2506l;
            this.f6663b = interfaceC2594n;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            C2541v.this.f6625f.mo1677j(C2488i.m1460a(this.f6662a), this.f6663b);
            return C2541v.this.m1227x(new C2429f(C2427e.f6377e, this.f6662a, this.f6663b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$j */
    /* loaded from: classes.dex */
    public class CallableC2551j implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ Map f6665a;

        /* renamed from: b */
        final /* synthetic */ C2506l f6666b;

        CallableC2551j(Map map, C2506l c2506l) {
            this.f6665a = map;
            this.f6666b = c2506l;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            C2411b m1744u = C2411b.m1744u(this.f6665a);
            C2541v.this.f6625f.mo1673n(this.f6666b, m1744u);
            return C2541v.this.m1227x(new C2424c(C2427e.f6377e, this.f6666b, m1744u));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$k */
    /* loaded from: classes.dex */
    public class CallableC2552k implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ C2506l f6668a;

        CallableC2552k(C2506l c2506l) {
            this.f6668a = c2506l;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            C2541v.this.f6625f.mo1681f(C2488i.m1460a(this.f6668a));
            return C2541v.this.m1227x(new C2423b(C2427e.f6377e, this.f6668a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$l */
    /* loaded from: classes.dex */
    public class CallableC2553l implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ C2558w f6670a;

        CallableC2553l(C2558w c2558w) {
            this.f6670a = c2558w;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            C2488i m1257N = C2541v.this.m1257N(this.f6670a);
            if (m1257N != null) {
                C2541v.this.f6625f.mo1681f(m1257N);
                return C2541v.this.m1268C(m1257N, new C2423b(C2427e.m1699a(m1257N.m1457d()), C2506l.m1385w()));
            }
            return Collections.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.v$m */
    /* loaded from: classes.dex */
    public class CallableC2554m implements Callable<List<? extends InterfaceC2479e>> {

        /* renamed from: a */
        final /* synthetic */ C2558w f6672a;

        /* renamed from: b */
        final /* synthetic */ C2506l f6673b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC2594n f6674c;

        CallableC2554m(C2558w c2558w, C2506l c2506l, InterfaceC2594n interfaceC2594n) {
            this.f6672a = c2558w;
            this.f6673b = c2506l;
            this.f6674c = interfaceC2594n;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<? extends InterfaceC2479e> call() {
            C2488i m1257N = C2541v.this.m1257N(this.f6672a);
            if (m1257N != null) {
                C2506l m1382z = C2506l.m1382z(m1257N.m1456e(), this.f6673b);
                C2541v.this.f6625f.mo1677j(m1382z.isEmpty() ? m1257N : C2488i.m1460a(this.f6673b), this.f6674c);
                return C2541v.this.m1268C(m1257N, new C2429f(C2427e.m1699a(m1257N.m1457d()), m1382z, this.f6674c));
            }
            return Collections.emptyList();
        }
    }

    /* renamed from: com.google.firebase.database.p.v$n */
    /* loaded from: classes.dex */
    public interface InterfaceC2555n {
        /* renamed from: a */
        List<? extends InterfaceC2479e> mo1210a(C2306b c2306b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.p.v$o */
    /* loaded from: classes.dex */
    public class C2556o implements InterfaceC2373g, InterfaceC2555n {

        /* renamed from: a */
        private final C2489j f6676a;

        /* renamed from: b */
        private final C2558w f6677b;

        public C2556o(C2489j c2489j) {
            this.f6676a = c2489j;
            this.f6677b = C2541v.this.m1251T(c2489j.m1447g());
        }

        @Override // com.google.firebase.database.p124p.C2541v.InterfaceC2555n
        /* renamed from: a */
        public List<? extends InterfaceC2479e> mo1210a(C2306b c2306b) {
            if (c2306b == null) {
                C2488i m1447g = this.f6676a.m1447g();
                C2558w c2558w = this.f6677b;
                return c2558w != null ? C2541v.this.m1269B(c2558w) : C2541v.this.m1230u(m1447g.m1456e());
            }
            C2566c c2566c = C2541v.this.f6626g;
            c2566c.m1171i("Listen at " + this.f6676a.m1447g().m1456e() + " failed: " + c2306b.toString());
            return C2541v.this.m1256O(this.f6676a.m1447g(), c2306b);
        }

        @Override // com.google.firebase.database.p122o.InterfaceC2373g
        /* renamed from: b */
        public C2363a mo1209b() {
            C2578d m1143b = C2578d.m1143b(this.f6676a.m1446h());
            List<C2506l> m1140e = m1143b.m1140e();
            ArrayList arrayList = new ArrayList(m1140e.size());
            for (C2506l c2506l : m1140e) {
                arrayList.add(c2506l.m1391g());
            }
            return new C2363a(arrayList, m1143b.m1141d());
        }

        @Override // com.google.firebase.database.p122o.InterfaceC2373g
        /* renamed from: c */
        public boolean mo1208c() {
            return C2461e.m1546b(this.f6676a.m1446h()) > 1024;
        }

        @Override // com.google.firebase.database.p122o.InterfaceC2373g
        /* renamed from: d */
        public String mo1207d() {
            return this.f6676a.m1446h().getHash();
        }
    }

    /* renamed from: com.google.firebase.database.p.v$p */
    /* loaded from: classes.dex */
    public interface InterfaceC2557p {
        /* renamed from: a */
        void mo1205a(C2488i c2488i, C2558w c2558w, InterfaceC2373g interfaceC2373g, InterfaceC2555n interfaceC2555n);

        /* renamed from: b */
        void mo1204b(C2488i c2488i, C2558w c2558w);
    }

    public C2541v(C2449g c2449g, InterfaceC2435e interfaceC2435e, InterfaceC2557p interfaceC2557p) {
        new HashSet();
        this.f6624e = interfaceC2557p;
        this.f6625f = interfaceC2435e;
        this.f6626g = c2449g.m1589n("SyncTree");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public List<? extends InterfaceC2479e> m1268C(C2488i c2488i, AbstractC2425d abstractC2425d) {
        C2506l m1456e = c2488i.m1456e();
        return this.f6620a.m1555s(m1456e).m1280b(abstractC2425d, this.f6621b.m1730h(m1456e), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public List<C2489j> m1261J(C2457d<C2540u> c2457d) {
        ArrayList arrayList = new ArrayList();
        m1260K(c2457d, arrayList);
        return arrayList;
    }

    /* renamed from: K */
    private void m1260K(C2457d<C2540u> c2457d, List<C2489j> list) {
        C2540u value = c2457d.getValue();
        if (value != null && value.m1275g()) {
            list.add(value.m1277e());
            return;
        }
        if (value != null) {
            list.addAll(value.m1276f());
        }
        Iterator<Map.Entry<C2570b, C2457d<C2540u>>> it = c2457d.m1553w().iterator();
        while (it.hasNext()) {
            m1260K(it.next().getValue(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public C2558w m1259L() {
        long j = this.f6627h;
        this.f6627h = 1 + j;
        return new C2558w(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public C2488i m1258M(C2488i c2488i) {
        return (!c2488i.m1454g() || c2488i.m1455f()) ? c2488i : C2488i.m1460a(c2488i.m1456e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public C2488i m1257N(C2558w c2558w) {
        return this.f6622c.get(c2558w);
    }

    /* renamed from: Q */
    private List<InterfaceC2479e> m1254Q(C2488i c2488i, AbstractC2503i abstractC2503i, C2306b c2306b) {
        return (List) this.f6625f.mo1678i(new CallableC2544c(c2488i, abstractC2503i, c2306b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m1253R(List<C2488i> list) {
        for (C2488i c2488i : list) {
            if (!c2488i.m1454g()) {
                C2558w m1251T = m1251T(c2488i);
                this.f6623d.remove(c2488i);
                this.f6622c.remove(m1251T);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m1252S(C2488i c2488i, C2489j c2489j) {
        C2506l m1456e = c2488i.m1456e();
        C2558w m1251T = m1251T(c2488i);
        C2556o c2556o = new C2556o(c2489j);
        this.f6624e.mo1205a(m1258M(c2488i), m1251T, c2556o, c2556o);
        C2457d<C2540u> m1564D = this.f6620a.m1564D(m1456e);
        if (m1251T != null) {
            return;
        }
        m1564D.m1556m(new C2545d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public C2558w m1251T(C2488i c2488i) {
        return this.f6623d.get(c2488i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public List<InterfaceC2479e> m1229v(AbstractC2425d abstractC2425d, C2457d<C2540u> c2457d, InterfaceC2594n interfaceC2594n, C2418c0 c2418c0) {
        C2540u value = c2457d.getValue();
        if (interfaceC2594n == null && value != null) {
            interfaceC2594n = value.m1278d(C2506l.m1385w());
        }
        ArrayList arrayList = new ArrayList();
        c2457d.m1553w().mo1942m(new C2546e(interfaceC2594n, c2418c0, abstractC2425d, arrayList));
        if (value != null) {
            arrayList.addAll(value.m1280b(abstractC2425d, c2418c0, interfaceC2594n));
        }
        return arrayList;
    }

    /* renamed from: w */
    private List<InterfaceC2479e> m1228w(AbstractC2425d abstractC2425d, C2457d<C2540u> c2457d, InterfaceC2594n interfaceC2594n, C2418c0 c2418c0) {
        if (abstractC2425d.m1702a().isEmpty()) {
            return m1229v(abstractC2425d, c2457d, interfaceC2594n, c2418c0);
        }
        C2540u value = c2457d.getValue();
        if (interfaceC2594n == null && value != null) {
            interfaceC2594n = value.m1278d(C2506l.m1385w());
        }
        ArrayList arrayList = new ArrayList();
        C2570b m1384x = abstractC2425d.m1702a().m1384x();
        AbstractC2425d mo1695d = abstractC2425d.mo1695d(m1384x);
        C2457d<C2540u> mo1947e = c2457d.m1553w().mo1947e(m1384x);
        if (mo1947e != null && mo1695d != null) {
            arrayList.addAll(m1228w(mo1695d, mo1947e, interfaceC2594n != null ? interfaceC2594n.mo1079b(m1384x) : null, c2418c0.m1714h(m1384x)));
        }
        if (value != null) {
            arrayList.addAll(value.m1280b(abstractC2425d, c2418c0, interfaceC2594n));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public List<InterfaceC2479e> m1227x(AbstractC2425d abstractC2425d) {
        return m1228w(abstractC2425d, this.f6620a, null, this.f6621b.m1730h(C2506l.m1385w()));
    }

    /* renamed from: A */
    public List<? extends InterfaceC2479e> m1270A(C2506l c2506l, List<C2601s> list) {
        C2489j m1277e;
        C2540u m1555s = this.f6620a.m1555s(c2506l);
        if (m1555s != null && (m1277e = m1555s.m1277e()) != null) {
            InterfaceC2594n m1446h = m1277e.m1446h();
            for (C2601s c2601s : list) {
                m1446h = c2601s.m1065a(m1446h);
            }
            return m1225z(c2506l, m1446h);
        }
        return Collections.emptyList();
    }

    /* renamed from: B */
    public List<? extends InterfaceC2479e> m1269B(C2558w c2558w) {
        return (List) this.f6625f.mo1678i(new CallableC2553l(c2558w));
    }

    /* renamed from: D */
    public List<? extends InterfaceC2479e> m1267D(C2506l c2506l, Map<C2506l, InterfaceC2594n> map, C2558w c2558w) {
        return (List) this.f6625f.mo1678i(new CallableC2542a(c2558w, c2506l, map));
    }

    /* renamed from: E */
    public List<? extends InterfaceC2479e> m1266E(C2506l c2506l, InterfaceC2594n interfaceC2594n, C2558w c2558w) {
        return (List) this.f6625f.mo1678i(new CallableC2554m(c2558w, c2506l, interfaceC2594n));
    }

    /* renamed from: F */
    public List<? extends InterfaceC2479e> m1265F(C2506l c2506l, List<C2601s> list, C2558w c2558w) {
        C2488i m1257N = m1257N(c2558w);
        if (m1257N != null) {
            InterfaceC2594n m1446h = this.f6620a.m1555s(m1257N.m1456e()).m1271k(m1257N).m1446h();
            for (C2601s c2601s : list) {
                m1446h = c2601s.m1065a(m1446h);
            }
            return m1266E(c2506l, m1446h, c2558w);
        }
        return Collections.emptyList();
    }

    /* renamed from: G */
    public List<? extends InterfaceC2479e> m1264G(C2506l c2506l, C2411b c2411b, C2411b c2411b2, long j, boolean z) {
        return (List) this.f6625f.mo1678i(new CallableC2548g(z, c2506l, c2411b, j, c2411b2));
    }

    /* renamed from: H */
    public List<? extends InterfaceC2479e> m1263H(C2506l c2506l, InterfaceC2594n interfaceC2594n, InterfaceC2594n interfaceC2594n2, long j, boolean z, boolean z2) {
        C2472l.m1519f(z || !z2, "We shouldn't be persisting non-visible writes.");
        return (List) this.f6625f.mo1678i(new CallableC2547f(z2, c2506l, interfaceC2594n, j, interfaceC2594n2, z));
    }

    /* renamed from: I */
    public InterfaceC2594n m1262I(C2506l c2506l, List<Long> list) {
        C2457d<C2540u> c2457d = this.f6620a;
        c2457d.getValue();
        C2506l m1385w = C2506l.m1385w();
        InterfaceC2594n interfaceC2594n = null;
        C2506l c2506l2 = c2506l;
        do {
            C2570b m1384x = c2506l2.m1384x();
            c2506l2 = c2506l2.m1396A();
            m1385w = m1385w.m1389l(m1384x);
            C2506l m1382z = C2506l.m1382z(m1385w, c2506l);
            c2457d = m1384x != null ? c2457d.m1554u(m1384x) : C2457d.m1561e();
            C2540u value = c2457d.getValue();
            if (value != null) {
                interfaceC2594n = value.m1278d(m1382z);
            }
            if (c2506l2.isEmpty()) {
                break;
            }
        } while (interfaceC2594n == null);
        return this.f6621b.m1734d(c2506l, interfaceC2594n, list, true);
    }

    /* renamed from: O */
    public List<InterfaceC2479e> m1256O(C2488i c2488i, C2306b c2306b) {
        return m1254Q(c2488i, null, c2306b);
    }

    /* renamed from: P */
    public List<InterfaceC2479e> m1255P(AbstractC2503i abstractC2503i) {
        return m1254Q(abstractC2503i.mo1406e(), abstractC2503i, null);
    }

    /* renamed from: s */
    public List<? extends InterfaceC2479e> m1232s(long j, boolean z, boolean z2, InterfaceC2451a interfaceC2451a) {
        return (List) this.f6625f.mo1678i(new CallableC2549h(z2, j, z, interfaceC2451a));
    }

    /* renamed from: t */
    public List<? extends InterfaceC2479e> m1231t(AbstractC2503i abstractC2503i) {
        return (List) this.f6625f.mo1678i(new CallableC2543b(abstractC2503i));
    }

    /* renamed from: u */
    public List<? extends InterfaceC2479e> m1230u(C2506l c2506l) {
        return (List) this.f6625f.mo1678i(new CallableC2552k(c2506l));
    }

    /* renamed from: y */
    public List<? extends InterfaceC2479e> m1226y(C2506l c2506l, Map<C2506l, InterfaceC2594n> map) {
        return (List) this.f6625f.mo1678i(new CallableC2551j(map, c2506l));
    }

    /* renamed from: z */
    public List<? extends InterfaceC2479e> m1225z(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        return (List) this.f6625f.mo1678i(new CallableC2550i(c2506l, interfaceC2594n));
    }
}
