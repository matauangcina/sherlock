package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.AbstractC2127b0;
import com.google.firebase.auth.AbstractC2190n;
import com.google.firebase.auth.AbstractC2205u0;
import com.google.firebase.auth.C2133e0;
import com.google.firebase.auth.C2141i0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;
import p054b.p059c.p060a.p061a.p068d.p071c.C1209h1;
/* renamed from: com.google.firebase.auth.internal.j0 */
/* loaded from: classes.dex */
public final class C2161j0 extends AbstractC2127b0 {
    public static final Parcelable.Creator<C2161j0> CREATOR = new C2159i0();

    /* renamed from: f */
    private final List<C2133e0> f5915f = new ArrayList();

    /* renamed from: g */
    private final C2165l0 f5916g;

    /* renamed from: h */
    private final String f5917h;

    /* renamed from: i */
    private final C2141i0 f5918i;

    /* renamed from: j */
    private final C2149d0 f5919j;

    public C2161j0(List<C2133e0> list, C2165l0 c2165l0, String str, C2141i0 c2141i0, C2149d0 c2149d0) {
        for (C2133e0 c2133e0 : list) {
            if (c2133e0 instanceof C2133e0) {
                this.f5915f.add(c2133e0);
            }
        }
        C1679r.m3631h(c2165l0);
        this.f5916g = c2165l0;
        C1679r.m3633f(str);
        this.f5917h = str;
        this.f5918i = c2141i0;
        this.f5919j = c2149d0;
    }

    /* renamed from: b */
    public static C2161j0 m2354b(C1209h1 c1209h1, FirebaseAuth firebaseAuth, AbstractC2190n abstractC2190n) {
        List<AbstractC2205u0> m4707h = c1209h1.m4707h();
        ArrayList arrayList = new ArrayList();
        for (AbstractC2205u0 abstractC2205u0 : m4707h) {
            if (abstractC2205u0 instanceof C2133e0) {
                arrayList.add((C2133e0) abstractC2205u0);
            }
        }
        return new C2161j0(arrayList, C2165l0.m2350b(c1209h1.m4707h(), c1209h1.m4709b()), firebaseAuth.m2411o().m4197m(), c1209h1.m4708c(), (C2149d0) abstractC2190n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3584n(parcel, 1, this.f5915f, false);
        C1687c.m3588j(parcel, 2, this.f5916g, i, false);
        C1687c.m3587k(parcel, 3, this.f5917h, false);
        C1687c.m3588j(parcel, 4, this.f5918i, i, false);
        C1687c.m3588j(parcel, 5, this.f5919j, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
