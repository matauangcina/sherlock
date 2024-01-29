package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: b.c.a.a.d.c.x0 */
/* loaded from: classes.dex */
public final class C1257x0 implements Parcelable.Creator<C1251v0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1251v0 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            if (C1685b.m3610h(m3607k) != 1) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                str = C1685b.m3615c(parcel, m3607k);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1251v0(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1251v0[] newArray(int i) {
        return new C1251v0[i];
    }
}
