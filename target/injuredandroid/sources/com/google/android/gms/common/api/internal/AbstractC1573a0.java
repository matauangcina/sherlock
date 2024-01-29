package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1581e;
import com.google.android.gms.common.util.C1701i;
/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC1573a0 {
    public AbstractC1573a0(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static Status m3913a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C1701i.m3553b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: b */
    public abstract void mo3821b(Status status);

    /* renamed from: c */
    public abstract void mo3817c(C1608p0 c1608p0, boolean z);

    /* renamed from: d */
    public abstract void mo3820d(RuntimeException runtimeException);

    /* renamed from: f */
    public abstract void mo3819f(C1581e.C1582a<?> c1582a);
}
