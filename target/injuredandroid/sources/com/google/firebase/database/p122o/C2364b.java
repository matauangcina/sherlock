package com.google.firebase.database.p122o;

import com.google.firebase.database.p122o.C2393l;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p130q.InterfaceC2567d;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.database.o.b */
/* loaded from: classes.dex */
public class C2364b implements C2393l.InterfaceC2396c {

    /* renamed from: f */
    private static long f6201f;

    /* renamed from: a */
    private C2372f f6202a;

    /* renamed from: b */
    private C2393l f6203b;

    /* renamed from: c */
    private InterfaceC2365a f6204c;

    /* renamed from: d */
    private EnumC2367c f6205d;

    /* renamed from: e */
    private final C2566c f6206e;

    /* renamed from: com.google.firebase.database.o.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2365a {
        /* renamed from: c */
        void mo1867c(long j, String str);

        /* renamed from: g */
        void mo1859g(Map<String, Object> map);

        /* renamed from: k */
        void mo1851k(EnumC2366b enumC2366b);

        /* renamed from: l */
        void mo1849l(String str);

        /* renamed from: n */
        void mo1845n(String str);
    }

    /* renamed from: com.google.firebase.database.o.b$b */
    /* loaded from: classes.dex */
    public enum EnumC2366b {
        SERVER_RESET,
        OTHER
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.o.b$c */
    /* loaded from: classes.dex */
    public enum EnumC2367c {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public C2364b(C2370d c2370d, C2372f c2372f, String str, InterfaceC2365a interfaceC2365a, String str2) {
        long j = f6201f;
        f6201f = 1 + j;
        this.f6202a = c2372f;
        this.f6204c = interfaceC2365a;
        InterfaceC2567d m1910d = c2370d.m1910d();
        this.f6206e = new C2566c(m1910d, "Connection", "conn_" + j);
        this.f6205d = EnumC2367c.REALTIME_CONNECTING;
        this.f6203b = new C2393l(c2370d, c2372f, str, this, str2);
    }

    /* renamed from: e */
    private void m1922e(long j, String str) {
        if (this.f6206e.m1174f()) {
            this.f6206e.m1178b("realtime connection established", new Object[0]);
        }
        this.f6205d = EnumC2367c.REALTIME_CONNECTED;
        this.f6204c.mo1867c(j, str);
    }

    /* renamed from: f */
    private void m1921f(String str) {
        if (this.f6206e.m1174f()) {
            this.f6206e.m1178b("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.f6204c.mo1845n(str);
        m1924c();
    }

    /* renamed from: g */
    private void m1920g(Map<String, Object> map) {
        if (this.f6206e.m1174f()) {
            C2566c c2566c = this.f6206e;
            c2566c.m1178b("Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f6206e.m1174f()) {
                    C2566c c2566c2 = this.f6206e;
                    c2566c2.m1178b("Got invalid control message: " + map.toString(), new Object[0]);
                }
                m1924c();
            } else if (str.equals("s")) {
                m1921f((String) map.get("d"));
            } else if (str.equals("r")) {
                m1917j((String) map.get("d"));
            } else if (str.equals("h")) {
                m1918i((Map) map.get("d"));
            } else if (this.f6206e.m1174f()) {
                C2566c c2566c3 = this.f6206e;
                c2566c3.m1178b("Ignoring unknown control message: " + str, new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f6206e.m1174f()) {
                C2566c c2566c4 = this.f6206e;
                c2566c4.m1178b("Failed to parse control message: " + e.toString(), new Object[0]);
            }
            m1924c();
        }
    }

    /* renamed from: h */
    private void m1919h(Map<String, Object> map) {
        if (this.f6206e.m1174f()) {
            C2566c c2566c = this.f6206e;
            c2566c.m1178b("received data message: " + map.toString(), new Object[0]);
        }
        this.f6204c.mo1859g(map);
    }

    /* renamed from: i */
    private void m1918i(Map<String, Object> map) {
        long longValue = ((Long) map.get("ts")).longValue();
        this.f6204c.mo1849l((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.f6205d == EnumC2367c.REALTIME_CONNECTING) {
            this.f6203b.m1779y();
            m1922e(longValue, str);
        }
    }

    /* renamed from: j */
    private void m1917j(String str) {
        if (this.f6206e.m1174f()) {
            C2566c c2566c = this.f6206e;
            c2566c.m1178b("Got a reset; killing connection to " + this.f6202a.m1900b() + "; Updating internalHost to " + str, new Object[0]);
        }
        this.f6204c.mo1849l(str);
        m1923d(EnumC2366b.SERVER_RESET);
    }

    /* renamed from: l */
    private void m1915l(Map<String, Object> map, boolean z) {
        if (this.f6205d != EnumC2367c.REALTIME_CONNECTED) {
            this.f6206e.m1178b("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.f6206e.m1178b("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f6206e.m1178b("Sending data: %s", map);
        }
        this.f6203b.m1782v(map);
    }

    @Override // com.google.firebase.database.p122o.C2393l.InterfaceC2396c
    /* renamed from: a */
    public void mo1778a(Map<String, Object> map) {
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f6206e.m1174f()) {
                    C2566c c2566c = this.f6206e;
                    c2566c.m1178b("Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
                }
                m1924c();
            } else if (str.equals("d")) {
                m1919h((Map) map.get("d"));
            } else if (str.equals("c")) {
                m1920g((Map) map.get("d"));
            } else if (this.f6206e.m1174f()) {
                C2566c c2566c2 = this.f6206e;
                c2566c2.m1178b("Ignoring unknown server message type: " + str, new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f6206e.m1174f()) {
                C2566c c2566c3 = this.f6206e;
                c2566c3.m1178b("Failed to parse server message: " + e.toString(), new Object[0]);
            }
            m1924c();
        }
    }

    @Override // com.google.firebase.database.p122o.C2393l.InterfaceC2396c
    /* renamed from: b */
    public void mo1777b(boolean z) {
        this.f6203b = null;
        if (z || this.f6205d != EnumC2367c.REALTIME_CONNECTING) {
            if (this.f6206e.m1174f()) {
                this.f6206e.m1178b("Realtime connection lost", new Object[0]);
            }
        } else if (this.f6206e.m1174f()) {
            this.f6206e.m1178b("Realtime connection failed", new Object[0]);
        }
        m1924c();
    }

    /* renamed from: c */
    public void m1924c() {
        m1923d(EnumC2366b.OTHER);
    }

    /* renamed from: d */
    public void m1923d(EnumC2366b enumC2366b) {
        if (this.f6205d != EnumC2367c.REALTIME_DISCONNECTED) {
            if (this.f6206e.m1174f()) {
                this.f6206e.m1178b("closing realtime connection", new Object[0]);
            }
            this.f6205d = EnumC2367c.REALTIME_DISCONNECTED;
            C2393l c2393l = this.f6203b;
            if (c2393l != null) {
                c2393l.m1793k();
                this.f6203b = null;
            }
            this.f6204c.mo1851k(enumC2366b);
        }
    }

    /* renamed from: k */
    public void m1916k() {
        if (this.f6206e.m1174f()) {
            this.f6206e.m1178b("Opening a connection", new Object[0]);
        }
        this.f6203b.m1784t();
    }

    /* renamed from: m */
    public void m1914m(Map<String, Object> map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        m1915l(hashMap, z);
    }
}
