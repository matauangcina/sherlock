package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.m0 */
/* loaded from: classes.dex */
public final class C1224m0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1224m0> CREATOR = new C1227n0();

    /* renamed from: f */
    private final String f3965f;

    public C1224m0(String str) {
        this.f3965f = str;
    }

    /* renamed from: b */
    public final String m4693b() {
        return this.f3965f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f3965f, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
