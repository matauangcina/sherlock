package com.google.firebase.database.p124p;

import com.google.firebase.database.C2306b;
import com.google.firebase.database.C2312h;
import com.google.firebase.database.InterfaceC2322l;
import com.google.firebase.database.p124p.p128h0.C2477c;
import com.google.firebase.database.p124p.p128h0.C2478d;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
/* renamed from: com.google.firebase.database.p.a0 */
/* loaded from: classes.dex */
public class C2410a0 extends AbstractC2503i {

    /* renamed from: d */
    private final C2509n f6338d;

    /* renamed from: e */
    private final InterfaceC2322l f6339e;

    /* renamed from: f */
    private final C2488i f6340f;

    public C2410a0(C2509n c2509n, InterfaceC2322l interfaceC2322l, C2488i c2488i) {
        this.f6338d = c2509n;
        this.f6339e = interfaceC2322l;
        this.f6340f = c2488i;
    }

    @Override // com.google.firebase.database.p124p.AbstractC2503i
    /* renamed from: a */
    public AbstractC2503i mo1410a(C2488i c2488i) {
        return new C2410a0(this.f6338d, this.f6339e, c2488i);
    }

    @Override // com.google.firebase.database.p124p.AbstractC2503i
    /* renamed from: b */
    public C2478d mo1409b(C2477c c2477c, C2488i c2488i) {
        return new C2478d(InterfaceC2479e.EnumC2480a.VALUE, this, C2312h.m2056a(C2312h.m2054c(this.f6338d, c2488i.m1456e()), c2477c.m1491k()), null);
    }

    @Override // com.google.firebase.database.p124p.AbstractC2503i
    /* renamed from: c */
    public void mo1408c(C2306b c2306b) {
        this.f6339e.mo2039a(c2306b);
    }

    @Override // com.google.firebase.database.p124p.AbstractC2503i
    /* renamed from: d */
    public void mo1407d(C2478d c2478d) {
        if (m1404g()) {
            return;
        }
        this.f6339e.mo2038b(c2478d.m1487c());
    }

    @Override // com.google.firebase.database.p124p.AbstractC2503i
    /* renamed from: e */
    public C2488i mo1406e() {
        return this.f6340f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2410a0) {
            C2410a0 c2410a0 = (C2410a0) obj;
            if (c2410a0.f6339e.equals(this.f6339e) && c2410a0.f6338d.equals(this.f6338d) && c2410a0.f6340f.equals(this.f6340f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.database.p124p.AbstractC2503i
    /* renamed from: f */
    public boolean mo1405f(AbstractC2503i abstractC2503i) {
        return (abstractC2503i instanceof C2410a0) && ((C2410a0) abstractC2503i).f6339e.equals(this.f6339e);
    }

    @Override // com.google.firebase.database.p124p.AbstractC2503i
    /* renamed from: h */
    public boolean mo1403h(InterfaceC2479e.EnumC2480a enumC2480a) {
        return enumC2480a == InterfaceC2479e.EnumC2480a.VALUE;
    }

    public int hashCode() {
        return (((this.f6339e.hashCode() * 31) + this.f6338d.hashCode()) * 31) + this.f6340f.hashCode();
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
