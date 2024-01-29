package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.firebase.auth.internal.h0 */
/* loaded from: classes.dex */
public final class C2157h0 implements Parcelable.Creator<C2151e0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2151e0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                j = C1685b.m3604n(parcel, m3607k);
            } else if (m3610h != 2) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                j2 = C1685b.m3604n(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2151e0(j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2151e0[] newArray(int i) {
        return new C2151e0[i];
    }
}
