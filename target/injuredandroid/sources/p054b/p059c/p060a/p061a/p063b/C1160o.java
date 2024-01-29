package p054b.p059c.p060a.p061a.p063b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: b.c.a.a.b.o */
/* loaded from: classes.dex */
public final class C1160o implements Parcelable.Creator<C1146c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1146c createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                str = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 2) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h != 3) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                j = C1685b.m3604n(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1146c(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1146c[] newArray(int i) {
        return new C1146c[i];
    }
}
