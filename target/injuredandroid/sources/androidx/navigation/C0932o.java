package androidx.navigation;
/* renamed from: androidx.navigation.o */
/* loaded from: classes.dex */
public final class C0932o {

    /* renamed from: a */
    private boolean f3259a;

    /* renamed from: b */
    private int f3260b;

    /* renamed from: c */
    private boolean f3261c;

    /* renamed from: d */
    private int f3262d;

    /* renamed from: e */
    private int f3263e;

    /* renamed from: f */
    private int f3264f;

    /* renamed from: g */
    private int f3265g;

    /* renamed from: androidx.navigation.o$a */
    /* loaded from: classes.dex */
    public static final class C0933a {

        /* renamed from: a */
        boolean f3266a;

        /* renamed from: c */
        boolean f3268c;

        /* renamed from: b */
        int f3267b = -1;

        /* renamed from: d */
        int f3269d = -1;

        /* renamed from: e */
        int f3270e = -1;

        /* renamed from: f */
        int f3271f = -1;

        /* renamed from: g */
        int f3272g = -1;

        /* renamed from: a */
        public C0932o m5918a() {
            return new C0932o(this.f3266a, this.f3267b, this.f3268c, this.f3269d, this.f3270e, this.f3271f, this.f3272g);
        }

        /* renamed from: b */
        public C0933a m5917b(int i) {
            this.f3269d = i;
            return this;
        }

        /* renamed from: c */
        public C0933a m5916c(int i) {
            this.f3270e = i;
            return this;
        }

        /* renamed from: d */
        public C0933a m5915d(boolean z) {
            this.f3266a = z;
            return this;
        }

        /* renamed from: e */
        public C0933a m5914e(int i) {
            this.f3271f = i;
            return this;
        }

        /* renamed from: f */
        public C0933a m5913f(int i) {
            this.f3272g = i;
            return this;
        }

        /* renamed from: g */
        public C0933a m5912g(int i, boolean z) {
            this.f3267b = i;
            this.f3268c = z;
            return this;
        }
    }

    C0932o(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        this.f3259a = z;
        this.f3260b = i;
        this.f3261c = z2;
        this.f3262d = i2;
        this.f3263e = i3;
        this.f3264f = i4;
        this.f3265g = i5;
    }

    /* renamed from: a */
    public int m5925a() {
        return this.f3262d;
    }

    /* renamed from: b */
    public int m5924b() {
        return this.f3263e;
    }

    /* renamed from: c */
    public int m5923c() {
        return this.f3264f;
    }

    /* renamed from: d */
    public int m5922d() {
        return this.f3265g;
    }

    /* renamed from: e */
    public int m5921e() {
        return this.f3260b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0932o.class != obj.getClass()) {
            return false;
        }
        C0932o c0932o = (C0932o) obj;
        return this.f3259a == c0932o.f3259a && this.f3260b == c0932o.f3260b && this.f3261c == c0932o.f3261c && this.f3262d == c0932o.f3262d && this.f3263e == c0932o.f3263e && this.f3264f == c0932o.f3264f && this.f3265g == c0932o.f3265g;
    }

    /* renamed from: f */
    public boolean m5920f() {
        return this.f3261c;
    }

    /* renamed from: g */
    public boolean m5919g() {
        return this.f3259a;
    }

    public int hashCode() {
        return ((((((((((((m5919g() ? 1 : 0) * 31) + m5921e()) * 31) + (m5920f() ? 1 : 0)) * 31) + m5925a()) * 31) + m5924b()) * 31) + m5923c()) * 31) + m5922d();
    }
}
