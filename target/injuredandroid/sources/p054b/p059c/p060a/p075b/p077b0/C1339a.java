package p054b.p059c.p060a.p075b.p077b0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p014d.C0079g;
import p000a.p032i.p033a.AbstractC0280a;
/* renamed from: b.c.a.b.b0.a */
/* loaded from: classes.dex */
public class C1339a extends AbstractC0280a {
    public static final Parcelable.Creator<C1339a> CREATOR = new C1340a();

    /* renamed from: h */
    public final C0079g<String, Bundle> f4210h;

    /* renamed from: b.c.a.b.b0.a$a */
    /* loaded from: classes.dex */
    static class C1340a implements Parcelable.ClassLoaderCreator<C1339a> {
        C1340a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C1339a createFromParcel(Parcel parcel) {
            return new C1339a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public C1339a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1339a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public C1339a[] newArray(int i) {
            return new C1339a[i];
        }
    }

    private C1339a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4210h = new C0079g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f4210h.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ C1339a(Parcel parcel, ClassLoader classLoader, C1340a c1340a) {
        this(parcel, classLoader);
    }

    public C1339a(Parcelable parcelable) {
        super(parcelable);
        this.f4210h = new C0079g<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f4210h + "}";
    }

    @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f4210h.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f4210h.m9334i(i2);
            bundleArr[i2] = this.f4210h.m9330m(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
