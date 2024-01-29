package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC1667l;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p063b.C1144a;
/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes.dex */
public class C1681t extends AbstractC1684a {
    public static final Parcelable.Creator<C1681t> CREATOR = new C1633b0();

    /* renamed from: f */
    private final int f4851f;

    /* renamed from: g */
    private IBinder f4852g;

    /* renamed from: h */
    private C1144a f4853h;

    /* renamed from: i */
    private boolean f4854i;

    /* renamed from: j */
    private boolean f4855j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1681t(int i, IBinder iBinder, C1144a c1144a, boolean z, boolean z2) {
        this.f4851f = i;
        this.f4852g = iBinder;
        this.f4853h = c1144a;
        this.f4854i = z;
        this.f4855j = z2;
    }

    /* renamed from: b */
    public InterfaceC1667l m3624b() {
        return InterfaceC1667l.AbstractBinderC1668a.m3653g(this.f4852g);
    }

    /* renamed from: c */
    public C1144a m3623c() {
        return this.f4853h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1681t) {
            C1681t c1681t = (C1681t) obj;
            return this.f4853h.equals(c1681t.f4853h) && m3624b().equals(c1681t.m3624b());
        }
        return false;
    }

    /* renamed from: h */
    public boolean m3622h() {
        return this.f4854i;
    }

    /* renamed from: j */
    public boolean m3621j() {
        return this.f4855j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4851f);
        C1687c.m3592f(parcel, 2, this.f4852g, false);
        C1687c.m3588j(parcel, 3, m3623c(), i, false);
        C1687c.m3595c(parcel, 4, m3622h());
        C1687c.m3595c(parcel, 5, m3621j());
        C1687c.m3596b(parcel, m3597a);
    }
}
