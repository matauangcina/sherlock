package p000a.p015e.p016a;

import java.util.Arrays;
import p000a.p015e.p016a.C0090i;
/* renamed from: a.e.a.a */
/* loaded from: classes.dex */
public class C0081a {

    /* renamed from: b */
    private final C0082b f258b;

    /* renamed from: c */
    private final C0083c f259c;

    /* renamed from: a */
    int f257a = 0;

    /* renamed from: d */
    private int f260d = 8;

    /* renamed from: e */
    private C0090i f261e = null;

    /* renamed from: f */
    private int[] f262f = new int[8];

    /* renamed from: g */
    private int[] f263g = new int[8];

    /* renamed from: h */
    private float[] f264h = new float[8];

    /* renamed from: i */
    private int f265i = -1;

    /* renamed from: j */
    private int f266j = -1;

    /* renamed from: k */
    private boolean f267k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0081a(C0082b c0082b, C0083c c0083c) {
        this.f258b = c0082b;
        this.f259c = c0083c;
    }

    /* renamed from: k */
    private boolean m9306k(C0090i c0090i, C0085e c0085e) {
        return c0090i.f332j <= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9316a(C0090i c0090i, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f265i;
        if (i == -1) {
            this.f265i = 0;
            this.f264h[0] = f;
            this.f262f[0] = c0090i.f324b;
            this.f263g[0] = -1;
            c0090i.f332j++;
            c0090i.m9242a(this.f258b);
            this.f257a++;
            if (this.f267k) {
                return;
            }
            int i2 = this.f266j + 1;
            this.f266j = i2;
            int[] iArr = this.f262f;
            if (i2 >= iArr.length) {
                this.f267k = true;
                this.f266j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f257a; i4++) {
            int[] iArr2 = this.f262f;
            int i5 = iArr2[i];
            int i6 = c0090i.f324b;
            if (i5 == i6) {
                float[] fArr = this.f264h;
                fArr[i] = fArr[i] + f;
                if (fArr[i] == 0.0f) {
                    if (i == this.f265i) {
                        this.f265i = this.f263g[i];
                    } else {
                        int[] iArr3 = this.f263g;
                        iArr3[i3] = iArr3[i];
                    }
                    if (z) {
                        c0090i.m9240c(this.f258b);
                    }
                    if (this.f267k) {
                        this.f266j = i;
                    }
                    c0090i.f332j--;
                    this.f257a--;
                    return;
                }
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f263g[i];
        }
        int i7 = this.f266j;
        int i8 = i7 + 1;
        if (this.f267k) {
            int[] iArr4 = this.f262f;
            if (iArr4[i7] != -1) {
                i7 = iArr4.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr5 = this.f262f;
        if (i7 >= iArr5.length && this.f257a < iArr5.length) {
            int i9 = 0;
            while (true) {
                int[] iArr6 = this.f262f;
                if (i9 >= iArr6.length) {
                    break;
                } else if (iArr6[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr7 = this.f262f;
        if (i7 >= iArr7.length) {
            i7 = iArr7.length;
            int i10 = this.f260d * 2;
            this.f260d = i10;
            this.f267k = false;
            this.f266j = i7 - 1;
            this.f264h = Arrays.copyOf(this.f264h, i10);
            this.f262f = Arrays.copyOf(this.f262f, this.f260d);
            this.f263g = Arrays.copyOf(this.f263g, this.f260d);
        }
        this.f262f[i7] = c0090i.f324b;
        this.f264h[i7] = f;
        int[] iArr8 = this.f263g;
        if (i3 != -1) {
            iArr8[i7] = iArr8[i3];
            iArr8[i3] = i7;
        } else {
            iArr8[i7] = this.f265i;
            this.f265i = i7;
        }
        c0090i.f332j++;
        c0090i.m9242a(this.f258b);
        this.f257a++;
        if (!this.f267k) {
            this.f266j++;
        }
        int i11 = this.f266j;
        int[] iArr9 = this.f262f;
        if (i11 >= iArr9.length) {
            this.f267k = true;
            this.f266j = iArr9.length - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000a.p015e.p016a.C0090i m9315b(p000a.p015e.p016a.C0085e r15) {
        /*
            r14 = this;
            int r0 = r14.f265i
            r1 = 0
            r2 = 0
            r3 = 0
            r2 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        Lb:
            r9 = -1
            if (r0 == r9) goto L8a
            int r9 = r14.f257a
            if (r4 >= r9) goto L8a
            float[] r9 = r14.f264h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            a.e.a.c r12 = r14.f259c
            a.e.a.i[] r12 = r12.f275c
            int[] r13 = r14.f262f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L31
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L3d
            r9[r0] = r3
            goto L37
        L31:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L3d
            r9[r0] = r3
        L37:
            a.e.a.b r9 = r14.f258b
            r12.m9240c(r9)
            r10 = 0
        L3d:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L83
            a.e.a.i$a r11 = r12.f329g
            a.e.a.i$a r13 = p000a.p015e.p016a.C0090i.EnumC0091a.UNRESTRICTED
            if (r11 != r13) goto L63
            if (r2 != 0) goto L52
        L4a:
            boolean r2 = r14.m9306k(r12, r15)
            r5 = r2
            r7 = r10
            r2 = r12
            goto L83
        L52:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L57
            goto L4a
        L57:
            if (r5 != 0) goto L83
            boolean r11 = r14.m9306k(r12, r15)
            if (r11 == 0) goto L83
            r7 = r10
            r2 = r12
            r5 = 1
            goto L83
        L63:
            if (r2 != 0) goto L83
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L83
            if (r1 != 0) goto L73
        L6b:
            boolean r1 = r14.m9306k(r12, r15)
            r6 = r1
            r8 = r10
            r1 = r12
            goto L83
        L73:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L78
            goto L6b
        L78:
            if (r6 != 0) goto L83
            boolean r11 = r14.m9306k(r12, r15)
            if (r11 == 0) goto L83
            r8 = r10
            r1 = r12
            r6 = 1
        L83:
            int[] r9 = r14.f263g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto Lb
        L8a:
            if (r2 == 0) goto L8d
            return r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.C0081a.m9315b(a.e.a.e):a.e.a.i");
    }

    /* renamed from: c */
    public final void m9314c() {
        int i = this.f265i;
        for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
            C0090i c0090i = this.f259c.f275c[this.f262f[i]];
            if (c0090i != null) {
                c0090i.m9240c(this.f258b);
            }
            i = this.f263g[i];
        }
        this.f265i = -1;
        this.f266j = -1;
        this.f267k = false;
        this.f257a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m9313d(C0090i c0090i) {
        int i = this.f265i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
            if (this.f262f[i] == c0090i.f324b) {
                return true;
            }
            i = this.f263g[i];
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m9312e(float f) {
        int i = this.f265i;
        for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
            float[] fArr = this.f264h;
            fArr[i] = fArr[i] / f;
            i = this.f263g[i];
        }
    }

    /* renamed from: f */
    public final float m9311f(C0090i c0090i) {
        int i = this.f265i;
        for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
            if (this.f262f[i] == c0090i.f324b) {
                return this.f264h[i];
            }
            i = this.f263g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C0090i m9310g(boolean[] zArr, C0090i c0090i) {
        C0090i.EnumC0091a enumC0091a;
        int i = this.f265i;
        C0090i c0090i2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
            if (this.f264h[i] < 0.0f) {
                C0090i c0090i3 = this.f259c.f275c[this.f262f[i]];
                if ((zArr == null || !zArr[c0090i3.f324b]) && c0090i3 != c0090i && ((enumC0091a = c0090i3.f329g) == C0090i.EnumC0091a.SLACK || enumC0091a == C0090i.EnumC0091a.ERROR)) {
                    float f2 = this.f264h[i];
                    if (f2 < f) {
                        c0090i2 = c0090i3;
                        f = f2;
                    }
                }
            }
            i = this.f263g[i];
        }
        return c0090i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final C0090i m9309h(int i) {
        int i2 = this.f265i;
        for (int i3 = 0; i2 != -1 && i3 < this.f257a; i3++) {
            if (i3 == i) {
                return this.f259c.f275c[this.f262f[i2]];
            }
            i2 = this.f263g[i2];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final float m9308i(int i) {
        int i2 = this.f265i;
        for (int i3 = 0; i2 != -1 && i3 < this.f257a; i3++) {
            if (i3 == i) {
                return this.f264h[i2];
            }
            i2 = this.f263g[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m9307j() {
        int i = this.f265i;
        for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
            float[] fArr = this.f264h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f263g[i];
        }
    }

    /* renamed from: l */
    public final void m9305l(C0090i c0090i, float f) {
        if (f == 0.0f) {
            m9304m(c0090i, true);
            return;
        }
        int i = this.f265i;
        if (i == -1) {
            this.f265i = 0;
            this.f264h[0] = f;
            this.f262f[0] = c0090i.f324b;
            this.f263g[0] = -1;
            c0090i.f332j++;
            c0090i.m9242a(this.f258b);
            this.f257a++;
            if (this.f267k) {
                return;
            }
            int i2 = this.f266j + 1;
            this.f266j = i2;
            int[] iArr = this.f262f;
            if (i2 >= iArr.length) {
                this.f267k = true;
                this.f266j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f257a; i4++) {
            int[] iArr2 = this.f262f;
            int i5 = iArr2[i];
            int i6 = c0090i.f324b;
            if (i5 == i6) {
                this.f264h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f263g[i];
        }
        int i7 = this.f266j;
        int i8 = i7 + 1;
        if (this.f267k) {
            int[] iArr3 = this.f262f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f262f;
        if (i7 >= iArr4.length && this.f257a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f262f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f262f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f260d * 2;
            this.f260d = i10;
            this.f267k = false;
            this.f266j = i7 - 1;
            this.f264h = Arrays.copyOf(this.f264h, i10);
            this.f262f = Arrays.copyOf(this.f262f, this.f260d);
            this.f263g = Arrays.copyOf(this.f263g, this.f260d);
        }
        this.f262f[i7] = c0090i.f324b;
        this.f264h[i7] = f;
        int[] iArr7 = this.f263g;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.f265i;
            this.f265i = i7;
        }
        c0090i.f332j++;
        c0090i.m9242a(this.f258b);
        this.f257a++;
        if (!this.f267k) {
            this.f266j++;
        }
        if (this.f257a >= this.f262f.length) {
            this.f267k = true;
        }
        int i11 = this.f266j;
        int[] iArr8 = this.f262f;
        if (i11 >= iArr8.length) {
            this.f267k = true;
            this.f266j = iArr8.length - 1;
        }
    }

    /* renamed from: m */
    public final float m9304m(C0090i c0090i, boolean z) {
        if (this.f261e == c0090i) {
            this.f261e = null;
        }
        int i = this.f265i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f257a) {
            if (this.f262f[i] == c0090i.f324b) {
                if (i == this.f265i) {
                    this.f265i = this.f263g[i];
                } else {
                    int[] iArr = this.f263g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c0090i.m9240c(this.f258b);
                }
                c0090i.f332j--;
                this.f257a--;
                this.f262f[i] = -1;
                if (this.f267k) {
                    this.f266j = i;
                }
                return this.f264h[i];
            }
            i2++;
            i3 = i;
            i = this.f263g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m9303n(C0082b c0082b, C0082b c0082b2, boolean z) {
        int i = this.f265i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
                int i3 = this.f262f[i];
                C0090i c0090i = c0082b2.f268a;
                if (i3 == c0090i.f324b) {
                    float f = this.f264h[i];
                    m9304m(c0090i, z);
                    C0081a c0081a = c0082b2.f271d;
                    int i4 = c0081a.f265i;
                    for (int i5 = 0; i4 != -1 && i5 < c0081a.f257a; i5++) {
                        m9316a(this.f259c.f275c[c0081a.f262f[i4]], c0081a.f264h[i4] * f, z);
                        i4 = c0081a.f263g[i4];
                    }
                    c0082b.f269b += c0082b2.f269b * f;
                    if (z) {
                        c0082b2.f268a.m9240c(c0082b);
                    }
                    i = this.f265i;
                } else {
                    i = this.f263g[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m9302o(C0082b c0082b, C0082b[] c0082bArr) {
        int i = this.f265i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
                C0090i c0090i = this.f259c.f275c[this.f262f[i]];
                if (c0090i.f325c != -1) {
                    float f = this.f264h[i];
                    m9304m(c0090i, true);
                    C0082b c0082b2 = c0082bArr[c0090i.f325c];
                    if (!c0082b2.f272e) {
                        C0081a c0081a = c0082b2.f271d;
                        int i3 = c0081a.f265i;
                        for (int i4 = 0; i3 != -1 && i4 < c0081a.f257a; i4++) {
                            m9316a(this.f259c.f275c[c0081a.f262f[i3]], c0081a.f264h[i3] * f, true);
                            i3 = c0081a.f263g[i3];
                        }
                    }
                    c0082b.f269b += c0082b2.f269b * f;
                    c0082b2.f268a.m9240c(c0082b);
                    i = this.f265i;
                } else {
                    i = this.f263g[i];
                }
            }
            return;
        }
    }

    public String toString() {
        int i = this.f265i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f257a; i2++) {
            str = ((str + " -> ") + this.f264h[i] + " : ") + this.f259c.f275c[this.f262f[i]];
            i = this.f263g[i];
        }
        return str;
    }
}
