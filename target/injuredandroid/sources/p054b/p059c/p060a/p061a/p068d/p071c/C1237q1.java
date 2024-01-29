package p054b.p059c.p060a.p061a.p068d.p071c;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import com.google.android.gms.common.util.C1698f;
import com.google.firebase.auth.p118z.C2273b;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: b.c.a.a.d.c.q1 */
/* loaded from: classes.dex */
public final class C1237q1 extends AbstractC1684a {
    public static final Parcelable.Creator<C1237q1> CREATOR = new C1234p1();

    /* renamed from: f */
    private String f3989f;

    /* renamed from: g */
    private String f3990g;

    /* renamed from: h */
    private Long f3991h;

    /* renamed from: i */
    private String f3992i;

    /* renamed from: j */
    private Long f3993j;

    public C1237q1() {
        this.f3993j = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1237q1(String str, String str2, Long l, String str3, Long l2) {
        this.f3989f = str;
        this.f3990g = str2;
        this.f3991h = l;
        this.f3992i = str3;
        this.f3993j = l2;
    }

    /* renamed from: c */
    public static C1237q1 m4675c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1237q1 c1237q1 = new C1237q1();
            c1237q1.f3989f = jSONObject.optString("refresh_token", null);
            c1237q1.f3990g = jSONObject.optString("access_token", null);
            c1237q1.f3991h = Long.valueOf(jSONObject.optLong("expires_in"));
            c1237q1.f3992i = jSONObject.optString("token_type", null);
            c1237q1.f3993j = Long.valueOf(jSONObject.optLong("issued_at"));
            return c1237q1;
        } catch (JSONException e) {
            Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
            throw new C2273b(e);
        }
    }

    /* renamed from: b */
    public final void m4676b(String str) {
        C1679r.m3633f(str);
        this.f3989f = str;
    }

    /* renamed from: h */
    public final boolean m4674h() {
        return C1698f.m3560b().mo3561a() + 300000 < this.f3993j.longValue() + (this.f3991h.longValue() * 1000);
    }

    /* renamed from: j */
    public final String m4673j() {
        return this.f3989f;
    }

    /* renamed from: k */
    public final String m4672k() {
        return this.f3990g;
    }

    /* renamed from: n */
    public final long m4671n() {
        Long l = this.f3991h;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* renamed from: o */
    public final long m4670o() {
        return this.f3993j.longValue();
    }

    /* renamed from: p */
    public final String m4669p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f3989f);
            jSONObject.put("access_token", this.f3990g);
            jSONObject.put("expires_in", this.f3991h);
            jSONObject.put("token_type", this.f3992i);
            jSONObject.put("issued_at", this.f3993j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
            throw new C2273b(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 2, this.f3989f, false);
        C1687c.m3587k(parcel, 3, this.f3990g, false);
        C1687c.m3589i(parcel, 4, Long.valueOf(m4671n()), false);
        C1687c.m3587k(parcel, 5, this.f3992i, false);
        C1687c.m3589i(parcel, 6, Long.valueOf(this.f3993j.longValue()), false);
        C1687c.m3596b(parcel, m3597a);
    }
}
