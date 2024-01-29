package com.google.firebase.database.p133t;

import java.io.IOException;
import java.util.Map;
/* renamed from: com.google.firebase.database.t.a */
/* loaded from: classes.dex */
public class C2624a {

    /* renamed from: a */
    private final String f6806a;

    /* renamed from: b */
    private final Map<String, Object> f6807b;

    public C2624a(String str, Map<String, Object> map) {
        this.f6806a = str;
        this.f6807b = map;
    }

    /* renamed from: c */
    public static C2624a m995c(String str) {
        if (str.startsWith("gauth|")) {
            try {
                Map<String, Object> m994a = C2625b.m994a(str.substring(6));
                return new C2624a((String) m994a.get("token"), (Map) m994a.get("auth"));
            } catch (IOException e) {
                throw new RuntimeException("Failed to parse gauth token", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public Map<String, Object> m997a() {
        return this.f6807b;
    }

    /* renamed from: b */
    public String m996b() {
        return this.f6806a;
    }
}
