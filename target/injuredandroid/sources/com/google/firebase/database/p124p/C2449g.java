package com.google.firebase.database.p124p;

import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.database.C2307c;
import com.google.firebase.database.C2310f;
import com.google.firebase.database.p120m.C2332h;
import com.google.firebase.database.p122o.C2370d;
import com.google.firebase.database.p122o.C2372f;
import com.google.firebase.database.p122o.InterfaceC2368c;
import com.google.firebase.database.p122o.InterfaceC2374h;
import com.google.firebase.database.p124p.InterfaceC2407a;
import com.google.firebase.database.p124p.p126f0.C2434d;
import com.google.firebase.database.p124p.p126f0.InterfaceC2435e;
import com.google.firebase.database.p124p.p127g0.AbstractC2453c;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p130q.InterfaceC2567d;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.database.p.g */
/* loaded from: classes.dex */
public class C2449g {

    /* renamed from: a */
    protected InterfaceC2567d f6415a;

    /* renamed from: b */
    protected InterfaceC2505k f6416b;

    /* renamed from: c */
    protected InterfaceC2407a f6417c;

    /* renamed from: d */
    protected InterfaceC2532q f6418d;

    /* renamed from: e */
    protected String f6419e;

    /* renamed from: f */
    protected List<String> f6420f;

    /* renamed from: g */
    protected String f6421g;

    /* renamed from: i */
    protected boolean f6423i;

    /* renamed from: k */
    protected C1415c f6425k;

    /* renamed from: l */
    private InterfaceC2435e f6426l;

    /* renamed from: o */
    private InterfaceC2508m f6429o;

    /* renamed from: h */
    protected InterfaceC2567d.EnumC2568a f6422h = InterfaceC2567d.EnumC2568a.INFO;

    /* renamed from: j */
    protected long f6424j = 10485760;

    /* renamed from: m */
    private boolean f6427m = false;

    /* renamed from: n */
    private boolean f6428n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.g$a */
    /* loaded from: classes.dex */
    public class C2450a implements InterfaceC2407a.InterfaceC2408a {

        /* renamed from: a */
        final /* synthetic */ ScheduledExecutorService f6430a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2368c.InterfaceC2369a f6431b;

        C2450a(ScheduledExecutorService scheduledExecutorService, InterfaceC2368c.InterfaceC2369a interfaceC2369a) {
            this.f6430a = scheduledExecutorService;
            this.f6431b = interfaceC2369a;
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2407a.InterfaceC2408a
        /* renamed from: a */
        public void mo1576a(String str) {
            this.f6430a.execute(RunnableC2421e.m1706a(this.f6431b, str));
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2407a.InterfaceC2408a
        /* renamed from: b */
        public void mo1575b(String str) {
            this.f6430a.execute(RunnableC2430f.m1693a(this.f6431b, str));
        }
    }

    /* renamed from: D */
    private void m1604D() {
        this.f6416b.mo1398a();
        this.f6418d.mo1297a();
    }

    /* renamed from: E */
    private static InterfaceC2368c m1603E(InterfaceC2407a interfaceC2407a, ScheduledExecutorService scheduledExecutorService) {
        return C2419d.m1711b(interfaceC2407a, scheduledExecutorService);
    }

    /* renamed from: b */
    private String m1601b(String str) {
        return "Firebase/5/" + C2310f.m2058e() + "/" + str;
    }

    /* renamed from: c */
    private void m1600c() {
        C1679r.m3630i(this.f6417c, "You must register an authTokenProvider before initializing Context.");
    }

    /* renamed from: d */
    private void m1599d() {
        if (this.f6416b == null) {
            this.f6416b = m1585r().mo1378c(this);
        }
    }

    /* renamed from: e */
    private void m1598e() {
        if (this.f6415a == null) {
            this.f6415a = m1585r().mo1376e(this, this.f6422h, this.f6420f);
        }
    }

    /* renamed from: f */
    private void m1597f() {
        if (this.f6418d == null) {
            this.f6418d = this.f6429o.mo1374g(this);
        }
    }

    /* renamed from: g */
    private void m1596g() {
        if (this.f6419e == null) {
            this.f6419e = "default";
        }
    }

    /* renamed from: h */
    private void m1595h() {
        if (this.f6421g == null) {
            this.f6421g = m1601b(m1585r().mo1379b(this));
        }
    }

    /* renamed from: m */
    private ScheduledExecutorService m1590m() {
        InterfaceC2532q m1584s = m1584s();
        if (m1584s instanceof AbstractC2453c) {
            return ((AbstractC2453c) m1584s).m1572c();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    /* renamed from: r */
    private InterfaceC2508m m1585r() {
        if (this.f6429o == null) {
            m1579x();
        }
        return this.f6429o;
    }

    /* renamed from: w */
    private void m1580w() {
        m1598e();
        m1585r();
        m1595h();
        m1599d();
        m1597f();
        m1596g();
        m1600c();
    }

    /* renamed from: x */
    private synchronized void m1579x() {
        this.f6429o = new C2332h(this.f6425k);
    }

    /* renamed from: B */
    public InterfaceC2374h m1606B(C2372f c2372f, InterfaceC2374h.InterfaceC2375a interfaceC2375a) {
        return m1585r().mo1375f(this, m1592k(), c2372f, interfaceC2375a);
    }

    /* renamed from: C */
    public void m1605C() {
        if (this.f6428n) {
            m1604D();
            this.f6428n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m1602a() {
        if (m1578y()) {
            throw new C2307c("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized void m1594i() {
        if (!this.f6427m) {
            this.f6427m = true;
            m1580w();
        }
    }

    /* renamed from: j */
    public InterfaceC2407a m1593j() {
        return this.f6417c;
    }

    /* renamed from: k */
    public C2370d m1592k() {
        return new C2370d(m1588o(), m1603E(m1593j(), m1590m()), m1590m(), m1577z(), C2310f.m2058e(), m1581v(), m1583t().getAbsolutePath());
    }

    /* renamed from: l */
    public InterfaceC2505k m1591l() {
        return this.f6416b;
    }

    /* renamed from: n */
    public C2566c m1589n(String str) {
        return new C2566c(this.f6415a, str);
    }

    /* renamed from: o */
    public InterfaceC2567d m1588o() {
        return this.f6415a;
    }

    /* renamed from: p */
    public long m1587p() {
        return this.f6424j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public InterfaceC2435e m1586q(String str) {
        InterfaceC2435e interfaceC2435e = this.f6426l;
        if (interfaceC2435e != null) {
            return interfaceC2435e;
        }
        if (this.f6423i) {
            InterfaceC2435e mo1380a = this.f6429o.mo1380a(this, str);
            if (mo1380a != null) {
                return mo1380a;
            }
            throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
        }
        return new C2434d();
    }

    /* renamed from: s */
    public InterfaceC2532q m1584s() {
        return this.f6418d;
    }

    /* renamed from: t */
    public File m1583t() {
        return m1585r().mo1377d();
    }

    /* renamed from: u */
    public String m1582u() {
        return this.f6419e;
    }

    /* renamed from: v */
    public String m1581v() {
        return this.f6421g;
    }

    /* renamed from: y */
    public boolean m1578y() {
        return this.f6427m;
    }

    /* renamed from: z */
    public boolean m1577z() {
        return this.f6423i;
    }
}
