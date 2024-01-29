package com.google.firebase.database.p133t;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
/* renamed from: com.google.firebase.database.t.b */
/* loaded from: classes.dex */
public class C2625b {
    /* renamed from: a */
    public static Map<String, Object> m994a(String str) {
        try {
            return m987h(new JSONObject(str));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: b */
    public static Object m993b(String str) {
        try {
            return m989f(new JSONTokener(str).nextValue());
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: c */
    public static String m992c(Map<String, Object> map) {
        return m991d(map);
    }

    /* renamed from: d */
    public static String m991d(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e) {
                throw new IOException("Could not serialize number", e);
            }
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        } else {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                m990e(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (JSONException e2) {
                throw new IOException("Failed to serialize JSON", e2);
            }
        }
    }

    /* renamed from: e */
    private static void m990e(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                m990e(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
        } else {
            jSONStringer.array();
            for (Object obj2 : (Collection) obj) {
                m990e(obj2, jSONStringer);
            }
            jSONStringer.endArray();
        }
    }

    /* renamed from: f */
    private static Object m989f(Object obj) {
        if (obj instanceof JSONObject) {
            return m987h((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return m988g((JSONArray) obj);
        }
        if (obj.equals(JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    private static List<Object> m988g(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m989f(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static Map<String, Object> m987h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m989f(jSONObject.get(next)));
        }
        return hashMap;
    }
}
