package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.AbstractC2205u0;
import com.google.firebase.auth.C2133e0;
import java.util.ArrayList;
import java.util.List;
import p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1253w;
/* renamed from: com.google.firebase.auth.internal.l */
/* loaded from: classes.dex */
public final class C2164l extends AbstractC1684a {
    public static final Parcelable.Creator<C2164l> CREATOR = new C2170o();

    /* renamed from: f */
    private final List<C2133e0> f5921f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2164l(List<C2133e0> list) {
        this.f5921f = list == null ? AbstractC1253w.m4647l() : list;
    }

    /* renamed from: b */
    public static C2164l m2352b(List<AbstractC2205u0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC2205u0 abstractC2205u0 : list) {
            if (abstractC2205u0 instanceof C2133e0) {
                arrayList.add((C2133e0) abstractC2205u0);
            }
        }
        return new C2164l(arrayList);
    }

    /* renamed from: c */
    public final List<AbstractC2205u0> m2351c() {
        ArrayList arrayList = new ArrayList();
        for (C2133e0 c2133e0 : this.f5921f) {
            arrayList.add(c2133e0);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3584n(parcel, 1, this.f5921f, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
