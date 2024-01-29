package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.android.gms.common.internal.p117w.InterfaceC1688d;
import com.google.firebase.auth.AbstractC2190n;
import com.google.firebase.auth.C2141i0;
import com.google.firebase.auth.InterfaceC2124a;
import java.util.List;
/* renamed from: com.google.firebase.auth.internal.x */
/* loaded from: classes.dex */
public final class C2179x implements InterfaceC1688d {
    public static final Parcelable.Creator<C2179x> CREATOR = new C2143a0();

    /* renamed from: f */
    private C2149d0 f5943f;

    /* renamed from: g */
    private C2178w f5944g;

    /* renamed from: h */
    private C2141i0 f5945h;

    public C2179x(C2149d0 c2149d0) {
        C1679r.m3631h(c2149d0);
        C2149d0 c2149d02 = c2149d0;
        this.f5943f = c2149d02;
        List<C2181z> m2370F = c2149d02.m2370F();
        this.f5944g = null;
        for (int i = 0; i < m2370F.size(); i++) {
            if (!TextUtils.isEmpty(m2370F.get(i).m2309o())) {
                this.f5944g = new C2178w(m2370F.get(i).mo2267a(), m2370F.get(i).m2309o(), c2149d0.m2369G());
            }
        }
        if (this.f5944g == null) {
            this.f5944g = new C2178w(c2149d0.m2369G());
        }
        this.f5945h = c2149d0.m2368H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2179x(C2149d0 c2149d0, C2178w c2178w, C2141i0 c2141i0) {
        this.f5943f = c2149d0;
        this.f5944g = c2178w;
        this.f5945h = c2141i0;
    }

    /* renamed from: a */
    public final InterfaceC2124a m2317a() {
        return this.f5944g;
    }

    /* renamed from: b */
    public final AbstractC2190n m2316b() {
        return this.f5943f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3588j(parcel, 1, m2316b(), i, false);
        C1687c.m3588j(parcel, 2, m2317a(), i, false);
        C1687c.m3588j(parcel, 3, this.f5945h, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
