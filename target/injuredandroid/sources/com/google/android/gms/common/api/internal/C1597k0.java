package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1581e;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.android.gms.common.api.internal.k0 */
/* loaded from: classes.dex */
public final class C1597k0<ResultT> extends AbstractC1611r {

    /* renamed from: a */
    private final AbstractC1600m<C1548a.InterfaceC1550b, ResultT> f4695a;

    /* renamed from: b */
    private final C1289h<ResultT> f4696b;

    /* renamed from: c */
    private final InterfaceC1598l f4697c;

    public C1597k0(int i, AbstractC1600m<C1548a.InterfaceC1550b, ResultT> abstractC1600m, C1289h<ResultT> c1289h, InterfaceC1598l interfaceC1598l) {
        super(i);
        this.f4696b = c1289h;
        this.f4695a = abstractC1600m;
        this.f4697c = interfaceC1598l;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: b */
    public final void mo3821b(Status status) {
        this.f4696b.m4607d(this.f4697c.mo3818a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: c */
    public final void mo3817c(C1608p0 c1608p0, boolean z) {
        c1608p0.m3801a(this.f4696b, z);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: d */
    public final void mo3820d(RuntimeException runtimeException) {
        this.f4696b.m4607d(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: f */
    public final void mo3819f(C1581e.C1582a<?> c1582a) {
        Status m3913a;
        try {
            this.f4695a.mo3814b(c1582a.m3852o(), this.f4696b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            m3913a = AbstractC1573a0.m3913a(e2);
            mo3821b(m3913a);
        } catch (RuntimeException e3) {
            mo3820d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1611r
    /* renamed from: g */
    public final C1146c[] mo3790g(C1581e.C1582a<?> c1582a) {
        return this.f4695a.m3812d();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1611r
    /* renamed from: h */
    public final boolean mo3789h(C1581e.C1582a<?> c1582a) {
        return this.f4695a.m3813c();
    }
}
