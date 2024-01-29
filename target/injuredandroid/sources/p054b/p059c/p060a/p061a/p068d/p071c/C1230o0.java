package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.o0 */
/* loaded from: classes.dex */
public final class C1230o0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1230o0> CREATOR = new C1236q0();

    /* renamed from: f */
    private final String f3981f;

    /* renamed from: g */
    private final String f3982g;

    /* renamed from: h */
    private final String f3983h;

    public C1230o0(String str, String str2, String str3) {
        this.f3981f = str;
        this.f3982g = str2;
        this.f3983h = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f3981f, false);
        C1687c.m3587k(parcel, 2, this.f3982g, false);
        C1687c.m3587k(parcel, 3, this.f3983h, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
