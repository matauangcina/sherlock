package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: classes.dex */
class C0633o0 {

    /* renamed from: a */
    private int f2124a = 0;

    /* renamed from: b */
    private int f2125b = 0;

    /* renamed from: c */
    private int f2126c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    private int f2127d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    private int f2128e = 0;

    /* renamed from: f */
    private int f2129f = 0;

    /* renamed from: g */
    private boolean f2130g = false;

    /* renamed from: h */
    private boolean f2131h = false;

    /* renamed from: a */
    public int m7314a() {
        return this.f2130g ? this.f2124a : this.f2125b;
    }

    /* renamed from: b */
    public int m7313b() {
        return this.f2124a;
    }

    /* renamed from: c */
    public int m7312c() {
        return this.f2125b;
    }

    /* renamed from: d */
    public int m7311d() {
        return this.f2130g ? this.f2125b : this.f2124a;
    }

    /* renamed from: e */
    public void m7310e(int i, int i2) {
        this.f2131h = false;
        if (i != Integer.MIN_VALUE) {
            this.f2128e = i;
            this.f2124a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2129f = i2;
            this.f2125b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m7309f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f2130g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f2130g = r2
            boolean r0 = r1.f2131h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f2127d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f2128e
        L16:
            r1.f2124a = r2
            int r2 = r1.f2126c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f2126c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f2128e
        L24:
            r1.f2124a = r2
            int r2 = r1.f2127d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f2128e
            r1.f2124a = r2
        L2f:
            int r2 = r1.f2129f
        L31:
            r1.f2125b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0633o0.m7309f(boolean):void");
    }

    /* renamed from: g */
    public void m7308g(int i, int i2) {
        this.f2126c = i;
        this.f2127d = i2;
        this.f2131h = true;
        if (this.f2130g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2124a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2125b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2124a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2125b = i2;
        }
    }
}
