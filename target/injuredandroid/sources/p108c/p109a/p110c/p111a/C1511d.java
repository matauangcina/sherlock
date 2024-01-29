package p108c.p109a.p110c.p111a;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* renamed from: c.a.c.a.d */
/* loaded from: classes.dex */
public final class C1511d implements InterfaceC1514g<Object> {

    /* renamed from: a */
    public static final C1511d f4545a = new C1511d();

    private C1511d() {
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1514g
    /* renamed from: a */
    public ByteBuffer mo4006a(Object obj) {
        C1532s c1532s;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object m4041a = C1513f.m4041a(obj);
        if (m4041a instanceof String) {
            c1532s = C1532s.f4564b;
            obj2 = JSONObject.quote((String) m4041a);
        } else {
            c1532s = C1532s.f4564b;
            obj2 = m4041a.toString();
        }
        return c1532s.mo4006a(obj2);
    }

    @Override // p108c.p109a.p110c.p111a.InterfaceC1514g
    /* renamed from: b */
    public Object mo4005b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(C1532s.f4564b.mo4005b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }
}
