package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.InterfaceC2210y;
import com.google.firebase.auth.p118z.C2273b;
import org.json.JSONException;
import org.json.JSONObject;
import p054b.p059c.p060a.p061a.p068d.p071c.C1225m1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1249u1;
/* renamed from: com.google.firebase.auth.internal.z */
/* loaded from: classes.dex */
public final class C2181z extends AbstractC1684a implements InterfaceC2210y {
    public static final Parcelable.Creator<C2181z> CREATOR = new C2147c0();

    /* renamed from: f */
    private String f5946f;

    /* renamed from: g */
    private String f5947g;

    /* renamed from: h */
    private String f5948h;

    /* renamed from: i */
    private String f5949i;

    /* renamed from: j */
    private String f5950j;

    /* renamed from: k */
    private String f5951k;

    /* renamed from: l */
    private boolean f5952l;

    /* renamed from: m */
    private String f5953m;

    public C2181z(C1225m1 c1225m1, String str) {
        C1679r.m3631h(c1225m1);
        C1679r.m3633f(str);
        String m4690h = c1225m1.m4690h();
        C1679r.m3633f(m4690h);
        this.f5946f = m4690h;
        this.f5947g = str;
        this.f5950j = c1225m1.m4692b();
        this.f5948h = c1225m1.m4689j();
        Uri m4688k = c1225m1.m4688k();
        if (m4688k != null) {
            this.f5949i = m4688k.toString();
        }
        this.f5952l = c1225m1.m4691c();
        this.f5953m = null;
        this.f5951k = c1225m1.m4687n();
    }

    public C2181z(C1249u1 c1249u1) {
        C1679r.m3631h(c1249u1);
        this.f5946f = c1249u1.m4655b();
        String m4652j = c1249u1.m4652j();
        C1679r.m3633f(m4652j);
        this.f5947g = m4652j;
        this.f5948h = c1249u1.m4654c();
        Uri m4653h = c1249u1.m4653h();
        if (m4653h != null) {
            this.f5949i = m4653h.toString();
        }
        this.f5950j = c1249u1.m4649o();
        this.f5951k = c1249u1.m4651k();
        this.f5952l = false;
        this.f5953m = c1249u1.m4650n();
    }

    public C2181z(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f5946f = str;
        this.f5947g = str2;
        this.f5950j = str3;
        this.f5951k = str4;
        this.f5948h = str5;
        this.f5949i = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(this.f5949i);
        }
        this.f5952l = z;
        this.f5953m = str7;
    }

    /* renamed from: n */
    public static C2181z m2310n(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2181z(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new C2273b(e);
        }
    }

    @Override // com.google.firebase.auth.InterfaceC2210y
    /* renamed from: a */
    public final String mo2267a() {
        return this.f5947g;
    }

    /* renamed from: b */
    public final String m2315b() {
        return this.f5948h;
    }

    /* renamed from: c */
    public final String m2314c() {
        return this.f5950j;
    }

    /* renamed from: h */
    public final String m2313h() {
        return this.f5951k;
    }

    /* renamed from: j */
    public final String m2312j() {
        return this.f5946f;
    }

    /* renamed from: k */
    public final boolean m2311k() {
        return this.f5952l;
    }

    /* renamed from: o */
    public final String m2309o() {
        return this.f5953m;
    }

    /* renamed from: p */
    public final String m2308p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f5946f);
            jSONObject.putOpt("providerId", this.f5947g);
            jSONObject.putOpt("displayName", this.f5948h);
            jSONObject.putOpt("photoUrl", this.f5949i);
            jSONObject.putOpt("email", this.f5950j);
            jSONObject.putOpt("phoneNumber", this.f5951k);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f5952l));
            jSONObject.putOpt("rawUserInfo", this.f5953m);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new C2273b(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, m2312j(), false);
        C1687c.m3587k(parcel, 2, mo2267a(), false);
        C1687c.m3587k(parcel, 3, m2315b(), false);
        C1687c.m3587k(parcel, 4, this.f5949i, false);
        C1687c.m3587k(parcel, 5, m2314c(), false);
        C1687c.m3587k(parcel, 6, m2313h(), false);
        C1687c.m3595c(parcel, 7, m2311k());
        C1687c.m3587k(parcel, 8, this.f5953m, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
