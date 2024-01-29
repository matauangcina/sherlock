package com.google.firebase.database.p122o;

import com.google.firebase.database.p122o.p123m.C2406b;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p130q.InterfaceC2567d;
import com.google.firebase.database.p132s.C2612c;
import com.google.firebase.database.p132s.C2618e;
import com.google.firebase.database.p132s.C2620g;
import com.google.firebase.database.p132s.InterfaceC2617d;
import com.google.firebase.database.p133t.C2625b;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.database.o.l */
/* loaded from: classes.dex */
public class C2393l {

    /* renamed from: l */
    private static long f6291l;

    /* renamed from: a */
    private InterfaceC2397d f6292a;

    /* renamed from: b */
    private boolean f6293b = false;

    /* renamed from: c */
    private boolean f6294c = false;

    /* renamed from: d */
    private long f6295d = 0;

    /* renamed from: e */
    private C2406b f6296e;

    /* renamed from: f */
    private InterfaceC2396c f6297f;

    /* renamed from: g */
    private ScheduledFuture<?> f6298g;

    /* renamed from: h */
    private ScheduledFuture<?> f6299h;

    /* renamed from: i */
    private final C2370d f6300i;

    /* renamed from: j */
    private final ScheduledExecutorService f6301j;

    /* renamed from: k */
    private final C2566c f6302k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.l$a */
    /* loaded from: classes.dex */
    public class RunnableC2394a implements Runnable {
        RunnableC2394a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2393l.this.m1792l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.o.l$b */
    /* loaded from: classes.dex */
    public class RunnableC2395b implements Runnable {
        RunnableC2395b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2393l.this.f6292a != null) {
                C2393l.this.f6292a.mo1775d("0");
                C2393l.this.m1783u();
            }
        }
    }

    /* renamed from: com.google.firebase.database.o.l$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2396c {
        /* renamed from: a */
        void mo1778a(Map<String, Object> map);

        /* renamed from: b */
        void mo1777b(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.l$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2397d {
        /* renamed from: a */
        void mo1776a();

        void close();

        /* renamed from: d */
        void mo1775d(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.l$e */
    /* loaded from: classes.dex */
    public class C2398e implements InterfaceC2397d, InterfaceC2617d {

        /* renamed from: a */
        private C2612c f6305a;

        /* renamed from: com.google.firebase.database.o.l$e$a */
        /* loaded from: classes.dex */
        class RunnableC2399a implements Runnable {
            RunnableC2399a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2393l.this.f6299h.cancel(false);
                C2393l.this.f6293b = true;
                if (C2393l.this.f6302k.m1174f()) {
                    C2393l.this.f6302k.m1178b("websocket opened", new Object[0]);
                }
                C2393l.this.m1783u();
            }
        }

        /* renamed from: com.google.firebase.database.o.l$e$b */
        /* loaded from: classes.dex */
        class RunnableC2400b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f6308f;

            RunnableC2400b(String str) {
                this.f6308f = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2393l.this.m1789o(this.f6308f);
            }
        }

        /* renamed from: com.google.firebase.database.o.l$e$c */
        /* loaded from: classes.dex */
        class RunnableC2401c implements Runnable {
            RunnableC2401c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C2393l.this.f6302k.m1174f()) {
                    C2393l.this.f6302k.m1178b("closed", new Object[0]);
                }
                C2393l.this.m1785s();
            }
        }

        /* renamed from: com.google.firebase.database.o.l$e$d */
        /* loaded from: classes.dex */
        class RunnableC2402d implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C2618e f6311f;

            RunnableC2402d(C2618e c2618e) {
                this.f6311f = c2618e;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f6311f.getCause() == null || !(this.f6311f.getCause() instanceof EOFException)) {
                    C2393l.this.f6302k.m1179a("WebSocket error.", this.f6311f, new Object[0]);
                } else {
                    C2393l.this.f6302k.m1178b("WebSocket reached EOF.", new Object[0]);
                }
                C2393l.this.m1785s();
            }
        }

        private C2398e(C2612c c2612c) {
            this.f6305a = c2612c;
            c2612c.m1028r(this);
        }

        /* synthetic */ C2398e(C2393l c2393l, C2612c c2612c, RunnableC2394a runnableC2394a) {
            this(c2612c);
        }

        /* renamed from: g */
        private void m1774g() {
            this.f6305a.m1043c();
            try {
                this.f6305a.m1044b();
            } catch (InterruptedException e) {
                C2393l.this.f6302k.m1177c("Interrupted while shutting down websocket threads", e);
            }
        }

        @Override // com.google.firebase.database.p122o.C2393l.InterfaceC2397d
        /* renamed from: a */
        public void mo1776a() {
            try {
                this.f6305a.m1041e();
            } catch (C2618e e) {
                if (C2393l.this.f6302k.m1174f()) {
                    C2393l.this.f6302k.m1179a("Error connecting", e, new Object[0]);
                }
                m1774g();
            }
        }

        @Override // com.google.firebase.database.p132s.InterfaceC2617d
        /* renamed from: b */
        public void mo1026b() {
            C2393l.this.f6301j.execute(new RunnableC2401c());
        }

        @Override // com.google.firebase.database.p132s.InterfaceC2617d
        /* renamed from: c */
        public void mo1025c() {
            C2393l.this.f6301j.execute(new RunnableC2399a());
        }

        @Override // com.google.firebase.database.p122o.C2393l.InterfaceC2397d
        public void close() {
            this.f6305a.m1043c();
        }

        @Override // com.google.firebase.database.p122o.C2393l.InterfaceC2397d
        /* renamed from: d */
        public void mo1775d(String str) {
            this.f6305a.m1030p(str);
        }

        @Override // com.google.firebase.database.p132s.InterfaceC2617d
        /* renamed from: e */
        public void mo1024e(C2620g c2620g) {
            String m1016a = c2620g.m1016a();
            if (C2393l.this.f6302k.m1174f()) {
                C2566c c2566c = C2393l.this.f6302k;
                c2566c.m1178b("ws message: " + m1016a, new Object[0]);
            }
            C2393l.this.f6301j.execute(new RunnableC2400b(m1016a));
        }

        @Override // com.google.firebase.database.p132s.InterfaceC2617d
        /* renamed from: f */
        public void mo1023f(C2618e c2618e) {
            C2393l.this.f6301j.execute(new RunnableC2402d(c2618e));
        }
    }

    public C2393l(C2370d c2370d, C2372f c2372f, String str, InterfaceC2396c interfaceC2396c, String str2) {
        this.f6300i = c2370d;
        this.f6301j = c2370d.m1911c();
        this.f6297f = interfaceC2396c;
        long j = f6291l;
        f6291l = 1 + j;
        InterfaceC2567d m1910d = c2370d.m1910d();
        this.f6302k = new C2566c(m1910d, "WebSocket", "ws_" + j);
        this.f6292a = m1791m(c2372f, str, str2);
    }

    /* renamed from: j */
    private void m1794j(String str) {
        C2566c c2566c;
        StringBuilder sb;
        String str2;
        this.f6296e.m1763a(str);
        long j = this.f6295d - 1;
        this.f6295d = j;
        if (j == 0) {
            try {
                this.f6296e.m1758f();
                Map<String, Object> m994a = C2625b.m994a(this.f6296e.toString());
                this.f6296e = null;
                if (this.f6302k.m1174f()) {
                    C2566c c2566c2 = this.f6302k;
                    c2566c2.m1178b("handleIncomingFrame complete frame: " + m994a, new Object[0]);
                }
                this.f6297f.mo1778a(m994a);
            } catch (IOException e) {
                e = e;
                c2566c = this.f6302k;
                sb = new StringBuilder();
                str2 = "Error parsing frame: ";
                sb.append(str2);
                sb.append(this.f6296e.toString());
                c2566c.m1177c(sb.toString(), e);
                m1793k();
                m1781w();
            } catch (ClassCastException e2) {
                e = e2;
                c2566c = this.f6302k;
                sb = new StringBuilder();
                str2 = "Error parsing frame (cast error): ";
                sb.append(str2);
                sb.append(this.f6296e.toString());
                c2566c.m1177c(sb.toString(), e);
                m1793k();
                m1781w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m1792l() {
        if (this.f6293b || this.f6294c) {
            return;
        }
        if (this.f6302k.m1174f()) {
            this.f6302k.m1178b("timed out on connect", new Object[0]);
        }
        this.f6292a.close();
    }

    /* renamed from: m */
    private InterfaceC2397d m1791m(C2372f c2372f, String str, String str2) {
        if (str == null) {
            str = c2372f.m1900b();
        }
        URI m1901a = C2372f.m1901a(str, c2372f.m1898d(), c2372f.m1899c(), str2);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.f6300i.m1908f());
        return new C2398e(this, new C2612c(this.f6300i, m1901a, null, hashMap), null);
    }

    /* renamed from: n */
    private String m1790n(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt > 0) {
                    m1788p(parseInt);
                    return null;
                }
                return null;
            } catch (NumberFormatException unused) {
            }
        }
        m1788p(1);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m1789o(String str) {
        if (this.f6294c) {
            return;
        }
        m1783u();
        if (!m1787q() && (str = m1790n(str)) == null) {
            return;
        }
        m1794j(str);
    }

    /* renamed from: p */
    private void m1788p(int i) {
        this.f6295d = i;
        this.f6296e = new C2406b();
        if (this.f6302k.m1174f()) {
            C2566c c2566c = this.f6302k;
            c2566c.m1178b("HandleNewFrameCount: " + this.f6295d, new Object[0]);
        }
    }

    /* renamed from: q */
    private boolean m1787q() {
        return this.f6296e != null;
    }

    /* renamed from: r */
    private Runnable m1786r() {
        return new RunnableC2395b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m1785s() {
        if (!this.f6294c) {
            if (this.f6302k.m1174f()) {
                this.f6302k.m1178b("closing itself", new Object[0]);
            }
            m1781w();
        }
        this.f6292a = null;
        ScheduledFuture<?> scheduledFuture = this.f6298g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m1783u() {
        if (this.f6294c) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f6298g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (this.f6302k.m1174f()) {
                C2566c c2566c = this.f6302k;
                c2566c.m1178b("Reset keepAlive. Remaining: " + this.f6298g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
            }
        } else if (this.f6302k.m1174f()) {
            this.f6302k.m1178b("Reset keepAlive", new Object[0]);
        }
        this.f6298g = this.f6301j.schedule(m1786r(), 45000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: w */
    private void m1781w() {
        this.f6294c = true;
        this.f6297f.mo1777b(this.f6293b);
    }

    /* renamed from: x */
    private static String[] m1780x(String str, int i) {
        int i2 = 0;
        if (str.length() <= i) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < str.length()) {
            int i3 = i2 + i;
            arrayList.add(str.substring(i2, Math.min(i3, str.length())));
            i2 = i3;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: k */
    public void m1793k() {
        if (this.f6302k.m1174f()) {
            this.f6302k.m1178b("websocket is being closed", new Object[0]);
        }
        this.f6294c = true;
        this.f6292a.close();
        ScheduledFuture<?> scheduledFuture = this.f6299h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture2 = this.f6298g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    /* renamed from: t */
    public void m1784t() {
        this.f6292a.mo1776a();
        this.f6299h = this.f6301j.schedule(new RunnableC2394a(), 30000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: v */
    public void m1782v(Map<String, Object> map) {
        m1783u();
        try {
            String[] m1780x = m1780x(C2625b.m992c(map), 16384);
            if (m1780x.length > 1) {
                this.f6292a.mo1775d("" + m1780x.length);
            }
            for (String str : m1780x) {
                this.f6292a.mo1775d(str);
            }
        } catch (IOException e) {
            this.f6302k.m1177c("Failed to serialize message: " + map.toString(), e);
            m1781w();
        }
    }

    /* renamed from: y */
    public void m1779y() {
    }
}
