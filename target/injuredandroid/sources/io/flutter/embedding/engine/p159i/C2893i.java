package io.flutter.embedding.engine.p159i;

import io.flutter.embedding.engine.p149e.C2832a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p108c.p109a.C1499b;
import p108c.p109a.p110c.p111a.C1515h;
import p108c.p109a.p110c.p111a.C1516i;
import p108c.p109a.p110c.p111a.C1531r;
/* renamed from: io.flutter.embedding.engine.i.i */
/* loaded from: classes.dex */
public class C2893i {

    /* renamed from: a */
    private final C1516i f7160a;

    /* renamed from: b */
    private InterfaceC2899e f7161b;

    /* renamed from: c */
    private final C1516i.InterfaceC1520c f7162c = new C2894a();

    /* renamed from: io.flutter.embedding.engine.i.i$a */
    /* loaded from: classes.dex */
    class C2894a implements C1516i.InterfaceC1520c {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.flutter.embedding.engine.i.i$a$a */
        /* loaded from: classes.dex */
        public class RunnableC2895a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1516i.InterfaceC1521d f7164f;

            RunnableC2895a(C2894a c2894a, C1516i.InterfaceC1521d interfaceC1521d) {
                this.f7164f = interfaceC1521d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f7164f.mo419c(null);
            }
        }

        C2894a() {
        }

        /* renamed from: a */
        private void m437a(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            try {
                C2893i.this.f7161b.mo177e(((Integer) c1515h.m4039b()).intValue());
                interfaceC1521d.mo419c(null);
            } catch (IllegalStateException e) {
                interfaceC1521d.mo420b("error", C2893i.m440c(e), null);
            }
        }

        /* renamed from: c */
        private void m436c(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            Map map = (Map) c1515h.m4039b();
            boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            C2896b c2896b = new C2896b(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), z ? 0.0d : ((Double) map.get("width")).doubleValue(), z ? 0.0d : ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null);
            try {
                if (z) {
                    C2893i.this.f7161b.mo175g(c2896b);
                    interfaceC1521d.mo419c(null);
                } else {
                    interfaceC1521d.mo419c(Long.valueOf(C2893i.this.f7161b.mo178d(c2896b)));
                }
            } catch (IllegalStateException e) {
                interfaceC1521d.mo420b("error", C2893i.m440c(e), null);
            }
        }

        /* renamed from: d */
        private void m435d(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            Map map = (Map) c1515h.m4039b();
            int intValue = ((Integer) map.get("id")).intValue();
            try {
                if (map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue()) {
                    C2893i.this.f7161b.mo180b(intValue);
                } else {
                    C2893i.this.f7161b.mo176f(intValue);
                }
                interfaceC1521d.mo419c(null);
            } catch (IllegalStateException e) {
                interfaceC1521d.mo420b("error", C2893i.m440c(e), null);
            }
        }

        /* renamed from: e */
        private void m434e(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            Map map = (Map) c1515h.m4039b();
            try {
                C2893i.this.f7161b.mo181a(new C2897c(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new RunnableC2895a(this, interfaceC1521d));
            } catch (IllegalStateException e) {
                interfaceC1521d.mo420b("error", C2893i.m440c(e), null);
            }
        }

        /* renamed from: f */
        private void m433f(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            Map map = (Map) c1515h.m4039b();
            try {
                C2893i.this.f7161b.mo179c(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                interfaceC1521d.mo419c(null);
            } catch (IllegalStateException e) {
                interfaceC1521d.mo420b("error", C2893i.m440c(e), null);
            }
        }

        /* renamed from: g */
        private void m432g(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            C1516i.InterfaceC1521d interfaceC1521d2;
            List list = (List) c1515h.m4039b();
            try {
                C2893i.this.f7161b.mo174h(new C2898d(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                interfaceC1521d2 = interfaceC1521d;
            } catch (IllegalStateException e) {
                e = e;
                interfaceC1521d2 = interfaceC1521d;
            }
            try {
                interfaceC1521d2.mo419c(null);
            } catch (IllegalStateException e2) {
                e = e2;
                interfaceC1521d2.mo420b("error", C2893i.m440c(e), null);
            }
        }

        @Override // p108c.p109a.p110c.p111a.C1516i.InterfaceC1520c
        /* renamed from: b */
        public void mo160b(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
            if (C2893i.this.f7161b == null) {
                return;
            }
            C1499b.m4050d("PlatformViewsChannel", "Received '" + c1515h.f4547a + "' message.");
            String str = c1515h.f4547a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c = 2;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c = 5;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m436c(c1515h, interfaceC1521d);
            } else if (c == 1) {
                m435d(c1515h, interfaceC1521d);
            } else if (c == 2) {
                m434e(c1515h, interfaceC1521d);
            } else if (c == 3) {
                m432g(c1515h, interfaceC1521d);
            } else if (c == 4) {
                m433f(c1515h, interfaceC1521d);
            } else if (c != 5) {
                interfaceC1521d.mo421a();
            } else {
                m437a(c1515h, interfaceC1521d);
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.i$b */
    /* loaded from: classes.dex */
    public static class C2896b {

        /* renamed from: a */
        public final int f7165a;

        /* renamed from: b */
        public final String f7166b;

        /* renamed from: c */
        public final double f7167c;

        /* renamed from: d */
        public final double f7168d;

        /* renamed from: e */
        public final int f7169e;

        /* renamed from: f */
        public final ByteBuffer f7170f;

        public C2896b(int i, String str, double d, double d2, int i2, ByteBuffer byteBuffer) {
            this.f7165a = i;
            this.f7166b = str;
            this.f7167c = d;
            this.f7168d = d2;
            this.f7169e = i2;
            this.f7170f = byteBuffer;
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.i$c */
    /* loaded from: classes.dex */
    public static class C2897c {

        /* renamed from: a */
        public final int f7171a;

        /* renamed from: b */
        public final double f7172b;

        /* renamed from: c */
        public final double f7173c;

        public C2897c(int i, double d, double d2) {
            this.f7171a = i;
            this.f7172b = d;
            this.f7173c = d2;
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.i$d */
    /* loaded from: classes.dex */
    public static class C2898d {

        /* renamed from: a */
        public final int f7174a;

        /* renamed from: b */
        public final Number f7175b;

        /* renamed from: c */
        public final Number f7176c;

        /* renamed from: d */
        public final int f7177d;

        /* renamed from: e */
        public final int f7178e;

        /* renamed from: f */
        public final Object f7179f;

        /* renamed from: g */
        public final Object f7180g;

        /* renamed from: h */
        public final int f7181h;

        /* renamed from: i */
        public final int f7182i;

        /* renamed from: j */
        public final float f7183j;

        /* renamed from: k */
        public final float f7184k;

        /* renamed from: l */
        public final int f7185l;

        /* renamed from: m */
        public final int f7186m;

        /* renamed from: n */
        public final int f7187n;

        /* renamed from: o */
        public final int f7188o;

        /* renamed from: p */
        public final long f7189p;

        public C2898d(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f7174a = i;
            this.f7175b = number;
            this.f7176c = number2;
            this.f7177d = i2;
            this.f7178e = i3;
            this.f7179f = obj;
            this.f7180g = obj2;
            this.f7181h = i4;
            this.f7182i = i5;
            this.f7183j = f;
            this.f7184k = f2;
            this.f7185l = i6;
            this.f7186m = i7;
            this.f7187n = i8;
            this.f7188o = i9;
            this.f7189p = j;
        }
    }

    /* renamed from: io.flutter.embedding.engine.i.i$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2899e {
        /* renamed from: a */
        void mo181a(C2897c c2897c, Runnable runnable);

        /* renamed from: b */
        void mo180b(int i);

        /* renamed from: c */
        void mo179c(int i, int i2);

        /* renamed from: d */
        long mo178d(C2896b c2896b);

        /* renamed from: e */
        void mo177e(int i);

        /* renamed from: f */
        void mo176f(int i);

        /* renamed from: g */
        void mo175g(C2896b c2896b);

        /* renamed from: h */
        void mo174h(C2898d c2898d);
    }

    public C2893i(C2832a c2832a) {
        C1516i c1516i = new C1516i(c2832a, "flutter/platform_views", C1531r.f4561b);
        this.f7160a = c1516i;
        c1516i.m4034e(this.f7162c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static String m440c(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: d */
    public void m439d(int i) {
        C1516i c1516i = this.f7160a;
        if (c1516i == null) {
            return;
        }
        c1516i.m4036c("viewFocused", Integer.valueOf(i));
    }

    /* renamed from: e */
    public void m438e(InterfaceC2899e interfaceC2899e) {
        this.f7161b = interfaceC2899e;
    }
}
