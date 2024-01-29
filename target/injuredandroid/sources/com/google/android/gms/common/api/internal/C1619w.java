package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1581e;
import com.google.android.gms.common.internal.AbstractC1634c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes.dex */
public final class C1619w implements AbstractC1634c.InterfaceC1639e {

    /* renamed from: a */
    final /* synthetic */ C1581e.C1582a f4733a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1619w(C1581e.C1582a c1582a) {
        this.f4733a = c1582a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c.InterfaceC1639e
    /* renamed from: a */
    public final void mo3733a() {
        C1581e.this.f4665m.post(new RunnableC1618v(this));
    }
}
