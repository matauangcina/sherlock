package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: com.google.firebase.auth.j0 */
/* loaded from: classes.dex */
public final class C2183j0 implements Parcelable.Creator<C2204u> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2204u createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            C1685b.m3610h(m3607k);
            C1685b.m3601q(parcel, m3607k);
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2204u();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2204u[] newArray(int i) {
        return new C2204u[i];
    }
}
