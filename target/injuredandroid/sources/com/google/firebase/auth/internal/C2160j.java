package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.util.C1694b;
import com.google.firebase.auth.p118z.C2273b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.p014d.C0066a;
import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p068d.p071c.AbstractC1184b0;
import p054b.p059c.p060a.p061a.p068d.p071c.C1220l;
/* renamed from: com.google.firebase.auth.internal.j */
/* loaded from: classes.dex */
final class C2160j {

    /* renamed from: a */
    private static final C1155a f5914a = new C1155a("JSONParser", new String[0]);

    /* renamed from: a */
    private static List<Object> m2358a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m2358a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m2356c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, Object> m2357b(String str) {
        C1679r.m3633f(str);
        List<String> m4701c = C1220l.m4702b('.').m4701c(str);
        if (m4701c.size() < 2) {
            C1155a c1155a = f5914a;
            String valueOf = String.valueOf(str);
            c1155a.m4767b(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "), new Object[0]);
        } else {
            try {
                Map<String, Object> m2355d = m2355d(new String(C1694b.m3567b(m4701c.get(1)), "UTF-8"));
                return m2355d == null ? AbstractC1184b0.m4731a() : m2355d;
            } catch (UnsupportedEncodingException e) {
                f5914a.m4768a("Unable to decode token", e, new Object[0]);
            }
        }
        return AbstractC1184b0.m4731a();
    }

    /* renamed from: c */
    private static Map<String, Object> m2356c(JSONObject jSONObject) {
        C0066a c0066a = new C0066a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m2358a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m2356c((JSONObject) obj);
            }
            c0066a.put(next, obj);
        }
        return c0066a;
    }

    /* renamed from: d */
    public static Map<String, Object> m2355d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m2356c(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new C2273b(e);
        }
    }
}
