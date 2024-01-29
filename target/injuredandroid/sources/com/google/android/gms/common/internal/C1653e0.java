package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p117w.C1685b;
import p054b.p059c.p060a.p061a.p063b.C1146c;
/* renamed from: com.google.android.gms.common.internal.e0 */
/* loaded from: classes.dex */
public final class C1653e0 implements Parcelable.Creator<C1656g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1656g createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C1146c[] c1146cArr = null;
        C1146c[] c1146cArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            switch (C1685b.m3610h(m3607k)) {
                case 1:
                    i = C1685b.m3605m(parcel, m3607k);
                    break;
                case 2:
                    i2 = C1685b.m3605m(parcel, m3607k);
                    break;
                case 3:
                    i3 = C1685b.m3605m(parcel, m3607k);
                    break;
                case 4:
                    str = C1685b.m3615c(parcel, m3607k);
                    break;
                case 5:
                    iBinder = C1685b.m3606l(parcel, m3607k);
                    break;
                case 6:
                    scopeArr = (Scope[]) C1685b.m3613e(parcel, m3607k, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C1685b.m3617a(parcel, m3607k);
                    break;
                case 8:
                    account = (Account) C1685b.m3616b(parcel, m3607k, Account.CREATOR);
                    break;
                case 9:
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
                case 10:
                    c1146cArr = (C1146c[]) C1685b.m3613e(parcel, m3607k, C1146c.CREATOR);
                    break;
                case 11:
                    c1146cArr2 = (C1146c[]) C1685b.m3613e(parcel, m3607k, C1146c.CREATOR);
                    break;
                case 12:
                    z = C1685b.m3609i(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1656g(i, i2, i3, str, iBinder, scopeArr, bundle, account, c1146cArr, c1146cArr2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1656g[] newArray(int i) {
        return new C1656g[i];
    }
}
