package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import p000a.p015e.p016a.p017j.C0101f;
/* renamed from: a.e.a.j.d */
/* loaded from: classes.dex */
public class C0095d {

    /* renamed from: a */
    protected C0101f f342a;

    /* renamed from: b */
    protected C0101f f343b;

    /* renamed from: c */
    protected C0101f f344c;

    /* renamed from: d */
    protected C0101f f345d;

    /* renamed from: e */
    protected C0101f f346e;

    /* renamed from: f */
    protected C0101f f347f;

    /* renamed from: g */
    protected C0101f f348g;

    /* renamed from: h */
    protected ArrayList<C0101f> f349h;

    /* renamed from: i */
    protected int f350i;

    /* renamed from: j */
    protected int f351j;

    /* renamed from: k */
    protected float f352k = 0.0f;

    /* renamed from: l */
    private int f353l;

    /* renamed from: m */
    private boolean f354m;

    /* renamed from: n */
    protected boolean f355n;

    /* renamed from: o */
    protected boolean f356o;

    /* renamed from: p */
    protected boolean f357p;

    /* renamed from: q */
    private boolean f358q;

    public C0095d(C0101f c0101f, int i, boolean z) {
        this.f354m = false;
        this.f342a = c0101f;
        this.f353l = i;
        this.f354m = z;
    }

    /* renamed from: b */
    private void m9219b() {
        int i = this.f353l * 2;
        C0101f c0101f = this.f342a;
        boolean z = false;
        C0101f c0101f2 = c0101f;
        boolean z2 = false;
        while (!z2) {
            this.f350i++;
            C0101f[] c0101fArr = c0101f.f430i0;
            int i2 = this.f353l;
            C0101f c0101f3 = null;
            c0101fArr[i2] = null;
            c0101f.f428h0[i2] = null;
            if (c0101f.m9199C() != 8) {
                if (this.f343b == null) {
                    this.f343b = c0101f;
                }
                this.f345d = c0101f;
                C0101f.EnumC0103b[] enumC0103bArr = c0101f.f389C;
                int i3 = this.f353l;
                if (enumC0103bArr[i3] == C0101f.EnumC0103b.MATCH_CONSTRAINT) {
                    int[] iArr = c0101f.f425g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f351j++;
                        float[] fArr = c0101f.f426g0;
                        int i4 = this.f353l;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.f352k += fArr[i4];
                        }
                        if (m9218c(c0101f, this.f353l)) {
                            if (f < 0.0f) {
                                this.f355n = true;
                            } else {
                                this.f356o = true;
                            }
                            if (this.f349h == null) {
                                this.f349h = new ArrayList<>();
                            }
                            this.f349h.add(c0101f);
                        }
                        if (this.f347f == null) {
                            this.f347f = c0101f;
                        }
                        C0101f c0101f4 = this.f348g;
                        if (c0101f4 != null) {
                            c0101f4.f428h0[this.f353l] = c0101f;
                        }
                        this.f348g = c0101f;
                    }
                }
            }
            if (c0101f2 != c0101f) {
                c0101f2.f430i0[this.f353l] = c0101f;
            }
            C0096e c0096e = c0101f.f387A[i + 1].f362d;
            if (c0096e != null) {
                C0101f c0101f5 = c0096e.f360b;
                C0096e[] c0096eArr = c0101f5.f387A;
                if (c0096eArr[i].f362d != null && c0096eArr[i].f362d.f360b == c0101f) {
                    c0101f3 = c0101f5;
                }
            }
            if (c0101f3 == null) {
                c0101f3 = c0101f;
                z2 = true;
            }
            c0101f2 = c0101f;
            c0101f = c0101f3;
        }
        this.f344c = c0101f;
        if (this.f353l == 0 && this.f354m) {
            this.f346e = c0101f;
        } else {
            this.f346e = this.f342a;
        }
        if (this.f356o && this.f355n) {
            z = true;
        }
        this.f357p = z;
    }

    /* renamed from: c */
    private static boolean m9218c(C0101f c0101f, int i) {
        if (c0101f.m9199C() != 8 && c0101f.f389C[i] == C0101f.EnumC0103b.MATCH_CONSTRAINT) {
            int[] iArr = c0101f.f425g;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m9220a() {
        if (!this.f358q) {
            m9219b();
        }
        this.f358q = true;
    }
}
