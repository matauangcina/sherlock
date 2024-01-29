package com.google.firebase.auth.p118z.p119a;

import com.google.android.gms.common.api.C1626m;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.InterfaceC1282a;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [ResultT] */
/* renamed from: com.google.firebase.auth.z.a.h */
/* loaded from: classes.dex */
public final class C2232h<ResultT> implements InterfaceC1282a<ResultT, AbstractC1288g<ResultT>> {

    /* renamed from: a */
    private final /* synthetic */ InterfaceC2223e f5996a;

    /* renamed from: b */
    private final /* synthetic */ C2235i f5997b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2232h(C2235i c2235i, InterfaceC2223e interfaceC2223e) {
        this.f5997b = c2235i;
        this.f5996a = interfaceC2223e;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.InterfaceC1282a
    /* renamed from: a */
    public final /* synthetic */ Object mo2252a(AbstractC1288g abstractC1288g) {
        if (abstractC1288g.mo4581i() instanceof C1626m) {
            C2235i c2235i = this.f5997b;
            InterfaceC2223e interfaceC2223e = this.f5996a;
            interfaceC2223e.mo2162b();
            return c2235i.m2264b(interfaceC2223e);
        }
        return abstractC1288g;
    }
}
