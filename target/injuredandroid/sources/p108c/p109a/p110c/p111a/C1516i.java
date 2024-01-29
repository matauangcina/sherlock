package p108c.p109a.p110c.p111a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.InterfaceC1507b;
/* renamed from: c.a.c.a.i */
/* loaded from: classes.dex */
public class C1516i {

    /* renamed from: a */
    private final InterfaceC1507b f4549a;

    /* renamed from: b */
    private final String f4550b;

    /* renamed from: c */
    private final InterfaceC1522j f4551c;

    /* renamed from: c.a.c.a.i$a */
    /* loaded from: classes.dex */
    private final class C1517a implements InterfaceC1507b.InterfaceC1508a {

        /* renamed from: a */
        private final InterfaceC1520c f4552a;

        /* renamed from: c.a.c.a.i$a$a */
        /* loaded from: classes.dex */
        class C1518a implements InterfaceC1521d {

            /* renamed from: a */
            final /* synthetic */ InterfaceC1507b.InterfaceC1509b f4554a;

            C1518a(InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
                this.f4554a = interfaceC1509b;
            }

            @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d
            /* renamed from: a */
            public void mo421a() {
                this.f4554a.mo546a(null);
            }

            @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d
            /* renamed from: b */
            public void mo420b(String str, String str2, Object obj) {
                this.f4554a.mo546a(C1516i.this.f4551c.mo4011c(str, str2, obj));
            }

            @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1521d
            /* renamed from: c */
            public void mo419c(Object obj) {
                this.f4554a.mo546a(C1516i.this.f4551c.mo4013a(obj));
            }
        }

        C1517a(InterfaceC1520c interfaceC1520c) {
            this.f4552a = interfaceC1520c;
        }

        /* renamed from: b */
        private String m4033b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b.InterfaceC1508a
        /* renamed from: a */
        public void mo551a(ByteBuffer byteBuffer, InterfaceC1507b.InterfaceC1509b interfaceC1509b) {
            try {
                this.f4552a.mo160b(C1516i.this.f4551c.mo4010d(byteBuffer), new C1518a(interfaceC1509b));
            } catch (RuntimeException e) {
                C1499b.m4051c("MethodChannel#" + C1516i.this.f4550b, "Failed to handle method call", e);
                interfaceC1509b.mo546a(C1516i.this.f4551c.mo4012b("error", e.getMessage(), null, m4033b(e)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.a.c.a.i$b */
    /* loaded from: classes.dex */
    public final class C1519b implements InterfaceC1507b.InterfaceC1509b {

        /* renamed from: a */
        private final InterfaceC1521d f4556a;

        C1519b(InterfaceC1521d interfaceC1521d) {
            this.f4556a = interfaceC1521d;
        }

        @Override // p108c.p109a.p110c.p111a.InterfaceC1507b.InterfaceC1509b
        /* renamed from: a */
        public void mo546a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f4556a.mo421a();
                } else {
                    try {
                        this.f4556a.mo419c(C1516i.this.f4551c.mo4009e(byteBuffer));
                    } catch (C1510c e) {
                        this.f4556a.mo420b(e.f4543f, e.getMessage(), e.f4544g);
                    }
                }
            } catch (RuntimeException e2) {
                C1499b.m4051c("MethodChannel#" + C1516i.this.f4550b, "Failed to handle method call result", e2);
            }
        }
    }

    /* renamed from: c.a.c.a.i$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1520c {
        /* renamed from: b */
        void mo160b(C1515h c1515h, InterfaceC1521d interfaceC1521d);
    }

    /* renamed from: c.a.c.a.i$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1521d {
        /* renamed from: a */
        void mo421a();

        /* renamed from: b */
        void mo420b(String str, String str2, Object obj);

        /* renamed from: c */
        void mo419c(Object obj);
    }

    public C1516i(InterfaceC1507b interfaceC1507b, String str) {
        this(interfaceC1507b, str, C1531r.f4561b);
    }

    public C1516i(InterfaceC1507b interfaceC1507b, String str, InterfaceC1522j interfaceC1522j) {
        this.f4549a = interfaceC1507b;
        this.f4550b = str;
        this.f4551c = interfaceC1522j;
    }

    /* renamed from: c */
    public void m4036c(String str, Object obj) {
        m4035d(str, obj, null);
    }

    /* renamed from: d */
    public void m4035d(String str, Object obj, InterfaceC1521d interfaceC1521d) {
        this.f4549a.mo549a(this.f4550b, this.f4551c.mo4008f(new C1515h(str, obj)), interfaceC1521d == null ? null : new C1519b(interfaceC1521d));
    }

    /* renamed from: e */
    public void m4034e(InterfaceC1520c interfaceC1520c) {
        this.f4549a.mo548b(this.f4550b, interfaceC1520c == null ? null : new C1517a(interfaceC1520c));
    }
}
