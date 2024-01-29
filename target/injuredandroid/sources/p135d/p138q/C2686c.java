package p135d.p138q;
/* renamed from: d.q.c */
/* loaded from: classes.dex */
public final class C2686c {
    /* renamed from: a */
    private static final int m903a(int i, int i2, int i3) {
        return m901c(m901c(i, i3) - m901c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m902b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m903a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m903a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: c */
    private static final int m901c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
