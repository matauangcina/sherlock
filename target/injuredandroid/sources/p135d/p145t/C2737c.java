package p135d.p145t;

import p135d.p142s.p144d.C2723e;
/* renamed from: d.t.c */
/* loaded from: classes.dex */
public final class C2737c extends C2734a {

    /* renamed from: k */
    public static final C2738a f6865k = new C2738a(null);

    /* renamed from: j */
    private static final C2737c f6864j = new C2737c(1, 0);

    /* renamed from: d.t.c$a */
    /* loaded from: classes.dex */
    public static final class C2738a {
        private C2738a() {
        }

        public /* synthetic */ C2738a(C2723e c2723e) {
            this();
        }

        /* renamed from: a */
        public final C2737c m849a() {
            return C2737c.f6864j;
        }
    }

    public C2737c(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // p135d.p145t.C2734a
    public boolean equals(Object obj) {
        if (obj instanceof C2737c) {
            if (!isEmpty() || !((C2737c) obj).isEmpty()) {
                C2737c c2737c = (C2737c) obj;
                if (m858d() != c2737c.m858d() || m857e() != c2737c.m857e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p135d.p145t.C2734a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m858d() * 31) + m857e();
    }

    @Override // p135d.p145t.C2734a
    public boolean isEmpty() {
        return m858d() > m857e();
    }

    /* renamed from: l */
    public Integer m851l() {
        return Integer.valueOf(m857e());
    }

    /* renamed from: m */
    public Integer m850m() {
        return Integer.valueOf(m858d());
    }

    @Override // p135d.p145t.C2734a
    public String toString() {
        return m858d() + ".." + m857e();
    }
}
