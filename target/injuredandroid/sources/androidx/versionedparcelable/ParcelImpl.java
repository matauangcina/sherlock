package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1070a();

    /* renamed from: f */
    private final InterfaceC1073c f3699f;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    /* loaded from: classes.dex */
    static class C1070a implements Parcelable.Creator<ParcelImpl> {
        C1070a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f3699f = new C1072b(parcel).m5027u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C1072b(parcel).m5041L(this.f3699f);
    }
}
