package p000a.p015e.p016a.p017j;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import p000a.p015e.p016a.C0083c;
import p000a.p015e.p016a.C0085e;
import p000a.p015e.p016a.p017j.C0096e;
/* renamed from: a.e.a.j.f */
/* loaded from: classes.dex */
public class C0101f {

    /* renamed from: j0 */
    public static float f386j0 = 0.5f;

    /* renamed from: A */
    protected C0096e[] f387A;

    /* renamed from: B */
    protected ArrayList<C0096e> f388B;

    /* renamed from: C */
    protected EnumC0103b[] f389C;

    /* renamed from: D */
    C0101f f390D;

    /* renamed from: E */
    int f391E;

    /* renamed from: F */
    int f392F;

    /* renamed from: G */
    protected float f393G;

    /* renamed from: H */
    protected int f394H;

    /* renamed from: I */
    protected int f395I;

    /* renamed from: J */
    protected int f396J;

    /* renamed from: K */
    int f397K;

    /* renamed from: L */
    int f398L;

    /* renamed from: M */
    private int f399M;

    /* renamed from: N */
    private int f400N;

    /* renamed from: O */
    protected int f401O;

    /* renamed from: P */
    protected int f402P;

    /* renamed from: Q */
    int f403Q;

    /* renamed from: R */
    protected int f404R;

    /* renamed from: S */
    protected int f405S;

    /* renamed from: T */
    private int f406T;

    /* renamed from: U */
    private int f407U;

    /* renamed from: V */
    float f408V;

    /* renamed from: W */
    float f409W;

    /* renamed from: X */
    private Object f410X;

    /* renamed from: Y */
    private int f411Y;

    /* renamed from: Z */
    private String f412Z;

    /* renamed from: a0 */
    private String f414a0;

    /* renamed from: b0 */
    boolean f416b0;

    /* renamed from: c */
    C0111m f417c;

    /* renamed from: c0 */
    boolean f418c0;

    /* renamed from: d */
    C0111m f419d;

    /* renamed from: d0 */
    boolean f420d0;

    /* renamed from: e0 */
    int f422e0;

    /* renamed from: f0 */
    int f424f0;

    /* renamed from: g0 */
    float[] f426g0;

    /* renamed from: h0 */
    protected C0101f[] f428h0;

    /* renamed from: i0 */
    protected C0101f[] f430i0;

    /* renamed from: z */
    C0096e f447z;

    /* renamed from: a */
    public int f413a = -1;

    /* renamed from: b */
    public int f415b = -1;

    /* renamed from: e */
    int f421e = 0;

    /* renamed from: f */
    int f423f = 0;

    /* renamed from: g */
    int[] f425g = new int[2];

    /* renamed from: h */
    int f427h = 0;

    /* renamed from: i */
    int f429i = 0;

    /* renamed from: j */
    float f431j = 1.0f;

    /* renamed from: k */
    int f432k = 0;

    /* renamed from: l */
    int f433l = 0;

    /* renamed from: m */
    float f434m = 1.0f;

    /* renamed from: n */
    int f435n = -1;

    /* renamed from: o */
    float f436o = 1.0f;

    /* renamed from: p */
    C0105h f437p = null;

    /* renamed from: q */
    private int[] f438q = {Reader.READ_DONE, Reader.READ_DONE};

    /* renamed from: r */
    private float f439r = 0.0f;

    /* renamed from: s */
    C0096e f440s = new C0096e(this, C0096e.EnumC0100d.LEFT);

    /* renamed from: t */
    C0096e f441t = new C0096e(this, C0096e.EnumC0100d.TOP);

    /* renamed from: u */
    C0096e f442u = new C0096e(this, C0096e.EnumC0100d.RIGHT);

    /* renamed from: v */
    C0096e f443v = new C0096e(this, C0096e.EnumC0100d.BOTTOM);

    /* renamed from: w */
    C0096e f444w = new C0096e(this, C0096e.EnumC0100d.BASELINE);

    /* renamed from: x */
    C0096e f445x = new C0096e(this, C0096e.EnumC0100d.CENTER_X);

    /* renamed from: y */
    C0096e f446y = new C0096e(this, C0096e.EnumC0100d.CENTER_Y);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.j.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0102a {

        /* renamed from: a */
        static final /* synthetic */ int[] f448a;

        /* renamed from: b */
        static final /* synthetic */ int[] f449b;

        static {
            int[] iArr = new int[EnumC0103b.values().length];
            f449b = iArr;
            try {
                iArr[EnumC0103b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f449b[EnumC0103b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f449b[EnumC0103b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f449b[EnumC0103b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C0096e.EnumC0100d.values().length];
            f448a = iArr2;
            try {
                iArr2[C0096e.EnumC0100d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f448a[C0096e.EnumC0100d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f448a[C0096e.EnumC0100d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f448a[C0096e.EnumC0100d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f448a[C0096e.EnumC0100d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f448a[C0096e.EnumC0100d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f448a[C0096e.EnumC0100d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f448a[C0096e.EnumC0100d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f448a[C0096e.EnumC0100d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* renamed from: a.e.a.j.f$b */
    /* loaded from: classes.dex */
    public enum EnumC0103b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0101f() {
        C0096e c0096e = new C0096e(this, C0096e.EnumC0100d.CENTER);
        this.f447z = c0096e;
        this.f387A = new C0096e[]{this.f440s, this.f442u, this.f441t, this.f443v, this.f444w, c0096e};
        this.f388B = new ArrayList<>();
        EnumC0103b enumC0103b = EnumC0103b.FIXED;
        this.f389C = new EnumC0103b[]{enumC0103b, enumC0103b};
        this.f390D = null;
        this.f391E = 0;
        this.f392F = 0;
        this.f393G = 0.0f;
        this.f394H = -1;
        this.f395I = 0;
        this.f396J = 0;
        this.f397K = 0;
        this.f398L = 0;
        this.f399M = 0;
        this.f400N = 0;
        this.f401O = 0;
        this.f402P = 0;
        this.f403Q = 0;
        float f = f386j0;
        this.f408V = f;
        this.f409W = f;
        this.f411Y = 0;
        this.f412Z = null;
        this.f414a0 = null;
        this.f416b0 = false;
        this.f418c0 = false;
        this.f420d0 = false;
        this.f422e0 = 0;
        this.f424f0 = 0;
        this.f426g0 = new float[]{-1.0f, -1.0f};
        this.f428h0 = new C0101f[]{null, null};
        this.f430i0 = new C0101f[]{null, null};
        m9173a();
    }

    /* renamed from: K */
    private boolean m9187K(int i) {
        int i2 = i * 2;
        C0096e[] c0096eArr = this.f387A;
        if (c0096eArr[i2].f362d != null && c0096eArr[i2].f362d.f362d != c0096eArr[i2]) {
            int i3 = i2 + 1;
            if (c0096eArr[i3].f362d != null && c0096eArr[i3].f362d.f362d == c0096eArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m9173a() {
        this.f388B.add(this.f440s);
        this.f388B.add(this.f441t);
        this.f388B.add(this.f442u);
        this.f388B.add(this.f443v);
        this.f388B.add(this.f445x);
        this.f388B.add(this.f446y);
        this.f388B.add(this.f447z);
        this.f388B.add(this.f444w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ef, code lost:
        if (r25 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9168e(p000a.p015e.p016a.C0085e r24, boolean r25, p000a.p015e.p016a.C0090i r26, p000a.p015e.p016a.C0090i r27, p000a.p015e.p016a.p017j.C0101f.EnumC0103b r28, boolean r29, p000a.p015e.p016a.p017j.C0096e r30, p000a.p015e.p016a.p017j.C0096e r31, int r32, int r33, int r34, int r35, float r36, boolean r37, boolean r38, int r39, int r40, int r41, float r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.p017j.C0101f.m9168e(a.e.a.e, boolean, a.e.a.i, a.e.a.i, a.e.a.j.f$b, boolean, a.e.a.j.e, a.e.a.j.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public int m9203A() {
        return this.f396J + this.f402P;
    }

    /* renamed from: A0 */
    public void m9202A0(int i) {
        this.f407U = i;
    }

    /* renamed from: B */
    public EnumC0103b m9201B() {
        return this.f389C[1];
    }

    /* renamed from: B0 */
    public void m9200B0(int i) {
        this.f406T = i;
    }

    /* renamed from: C */
    public int m9199C() {
        return this.f411Y;
    }

    /* renamed from: C0 */
    public void m9198C0(int i) {
        this.f395I = i;
    }

    /* renamed from: D */
    public int m9197D() {
        if (this.f411Y == 8) {
            return 0;
        }
        return this.f391E;
    }

    /* renamed from: D0 */
    public void m9196D0(int i) {
        this.f396J = i;
    }

    /* renamed from: E */
    public int m9195E() {
        return this.f407U;
    }

    /* renamed from: E0 */
    public void m9194E0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f435n == -1) {
            if (z3 && !z4) {
                this.f435n = 0;
            } else if (!z3 && z4) {
                this.f435n = 1;
                if (this.f394H == -1) {
                    this.f436o = 1.0f / this.f436o;
                }
            }
        }
        if (this.f435n == 0 && (!this.f441t.m9207k() || !this.f443v.m9207k())) {
            this.f435n = 1;
        } else if (this.f435n == 1 && (!this.f440s.m9207k() || !this.f442u.m9207k())) {
            this.f435n = 0;
        }
        if (this.f435n == -1 && (!this.f441t.m9207k() || !this.f443v.m9207k() || !this.f440s.m9207k() || !this.f442u.m9207k())) {
            if (this.f441t.m9207k() && this.f443v.m9207k()) {
                this.f435n = 0;
            } else if (this.f440s.m9207k() && this.f442u.m9207k()) {
                this.f436o = 1.0f / this.f436o;
                this.f435n = 1;
            }
        }
        if (this.f435n == -1) {
            if (z && !z2) {
                this.f435n = 0;
            } else if (!z && z2) {
                this.f436o = 1.0f / this.f436o;
                this.f435n = 1;
            }
        }
        if (this.f435n == -1) {
            if (this.f427h > 0 && this.f432k == 0) {
                this.f435n = 0;
            } else if (this.f427h == 0 && this.f432k > 0) {
                this.f436o = 1.0f / this.f436o;
                this.f435n = 1;
            }
        }
        if (this.f435n == -1 && z && z2) {
            this.f436o = 1.0f / this.f436o;
            this.f435n = 1;
        }
    }

    /* renamed from: F */
    public int m9193F() {
        return this.f406T;
    }

    /* renamed from: F0 */
    public void mo9060F0() {
        int i = this.f395I;
        int i2 = this.f396J;
        this.f399M = i;
        this.f400N = i2;
    }

    /* renamed from: G */
    public int m9192G() {
        return this.f395I;
    }

    /* renamed from: G0 */
    public void mo9101G0(C0085e c0085e) {
        int m9250y = c0085e.m9250y(this.f440s);
        int m9250y2 = c0085e.m9250y(this.f441t);
        int m9250y3 = c0085e.m9250y(this.f442u);
        int m9250y4 = c0085e.m9250y(this.f443v);
        int i = m9250y4 - m9250y2;
        if (m9250y3 - m9250y < 0 || i < 0 || m9250y == Integer.MIN_VALUE || m9250y == Integer.MAX_VALUE || m9250y2 == Integer.MIN_VALUE || m9250y2 == Integer.MAX_VALUE || m9250y3 == Integer.MIN_VALUE || m9250y3 == Integer.MAX_VALUE || m9250y4 == Integer.MIN_VALUE || m9250y4 == Integer.MAX_VALUE) {
            m9250y4 = 0;
            m9250y = 0;
            m9250y2 = 0;
            m9250y3 = 0;
        }
        m9172a0(m9250y, m9250y2, m9250y3, m9250y4);
    }

    /* renamed from: H */
    public int m9191H() {
        return this.f396J;
    }

    /* renamed from: H0 */
    public void m9190H0() {
        for (int i = 0; i < 6; i++) {
            this.f387A[i].m9212f().m9073q();
        }
    }

    /* renamed from: I */
    public boolean m9189I() {
        return this.f403Q > 0;
    }

    /* renamed from: J */
    public void m9188J(C0096e.EnumC0100d enumC0100d, C0101f c0101f, C0096e.EnumC0100d enumC0100d2, int i, int i2) {
        mo9092h(enumC0100d).m9217a(c0101f.mo9092h(enumC0100d2), i, i2, C0096e.EnumC0099c.STRONG, 0, true);
    }

    /* renamed from: L */
    public boolean m9186L() {
        return this.f440s.m9212f().f510b == 1 && this.f442u.m9212f().f510b == 1 && this.f441t.m9212f().f510b == 1 && this.f443v.m9212f().f510b == 1;
    }

    /* renamed from: M */
    public boolean m9185M() {
        C0096e c0096e = this.f440s;
        C0096e c0096e2 = c0096e.f362d;
        if (c0096e2 == null || c0096e2.f362d != c0096e) {
            C0096e c0096e3 = this.f442u;
            C0096e c0096e4 = c0096e3.f362d;
            return c0096e4 != null && c0096e4.f362d == c0096e3;
        }
        return true;
    }

    /* renamed from: N */
    public boolean m9184N() {
        C0096e c0096e = this.f441t;
        C0096e c0096e2 = c0096e.f362d;
        if (c0096e2 == null || c0096e2.f362d != c0096e) {
            C0096e c0096e3 = this.f443v;
            C0096e c0096e4 = c0096e3.f362d;
            return c0096e4 != null && c0096e4.f362d == c0096e3;
        }
        return true;
    }

    /* renamed from: O */
    public boolean m9183O() {
        return this.f423f == 0 && this.f393G == 0.0f && this.f432k == 0 && this.f433l == 0 && this.f389C[1] == EnumC0103b.MATCH_CONSTRAINT;
    }

    /* renamed from: P */
    public boolean m9182P() {
        return this.f421e == 0 && this.f393G == 0.0f && this.f427h == 0 && this.f429i == 0 && this.f389C[0] == EnumC0103b.MATCH_CONSTRAINT;
    }

    /* renamed from: Q */
    public void mo9054Q() {
        this.f440s.m9205m();
        this.f441t.m9205m();
        this.f442u.m9205m();
        this.f443v.m9205m();
        this.f444w.m9205m();
        this.f445x.m9205m();
        this.f446y.m9205m();
        this.f447z.m9205m();
        this.f390D = null;
        this.f439r = 0.0f;
        this.f391E = 0;
        this.f392F = 0;
        this.f393G = 0.0f;
        this.f394H = -1;
        this.f395I = 0;
        this.f396J = 0;
        this.f399M = 0;
        this.f400N = 0;
        this.f401O = 0;
        this.f402P = 0;
        this.f403Q = 0;
        this.f404R = 0;
        this.f405S = 0;
        this.f406T = 0;
        this.f407U = 0;
        float f = f386j0;
        this.f408V = f;
        this.f409W = f;
        EnumC0103b[] enumC0103bArr = this.f389C;
        EnumC0103b enumC0103b = EnumC0103b.FIXED;
        enumC0103bArr[0] = enumC0103b;
        enumC0103bArr[1] = enumC0103b;
        this.f410X = null;
        this.f411Y = 0;
        this.f414a0 = null;
        this.f422e0 = 0;
        this.f424f0 = 0;
        float[] fArr = this.f426g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f413a = -1;
        this.f415b = -1;
        int[] iArr = this.f438q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f421e = 0;
        this.f423f = 0;
        this.f431j = 1.0f;
        this.f434m = 1.0f;
        this.f429i = Reader.READ_DONE;
        this.f433l = Reader.READ_DONE;
        this.f427h = 0;
        this.f432k = 0;
        this.f435n = -1;
        this.f436o = 1.0f;
        C0111m c0111m = this.f417c;
        if (c0111m != null) {
            c0111m.mo9066e();
        }
        C0111m c0111m2 = this.f419d;
        if (c0111m2 != null) {
            c0111m2.mo9066e();
        }
        this.f437p = null;
        this.f416b0 = false;
        this.f418c0 = false;
        this.f420d0 = false;
    }

    /* renamed from: R */
    public void m9181R() {
        C0101f m9139u = m9139u();
        if (m9139u != null && (m9139u instanceof C0104g) && ((C0104g) m9139u()).m9122S0()) {
            return;
        }
        int size = this.f388B.size();
        for (int i = 0; i < size; i++) {
            this.f388B.get(i).m9205m();
        }
    }

    /* renamed from: S */
    public void mo9180S() {
        for (int i = 0; i < 6; i++) {
            this.f387A[i].m9212f().mo9066e();
        }
    }

    /* renamed from: T */
    public void mo9053T(C0083c c0083c) {
        this.f440s.m9204n(c0083c);
        this.f441t.m9204n(c0083c);
        this.f442u.m9204n(c0083c);
        this.f443v.m9204n(c0083c);
        this.f444w.m9204n(c0083c);
        this.f447z.m9204n(c0083c);
        this.f445x.m9204n(c0083c);
        this.f446y.m9204n(c0083c);
    }

    /* renamed from: U */
    public void mo9179U() {
    }

    /* renamed from: V */
    public void m9178V(int i) {
        this.f403Q = i;
    }

    /* renamed from: W */
    public void m9177W(Object obj) {
        this.f410X = obj;
    }

    /* renamed from: X */
    public void m9176X(String str) {
        this.f412Z = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    /* renamed from: Y */
    public void m9175Y(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f393G = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = 0.0f;
        } else {
            String substring3 = str.substring(i3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.f393G = f;
            this.f394H = i2;
        }
    }

    /* renamed from: Z */
    public void m9174Z(int i, int i2, int i3) {
        if (i3 == 0) {
            m9165f0(i, i2);
        } else if (i3 == 1) {
            m9140t0(i, i2);
        }
        this.f418c0 = true;
    }

    /* renamed from: a0 */
    public void m9172a0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f395I = i;
        this.f396J = i2;
        if (this.f411Y == 8) {
            this.f391E = 0;
            this.f392F = 0;
            return;
        }
        if (this.f389C[0] == EnumC0103b.FIXED && i7 < (i6 = this.f391E)) {
            i7 = i6;
        }
        if (this.f389C[1] == EnumC0103b.FIXED && i8 < (i5 = this.f392F)) {
            i8 = i5;
        }
        this.f391E = i7;
        this.f392F = i8;
        int i9 = this.f405S;
        if (i8 < i9) {
            this.f392F = i9;
        }
        int i10 = this.f391E;
        int i11 = this.f404R;
        if (i10 < i11) {
            this.f391E = i11;
        }
        this.f418c0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9095b(p000a.p015e.p016a.C0085e r39) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p015e.p016a.p017j.C0101f.mo9095b(a.e.a.e):void");
    }

    /* renamed from: b0 */
    public void m9171b0(int i) {
        this.f392F = i;
        int i2 = this.f405S;
        if (i < i2) {
            this.f392F = i2;
        }
    }

    /* renamed from: c */
    public boolean mo9094c() {
        return this.f411Y != 8;
    }

    /* renamed from: c0 */
    public void m9170c0(boolean z) {
    }

    /* renamed from: d */
    public void mo9093d(int i) {
        C0109k.m9088a(i, this);
    }

    /* renamed from: d0 */
    public void m9169d0(float f) {
        this.f408V = f;
    }

    /* renamed from: e0 */
    public void m9167e0(int i) {
        this.f422e0 = i;
    }

    /* renamed from: f */
    public void m9166f(C0101f c0101f, float f, int i) {
        C0096e.EnumC0100d enumC0100d = C0096e.EnumC0100d.CENTER;
        m9188J(enumC0100d, c0101f, enumC0100d, i, 0);
        this.f439r = f;
    }

    /* renamed from: f0 */
    public void m9165f0(int i, int i2) {
        this.f395I = i;
        int i3 = i2 - i;
        this.f391E = i3;
        int i4 = this.f404R;
        if (i3 < i4) {
            this.f391E = i4;
        }
    }

    /* renamed from: g */
    public void m9164g(C0085e c0085e) {
        c0085e.m9257r(this.f440s);
        c0085e.m9257r(this.f441t);
        c0085e.m9257r(this.f442u);
        c0085e.m9257r(this.f443v);
        if (this.f403Q > 0) {
            c0085e.m9257r(this.f444w);
        }
    }

    /* renamed from: g0 */
    public void m9163g0(EnumC0103b enumC0103b) {
        this.f389C[0] = enumC0103b;
        if (enumC0103b == EnumC0103b.WRAP_CONTENT) {
            m9130y0(this.f406T);
        }
    }

    /* renamed from: h */
    public C0096e mo9092h(C0096e.EnumC0100d enumC0100d) {
        switch (C0102a.f448a[enumC0100d.ordinal()]) {
            case 1:
                return this.f440s;
            case 2:
                return this.f441t;
            case 3:
                return this.f442u;
            case 4:
                return this.f443v;
            case 5:
                return this.f444w;
            case 6:
                return this.f447z;
            case 7:
                return this.f445x;
            case 8:
                return this.f446y;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC0100d.name());
        }
    }

    /* renamed from: h0 */
    public void m9162h0(int i, int i2, int i3, float f) {
        this.f421e = i;
        this.f427h = i2;
        this.f429i = i3;
        this.f431j = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.f421e = 2;
    }

    /* renamed from: i */
    public ArrayList<C0096e> mo9091i() {
        return this.f388B;
    }

    /* renamed from: i0 */
    public void m9161i0(float f) {
        this.f426g0[0] = f;
    }

    /* renamed from: j */
    public int m9160j() {
        return this.f403Q;
    }

    /* renamed from: j0 */
    public void m9159j0(int i) {
        this.f438q[1] = i;
    }

    /* renamed from: k */
    public float m9158k(int i) {
        if (i == 0) {
            return this.f408V;
        }
        if (i == 1) {
            return this.f409W;
        }
        return -1.0f;
    }

    /* renamed from: k0 */
    public void m9157k0(int i) {
        this.f438q[0] = i;
    }

    /* renamed from: l */
    public int m9156l() {
        return m9191H() + this.f392F;
    }

    /* renamed from: l0 */
    public void m9155l0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f405S = i;
    }

    /* renamed from: m */
    public Object m9154m() {
        return this.f410X;
    }

    /* renamed from: m0 */
    public void m9153m0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f404R = i;
    }

    /* renamed from: n */
    public String m9152n() {
        return this.f412Z;
    }

    /* renamed from: n0 */
    public void mo9052n0(int i, int i2) {
        this.f401O = i;
        this.f402P = i2;
    }

    /* renamed from: o */
    public EnumC0103b m9151o(int i) {
        if (i == 0) {
            return m9143s();
        }
        if (i == 1) {
            return m9201B();
        }
        return null;
    }

    /* renamed from: o0 */
    public void m9150o0(int i, int i2) {
        this.f395I = i;
        this.f396J = i2;
    }

    /* renamed from: p */
    public int m9149p() {
        return this.f399M + this.f401O;
    }

    /* renamed from: p0 */
    public void m9148p0(C0101f c0101f) {
        this.f390D = c0101f;
    }

    /* renamed from: q */
    public int m9147q() {
        return this.f400N + this.f402P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m9146q0(int i, int i2) {
        if (i2 == 0) {
            this.f397K = i;
        } else if (i2 == 1) {
            this.f398L = i;
        }
    }

    /* renamed from: r */
    public int m9145r() {
        if (this.f411Y == 8) {
            return 0;
        }
        return this.f392F;
    }

    /* renamed from: r0 */
    public void m9144r0(float f) {
        this.f409W = f;
    }

    /* renamed from: s */
    public EnumC0103b m9143s() {
        return this.f389C[0];
    }

    /* renamed from: s0 */
    public void m9142s0(int i) {
        this.f424f0 = i;
    }

    /* renamed from: t */
    public int m9141t(int i) {
        if (i == 0) {
            return m9197D();
        }
        if (i == 1) {
            return m9145r();
        }
        return 0;
    }

    /* renamed from: t0 */
    public void m9140t0(int i, int i2) {
        this.f396J = i;
        int i3 = i2 - i;
        this.f392F = i3;
        int i4 = this.f405S;
        if (i3 < i4) {
            this.f392F = i4;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f414a0 != null) {
            str = "type: " + this.f414a0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f412Z != null) {
            str2 = "id: " + this.f412Z + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f395I);
        sb.append(", ");
        sb.append(this.f396J);
        sb.append(") - (");
        sb.append(this.f391E);
        sb.append(" x ");
        sb.append(this.f392F);
        sb.append(") wrap: (");
        sb.append(this.f406T);
        sb.append(" x ");
        sb.append(this.f407U);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public C0101f m9139u() {
        return this.f390D;
    }

    /* renamed from: u0 */
    public void m9138u0(EnumC0103b enumC0103b) {
        this.f389C[1] = enumC0103b;
        if (enumC0103b == EnumC0103b.WRAP_CONTENT) {
            m9171b0(this.f407U);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public int m9137v(int i) {
        if (i == 0) {
            return this.f397K;
        }
        if (i == 1) {
            return this.f398L;
        }
        return 0;
    }

    /* renamed from: v0 */
    public void m9136v0(int i, int i2, int i3, float f) {
        this.f423f = i;
        this.f432k = i2;
        this.f433l = i3;
        this.f434m = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.f423f = 2;
    }

    /* renamed from: w */
    public C0111m m9135w() {
        if (this.f419d == null) {
            this.f419d = new C0111m();
        }
        return this.f419d;
    }

    /* renamed from: w0 */
    public void m9134w0(float f) {
        this.f426g0[1] = f;
    }

    /* renamed from: x */
    public C0111m m9133x() {
        if (this.f417c == null) {
            this.f417c = new C0111m();
        }
        return this.f417c;
    }

    /* renamed from: x0 */
    public void m9132x0(int i) {
        this.f411Y = i;
    }

    /* renamed from: y */
    public int m9131y() {
        return m9192G() + this.f391E;
    }

    /* renamed from: y0 */
    public void m9130y0(int i) {
        this.f391E = i;
        int i2 = this.f404R;
        if (i < i2) {
            this.f391E = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public int m9129z() {
        return this.f395I + this.f401O;
    }

    /* renamed from: z0 */
    public void m9128z0(boolean z) {
    }
}
