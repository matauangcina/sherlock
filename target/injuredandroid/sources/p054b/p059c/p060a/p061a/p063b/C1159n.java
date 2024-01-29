package p054b.p059c.p060a.p061a.p063b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: b.c.a.a.b.n */
/* loaded from: classes.dex */
public final class C1159n implements Parcelable.Creator<C1144a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1144a createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h == 2) {
                i2 = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h == 3) {
                pendingIntent = (PendingIntent) C1685b.m3616b(parcel, m3607k, PendingIntent.CREATOR);
            } else if (m3610h != 4) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                str = C1685b.m3615c(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1144a(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1144a[] newArray(int i) {
        return new C1144a[i];
    }
}
