package p000a.p015e.p016a;

import java.util.Arrays;
/* renamed from: a.e.a.i */
/* loaded from: classes.dex */
public class C0090i {

    /* renamed from: k */
    private static int f322k = 1;

    /* renamed from: a */
    private String f323a;

    /* renamed from: e */
    public float f327e;

    /* renamed from: g */
    EnumC0091a f329g;

    /* renamed from: b */
    public int f324b = -1;

    /* renamed from: c */
    int f325c = -1;

    /* renamed from: d */
    public int f326d = 0;

    /* renamed from: f */
    float[] f328f = new float[7];

    /* renamed from: h */
    C0082b[] f330h = new C0082b[8];

    /* renamed from: i */
    int f331i = 0;

    /* renamed from: j */
    public int f332j = 0;

    /* renamed from: a.e.a.i$a */
    /* loaded from: classes.dex */
    public enum EnumC0091a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0090i(EnumC0091a enumC0091a, String str) {
        this.f329g = enumC0091a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m9241b() {
        f322k++;
    }

    /* renamed from: a */
    public final void m9242a(C0082b c0082b) {
        int i = 0;
        while (true) {
            int i2 = this.f331i;
            if (i >= i2) {
                C0082b[] c0082bArr = this.f330h;
                if (i2 >= c0082bArr.length) {
                    this.f330h = (C0082b[]) Arrays.copyOf(c0082bArr, c0082bArr.length * 2);
                }
                C0082b[] c0082bArr2 = this.f330h;
                int i3 = this.f331i;
                c0082bArr2[i3] = c0082b;
                this.f331i = i3 + 1;
                return;
            } else if (this.f330h[i] == c0082b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: c */
    public final void m9240c(C0082b c0082b) {
        int i = this.f331i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f330h[i2] == c0082b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C0082b[] c0082bArr = this.f330h;
                    int i4 = i2 + i3;
                    c0082bArr[i4] = c0082bArr[i4 + 1];
                }
                this.f331i--;
                return;
            }
        }
    }

    /* renamed from: d */
    public void m9239d() {
        this.f323a = null;
        this.f329g = EnumC0091a.UNKNOWN;
        this.f326d = 0;
        this.f324b = -1;
        this.f325c = -1;
        this.f327e = 0.0f;
        this.f331i = 0;
        this.f332j = 0;
    }

    /* renamed from: e */
    public void m9238e(EnumC0091a enumC0091a, String str) {
        this.f329g = enumC0091a;
    }

    /* renamed from: f */
    public final void m9237f(C0082b c0082b) {
        int i = this.f331i;
        for (int i2 = 0; i2 < i; i2++) {
            C0082b[] c0082bArr = this.f330h;
            c0082bArr[i2].f271d.m9303n(c0082bArr[i2], c0082b, false);
        }
        this.f331i = 0;
    }

    public String toString() {
        return "" + this.f323a;
    }
}
