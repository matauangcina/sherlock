package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.InterfaceC2124a;
/* renamed from: com.google.firebase.auth.internal.w */
/* loaded from: classes.dex */
public final class C2178w implements InterfaceC2124a {
    public static final Parcelable.Creator<C2178w> CREATOR = new C2180y();

    /* renamed from: f */
    private final String f5940f;

    /* renamed from: g */
    private final String f5941g;

    /* renamed from: h */
    private boolean f5942h;

    public C2178w(String str, String str2, boolean z) {
        C1679r.m3633f(str);
        C1679r.m3633f(str2);
        this.f5940f = str;
        this.f5941g = str2;
        C2160j.m2355d(str2);
        this.f5942h = z;
    }

    public C2178w(boolean z) {
        this.f5942h = z;
        this.f5941g = null;
        this.f5940f = null;
    }

    /* renamed from: a */
    public final String m2319a() {
        return this.f5940f;
    }

    /* renamed from: b */
    public final boolean m2318b() {
        return this.f5942h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, m2319a(), false);
        C1687c.m3587k(parcel, 2, this.f5941g, false);
        C1687c.m3595c(parcel, 3, m2318b());
        C1687c.m3596b(parcel, m3597a);
    }
}
