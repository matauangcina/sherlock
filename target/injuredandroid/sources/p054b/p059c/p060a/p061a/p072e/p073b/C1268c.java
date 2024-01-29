package p054b.p059c.p060a.p061a.p072e.p073b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.InterfaceC1624k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.e.b.c */
/* loaded from: classes.dex */
public final class C1268c extends AbstractC1684a implements InterfaceC1624k {
    public static final Parcelable.Creator<C1268c> CREATOR = new C1267b();

    /* renamed from: f */
    private final int f4046f;

    /* renamed from: g */
    private int f4047g;

    /* renamed from: h */
    private Intent f4048h;

    public C1268c() {
        this(0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1268c(int i, int i2, Intent intent) {
        this.f4046f = i;
        this.f4047g = i2;
        this.f4048h = intent;
    }

    private C1268c(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.InterfaceC1624k
    public final Status getStatus() {
        return this.f4047g == 0 ? Status.f4597j : Status.f4599l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4046f);
        C1687c.m3591g(parcel, 2, this.f4047g);
        C1687c.m3588j(parcel, 3, this.f4048h, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
