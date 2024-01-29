package p054b.p059c.p060a.p061a.p072e.p073b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1681t;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p063b.C1144a;
/* renamed from: b.c.a.a.e.b.l */
/* loaded from: classes.dex */
public final class C1277l extends AbstractC1684a {
    public static final Parcelable.Creator<C1277l> CREATOR = new C1276k();

    /* renamed from: f */
    private final int f4051f;

    /* renamed from: g */
    private final C1144a f4052g;

    /* renamed from: h */
    private final C1681t f4053h;

    public C1277l(int i) {
        this(new C1144a(8, null), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1277l(int i, C1144a c1144a, C1681t c1681t) {
        this.f4051f = i;
        this.f4052g = c1144a;
        this.f4053h = c1681t;
    }

    private C1277l(C1144a c1144a, C1681t c1681t) {
        this(1, c1144a, null);
    }

    /* renamed from: b */
    public final C1144a m4614b() {
        return this.f4052g;
    }

    /* renamed from: c */
    public final C1681t m4613c() {
        return this.f4053h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4051f);
        C1687c.m3588j(parcel, 2, this.f4052g, i, false);
        C1687c.m3588j(parcel, 3, this.f4053h, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
