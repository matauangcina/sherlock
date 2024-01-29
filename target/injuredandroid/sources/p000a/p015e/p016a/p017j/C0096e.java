package p000a.p015e.p016a.p017j;

import p000a.p015e.p016a.C0083c;
import p000a.p015e.p016a.C0090i;
/* renamed from: a.e.a.j.e */
/* loaded from: classes.dex */
public class C0096e {

    /* renamed from: b */
    final C0101f f360b;

    /* renamed from: c */
    final EnumC0100d f361c;

    /* renamed from: d */
    C0096e f362d;

    /* renamed from: h */
    private int f366h;

    /* renamed from: i */
    C0090i f367i;

    /* renamed from: a */
    private C0110l f359a = new C0110l(this);

    /* renamed from: e */
    public int f363e = 0;

    /* renamed from: f */
    int f364f = -1;

    /* renamed from: g */
    private EnumC0099c f365g = EnumC0099c.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a.j.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0097a {

        /* renamed from: a */
        static final /* synthetic */ int[] f368a;

        static {
            int[] iArr = new int[EnumC0100d.values().length];
            f368a = iArr;
            try {
                iArr[EnumC0100d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f368a[EnumC0100d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f368a[EnumC0100d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f368a[EnumC0100d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f368a[EnumC0100d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f368a[EnumC0100d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f368a[EnumC0100d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f368a[EnumC0100d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f368a[EnumC0100d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: a.e.a.j.e$b */
    /* loaded from: classes.dex */
    public enum EnumC0098b {
        RELAXED,
        STRICT
    }

    /* renamed from: a.e.a.j.e$c */
    /* loaded from: classes.dex */
    public enum EnumC0099c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: a.e.a.j.e$d */
    /* loaded from: classes.dex */
    public enum EnumC0100d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0096e(C0101f c0101f, EnumC0100d enumC0100d) {
        EnumC0098b enumC0098b = EnumC0098b.RELAXED;
        this.f366h = 0;
        this.f360b = c0101f;
        this.f361c = enumC0100d;
    }

    /* renamed from: a */
    public boolean m9217a(C0096e c0096e, int i, int i2, EnumC0099c enumC0099c, int i3, boolean z) {
        if (c0096e == null) {
            this.f362d = null;
            this.f363e = 0;
            this.f364f = -1;
            this.f365g = EnumC0099c.NONE;
            this.f366h = 2;
            return true;
        } else if (z || m9206l(c0096e)) {
            this.f362d = c0096e;
            if (i > 0) {
                this.f363e = i;
            } else {
                this.f363e = 0;
            }
            this.f364f = i2;
            this.f365g = enumC0099c;
            this.f366h = i3;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m9216b(C0096e c0096e, int i, EnumC0099c enumC0099c, int i2) {
        return m9217a(c0096e, i, -1, enumC0099c, i2, false);
    }

    /* renamed from: c */
    public int m9215c() {
        return this.f366h;
    }

    /* renamed from: d */
    public int m9214d() {
        C0096e c0096e;
        if (this.f360b.m9199C() == 8) {
            return 0;
        }
        return (this.f364f <= -1 || (c0096e = this.f362d) == null || c0096e.f360b.m9199C() != 8) ? this.f363e : this.f364f;
    }

    /* renamed from: e */
    public C0101f m9213e() {
        return this.f360b;
    }

    /* renamed from: f */
    public C0110l m9212f() {
        return this.f359a;
    }

    /* renamed from: g */
    public C0090i m9211g() {
        return this.f367i;
    }

    /* renamed from: h */
    public EnumC0099c m9210h() {
        return this.f365g;
    }

    /* renamed from: i */
    public C0096e m9209i() {
        return this.f362d;
    }

    /* renamed from: j */
    public EnumC0100d m9208j() {
        return this.f361c;
    }

    /* renamed from: k */
    public boolean m9207k() {
        return this.f362d != null;
    }

    /* renamed from: l */
    public boolean m9206l(C0096e c0096e) {
        boolean z = false;
        if (c0096e == null) {
            return false;
        }
        EnumC0100d m9208j = c0096e.m9208j();
        EnumC0100d enumC0100d = this.f361c;
        if (m9208j == enumC0100d) {
            return enumC0100d != EnumC0100d.BASELINE || (c0096e.m9213e().m9189I() && m9213e().m9189I());
        }
        switch (C0097a.f368a[enumC0100d.ordinal()]) {
            case 1:
                return (m9208j == EnumC0100d.BASELINE || m9208j == EnumC0100d.CENTER_X || m9208j == EnumC0100d.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = m9208j == EnumC0100d.LEFT || m9208j == EnumC0100d.RIGHT;
                if (c0096e.m9213e() instanceof C0106i) {
                    return (z2 || m9208j == EnumC0100d.CENTER_X) ? true : true;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = m9208j == EnumC0100d.TOP || m9208j == EnumC0100d.BOTTOM;
                if (c0096e.m9213e() instanceof C0106i) {
                    return (z3 || m9208j == EnumC0100d.CENTER_Y) ? true : true;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f361c.name());
        }
    }

    /* renamed from: m */
    public void m9205m() {
        this.f362d = null;
        this.f363e = 0;
        this.f364f = -1;
        this.f365g = EnumC0099c.STRONG;
        this.f366h = 0;
        EnumC0098b enumC0098b = EnumC0098b.RELAXED;
        this.f359a.mo9066e();
    }

    /* renamed from: n */
    public void m9204n(C0083c c0083c) {
        C0090i c0090i = this.f367i;
        if (c0090i == null) {
            this.f367i = new C0090i(C0090i.EnumC0091a.UNRESTRICTED, null);
        } else {
            c0090i.m9239d();
        }
    }

    public String toString() {
        return this.f360b.m9152n() + ":" + this.f361c.toString();
    }
}
