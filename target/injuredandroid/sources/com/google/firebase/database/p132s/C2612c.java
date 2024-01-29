package com.google.firebase.database.p132s;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import com.google.firebase.database.p122o.C2370d;
import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p130q.InterfaceC2567d;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
/* renamed from: com.google.firebase.database.s.c */
/* loaded from: classes.dex */
public class C2612c {

    /* renamed from: l */
    private static final AtomicInteger f6764l = new AtomicInteger(0);

    /* renamed from: m */
    private static final Charset f6765m = Charset.forName("UTF-8");

    /* renamed from: n */
    private static ThreadFactory f6766n = Executors.defaultThreadFactory();

    /* renamed from: o */
    private static InterfaceC2611b f6767o = new C2613a();

    /* renamed from: d */
    private final URI f6771d;

    /* renamed from: e */
    private final String f6772e;

    /* renamed from: f */
    private final C2621h f6773f;

    /* renamed from: g */
    private final C2622i f6774g;

    /* renamed from: h */
    private final C2619f f6775h;

    /* renamed from: i */
    private final C2566c f6776i;

    /* renamed from: a */
    private volatile EnumC2616d f6768a = EnumC2616d.NONE;

    /* renamed from: b */
    private volatile Socket f6769b = null;

    /* renamed from: c */
    private InterfaceC2617d f6770c = null;

    /* renamed from: j */
    private final int f6777j = f6764l.incrementAndGet();

    /* renamed from: k */
    private final Thread f6778k = m1036j().newThread(new RunnableC2614b());

    /* renamed from: com.google.firebase.database.s.c$a */
    /* loaded from: classes.dex */
    class C2613a implements InterfaceC2611b {
        C2613a() {
        }

        @Override // com.google.firebase.database.p132s.InterfaceC2611b
        /* renamed from: a */
        public void mo1027a(Thread thread, String str) {
            thread.setName(str);
        }
    }

    /* renamed from: com.google.firebase.database.s.c$b */
    /* loaded from: classes.dex */
    class RunnableC2614b implements Runnable {
        RunnableC2614b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2612c.this.m1032n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.s.c$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2615c {

        /* renamed from: a */
        static final /* synthetic */ int[] f6780a;

        static {
            int[] iArr = new int[EnumC2616d.values().length];
            f6780a = iArr;
            try {
                iArr[EnumC2616d.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6780a[EnumC2616d.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6780a[EnumC2616d.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6780a[EnumC2616d.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6780a[EnumC2616d.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.database.s.c$d */
    /* loaded from: classes.dex */
    public enum EnumC2616d {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public C2612c(C2370d c2370d, URI uri, String str, Map<String, String> map) {
        this.f6771d = uri;
        this.f6772e = c2370d.m1909e();
        InterfaceC2567d m1910d = c2370d.m1910d();
        this.f6776i = new C2566c(m1910d, "WebSocket", "sk_" + this.f6777j);
        this.f6775h = new C2619f(uri, str, map);
        this.f6773f = new C2621h(this);
        this.f6774g = new C2622i(this, "TubeSock", this.f6777j);
    }

    /* renamed from: d */
    private synchronized void m1042d() {
        if (this.f6768a == EnumC2616d.DISCONNECTED) {
            return;
        }
        this.f6773f.m1008h();
        this.f6774g.m999i();
        if (this.f6769b != null) {
            try {
                this.f6769b.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.f6768a = EnumC2616d.DISCONNECTED;
        this.f6770c.mo1026b();
    }

    /* renamed from: f */
    private Socket m1040f() {
        String scheme = this.f6771d.getScheme();
        String host = this.f6771d.getHost();
        int port = this.f6771d.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e) {
                throw new C2618e("unknown host: " + host, e);
            } catch (IOException e2) {
                throw new C2618e("error while creating socket to " + this.f6771d, e2);
            }
        } else if (scheme == null || !scheme.equals("wss")) {
            throw new C2618e("unsupported protocol: " + scheme);
        } else {
            if (port == -1) {
                port = 443;
            }
            SSLSessionCache sSLSessionCache = null;
            try {
                if (this.f6772e != null) {
                    sSLSessionCache = new SSLSessionCache(new File(this.f6772e));
                }
            } catch (IOException e3) {
                this.f6776i.m1179a("Failed to initialize SSL session cache", e3, new Object[0]);
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new C2618e("Error while verifying secure socket to " + this.f6771d);
            } catch (UnknownHostException e4) {
                throw new C2618e("unknown host: " + host, e4);
            } catch (IOException e5) {
                throw new C2618e("error while creating secure socket to " + this.f6771d, e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static InterfaceC2611b m1037i() {
        return f6767o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static ThreadFactory m1036j() {
        return f6766n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m1032n() {
        try {
            try {
                Socket m1040f = m1040f();
                synchronized (this) {
                    this.f6769b = m1040f;
                    if (this.f6768a == EnumC2616d.DISCONNECTED) {
                        try {
                            this.f6769b.close();
                            this.f6769b = null;
                            return;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    DataInputStream dataInputStream = new DataInputStream(m1040f.getInputStream());
                    OutputStream outputStream = m1040f.getOutputStream();
                    outputStream.write(this.f6775h.m1020c());
                    byte[] bArr = new byte[1000];
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    while (true) {
                        int i = 0;
                        while (!z) {
                            int read = dataInputStream.read();
                            if (read == -1) {
                                throw new C2618e("Connection closed before handshake was complete");
                            }
                            bArr[i] = (byte) read;
                            i++;
                            if (bArr[i - 1] == 10 && bArr[i - 2] == 13) {
                                String str = new String(bArr, f6765m);
                                if (str.trim().equals("")) {
                                    z = true;
                                } else {
                                    arrayList.add(str.trim());
                                }
                                bArr = new byte[1000];
                            } else if (i == 1000) {
                                String str2 = new String(bArr, f6765m);
                                throw new C2618e("Unexpected long line in handshake: " + str2);
                            }
                        }
                        this.f6775h.m1017f((String) arrayList.get(0));
                        arrayList.remove(0);
                        HashMap<String, String> hashMap = new HashMap<>();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String[] split = ((String) it.next()).split(": ", 2);
                            hashMap.put(split[0].toLowerCase(Locale.US), split[1].toLowerCase(Locale.US));
                        }
                        this.f6775h.m1018e(hashMap);
                        this.f6774g.m1000h(outputStream);
                        this.f6773f.m1009g(dataInputStream);
                        this.f6768a = EnumC2616d.CONNECTED;
                        this.f6774g.m1004d().start();
                        this.f6770c.mo1025c();
                        this.f6773f.m1010f();
                    }
                }
            } finally {
                m1043c();
            }
        } catch (C2618e e2) {
            this.f6770c.mo1023f(e2);
        } catch (Throwable th) {
            InterfaceC2617d interfaceC2617d = this.f6770c;
            interfaceC2617d.mo1023f(new C2618e("error while connecting: " + th.getMessage(), th));
        }
    }

    /* renamed from: o */
    private synchronized void m1031o(byte b, byte[] bArr) {
        if (this.f6768a != EnumC2616d.CONNECTED) {
            this.f6770c.mo1023f(new C2618e("error while sending data: not connected"));
        } else {
            try {
                this.f6774g.m1001g(b, true, bArr);
            } catch (IOException e) {
                this.f6770c.mo1023f(new C2618e("Failed to send frame", e));
                m1043c();
            }
        }
    }

    /* renamed from: q */
    private void m1029q() {
        try {
            this.f6768a = EnumC2616d.DISCONNECTING;
            this.f6774g.m999i();
            this.f6774g.m1001g((byte) 8, true, new byte[0]);
        } catch (IOException e) {
            this.f6770c.mo1023f(new C2618e("Failed to send close frame", e));
        }
    }

    /* renamed from: b */
    public void m1044b() {
        if (this.f6774g.m1004d().getState() != Thread.State.NEW) {
            this.f6774g.m1004d().join();
        }
        m1038h().join();
    }

    /* renamed from: c */
    public synchronized void m1043c() {
        int i = C2615c.f6780a[this.f6768a.ordinal()];
        if (i == 1) {
            this.f6768a = EnumC2616d.DISCONNECTED;
        } else if (i == 2) {
            m1042d();
        } else if (i == 3) {
            m1029q();
        } else if (i != 4) {
        }
    }

    /* renamed from: e */
    public synchronized void m1041e() {
        if (this.f6768a != EnumC2616d.NONE) {
            this.f6770c.mo1023f(new C2618e("connect() already called"));
            m1043c();
            return;
        }
        InterfaceC2611b m1037i = m1037i();
        Thread m1038h = m1038h();
        m1037i.mo1027a(m1038h, "TubeSockReader-" + this.f6777j);
        this.f6768a = EnumC2616d.CONNECTING;
        m1038h().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC2617d m1039g() {
        return this.f6770c;
    }

    /* renamed from: h */
    Thread m1038h() {
        return this.f6778k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m1035k(C2618e c2618e) {
        this.f6770c.mo1023f(c2618e);
        if (this.f6768a == EnumC2616d.CONNECTED) {
            m1043c();
        }
        m1042d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m1034l() {
        m1042d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized void m1033m(byte[] bArr) {
        m1031o((byte) 10, bArr);
    }

    /* renamed from: p */
    public synchronized void m1030p(String str) {
        m1031o((byte) 1, str.getBytes(f6765m));
    }

    /* renamed from: r */
    public void m1028r(InterfaceC2617d interfaceC2617d) {
        this.f6770c = interfaceC2617d;
    }
}
