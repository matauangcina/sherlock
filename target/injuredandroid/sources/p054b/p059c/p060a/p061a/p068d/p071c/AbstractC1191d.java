package p054b.p059c.p060a.p061a.p068d.p071c;
/* renamed from: b.c.a.a.d.c.d */
/* loaded from: classes.dex */
public abstract class AbstractC1191d {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m4727d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: a */
    public int mo4711a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C1223m.m4698b(i, length, "index");
        while (i < length) {
            if (mo4710b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public abstract boolean mo4710b(char c);
}
