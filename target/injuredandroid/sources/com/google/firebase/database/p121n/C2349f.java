package com.google.firebase.database.p121n;

import com.google.firebase.database.p121n.InterfaceC2351h;
/* renamed from: com.google.firebase.database.n.f */
/* loaded from: classes.dex */
public class C2349f<K, V> extends AbstractC2355j<K, V> {

    /* renamed from: e */
    private int f6176e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2349f(K k, V v, InterfaceC2351h<K, V> interfaceC2351h, InterfaceC2351h<K, V> interfaceC2351h2) {
        super(k, v, interfaceC2351h, interfaceC2351h2);
        this.f6176e = -1;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    /* renamed from: c */
    public boolean mo1969c() {
        return false;
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
        return new C2349f(k, v, interfaceC2351h, interfaceC2351h2);
    }

    @Override // com.google.firebase.database.p121n.AbstractC2355j
    /* renamed from: n */
    protected InterfaceC2351h.EnumC2352a mo1956n() {
        return InterfaceC2351h.EnumC2352a.BLACK;
    }

    @Override // com.google.firebase.database.p121n.InterfaceC2351h
    public int size() {
        if (this.f6176e == -1) {
            this.f6176e = mo1968a().size() + 1 + mo1966d().size();
        }
        return this.f6176e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.database.p121n.AbstractC2355j
    /* renamed from: u */
    public void mo1949u(InterfaceC2351h<K, V> interfaceC2351h) {
        if (this.f6176e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.mo1949u(interfaceC2351h);
    }
}
