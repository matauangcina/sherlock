package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2141i0;
import java.util.ArrayList;
/* renamed from: b.c.a.a.d.c.j1 */
/* loaded from: classes.dex */
public final class C1216j1 implements Parcelable.Creator<C1209h1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1209h1 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        ArrayList arrayList = null;
        C2141i0 c2141i0 = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            int m3610h = C1685b.m3610h(m3607k);
            if (m3610h == 1) {
                str = C1685b.m3615c(parcel, m3607k);
            } else if (m3610h == 2) {
                arrayList = C1685b.m3612f(parcel, m3607k, C1243s1.CREATOR);
            } else if (m3610h != 3) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c2141i0 = (C2141i0) C1685b.m3616b(parcel, m3607k, C2141i0.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1209h1(str, arrayList, c2141i0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1209h1[] newArray(int i) {
        return new C1209h1[i];
    }
}
