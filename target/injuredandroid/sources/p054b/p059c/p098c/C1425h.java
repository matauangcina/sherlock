package p054b.p059c.p098c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1677q;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.C1683v;
import com.google.android.gms.common.util.C1703k;
/* renamed from: b.c.c.h */
/* loaded from: classes.dex */
public final class C1425h {

    /* renamed from: a */
    private final String f4359a;

    /* renamed from: b */
    private final String f4360b;

    /* renamed from: c */
    private final String f4361c;

    /* renamed from: d */
    private final String f4362d;

    /* renamed from: e */
    private final String f4363e;

    /* renamed from: f */
    private final String f4364f;

    /* renamed from: g */
    private final String f4365g;

    private C1425h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C1679r.m3628k(!C1703k.m3542b(str), "ApplicationId must be set.");
        this.f4360b = str;
        this.f4359a = str2;
        this.f4361c = str3;
        this.f4362d = str4;
        this.f4363e = str5;
        this.f4364f = str6;
        this.f4365g = str7;
    }

    /* renamed from: a */
    public static C1425h m4181a(Context context) {
        C1683v c1683v = new C1683v(context);
        String m3618a = c1683v.m3618a("google_app_id");
        if (TextUtils.isEmpty(m3618a)) {
            return null;
        }
        return new C1425h(m3618a, c1683v.m3618a("google_api_key"), c1683v.m3618a("firebase_database_url"), c1683v.m3618a("ga_trackingId"), c1683v.m3618a("gcm_defaultSenderId"), c1683v.m3618a("google_storage_bucket"), c1683v.m3618a("project_id"));
    }

    /* renamed from: b */
    public String m4180b() {
        return this.f4359a;
    }

    /* renamed from: c */
    public String m4179c() {
        return this.f4360b;
    }

    /* renamed from: d */
    public String m4178d() {
        return this.f4361c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1425h) {
            C1425h c1425h = (C1425h) obj;
            return C1677q.m3642a(this.f4360b, c1425h.f4360b) && C1677q.m3642a(this.f4359a, c1425h.f4359a) && C1677q.m3642a(this.f4361c, c1425h.f4361c) && C1677q.m3642a(this.f4362d, c1425h.f4362d) && C1677q.m3642a(this.f4363e, c1425h.f4363e) && C1677q.m3642a(this.f4364f, c1425h.f4364f) && C1677q.m3642a(this.f4365g, c1425h.f4365g);
        }
        return false;
    }

    public int hashCode() {
        return C1677q.m3641b(this.f4360b, this.f4359a, this.f4361c, this.f4362d, this.f4363e, this.f4364f, this.f4365g);
    }

    public String toString() {
        C1677q.C1678a m3640c = C1677q.m3640c(this);
        m3640c.m3639a("applicationId", this.f4360b);
        m3640c.m3639a("apiKey", this.f4359a);
        m3640c.m3639a("databaseUrl", this.f4361c);
        m3640c.m3639a("gcmSenderId", this.f4363e);
        m3640c.m3639a("storageBucket", this.f4364f);
        m3640c.m3639a("projectId", this.f4365g);
        return m3640c.toString();
    }
}
