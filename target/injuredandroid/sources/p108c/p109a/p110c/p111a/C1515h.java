package p108c.p109a.p110c.p111a;

import java.util.Map;
import org.json.JSONObject;
/* renamed from: c.a.c.a.h */
/* loaded from: classes.dex */
public final class C1515h {

    /* renamed from: a */
    public final String f4547a;

    /* renamed from: b */
    public final Object f4548b;

    public C1515h(String str, Object obj) {
        this.f4547a = str;
        this.f4548b = obj;
    }

    /* renamed from: a */
    public <T> T m4040a(String str) {
        Object obj = this.f4548b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    /* renamed from: b */
    public <T> T m4039b() {
        return (T) this.f4548b;
    }
}
