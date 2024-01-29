package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.internal.AbstractC1600m;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [A, ResultT] */
/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes.dex */
public final class C1589g0<A, ResultT> extends AbstractC1600m<A, ResultT> {

    /* renamed from: c */
    private final /* synthetic */ AbstractC1600m.C1601a f4690c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589g0(AbstractC1600m.C1601a c1601a, C1146c[] c1146cArr, boolean z) {
        super(c1146cArr, z);
        this.f4690c = c1601a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect types in method signature: (TA;Lb/c/a/a/f/h<TResultT;>;)V */
    @Override // com.google.android.gms.common.api.internal.AbstractC1600m
    /* renamed from: b */
    public final void mo3814b(C1548a.InterfaceC1550b interfaceC1550b, C1289h c1289h) {
        InterfaceC1596k interfaceC1596k;
        interfaceC1596k = this.f4690c.f4701a;
        interfaceC1596k.accept(interfaceC1550b, c1289h);
    }
}
