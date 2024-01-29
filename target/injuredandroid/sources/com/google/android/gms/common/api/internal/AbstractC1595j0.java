package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1559b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1581e;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC1595j0<T> extends AbstractC1611r {

    /* renamed from: a */
    protected final C1289h<T> f4694a;

    public AbstractC1595j0(int i, C1289h<T> c1289h) {
        super(i);
        this.f4694a = c1289h;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: b */
    public void mo3821b(Status status) {
        this.f4694a.m4607d(new C1559b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: d */
    public void mo3820d(RuntimeException runtimeException) {
        this.f4694a.m4607d(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1573a0
    /* renamed from: f */
    public final void mo3819f(C1581e.C1582a<?> c1582a) {
        Status m3913a;
        Status m3913a2;
        try {
            mo3816i(c1582a);
        } catch (DeadObjectException e) {
            m3913a2 = AbstractC1573a0.m3913a(e);
            mo3821b(m3913a2);
            throw e;
        } catch (RemoteException e2) {
            m3913a = AbstractC1573a0.m3913a(e2);
            mo3821b(m3913a);
        } catch (RuntimeException e3) {
            mo3820d(e3);
        }
    }

    /* renamed from: i */
    protected abstract void mo3816i(C1581e.C1582a<?> c1582a);
}
