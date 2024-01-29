package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import java.util.ArrayList;
/* renamed from: b.c.a.a.d.c.b2 */
/* loaded from: classes.dex */
public final class C1186b2 implements Parcelable.Creator<C1264z1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1264z1 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        int i = 0;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                i = C1685b.m3605m(parcel, m3607k);
            } else if (m3610h != 2) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                arrayList = C1685b.m3614d(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1264z1(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1264z1[] newArray(int i) {
        return new C1264z1[i];
    }
}
