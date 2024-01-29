package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C1576c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.internal.s */
/* loaded from: classes.dex */
public final class C2174s implements ComponentCallbacks2C1576c.InterfaceC1577a {

    /* renamed from: a */
    private final /* synthetic */ C2171p f5938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2174s(C2171p c2171p) {
        this.f5938a = c2171p;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1576c.InterfaceC1577a
    /* renamed from: a */
    public final void mo2324a(boolean z) {
        boolean m2333g;
        C2148d c2148d;
        if (z) {
            this.f5938a.f5931c = true;
            this.f5938a.m2339a();
            return;
        }
        this.f5938a.f5931c = false;
        m2333g = this.f5938a.m2333g();
        if (m2333g) {
            c2148d = this.f5938a.f5930b;
            c2148d.m2379a();
        }
    }
}
