package com.google.firebase.components;

import p054b.p059c.p098c.p101l.InterfaceC1435a;
/* renamed from: com.google.firebase.components.s */
/* loaded from: classes.dex */
public class C2300s<T> implements InterfaceC1435a<T> {

    /* renamed from: c */
    private static final Object f6101c = new Object();

    /* renamed from: a */
    private volatile Object f6102a = f6101c;

    /* renamed from: b */
    private volatile InterfaceC1435a<T> f6103b;

    public C2300s(InterfaceC1435a<T> interfaceC1435a) {
        this.f6103b = interfaceC1435a;
    }

    @Override // p054b.p059c.p098c.p101l.InterfaceC1435a
    public T get() {
        T t = (T) this.f6102a;
        if (t == f6101c) {
            synchronized (this) {
                t = this.f6102a;
                if (t == f6101c) {
                    t = this.f6103b.get();
                    this.f6102a = t;
                    this.f6103b = null;
                }
            }
        }
        return t;
    }
}
