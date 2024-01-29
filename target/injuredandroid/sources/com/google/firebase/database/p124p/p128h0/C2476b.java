package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.C2306b;
import com.google.firebase.database.p124p.AbstractC2503i;
import com.google.firebase.database.p124p.C2506l;
/* renamed from: com.google.firebase.database.p.h0.b */
/* loaded from: classes.dex */
public class C2476b implements InterfaceC2479e {

    /* renamed from: a */
    private final C2506l f6461a;

    /* renamed from: b */
    private final AbstractC2503i f6462b;

    /* renamed from: c */
    private final C2306b f6463c;

    public C2476b(AbstractC2503i abstractC2503i, C2306b c2306b, C2506l c2506l) {
        this.f6462b = abstractC2503i;
        this.f6461a = c2506l;
        this.f6463c = c2306b;
    }

    @Override // com.google.firebase.database.p124p.p128h0.InterfaceC2479e
    /* renamed from: a */
    public void mo1486a() {
        this.f6462b.mo1408c(this.f6463c);
    }

    /* renamed from: b */
    public C2506l m1502b() {
        return this.f6461a;
    }

    @Override // com.google.firebase.database.p124p.p128h0.InterfaceC2479e
    public String toString() {
        return m1502b() + ":CANCEL";
    }
}
