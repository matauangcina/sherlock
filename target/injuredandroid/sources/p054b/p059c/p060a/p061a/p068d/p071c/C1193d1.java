package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1685b;
import com.google.firebase.auth.C2128c;
/* renamed from: b.c.a.a.d.c.d1 */
/* loaded from: classes.dex */
public final class C1193d1 implements Parcelable.Creator<C1181a1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1181a1 createFromParcel(Parcel parcel) {
        int m3600r = C1685b.m3600r(parcel);
        C2128c c2128c = null;
        while (parcel.dataPosition() < m3600r) {
            int m3607k = C1685b.m3607k(parcel);
            if (C1685b.m3610h(m3607k) != 1) {
                C1685b.m3601q(parcel, m3607k);
            } else {
                c2128c = (C2128c) C1685b.m3616b(parcel, m3607k, C2128c.CREATOR);
            }
        }
        C1685b.m3611g(parcel, m3600r);
        return new C1181a1(c2128c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1181a1[] newArray(int i) {
        return new C1181a1[i];
    }
}
