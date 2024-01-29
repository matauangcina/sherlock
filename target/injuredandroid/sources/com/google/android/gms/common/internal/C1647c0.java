package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p063b.C1146c;
/* renamed from: com.google.android.gms.common.internal.c0 */
/* loaded from: classes.dex */
public final class C1647c0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1647c0> CREATOR = new C1651d0();

    /* renamed from: f */
    Bundle f4778f;

    /* renamed from: g */
    C1146c[] f4779g;

    public C1647c0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1647c0(Bundle bundle, C1146c[] c1146cArr) {
        this.f4778f = bundle;
        this.f4779g = c1146cArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3593e(parcel, 1, this.f4778f, false);
        C1687c.m3585m(parcel, 2, this.f4779g, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
