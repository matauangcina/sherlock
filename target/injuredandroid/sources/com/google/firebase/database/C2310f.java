package com.google.firebase.database;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.database.p124p.C2474h;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2509n;
import com.google.firebase.database.p124p.C2530o;
import com.google.firebase.database.p124p.C2531p;
import com.google.firebase.database.p124p.p127g0.C2464h;
import com.google.firebase.database.p124p.p127g0.C2472l;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.database.f */
/* loaded from: classes.dex */
public class C2310f {

    /* renamed from: a */
    private final C2530o f6117a;

    /* renamed from: b */
    private final C2474h f6118b;

    /* renamed from: c */
    private C2509n f6119c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2310f(C1415c c1415c, C2530o c2530o, C2474h c2474h) {
        this.f6117a = c2530o;
        this.f6118b = c2474h;
    }

    /* renamed from: a */
    private synchronized void m2062a() {
        if (this.f6119c == null) {
            this.f6119c = C2531p.m1298b(this.f6118b, this.f6117a, this);
        }
    }

    /* renamed from: b */
    public static C2310f m2061b() {
        C1415c m4199k = C1415c.m4199k();
        if (m4199k != null) {
            return m2060c(m4199k, m4199k.m4196n().m4178d());
        }
        throw new C2307c("You must call FirebaseApp.initialize() first.");
    }

    /* renamed from: c */
    public static synchronized C2310f m2060c(C1415c c1415c, String str) {
        C2310f m2057a;
        synchronized (C2310f.class) {
            if (TextUtils.isEmpty(str)) {
                throw new C2307c("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            C2464h m1518g = C2472l.m1518g(str);
            if (!m1518g.f6447b.isEmpty()) {
                throw new C2307c("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + m1518g.f6447b.toString());
            }
            C1679r.m3630i(c1415c, "Provided FirebaseApp must not be null.");
            C2311g c2311g = (C2311g) c1415c.m4202h(C2311g.class);
            C1679r.m3630i(c2311g, "Firebase Database component is not present.");
            m2057a = c2311g.m2057a(m1518g.f6446a);
        }
        return m2057a;
    }

    /* renamed from: e */
    public static String m2058e() {
        return "19.2.1";
    }

    /* renamed from: d */
    public C2308d m2059d() {
        m2062a();
        return new C2308d(this.f6119c, C2506l.m1385w());
    }
}
