package com.google.firebase.database.p131r;

import com.google.firebase.database.p131r.AbstractC2589k;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.r.a */
/* loaded from: classes.dex */
public class C2569a extends AbstractC2589k<C2569a> {

    /* renamed from: h */
    private final boolean f6700h;

    public C2569a(Boolean bool, InterfaceC2594n interfaceC2594n) {
        super(interfaceC2594n);
        this.f6700h = bool.booleanValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2569a) {
            C2569a c2569a = (C2569a) obj;
            return this.f6700h == c2569a.f6700h && this.f6734f.equals(c2569a.f6734f);
        }
        return false;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: g */
    protected AbstractC2589k.EnumC2591b mo1062g() {
        return AbstractC2589k.EnumC2591b.Boolean;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public Object getValue() {
        return Boolean.valueOf(this.f6700h);
    }

    public int hashCode() {
        boolean z = this.f6700h;
        return (z ? 1 : 0) + this.f6734f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: m */
    public int mo1063d(C2569a c2569a) {
        boolean z = this.f6700h;
        if (z == c2569a.f6700h) {
            return 0;
        }
        return z ? 1 : -1;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: s */
    public C2569a mo1061j(InterfaceC2594n interfaceC2594n) {
        return new C2569a(Boolean.valueOf(this.f6700h), interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: v */
    public String mo1058v(InterfaceC2594n.EnumC2596b enumC2596b) {
        return m1095i(enumC2596b) + "boolean:" + this.f6700h;
    }
}
