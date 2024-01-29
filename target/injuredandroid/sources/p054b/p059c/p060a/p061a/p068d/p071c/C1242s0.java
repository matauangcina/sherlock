package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: b.c.a.a.d.c.s0 */
/* loaded from: classes.dex */
public final class C1242s0 implements Parcelable.Creator<C1233p0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1233p0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        C1182a2 c1182a2 = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                str = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h != 2) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c1182a2 = (C1182a2) C1685b.m3616b(parcel, m3607k, C1182a2.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1233p0(str, c1182a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1233p0[] newArray(int i) {
        return new C1233p0[i];
    }
}
