package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.C2202t;
/* renamed from: b.c.a.a.d.c.r0 */
/* loaded from: classes.dex */
public final class C1239r0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1239r0> CREATOR = new C1245t0();

    /* renamed from: f */
    private final String f3999f;

    /* renamed from: g */
    private final C2202t f4000g;

    public C1239r0(String str, C2202t c2202t) {
        this.f3999f = str;
        this.f4000g = c2202t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f3999f, false);
        C1687c.m3588j(parcel, 2, this.f4000g, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
