package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.AbstractC2125a0;
import com.google.firebase.auth.AbstractC2205u0;
import com.google.firebase.auth.C2133e0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.firebase.auth.internal.l0 */
/* loaded from: classes.dex */
public final class C2165l0 extends AbstractC2125a0 {
    public static final Parcelable.Creator<C2165l0> CREATOR = new C2163k0();

    /* renamed from: f */
    private String f5922f;

    /* renamed from: g */
    private String f5923g;

    /* renamed from: h */
    private List<C2133e0> f5924h;

    private C2165l0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2165l0(String str, String str2, List<C2133e0> list) {
        this.f5922f = str;
        this.f5923g = str2;
        this.f5924h = list;
    }

    /* renamed from: b */
    public static C2165l0 m2350b(List<AbstractC2205u0> list, String str) {
        C1679r.m3631h(list);
        C1679r.m3633f(str);
        C2165l0 c2165l0 = new C2165l0();
        c2165l0.f5924h = new ArrayList();
        for (AbstractC2205u0 abstractC2205u0 : list) {
            if (abstractC2205u0 instanceof C2133e0) {
                c2165l0.f5924h.add((C2133e0) abstractC2205u0);
            }
        }
        c2165l0.f5923g = str;
        return c2165l0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5922f, false);
        C1687c.m3587k(parcel, 2, this.f5923g, false);
        C1687c.m3584n(parcel, 3, this.f5924h, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
