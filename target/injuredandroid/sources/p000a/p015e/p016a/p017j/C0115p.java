package p000a.p015e.p016a.p017j;

import java.util.ArrayList;
import p000a.p015e.p016a.C0083c;
/* renamed from: a.e.a.j.p */
/* loaded from: classes.dex */
public class C0115p extends C0101f {

    /* renamed from: k0 */
    protected ArrayList<C0101f> f521k0 = new ArrayList<>();

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: F0 */
    public void mo9060F0() {
        super.mo9060F0();
        ArrayList<C0101f> arrayList = this.f521k0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0101f c0101f = this.f521k0.get(i);
            c0101f.mo9052n0(m9149p(), m9147q());
            if (!(c0101f instanceof C0104g)) {
                c0101f.mo9060F0();
            }
        }
    }

    /* renamed from: I0 */
    public void m9059I0(C0101f c0101f) {
        this.f521k0.add(c0101f);
        if (c0101f.m9139u() != null) {
            ((C0115p) c0101f.m9139u()).m9056L0(c0101f);
        }
        c0101f.m9148p0(this);
    }

    /* renamed from: J0 */
    public C0104g m9058J0() {
        C0101f m9139u = m9139u();
        C0104g c0104g = this instanceof C0104g ? (C0104g) this : null;
        while (m9139u != null) {
            C0101f m9139u2 = m9139u.m9139u();
            if (m9139u instanceof C0104g) {
                c0104g = (C0104g) m9139u;
            }
            m9139u = m9139u2;
        }
        return c0104g;
    }

    /* renamed from: K0 */
    public void mo9057K0() {
        mo9060F0();
        ArrayList<C0101f> arrayList = this.f521k0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0101f c0101f = this.f521k0.get(i);
            if (c0101f instanceof C0115p) {
                ((C0115p) c0101f).mo9057K0();
            }
        }
    }

    /* renamed from: L0 */
    public void m9056L0(C0101f c0101f) {
        this.f521k0.remove(c0101f);
        c0101f.m9148p0(null);
    }

    /* renamed from: M0 */
    public void m9055M0() {
        this.f521k0.clear();
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: Q */
    public void mo9054Q() {
        this.f521k0.clear();
        super.mo9054Q();
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: T */
    public void mo9053T(C0083c c0083c) {
        super.mo9053T(c0083c);
        int size = this.f521k0.size();
        for (int i = 0; i < size; i++) {
            this.f521k0.get(i).mo9053T(c0083c);
        }
    }

    @Override // p000a.p015e.p016a.p017j.C0101f
    /* renamed from: n0 */
    public void mo9052n0(int i, int i2) {
        super.mo9052n0(i, i2);
        int size = this.f521k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f521k0.get(i3).mo9052n0(m9129z(), m9203A());
        }
    }
}
