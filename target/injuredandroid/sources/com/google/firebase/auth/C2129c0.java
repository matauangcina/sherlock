package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.firebase.auth.c0 */
/* loaded from: classes.dex */
public final class C2129c0 implements Parcelable.Creator<C2202t> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2202t createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            switch (C1685b.m3610h(m3607k)) {
                case 1:
                    str = C1685b.m3615c(parcel, m3607k);
                    break;
                case 2:
                    str2 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 3:
                    z = C1685b.m3609i(parcel, m3607k);
                    break;
                case 4:
                    str3 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 5:
                    z2 = C1685b.m3609i(parcel, m3607k);
                    break;
                case 6:
                    str4 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 7:
                    str5 = C1685b.m3615c(parcel, m3607k);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2202t(str, str2, z, str3, z2, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2202t[] newArray(int i) {
        return new C2202t[i];
    }
}
