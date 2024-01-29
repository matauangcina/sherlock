package p054b.p059c.p060a.p061a.p068d.p071c;
/* renamed from: b.c.a.a.d.c.r */
/* loaded from: classes.dex */
abstract class AbstractC1238r extends AbstractC1187c<String> {

    /* renamed from: h */
    final CharSequence f3994h;

    /* renamed from: i */
    private final AbstractC1191d f3995i;

    /* renamed from: j */
    private final boolean f3996j;

    /* renamed from: k */
    private int f3997k = 0;

    /* renamed from: l */
    private int f3998l;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1238r(C1220l c1220l, CharSequence charSequence) {
        AbstractC1191d abstractC1191d;
        int i;
        abstractC1191d = c1220l.f3962a;
        this.f3995i = abstractC1191d;
        this.f3996j = false;
        i = c1220l.f3964c;
        this.f3998l = i;
        this.f3994h = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r0 >= r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r6.f3995i.mo4710b(r6.f3994h.charAt(r0)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r1 <= r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r6.f3995i.mo4710b(r6.f3994h.charAt(r1 - 1)) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r6.f3996j == false) goto L45;
     */
    @Override // p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1187c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ java.lang.String mo4668a() {
        /*
            r6 = this;
        L0:
            int r0 = r6.f3997k
        L2:
            int r1 = r6.f3997k
            r2 = -1
            if (r1 == r2) goto L8e
            int r1 = r6.mo4667c(r1)
            if (r1 != r2) goto L16
            java.lang.CharSequence r1 = r6.f3994h
            int r1 = r1.length()
            r6.f3997k = r2
            goto L1c
        L16:
            int r3 = r6.mo4666d(r1)
            r6.f3997k = r3
        L1c:
            int r3 = r6.f3997k
            if (r3 != r0) goto L2f
            int r3 = r3 + 1
            r6.f3997k = r3
            java.lang.CharSequence r1 = r6.f3994h
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r6.f3997k = r2
            goto L2
        L2f:
            if (r0 >= r1) goto L42
            b.c.a.a.d.c.d r3 = r6.f3995i
            java.lang.CharSequence r4 = r6.f3994h
            char r4 = r4.charAt(r0)
            boolean r3 = r3.mo4710b(r4)
            if (r3 == 0) goto L42
            int r0 = r0 + 1
            goto L2f
        L42:
            if (r1 <= r0) goto L57
            b.c.a.a.d.c.d r3 = r6.f3995i
            java.lang.CharSequence r4 = r6.f3994h
            int r5 = r1 + (-1)
            char r4 = r4.charAt(r5)
            boolean r3 = r3.mo4710b(r4)
            if (r3 == 0) goto L57
            int r1 = r1 + (-1)
            goto L42
        L57:
            boolean r3 = r6.f3996j
            if (r3 == 0) goto L5e
            if (r0 != r1) goto L5e
            goto L0
        L5e:
            int r3 = r6.f3998l
            r4 = 1
            if (r3 != r4) goto L80
            java.lang.CharSequence r1 = r6.f3994h
            int r1 = r1.length()
            r6.f3997k = r2
        L6b:
            if (r1 <= r0) goto L83
            b.c.a.a.d.c.d r2 = r6.f3995i
            java.lang.CharSequence r3 = r6.f3994h
            int r4 = r1 + (-1)
            char r3 = r3.charAt(r4)
            boolean r2 = r2.mo4710b(r3)
            if (r2 == 0) goto L83
            int r1 = r1 + (-1)
            goto L6b
        L80:
            int r3 = r3 - r4
            r6.f3998l = r3
        L83:
            java.lang.CharSequence r2 = r6.f3994h
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L8e:
            r6.m4730b()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1238r.mo4668a():java.lang.Object");
    }

    /* renamed from: c */
    abstract int mo4667c(int i);

    /* renamed from: d */
    abstract int mo4666d(int i);
}
