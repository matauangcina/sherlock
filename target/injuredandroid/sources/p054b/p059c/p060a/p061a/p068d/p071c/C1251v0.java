package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.v0 */
/* loaded from: classes.dex */
public final class C1251v0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1251v0> CREATOR = new C1257x0();

    /* renamed from: f */
    private final String f4014f;

    public C1251v0(String str) {
        this.f4014f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f4014f, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
