package p054b.p059c.p060a.p061a.p072e.p073b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: b.c.a.a.e.b.b */
/* loaded from: classes.dex */
public final class C1267b implements Parcelable.Creator<C1268c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1268c createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h == 2) {
                i2 = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h != 3) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                intent = (Intent) C1685b.m3616b(parcel, m3607k, Intent.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1268c(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1268c[] newArray(int i) {
        return new C1268c[i];
    }
}
