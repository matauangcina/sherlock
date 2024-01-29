package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.d.c.a2 */
/* loaded from: classes.dex */
public final class C1182a2 extends AbstractC1684a {
    public static final Parcelable.Creator<C1182a2> CREATOR = new C1194d2();

    /* renamed from: f */
    private String f3895f;

    /* renamed from: g */
    private String f3896g;

    /* renamed from: h */
    private String f3897h;

    /* renamed from: i */
    private String f3898i;

    /* renamed from: j */
    private String f3899j;

    /* renamed from: k */
    private String f3900k;

    /* renamed from: l */
    private String f3901l;

    /* renamed from: m */
    private String f3902m;

    /* renamed from: n */
    private boolean f3903n;

    /* renamed from: o */
    private boolean f3904o;

    /* renamed from: p */
    private String f3905p;

    /* renamed from: q */
    private String f3906q;

    /* renamed from: r */
    private String f3907r;

    /* renamed from: s */
    private String f3908s;

    /* renamed from: t */
    private boolean f3909t;

    /* renamed from: u */
    private String f3910u;

    public C1182a2() {
        this.f3903n = true;
        this.f3904o = true;
    }

    public C1182a2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f3895f = "http://localhost";
        this.f3897h = str;
        this.f3898i = str2;
        this.f3902m = str5;
        this.f3905p = str6;
        this.f3908s = str7;
        this.f3910u = str8;
        this.f3903n = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f3898i) && TextUtils.isEmpty(this.f3905p)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        C1679r.m3633f(str3);
        this.f3899j = str3;
        this.f3900k = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f3897h)) {
            sb.append("id_token=");
            sb.append(this.f3897h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f3898i)) {
            sb.append("access_token=");
            sb.append(this.f3898i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f3900k)) {
            sb.append("identifier=");
            sb.append(this.f3900k);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f3902m)) {
            sb.append("oauth_token_secret=");
            sb.append(this.f3902m);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f3905p)) {
            sb.append("code=");
            sb.append(this.f3905p);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.f3899j);
        this.f3901l = sb.toString();
        this.f3904o = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1182a2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f3895f = str;
        this.f3896g = str2;
        this.f3897h = str3;
        this.f3898i = str4;
        this.f3899j = str5;
        this.f3900k = str6;
        this.f3901l = str7;
        this.f3902m = str8;
        this.f3903n = z;
        this.f3904o = z2;
        this.f3905p = str9;
        this.f3906q = str10;
        this.f3907r = str11;
        this.f3908s = str12;
        this.f3909t = z3;
        this.f3910u = str13;
    }

    /* renamed from: b */
    public final C1182a2 m4733b(boolean z) {
        this.f3904o = false;
        return this;
    }

    /* renamed from: c */
    public final C1182a2 m4732c(String str) {
        this.f3908s = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 2, this.f3895f, false);
        C1687c.m3587k(parcel, 3, this.f3896g, false);
        C1687c.m3587k(parcel, 4, this.f3897h, false);
        C1687c.m3587k(parcel, 5, this.f3898i, false);
        C1687c.m3587k(parcel, 6, this.f3899j, false);
        C1687c.m3587k(parcel, 7, this.f3900k, false);
        C1687c.m3587k(parcel, 8, this.f3901l, false);
        C1687c.m3587k(parcel, 9, this.f3902m, false);
        C1687c.m3595c(parcel, 10, this.f3903n);
        C1687c.m3595c(parcel, 11, this.f3904o);
        C1687c.m3587k(parcel, 12, this.f3905p, false);
        C1687c.m3587k(parcel, 13, this.f3906q, false);
        C1687c.m3587k(parcel, 14, this.f3907r, false);
        C1687c.m3587k(parcel, 15, this.f3908s, false);
        C1687c.m3595c(parcel, 16, this.f3909t);
        C1687c.m3587k(parcel, 17, this.f3910u, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
