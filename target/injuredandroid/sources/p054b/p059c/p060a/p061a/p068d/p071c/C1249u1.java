package p054b.p059c.p060a.p061a.p068d.p071c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.u1 */
/* loaded from: classes.dex */
public final class C1249u1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1249u1> CREATOR = new C1246t1();

    /* renamed from: f */
    private String f4007f;

    /* renamed from: g */
    private String f4008g;

    /* renamed from: h */
    private String f4009h;

    /* renamed from: i */
    private String f4010i;

    /* renamed from: j */
    private String f4011j;

    /* renamed from: k */
    private String f4012k;

    /* renamed from: l */
    private String f4013l;

    public C1249u1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1249u1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f4007f = str;
        this.f4008g = str2;
        this.f4009h = str3;
        this.f4010i = str4;
        this.f4011j = str5;
        this.f4012k = str6;
        this.f4013l = str7;
    }

    /* renamed from: b */
    public final String m4655b() {
        return this.f4007f;
    }

    /* renamed from: c */
    public final String m4654c() {
        return this.f4008g;
    }

    /* renamed from: h */
    public final Uri m4653h() {
        if (TextUtils.isEmpty(this.f4009h)) {
            return null;
        }
        return Uri.parse(this.f4009h);
    }

    /* renamed from: j */
    public final String m4652j() {
        return this.f4010i;
    }

    /* renamed from: k */
    public final String m4651k() {
        return this.f4012k;
    }

    /* renamed from: n */
    public final String m4650n() {
        return this.f4011j;
    }

    /* renamed from: o */
    public final String m4649o() {
        return this.f4013l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 2, this.f4007f, false);
        C1687c.m3587k(parcel, 3, this.f4008g, false);
        C1687c.m3587k(parcel, 4, this.f4009h, false);
        C1687c.m3587k(parcel, 5, this.f4010i, false);
        C1687c.m3587k(parcel, 6, this.f4011j, false);
        C1687c.m3587k(parcel, 7, this.f4012k, false);
        C1687c.m3587k(parcel, 8, this.f4013l, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
