package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import java.util.ArrayList;
/* renamed from: b.c.a.a.d.c.v1 */
/* loaded from: classes.dex */
public final class C1252v1 implements Parcelable.Creator<C1255w1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1255w1 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            if (C1685b.m3610h(m3607k) != 2) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                arrayList = C1685b.m3612f(parcel, m3607k, C1249u1.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1255w1(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1255w1[] newArray(int i) {
        return new C1255w1[i];
    }
}
