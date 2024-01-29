package p000a.p015e.p016a.p017j;

import java.util.Arrays;
/* renamed from: a.e.a.j.j */
/* loaded from: classes.dex */
public class C0108j extends C0101f {

    /* renamed from: k0 */
    protected C0101f[] f494k0 = new C0101f[4];

    /* renamed from: l0 */
    protected int f495l0 = 0;

    /* renamed from: I0 */
    public void m9090I0(C0101f c0101f) {
        int i = this.f495l0 + 1;
        C0101f[] c0101fArr = this.f494k0;
        if (i > c0101fArr.length) {
            this.f494k0 = (C0101f[]) Arrays.copyOf(c0101fArr, c0101fArr.length * 2);
        }
        C0101f[] c0101fArr2 = this.f494k0;
        int i2 = this.f495l0;
        c0101fArr2[i2] = c0101f;
        this.f495l0 = i2 + 1;
    }

    /* renamed from: J0 */
    public void m9089J0() {
        this.f495l0 = 0;
    }
}
