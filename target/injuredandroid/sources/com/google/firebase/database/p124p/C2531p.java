package com.google.firebase.database.p124p;

import com.google.firebase.database.C2310f;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.p */
/* loaded from: classes.dex */
public class C2531p {

    /* renamed from: b */
    private static final C2531p f6608b = new C2531p();

    /* renamed from: a */
    private final Map<C2449g, Map<String, C2509n>> f6609a = new HashMap();

    /* renamed from: a */
    private C2509n m1299a(C2449g c2449g, C2530o c2530o, C2310f c2310f) {
        C2509n c2509n;
        c2449g.m1594i();
        String str = "https://" + c2530o.f6605a + "/" + c2530o.f6607c;
        synchronized (this.f6609a) {
            if (!this.f6609a.containsKey(c2449g)) {
                this.f6609a.put(c2449g, new HashMap());
            }
            Map<String, C2509n> map = this.f6609a.get(c2449g);
            if (map.containsKey(str)) {
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
            }
            c2509n = new C2509n(c2530o, c2449g, c2310f);
            map.put(str, c2509n);
        }
        return c2509n;
    }

    /* renamed from: b */
    public static C2509n m1298b(C2449g c2449g, C2530o c2530o, C2310f c2310f) {
        return f6608b.m1299a(c2449g, c2530o, c2310f);
    }
}
