package p054b.p059c.p060a.p061a.p072e.p073b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1680s;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.e.b.j */
/* loaded from: classes.dex */
public final class C1275j extends AbstractC1684a {
    public static final Parcelable.Creator<C1275j> CREATOR = new C1274i();

    /* renamed from: f */
    private final int f4049f;

    /* renamed from: g */
    private final C1680s f4050g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1275j(int i, C1680s c1680s) {
        this.f4049f = i;
        this.f4050g = c1680s;
    }

    public C1275j(C1680s c1680s) {
        this(1, c1680s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4049f);
        C1687c.m3588j(parcel, 2, this.f4050g, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
