package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import p054b.p059c.p060a.p061a.p063b.C1144a;
/* renamed from: com.google.android.gms.common.internal.b0 */
/* loaded from: classes.dex */
public final class C1633b0 implements Parcelable.Creator<C1681t> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1681t createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        IBinder iBinder = null;
        C1144a c1144a = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h == 2) {
                iBinder = C1685b.m3606l(parcel, m3607k);
            } else if (m3610h == 3) {
                c1144a = (C1144a) C1685b.m3616b(parcel, m3607k, C1144a.CREATOR);
            } else if (m3610h == 4) {
                z = C1685b.m3609i(parcel, m3607k);
            } else if (m3610h != 5) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                z2 = C1685b.m3609i(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1681t(i, iBinder, c1144a, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1681t[] newArray(int i) {
        return new C1681t[i];
    }
}
