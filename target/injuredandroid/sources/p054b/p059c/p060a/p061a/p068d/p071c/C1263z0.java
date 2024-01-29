package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.z0 */
/* loaded from: classes.dex */
public final class C1263z0 extends AbstractC1684a {
    public static final Parcelable.Creator<C1263z0> CREATOR = new C1185b1();

    /* renamed from: f */
    private final String f4027f;

    /* renamed from: g */
    private final String f4028g;

    /* renamed from: h */
    private final String f4029h;

    public C1263z0(String str, String str2, String str3) {
        this.f4027f = str;
        this.f4028g = str2;
        this.f4029h = str3;
    }

    /* renamed from: b */
    public final String m4634b() {
        return this.f4027f;
    }

    /* renamed from: c */
    public final String m4633c() {
        return this.f4028g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f4027f, false);
        C1687c.m3587k(parcel, 2, this.f4028g, false);
        C1687c.m3587k(parcel, 3, this.f4029h, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
