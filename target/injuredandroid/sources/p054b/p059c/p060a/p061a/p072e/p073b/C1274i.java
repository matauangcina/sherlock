package p054b.p059c.p060a.p061a.p072e.p073b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1680s;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: b.c.a.a.e.b.i */
/* loaded from: classes.dex */
public final class C1274i implements Parcelable.Creator<C1275j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1275j createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        int i = 0;
        C1680s c1680s = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h != 2) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c1680s = (C1680s) C1685b.m3616b(parcel, m3607k, C1680s.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1275j(i, c1680s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1275j[] newArray(int i) {
        return new C1275j[i];
    }
}
