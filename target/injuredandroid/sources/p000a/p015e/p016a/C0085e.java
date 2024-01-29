package p000a.p015e.p016a;

import java.util.Arrays;
import java.util.HashMap;
import p000a.p015e.p016a.C0090i;
import p000a.p015e.p016a.p017j.C0096e;
import p000a.p015e.p016a.p017j.C0101f;
/* renamed from: a.e.a.e */
/* loaded from: classes.dex */
public class C0085e {

    /* renamed from: p */
    private static int f276p = 1000;

    /* renamed from: q */
    public static C0087f f277q;

    /* renamed from: c */
    private InterfaceC0086a f280c;

    /* renamed from: f */
    C0082b[] f283f;

    /* renamed from: l */
    final C0083c f289l;

    /* renamed from: o */
    private final InterfaceC0086a f292o;

    /* renamed from: a */
    int f278a = 0;

    /* renamed from: b */
    private HashMap<String, C0090i> f279b = null;

    /* renamed from: d */
    private int f281d = 32;

    /* renamed from: e */
    private int f282e = 32;

    /* renamed from: g */
    public boolean f284g = false;

    /* renamed from: h */
    private boolean[] f285h = new boolean[32];

    /* renamed from: i */
    int f286i = 1;

    /* renamed from: j */
    int f287j = 0;

    /* renamed from: k */
    private int f288k = 32;

    /* renamed from: m */
    private C0090i[] f290m = new C0090i[f276p];

    /* renamed from: n */
    private int f291n = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0086a {
        /* renamed from: a */
        void mo9248a(InterfaceC0086a interfaceC0086a);

        /* renamed from: b */
        void mo9247b(C0090i c0090i);

        /* renamed from: c */
        C0090i mo9246c(C0085e c0085e, boolean[] zArr);

        void clear();

        C0090i getKey();
    }

    public C0085e() {
        this.f283f = null;
        this.f283f = new C0082b[32];
        m9277D();
        C0083c c0083c = new C0083c();
        this.f289l = c0083c;
        this.f280c = new C0084d(c0083c);
        this.f292o = new C0082b(this.f289l);
    }

    /* renamed from: C */
    private final int m9278C(InterfaceC0086a interfaceC0086a, boolean z) {
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f301h++;
        }
        for (int i = 0; i < this.f286i; i++) {
            this.f285h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0087f c0087f2 = f277q;
            if (c0087f2 != null) {
                c0087f2.f302i++;
            }
            i2++;
            if (i2 >= this.f286i * 2) {
                return i2;
            }
            if (interfaceC0086a.getKey() != null) {
                this.f285h[interfaceC0086a.getKey().f324b] = true;
            }
            C0090i mo9246c = interfaceC0086a.mo9246c(this, this.f285h);
            if (mo9246c != null) {
                boolean[] zArr = this.f285h;
                int i3 = mo9246c.f324b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (mo9246c != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f287j; i5++) {
                    C0082b c0082b = this.f283f[i5];
                    if (c0082b.f268a.f329g != C0090i.EnumC0091a.UNRESTRICTED && !c0082b.f272e && c0082b.m9286s(mo9246c)) {
                        float m9311f = c0082b.f271d.m9311f(mo9246c);
                        if (m9311f < 0.0f) {
                            float f2 = (-c0082b.f269b) / m9311f;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0082b c0082b2 = this.f283f[i4];
                    c0082b2.f268a.f325c = -1;
                    C0087f c0087f3 = f277q;
                    if (c0087f3 != null) {
                        c0087f3.f303j++;
                    }
                    c0082b2.m9283v(mo9246c);
                    C0090i c0090i = c0082b2.f268a;
                    c0090i.f325c = i4;
                    c0090i.m9237f(c0082b2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: D */
    private void m9277D() {
        int i = 0;
        while (true) {
            C0082b[] c0082bArr = this.f283f;
            if (i >= c0082bArr.length) {
                return;
            }
            C0082b c0082b = c0082bArr[i];
            if (c0082b != null) {
                this.f289l.f273a.mo9245a(c0082b);
            }
            this.f283f[i] = null;
            i++;
        }
    }

    /* renamed from: F */
    private final void m9275F(C0082b c0082b) {
        if (this.f287j > 0) {
            c0082b.f271d.m9302o(c0082b, this.f283f);
            if (c0082b.f271d.f257a == 0) {
                c0082b.f272e = true;
            }
        }
    }

    /* renamed from: a */
    private C0090i m9274a(C0090i.EnumC0091a enumC0091a, String str) {
        C0090i mo9244b = this.f289l.f274b.mo9244b();
        if (mo9244b == null) {
            mo9244b = new C0090i(enumC0091a, str);
        } else {
            mo9244b.m9239d();
        }
        mo9244b.m9238e(enumC0091a, str);
        int i = this.f291n;
        int i2 = f276p;
        if (i >= i2) {
            int i3 = i2 * 2;
            f276p = i3;
            this.f290m = (C0090i[]) Arrays.copyOf(this.f290m, i3);
        }
        C0090i[] c0090iArr = this.f290m;
        int i4 = this.f291n;
        this.f291n = i4 + 1;
        c0090iArr[i4] = mo9244b;
        return mo9244b;
    }

    /* renamed from: g */
    private void m9268g(C0082b c0082b) {
        c0082b.m9301d(this, 0);
    }

    /* renamed from: m */
    private final void m9262m(C0082b c0082b) {
        C0082b[] c0082bArr = this.f283f;
        int i = this.f287j;
        if (c0082bArr[i] != null) {
            this.f289l.f273a.mo9245a(c0082bArr[i]);
        }
        C0082b[] c0082bArr2 = this.f283f;
        int i2 = this.f287j;
        c0082bArr2[i2] = c0082b;
        C0090i c0090i = c0082b.f268a;
        c0090i.f325c = i2;
        this.f287j = i2 + 1;
        c0090i.m9237f(c0082b);
    }

    /* renamed from: o */
    private void m9260o() {
        for (int i = 0; i < this.f287j; i++) {
            C0082b c0082b = this.f283f[i];
            c0082b.f268a.f327e = c0082b.f269b;
        }
    }

    /* renamed from: t */
    public static C0082b m9255t(C0085e c0085e, C0090i c0090i, C0090i c0090i2, C0090i c0090i3, float f, boolean z) {
        C0082b m9256s = c0085e.m9256s();
        if (z) {
            c0085e.m9268g(m9256s);
        }
        m9256s.m9296i(c0090i, c0090i2, c0090i3, f);
        return m9256s;
    }

    /* renamed from: v */
    private int m9253v(InterfaceC0086a interfaceC0086a) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f287j) {
                z = false;
                break;
            }
            C0082b[] c0082bArr = this.f283f;
            if (c0082bArr[i].f268a.f329g != C0090i.EnumC0091a.UNRESTRICTED && c0082bArr[i].f269b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                C0087f c0087f = f277q;
                if (c0087f != null) {
                    c0087f.f304k++;
                }
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.f287j) {
                    C0082b c0082b = this.f283f[i3];
                    if (c0082b.f268a.f329g != C0090i.EnumC0091a.UNRESTRICTED && !c0082b.f272e && c0082b.f269b < f) {
                        int i7 = 1;
                        while (i7 < this.f286i) {
                            C0090i c0090i = this.f289l.f275c[i7];
                            float m9311f = c0082b.f271d.m9311f(c0090i);
                            if (m9311f > f) {
                                for (int i8 = 0; i8 < 7; i8++) {
                                    float f3 = c0090i.f328f[i8] / m9311f;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i5 = i7;
                                        i6 = i8;
                                        f2 = f3;
                                        i4 = i3;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    C0082b c0082b2 = this.f283f[i4];
                    c0082b2.f268a.f325c = -1;
                    C0087f c0087f2 = f277q;
                    if (c0087f2 != null) {
                        c0087f2.f303j++;
                    }
                    c0082b2.m9283v(this.f289l.f275c[i5]);
                    C0090i c0090i2 = c0082b2.f268a;
                    c0090i2.f325c = i4;
                    c0090i2.m9237f(c0082b2);
                } else {
                    z2 = true;
                }
                if (i2 > this.f286i / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: x */
    public static C0087f m9251x() {
        return f277q;
    }

    /* renamed from: z */
    private void m9249z() {
        int i = this.f281d * 2;
        this.f281d = i;
        this.f283f = (C0082b[]) Arrays.copyOf(this.f283f, i);
        C0083c c0083c = this.f289l;
        c0083c.f275c = (C0090i[]) Arrays.copyOf(c0083c.f275c, this.f281d);
        int i2 = this.f281d;
        this.f285h = new boolean[i2];
        this.f282e = i2;
        this.f288k = i2;
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f297d++;
            c0087f.f308o = Math.max(c0087f.f308o, i2);
            C0087f c0087f2 = f277q;
            c0087f2.f293A = c0087f2.f308o;
        }
    }

    /* renamed from: A */
    public void m9280A() {
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f298e++;
        }
        if (this.f284g) {
            C0087f c0087f2 = f277q;
            if (c0087f2 != null) {
                c0087f2.f310q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f287j) {
                    z = true;
                    break;
                } else if (!this.f283f[i].f272e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                C0087f c0087f3 = f277q;
                if (c0087f3 != null) {
                    c0087f3.f309p++;
                }
                m9260o();
                return;
            }
        }
        m9279B(this.f280c);
    }

    /* renamed from: B */
    void m9279B(InterfaceC0086a interfaceC0086a) {
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f312s++;
            c0087f.f313t = Math.max(c0087f.f313t, this.f286i);
            C0087f c0087f2 = f277q;
            c0087f2.f314u = Math.max(c0087f2.f314u, this.f287j);
        }
        m9275F((C0082b) interfaceC0086a);
        m9253v(interfaceC0086a);
        m9278C(interfaceC0086a, false);
        m9260o();
    }

    /* renamed from: E */
    public void m9276E() {
        C0083c c0083c;
        int i = 0;
        while (true) {
            c0083c = this.f289l;
            C0090i[] c0090iArr = c0083c.f275c;
            if (i >= c0090iArr.length) {
                break;
            }
            C0090i c0090i = c0090iArr[i];
            if (c0090i != null) {
                c0090i.m9239d();
            }
            i++;
        }
        c0083c.f274b.mo9243c(this.f290m, this.f291n);
        this.f291n = 0;
        Arrays.fill(this.f289l.f275c, (Object) null);
        HashMap<String, C0090i> hashMap = this.f279b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f278a = 0;
        this.f280c.clear();
        this.f286i = 1;
        for (int i2 = 0; i2 < this.f287j; i2++) {
            this.f283f[i2].f270c = false;
        }
        m9277D();
        this.f287j = 0;
    }

    /* renamed from: b */
    public void m9273b(C0101f c0101f, C0101f c0101f2, float f, int i) {
        C0090i m9257r = m9257r(c0101f.mo9092h(C0096e.EnumC0100d.LEFT));
        C0090i m9257r2 = m9257r(c0101f.mo9092h(C0096e.EnumC0100d.TOP));
        C0090i m9257r3 = m9257r(c0101f.mo9092h(C0096e.EnumC0100d.RIGHT));
        C0090i m9257r4 = m9257r(c0101f.mo9092h(C0096e.EnumC0100d.BOTTOM));
        C0090i m9257r5 = m9257r(c0101f2.mo9092h(C0096e.EnumC0100d.LEFT));
        C0090i m9257r6 = m9257r(c0101f2.mo9092h(C0096e.EnumC0100d.TOP));
        C0090i m9257r7 = m9257r(c0101f2.mo9092h(C0096e.EnumC0100d.RIGHT));
        C0090i m9257r8 = m9257r(c0101f2.mo9092h(C0096e.EnumC0100d.BOTTOM));
        C0082b m9256s = m9256s();
        double d = f;
        double d2 = i;
        m9256s.m9289p(m9257r2, m9257r4, m9257r6, m9257r8, (float) (Math.sin(d) * d2));
        m9271d(m9256s);
        C0082b m9256s2 = m9256s();
        m9256s2.m9289p(m9257r, m9257r3, m9257r5, m9257r7, (float) (Math.cos(d) * d2));
        m9271d(m9256s2);
    }

    /* renamed from: c */
    public void m9272c(C0090i c0090i, C0090i c0090i2, int i, float f, C0090i c0090i3, C0090i c0090i4, int i2, int i3) {
        C0082b m9256s = m9256s();
        m9256s.m9298g(c0090i, c0090i2, i, f, c0090i3, c0090i4, i2);
        if (i3 != 6) {
            m9256s.m9301d(this, i3);
        }
        m9271d(m9256s);
    }

    /* renamed from: d */
    public void m9271d(C0082b c0082b) {
        C0090i m9284u;
        if (c0082b == null) {
            return;
        }
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f299f++;
            if (c0082b.f272e) {
                c0087f.f300g++;
            }
        }
        boolean z = true;
        if (this.f287j + 1 >= this.f288k || this.f286i + 1 >= this.f282e) {
            m9249z();
        }
        boolean z2 = false;
        if (!c0082b.f272e) {
            m9275F(c0082b);
            if (c0082b.m9285t()) {
                return;
            }
            c0082b.m9288q();
            if (c0082b.m9299f(this)) {
                C0090i m9258q = m9258q();
                c0082b.f268a = m9258q;
                m9262m(c0082b);
                this.f292o.mo9248a(c0082b);
                m9278C(this.f292o, true);
                if (m9258q.f325c == -1) {
                    if (c0082b.f268a == m9258q && (m9284u = c0082b.m9284u(m9258q)) != null) {
                        C0087f c0087f2 = f277q;
                        if (c0087f2 != null) {
                            c0087f2.f303j++;
                        }
                        c0082b.m9283v(m9284u);
                    }
                    if (!c0082b.f272e) {
                        c0082b.f268a.m9237f(c0082b);
                    }
                    this.f287j--;
                }
            } else {
                z = false;
            }
            if (!c0082b.m9287r()) {
                return;
            }
            z2 = z;
        }
        if (z2) {
            return;
        }
        m9262m(c0082b);
    }

    /* renamed from: e */
    public C0082b m9270e(C0090i c0090i, C0090i c0090i2, int i, int i2) {
        C0082b m9256s = m9256s();
        m9256s.m9292m(c0090i, c0090i2, i);
        if (i2 != 6) {
            m9256s.m9301d(this, i2);
        }
        m9271d(m9256s);
        return m9256s;
    }

    /* renamed from: f */
    public void m9269f(C0090i c0090i, int i) {
        C0082b m9256s;
        int i2 = c0090i.f325c;
        if (i2 != -1) {
            C0082b c0082b = this.f283f[i2];
            if (!c0082b.f272e) {
                if (c0082b.f271d.f257a == 0) {
                    c0082b.f272e = true;
                } else {
                    m9256s = m9256s();
                    m9256s.m9293l(c0090i, i);
                }
            }
            c0082b.f269b = i;
            return;
        }
        m9256s = m9256s();
        m9256s.m9297h(c0090i, i);
        m9271d(m9256s);
    }

    /* renamed from: h */
    public void m9267h(C0090i c0090i, C0090i c0090i2, boolean z) {
        C0082b m9256s = m9256s();
        C0090i m9254u = m9254u();
        m9254u.f326d = 0;
        m9256s.m9291n(c0090i, c0090i2, m9254u, 0);
        if (z) {
            m9261n(m9256s, (int) (m9256s.f271d.m9311f(m9254u) * (-1.0f)), 1);
        }
        m9271d(m9256s);
    }

    /* renamed from: i */
    public void m9266i(C0090i c0090i, C0090i c0090i2, int i, int i2) {
        C0082b m9256s = m9256s();
        C0090i m9254u = m9254u();
        m9254u.f326d = 0;
        m9256s.m9291n(c0090i, c0090i2, m9254u, i);
        if (i2 != 6) {
            m9261n(m9256s, (int) (m9256s.f271d.m9311f(m9254u) * (-1.0f)), i2);
        }
        m9271d(m9256s);
    }

    /* renamed from: j */
    public void m9265j(C0090i c0090i, C0090i c0090i2, boolean z) {
        C0082b m9256s = m9256s();
        C0090i m9254u = m9254u();
        m9254u.f326d = 0;
        m9256s.m9290o(c0090i, c0090i2, m9254u, 0);
        if (z) {
            m9261n(m9256s, (int) (m9256s.f271d.m9311f(m9254u) * (-1.0f)), 1);
        }
        m9271d(m9256s);
    }

    /* renamed from: k */
    public void m9264k(C0090i c0090i, C0090i c0090i2, int i, int i2) {
        C0082b m9256s = m9256s();
        C0090i m9254u = m9254u();
        m9254u.f326d = 0;
        m9256s.m9290o(c0090i, c0090i2, m9254u, i);
        if (i2 != 6) {
            m9261n(m9256s, (int) (m9256s.f271d.m9311f(m9254u) * (-1.0f)), i2);
        }
        m9271d(m9256s);
    }

    /* renamed from: l */
    public void m9263l(C0090i c0090i, C0090i c0090i2, C0090i c0090i3, C0090i c0090i4, float f, int i) {
        C0082b m9256s = m9256s();
        m9256s.m9295j(c0090i, c0090i2, c0090i3, c0090i4, f);
        if (i != 6) {
            m9256s.m9301d(this, i);
        }
        m9271d(m9256s);
    }

    /* renamed from: n */
    void m9261n(C0082b c0082b, int i, int i2) {
        c0082b.m9300e(m9259p(i2, null), i);
    }

    /* renamed from: p */
    public C0090i m9259p(int i, String str) {
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f305l++;
        }
        if (this.f286i + 1 >= this.f282e) {
            m9249z();
        }
        C0090i m9274a = m9274a(C0090i.EnumC0091a.ERROR, str);
        int i2 = this.f278a + 1;
        this.f278a = i2;
        this.f286i++;
        m9274a.f324b = i2;
        m9274a.f326d = i;
        this.f289l.f275c[i2] = m9274a;
        this.f280c.mo9247b(m9274a);
        return m9274a;
    }

    /* renamed from: q */
    public C0090i m9258q() {
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f307n++;
        }
        if (this.f286i + 1 >= this.f282e) {
            m9249z();
        }
        C0090i m9274a = m9274a(C0090i.EnumC0091a.SLACK, null);
        int i = this.f278a + 1;
        this.f278a = i;
        this.f286i++;
        m9274a.f324b = i;
        this.f289l.f275c[i] = m9274a;
        return m9274a;
    }

    /* renamed from: r */
    public C0090i m9257r(Object obj) {
        C0090i c0090i = null;
        if (obj == null) {
            return null;
        }
        if (this.f286i + 1 >= this.f282e) {
            m9249z();
        }
        if (obj instanceof C0096e) {
            C0096e c0096e = (C0096e) obj;
            c0090i = c0096e.m9211g();
            if (c0090i == null) {
                c0096e.m9204n(this.f289l);
                c0090i = c0096e.m9211g();
            }
            int i = c0090i.f324b;
            if (i == -1 || i > this.f278a || this.f289l.f275c[i] == null) {
                if (c0090i.f324b != -1) {
                    c0090i.m9239d();
                }
                int i2 = this.f278a + 1;
                this.f278a = i2;
                this.f286i++;
                c0090i.f324b = i2;
                c0090i.f329g = C0090i.EnumC0091a.UNRESTRICTED;
                this.f289l.f275c[i2] = c0090i;
            }
        }
        return c0090i;
    }

    /* renamed from: s */
    public C0082b m9256s() {
        C0082b mo9244b = this.f289l.f273a.mo9244b();
        if (mo9244b == null) {
            mo9244b = new C0082b(this.f289l);
        } else {
            mo9244b.m9282w();
        }
        C0090i.m9241b();
        return mo9244b;
    }

    /* renamed from: u */
    public C0090i m9254u() {
        C0087f c0087f = f277q;
        if (c0087f != null) {
            c0087f.f306m++;
        }
        if (this.f286i + 1 >= this.f282e) {
            m9249z();
        }
        C0090i m9274a = m9274a(C0090i.EnumC0091a.SLACK, null);
        int i = this.f278a + 1;
        this.f278a = i;
        this.f286i++;
        m9274a.f324b = i;
        this.f289l.f275c[i] = m9274a;
        return m9274a;
    }

    /* renamed from: w */
    public C0083c m9252w() {
        return this.f289l;
    }

    /* renamed from: y */
    public int m9250y(Object obj) {
        C0090i m9211g = ((C0096e) obj).m9211g();
        if (m9211g != null) {
            return (int) (m9211g.f327e + 0.5f);
        }
        return 0;
    }
}
