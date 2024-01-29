package com.google.firebase.auth.p118z.p119a;

import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.internal.C1677q;
import com.google.android.gms.common.internal.C1679r;
/* renamed from: com.google.firebase.auth.z.a.v0 */
/* loaded from: classes.dex */
public final class C2264v0 extends AbstractC2220d implements C1548a.InterfaceC1552d {

    /* renamed from: g */
    private final String f6033g;

    private C2264v0(String str) {
        C1679r.m3632g(str, "A valid API key must be provided");
        this.f6033g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2264v0(String str, C2266w0 c2266w0) {
        this(str);
    }

    @Override // com.google.firebase.auth.p118z.p119a.AbstractC2220d
    /* renamed from: b */
    public final /* synthetic */ AbstractC2220d mo2172b() {
        return (C2264v0) clone();
    }

    @Override // com.google.firebase.auth.p118z.p119a.AbstractC2220d
    public final /* synthetic */ Object clone() {
        return new C2270y0(this.f6033g).m2163a();
    }

    /* renamed from: d */
    public final String m2171d() {
        return this.f6033g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2264v0) {
            return C1677q.m3642a(this.f6033g, ((C2264v0) obj).f6033g);
        }
        return false;
    }

    public final int hashCode() {
        return C1677q.m3641b(this.f6033g);
    }
}
