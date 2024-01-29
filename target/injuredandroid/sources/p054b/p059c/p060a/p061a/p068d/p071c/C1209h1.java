package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.AbstractC2205u0;
import com.google.firebase.auth.C2141i0;
import com.google.firebase.auth.internal.C2166m;
import java.util.List;
/* renamed from: b.c.a.a.d.c.h1 */
/* loaded from: classes.dex */
public final class C1209h1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1209h1> CREATOR = new C1216j1();

    /* renamed from: f */
    private String f3948f;

    /* renamed from: g */
    private List<C1243s1> f3949g;

    /* renamed from: h */
    private C2141i0 f3950h;

    public C1209h1(String str, List<C1243s1> list, C2141i0 c2141i0) {
        this.f3948f = str;
        this.f3949g = list;
        this.f3950h = c2141i0;
    }

    /* renamed from: b */
    public final String m4709b() {
        return this.f3948f;
    }

    /* renamed from: c */
    public final C2141i0 m4708c() {
        return this.f3950h;
    }

    /* renamed from: h */
    public final List<AbstractC2205u0> m4707h() {
        return C2166m.m2348b(this.f3949g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f3948f, false);
        C1687c.m3584n(parcel, 2, this.f3949g, false);
        C1687c.m3588j(parcel, 3, this.f3950h, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
