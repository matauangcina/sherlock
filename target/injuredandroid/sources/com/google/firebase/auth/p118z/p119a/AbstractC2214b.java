package com.google.firebase.auth.p118z.p119a;

import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.C1562e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1600m;
import com.google.firebase.auth.p118z.p119a.AbstractC2220d;
import java.util.concurrent.Future;
import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p060a.p061a.p074f.C1292j;
/* renamed from: com.google.firebase.auth.z.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC2214b<T extends AbstractC2220d> {

    /* renamed from: b */
    private static C1155a f5979b = new C1155a("BiChannelGoogleApi", "FirebaseAuth: ");

    /* renamed from: a */
    private C2211a<T> f5980a;

    /* renamed from: a */
    private final C1562e<T> m2265a(String str) {
        C2211a<T> m2261f = m2261f();
        if (m2261f.f5977c.mo2255f(str)) {
            C1155a c1155a = f5979b;
            String valueOf = String.valueOf(m2261f.f5976b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("getGoogleApiForMethod() returned Fallback: ");
            sb.append(valueOf);
            c1155a.m4765d(sb.toString(), new Object[0]);
            return m2261f.f5976b;
        }
        C1155a c1155a2 = f5979b;
        String valueOf2 = String.valueOf(m2261f.f5975a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
        sb2.append("getGoogleApiForMethod() returned Gms: ");
        sb2.append(valueOf2);
        c1155a2.m4765d(sb2.toString(), new Object[0]);
        return m2261f.f5975a;
    }

    /* renamed from: d */
    private static <ResultT> AbstractC1288g<ResultT> m2263d() {
        return C1292j.m4605a(C2250o0.m2225a(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable")));
    }

    /* renamed from: f */
    private final C2211a<T> m2261f() {
        C2211a<T> c2211a;
        synchronized (this) {
            if (this.f5980a == null) {
                try {
                    this.f5980a = mo2251c().get();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to Google Play Services: ".concat(valueOf) : new String("There was an error while initializing the connection to Google Play Services: "));
                }
            }
            c2211a = this.f5980a;
        }
        return c2211a;
    }

    /* renamed from: b */
    public final <ResultT, A extends C1548a.InterfaceC1550b> AbstractC1288g<ResultT> m2264b(InterfaceC2223e<A, ResultT> interfaceC2223e) {
        C1562e<T> m2265a = m2265a(interfaceC2223e.mo2165c());
        if (m2265a == null) {
            return m2263d();
        }
        if (m2265a.m3943e().f5988f) {
            interfaceC2223e.mo2161d();
        }
        return (AbstractC1288g<ResultT>) m2265a.m3946b((AbstractC1600m<A, ResultT>) interfaceC2223e.mo2166a());
    }

    /* renamed from: c */
    abstract Future<C2211a<T>> mo2251c();

    /* renamed from: e */
    public final <ResultT, A extends C1548a.InterfaceC1550b> AbstractC1288g<ResultT> m2262e(InterfaceC2223e<A, ResultT> interfaceC2223e) {
        C1562e<T> m2265a = m2265a(interfaceC2223e.mo2165c());
        if (m2265a == null) {
            return m2263d();
        }
        if (m2265a.m3943e().f5988f) {
            interfaceC2223e.mo2161d();
        }
        return (AbstractC1288g<ResultT>) m2265a.m3945c((AbstractC1600m<A, ResultT>) interfaceC2223e.mo2166a());
    }
}
