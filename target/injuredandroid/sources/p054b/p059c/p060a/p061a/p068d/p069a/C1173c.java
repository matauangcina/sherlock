package p054b.p059c.p060a.p061a.p068d.p069a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: b.c.a.a.d.a.c */
/* loaded from: classes.dex */
public class C1173c {
    static {
        C1173c.class.getClassLoader();
    }

    private C1173c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m4744a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m4743b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m4742c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
