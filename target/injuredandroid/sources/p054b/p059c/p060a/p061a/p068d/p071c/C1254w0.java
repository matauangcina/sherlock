package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.w0 */
/* loaded from: classes.dex */
public final class C1254w0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1254w0> CREATOR = new C1260y0();

    /* renamed from: f */
    private final C1182a2 f4016f;

    public C1254w0(C1182a2 c1182a2) {
        this.f4016f = c1182a2;
    }

    /* renamed from: b */
    public final C1182a2 m4644b() {
        return this.f4016f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3588j(parcel, 1, this.f4016f, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
