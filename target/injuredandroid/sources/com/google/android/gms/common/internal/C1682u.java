package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.C1548a;
/* renamed from: com.google.android.gms.common.internal.u */
/* loaded from: classes.dex */
public class C1682u<T extends IInterface> extends AbstractC1658h<T> {

    /* renamed from: x */
    private final C1548a.InterfaceC1558h<T> f4856x;

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: I */
    protected void mo3620I(int i, T t) {
        this.f4856x.m3949s(i, t);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: f */
    protected String mo2217f() {
        return this.f4856x.m3952f();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: h */
    protected T mo2216h(IBinder iBinder) {
        return this.f4856x.m3951h(iBinder);
    }

    /* renamed from: k0 */
    public C1548a.InterfaceC1558h<T> m3619k0() {
        return this.f4856x;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: r */
    protected String mo2213r() {
        return this.f4856x.m3950r();
    }
}
