package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.C2202t;
/* renamed from: b.c.a.a.d.c.c1 */
/* loaded from: classes.dex */
public final class C1189c1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1189c1> CREATOR = new C1197e1();

    /* renamed from: f */
    private final C2202t f3920f;

    /* renamed from: g */
    private final String f3921g;

    public C1189c1(C2202t c2202t, String str) {
        this.f3920f = c2202t;
        this.f3921g = str;
    }

    /* renamed from: b */
    public final C2202t m4729b() {
        return this.f3920f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3588j(parcel, 1, this.f3920f, i, false);
        C1687c.m3587k(parcel, 2, this.f3921g, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
