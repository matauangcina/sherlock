package com.google.firebase.database.p124p.p128h0;

import com.google.firebase.database.C2305a;
import com.google.firebase.database.p124p.AbstractC2503i;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p128h0.InterfaceC2479e;
/* renamed from: com.google.firebase.database.p.h0.d */
/* loaded from: classes.dex */
public class C2478d implements InterfaceC2479e {

    /* renamed from: a */
    private final InterfaceC2479e.EnumC2480a f6468a;

    /* renamed from: b */
    private final AbstractC2503i f6469b;

    /* renamed from: c */
    private final C2305a f6470c;

    public C2478d(InterfaceC2479e.EnumC2480a enumC2480a, AbstractC2503i abstractC2503i, C2305a c2305a, String str) {
        this.f6468a = enumC2480a;
        this.f6469b = abstractC2503i;
        this.f6470c = c2305a;
    }

    @Override // com.google.firebase.database.p124p.p128h0.InterfaceC2479e
    /* renamed from: a */
    public void mo1486a() {
        this.f6469b.mo1407d(this);
    }

    /* renamed from: b */
    public C2506l m1488b() {
        C2506l m2048d = this.f6470c.m2076b().m2048d();
        return this.f6468a == InterfaceC2479e.EnumC2480a.VALUE ? m2048d : m2048d.m1383y();
    }

    /* renamed from: c */
    public C2305a m1487c() {
        return this.f6470c;
    }

    @Override // com.google.firebase.database.p124p.p128h0.InterfaceC2479e
    public String toString() {
        StringBuilder sb;
        if (this.f6468a == InterfaceC2479e.EnumC2480a.VALUE) {
            sb = new StringBuilder();
            sb.append(m1488b());
            sb.append(": ");
            sb.append(this.f6468a);
            sb.append(": ");
            sb.append(this.f6470c.m2074d(true));
        } else {
            sb = new StringBuilder();
            sb.append(m1488b());
            sb.append(": ");
            sb.append(this.f6468a);
            sb.append(": { ");
            sb.append(this.f6470c.m2077a());
            sb.append(": ");
            sb.append(this.f6470c.m2074d(true));
            sb.append(" }");
        }
        return sb.toString();
    }
}
