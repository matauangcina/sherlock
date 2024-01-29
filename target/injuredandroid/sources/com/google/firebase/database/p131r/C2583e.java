package com.google.firebase.database.p131r;

import com.google.firebase.database.p131r.AbstractC2589k;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Map;
/* renamed from: com.google.firebase.database.r.e */
/* loaded from: classes.dex */
public class C2583e extends AbstractC2589k<C2583e> {

    /* renamed from: h */
    private Map<Object, Object> f6726h;

    public C2583e(Map<Object, Object> map, InterfaceC2594n interfaceC2594n) {
        super(interfaceC2594n);
        this.f6726h = map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2583e) {
            C2583e c2583e = (C2583e) obj;
            return this.f6726h.equals(c2583e.f6726h) && this.f6734f.equals(c2583e.f6734f);
        }
        return false;
    }

    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: g */
    protected AbstractC2589k.EnumC2591b mo1062g() {
        return AbstractC2589k.EnumC2591b.DeferredValue;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    public Object getValue() {
        return this.f6726h;
    }

    public int hashCode() {
        return this.f6726h.hashCode() + this.f6734f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p131r.AbstractC2589k
    /* renamed from: m */
    public int mo1063d(C2583e c2583e) {
        return 0;
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: s */
    public C2583e mo1061j(InterfaceC2594n interfaceC2594n) {
        return new C2583e(this.f6726h, interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: v */
    public String mo1058v(InterfaceC2594n.EnumC2596b enumC2596b) {
        return m1095i(enumC2596b) + "deferredValue:" + this.f6726h;
    }
}
