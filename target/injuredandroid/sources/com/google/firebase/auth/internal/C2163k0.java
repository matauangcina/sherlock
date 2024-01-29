package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2133e0;
import java.util.ArrayList;
/* renamed from: com.google.firebase.auth.internal.k0 */
/* loaded from: classes.dex */
public final class C2163k0 implements Parcelable.Creator<C2165l0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2165l0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
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
                arrayList = C1685b.m3612f(parcel, m3607k, C2133e0.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2165l0(str, str2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2165l0[] newArray(int i) {
        return new C2165l0[i];
    }
}
