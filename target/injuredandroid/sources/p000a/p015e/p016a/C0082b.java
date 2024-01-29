package p000a.p015e.p016a;

import p000a.p015e.p016a.C0085e;
import p000a.p015e.p016a.C0090i;
/* renamed from: a.e.a.b */
/* loaded from: classes.dex */
public class C0082b implements C0085e.InterfaceC0086a {

    /* renamed from: c */
    boolean f270c;

    /* renamed from: d */
    public final C0081a f271d;

    /* renamed from: a */
    C0090i f268a = null;

    /* renamed from: b */
    float f269b = 0.0f;

    /* renamed from: e */
    boolean f272e = false;

    public C0082b(C0083c c0083c) {
        this.f271d = new C0081a(this, c0083c);
    }

    @Override // p000a.p015e.p016a.C0085e.InterfaceC0086a
    /* renamed from: a */
    public void mo9248a(C0085e.InterfaceC0086a interfaceC0086a) {
        if (!(interfaceC0086a instanceof C0082b)) {
            return;
        }
        C0082b c0082b = (C0082b) interfaceC0086a;
        this.f268a = null;
        this.f271d.m9314c();
        int i = 0;
        while (true) {
            C0081a c0081a = c0082b.f271d;
            if (i >= c0081a.f257a) {
                return;
            }
            this.f271d.m9316a(c0081a.m9309h(i), c0082b.f271d.m9308i(i), true);
            i++;
        }
    }

    @Override // p000a.p015e.p016a.C0085e.InterfaceC0086a
    /* renamed from: b */
    public void mo9247b(C0090i c0090i) {
        int i = c0090i.f326d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f271d.m9305l(c0090i, f);
    }

    @Override // p000a.p015e.p016a.C0085e.InterfaceC0086a
    /* renamed from: c */
    public C0090i mo9246c(C0085e c0085e, boolean[] zArr) {
        return this.f271d.m9310g(zArr, null);
    }

    @Override // p000a.p015e.p016a.C0085e.InterfaceC0086a
    public void clear() {
        this.f271d.m9314c();
        this.f268a = null;
        this.f269b = 0.0f;
    }

    /* renamed from: d */
    public C0082b m9301d(C0085e c0085e, int i) {
        this.f271d.m9305l(c0085e.m9259p(i, "ep"), 1.0f);
        this.f271d.m9305l(c0085e.m9259p(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C0082b m9300e(C0090i c0090i, int i) {
        this.f271d.m9305l(c0090i, i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m9299f(C0085e c0085e) {
        boolean z;
        C0090i m9315b = this.f271d.m9315b(c0085e);
        if (m9315b == null) {
            z = true;
        } else {
            m9283v(m9315b);
            z = false;
        }
        if (this.f271d.f257a == 0) {
            this.f272e = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C0082b m9298g(C0090i c0090i, C0090i c0090i2, int i, float f, C0090i c0090i3, C0090i c0090i4, int i2) {
        float f2;
        if (c0090i2 == c0090i3) {
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i4, 1.0f);
            this.f271d.m9305l(c0090i2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i2, -1.0f);
            this.f271d.m9305l(c0090i3, -1.0f);
            this.f271d.m9305l(c0090i4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (-i) + i2;
                this.f269b = f2;
            }
        } else {
            if (f <= 0.0f) {
                this.f271d.m9305l(c0090i, -1.0f);
                this.f271d.m9305l(c0090i2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                this.f271d.m9305l(c0090i3, -1.0f);
                this.f271d.m9305l(c0090i4, 1.0f);
                f2 = i2;
            } else {
                float f3 = 1.0f - f;
                this.f271d.m9305l(c0090i, f3 * 1.0f);
                this.f271d.m9305l(c0090i2, f3 * (-1.0f));
                this.f271d.m9305l(c0090i3, (-1.0f) * f);
                this.f271d.m9305l(c0090i4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = ((-i) * f3) + (i2 * f);
                }
            }
            this.f269b = f2;
        }
        return this;
    }

    @Override // p000a.p015e.p016a.C0085e.InterfaceC0086a
    public C0090i getKey() {
        return this.f268a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C0082b m9297h(C0090i c0090i, int i) {
        this.f268a = c0090i;
        float f = i;
        c0090i.f327e = f;
        this.f269b = f;
        this.f272e = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C0082b m9296i(C0090i c0090i, C0090i c0090i2, C0090i c0090i3, float f) {
        this.f271d.m9305l(c0090i, -1.0f);
        this.f271d.m9305l(c0090i2, 1.0f - f);
        this.f271d.m9305l(c0090i3, f);
        return this;
    }

    /* renamed from: j */
    public C0082b m9295j(C0090i c0090i, C0090i c0090i2, C0090i c0090i3, C0090i c0090i4, float f) {
        this.f271d.m9305l(c0090i, -1.0f);
        this.f271d.m9305l(c0090i2, 1.0f);
        this.f271d.m9305l(c0090i3, f);
        this.f271d.m9305l(c0090i4, -f);
        return this;
    }

    /* renamed from: k */
    public C0082b m9294k(float f, float f2, float f3, C0090i c0090i, C0090i c0090i2, C0090i c0090i3, C0090i c0090i4) {
        this.f269b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i2, -1.0f);
            this.f271d.m9305l(c0090i4, 1.0f);
            this.f271d.m9305l(c0090i3, -1.0f);
        } else if (f == 0.0f) {
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f271d.m9305l(c0090i3, 1.0f);
            this.f271d.m9305l(c0090i4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i2, -1.0f);
            this.f271d.m9305l(c0090i4, f4);
            this.f271d.m9305l(c0090i3, -f4);
        }
        return this;
    }

    /* renamed from: l */
    public C0082b m9293l(C0090i c0090i, int i) {
        C0081a c0081a;
        float f;
        if (i < 0) {
            this.f269b = i * (-1);
            c0081a = this.f271d;
            f = 1.0f;
        } else {
            this.f269b = i;
            c0081a = this.f271d;
            f = -1.0f;
        }
        c0081a.m9305l(c0090i, f);
        return this;
    }

    /* renamed from: m */
    public C0082b m9292m(C0090i c0090i, C0090i c0090i2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f269b = i;
        }
        if (z) {
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i2, -1.0f);
        } else {
            this.f271d.m9305l(c0090i, -1.0f);
            this.f271d.m9305l(c0090i2, 1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C0082b m9291n(C0090i c0090i, C0090i c0090i2, C0090i c0090i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f269b = i;
        }
        if (z) {
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i2, -1.0f);
            this.f271d.m9305l(c0090i3, -1.0f);
        } else {
            this.f271d.m9305l(c0090i, -1.0f);
            this.f271d.m9305l(c0090i2, 1.0f);
            this.f271d.m9305l(c0090i3, 1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C0082b m9290o(C0090i c0090i, C0090i c0090i2, C0090i c0090i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f269b = i;
        }
        if (z) {
            this.f271d.m9305l(c0090i, 1.0f);
            this.f271d.m9305l(c0090i2, -1.0f);
            this.f271d.m9305l(c0090i3, 1.0f);
        } else {
            this.f271d.m9305l(c0090i, -1.0f);
            this.f271d.m9305l(c0090i2, 1.0f);
            this.f271d.m9305l(c0090i3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C0082b m9289p(C0090i c0090i, C0090i c0090i2, C0090i c0090i3, C0090i c0090i4, float f) {
        this.f271d.m9305l(c0090i3, 0.5f);
        this.f271d.m9305l(c0090i4, 0.5f);
        this.f271d.m9305l(c0090i, -0.5f);
        this.f271d.m9305l(c0090i2, -0.5f);
        this.f269b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m9288q() {
        float f = this.f269b;
        if (f < 0.0f) {
            this.f269b = f * (-1.0f);
            this.f271d.m9307j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m9287r() {
        C0090i c0090i = this.f268a;
        return c0090i != null && (c0090i.f329g == C0090i.EnumC0091a.UNRESTRICTED || this.f269b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m9286s(C0090i c0090i) {
        return this.f271d.m9313d(c0090i);
    }

    /* renamed from: t */
    public boolean m9285t() {
        return this.f268a == null && this.f269b == 0.0f && this.f271d.f257a == 0;
    }

    public String toString() {
        return m9281x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C0090i m9284u(C0090i c0090i) {
        return this.f271d.m9310g(null, c0090i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m9283v(C0090i c0090i) {
        C0090i c0090i2 = this.f268a;
        if (c0090i2 != null) {
            this.f271d.m9305l(c0090i2, -1.0f);
            this.f268a = null;
        }
        float m9304m = this.f271d.m9304m(c0090i, true) * (-1.0f);
        this.f268a = c0090i;
        if (m9304m == 1.0f) {
            return;
        }
        this.f269b /= m9304m;
        this.f271d.m9312e(m9304m);
    }

    /* renamed from: w */
    public void m9282w() {
        this.f268a = null;
        this.f271d.m9314c();
        this.f269b = 0.0f;
        this.f272e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String m9281x() {
        /*
            r10 = this;
            a.e.a.i r0 = r10.f268a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            a.e.a.i r1 = r10.f268a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f269b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f269b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            a.e.a.a r5 = r10.f271d
            int r5 = r5.f257a
        L57:
            if (r2 >= r5) goto Ld0
            a.e.a.a r6 = r10.f271d
            a.e.a.i r6 = r6.m9309h(r2)
            if (r6 != 0) goto L62
            goto Lcd
        L62:
            a.e.a.a r7 = r10.f271d
            float r7 = r7.m9308i(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6d
            goto Lcd
        L6d:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L84
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La0
        L84:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L98
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto La9
        L98:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La0:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        La9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc2
        Lb5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc2:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Lcd:
            int r2 = r2 + 1
            goto L57
        Ld0:
            if (r1 != 0) goto Le3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.C0082b.m9281x():java.lang.String");
    }
}
