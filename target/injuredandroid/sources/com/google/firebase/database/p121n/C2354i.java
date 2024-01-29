package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.InterfaceC2351h;
/* renamed from: com.google.firebase.database.n.i */
/* loaded from: classes.dex */
public class C2354i<K, V> extends AbstractC2355j<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2354i(K k, V v) {
        super(k, v, C2350g.m1970j(), C2350g.m1970j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2354i(K k, V v, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2) {
        super(k, v, interfaceC2351h, interfaceC2351h2);
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: c */
    public boolean mo1969c() {
        return true;
    }

    @Override // com.google.firebase.database.p121n.AbstractC2355j
    /* renamed from: l */
    protected AbstractC2355j<K, V> mo1958l(K k, V v, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2) {
        if (k == null) {
            k = getKey();
        }
        if (v == null) {
            v = getValue();
        }
        if (interfaceC2351h == null) {
            interfaceC2351h = mo1968a();
        }
        if (interfaceC2351h2 == null) {
            interfaceC2351h2 = mo1966d();
        }
        return new C2354i(k, v, interfaceC2351h, interfaceC2351h2);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2355j
    /* renamed from: n */
    protected InterfaceC2351h.EnumC2352a mo1956n() {
        return InterfaceC2351h.EnumC2352a.RED;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public int size() {
        return mo1968a().size() + 1 + mo1966d().size();
    }
}
