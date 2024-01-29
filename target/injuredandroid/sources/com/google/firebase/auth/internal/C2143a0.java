package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2141i0;
/* renamed from: com.google.firebase.auth.internal.a0 */
/* loaded from: classes.dex */
public final class C2143a0 implements Parcelable.Creator<C2179x> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2179x createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        C2149d0 c2149d0 = null;
        C2178w c2178w = null;
        C2141i0 c2141i0 = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                c2149d0 = (C2149d0) C1685b.m3616b(parcel, m3607k, C2149d0.CREATOR);
            } else if (m3610h == 2) {
                c2178w = (C2178w) C1685b.m3616b(parcel, m3607k, C2178w.CREATOR);
            } else if (m3610h != 3) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c2141i0 = (C2141i0) C1685b.m3616b(parcel, m3607k, C2141i0.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2179x(c2149d0, c2178w, c2141i0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2179x[] newArray(int i) {
        return new C2179x[i];
    }
}
