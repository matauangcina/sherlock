package com.google.firebase.database.p124p.p127g0;
/* renamed from: com.google.firebase.database.p.g0.f */
/* loaded from: classes.dex */
public class C2462f implements InterfaceC2451a {

    /* renamed from: a */
    private final InterfaceC2451a f6442a;

    /* renamed from: b */
    private long f6443b;

    public C2462f(InterfaceC2451a interfaceC2451a, long j) {
        this.f6443b = 0L;
        this.f6442a = interfaceC2451a;
        this.f6443b = j;
    }

    @Override // com.google.firebase.database.p124p.p127g0.InterfaceC2451a
    /* renamed from: a */
    public long mo1544a() {
        return this.f6442a.mo1544a() + this.f6443b;
    }

    /* renamed from: b */
    public void m1543b(long j) {
        this.f6443b = j;
    }
}
