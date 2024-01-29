package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.firebase.auth.internal.c0 */
/* loaded from: classes.dex */
public final class C2147c0 implements Parcelable.Creator<C2181z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2181z createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
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
                    str5 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 4:
                    str4 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 5:
                    str3 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 6:
                    str6 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 7:
                    z = C1685b.m3609i(parcel, m3607k);
                    break;
                case 8:
                    str7 = C1685b.m3615c(parcel, m3607k);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2181z(str, str2, str3, str4, str5, str6, z, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2181z[] newArray(int i) {
        return new C2181z[i];
    }
}
