package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import p054b.p059c.p060a.p061a.p063b.C1146c;
/* renamed from: com.google.android.gms.common.internal.d0 */
/* loaded from: classes.dex */
public final class C1651d0 implements Parcelable.Creator<C1647c0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1647c0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        Bundle bundle = null;
        C1146c[] c1146cArr = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                bundle = C1685b.m3617a(parcel, m3607k);
            } else if (m3610h != 2) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c1146cArr = (C1146c[]) C1685b.m3613e(parcel, m3607k, C1146c.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1647c0(bundle, c1146cArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1647c0[] newArray(int i) {
        return new C1647c0[i];
    }
}
