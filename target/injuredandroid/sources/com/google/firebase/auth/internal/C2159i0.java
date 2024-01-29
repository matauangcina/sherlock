package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2133e0;
import com.google.firebase.auth.C2141i0;
import java.util.ArrayList;
/* renamed from: com.google.firebase.auth.internal.i0 */
/* loaded from: classes.dex */
public final class C2159i0 implements Parcelable.Creator<C2161j0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2161j0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        ArrayList arrayList = null;
        C2165l0 c2165l0 = null;
        String str = null;
        C2141i0 c2141i0 = null;
        C2149d0 c2149d0 = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                arrayList = C1685b.m3612f(parcel, m3607k, C2133e0.CREATOR);
            } else if (m3610h == 2) {
                c2165l0 = (C2165l0) C1685b.m3616b(parcel, m3607k, C2165l0.CREATOR);
            } else if (m3610h == 3) {
                str = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 4) {
                c2141i0 = (C2141i0) C1685b.m3616b(parcel, m3607k, C2141i0.CREATOR);
            } else if (m3610h != 5) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c2149d0 = (C2149d0) C1685b.m3616b(parcel, m3607k, C2149d0.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2161j0(arrayList, c2165l0, str, c2141i0, c2149d0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2161j0[] newArray(int i) {
        return new C2161j0[i];
    }
}
