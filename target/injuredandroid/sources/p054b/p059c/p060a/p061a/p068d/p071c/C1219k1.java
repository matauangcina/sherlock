package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import java.util.List;
/* renamed from: b.c.a.a.d.c.k1 */
/* loaded from: classes.dex */
public final class C1219k1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1219k1> CREATOR = new C1222l1();

    /* renamed from: f */
    private String f3956f;

    /* renamed from: g */
    private boolean f3957g;

    /* renamed from: h */
    private String f3958h;

    /* renamed from: i */
    private boolean f3959i;

    /* renamed from: j */
    private C1264z1 f3960j;

    /* renamed from: k */
    private List<String> f3961k;

    public C1219k1() {
        this.f3960j = C1264z1.m4631c();
    }

    public C1219k1(String str, boolean z, String str2, boolean z2, C1264z1 c1264z1, List<String> list) {
        this.f3956f = str;
        this.f3957g = z;
        this.f3958h = str2;
        this.f3959i = z2;
        this.f3960j = c1264z1 == null ? C1264z1.m4631c() : C1264z1.m4632b(c1264z1);
        this.f3961k = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 2, this.f3956f, false);
        C1687c.m3595c(parcel, 3, this.f3957g);
        C1687c.m3587k(parcel, 4, this.f3958h, false);
        C1687c.m3595c(parcel, 5, this.f3959i);
        C1687c.m3588j(parcel, 6, this.f3960j, i, false);
        C1687c.m3586l(parcel, 7, this.f3961k, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
