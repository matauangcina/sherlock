package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: b.c.a.a.d.c.u0 */
/* loaded from: classes.dex */
public class C1248u0 {
    static {
        C1248u0.class.getClassLoader();
    }

    private C1248u0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m4658a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m4657b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m4656c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
