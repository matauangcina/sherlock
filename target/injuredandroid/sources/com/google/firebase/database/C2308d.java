package com.google.firebase.database;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2509n;
import com.google.firebase.database.p124p.p127g0.C2473m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* renamed from: com.google.firebase.database.d */
/* loaded from: classes.dex */
public class C2308d extends C2314j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2308d(C2509n c2509n, C2506l c2506l) {
        super(c2509n, c2506l);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2308d) && toString().equals(obj.toString());
    }

    /* renamed from: h */
    public C2308d m2066h(String str) {
        if (str != null) {
            if (m2048d().isEmpty()) {
                C2473m.m1512c(str);
            } else {
                C2473m.m1513b(str);
            }
            return new C2308d(this.f6125a, m2048d().m1390i(new C2506l(str)));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
    }

    public int hashCode() {
        return toString().hashCode();
    }

    /* renamed from: i */
    public String m2065i() {
        if (m2048d().isEmpty()) {
            return null;
        }
        return m2048d().m1386u().m1164e();
    }

    /* renamed from: j */
    public C2308d m2064j() {
        C2506l m1383y = m2048d().m1383y();
        if (m1383y != null) {
            return new C2308d(this.f6125a, m1383y);
        }
        return null;
    }

    public String toString() {
        C2308d m2064j = m2064j();
        if (m2064j == null) {
            return this.f6125a.toString();
        }
        try {
            return m2064j.toString() + "/" + URLEncoder.encode(m2065i(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            throw new C2307c("Failed to URLEncode key: " + m2065i(), e);
        }
    }
}
