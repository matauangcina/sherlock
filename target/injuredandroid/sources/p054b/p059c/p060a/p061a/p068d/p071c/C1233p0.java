package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.p0 */
/* loaded from: classes.dex */
public final class C1233p0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1233p0> CREATOR = new C1242s0();

    /* renamed from: f */
    private final String f3987f;

    /* renamed from: g */
    private final C1182a2 f3988g;

    public C1233p0(String str, C1182a2 c1182a2) {
        this.f3987f = str;
        this.f3988g = c1182a2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f3987f, false);
        C1687c.m3588j(parcel, 2, this.f3988g, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
