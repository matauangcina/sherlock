package p054b.p059c.p094b.p097c;
/* renamed from: b.c.b.c.b */
/* loaded from: classes.dex */
final class C1412b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m4212a(String str, int i) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " (" + i + ") must be > 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m4211b(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
