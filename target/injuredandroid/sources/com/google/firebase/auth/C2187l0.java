package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.firebase.auth.l0 */
/* loaded from: classes.dex */
public final class C2187l0 implements Parcelable.Creator<C2128c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2128c createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                str = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 2) {
                str2 = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 3) {
                str3 = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 4) {
                str4 = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h != 5) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                z = C1685b.m3609i(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2128c(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2128c[] newArray(int i) {
        return new C2128c[i];
    }
}
