package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.AbstractC2190n;
import com.google.firebase.auth.AbstractC2205u0;
import com.google.firebase.auth.C2133e0;
import com.google.firebase.auth.p118z.C2273b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.auth.internal.q */
/* loaded from: classes.dex */
public final class C2172q {

    /* renamed from: a */
    private Context f5932a;

    /* renamed from: b */
    private String f5933b;

    /* renamed from: c */
    private SharedPreferences f5934c;

    /* renamed from: d */
    private C1155a f5935d;

    public C2172q(Context context, String str) {
        C1679r.m3631h(context);
        C1679r.m3633f(str);
        this.f5933b = str;
        this.f5932a = context.getApplicationContext();
        this.f5934c = this.f5932a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f5933b), 0);
        this.f5935d = new C1155a("StorageHelpers", new String[0]);
    }

    /* renamed from: b */
    private final C2149d0 m2331b(JSONObject jSONObject) {
        JSONArray jSONArray;
        C2151e0 m2364c;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(C2181z.m2310n(jSONArray2.getString(i)));
            }
            C2149d0 c2149d0 = new C2149d0(C1415c.m4198l(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                c2149d0.mo2297p(C1237q1.m4675c(string));
            }
            if (!z) {
                c2149d0.mo2296q();
            }
            c2149d0.m2374B(str);
            if (jSONObject.has("userMetadata") && (m2364c = C2151e0.m2364c(jSONObject.getJSONObject("userMetadata"))) != null) {
                c2149d0.m2373C(m2364c);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i2));
                    arrayList2.add("phone".equals(jSONObject2.optString("factorIdKey")) ? C2133e0.m2394c(jSONObject2) : null);
                }
                c2149d0.mo2295r(arrayList2);
            }
            return c2149d0;
        } catch (C2273b | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e) {
            this.f5935d.m4761h(e);
            return null;
        }
    }

    /* renamed from: g */
    private final String m2326g(AbstractC2190n abstractC2190n) {
        JSONObject jSONObject = new JSONObject();
        if (C2149d0.class.isAssignableFrom(abstractC2190n.getClass())) {
            C2149d0 c2149d0 = (C2149d0) abstractC2190n;
            try {
                jSONObject.put("cachedTokenState", c2149d0.mo2291x());
                jSONObject.put("applicationName", c2149d0.mo2294t().m4197m());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (c2149d0.m2370F() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List<C2181z> m2370F = c2149d0.m2370F();
                    for (int i = 0; i < m2370F.size(); i++) {
                        jSONArray.put(m2370F.get(i).m2308p());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", c2149d0.mo2302h());
                jSONObject.put("version", "2");
                if (c2149d0.m2375A() != null) {
                    jSONObject.put("userMetadata", ((C2151e0) c2149d0.m2375A()).m2363h());
                }
                List<AbstractC2205u0> mo2272a = ((C2155g0) c2149d0.mo2289z()).mo2272a();
                if (mo2272a != null && !mo2272a.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < mo2272a.size(); i2++) {
                        jSONArray2.put(mo2272a.get(i2).mo2277b());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                return jSONObject.toString();
            } catch (Exception e) {
                this.f5935d.m4762g("Failed to turn object into JSON", e, new Object[0]);
                throw new C2273b(e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final AbstractC2190n m2332a() {
        String string = this.f5934c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m2331b(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final void m2330c(AbstractC2190n abstractC2190n) {
        C1679r.m3631h(abstractC2190n);
        String m2326g = m2326g(abstractC2190n);
        if (TextUtils.isEmpty(m2326g)) {
            return;
        }
        this.f5934c.edit().putString("com.google.firebase.auth.FIREBASE_USER", m2326g).apply();
    }

    /* renamed from: d */
    public final void m2329d(AbstractC2190n abstractC2190n, C1237q1 c1237q1) {
        C1679r.m3631h(abstractC2190n);
        C1679r.m3631h(c1237q1);
        this.f5934c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC2190n.mo2303c()), c1237q1.m4669p()).apply();
    }

    /* renamed from: e */
    public final void m2328e(String str) {
        this.f5934c.edit().remove(str).apply();
    }

    /* renamed from: f */
    public final C1237q1 m2327f(AbstractC2190n abstractC2190n) {
        C1679r.m3631h(abstractC2190n);
        String string = this.f5934c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC2190n.mo2303c()), null);
        if (string != null) {
            return C1237q1.m4675c(string);
        }
        return null;
    }
}
