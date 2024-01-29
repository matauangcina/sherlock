package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2141i0;
import java.util.ArrayList;
/* renamed from: b.c.a.a.d.c.n1 */
/* loaded from: classes.dex */
public final class C1228n1 implements Parcelable.Creator<C1225m1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1225m1 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C1255w1 c1255w1 = null;
        String str5 = null;
        String str6 = null;
        C2141i0 c2141i0 = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            switch (C1685b.m3610h(m3607k)) {
                case 2:
                    str = C1685b.m3615c(parcel, m3607k);
                    break;
                case 3:
                    str2 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 4:
                    z = C1685b.m3609i(parcel, m3607k);
                    break;
                case 5:
                    str3 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 6:
                    str4 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 7:
                    c1255w1 = (C1255w1) C1685b.m3616b(parcel, m3607k, C1255w1.CREATOR);
                    break;
                case 8:
                    str5 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 9:
                    str6 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 10:
                    j = C1685b.m3604n(parcel, m3607k);
                    break;
                case 11:
                    j2 = C1685b.m3604n(parcel, m3607k);
                    break;
                case 12:
                    z2 = C1685b.m3609i(parcel, m3607k);
                    break;
                case 13:
                    c2141i0 = (C2141i0) C1685b.m3616b(parcel, m3607k, C2141i0.CREATOR);
                    break;
                case 14:
                    arrayList = C1685b.m3612f(parcel, m3607k, C1243s1.CREATOR);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1225m1(str, str2, z, str3, str4, c1255w1, str5, str6, j, j2, z2, c2141i0, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1225m1[] newArray(int i) {
        return new C1225m1[i];
    }
}
