package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.firebase.auth.internal.y */
/* loaded from: classes.dex */
public final class C2180y implements Parcelable.Creator<C2178w> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2178w createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                str = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 2) {
                str2 = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h != 3) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                z = C1685b.m3609i(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2178w(str, str2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2178w[] newArray(int i) {
        return new C2178w[i];
    }
}
