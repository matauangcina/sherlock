package com.google.firebase.database.p122o;

import com.google.firebase.database.p122o.C2364b;
import com.google.firebase.database.p122o.InterfaceC2368c;
import com.google.firebase.database.p122o.InterfaceC2374h;
import com.google.firebase.database.p122o.p123m.C2403a;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p130q.InterfaceC2567d;
import com.google.firebase.database.p133t.C2624a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.firebase.database.o.i */
/* loaded from: classes.dex */
public class C2376i implements C2364b.InterfaceC2365a, InterfaceC2374h {

    /* renamed from: B */
    private static long f6224B;

    /* renamed from: A */
    private boolean f6225A;

    /* renamed from: a */
    private final InterfaceC2374h.InterfaceC2375a f6226a;

    /* renamed from: b */
    private final C2372f f6227b;

    /* renamed from: c */
    private String f6228c;

    /* renamed from: f */
    private long f6231f;

    /* renamed from: g */
    private C2364b f6232g;

    /* renamed from: o */
    private String f6240o;

    /* renamed from: p */
    private boolean f6241p;

    /* renamed from: q */
    private final C2370d f6242q;

    /* renamed from: r */
    private final InterfaceC2368c f6243r;

    /* renamed from: s */
    private final ScheduledExecutorService f6244s;

    /* renamed from: t */
    private final C2566c f6245t;

    /* renamed from: u */
    private final C2403a f6246u;

    /* renamed from: v */
    private String f6247v;

    /* renamed from: z */
    private long f6251z;

    /* renamed from: d */
    private HashSet<String> f6229d = new HashSet<>();

    /* renamed from: e */
    private boolean f6230e = true;

    /* renamed from: h */
    private EnumC2386i f6233h = EnumC2386i.Disconnected;

    /* renamed from: i */
    private long f6234i = 0;

    /* renamed from: j */
    private long f6235j = 0;

    /* renamed from: w */
    private long f6248w = 0;

    /* renamed from: x */
    private int f6249x = 0;

    /* renamed from: y */
    private ScheduledFuture<?> f6250y = null;

    /* renamed from: n */
    private Map<C2387j, C2389l> f6239n = new HashMap();

    /* renamed from: k */
    private Map<Long, InterfaceC2385h> f6236k = new HashMap();

    /* renamed from: m */
    private Map<Long, C2390m> f6238m = new HashMap();

    /* renamed from: l */
    private List<C2388k> f6237l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.i$a */
    /* loaded from: classes.dex */
    public class RunnableC2377a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f6252f;

        /* renamed from: com.google.firebase.database.o.i$a$a */
        /* loaded from: classes.dex */
        class C2378a implements InterfaceC2368c.InterfaceC2369a {

            /* renamed from: a */
            final /* synthetic */ long f6254a;

            C2378a(long j) {
                this.f6254a = j;
            }

            @Override // com.google.firebase.database.p122o.InterfaceC2368c.InterfaceC2369a
            /* renamed from: a */
            public void mo1825a(String str) {
                if (this.f6254a != C2376i.this.f6248w) {
                    C2376i.this.f6245t.m1178b("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
                } else if (C2376i.this.f6233h == EnumC2386i.GettingToken) {
                    C2376i.this.f6245t.m1178b("Successfully fetched token, opening connection", new Object[0]);
                    C2376i.this.m1872Z(str);
                } else {
                    C2371e.m1905b(C2376i.this.f6233h == EnumC2386i.Disconnected, "Expected connection state disconnected, but was %s", C2376i.this.f6233h);
                    C2376i.this.f6245t.m1178b("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                }
            }

            @Override // com.google.firebase.database.p122o.InterfaceC2368c.InterfaceC2369a
            /* renamed from: b */
            public void mo1824b(String str) {
                if (this.f6254a != C2376i.this.f6248w) {
                    C2376i.this.f6245t.m1178b("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
                    return;
                }
                C2376i.this.f6233h = EnumC2386i.Disconnected;
                C2566c c2566c = C2376i.this.f6245t;
                c2566c.m1178b("Error fetching token: " + str, new Object[0]);
                C2376i.this.m1836r0();
            }
        }

        RunnableC2377a(boolean z) {
            this.f6252f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2376i.this.f6245t.m1178b("Trying to fetch auth token", new Object[0]);
            C2371e.m1905b(C2376i.this.f6233h == EnumC2386i.Disconnected, "Not in disconnected state: %s", C2376i.this.f6233h);
            C2376i.this.f6233h = EnumC2386i.GettingToken;
            C2376i.m1889I(C2376i.this);
            C2376i.this.f6243r.mo1712a(this.f6252f, new C2378a(C2376i.this.f6248w));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.i$b */
    /* loaded from: classes.dex */
    public class C2379b implements InterfaceC2385h {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2392k f6256a;

        C2379b(C2376i c2376i, InterfaceC2392k interfaceC2392k) {
            this.f6256a = interfaceC2392k;
        }

        @Override // com.google.firebase.database.p122o.C2376i.InterfaceC2385h
        /* renamed from: a */
        public void mo1823a(Map<String, Object> map) {
            String str = (String) map.get("s");
            String str2 = null;
            if (str.equals("ok")) {
                str = null;
            } else {
                str2 = (String) map.get("d");
            }
            InterfaceC2392k interfaceC2392k = this.f6256a;
            if (interfaceC2392k != null) {
                interfaceC2392k.mo1319a(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.i$c */
    /* loaded from: classes.dex */
    public class C2380c implements InterfaceC2385h {

        /* renamed from: a */
        final /* synthetic */ boolean f6257a;

        C2380c(boolean z) {
            this.f6257a = z;
        }

        @Override // com.google.firebase.database.p122o.C2376i.InterfaceC2385h
        /* renamed from: a */
        public void mo1823a(Map<String, Object> map) {
            C2376i.this.f6233h = EnumC2386i.Connected;
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                C2376i.this.f6249x = 0;
                C2376i.this.f6226a.mo1347b(true);
                if (this.f6257a) {
                    C2376i.this.m1862e0();
                    return;
                }
                return;
            }
            C2376i.this.f6240o = null;
            C2376i.this.f6241p = true;
            C2376i.this.f6226a.mo1347b(false);
            C2566c c2566c = C2376i.this.f6245t;
            c2566c.m1178b("Authentication failed: " + str + " (" + ((String) map.get("d")) + ")", new Object[0]);
            C2376i.this.f6232g.m1924c();
            if (str.equals("invalid_token")) {
                C2376i.m1839q(C2376i.this);
                if (C2376i.this.f6249x >= 3) {
                    C2376i.this.f6246u.m1770d();
                    C2376i.this.f6245t.m1171i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.i$d */
    /* loaded from: classes.dex */
    public class C2381d implements InterfaceC2385h {

        /* renamed from: a */
        final /* synthetic */ String f6259a;

        /* renamed from: b */
        final /* synthetic */ long f6260b;

        /* renamed from: c */
        final /* synthetic */ C2390m f6261c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC2392k f6262d;

        C2381d(String str, long j, C2390m c2390m, InterfaceC2392k interfaceC2392k) {
            this.f6259a = str;
            this.f6260b = j;
            this.f6261c = c2390m;
            this.f6262d = interfaceC2392k;
        }

        @Override // com.google.firebase.database.p122o.C2376i.InterfaceC2385h
        /* renamed from: a */
        public void mo1823a(Map<String, Object> map) {
            if (C2376i.this.f6245t.m1174f()) {
                C2566c c2566c = C2376i.this.f6245t;
                c2566c.m1178b(this.f6259a + " response: " + map, new Object[0]);
            }
            if (((C2390m) C2376i.this.f6238m.get(Long.valueOf(this.f6260b))) == this.f6261c) {
                C2376i.this.f6238m.remove(Long.valueOf(this.f6260b));
                if (this.f6262d != null) {
                    String str = (String) map.get("s");
                    if (str.equals("ok")) {
                        this.f6262d.mo1319a(null, null);
                    } else {
                        this.f6262d.mo1319a(str, (String) map.get("d"));
                    }
                }
            } else if (C2376i.this.f6245t.m1174f()) {
                C2566c c2566c2 = C2376i.this.f6245t;
                c2566c2.m1178b("Ignoring on complete for put " + this.f6260b + " because it was removed already.", new Object[0]);
            }
            C2376i.this.m1883O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.i$e */
    /* loaded from: classes.dex */
    public class C2382e implements InterfaceC2385h {

        /* renamed from: a */
        final /* synthetic */ C2389l f6264a;

        C2382e(C2389l c2389l) {
            this.f6264a = c2389l;
        }

        @Override // com.google.firebase.database.p122o.C2376i.InterfaceC2385h
        /* renamed from: a */
        public void mo1823a(Map<String, Object> map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                Map map2 = (Map) map.get("d");
                if (map2.containsKey("w")) {
                    C2376i.this.m1832t0((List) map2.get("w"), this.f6264a.f6281b);
                }
            }
            if (((C2389l) C2376i.this.f6239n.get(this.f6264a.m1813d())) == this.f6264a) {
                if (str.equals("ok")) {
                    this.f6264a.f6280a.mo1319a(null, null);
                    return;
                }
                C2376i.this.m1868b0(this.f6264a.m1813d());
                this.f6264a.f6280a.mo1319a(str, (String) map.get("d"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.i$f */
    /* loaded from: classes.dex */
    public class C2383f implements InterfaceC2385h {
        C2383f() {
        }

        @Override // com.google.firebase.database.p122o.C2376i.InterfaceC2385h
        /* renamed from: a */
        public void mo1823a(Map<String, Object> map) {
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                return;
            }
            String str2 = (String) map.get("d");
            if (C2376i.this.f6245t.m1174f()) {
                C2566c c2566c = C2376i.this.f6245t;
                c2566c.m1178b("Failed to send stats: " + str + " (message: " + str2 + ")", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.i$g */
    /* loaded from: classes.dex */
    public class RunnableC2384g implements Runnable {
        RunnableC2384g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2376i.this.f6250y = null;
            if (C2376i.this.m1880R()) {
                C2376i.this.mo1855i("connection_idle");
            } else {
                C2376i.this.m1883O();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.i$h */
    /* loaded from: classes.dex */
    public interface InterfaceC2385h {
        /* renamed from: a */
        void mo1823a(Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.i$i */
    /* loaded from: classes.dex */
    public enum EnumC2386i {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.i$j */
    /* loaded from: classes.dex */
    public static class C2387j {

        /* renamed from: a */
        private final List<String> f6274a;

        /* renamed from: b */
        private final Map<String, Object> f6275b;

        public C2387j(List<String> list, Map<String, Object> map) {
            this.f6274a = list;
            this.f6275b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2387j) {
                C2387j c2387j = (C2387j) obj;
                if (this.f6274a.equals(c2387j.f6274a)) {
                    return this.f6275b.equals(c2387j.f6275b);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (this.f6274a.hashCode() * 31) + this.f6275b.hashCode();
        }

        public String toString() {
            return C2371e.m1903d(this.f6274a) + " (params: " + this.f6275b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.i$k */
    /* loaded from: classes.dex */
    public static class C2388k {

        /* renamed from: a */
        private final String f6276a;

        /* renamed from: b */
        private final List<String> f6277b;

        /* renamed from: c */
        private final Object f6278c;

        /* renamed from: d */
        private final InterfaceC2392k f6279d;

        /* renamed from: a */
        public String m1820a() {
            return this.f6276a;
        }

        /* renamed from: b */
        public Object m1819b() {
            return this.f6278c;
        }

        /* renamed from: c */
        public InterfaceC2392k m1818c() {
            return this.f6279d;
        }

        /* renamed from: d */
        public List<String> m1817d() {
            return this.f6277b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.i$l */
    /* loaded from: classes.dex */
    public static class C2389l {

        /* renamed from: a */
        private final InterfaceC2392k f6280a;

        /* renamed from: b */
        private final C2387j f6281b;

        /* renamed from: c */
        private final InterfaceC2373g f6282c;

        /* renamed from: d */
        private final Long f6283d;

        private C2389l(InterfaceC2392k interfaceC2392k, C2387j c2387j, Long l, InterfaceC2373g interfaceC2373g) {
            this.f6280a = interfaceC2392k;
            this.f6281b = c2387j;
            this.f6282c = interfaceC2373g;
            this.f6283d = l;
        }

        /* synthetic */ C2389l(InterfaceC2392k interfaceC2392k, C2387j c2387j, Long l, InterfaceC2373g interfaceC2373g, RunnableC2377a runnableC2377a) {
            this(interfaceC2392k, c2387j, l, interfaceC2373g);
        }

        /* renamed from: c */
        public InterfaceC2373g m1814c() {
            return this.f6282c;
        }

        /* renamed from: d */
        public C2387j m1813d() {
            return this.f6281b;
        }

        /* renamed from: e */
        public Long m1812e() {
            return this.f6283d;
        }

        public String toString() {
            return this.f6281b.toString() + " (Tag: " + this.f6283d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.i$m */
    /* loaded from: classes.dex */
    public static class C2390m {

        /* renamed from: a */
        private String f6284a;

        /* renamed from: b */
        private Map<String, Object> f6285b;

        /* renamed from: c */
        private InterfaceC2392k f6286c;

        /* renamed from: d */
        private boolean f6287d;

        private C2390m(String str, Map<String, Object> map, InterfaceC2392k interfaceC2392k) {
            this.f6284a = str;
            this.f6285b = map;
            this.f6286c = interfaceC2392k;
        }

        /* synthetic */ C2390m(String str, Map map, InterfaceC2392k interfaceC2392k, RunnableC2377a runnableC2377a) {
            this(str, map, interfaceC2392k);
        }

        /* renamed from: a */
        public String m1811a() {
            return this.f6284a;
        }

        /* renamed from: b */
        public InterfaceC2392k m1810b() {
            return this.f6286c;
        }

        /* renamed from: c */
        public Map<String, Object> m1809c() {
            return this.f6285b;
        }

        /* renamed from: d */
        public void m1808d() {
            this.f6287d = true;
        }

        /* renamed from: e */
        public boolean m1807e() {
            return this.f6287d;
        }
    }

    public C2376i(C2370d c2370d, C2372f c2372f, InterfaceC2374h.InterfaceC2375a interfaceC2375a) {
        this.f6226a = interfaceC2375a;
        this.f6242q = c2370d;
        this.f6244s = c2370d.m1911c();
        this.f6243r = c2370d.m1913a();
        this.f6227b = c2372f;
        C2403a.C2405b c2405b = new C2403a.C2405b(this.f6244s, c2370d.m1910d(), "ConnectionRetryHelper");
        c2405b.m1765d(1000L);
        c2405b.m1764e(1.3d);
        c2405b.m1766c(30000L);
        c2405b.m1767b(0.7d);
        this.f6246u = c2405b.m1768a();
        long j = f6224B;
        f6224B = 1 + j;
        InterfaceC2567d m1910d = c2370d.m1910d();
        this.f6245t = new C2566c(m1910d, "PersistentConnection", "pc_" + j);
        this.f6247v = null;
        m1883O();
    }

    /* renamed from: I */
    static /* synthetic */ long m1889I(C2376i c2376i) {
        long j = c2376i.f6248w;
        c2376i.f6248w = 1 + j;
        return j;
    }

    /* renamed from: L */
    private boolean m1886L() {
        return this.f6233h == EnumC2386i.Connected;
    }

    /* renamed from: M */
    private void m1885M() {
        ArrayList<C2390m> arrayList = new ArrayList();
        Iterator<Map.Entry<Long, C2390m>> it = this.f6238m.entrySet().iterator();
        while (it.hasNext()) {
            C2390m value = it.next().getValue();
            if (value.m1809c().containsKey("h") && value.m1807e()) {
                arrayList.add(value);
                it.remove();
            }
        }
        for (C2390m c2390m : arrayList) {
            c2390m.m1810b().mo1319a("disconnected", null);
        }
    }

    /* renamed from: N */
    private boolean m1884N() {
        EnumC2386i enumC2386i = this.f6233h;
        return enumC2386i == EnumC2386i.Authenticating || enumC2386i == EnumC2386i.Connected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public void m1883O() {
        if (m1879S()) {
            ScheduledFuture<?> scheduledFuture = this.f6250y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f6250y = this.f6244s.schedule(new RunnableC2384g(), 60000L, TimeUnit.MILLISECONDS);
        } else if (m1878T("connection_idle")) {
            C2371e.m1906a(!m1879S());
            mo1847m("connection_idle");
        }
    }

    /* renamed from: P */
    private Map<String, Object> m1882P(List<String> list, Object obj, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C2371e.m1903d(list));
        hashMap.put("d", obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    /* renamed from: Q */
    private void m1881Q(long j) {
        if (this.f6245t.m1174f()) {
            this.f6245t.m1178b("handling timestamp", new Object[0]);
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.f6226a.mo1346c(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public boolean m1880R() {
        return m1879S() && System.currentTimeMillis() > this.f6251z + 60000;
    }

    /* renamed from: S */
    private boolean m1879S() {
        return this.f6239n.isEmpty() && this.f6236k.isEmpty() && !this.f6225A && this.f6238m.isEmpty();
    }

    /* renamed from: U */
    private long m1877U() {
        long j = this.f6235j;
        this.f6235j = 1 + j;
        return j;
    }

    /* renamed from: V */
    private void m1876V(String str, String str2) {
        C2566c c2566c = this.f6245t;
        c2566c.m1178b("Auth token revoked: " + str + " (" + str2 + ")", new Object[0]);
        this.f6240o = null;
        this.f6241p = true;
        this.f6226a.mo1347b(false);
        this.f6232g.m1924c();
    }

    /* renamed from: W */
    private void m1875W(String str, Map<String, Object> map) {
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("handleServerMessage: " + str + " " + map, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            String str2 = (String) map.get("p");
            Object obj = map.get("d");
            Long m1904c = C2371e.m1904c(map.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.f6226a.mo1345d(C2371e.m1902e(str2), obj, equals, m1904c);
            } else if (this.f6245t.m1174f()) {
                C2566c c2566c2 = this.f6245t;
                c2566c2.m1178b("ignoring empty merge for path " + str2, new Object[0]);
            }
        } else if (str.equals("rm")) {
            String str3 = (String) map.get("p");
            List<String> m1902e = C2371e.m1902e(str3);
            Object obj2 = map.get("d");
            Long m1904c2 = C2371e.m1904c(map.get("t"));
            ArrayList arrayList = new ArrayList();
            for (Map map2 : (List) obj2) {
                String str4 = (String) map2.get("s");
                String str5 = (String) map2.get("e");
                List<String> list = null;
                List<String> m1902e2 = str4 != null ? C2371e.m1902e(str4) : null;
                if (str5 != null) {
                    list = C2371e.m1902e(str5);
                }
                arrayList.add(new C2391j(m1902e2, list, map2.get("m")));
            }
            if (!arrayList.isEmpty()) {
                this.f6226a.mo1343f(m1902e, arrayList, m1904c2);
            } else if (this.f6245t.m1174f()) {
                C2566c c2566c3 = this.f6245t;
                c2566c3.m1178b("Ignoring empty range merge for path " + str3, new Object[0]);
            }
        } else if (str.equals("c")) {
            m1874X(C2371e.m1902e((String) map.get("p")));
        } else if (str.equals("ac")) {
            m1876V((String) map.get("s"), (String) map.get("d"));
        } else if (str.equals("sd")) {
            m1873Y(map);
        } else if (this.f6245t.m1174f()) {
            C2566c c2566c4 = this.f6245t;
            c2566c4.m1178b("Unrecognized action from server: " + str, new Object[0]);
        }
    }

    /* renamed from: X */
    private void m1874X(List<String> list) {
        Collection<C2389l> m1866c0 = m1866c0(list);
        if (m1866c0 != null) {
            for (C2389l c2389l : m1866c0) {
                c2389l.f6280a.mo1319a("permission_denied", null);
            }
        }
    }

    /* renamed from: Y */
    private void m1873Y(Map<String, Object> map) {
        this.f6245t.m1175e((String) map.get("msg"));
    }

    /* renamed from: a0 */
    private void m1870a0(String str, List<String> list, Object obj, String str2, InterfaceC2392k interfaceC2392k) {
        Map<String, Object> m1882P = m1882P(list, obj, str2);
        long j = this.f6234i;
        this.f6234i = 1 + j;
        this.f6238m.put(Long.valueOf(j), new C2390m(str, m1882P, interfaceC2392k, null));
        if (m1886L()) {
            m1848l0(j);
        }
        this.f6251z = System.currentTimeMillis();
        m1883O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public C2389l m1868b0(C2387j c2387j) {
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("removing query " + c2387j, new Object[0]);
        }
        if (this.f6239n.containsKey(c2387j)) {
            C2389l c2389l = this.f6239n.get(c2387j);
            this.f6239n.remove(c2387j);
            m1883O();
            return c2389l;
        } else if (this.f6245t.m1174f()) {
            C2566c c2566c2 = this.f6245t;
            c2566c2.m1178b("Trying to remove listener for QuerySpec " + c2387j + " but no listener exists.", new Object[0]);
            return null;
        } else {
            return null;
        }
    }

    /* renamed from: c0 */
    private Collection<C2389l> m1866c0(List<String> list) {
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("removing all listens at path " + list, new Object[0]);
        }
        ArrayList<C2389l> arrayList = new ArrayList();
        for (Map.Entry<C2387j, C2389l> entry : this.f6239n.entrySet()) {
            C2389l value = entry.getValue();
            if (entry.getKey().f6274a.equals(list)) {
                arrayList.add(value);
            }
        }
        for (C2389l c2389l : arrayList) {
            this.f6239n.remove(c2389l.m1813d());
        }
        m1883O();
        return arrayList;
    }

    /* renamed from: d0 */
    private void m1864d0() {
        if (this.f6245t.m1174f()) {
            this.f6245t.m1178b("calling restore state", new Object[0]);
        }
        C2371e.m1905b(this.f6233h == EnumC2386i.Connecting, "Wanted to restore auth, but was in wrong state: %s", this.f6233h);
        if (this.f6240o == null) {
            if (this.f6245t.m1174f()) {
                this.f6245t.m1178b("Not restoring auth because token is null.", new Object[0]);
            }
            this.f6233h = EnumC2386i.Connected;
            m1862e0();
            return;
        }
        if (this.f6245t.m1174f()) {
            this.f6245t.m1178b("Restoring auth.", new Object[0]);
        }
        this.f6233h = EnumC2386i.Authenticating;
        m1858g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m1862e0() {
        C2371e.m1905b(this.f6233h == EnumC2386i.Connected, "Should be connected if we're restoring state, but we are: %s", this.f6233h);
        if (this.f6245t.m1174f()) {
            this.f6245t.m1178b("Restoring outstanding listens", new Object[0]);
        }
        for (C2389l c2389l : this.f6239n.values()) {
            if (this.f6245t.m1174f()) {
                C2566c c2566c = this.f6245t;
                c2566c.m1178b("Restoring listen " + c2389l.m1813d(), new Object[0]);
            }
            m1852j0(c2389l);
        }
        if (this.f6245t.m1174f()) {
            this.f6245t.m1178b("Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f6238m.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1848l0(((Long) it.next()).longValue());
        }
        for (C2388k c2388k : this.f6237l) {
            m1850k0(c2388k.m1820a(), c2388k.m1817d(), c2388k.m1819b(), c2388k.m1818c());
        }
        this.f6237l.clear();
    }

    /* renamed from: f0 */
    private void m1860f0(String str, Map<String, Object> map, InterfaceC2385h interfaceC2385h) {
        m1846m0(str, false, map, interfaceC2385h);
    }

    /* renamed from: g0 */
    private void m1858g0() {
        m1856h0(true);
    }

    /* renamed from: h0 */
    private void m1856h0(boolean z) {
        String str;
        C2371e.m1905b(m1884N(), "Must be connected to send auth, but was: %s", this.f6233h);
        C2371e.m1905b(this.f6240o != null, "Auth token must be set to authenticate!", new Object[0]);
        C2380c c2380c = new C2380c(z);
        HashMap hashMap = new HashMap();
        C2624a m995c = C2624a.m995c(this.f6240o);
        if (m995c != null) {
            hashMap.put("cred", m995c.m996b());
            if (m995c.m997a() != null) {
                hashMap.put("authvar", m995c.m997a());
            }
            str = "gauth";
        } else {
            hashMap.put("cred", this.f6240o);
            str = "auth";
        }
        m1846m0(str, true, hashMap, c2380c);
    }

    /* renamed from: i0 */
    private void m1854i0() {
        HashMap hashMap = new HashMap();
        if (this.f6242q.m1907g()) {
            hashMap.put("persistence.android.enabled", 1);
        }
        hashMap.put("sdk.android." + this.f6242q.m1912b().replace('.', '-'), 1);
        if (this.f6245t.m1174f()) {
            this.f6245t.m1178b("Sending first connection stats", new Object[0]);
        }
        m1844n0(hashMap);
    }

    /* renamed from: j0 */
    private void m1852j0(C2389l c2389l) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("p", C2371e.m1903d(c2389l.m1813d().f6274a));
        Object m1812e = c2389l.m1812e();
        if (m1812e != null) {
            hashMap.put("q", c2389l.f6281b.f6275b);
            hashMap.put("t", m1812e);
        }
        InterfaceC2373g m1814c = c2389l.m1814c();
        hashMap.put("h", m1814c.mo1207d());
        if (m1814c.mo1208c()) {
            C2363a mo1209b = m1814c.mo1209b();
            ArrayList arrayList = new ArrayList();
            for (List<String> list : mo1209b.m1925b()) {
                arrayList.add(C2371e.m1903d(list));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", mo1209b.m1926a());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        m1860f0("q", hashMap, new C2382e(c2389l));
    }

    /* renamed from: k0 */
    private void m1850k0(String str, List<String> list, Object obj, InterfaceC2392k interfaceC2392k) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C2371e.m1903d(list));
        hashMap.put("d", obj);
        m1860f0(str, hashMap, new C2379b(this, interfaceC2392k));
    }

    /* renamed from: l0 */
    private void m1848l0(long j) {
        C2390m c2390m = this.f6238m.get(Long.valueOf(j));
        InterfaceC2392k m1810b = c2390m.m1810b();
        String m1811a = c2390m.m1811a();
        c2390m.m1808d();
        m1860f0(m1811a, c2390m.m1809c(), new C2381d(m1811a, j, c2390m, m1810b));
    }

    /* renamed from: m0 */
    private void m1846m0(String str, boolean z, Map<String, Object> map, InterfaceC2385h interfaceC2385h) {
        long m1877U = m1877U();
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(m1877U));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.f6232g.m1914m(hashMap, z);
        this.f6236k.put(Long.valueOf(m1877U), interfaceC2385h);
    }

    /* renamed from: n0 */
    private void m1844n0(Map<String, Integer> map) {
        if (map.isEmpty()) {
            if (this.f6245t.m1174f()) {
                this.f6245t.m1178b("Not sending stats because stats are empty", new Object[0]);
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("c", map);
        m1860f0("s", hashMap, new C2383f());
    }

    /* renamed from: o0 */
    private void m1842o0() {
        C2371e.m1905b(m1884N(), "Must be connected to send unauth.", new Object[0]);
        C2371e.m1905b(this.f6240o == null, "Auth token must not be set.", new Object[0]);
        m1860f0("unauth", Collections.emptyMap(), null);
    }

    /* renamed from: p0 */
    private void m1840p0(C2389l c2389l) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C2371e.m1903d(c2389l.f6281b.f6274a));
        Long m1812e = c2389l.m1812e();
        if (m1812e != null) {
            hashMap.put("q", c2389l.m1813d().f6275b);
            hashMap.put("t", m1812e);
        }
        m1860f0("n", hashMap, null);
    }

    /* renamed from: q */
    static /* synthetic */ int m1839q(C2376i c2376i) {
        int i = c2376i.f6249x;
        c2376i.f6249x = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public void m1836r0() {
        if (m1838q0()) {
            C2371e.m1905b(this.f6233h == EnumC2386i.Disconnected, "Not in disconnected state: %s", this.f6233h);
            boolean z = this.f6241p;
            this.f6245t.m1178b("Scheduling connection attempt", new Object[0]);
            this.f6241p = false;
            this.f6246u.m1771c(new RunnableC2377a(z));
        }
    }

    /* renamed from: s0 */
    private void m1834s0() {
        m1856h0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public void m1832t0(List<String> list, C2387j c2387j) {
        if (list.contains("no_index")) {
            C2566c c2566c = this.f6245t;
            c2566c.m1171i("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '" + ("\".indexOn\": \"" + c2387j.f6275b.get("i") + '\"') + "' at " + C2371e.m1903d(c2387j.f6274a) + " to your security and Firebase Database rules for better performance");
        }
    }

    /* renamed from: T */
    public boolean m1878T(String str) {
        return this.f6229d.contains(str);
    }

    /* renamed from: Z */
    public void m1872Z(String str) {
        C2371e.m1905b(this.f6233h == EnumC2386i.GettingToken, "Trying to open network connection while in the wrong state: %s", this.f6233h);
        if (str == null) {
            this.f6226a.mo1347b(false);
        }
        this.f6240o = str;
        this.f6233h = EnumC2386i.Connecting;
        C2364b c2364b = new C2364b(this.f6242q, this.f6227b, this.f6228c, this, this.f6247v);
        this.f6232g = c2364b;
        c2364b.m1916k();
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: a */
    public void mo1871a() {
        m1836r0();
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: b */
    public void mo1869b(List<String> list, Object obj, InterfaceC2392k interfaceC2392k) {
        m1870a0("p", list, obj, null, interfaceC2392k);
    }

    @Override // com.google.firebase.database.p122o.C2364b.InterfaceC2365a
    /* renamed from: c */
    public void mo1867c(long j, String str) {
        if (this.f6245t.m1174f()) {
            this.f6245t.m1178b("onReady", new Object[0]);
        }
        this.f6231f = System.currentTimeMillis();
        m1881Q(j);
        if (this.f6230e) {
            m1854i0();
        }
        m1864d0();
        this.f6230e = false;
        this.f6247v = str;
        this.f6226a.mo1348a();
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: d */
    public void mo1865d(List<String> list, Object obj, String str, InterfaceC2392k interfaceC2392k) {
        m1870a0("p", list, obj, str, interfaceC2392k);
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: e */
    public void mo1863e(String str) {
        this.f6245t.m1178b("Auth token refreshed.", new Object[0]);
        this.f6240o = str;
        if (m1884N()) {
            if (str != null) {
                m1834s0();
            } else {
                m1842o0();
            }
        }
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: f */
    public void mo1861f(List<String> list, Map<String, Object> map, InterfaceC2373g interfaceC2373g, Long l, InterfaceC2392k interfaceC2392k) {
        C2387j c2387j = new C2387j(list, map);
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("Listening on " + c2387j, new Object[0]);
        }
        C2371e.m1905b(!this.f6239n.containsKey(c2387j), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.f6245t.m1174f()) {
            C2566c c2566c2 = this.f6245t;
            c2566c2.m1178b("Adding listen query: " + c2387j, new Object[0]);
        }
        C2389l c2389l = new C2389l(interfaceC2392k, c2387j, l, interfaceC2373g, null);
        this.f6239n.put(c2387j, c2389l);
        if (m1884N()) {
            m1852j0(c2389l);
        }
        m1883O();
    }

    @Override // com.google.firebase.database.p122o.C2364b.InterfaceC2365a
    /* renamed from: g */
    public void mo1859g(Map<String, Object> map) {
        if (map.containsKey("r")) {
            InterfaceC2385h remove = this.f6236k.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (remove != null) {
                remove.mo1823a((Map) map.get("b"));
            }
        } else if (map.containsKey("error")) {
        } else {
            if (map.containsKey("a")) {
                m1875W((String) map.get("a"), (Map) map.get("b"));
            } else if (this.f6245t.m1174f()) {
                C2566c c2566c = this.f6245t;
                c2566c.m1178b("Ignoring unknown message: " + map, new Object[0]);
            }
        }
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: h */
    public void mo1857h(List<String> list, Map<String, Object> map, InterfaceC2392k interfaceC2392k) {
        m1870a0("m", list, map, null, interfaceC2392k);
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: i */
    public void mo1855i(String str) {
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("Connection interrupted for: " + str, new Object[0]);
        }
        this.f6229d.add(str);
        C2364b c2364b = this.f6232g;
        if (c2364b != null) {
            c2364b.m1924c();
            this.f6232g = null;
        } else {
            this.f6246u.m1772b();
            this.f6233h = EnumC2386i.Disconnected;
        }
        this.f6246u.m1769e();
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: j */
    public void mo1853j(List<String> list, Map<String, Object> map) {
        C2387j c2387j = new C2387j(list, map);
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("unlistening on " + c2387j, new Object[0]);
        }
        C2389l m1868b0 = m1868b0(c2387j);
        if (m1868b0 != null && m1884N()) {
            m1840p0(m1868b0);
        }
        m1883O();
    }

    @Override // com.google.firebase.database.p122o.C2364b.InterfaceC2365a
    /* renamed from: k */
    public void mo1851k(C2364b.EnumC2366b enumC2366b) {
        boolean z = false;
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("Got on disconnect due to " + enumC2366b.name(), new Object[0]);
        }
        this.f6233h = EnumC2386i.Disconnected;
        this.f6232g = null;
        this.f6225A = false;
        this.f6236k.clear();
        m1885M();
        if (m1838q0()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f6231f;
            long j2 = currentTimeMillis - j;
            if (j > 0 && j2 > 30000) {
                z = true;
            }
            if (enumC2366b == C2364b.EnumC2366b.SERVER_RESET || z) {
                this.f6246u.m1769e();
            }
            m1836r0();
        }
        this.f6231f = 0L;
        this.f6226a.mo1344e();
    }

    @Override // com.google.firebase.database.p122o.C2364b.InterfaceC2365a
    /* renamed from: l */
    public void mo1849l(String str) {
        this.f6228c = str;
    }

    @Override // com.google.firebase.database.p122o.InterfaceC2374h
    /* renamed from: m */
    public void mo1847m(String str) {
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("Connection no longer interrupted for: " + str, new Object[0]);
        }
        this.f6229d.remove(str);
        if (m1838q0() && this.f6233h == EnumC2386i.Disconnected) {
            m1836r0();
        }
    }

    @Override // com.google.firebase.database.p122o.C2364b.InterfaceC2365a
    /* renamed from: n */
    public void mo1845n(String str) {
        if (this.f6245t.m1174f()) {
            C2566c c2566c = this.f6245t;
            c2566c.m1178b("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: " + str, new Object[0]);
        }
        mo1855i("server_kill");
    }

    /* renamed from: q0 */
    boolean m1838q0() {
        return this.f6229d.size() == 0;
    }
}
