package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2141i0;
import java.util.ArrayList;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
/* renamed from: com.google.firebase.auth.internal.f0 */
/* loaded from: classes.dex */
public final class C2153f0 implements Parcelable.Creator<C2149d0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2149d0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        C1237q1 c1237q1 = null;
        C2181z c2181z = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        C2151e0 c2151e0 = null;
        C2141i0 c2141i0 = null;
        C2164l c2164l = null;
        boolean z = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            switch (C1685b.m3610h(m3607k)) {
                case 1:
                    c1237q1 = (C1237q1) C1685b.m3616b(parcel, m3607k, C1237q1.CREATOR);
                    break;
                case 2:
                    c2181z = (C2181z) C1685b.m3616b(parcel, m3607k, C2181z.CREATOR);
                    break;
                case 3:
                    str = C1685b.m3615c(parcel, m3607k);
                    break;
                case 4:
                    str2 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 5:
                    arrayList = C1685b.m3612f(parcel, m3607k, C2181z.CREATOR);
                    break;
                case 6:
                    arrayList2 = C1685b.m3614d(parcel, m3607k);
                    break;
                case 7:
                    str3 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 8:
                    bool = C1685b.m3608j(parcel, m3607k);
                    break;
                case 9:
                    c2151e0 = (C2151e0) C1685b.m3616b(parcel, m3607k, C2151e0.CREATOR);
                    break;
                case 10:
                    z = C1685b.m3609i(parcel, m3607k);
                    break;
                case 11:
                    c2141i0 = (C2141i0) C1685b.m3616b(parcel, m3607k, C2141i0.CREATOR);
                    break;
                case 12:
                    c2164l = (C2164l) C1685b.m3616b(parcel, m3607k, C2164l.CREATOR);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C2149d0(c1237q1, c2181z, str, str2, arrayList, arrayList2, str3, bool, c2151e0, z, c2141i0, c2164l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2149d0[] newArray(int i) {
        return new C2149d0[i];
    }
}
