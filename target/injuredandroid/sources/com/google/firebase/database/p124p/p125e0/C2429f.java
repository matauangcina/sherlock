package com.google.firebase.database.p124p.p125e0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.p.e0.f */
/* loaded from: classes.dex */
public class C2429f extends AbstractC2425d {

    /* renamed from: d */
    private final InterfaceC2594n f6384d;

    public C2429f(C2427e c2427e, C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        super(AbstractC2425d.EnumC2426a.Overwrite, c2427e, c2506l);
        this.f6384d = interfaceC2594n;
    }

    @Override // com.google.firebase.database.p124p.p125e0.AbstractC2425d
    /* renamed from: d */
    public AbstractC2425d mo1695d(C2570b c2570b) {
        return this.f6370c.isEmpty() ? new C2429f(this.f6369b, C2506l.m1385w(), this.f6384d.mo1079b(c2570b)) : new C2429f(this.f6369b, this.f6370c.m1396A(), this.f6384d);
    }

    /* renamed from: e */
    public InterfaceC2594n m1694e() {
        return this.f6384d;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", m1702a(), m1701b(), this.f6384d);
    }
}
