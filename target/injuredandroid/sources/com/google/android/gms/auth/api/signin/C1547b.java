package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p117w.C1685b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes.dex */
public final class C1547b implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            switch (C1685b.m3610h(m3607k)) {
                case 1:
                    i = C1685b.m3605m(parcel, m3607k);
                    break;
                case 2:
                    str = C1685b.m3615c(parcel, m3607k);
                    break;
                case 3:
                    str2 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 4:
                    str3 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 5:
                    str4 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 6:
                    uri = (Uri) C1685b.m3616b(parcel, m3607k, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 8:
                    j = C1685b.m3604n(parcel, m3607k);
                    break;
                case 9:
                    str6 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 10:
                    arrayList = C1685b.m3612f(parcel, m3607k, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 12:
                    str8 = C1685b.m3615c(parcel, m3607k);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
