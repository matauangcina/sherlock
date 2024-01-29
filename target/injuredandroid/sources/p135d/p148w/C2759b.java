package p135d.p148w;
/* renamed from: d.w.b */
/* loaded from: classes.dex */
class C2759b extends C2758a {
    /* renamed from: b */
    public static final boolean m825b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }
}
