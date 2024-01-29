package p054b.p059c.p098c;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1576c;
import com.google.android.gms.common.internal.C1677q;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.util.C1694b;
import com.google.android.gms.common.util.C1701i;
import com.google.android.gms.common.util.C1702j;
import com.google.firebase.components.C2277d;
import com.google.firebase.components.C2281f;
import com.google.firebase.components.C2290l;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.InterfaceC2286h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p014d.C0066a;
import p000a.p019g.p024g.C0147d;
import p054b.p059c.p098c.p099j.InterfaceC1429c;
import p054b.p059c.p098c.p100k.C1432b;
import p054b.p059c.p098c.p102m.C1436a;
import p054b.p059c.p098c.p104n.C1441c;
import p054b.p059c.p098c.p104n.C1443e;
import p054b.p059c.p098c.p104n.C1445g;
/* renamed from: b.c.c.c */
/* loaded from: classes.dex */
public class C1415c {

    /* renamed from: i */
    private static final Object f4344i = new Object();

    /* renamed from: j */
    private static final Executor f4345j = new ExecutorC1419d();

    /* renamed from: k */
    static final Map<String, C1415c> f4346k = new C0066a();

    /* renamed from: a */
    private final Context f4347a;

    /* renamed from: b */
    private final String f4348b;

    /* renamed from: c */
    private final C1425h f4349c;

    /* renamed from: d */
    private final C2290l f4350d;

    /* renamed from: e */
    private final AtomicBoolean f4351e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f4352f = new AtomicBoolean();

    /* renamed from: g */
    private final List<InterfaceC1417b> f4353g = new CopyOnWriteArrayList();

    /* renamed from: h */
    private final List<InterfaceC1421d> f4354h = new CopyOnWriteArrayList();

    /* renamed from: b.c.c.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1417b {
        /* renamed from: a */
        void mo2019a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.c.c.c$c */
    /* loaded from: classes.dex */
    public static class C1418c implements ComponentCallbacks2C1576c.InterfaceC1577a {

        /* renamed from: a */
        private static AtomicReference<C1418c> f4355a = new AtomicReference<>();

        private C1418c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m4185c(Context context) {
            if (C1701i.m3554a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4355a.get() == null) {
                    C1418c c1418c = new C1418c();
                    if (f4355a.compareAndSet(null, c1418c)) {
                        ComponentCallbacks2C1576c.m3907c(application);
                        ComponentCallbacks2C1576c.m3908b().m3909a(c1418c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1576c.InterfaceC1577a
        /* renamed from: a */
        public void mo2324a(boolean z) {
            synchronized (C1415c.f4344i) {
                Iterator it = new ArrayList(C1415c.f4346k.values()).iterator();
                while (it.hasNext()) {
                    C1415c c1415c = (C1415c) it.next();
                    if (c1415c.f4351e.get()) {
                        c1415c.m4187w(z);
                    }
                }
            }
        }
    }

    /* renamed from: b.c.c.c$d */
    /* loaded from: classes.dex */
    private static class ExecutorC1419d implements Executor {

        /* renamed from: a */
        private static final Handler f4356a = new Handler(Looper.getMainLooper());

        private ExecutorC1419d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f4356a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.c.c.c$e */
    /* loaded from: classes.dex */
    public static class C1420e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C1420e> f4357b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f4358a;

        public C1420e(Context context) {
            this.f4358a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m4183b(Context context) {
            if (f4357b.get() == null) {
                C1420e c1420e = new C1420e(context);
                if (f4357b.compareAndSet(null, c1420e)) {
                    context.registerReceiver(c1420e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m4182c() {
            this.f4358a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C1415c.f4344i) {
                for (C1415c c1415c : C1415c.f4346k.values()) {
                    c1415c.m4194p();
                }
            }
            m4182c();
        }
    }

    protected C1415c(Context context, String str, C1425h c1425h) {
        C1679r.m3631h(context);
        this.f4347a = context;
        C1679r.m3633f(str);
        this.f4348b = str;
        C1679r.m3631h(c1425h);
        this.f4349c = c1425h;
        List<InterfaceC2286h> m2124a = C2281f.m2123b(context, ComponentDiscoveryService.class).m2124a();
        String m4163a = C1443e.m4163a();
        Executor executor = f4345j;
        C2277d[] c2277dArr = new C2277d[8];
        c2277dArr[0] = C2277d.m2133n(context, Context.class, new Class[0]);
        c2277dArr[1] = C2277d.m2133n(this, C1415c.class, new Class[0]);
        c2277dArr[2] = C2277d.m2133n(c1425h, C1425h.class, new Class[0]);
        c2277dArr[3] = C1445g.m4159a("fire-android", "");
        c2277dArr[4] = C1445g.m4159a("fire-core", "19.3.0");
        c2277dArr[5] = m4163a != null ? C1445g.m4159a("kotlin", m4163a) : null;
        c2277dArr[6] = C1441c.m4167a();
        c2277dArr[7] = C1432b.m4174a();
        this.f4350d = new C2290l(executor, m2124a, c2277dArr);
        C1414b.m4210a(this, context);
    }

    /* renamed from: g */
    private void m4203g() {
        C1679r.m3628k(!this.f4352f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    private static List<String> m4201i() {
        ArrayList arrayList = new ArrayList();
        synchronized (f4344i) {
            for (C1415c c1415c : f4346k.values()) {
                arrayList.add(c1415c.m4197m());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: k */
    public static C1415c m4199k() {
        C1415c c1415c;
        synchronized (f4344i) {
            c1415c = f4346k.get("[DEFAULT]");
            if (c1415c == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C1702j.m3546a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c1415c;
    }

    /* renamed from: l */
    public static C1415c m4198l(String str) {
        C1415c c1415c;
        List<String> m4201i;
        String str2;
        synchronized (f4344i) {
            c1415c = f4346k.get(m4188v(str));
            if (c1415c == null) {
                if (m4201i().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", m4201i);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return c1415c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m4194p() {
        if (!C0147d.m8963a(this.f4347a)) {
            C1420e.m4183b(this.f4347a);
        } else {
            this.f4350d.m2115e(m4190t());
        }
    }

    /* renamed from: q */
    public static C1415c m4193q(Context context) {
        synchronized (f4344i) {
            if (f4346k.containsKey("[DEFAULT]")) {
                return m4199k();
            }
            C1425h m4181a = C1425h.m4181a(context);
            if (m4181a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m4192r(context, m4181a);
        }
    }

    /* renamed from: r */
    public static C1415c m4192r(Context context, C1425h c1425h) {
        return m4191s(context, c1425h, "[DEFAULT]");
    }

    /* renamed from: s */
    public static C1415c m4191s(Context context, C1425h c1425h, String str) {
        C1415c c1415c;
        C1418c.m4185c(context);
        String m4188v = m4188v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4344i) {
            boolean z = !f4346k.containsKey(m4188v);
            C1679r.m3628k(z, "FirebaseApp name " + m4188v + " already exists!");
            C1679r.m3630i(context, "Application context cannot be null.");
            c1415c = new C1415c(context, m4188v, c1425h);
            f4346k.put(m4188v, c1415c);
        }
        c1415c.m4194p();
        return c1415c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static /* synthetic */ C1436a m4189u(C1415c c1415c, Context context) {
        return new C1436a(context, c1415c.m4195o(), (InterfaceC1429c) c1415c.f4350d.mo2081a(InterfaceC1429c.class));
    }

    /* renamed from: v */
    private static String m4188v(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m4187w(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (InterfaceC1417b interfaceC1417b : this.f4353g) {
            interfaceC1417b.mo2019a(z);
        }
    }

    /* renamed from: e */
    public void m4205e(InterfaceC1417b interfaceC1417b) {
        m4203g();
        if (this.f4351e.get() && ComponentCallbacks2C1576c.m3908b().m3906d()) {
            interfaceC1417b.mo2019a(true);
        }
        this.f4353g.add(interfaceC1417b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1415c) {
            return this.f4348b.equals(((C1415c) obj).m4197m());
        }
        return false;
    }

    /* renamed from: f */
    public void m4204f(InterfaceC1421d interfaceC1421d) {
        m4203g();
        C1679r.m3631h(interfaceC1421d);
        this.f4354h.add(interfaceC1421d);
    }

    /* renamed from: h */
    public <T> T m4202h(Class<T> cls) {
        m4203g();
        return (T) this.f4350d.mo2081a(cls);
    }

    public int hashCode() {
        return this.f4348b.hashCode();
    }

    /* renamed from: j */
    public Context m4200j() {
        m4203g();
        return this.f4347a;
    }

    /* renamed from: m */
    public String m4197m() {
        m4203g();
        return this.f4348b;
    }

    /* renamed from: n */
    public C1425h m4196n() {
        m4203g();
        return this.f4349c;
    }

    /* renamed from: o */
    public String m4195o() {
        return C1694b.m3565d(m4197m().getBytes(Charset.defaultCharset())) + "+" + C1694b.m3565d(m4196n().m4179c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: t */
    public boolean m4190t() {
        return "[DEFAULT]".equals(m4197m());
    }

    public String toString() {
        C1677q.C1678a m3640c = C1677q.m3640c(this);
        m3640c.m3639a("name", this.f4348b);
        m3640c.m3639a("options", this.f4349c);
        return m3640c.toString();
    }
}
