package p000a.p019g.p027j;
/* renamed from: a.g.j.i */
/* loaded from: classes.dex */
public final class C0194i {
    /* renamed from: a */
    public static void m8868a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m8867b(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static <T> T m8866c(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: d */
    public static <T> T m8865d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
