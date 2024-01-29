package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;
/* renamed from: io.flutter.embedding.engine.b */
/* loaded from: classes.dex */
public class C2823b {

    /* renamed from: b */
    private static C2823b f7019b;

    /* renamed from: a */
    private final Map<String, C2820a> f7020a = new HashMap();

    C2823b() {
    }

    /* renamed from: b */
    public static C2823b m587b() {
        if (f7019b == null) {
            f7019b = new C2823b();
        }
        return f7019b;
    }

    /* renamed from: a */
    public C2820a m588a(String str) {
        return this.f7020a.get(str);
    }

    /* renamed from: c */
    public void m586c(String str, C2820a c2820a) {
        if (c2820a != null) {
            this.f7020a.put(str, c2820a);
        } else {
            this.f7020a.remove(str);
        }
    }

    /* renamed from: d */
    public void m585d(String str) {
        m586c(str, null);
    }
}
