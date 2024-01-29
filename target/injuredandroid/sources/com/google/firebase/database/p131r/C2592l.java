package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p131r.AbstractC2589k;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.r.l */
/* loaded from: classes.dex */
public class C2592l extends AbstractC2589k<C2592l> {

    /* renamed from: h */
    private final long f6742h;

    public C2592l(Long l, InterfaceC2594n interfaceC2594n) {
        super(interfaceC2594n);
        this.f6742h = l.longValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2592l) {
            C2592l c2592l = (C2592l) obj;
            return this.f6742h == c2592l.f6742h && this.f6734f.equals(c2592l.f6734f);
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
        return Long.valueOf(this.f6742h);
    }

    public int hashCode() {
        long j = this.f6742h;
        return ((int) (j ^ (j >>> 32))) + this.f6734f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: m */
    public int mo1063d(C2592l c2592l) {
        return C2472l.m1523b(this.f6742h, c2592l.f6742h);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: s */
    public C2592l mo1061j(InterfaceC2594n interfaceC2594n) {
        return new C2592l(Long.valueOf(this.f6742h), interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: v */
    public String mo1058v(InterfaceC2594n.EnumC2596b enumC2596b) {
        return (m1095i(enumC2596b) + "number:") + C2472l.m1522c(this.f6742h);
    }
}
