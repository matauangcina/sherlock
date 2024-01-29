package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.C1679r;
import java.util.Set;
import p054b.p059c.p060a.p061a.p068d.p071c.C1180a0;
/* renamed from: com.google.firebase.auth.h0 */
/* loaded from: classes.dex */
public final class C2139h0 {

    /* renamed from: a */
    private final String f5870a;

    /* renamed from: b */
    private final String f5871b;

    /* renamed from: c */
    private final String f5872c;

    /* renamed from: d */
    private final String f5873d;

    static {
        C1180a0 c1180a0 = new C1180a0();
        c1180a0.m4736a("recoverEmail", 2);
        c1180a0.m4736a("resetPassword", 0);
        c1180a0.m4736a("signIn", 4);
        c1180a0.m4736a("verifyEmail", 1);
        c1180a0.m4736a("verifyBeforeChangeEmail", 5);
        c1180a0.m4736a("revertSecondFactorAddition", 6);
        c1180a0.m4735b();
    }

    private C2139h0(String str) {
        this.f5870a = m2392b(str, "apiKey");
        this.f5871b = m2392b(str, "oobCode");
        String m2392b = m2392b(str, "mode");
        this.f5872c = m2392b;
        if (this.f5870a == null || this.f5871b == null || m2392b == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        m2392b(str, "continueUrl");
        m2392b(str, "languageCode");
        this.f5873d = m2392b(str, "tenantId");
    }

    /* renamed from: a */
    public static C2139h0 m2393a(String str) {
        C1679r.m3633f(str);
        try {
            return new C2139h0(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m2392b(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final String m2391c() {
        return this.f5873d;
    }
}
