package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
/* renamed from: b.c.a.a.d.c.d2 */
/* loaded from: classes.dex */
public final class C1194d2 implements Parcelable.Creator<C1182a2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1182a2 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    str3 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 5:
                    str4 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 6:
                    str5 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 7:
                    str6 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 8:
                    str7 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 9:
                    str8 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 10:
                    z = C1685b.m3609i(parcel, m3607k);
                    break;
                case 11:
                    z2 = C1685b.m3609i(parcel, m3607k);
                    break;
                case 12:
                    str9 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 13:
                    str10 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 14:
                    str11 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 15:
                    str12 = C1685b.m3615c(parcel, m3607k);
                    break;
                case 16:
                    z3 = C1685b.m3609i(parcel, m3607k);
                    break;
                case 17:
                    str13 = C1685b.m3615c(parcel, m3607k);
                    break;
                default:
                    C1685b.m3601q(parcel, m3607k);
                    break;
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1182a2(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1182a2[] newArray(int i) {
        return new C1182a2[i];
    }
}
