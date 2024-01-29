package com.google.firebase.auth.p118z.p119a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1579d;
import com.google.android.gms.common.api.internal.InterfaceC1592i;
import com.google.android.gms.common.internal.AbstractC1658h;
import com.google.android.gms.common.internal.C1648d;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.dynamite.DynamiteModule;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p063b.C1151g;
import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p068d.p071c.C1201f1;
/* renamed from: com.google.firebase.auth.z.a.p0 */
/* loaded from: classes.dex */
public final class C2252p0 extends AbstractC1658h<InterfaceC2258s0> implements InterfaceC2248n0 {

    /* renamed from: z */
    private static C1155a f6021z = new C1155a("FirebaseAuth", "FirebaseAuth:");

    /* renamed from: x */
    private final Context f6022x;

    /* renamed from: y */
    private final C2264v0 f6023y;

    public C2252p0(Context context, Looper looper, C1648d c1648d, C2264v0 c2264v0, InterfaceC1579d interfaceC1579d, InterfaceC1592i interfaceC1592i) {
        super(context, looper, 112, c1648d, interfaceC1579d, interfaceC1592i);
        C1679r.m3631h(context);
        this.f6022x = context;
        this.f6023y = c2264v0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: D */
    protected final String mo2219D() {
        if (this.f6023y.f5988f) {
            f6021z.m4765d("Preparing to create service connection to fallback implementation", new Object[0]);
            return this.f6022x.getPackageName();
        }
        f6021z.m4765d("Preparing to create service connection to gms implementation", new Object[0]);
        return "com.google.android.gms";
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2248n0
    /* renamed from: c */
    public final /* synthetic */ InterfaceC2258s0 mo2218c() {
        return (InterfaceC2258s0) super.m3775C();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: f */
    protected final String mo2217f() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: h */
    protected final /* synthetic */ IInterface mo2216h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        return queryLocalInterface instanceof InterfaceC2258s0 ? (InterfaceC2258s0) queryLocalInterface : new C2260t0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c, com.google.android.gms.common.api.C1548a.InterfaceC1556f
    /* renamed from: j */
    public final boolean mo2215j() {
        return DynamiteModule.m3540a(this.f6022x, "com.google.firebase.auth") == 0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1658h, com.google.android.gms.common.internal.AbstractC1634c, com.google.android.gms.common.api.C1548a.InterfaceC1556f
    /* renamed from: k */
    public final int mo2214k() {
        return C1151g.f3867a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: r */
    protected final String mo2213r() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: w */
    public final C1146c[] mo2212w() {
        return C1201f1.f3939d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: z */
    public final Bundle mo2211z() {
        Bundle mo2211z = super.mo2211z();
        if (mo2211z == null) {
            mo2211z = new Bundle();
        }
        C2264v0 c2264v0 = this.f6023y;
        if (c2264v0 != null) {
            mo2211z.putString("com.google.firebase.auth.API_KEY", c2264v0.m2171d());
        }
        mo2211z.putString("com.google.firebase.auth.LIBRARY_VERSION", C2268x0.m2168a());
        return mo2211z;
    }
}
