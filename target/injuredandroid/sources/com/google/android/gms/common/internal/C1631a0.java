package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.android.gms.common.internal.a0 */
/* loaded from: classes.dex */
public final class C1631a0 implements Parcelable.Creator<C1680s> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1680s createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h == 2) {
                account = (Account) C1685b.m3616b(parcel, m3607k, Account.CREATOR);
            } else if (m3610h == 3) {
                i2 = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h != 4) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C1685b.m3616b(parcel, m3607k, GoogleSignInAccount.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1680s(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1680s[] newArray(int i) {
        return new C1680s[i];
    }
}
