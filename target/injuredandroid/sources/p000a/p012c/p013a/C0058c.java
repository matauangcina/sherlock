package p000a.p012c.p013a;

import android.content.res.ColorStateList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.c.a.c */
/* loaded from: classes.dex */
public class C0058c implements InterfaceC0062f {
    /* renamed from: n */
    private C0063g m9452n(InterfaceC0061e interfaceC0061e) {
        return (C0063g) interfaceC0061e.m9443f();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: a */
    public float mo9442a(InterfaceC0061e interfaceC0061e) {
        return m9452n(interfaceC0061e).m9427c();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: b */
    public ColorStateList mo9441b(InterfaceC0061e interfaceC0061e) {
        return m9452n(interfaceC0061e).m9428b();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: c */
    public void mo9440c(InterfaceC0061e interfaceC0061e, float f) {
        m9452n(interfaceC0061e).m9422h(f);
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: d */
    public float mo9439d(InterfaceC0061e interfaceC0061e) {
        return interfaceC0061e.m9447b().getElevation();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: e */
    public void mo9438e() {
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: f */
    public float mo9437f(InterfaceC0061e interfaceC0061e) {
        return m9452n(interfaceC0061e).m9426d();
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: g */
    public float mo9436g(InterfaceC0061e interfaceC0061e) {
        return mo9437f(interfaceC0061e) * 2.0f;
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: h */
    public float mo9435h(InterfaceC0061e interfaceC0061e) {
        return mo9437f(interfaceC0061e) * 2.0f;
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: i */
    public void mo9434i(InterfaceC0061e interfaceC0061e) {
        mo9430m(interfaceC0061e, mo9442a(interfaceC0061e));
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: j */
    public void mo9433j(InterfaceC0061e interfaceC0061e, float f) {
        interfaceC0061e.m9447b().setElevation(f);
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: k */
    public void mo9432k(InterfaceC0061e interfaceC0061e) {
        mo9430m(interfaceC0061e, mo9442a(interfaceC0061e));
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: l */
    public void mo9431l(InterfaceC0061e interfaceC0061e, ColorStateList colorStateList) {
        m9452n(interfaceC0061e).m9424f(colorStateList);
    }

    @Override // p000a.p012c.p013a.InterfaceC0062f
    /* renamed from: m */
    public void mo9430m(InterfaceC0061e interfaceC0061e, float f) {
        m9452n(interfaceC0061e).m9423g(f, interfaceC0061e.m9444e(), interfaceC0061e.m9445d());
        m9451o(interfaceC0061e);
    }

    /* renamed from: o */
    public void m9451o(InterfaceC0061e interfaceC0061e) {
        if (!interfaceC0061e.m9444e()) {
            interfaceC0061e.m9448a(0, 0, 0, 0);
            return;
        }
        float mo9442a = mo9442a(interfaceC0061e);
        float mo9437f = mo9437f(interfaceC0061e);
        int ceil = (int) Math.ceil(C0064h.m9418c(mo9442a, mo9437f, interfaceC0061e.m9445d()));
        int ceil2 = (int) Math.ceil(C0064h.m9417d(mo9442a, mo9437f, interfaceC0061e.m9445d()));
        interfaceC0061e.m9448a(ceil, ceil2, ceil, ceil2);
    }
}
