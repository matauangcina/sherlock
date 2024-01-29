package p054b.p055a.p056a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import p054b.p055a.p056a.C1100o;
import p054b.p055a.p056a.C1108u;
import p054b.p055a.p056a.InterfaceC1078b;
/* renamed from: b.a.a.m */
/* loaded from: classes.dex */
public abstract class AbstractC1094m<T> implements Comparable<AbstractC1094m<T>> {

    /* renamed from: f */
    private final C1108u.C1109a f3756f;

    /* renamed from: g */
    private final int f3757g;

    /* renamed from: h */
    private final String f3758h;

    /* renamed from: i */
    private final int f3759i;

    /* renamed from: j */
    private final Object f3760j;

    /* renamed from: k */
    private C1100o.InterfaceC1101a f3761k;

    /* renamed from: l */
    private Integer f3762l;

    /* renamed from: m */
    private C1098n f3763m;

    /* renamed from: n */
    private boolean f3764n;

    /* renamed from: o */
    private boolean f3765o;

    /* renamed from: p */
    private boolean f3766p;

    /* renamed from: q */
    private boolean f3767q;

    /* renamed from: r */
    private InterfaceC1104q f3768r;

    /* renamed from: s */
    private InterfaceC1078b.C1079a f3769s;

    /* renamed from: t */
    private InterfaceC1096b f3770t;

    /* renamed from: b.a.a.m$a */
    /* loaded from: classes.dex */
    class RunnableC1095a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f3771f;

        /* renamed from: g */
        final /* synthetic */ long f3772g;

        RunnableC1095a(String str, long j) {
            this.f3771f = str;
            this.f3772g = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1094m.this.f3756f.m4923a(this.f3771f, this.f3772g);
            AbstractC1094m.this.f3756f.m4922b(AbstractC1094m.this.toString());
        }
    }

    /* renamed from: b.a.a.m$b */
    /* loaded from: classes.dex */
    interface InterfaceC1096b {
        /* renamed from: a */
        void mo4946a(AbstractC1094m<?> abstractC1094m);

        /* renamed from: b */
        void mo4945b(AbstractC1094m<?> abstractC1094m, C1100o<?> c1100o);
    }

    /* renamed from: b.a.a.m$c */
    /* loaded from: classes.dex */
    public enum EnumC1097c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public AbstractC1094m(int i, String str, C1100o.InterfaceC1101a interfaceC1101a) {
        this.f3756f = C1108u.C1109a.f3796c ? new C1108u.C1109a() : null;
        this.f3760j = new Object();
        this.f3764n = true;
        this.f3765o = false;
        this.f3766p = false;
        this.f3767q = false;
        this.f3769s = null;
        this.f3757g = i;
        this.f3758h = str;
        this.f3761k = interfaceC1101a;
        m4962W(new C1084e());
        this.f3759i = m4953m(str);
    }

    /* renamed from: l */
    private byte[] m4954l(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: m */
    private static int m4953m(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: A */
    public int m4983A() {
        return this.f3757g;
    }

    /* renamed from: B */
    protected Map<String, String> m4982B() {
        return null;
    }

    /* renamed from: C */
    protected String m4981C() {
        return "UTF-8";
    }

    @Deprecated
    /* renamed from: D */
    public byte[] m4980D() {
        Map<String, String> m4978F = m4978F();
        if (m4978F == null || m4978F.size() <= 0) {
            return null;
        }
        return m4954l(m4978F, m4977G());
    }

    @Deprecated
    /* renamed from: E */
    public String m4979E() {
        return m4950w();
    }

    @Deprecated
    /* renamed from: F */
    protected Map<String, String> m4978F() {
        return m4982B();
    }

    @Deprecated
    /* renamed from: G */
    protected String m4977G() {
        return m4981C();
    }

    /* renamed from: H */
    public EnumC1097c m4976H() {
        return EnumC1097c.NORMAL;
    }

    /* renamed from: I */
    public InterfaceC1104q m4975I() {
        return this.f3768r;
    }

    /* renamed from: J */
    public final int m4974J() {
        return m4975I().mo4931b();
    }

    /* renamed from: K */
    public int m4973K() {
        return this.f3759i;
    }

    /* renamed from: L */
    public String m4972L() {
        return this.f3758h;
    }

    /* renamed from: M */
    public boolean m4971M() {
        boolean z;
        synchronized (this.f3760j) {
            z = this.f3766p;
        }
        return z;
    }

    /* renamed from: N */
    public boolean m4970N() {
        boolean z;
        synchronized (this.f3760j) {
            z = this.f3765o;
        }
        return z;
    }

    /* renamed from: O */
    public void m4969O() {
        synchronized (this.f3760j) {
            this.f3766p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m4968P() {
        InterfaceC1096b interfaceC1096b;
        synchronized (this.f3760j) {
            interfaceC1096b = this.f3770t;
        }
        if (interfaceC1096b != null) {
            interfaceC1096b.mo4946a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m4967Q(C1100o<?> c1100o) {
        InterfaceC1096b interfaceC1096b;
        synchronized (this.f3760j) {
            interfaceC1096b = this.f3770t;
        }
        if (interfaceC1096b != null) {
            interfaceC1096b.mo4945b(this, c1100o);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public C1107t m4966R(C1107t c1107t) {
        return c1107t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public abstract C1100o<T> mo4855S(C1092k c1092k);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public AbstractC1094m<?> m4965T(InterfaceC1078b.C1079a c1079a) {
        this.f3769s = c1079a;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m4964U(InterfaceC1096b interfaceC1096b) {
        synchronized (this.f3760j) {
            this.f3770t = interfaceC1096b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    public AbstractC1094m<?> m4963V(C1098n c1098n) {
        this.f3763m = c1098n;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public AbstractC1094m<?> m4962W(InterfaceC1104q interfaceC1104q) {
        this.f3768r = interfaceC1104q;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: X */
    public final AbstractC1094m<?> m4961X(int i) {
        this.f3762l = Integer.valueOf(i);
        return this;
    }

    /* renamed from: Y */
    public final boolean m4960Y() {
        return this.f3764n;
    }

    /* renamed from: Z */
    public final boolean m4959Z() {
        return this.f3767q;
    }

    /* renamed from: e */
    public void m4957e(String str) {
        if (C1108u.C1109a.f3796c) {
            this.f3756f.m4923a(str, Thread.currentThread().getId());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(AbstractC1094m<T> abstractC1094m) {
        m4976H();
        abstractC1094m.m4976H();
        return this.f3762l.intValue() - abstractC1094m.f3762l.intValue();
    }

    /* renamed from: g */
    public void m4955g(C1107t c1107t) {
        C1100o.InterfaceC1101a interfaceC1101a;
        synchronized (this.f3760j) {
            interfaceC1101a = this.f3761k;
        }
        if (interfaceC1101a != null) {
            interfaceC1101a.mo4136a(c1107t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo4853i(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m4952s(String str) {
        C1098n c1098n = this.f3763m;
        if (c1098n != null) {
            c1098n.m4943b(this);
        }
        if (C1108u.C1109a.f3796c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1095a(str, id));
                return;
            }
            this.f3756f.m4923a(str, id);
            this.f3756f.m4922b(toString());
        }
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(m4973K());
        StringBuilder sb = new StringBuilder();
        sb.append(m4970N() ? "[X] " : "[ ] ");
        sb.append(m4972L());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(m4976H());
        sb.append(" ");
        sb.append(this.f3762l);
        return sb.toString();
    }

    /* renamed from: u */
    public byte[] m4951u() {
        Map<String, String> m4982B = m4982B();
        if (m4982B == null || m4982B.size() <= 0) {
            return null;
        }
        return m4954l(m4982B, m4981C());
    }

    /* renamed from: w */
    public String m4950w() {
        return "application/x-www-form-urlencoded; charset=" + m4981C();
    }

    /* renamed from: x */
    public InterfaceC1078b.C1079a m4949x() {
        return this.f3769s;
    }

    /* renamed from: y */
    public String m4948y() {
        String m4972L = m4972L();
        int m4983A = m4983A();
        if (m4983A == 0 || m4983A == -1) {
            return m4972L;
        }
        return Integer.toString(m4983A) + '-' + m4972L;
    }

    /* renamed from: z */
    public Map<String, String> m4947z() {
        return Collections.emptyMap();
    }
}
