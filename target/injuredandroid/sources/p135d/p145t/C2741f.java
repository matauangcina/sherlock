package p135d.p145t;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.t.f */
/* loaded from: classes.dex */
public class C2741f extends C2740e {
    /* renamed from: a */
    public static int m843a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: b */
    public static int m842b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: c */
    public static int m841c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: d */
    public static C2734a m840d(int i, int i2) {
        return C2734a.f6856i.m854a(i, i2, -1);
    }

    /* renamed from: e */
    public static C2737c m839e(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C2737c.f6865k.m849a() : new C2737c(i, i2 - 1);
    }
}
