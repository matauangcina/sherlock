package com.google.firebase.auth;

import java.util.Map;
/* renamed from: com.google.firebase.auth.p */
/* loaded from: classes.dex */
public class C2194p {

    /* renamed from: a */
    private String f5957a;

    /* renamed from: b */
    private Map<String, Object> f5958b;

    public C2194p(String str, Map<String, Object> map) {
        this.f5957a = str;
        this.f5958b = map;
    }

    /* renamed from: a */
    public Map<String, Object> m2286a() {
        return this.f5958b;
    }

    /* renamed from: b */
    public String m2285b() {
        Map map = (Map) this.f5958b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    /* renamed from: c */
    public String m2284c() {
        return this.f5957a;
    }
}
