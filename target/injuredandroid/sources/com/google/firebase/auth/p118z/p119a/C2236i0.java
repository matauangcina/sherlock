package com.google.firebase.auth.p118z.p119a;

import com.google.android.gms.common.api.internal.AbstractC1600m;
import com.google.android.gms.common.api.internal.InterfaceC1596k;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.C2128c;
import com.google.firebase.auth.internal.C2149d0;
import com.google.firebase.auth.internal.C2179x;
import com.google.firebase.auth.internal.InterfaceC2146c;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1181a1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1201f1;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.z.a.i0 */
/* loaded from: classes.dex */
public final class C2236i0 extends AbstractC2272z0<Object, InterfaceC2146c> {

    /* renamed from: y */
    private final C1181a1 f6004y;

    public C2236i0(C2128c c2128c) {
        super(2);
        C1679r.m3630i(c2128c, "credential cannot be null");
        this.f6004y = new C1181a1(c2128c);
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2223e
    /* renamed from: a */
    public final AbstractC1600m<InterfaceC2248n0, Object> mo2166a() {
        AbstractC1600m.C1601a m3815a = AbstractC1600m.m3815a();
        m3815a.m3809c(false);
        m3815a.m3808d((this.f6058t || this.f6059u) ? null : new C1146c[]{C1201f1.f3937b});
        m3815a.m3810b(new InterfaceC1596k(this) { // from class: com.google.firebase.auth.z.a.h0

            /* renamed from: a */
            private final C2236i0 f5998a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5998a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1596k
            public final void accept(Object obj, Object obj2) {
                this.f5998a.m2237q((InterfaceC2248n0) obj, (C1289h) obj2);
            }
        });
        return m3815a.m3811a();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2223e
    /* renamed from: c */
    public final String mo2165c() {
        return "sendSignInLinkToEmail";
    }

    @Override // com.google.firebase.auth.p118z.p119a.AbstractC2272z0
    /* renamed from: o */
    public final void mo2150o() {
        C2149d0 m2243n = C2235i.m2243n(this.f6041c, this.f6049k);
        ((InterfaceC2146c) this.f6043e).mo2288a(this.f6048j, m2243n);
        m2151n(new C2179x(m2243n));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m2237q(InterfaceC2248n0 interfaceC2248n0, C1289h c1289h) {
        this.f6045g = new C2237i1(this, c1289h);
        boolean z = this.f6058t;
        InterfaceC2258s0 mo2218c = interfaceC2248n0.mo2218c();
        if (z) {
            mo2218c.mo2183W(this.f6004y.m4734b(), this.f6040b);
        } else {
            mo2218c.mo2189K(this.f6004y, this.f6040b);
        }
    }
}
