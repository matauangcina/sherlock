package com.google.firebase.database.p124p;

import com.google.firebase.database.C2305a;
import com.google.firebase.database.C2306b;
import com.google.firebase.database.C2307c;
import com.google.firebase.database.C2310f;
import com.google.firebase.database.C2312h;
import com.google.firebase.database.C2318k;
import com.google.firebase.database.InterfaceC2322l;
import com.google.firebase.database.p122o.C2372f;
import com.google.firebase.database.p122o.C2391j;
import com.google.firebase.database.p122o.InterfaceC2373g;
import com.google.firebase.database.p122o.InterfaceC2374h;
import com.google.firebase.database.p122o.InterfaceC2392k;
import com.google.firebase.database.p124p.C2536t;
import com.google.firebase.database.p124p.C2541v;
import com.google.firebase.database.p124p.InterfaceC2407a;
import com.google.firebase.database.p124p.p126f0.C2434d;
import com.google.firebase.database.p124p.p126f0.InterfaceC2435e;
import com.google.firebase.database.p124p.p127g0.AbstractC2453c;
import com.google.firebase.database.p124p.p127g0.C2452b;
import com.google.firebase.database.p124p.p127g0.C2462f;
import com.google.firebase.database.p124p.p127g0.C2467j;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p124p.p128h0.C2483g;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.C2597o;
import com.google.firebase.database.p131r.C2601s;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.n */
/* loaded from: classes.dex */
public class C2509n implements InterfaceC2374h.InterfaceC2375a {

    /* renamed from: a */
    private final C2530o f6535a;

    /* renamed from: c */
    private InterfaceC2374h f6537c;

    /* renamed from: d */
    private C2535s f6538d;

    /* renamed from: e */
    private C2536t f6539e;

    /* renamed from: f */
    private C2467j<List<C2528p>> f6540f;

    /* renamed from: h */
    private final C2483g f6542h;

    /* renamed from: i */
    private final C2449g f6543i;

    /* renamed from: j */
    private final C2566c f6544j;

    /* renamed from: k */
    private final C2566c f6545k;

    /* renamed from: l */
    private final C2566c f6546l;

    /* renamed from: o */
    private C2541v f6549o;

    /* renamed from: p */
    private C2541v f6550p;

    /* renamed from: b */
    private final C2462f f6536b = new C2462f(new C2452b(), 0);

    /* renamed from: g */
    private boolean f6541g = false;

    /* renamed from: m */
    public long f6547m = 0;

    /* renamed from: n */
    private long f6548n = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$a */
    /* loaded from: classes.dex */
    public class C2510a implements C2536t.InterfaceC2539c {

        /* renamed from: a */
        final /* synthetic */ Map f6551a;

        /* renamed from: b */
        final /* synthetic */ List f6552b;

        C2510a(Map map, List list) {
            this.f6551a = map;
            this.f6552b = list;
        }

        @Override // com.google.firebase.database.p124p.C2536t.InterfaceC2539c
        /* renamed from: a */
        public void mo1282a(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
            this.f6552b.addAll(C2509n.this.f6550p.m1225z(c2506l, C2533r.m1290f(interfaceC2594n, C2509n.this.f6550p.m1262I(c2506l, new ArrayList()), this.f6551a)));
            C2509n.this.m1357Q(C2509n.this.m1342g(c2506l, -9));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$b */
    /* loaded from: classes.dex */
    public class C2511b implements C2467j.InterfaceC2470c<List<C2528p>> {
        C2511b() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2467j.InterfaceC2470c
        /* renamed from: a */
        public void mo1321a(C2467j<List<C2528p>> c2467j) {
            C2509n.this.m1352V(c2467j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$c */
    /* loaded from: classes.dex */
    public class C2512c implements InterfaceC2392k {

        /* renamed from: a */
        final /* synthetic */ C2506l f6555a;

        /* renamed from: b */
        final /* synthetic */ List f6556b;

        /* renamed from: c */
        final /* synthetic */ C2509n f6557c;

        /* renamed from: com.google.firebase.database.p.n$c$a */
        /* loaded from: classes.dex */
        class RunnableC2513a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C2528p f6559f;

            /* renamed from: g */
            final /* synthetic */ C2305a f6560g;

            RunnableC2513a(C2512c c2512c, C2528p c2528p, C2305a c2305a) {
                this.f6559f = c2528p;
                this.f6560g = c2305a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6559f.f6587g.m2043a(null, true, this.f6560g);
            }
        }

        C2512c(C2506l c2506l, List list, C2509n c2509n) {
            this.f6555a = c2506l;
            this.f6556b = list;
            this.f6557c = c2509n;
        }

        @Override // com.google.firebase.database.p122o.InterfaceC2392k
        /* renamed from: a */
        public void mo1319a(String str, String str2) {
            C2306b m1367G = C2509n.m1367G(str, str2);
            C2509n.this.m1349Y("Transaction", this.f6555a, m1367G);
            ArrayList arrayList = new ArrayList();
            if (m1367G != null) {
                if (m1367G.m2068f() == -1) {
                    for (C2528p c2528p : this.f6556b) {
                        c2528p.f6589i = c2528p.f6589i == EnumC2529q.SENT_NEEDS_ABORT ? EnumC2529q.NEEDS_ABORT : EnumC2529q.RUN;
                    }
                } else {
                    for (C2528p c2528p2 : this.f6556b) {
                        c2528p2.f6589i = EnumC2529q.NEEDS_ABORT;
                        c2528p2.f6593m = m1367G;
                    }
                }
                C2509n.this.m1357Q(this.f6555a);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C2528p c2528p3 : this.f6556b) {
                c2528p3.f6589i = EnumC2529q.COMPLETED;
                arrayList.addAll(C2509n.this.f6550p.m1232s(c2528p3.f6594n, false, false, C2509n.this.f6536b));
                arrayList2.add(new RunnableC2513a(this, c2528p3, C2312h.m2056a(C2312h.m2054c(this.f6557c, c2528p3.f6586f), C2587i.m1108e(c2528p3.f6597q))));
                C2509n.this.m1359O(new C2410a0(C2509n.this, c2528p3.f6588h, C2488i.m1460a(c2528p3.f6586f)));
            }
            C2509n c2509n = C2509n.this;
            c2509n.m1360N(c2509n.f6540f.m1529k(this.f6555a));
            C2509n.this.m1353U();
            this.f6557c.m1361M(arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                C2509n.this.m1362L((Runnable) arrayList2.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$d */
    /* loaded from: classes.dex */
    public class C2514d implements C2467j.InterfaceC2470c<List<C2528p>> {
        C2514d() {
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2467j.InterfaceC2470c
        /* renamed from: a */
        public void mo1321a(C2467j<List<C2528p>> c2467j) {
            C2509n.this.m1360N(c2467j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$e */
    /* loaded from: classes.dex */
    public class RunnableC2515e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2528p f6562f;

        RunnableC2515e(C2528p c2528p) {
            this.f6562f = c2528p;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2509n.this.m1359O(new C2410a0(C2509n.this, this.f6562f.f6588h, C2488i.m1460a(this.f6562f.f6586f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$f */
    /* loaded from: classes.dex */
    public class RunnableC2516f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2528p f6564f;

        /* renamed from: g */
        final /* synthetic */ C2306b f6565g;

        /* renamed from: h */
        final /* synthetic */ C2305a f6566h;

        RunnableC2516f(C2509n c2509n, C2528p c2528p, C2306b c2306b, C2305a c2305a) {
            this.f6564f = c2528p;
            this.f6565g = c2306b;
            this.f6566h = c2305a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6564f.f6587g.m2043a(this.f6565g, false, this.f6566h);
        }
    }

    /* renamed from: com.google.firebase.database.p.n$g */
    /* loaded from: classes.dex */
    class RunnableC2517g implements Runnable {
        RunnableC2517g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2509n.this.m1368F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$h */
    /* loaded from: classes.dex */
    public class C2518h implements C2467j.InterfaceC2470c<List<C2528p>> {

        /* renamed from: a */
        final /* synthetic */ List f6568a;

        C2518h(List list) {
            this.f6568a = list;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2467j.InterfaceC2470c
        /* renamed from: a */
        public void mo1321a(C2467j<List<C2528p>> c2467j) {
            C2509n.this.m1370D(this.f6568a, c2467j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$i */
    /* loaded from: classes.dex */
    public class C2519i implements C2467j.InterfaceC2469b<List<C2528p>> {

        /* renamed from: a */
        final /* synthetic */ int f6570a;

        C2519i(int i) {
            this.f6570a = i;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2467j.InterfaceC2469b
        /* renamed from: a */
        public boolean mo1322a(C2467j<List<C2528p>> c2467j) {
            C2509n.this.m1341h(c2467j, this.f6570a);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$j */
    /* loaded from: classes.dex */
    public class C2520j implements C2467j.InterfaceC2470c<List<C2528p>> {

        /* renamed from: a */
        final /* synthetic */ int f6572a;

        C2520j(int i) {
            this.f6572a = i;
        }

        @Override // com.google.firebase.database.p124p.p127g0.C2467j.InterfaceC2470c
        /* renamed from: a */
        public void mo1321a(C2467j<List<C2528p>> c2467j) {
            C2509n.this.m1341h(c2467j, this.f6572a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$k */
    /* loaded from: classes.dex */
    public class RunnableC2521k implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2528p f6574f;

        /* renamed from: g */
        final /* synthetic */ C2306b f6575g;

        RunnableC2521k(C2509n c2509n, C2528p c2528p, C2306b c2306b) {
            this.f6574f = c2528p;
            this.f6575g = c2306b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6574f.f6587g.m2043a(this.f6575g, false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$l */
    /* loaded from: classes.dex */
    public class C2522l implements InterfaceC2407a.InterfaceC2409b {
        C2522l() {
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2407a.InterfaceC2409b
        /* renamed from: a */
        public void mo1320a(String str) {
            C2509n.this.f6544j.m1178b("Auth token changed, triggering auth token refresh", new Object[0]);
            C2509n.this.f6537c.mo1863e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$m */
    /* loaded from: classes.dex */
    public class C2523m implements C2541v.InterfaceC2557p {

        /* renamed from: com.google.firebase.database.p.n$m$a */
        /* loaded from: classes.dex */
        class RunnableC2524a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C2488i f6578f;

            /* renamed from: g */
            final /* synthetic */ C2541v.InterfaceC2555n f6579g;

            RunnableC2524a(C2488i c2488i, C2541v.InterfaceC2555n interfaceC2555n) {
                this.f6578f = c2488i;
                this.f6579g = interfaceC2555n;
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC2594n m1288a = C2509n.this.f6538d.m1288a(this.f6578f.m1456e());
                if (m1288a.isEmpty()) {
                    return;
                }
                C2509n.this.m1361M(C2509n.this.f6549o.m1225z(this.f6578f.m1456e(), m1288a));
                this.f6579g.mo1210a(null);
            }
        }

        C2523m() {
        }

        @Override // com.google.firebase.database.p124p.C2541v.InterfaceC2557p
        /* renamed from: a */
        public void mo1205a(C2488i c2488i, C2558w c2558w, InterfaceC2373g interfaceC2373g, C2541v.InterfaceC2555n interfaceC2555n) {
            C2509n.this.m1354T(new RunnableC2524a(c2488i, interfaceC2555n));
        }

        @Override // com.google.firebase.database.p124p.C2541v.InterfaceC2557p
        /* renamed from: b */
        public void mo1204b(C2488i c2488i, C2558w c2558w) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$n */
    /* loaded from: classes.dex */
    public class C2525n implements C2541v.InterfaceC2557p {

        /* renamed from: com.google.firebase.database.p.n$n$a */
        /* loaded from: classes.dex */
        class C2526a implements InterfaceC2392k {

            /* renamed from: a */
            final /* synthetic */ C2541v.InterfaceC2555n f6582a;

            C2526a(C2541v.InterfaceC2555n interfaceC2555n) {
                this.f6582a = interfaceC2555n;
            }

            @Override // com.google.firebase.database.p122o.InterfaceC2392k
            /* renamed from: a */
            public void mo1319a(String str, String str2) {
                C2509n.this.m1361M(this.f6582a.mo1210a(C2509n.m1367G(str, str2)));
            }
        }

        C2525n() {
        }

        @Override // com.google.firebase.database.p124p.C2541v.InterfaceC2557p
        /* renamed from: a */
        public void mo1205a(C2488i c2488i, C2558w c2558w, InterfaceC2373g interfaceC2373g, C2541v.InterfaceC2555n interfaceC2555n) {
            C2509n.this.f6537c.mo1861f(c2488i.m1456e().m1391g(), c2488i.m1457d().m1469i(), interfaceC2373g, c2558w != null ? Long.valueOf(c2558w.m1203a()) : null, new C2526a(interfaceC2555n));
        }

        @Override // com.google.firebase.database.p124p.C2541v.InterfaceC2557p
        /* renamed from: b */
        public void mo1204b(C2488i c2488i, C2558w c2558w) {
            C2509n.this.f6537c.mo1853j(c2488i.m1456e().m1391g(), c2488i.m1457d().m1469i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.n$o */
    /* loaded from: classes.dex */
    public class C2527o implements InterfaceC2392k {

        /* renamed from: a */
        final /* synthetic */ C2561y f6584a;

        C2527o(C2561y c2561y) {
            this.f6584a = c2561y;
        }

        @Override // com.google.firebase.database.p122o.InterfaceC2392k
        /* renamed from: a */
        public void mo1319a(String str, String str2) {
            C2306b m1367G = C2509n.m1367G(str, str2);
            C2509n.this.m1349Y("Persisted write", this.f6584a.m1197c(), m1367G);
            C2509n.this.m1372B(this.f6584a.m1196d(), this.f6584a.m1197c(), m1367G);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.p.n$p */
    /* loaded from: classes.dex */
    public static class C2528p implements Comparable<C2528p> {

        /* renamed from: f */
        private C2506l f6586f;

        /* renamed from: g */
        private C2318k.InterfaceC2320b f6587g;

        /* renamed from: h */
        private InterfaceC2322l f6588h;

        /* renamed from: i */
        private EnumC2529q f6589i;

        /* renamed from: j */
        private long f6590j;

        /* renamed from: k */
        private boolean f6591k;

        /* renamed from: l */
        private int f6592l;

        /* renamed from: m */
        private C2306b f6593m;

        /* renamed from: n */
        private long f6594n;

        /* renamed from: o */
        private InterfaceC2594n f6595o;

        /* renamed from: p */
        private InterfaceC2594n f6596p;

        /* renamed from: q */
        private InterfaceC2594n f6597q;

        /* renamed from: y */
        static /* synthetic */ int m1301y(C2528p c2528p) {
            int i = c2528p.f6592l;
            c2528p.f6592l = i + 1;
            return i;
        }

        @Override // java.lang.Comparable
        /* renamed from: F */
        public int compareTo(C2528p c2528p) {
            long j = this.f6590j;
            long j2 = c2528p.f6590j;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.p.n$q */
    /* loaded from: classes.dex */
    public enum EnumC2529q {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2509n(C2530o c2530o, C2449g c2449g, C2310f c2310f) {
        this.f6535a = c2530o;
        this.f6543i = c2449g;
        this.f6544j = c2449g.m1589n("RepoOperation");
        this.f6545k = this.f6543i.m1589n("Transaction");
        this.f6546l = this.f6543i.m1589n("DataOperation");
        this.f6542h = new C2483g(this.f6543i);
        m1354T(new RunnableC2517g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m1372B(long j, C2506l c2506l, C2306b c2306b) {
        if (c2306b == null || c2306b.m2068f() != -25) {
            List<? extends InterfaceC2479e> m1232s = this.f6550p.m1232s(j, !(c2306b == null), true, this.f6536b);
            if (m1232s.size() > 0) {
                m1357Q(c2506l);
            }
            m1361M(m1232s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m1370D(List<C2528p> list, C2467j<List<C2528p>> c2467j) {
        List<C2528p> m1533g = c2467j.m1533g();
        if (m1533g != null) {
            list.addAll(m1533g);
        }
        c2467j.m1537c(new C2518h(list));
    }

    /* renamed from: E */
    private List<C2528p> m1369E(C2467j<List<C2528p>> c2467j) {
        ArrayList arrayList = new ArrayList();
        m1370D(arrayList, c2467j);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m1368F() {
        C2530o c2530o = this.f6535a;
        this.f6537c = this.f6543i.m1606B(new C2372f(c2530o.f6605a, c2530o.f6607c, c2530o.f6606b), this);
        this.f6543i.m1593j().mo1756b(((AbstractC2453c) this.f6543i.m1584s()).m1572c(), new C2522l());
        this.f6537c.mo1871a();
        InterfaceC2435e m1586q = this.f6543i.m1586q(this.f6535a.f6605a);
        this.f6538d = new C2535s();
        this.f6539e = new C2536t();
        this.f6540f = new C2467j<>();
        this.f6549o = new C2541v(this.f6543i, new C2434d(), new C2523m());
        this.f6550p = new C2541v(this.f6543i, m1586q, new C2525n());
        m1356R(m1586q);
        m1350X(C2417c.f6355c, Boolean.FALSE);
        m1350X(C2417c.f6356d, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static C2306b m1367G(String str, String str2) {
        if (str != null) {
            return C2306b.m2070d(str, str2);
        }
        return null;
    }

    /* renamed from: H */
    private C2467j<List<C2528p>> m1366H(C2506l c2506l) {
        C2467j<List<C2528p>> c2467j = this.f6540f;
        while (!c2506l.isEmpty() && c2467j.m1533g() == null) {
            c2467j = c2467j.m1529k(new C2506l(c2506l.m1384x()));
            c2506l = c2506l.m1396A();
        }
        return c2467j;
    }

    /* renamed from: I */
    private InterfaceC2594n m1365I(C2506l c2506l, List<Long> list) {
        InterfaceC2594n m1262I = this.f6550p.m1262I(c2506l, list);
        return m1262I == null ? C2585g.m1115s() : m1262I;
    }

    /* renamed from: J */
    private long m1364J() {
        long j = this.f6548n;
        this.f6548n = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m1361M(List<? extends InterfaceC2479e> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f6542h.m1478b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m1360N(C2467j<List<C2528p>> c2467j) {
        List<C2528p> m1533g = c2467j.m1533g();
        if (m1533g != null) {
            int i = 0;
            while (i < m1533g.size()) {
                if (m1533g.get(i).f6589i == EnumC2529q.COMPLETED) {
                    m1533g.remove(i);
                } else {
                    i++;
                }
            }
            if (m1533g.size() <= 0) {
                m1533g = null;
            }
            c2467j.m1530j(m1533g);
        }
        c2467j.m1537c(new C2514d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r10.m2068f() != (-25)) goto L25;
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1358P(java.util.List<com.google.firebase.database.p124p.C2509n.C2528p> r23, com.google.firebase.database.p124p.C2506l r24) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.p124p.C2509n.m1358P(java.util.List, com.google.firebase.database.p.l):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public C2506l m1357Q(C2506l c2506l) {
        C2467j<List<C2528p>> m1366H = m1366H(c2506l);
        C2506l m1534f = m1366H.m1534f();
        m1358P(m1369E(m1366H), m1534f);
        return m1534f;
    }

    /* renamed from: R */
    private void m1356R(InterfaceC2435e interfaceC2435e) {
        List<C2561y> mo1684c = interfaceC2435e.mo1684c();
        Map<String, Object> m1294b = C2533r.m1294b(this.f6536b);
        long j = Long.MIN_VALUE;
        for (C2561y c2561y : mo1684c) {
            C2527o c2527o = new C2527o(c2561y);
            if (j >= c2561y.m1196d()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            j = c2561y.m1196d();
            this.f6548n = c2561y.m1196d() + 1;
            InterfaceC2594n m1262I = this.f6550p.m1262I(c2561y.m1197c(), new ArrayList());
            if (c2561y.m1195e()) {
                if (this.f6544j.m1174f()) {
                    C2566c c2566c = this.f6544j;
                    c2566c.m1178b("Restoring overwrite with id " + c2561y.m1196d(), new Object[0]);
                }
                this.f6537c.mo1869b(c2561y.m1197c().m1391g(), c2561y.m1198b().mo1081r(true), c2527o);
                this.f6550p.m1263H(c2561y.m1197c(), c2561y.m1198b(), C2533r.m1290f(c2561y.m1198b(), m1262I, m1294b), c2561y.m1196d(), true, false);
            } else {
                if (this.f6544j.m1174f()) {
                    C2566c c2566c2 = this.f6544j;
                    c2566c2.m1178b("Restoring merge with id " + c2561y.m1196d(), new Object[0]);
                }
                this.f6537c.mo1857h(c2561y.m1197c().m1391g(), c2561y.m1199a().m1740z(true), c2527o);
                this.f6550p.m1264G(c2561y.m1197c(), c2561y.m1199a(), C2533r.m1291e(c2561y.m1199a(), m1262I, m1294b), c2561y.m1196d(), false);
            }
        }
    }

    /* renamed from: S */
    private void m1355S() {
        Map<String, Object> m1294b = C2533r.m1294b(this.f6536b);
        ArrayList arrayList = new ArrayList();
        this.f6539e.m1284b(C2506l.m1385w(), new C2510a(m1294b, arrayList));
        this.f6539e = new C2536t();
        m1361M(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m1353U() {
        C2467j<List<C2528p>> c2467j = this.f6540f;
        m1360N(c2467j);
        m1352V(c2467j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m1352V(C2467j<List<C2528p>> c2467j) {
        if (c2467j.m1533g() == null) {
            if (c2467j.m1532h()) {
                c2467j.m1537c(new C2511b());
                return;
            }
            return;
        }
        List<C2528p> m1369E = m1369E(c2467j);
        Boolean bool = Boolean.TRUE;
        Iterator<C2528p> it = m1369E.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f6589i != EnumC2529q.RUN) {
                bool = Boolean.FALSE;
                break;
            }
        }
        if (bool.booleanValue()) {
            m1351W(m1369E, c2467j.m1534f());
        }
    }

    /* renamed from: W */
    private void m1351W(List<C2528p> list, C2506l c2506l) {
        ArrayList arrayList = new ArrayList();
        for (C2528p c2528p : list) {
            arrayList.add(Long.valueOf(c2528p.f6594n));
        }
        InterfaceC2594n m1365I = m1365I(c2506l, arrayList);
        String hash = !this.f6541g ? m1365I.getHash() : "badhash";
        for (C2528p c2528p2 : list) {
            c2528p2.f6589i = EnumC2529q.SENT;
            C2528p.m1301y(c2528p2);
            m1365I = m1365I.mo1082q(C2506l.m1382z(c2506l, c2528p2.f6586f), c2528p2.f6596p);
        }
        this.f6537c.mo1865d(c2506l.m1391g(), m1365I.mo1081r(true), hash, new C2512c(c2506l, list, this));
    }

    /* renamed from: X */
    private void m1350X(C2570b c2570b, Object obj) {
        if (c2570b.equals(C2417c.f6354b)) {
            this.f6536b.m1543b(((Long) obj).longValue());
        }
        C2506l c2506l = new C2506l(C2417c.f6353a, c2570b);
        try {
            InterfaceC2594n m1075a = C2597o.m1075a(obj);
            this.f6538d.m1286c(c2506l, m1075a);
            m1361M(this.f6549o.m1225z(c2506l, m1075a));
        } catch (C2307c e) {
            this.f6544j.m1177c("Failed to parse info update", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m1349Y(String str, C2506l c2506l, C2306b c2306b) {
        if (c2306b == null || c2306b.m2068f() == -1 || c2306b.m2068f() == -25) {
            return;
        }
        C2566c c2566c = this.f6544j;
        c2566c.m1171i(str + " at " + c2506l.toString() + " failed: " + c2306b.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public C2506l m1342g(C2506l c2506l, int i) {
        C2506l m1534f = m1366H(c2506l).m1534f();
        if (this.f6545k.m1174f()) {
            C2566c c2566c = this.f6544j;
            c2566c.m1178b("Aborting transactions for path: " + c2506l + ". Affected: " + m1534f, new Object[0]);
        }
        C2467j<List<C2528p>> m1529k = this.f6540f.m1529k(c2506l);
        m1529k.m1539a(new C2519i(i));
        m1341h(m1529k, i);
        m1529k.m1536d(new C2520j(i));
        return m1534f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m1341h(C2467j<List<C2528p>> c2467j, int i) {
        C2306b m2073a;
        List<C2528p> m1533g = c2467j.m1533g();
        ArrayList arrayList = new ArrayList();
        if (m1533g != null) {
            ArrayList<Runnable> arrayList2 = new ArrayList();
            if (i == -9) {
                m2073a = C2306b.m2071c("overriddenBySet");
            } else {
                boolean z = i == -25;
                C2472l.m1519f(z, "Unknown transaction abort reason: " + i);
                m2073a = C2306b.m2073a(-25);
            }
            int i2 = -1;
            for (int i3 = 0; i3 < m1533g.size(); i3++) {
                C2528p c2528p = m1533g.get(i3);
                if (c2528p.f6589i != EnumC2529q.SENT_NEEDS_ABORT) {
                    if (c2528p.f6589i == EnumC2529q.SENT) {
                        c2528p.f6589i = EnumC2529q.SENT_NEEDS_ABORT;
                        c2528p.f6593m = m2073a;
                        i2 = i3;
                    } else {
                        m1359O(new C2410a0(this, c2528p.f6588h, C2488i.m1460a(c2528p.f6586f)));
                        if (i == -9) {
                            arrayList.addAll(this.f6550p.m1232s(c2528p.f6594n, true, false, this.f6536b));
                        } else {
                            boolean z2 = i == -25;
                            C2472l.m1519f(z2, "Unknown transaction abort reason: " + i);
                        }
                        arrayList2.add(new RunnableC2521k(this, c2528p, m2073a));
                    }
                }
            }
            c2467j.m1530j(i2 == -1 ? null : m1533g.subList(0, i2 + 1));
            m1361M(arrayList);
            for (Runnable runnable : arrayList2) {
                m1362L(runnable);
            }
        }
    }

    /* renamed from: C */
    public void m1371C(AbstractC2503i abstractC2503i) {
        C2570b m1384x = abstractC2503i.mo1406e().m1456e().m1384x();
        m1361M(((m1384x == null || !m1384x.equals(C2417c.f6353a)) ? this.f6550p : this.f6549o).m1231t(abstractC2503i));
    }

    /* renamed from: K */
    public void m1363K(C2570b c2570b, Object obj) {
        m1350X(c2570b, obj);
    }

    /* renamed from: L */
    public void m1362L(Runnable runnable) {
        this.f6543i.m1605C();
        this.f6543i.m1591l().mo1397b(runnable);
    }

    /* renamed from: O */
    public void m1359O(AbstractC2503i abstractC2503i) {
        m1361M((C2417c.f6353a.equals(abstractC2503i.mo1406e().m1456e().m1384x()) ? this.f6549o : this.f6550p).m1255P(abstractC2503i));
    }

    /* renamed from: T */
    public void m1354T(Runnable runnable) {
        this.f6543i.m1605C();
        this.f6543i.m1584s().mo1296b(runnable);
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h.InterfaceC2375a
    /* renamed from: a */
    public void mo1348a() {
        m1363K(C2417c.f6356d, Boolean.TRUE);
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h.InterfaceC2375a
    /* renamed from: b */
    public void mo1347b(boolean z) {
        m1363K(C2417c.f6355c, Boolean.valueOf(z));
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h.InterfaceC2375a
    /* renamed from: c */
    public void mo1346c(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m1350X(C2570b.m1162g(entry.getKey()), entry.getValue());
        }
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h.InterfaceC2375a
    /* renamed from: d */
    public void mo1345d(List<String> list, Object obj, boolean z, Long l) {
        List<? extends InterfaceC2479e> m1225z;
        C2506l c2506l = new C2506l(list);
        if (this.f6544j.m1174f()) {
            this.f6544j.m1178b("onDataUpdate: " + c2506l, new Object[0]);
        }
        if (this.f6546l.m1174f()) {
            this.f6544j.m1178b("onDataUpdate: " + c2506l + " " + obj, new Object[0]);
        }
        this.f6547m++;
        try {
            if (l != null) {
                C2558w c2558w = new C2558w(l.longValue());
                if (z) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new C2506l((String) entry.getKey()), C2597o.m1075a(entry.getValue()));
                    }
                    m1225z = this.f6550p.m1267D(c2506l, hashMap, c2558w);
                } else {
                    m1225z = this.f6550p.m1266E(c2506l, C2597o.m1075a(obj), c2558w);
                }
            } else if (z) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    hashMap2.put(new C2506l((String) entry2.getKey()), C2597o.m1075a(entry2.getValue()));
                }
                m1225z = this.f6550p.m1226y(c2506l, hashMap2);
            } else {
                m1225z = this.f6550p.m1225z(c2506l, C2597o.m1075a(obj));
            }
            if (m1225z.size() > 0) {
                m1357Q(c2506l);
            }
            m1361M(m1225z);
        } catch (C2307c e) {
            this.f6544j.m1177c("FIREBASE INTERNAL ERROR", e);
        }
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h.InterfaceC2375a
    /* renamed from: e */
    public void mo1344e() {
        m1363K(C2417c.f6356d, Boolean.FALSE);
        m1355S();
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h.InterfaceC2375a
    /* renamed from: f */
    public void mo1343f(List<String> list, List<C2391j> list2, Long l) {
        C2506l c2506l = new C2506l(list);
        if (this.f6544j.m1174f()) {
            this.f6544j.m1178b("onRangeMergeUpdate: " + c2506l, new Object[0]);
        }
        if (this.f6546l.m1174f()) {
            this.f6544j.m1178b("onRangeMergeUpdate: " + c2506l + " " + list2, new Object[0]);
        }
        this.f6547m++;
        ArrayList arrayList = new ArrayList(list2.size());
        for (C2391j c2391j : list2) {
            arrayList.add(new C2601s(c2391j));
        }
        C2541v c2541v = this.f6550p;
        List<? extends InterfaceC2479e> m1265F = l != null ? c2541v.m1265F(c2506l, arrayList, new C2558w(l.longValue())) : c2541v.m1270A(c2506l, arrayList);
        if (m1265F.size() > 0) {
            m1357Q(c2506l);
        }
        m1361M(m1265F);
    }

    public String toString() {
        return this.f6535a.toString();
    }
}
