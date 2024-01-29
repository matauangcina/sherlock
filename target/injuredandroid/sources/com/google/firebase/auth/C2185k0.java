package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.k0 */
/* loaded from: classes.dex */
public final class C2185k0 implements Parcelable.Creator<C2141i0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2141i0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C1182a2 c1182a2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 4:
                    c1182a2 = (C1182a2) C1685b.m3616b(parcel, m3607k, C1182a2.CREATOR);
                    break;
                case 5:
                    str4 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 6:
                    str5 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 7:
                    str6 = C1685b.m3615c(parcel, m3607k);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2141i0(str, str2, str3, c1182a2, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2141i0[] newArray(int i) {
        return new C2141i0[i];
    }
}
