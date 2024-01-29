package com.google.firebase.auth.p118z.p119a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.AbstractC2126b;
import com.google.firebase.auth.C2202t;
import com.google.firebase.auth.internal.C2167m0;
import com.google.firebase.auth.internal.InterfaceC2154g;
import p054b.p059c.p060a.p061a.p068d.p071c.C1205g1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1209h1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1219k1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1225m1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1258x1;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.z.a.b1 */
/* loaded from: classes.dex */
public final class BinderC2216b1 extends AbstractBinderC2254q0 {

    /* renamed from: a */
    final /* synthetic */ AbstractC2272z0 f5982a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2216b1(AbstractC2272z0 abstractC2272z0) {
        this.f5982a = abstractC2272z0;
    }

    /* renamed from: g */
    private final void m2260g(Status status, AbstractC2126b abstractC2126b, String str, String str2) {
        this.f5982a.m2152m(status);
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6054p = abstractC2126b;
        abstractC2272z0.f6055q = str;
        abstractC2272z0.f6056r = str2;
        InterfaceC2154g interfaceC2154g = abstractC2272z0.f6044f;
        if (interfaceC2154g != null) {
            interfaceC2154g.mo2287e(status);
        }
        this.f5982a.m2156i(status);
    }

    /* renamed from: h */
    private final void m2259h(InterfaceC2231g1 interfaceC2231g1) {
        this.f5982a.f6047i.execute(new RunnableC2234h1(this, interfaceC2231g1));
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: A */
    public final void mo2208A() {
        boolean z = this.f5982a.f6039a == 5;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        this.f5982a.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: E */
    public final void mo2207E(C1209h1 c1209h1) {
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6057s = c1209h1;
        abstractC2272z0.m2156i(C2167m0.m2347a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: F */
    public final void mo2206F(C1258x1 c1258x1) {
        boolean z = this.f5982a.f6039a == 4;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6051m = c1258x1;
        abstractC2272z0.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: I */
    public final void mo2205I(C1237q1 c1237q1) {
        boolean z = this.f5982a.f6039a == 1;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6048j = c1237q1;
        abstractC2272z0.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: T */
    public final void mo2204T(C1205g1 c1205g1) {
        m2260g(c1205g1.m4715b(), c1205g1.m4714c(), c1205g1.m4713h(), c1205g1.m4712j());
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: a */
    public final void mo2203a() {
        boolean z = this.f5982a.f6039a == 6;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        this.f5982a.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: b */
    public final void mo2202b() {
        boolean z = this.f5982a.f6039a == 9;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        this.f5982a.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: e */
    public final void mo2201e(Status status) {
        String m3968c = status.m3968c();
        if (m3968c != null) {
            if (m3968c.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (m3968c.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (m3968c.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (m3968c.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (m3968c.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (m3968c.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (m3968c.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (m3968c.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (m3968c.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (m3968c.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        if (abstractC2272z0.f6039a != 8) {
            abstractC2272z0.m2152m(status);
            this.f5982a.m2156i(status);
            return;
        }
        AbstractC2272z0.m2153l(abstractC2272z0, true);
        this.f5982a.f6061w = false;
        m2259h(new C2225e1(this, status));
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: f */
    public final void mo2200f(String str) {
        boolean z = this.f5982a.f6039a == 7;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6052n = str;
        abstractC2272z0.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: i */
    public final void mo2199i(Status status, C2202t c2202t) {
        boolean z = this.f5982a.f6039a == 2;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        m2260g(status, c2202t, null, null);
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: o */
    public final void mo2198o(String str) {
        boolean z = this.f5982a.f6039a == 8;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6053o = str;
        AbstractC2272z0.m2153l(abstractC2272z0, true);
        this.f5982a.f6061w = true;
        m2259h(new C2228f1(this, str));
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: q */
    public final void mo2197q(C2202t c2202t) {
        boolean z = this.f5982a.f6039a == 8;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        AbstractC2272z0.m2153l(this.f5982a, true);
        this.f5982a.f6061w = true;
        m2259h(new C2219c1(this, c2202t));
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: t */
    public final void mo2196t(C1237q1 c1237q1, C1225m1 c1225m1) {
        boolean z = this.f5982a.f6039a == 2;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6048j = c1237q1;
        abstractC2272z0.f6049k = c1225m1;
        abstractC2272z0.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: w */
    public final void mo2195w(C1219k1 c1219k1) {
        boolean z = this.f5982a.f6039a == 3;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        AbstractC2272z0 abstractC2272z0 = this.f5982a;
        abstractC2272z0.f6050l = c1219k1;
        abstractC2272z0.m2149p();
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2256r0
    /* renamed from: z */
    public final void mo2194z(String str) {
        boolean z = this.f5982a.f6039a == 8;
        int i = this.f5982a.f6039a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        C1679r.m3628k(z, sb.toString());
        this.f5982a.f6053o = str;
        m2259h(new C2222d1(this, str));
    }
}
