package com.google.firebase.database;

import com.google.firebase.auth.internal.InterfaceC2144b;
import com.google.firebase.database.p120m.AbstractC2327e;
import com.google.firebase.database.p124p.C2474h;
import com.google.firebase.database.p124p.C2530o;
import com.google.firebase.database.p124p.InterfaceC2407a;
import java.util.HashMap;
import java.util.Map;
import p054b.p059c.p098c.C1415c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.database.g */
/* loaded from: classes.dex */
public class C2311g {

    /* renamed from: a */
    private final Map<C2530o, C2310f> f6120a = new HashMap();

    /* renamed from: b */
    private final C1415c f6121b;

    /* renamed from: c */
    private final InterfaceC2407a f6122c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2311g(C1415c c1415c, InterfaceC2144b interfaceC2144b) {
        this.f6121b = c1415c;
        this.f6122c = interfaceC2144b != null ? AbstractC2327e.m2029d(interfaceC2144b) : AbstractC2327e.m2028e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C2310f m2057a(C2530o c2530o) {
        C2310f c2310f;
        c2310f = this.f6120a.get(c2530o);
        if (c2310f == null) {
            C2474h c2474h = new C2474h();
            if (!this.f6121b.m4190t()) {
                c2474h.m1509H(this.f6121b.m4197m());
            }
            c2474h.m1510G(this.f6121b);
            c2474h.m1511F(this.f6122c);
            C2310f c2310f2 = new C2310f(this.f6121b, c2530o, c2474h);
            this.f6120a.put(c2530o, c2310f2);
            c2310f = c2310f2;
        }
        return c2310f;
    }
}
