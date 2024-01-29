package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2133e0;
import java.util.ArrayList;
/* renamed from: com.google.firebase.auth.internal.o */
/* loaded from: classes.dex */
public final class C2170o implements Parcelable.Creator<C2164l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2164l createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            if (C1685b.m3610h(m3607k) != 1) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                arrayList = C1685b.m3612f(parcel, m3607k, C2133e0.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2164l(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2164l[] newArray(int i) {
        return new C2164l[i];
    }
}
