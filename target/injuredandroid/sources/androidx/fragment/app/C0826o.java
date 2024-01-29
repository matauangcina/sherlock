package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public final class C0826o implements Parcelable {
    public static final Parcelable.Creator<C0826o> CREATOR = new C0827a();

    /* renamed from: f */
    ArrayList<C0830q> f2968f;

    /* renamed from: g */
    ArrayList<String> f2969g;

    /* renamed from: h */
    C0791b[] f2970h;

    /* renamed from: i */
    int f2971i;

    /* renamed from: j */
    String f2972j;

    /* renamed from: androidx.fragment.app.o$a */
    /* loaded from: classes.dex */
    static class C0827a implements Parcelable.Creator<C0826o> {
        C0827a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0826o createFromParcel(Parcel parcel) {
            return new C0826o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0826o[] newArray(int i) {
            return new C0826o[i];
        }
    }

    public C0826o() {
        this.f2972j = null;
    }

    public C0826o(Parcel parcel) {
        this.f2972j = null;
        this.f2968f = parcel.createTypedArrayList(C0830q.CREATOR);
        this.f2969g = parcel.createStringArrayList();
        this.f2970h = (C0791b[]) parcel.createTypedArray(C0791b.CREATOR);
        this.f2971i = parcel.readInt();
        this.f2972j = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2968f);
        parcel.writeStringList(this.f2969g);
        parcel.writeTypedArray(this.f2970h, i);
        parcel.writeInt(this.f2971i);
        parcel.writeString(this.f2972j);
    }
}
