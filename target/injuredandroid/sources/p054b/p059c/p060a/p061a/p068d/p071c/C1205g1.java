package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.C2141i0;
/* renamed from: b.c.a.a.d.c.g1 */
/* loaded from: classes.dex */
public final class C1205g1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1205g1> CREATOR = new C1213i1();

    /* renamed from: f */
    private final Status f3942f;

    /* renamed from: g */
    private final C2141i0 f3943g;

    /* renamed from: h */
    private final String f3944h;

    /* renamed from: i */
    private final String f3945i;

    public C1205g1(Status status, C2141i0 c2141i0, String str, String str2) {
        this.f3942f = status;
        this.f3943g = c2141i0;
        this.f3944h = str;
        this.f3945i = str2;
    }

    /* renamed from: b */
    public final Status m4715b() {
        return this.f3942f;
    }

    /* renamed from: c */
    public final C2141i0 m4714c() {
        return this.f3943g;
    }

    /* renamed from: h */
    public final String m4713h() {
        return this.f3944h;
    }

    /* renamed from: j */
    public final String m4712j() {
        return this.f3945i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3588j(parcel, 1, this.f3942f, i, false);
        C1687c.m3588j(parcel, 2, this.f3943g, i, false);
        C1687c.m3587k(parcel, 3, this.f3944h, false);
        C1687c.m3587k(parcel, 4, this.f3945i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
