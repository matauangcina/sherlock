package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.x1 */
/* loaded from: classes.dex */
public final class C1258x1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1258x1> CREATOR = new C1261y1();

    /* renamed from: f */
    private String f4019f;

    /* renamed from: g */
    private String f4020g;

    /* renamed from: h */
    private String f4021h;

    /* renamed from: i */
    private C1243s1 f4022i;

    public C1258x1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1258x1(String str, String str2, String str3, C1243s1 c1243s1) {
        this.f4019f = str;
        this.f4020g = str2;
        this.f4021h = str3;
        this.f4022i = c1243s1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 2, this.f4019f, false);
        C1687c.m3587k(parcel, 3, this.f4020g, false);
        C1687c.m3587k(parcel, 4, this.f4021h, false);
        C1687c.m3588j(parcel, 5, this.f4022i, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
