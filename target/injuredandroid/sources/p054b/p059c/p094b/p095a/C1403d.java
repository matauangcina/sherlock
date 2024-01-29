package p054b.p059c.p094b.p095a;
/* renamed from: b.c.b.a.d */
/* loaded from: classes.dex */
public final class C1403d {
    /* renamed from: a */
    public static void m4232a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m4231b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m4230c(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C1404e.m4224a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: d */
    public static void m4229d(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C1404e.m4224a(str, Character.valueOf(c), obj));
        }
    }

    /* renamed from: e */
    public static void m4228e(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C1404e.m4224a(str, obj));
        }
    }

    /* renamed from: f */
    public static void m4227f(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C1404e.m4224a(str, obj, obj2));
        }
    }

    /* renamed from: g */
    public static <T> T m4226g(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: h */
    public static <T> T m4225h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
