package p054b.p059c.p060a.p061a.p068d.p070b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: b.c.a.a.d.b.c */
/* loaded from: classes.dex */
public class C1177c {
    static {
        C1177c.class.getClassLoader();
    }

    private C1177c() {
    }

    /* renamed from: a */
    public static void m4739a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m4738b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m4737c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
