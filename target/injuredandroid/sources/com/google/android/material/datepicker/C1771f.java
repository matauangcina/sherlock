package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C1763a;
import java.util.Arrays;
/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public class C1771f implements C1763a.InterfaceC1766c {
    public static final Parcelable.Creator<C1771f> CREATOR = new C1772a();

    /* renamed from: f */
    private final long f5204f;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: classes.dex */
    static class C1772a implements Parcelable.Creator<C1771f> {
        C1772a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1771f createFromParcel(Parcel parcel) {
            return new C1771f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C1771f[] newArray(int i) {
            return new C1771f[i];
        }
    }

    private C1771f(long j) {
        this.f5204f = j;
    }

    /* synthetic */ C1771f(long j, C1772a c1772a) {
        this(j);
    }

    /* renamed from: a */
    public static C1771f m3065a(long j) {
        return new C1771f(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1771f) && this.f5204f == ((C1771f) obj).f5204f;
    }

    @Override // com.google.android.material.datepicker.C1763a.InterfaceC1766c
    /* renamed from: g */
    public boolean mo3064g(long j) {
        return j >= this.f5204f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5204f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5204f);
    }
}
