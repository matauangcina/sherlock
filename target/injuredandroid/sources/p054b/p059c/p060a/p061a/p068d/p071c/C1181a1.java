package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.C2128c;
/* renamed from: b.c.a.a.d.c.a1 */
/* loaded from: classes.dex */
public final class C1181a1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1181a1> CREATOR = new C1193d1();

    /* renamed from: f */
    private final C2128c f3894f;

    public C1181a1(C2128c c2128c) {
        this.f3894f = c2128c;
    }

    /* renamed from: b */
    public final C2128c m4734b() {
        return this.f3894f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3588j(parcel, 1, this.f3894f, i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
