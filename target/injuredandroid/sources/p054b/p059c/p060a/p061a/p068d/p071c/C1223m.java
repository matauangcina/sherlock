package p054b.p059c.p060a.p061a.p068d.p071c;
/* renamed from: b.c.a.a.d.c.m */
/* loaded from: classes.dex */
public final class C1223m {
    /* renamed from: a */
    public static int m4699a(int i, int i2) {
        String m4660b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                m4660b = C1244t.m4660b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                m4660b = C1244t.m4660b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(m4660b);
        }
        return i;
    }

    /* renamed from: b */
    public static int m4698b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m4694f(i, i2, str));
        }
        return i;
    }

    /* renamed from: c */
    public static <T> T m4697c(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: d */
    public static void m4696d(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m4694f(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m4694f(i2, i3, "end index") : C1244t.m4660b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: e */
    public static int m4695e(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m4694f(i, i2, "index"));
        }
        return i;
    }

    /* renamed from: f */
    private static String m4694f(int i, int i2, String str) {
        if (i < 0) {
            return C1244t.m4660b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C1244t.m4660b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
