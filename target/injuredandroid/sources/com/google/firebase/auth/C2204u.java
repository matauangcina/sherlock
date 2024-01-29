package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: com.google.firebase.auth.u */
/* loaded from: classes.dex */
public class C2204u extends AbstractC1684a {
    public static final Parcelable.Creator<C2204u> CREATOR = new C2183j0();

    /* renamed from: b */
    public static C2204u m2278b() {
        return new C2204u();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C1687c.m3596b(parcel, C1687c.m3597a(parcel));
    }
}
