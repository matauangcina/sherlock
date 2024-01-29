package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.firebase.auth.InterfaceC2192o;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.firebase.auth.internal.e0 */
/* loaded from: classes.dex */
public final class C2151e0 implements InterfaceC2192o {
    public static final Parcelable.Creator<C2151e0> CREATOR = new C2157h0();

    /* renamed from: f */
    private long f5907f;

    /* renamed from: g */
    private long f5908g;

    public C2151e0(long j, long j2) {
        this.f5907f = j;
        this.f5908g = j2;
    }

    /* renamed from: c */
    public static C2151e0 m2364c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C2151e0(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final long m2366a() {
        return this.f5908g;
    }

    /* renamed from: b */
    public final long m2365b() {
        return this.f5907f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public final JSONObject m2363h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f5907f);
            jSONObject.put("creationTimestamp", this.f5908g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3590h(parcel, 1, m2365b());
        C1687c.m3590h(parcel, 2, m2366a());
        C1687c.m3596b(parcel, m3597a);
    }
}
