package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.InterfaceC1667l;
/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes.dex */
public class BinderC1630a extends InterfaceC1667l.AbstractBinderC1668a {
    /* renamed from: h */
    public static Account m3778h(InterfaceC1667l interfaceC1667l) {
        if (interfaceC1667l != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC1667l.mo3652c();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
