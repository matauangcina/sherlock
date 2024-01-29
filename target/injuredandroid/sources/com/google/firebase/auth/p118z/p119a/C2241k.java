package com.google.firebase.auth.p118z.p119a;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.AbstractC1600m;
import com.google.android.gms.common.api.internal.InterfaceC1596k;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.C2194p;
import com.google.firebase.auth.internal.C2162k;
import com.google.firebase.auth.internal.InterfaceC2146c;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1201f1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1224m0;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.z.a.k */
/* loaded from: classes.dex */
public final class C2241k extends AbstractC2272z0<C2194p, InterfaceC2146c> {

    /* renamed from: y */
    private final C1224m0 f6009y;

    public C2241k(String str) {
        super(1);
        C1679r.m3632g(str, "refresh token cannot be null");
        this.f6009y = new C1224m0(str);
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2223e
    /* renamed from: a */
    public final AbstractC1600m<InterfaceC2248n0, C2194p> mo2166a() {
        AbstractC1600m.C1601a m3815a = AbstractC1600m.m3815a();
        m3815a.m3809c(false);
        m3815a.m3808d((this.f6058t || this.f6059u) ? null : new C1146c[]{C1201f1.f3937b});
        m3815a.m3810b(new InterfaceC1596k(this) { // from class: com.google.firebase.auth.z.a.j

            /* renamed from: a */
            private final C2241k f6007a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f6007a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC1596k
            public final void accept(Object obj, Object obj2) {
                this.f6007a.m2234q((InterfaceC2248n0) obj, (C1289h) obj2);
            }
        });
        return m3815a.m3811a();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2223e
    /* renamed from: c */
    public final String mo2165c() {
        return "getAccessToken";
    }

    @Override // com.google.firebase.auth.p118z.p119a.AbstractC2272z0
    /* renamed from: o */
    public final void mo2150o() {
        if (TextUtils.isEmpty(this.f6048j.m4673j())) {
            this.f6048j.m4676b(this.f6009y.m4693b());
        }
        ((InterfaceC2146c) this.f6043e).mo2288a(this.f6048j, this.f6042d);
        m2151n(C2162k.m2353a(this.f6048j.m4672k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m2234q(InterfaceC2248n0 interfaceC2248n0, C1289h c1289h) {
        this.f6045g = new C2237i1(this, c1289h);
        boolean z = this.f6058t;
        InterfaceC2258s0 mo2218c = interfaceC2248n0.mo2218c();
        if (z) {
            mo2218c.mo2188L(this.f6009y.m4693b(), this.f6040b);
        } else {
            mo2218c.mo2187M(this.f6009y, this.f6040b);
        }
    }
}
