package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0835t;
import androidx.lifecycle.AbstractC0868e;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0791b implements Parcelable {
    public static final Parcelable.Creator<C0791b> CREATOR = new C0792a();

    /* renamed from: f */
    final int[] f2849f;

    /* renamed from: g */
    final ArrayList<String> f2850g;

    /* renamed from: h */
    final int[] f2851h;

    /* renamed from: i */
    final int[] f2852i;

    /* renamed from: j */
    final int f2853j;

    /* renamed from: k */
    final String f2854k;

    /* renamed from: l */
    final int f2855l;

    /* renamed from: m */
    final int f2856m;

    /* renamed from: n */
    final CharSequence f2857n;

    /* renamed from: o */
    final int f2858o;

    /* renamed from: p */
    final CharSequence f2859p;

    /* renamed from: q */
    final ArrayList<String> f2860q;

    /* renamed from: r */
    final ArrayList<String> f2861r;

    /* renamed from: s */
    final boolean f2862s;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    static class C0792a implements Parcelable.Creator<C0791b> {
        C0792a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0791b createFromParcel(Parcel parcel) {
            return new C0791b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0791b[] newArray(int i) {
            return new C0791b[i];
        }
    }

    public C0791b(Parcel parcel) {
        this.f2849f = parcel.createIntArray();
        this.f2850g = parcel.createStringArrayList();
        this.f2851h = parcel.createIntArray();
        this.f2852i = parcel.createIntArray();
        this.f2853j = parcel.readInt();
        this.f2854k = parcel.readString();
        this.f2855l = parcel.readInt();
        this.f2856m = parcel.readInt();
        this.f2857n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2858o = parcel.readInt();
        this.f2859p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2860q = parcel.createStringArrayList();
        this.f2861r = parcel.createStringArrayList();
        this.f2862s = parcel.readInt() != 0;
    }

    public C0791b(C0790a c0790a) {
        int size = c0790a.f2999a.size();
        this.f2849f = new int[size * 5];
        if (!c0790a.f3005g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2850g = new ArrayList<>(size);
        this.f2851h = new int[size];
        this.f2852i = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AbstractC0835t.C0836a c0836a = c0790a.f2999a.get(i);
            int i3 = i2 + 1;
            this.f2849f[i2] = c0836a.f3016a;
            ArrayList<String> arrayList = this.f2850g;
            Fragment fragment = c0836a.f3017b;
            arrayList.add(fragment != null ? fragment.f2808j : null);
            int[] iArr = this.f2849f;
            int i4 = i3 + 1;
            iArr[i3] = c0836a.f3018c;
            int i5 = i4 + 1;
            iArr[i4] = c0836a.f3019d;
            int i6 = i5 + 1;
            iArr[i5] = c0836a.f3020e;
            iArr[i6] = c0836a.f3021f;
            this.f2851h[i] = c0836a.f3022g.ordinal();
            this.f2852i[i] = c0836a.f3023h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f2853j = c0790a.f3004f;
        this.f2854k = c0790a.f3007i;
        this.f2855l = c0790a.f2848t;
        this.f2856m = c0790a.f3008j;
        this.f2857n = c0790a.f3009k;
        this.f2858o = c0790a.f3010l;
        this.f2859p = c0790a.f3011m;
        this.f2860q = c0790a.f3012n;
        this.f2861r = c0790a.f3013o;
        this.f2862s = c0790a.f3014p;
    }

    /* renamed from: a */
    public C0790a m6508a(AbstractC0814m abstractC0814m) {
        C0790a c0790a = new C0790a(abstractC0814m);
        int i = 0;
        int i2 = 0;
        while (i < this.f2849f.length) {
            AbstractC0835t.C0836a c0836a = new AbstractC0835t.C0836a();
            int i3 = i + 1;
            c0836a.f3016a = this.f2849f[i];
            if (AbstractC0814m.m6342p0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0790a + " op #" + i2 + " base fragment #" + this.f2849f[i3]);
            }
            String str = this.f2850g.get(i2);
            c0836a.f3017b = str != null ? abstractC0814m.m6382V(str) : null;
            c0836a.f3022g = AbstractC0868e.EnumC0870b.values()[this.f2851h[i2]];
            c0836a.f3023h = AbstractC0868e.EnumC0870b.values()[this.f2852i[i2]];
            int[] iArr = this.f2849f;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            c0836a.f3018c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            c0836a.f3019d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            c0836a.f3020e = i9;
            int i10 = iArr[i8];
            c0836a.f3021f = i10;
            c0790a.f3000b = i5;
            c0790a.f3001c = i7;
            c0790a.f3002d = i9;
            c0790a.f3003e = i10;
            c0790a.m6243e(c0836a);
            i2++;
            i = i8 + 1;
        }
        c0790a.f3004f = this.f2853j;
        c0790a.f3007i = this.f2854k;
        c0790a.f2848t = this.f2855l;
        c0790a.f3005g = true;
        c0790a.f3008j = this.f2856m;
        c0790a.f3009k = this.f2857n;
        c0790a.f3010l = this.f2858o;
        c0790a.f3011m = this.f2859p;
        c0790a.f3012n = this.f2860q;
        c0790a.f3013o = this.f2861r;
        c0790a.f3014p = this.f2862s;
        c0790a.m6515t(1);
        return c0790a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2849f);
        parcel.writeStringList(this.f2850g);
        parcel.writeIntArray(this.f2851h);
        parcel.writeIntArray(this.f2852i);
        parcel.writeInt(this.f2853j);
        parcel.writeString(this.f2854k);
        parcel.writeInt(this.f2855l);
        parcel.writeInt(this.f2856m);
        TextUtils.writeToParcel(this.f2857n, parcel, 0);
        parcel.writeInt(this.f2858o);
        TextUtils.writeToParcel(this.f2859p, parcel, 0);
        parcel.writeStringList(this.f2860q);
        parcel.writeStringList(this.f2861r);
        parcel.writeInt(this.f2862s ? 1 : 0);
    }
}
