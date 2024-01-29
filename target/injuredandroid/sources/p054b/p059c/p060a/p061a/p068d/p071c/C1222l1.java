package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import java.util.ArrayList;
/* renamed from: b.c.a.a.d.c.l1 */
/* loaded from: classes.dex */
public final class C1222l1 implements Parcelable.Creator<C1219k1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1219k1 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        C1264z1 c1264z1 = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            switch (C1685b.m3610h(m3607k)) {
                case 2:
                    str = C1685b.m3615c(parcel, m3607k);
                    break;
                case 3:
                    z = C1685b.m3609i(parcel, m3607k);
                    break;
                case 4:
                    str2 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 5:
                    z2 = C1685b.m3609i(parcel, m3607k);
                    break;
                case 6:
                    c1264z1 = (C1264z1) C1685b.m3616b(parcel, m3607k, C1264z1.CREATOR);
                    break;
                case 7:
                    arrayList = C1685b.m3614d(parcel, m3607k);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1219k1(str, z, str2, z2, c1264z1, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1219k1[] newArray(int i) {
        return new C1219k1[i];
    }
}
