package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.p118z.C2273b;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.firebase.auth.e0 */
/* loaded from: classes.dex */
public final class C2133e0 extends AbstractC2205u0 {
    public static final Parcelable.Creator<C2133e0> CREATOR = new C2131d0();

    /* renamed from: f */
    private final String f5866f;

    /* renamed from: g */
    private final String f5867g;

    /* renamed from: h */
    private final long f5868h;

    /* renamed from: i */
    private final String f5869i;

    public C2133e0(String str, String str2, long j, String str3) {
        C1679r.m3633f(str);
        this.f5866f = str;
        this.f5867g = str2;
        this.f5868h = j;
        C1679r.m3633f(str3);
        this.f5869i = str3;
    }

    /* renamed from: c */
    public static C2133e0 m2394c(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new C2133e0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.AbstractC2205u0
    /* renamed from: b */
    public final JSONObject mo2277b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f5866f);
            jSONObject.putOpt("displayName", this.f5867g);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f5868h));
            jSONObject.putOpt("phoneNumber", this.f5869i);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new C2273b(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5866f, false);
        C1687c.m3587k(parcel, 2, this.f5867g, false);
        C1687c.m3590h(parcel, 3, this.f5868h);
        C1687c.m3587k(parcel, 4, this.f5869i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
