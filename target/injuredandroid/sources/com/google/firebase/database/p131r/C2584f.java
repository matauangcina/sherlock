package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p131r.AbstractC2589k;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.r.f */
/* loaded from: classes.dex */
public class C2584f extends AbstractC2589k<C2584f> {

    /* renamed from: h */
    private final Double f6727h;

    public C2584f(Double d, InterfaceC2594n interfaceC2594n) {
        super(interfaceC2594n);
        this.f6727h = d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2584f) {
            C2584f c2584f = (C2584f) obj;
            return this.f6727h.equals(c2584f.f6727h) && this.f6734f.equals(c2584f.f6734f);
        }
        return false;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: g */
    protected AbstractC2589k.EnumC2591b mo1062g() {
        return AbstractC2589k.EnumC2591b.Number;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public Object getValue() {
        return this.f6727h;
    }

    public int hashCode() {
        return this.f6727h.hashCode() + this.f6734f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: m */
    public int mo1063d(C2584f c2584f) {
        return this.f6727h.compareTo(c2584f.f6727h);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: s */
    public C2584f mo1061j(InterfaceC2594n interfaceC2594n) {
        return new C2584f(this.f6727h, interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: v */
    public String mo1058v(InterfaceC2594n.EnumC2596b enumC2596b) {
        return (m1095i(enumC2596b) + "number:") + C2472l.m1522c(this.f6727h.doubleValue());
    }
}
