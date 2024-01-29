package p108c.p109a.p110c.p111a;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: c.a.c.a.e */
/* loaded from: classes.dex */
public final class C1512e implements InterfaceC1522j {

    /* renamed from: a */
    public static final C1512e f4546a = new C1512e();

    private C1512e() {
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: a */
    public ByteBuffer mo4013a(Object obj) {
        return C1511d.f4545a.mo4006a(new JSONArray().put(C1513f.m4041a(obj)));
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: b */
    public ByteBuffer mo4012b(String str, String str2, Object obj, String str3) {
        return C1511d.f4545a.mo4006a(new JSONArray().put(str).put(C1513f.m4041a(str2)).put(C1513f.m4041a(obj)).put(C1513f.m4041a(str3)));
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: c */
    public ByteBuffer mo4011c(String str, String str2, Object obj) {
        return C1511d.f4545a.mo4006a(new JSONArray().put(str).put(C1513f.m4041a(str2)).put(C1513f.m4041a(obj)));
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: d */
    public C1515h mo4010d(ByteBuffer byteBuffer) {
        try {
            Object mo4005b = C1511d.f4545a.mo4005b(byteBuffer);
            if (mo4005b instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) mo4005b;
                Object obj = jSONObject.get("method");
                Object m4042g = m4042g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new C1515h((String) obj, m4042g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + mo4005b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: e */
    public Object mo4009e(ByteBuffer byteBuffer) {
        try {
            Object mo4005b = C1511d.f4545a.mo4005b(byteBuffer);
            if (mo4005b instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) mo4005b;
                if (jSONArray.length() == 1) {
                    return m4042g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object m4042g = m4042g(jSONArray.opt(1));
                    Object m4042g2 = m4042g(jSONArray.opt(2));
                    if ((obj instanceof String) && (m4042g == null || (m4042g instanceof String))) {
                        throw new C1510c((String) obj, (String) m4042g, m4042g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + mo4005b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1522j
    /* renamed from: f */
    public ByteBuffer mo4008f(C1515h c1515h) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", c1515h.f4547a);
            jSONObject.put("args", C1513f.m4041a(c1515h.f4548b));
            return C1511d.f4545a.mo4006a(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: g */
    Object m4042g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
