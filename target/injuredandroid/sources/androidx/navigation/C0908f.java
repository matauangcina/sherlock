package androidx.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.navigation.f */
/* loaded from: classes.dex */
public final class C0908f implements Parcelable {
    public static final Parcelable.Creator<C0908f> CREATOR = new C0909a();

    /* renamed from: f */
    private final UUID f3194f;

    /* renamed from: g */
    private final int f3195g;

    /* renamed from: h */
    private final Bundle f3196h;

    /* renamed from: i */
    private final Bundle f3197i;

    /* renamed from: androidx.navigation.f$a */
    /* loaded from: classes.dex */
    class C0909a implements Parcelable.Creator<C0908f> {
        C0909a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0908f createFromParcel(Parcel parcel) {
            return new C0908f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0908f[] newArray(int i) {
            return new C0908f[i];
        }
    }

    C0908f(Parcel parcel) {
        this.f3194f = UUID.fromString(parcel.readString());
        this.f3195g = parcel.readInt();
        this.f3196h = parcel.readBundle(C0908f.class.getClassLoader());
        this.f3197i = parcel.readBundle(C0908f.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0908f(C0906e c0906e) {
        this.f3194f = c0906e.f3189j;
        this.f3195g = c0906e.m6028c().m5956s();
        this.f3196h = c0906e.m6029b();
        Bundle bundle = new Bundle();
        this.f3197i = bundle;
        c0906e.m6022k(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle m6019a() {
        return this.f3196h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m6018b() {
        return this.f3195g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Bundle m6017c() {
        return this.f3197i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public UUID m6016h() {
        return this.f3194f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3194f.toString());
        parcel.writeInt(this.f3195g);
        parcel.writeBundle(this.f3196h);
        parcel.writeBundle(this.f3197i);
    }
}
