package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C1576c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes.dex */
public final class C1613s implements ComponentCallbacks2C1576c.InterfaceC1577a {

    /* renamed from: a */
    private final /* synthetic */ C1581e f4722a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1613s(C1581e c1581e) {
        this.f4722a = c1581e;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1576c.InterfaceC1577a
    /* renamed from: a */
    public final void mo2324a(boolean z) {
        this.f4722a.f4665m.sendMessage(this.f4722a.f4665m.obtainMessage(1, Boolean.valueOf(z)));
    }
}
