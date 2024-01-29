package com.google.firebase.auth.p118z.p119a;

import android.content.Context;
import com.google.android.gms.common.api.C1562e;
import java.util.concurrent.Callable;
import p054b.p059c.p098c.C1423f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.z.a.l0 */
/* loaded from: classes.dex */
public final class CallableC2244l0 implements Callable<C2211a<C2264v0>> {

    /* renamed from: a */
    private final C2264v0 f6012a;

    /* renamed from: b */
    private final Context f6013b;

    public CallableC2244l0(C2264v0 c2264v0, Context context) {
        this.f6012a = c2264v0;
        this.f6013b = context;
    }

    /* renamed from: a */
    private final C1562e<C2264v0> m2232a(boolean z, Context context) {
        C2264v0 c2264v0 = (C2264v0) this.f6012a.clone();
        c2264v0.f5988f = z;
        return new C2226f(context, C2262u0.f6031c, c2264v0, new C1423f());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == (-1)) goto L15;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.firebase.auth.p118z.p119a.C2211a<com.google.firebase.auth.p118z.p119a.C2264v0> call() {
        /*
            r6 = this;
            int r0 = com.google.firebase.auth.p118z.p119a.C2246m0.m2229b()
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 == r3) goto Lf
            int r0 = com.google.firebase.auth.p118z.p119a.C2246m0.m2227d()
            if (r0 != r3) goto L3d
        Lf:
            android.content.Context r0 = r6.f6013b
            java.lang.String r3 = "com.google.firebase.auth"
            int r0 = com.google.android.gms.dynamite.DynamiteModule.m3540a(r0, r3)
            if (r0 != 0) goto L1b
            r3 = 1
            goto L37
        L1b:
            b.c.a.a.b.d r3 = p054b.p059c.p060a.p061a.p063b.C1147d.m4800l()
            android.content.Context r4 = r6.f6013b
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r3 = r3.mo4785g(r4, r5)
            if (r3 == 0) goto L2f
            r4 = 2
            if (r3 == r4) goto L2f
            r3 = 0
            goto L37
        L2f:
            android.content.Context r3 = r6.f6013b
            java.lang.String r4 = "com.google.android.gms.firebase_auth"
            int r3 = com.google.android.gms.dynamite.DynamiteModule.m3539b(r3, r4)
        L37:
            com.google.firebase.auth.p118z.p119a.C2246m0.m2230a(r3)
            com.google.firebase.auth.p118z.p119a.C2246m0.m2228c(r0)
        L3d:
            int r0 = com.google.firebase.auth.p118z.p119a.C2246m0.m2227d()
            r3 = 0
            if (r0 == 0) goto L4b
            android.content.Context r0 = r6.f6013b
            com.google.android.gms.common.api.e r0 = r6.m2232a(r2, r0)
            goto L4c
        L4b:
            r0 = r3
        L4c:
            int r2 = com.google.firebase.auth.p118z.p119a.C2246m0.m2229b()
            if (r2 != 0) goto L53
            goto L59
        L53:
            android.content.Context r2 = r6.f6013b
            com.google.android.gms.common.api.e r3 = r6.m2232a(r1, r2)
        L59:
            com.google.firebase.auth.z.a.c r1 = new com.google.firebase.auth.z.a.c
            int r2 = com.google.firebase.auth.p118z.p119a.C2246m0.m2229b()
            int r4 = com.google.firebase.auth.p118z.p119a.C2246m0.m2227d()
            java.util.Map r5 = java.util.Collections.emptyMap()
            r1.<init>(r2, r4, r5)
            com.google.firebase.auth.z.a.a r2 = new com.google.firebase.auth.z.a.a
            r2.<init>(r3, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.p118z.p119a.CallableC2244l0.call():java.lang.Object");
    }
}
