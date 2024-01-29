package p054b.p059c.p060a.p061a.p072e.p073b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1681t;
import com.google.android.gms.common.internal.p117w.C1685b;
import p054b.p059c.p060a.p061a.p063b.C1144a;
/* renamed from: b.c.a.a.e.b.k */
/* loaded from: classes.dex */
public final class C1276k implements Parcelable.Creator<C1277l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1277l createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        C1144a c1144a = null;
        C1681t c1681t = null;
        int i = 0;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h == 2) {
                c1144a = (C1144a) C1685b.m3616b(parcel, m3607k, C1144a.CREATOR);
            } else if (m3610h != 3) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c1681t = (C1681t) C1685b.m3616b(parcel, m3607k, C1681t.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1277l(i, c1144a, c1681t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1277l[] newArray(int i) {
        return new C1277l[i];
    }
}
