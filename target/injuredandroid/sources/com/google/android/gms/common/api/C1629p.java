package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.android.gms.common.api.p */
/* loaded from: classes.dex */
public final class C1629p implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i2 = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h == 2) {
                str = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 3) {
                pendingIntent = (PendingIntent) C1685b.m3616b(parcel, m3607k, PendingIntent.CREATOR);
            } else if (m3610h != 1000) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                i = C1685b.m3605m(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new Status(i, i2, str, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
