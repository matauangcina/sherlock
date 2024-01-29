package p054b.p059c.p060a.p061a.p068d.p071c;
/* renamed from: b.c.a.a.d.c.f */
/* loaded from: classes.dex */
final class C1199f extends AbstractC1203g {

    /* renamed from: a */
    private final char f3931a = '.';

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1199f(char c) {
    }

    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1191d
    /* renamed from: b */
    public final boolean mo4710b(char c) {
        return c == this.f3931a;
    }

    public final String toString() {
        String m4727d;
        m4727d = AbstractC1191d.m4727d(this.f3931a);
        StringBuilder sb = new StringBuilder(String.valueOf(m4727d).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(m4727d);
        sb.append("')");
        return sb.toString();
    }
}
