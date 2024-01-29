package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public final class C0830q implements Parcelable {
    public static final Parcelable.Creator<C0830q> CREATOR = new C0831a();

    /* renamed from: f */
    final String f2980f;

    /* renamed from: g */
    final String f2981g;

    /* renamed from: h */
    final boolean f2982h;

    /* renamed from: i */
    final int f2983i;

    /* renamed from: j */
    final int f2984j;

    /* renamed from: k */
    final String f2985k;

    /* renamed from: l */
    final boolean f2986l;

    /* renamed from: m */
    final boolean f2987m;

    /* renamed from: n */
    final boolean f2988n;

    /* renamed from: o */
    final Bundle f2989o;

    /* renamed from: p */
    final boolean f2990p;

    /* renamed from: q */
    final int f2991q;

    /* renamed from: r */
    Bundle f2992r;

    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: classes.dex */
    static class C0831a implements Parcelable.Creator<C0830q> {
        C0831a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0830q createFromParcel(Parcel parcel) {
            return new C0830q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0830q[] newArray(int i) {
            return new C0830q[i];
        }
    }

    C0830q(Parcel parcel) {
        this.f2980f = parcel.readString();
        this.f2981g = parcel.readString();
        this.f2982h = parcel.readInt() != 0;
        this.f2983i = parcel.readInt();
        this.f2984j = parcel.readInt();
        this.f2985k = parcel.readString();
        this.f2986l = parcel.readInt() != 0;
        this.f2987m = parcel.readInt() != 0;
        this.f2988n = parcel.readInt() != 0;
        this.f2989o = parcel.readBundle();
        this.f2990p = parcel.readInt() != 0;
        this.f2992r = parcel.readBundle();
        this.f2991q = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0830q(Fragment fragment) {
        this.f2980f = fragment.getClass().getName();
        this.f2981g = fragment.f2808j;
        this.f2982h = fragment.f2816r;
        this.f2983i = fragment.f2778A;
        this.f2984j = fragment.f2779B;
        this.f2985k = fragment.f2780C;
        this.f2986l = fragment.f2783F;
        this.f2987m = fragment.f2815q;
        this.f2988n = fragment.f2782E;
        this.f2989o = fragment.f2809k;
        this.f2990p = fragment.f2781D;
        this.f2991q = fragment.f2798U.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2980f);
        sb.append(" (");
        sb.append(this.f2981g);
        sb.append(")}:");
        if (this.f2982h) {
            sb.append(" fromLayout");
        }
        if (this.f2984j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2984j));
        }
        String str = this.f2985k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2985k);
        }
        if (this.f2986l) {
            sb.append(" retainInstance");
        }
        if (this.f2987m) {
            sb.append(" removing");
        }
        if (this.f2988n) {
            sb.append(" detached");
        }
        if (this.f2990p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2980f);
        parcel.writeString(this.f2981g);
        parcel.writeInt(this.f2982h ? 1 : 0);
        parcel.writeInt(this.f2983i);
        parcel.writeInt(this.f2984j);
        parcel.writeString(this.f2985k);
        parcel.writeInt(this.f2986l ? 1 : 0);
        parcel.writeInt(this.f2987m ? 1 : 0);
        parcel.writeInt(this.f2988n ? 1 : 0);
        parcel.writeBundle(this.f2989o);
        parcel.writeInt(this.f2990p ? 1 : 0);
        parcel.writeBundle(this.f2992r);
        parcel.writeInt(this.f2991q);
    }
}
