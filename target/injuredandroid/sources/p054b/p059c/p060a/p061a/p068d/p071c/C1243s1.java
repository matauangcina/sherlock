package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.s1 */
/* loaded from: classes.dex */
public final class C1243s1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1243s1> CREATOR = new C1240r1();

    /* renamed from: f */
    private final String f4003f;

    /* renamed from: g */
    private final String f4004g;

    /* renamed from: h */
    private final String f4005h;

    /* renamed from: i */
    private final long f4006i;

    public C1243s1(String str, String str2, String str3, long j) {
        this.f4003f = str;
        C1679r.m3633f(str2);
        this.f4004g = str2;
        this.f4005h = str3;
        this.f4006i = j;
    }

    /* renamed from: b */
    public final String m4665b() {
        return this.f4003f;
    }

    /* renamed from: c */
    public final String m4664c() {
        return this.f4004g;
    }

    /* renamed from: h */
    public final String m4663h() {
        return this.f4005h;
    }

    /* renamed from: j */
    public final long m4662j() {
        return this.f4006i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f4003f, false);
        C1687c.m3587k(parcel, 2, this.f4004g, false);
        C1687c.m3587k(parcel, 3, this.f4005h, false);
        C1687c.m3590h(parcel, 4, this.f4006i);
        C1687c.m3596b(parcel, m3597a);
    }
}
