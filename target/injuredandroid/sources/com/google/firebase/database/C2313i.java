package com.google.firebase.database;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2535s;
import com.google.firebase.database.p124p.C2562z;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.i */
/* loaded from: classes.dex */
public class C2313i {

    /* renamed from: a */
    private final C2535s f6123a;

    /* renamed from: b */
    private final C2506l f6124b;

    private C2313i(C2535s c2535s, C2506l c2506l) {
        this.f6123a = c2535s;
        this.f6124b = c2506l;
        C2562z.m1187g(c2506l, m2052b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2313i(InterfaceC2594n interfaceC2594n) {
        this(new C2535s(interfaceC2594n), new C2506l(""));
    }

    /* renamed from: a */
    InterfaceC2594n m2053a() {
        return this.f6123a.m1288a(this.f6124b);
    }

    /* renamed from: b */
    public Object m2052b() {
        return m2053a().getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2313i) {
            C2313i c2313i = (C2313i) obj;
            if (this.f6123a.equals(c2313i.f6123a) && this.f6124b.equals(c2313i.f6124b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        C2570b m1384x = this.f6124b.m1384x();
        StringBuilder sb = new StringBuilder();
        sb.append("MutableData { key = ");
        sb.append(m1384x != null ? m1384x.m1164e() : "<none>");
        sb.append(", value = ");
        sb.append(this.f6123a.m1287b().mo1081r(true));
        sb.append(" }");
        return sb.toString();
    }
}
