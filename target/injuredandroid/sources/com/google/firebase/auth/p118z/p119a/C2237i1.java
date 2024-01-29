package com.google.firebase.auth.p118z.p119a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.AbstractC2126b;
import com.google.firebase.auth.FirebaseAuth;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.firebase.auth.z.a.i1 */
/* loaded from: classes.dex */
public final class C2237i1<ResultT, CallbackT> implements InterfaceC2213a1<ResultT> {

    /* renamed from: a */
    private final AbstractC2272z0<ResultT, CallbackT> f6005a;

    /* renamed from: b */
    private final C1289h<ResultT> f6006b;

    public C2237i1(AbstractC2272z0<ResultT, CallbackT> abstractC2272z0, C1289h<ResultT> c1289h) {
        this.f6005a = abstractC2272z0;
        this.f6006b = c1289h;
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2213a1
    /* renamed from: a */
    public final void mo2236a(ResultT resultt, Status status) {
        C1679r.m3630i(this.f6006b, "completion source cannot be null");
        if (status == null) {
            this.f6006b.m4608c(resultt);
            return;
        }
        AbstractC2272z0<ResultT, CallbackT> abstractC2272z0 = this.f6005a;
        if (abstractC2272z0.f6057s != null) {
            C1289h<ResultT> c1289h = this.f6006b;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(abstractC2272z0.f6041c);
            AbstractC2272z0<ResultT, CallbackT> abstractC2272z02 = this.f6005a;
            c1289h.m4609b(C2250o0.m2223c(firebaseAuth, abstractC2272z02.f6057s, ("reauthenticateWithCredential".equals(abstractC2272z02.mo2165c()) || "reauthenticateWithCredentialWithData".equals(this.f6005a.mo2165c())) ? this.f6005a.f6042d : null));
            return;
        }
        AbstractC2126b abstractC2126b = abstractC2272z0.f6054p;
        if (abstractC2126b != null) {
            this.f6006b.m4609b(C2250o0.m2224b(status, abstractC2126b, abstractC2272z0.f6055q, abstractC2272z0.f6056r));
        } else {
            this.f6006b.m4609b(C2250o0.m2225a(status));
        }
    }
}
