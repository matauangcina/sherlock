package com.google.firebase.database.p124p.p125e0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p131r.C2570b;
/* renamed from: com.google.firebase.database.p.e0.b */
/* loaded from: classes.dex */
public class C2423b extends AbstractC2425d {
    public C2423b(C2427e c2427e, C2506l c2506l) {
        super(AbstractC2425d.EnumC2426a.ListenComplete, c2427e, c2506l);
    }

    @Override // com.google.firebase.database.p124p.p125e0.AbstractC2425d
    /* renamed from: d */
    public AbstractC2425d mo1695d(C2570b c2570b) {
        return this.f6370c.isEmpty() ? new C2423b(this.f6369b, C2506l.m1385w()) : new C2423b(this.f6369b, this.f6370c.m1396A());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", m1702a(), m1701b());
    }
}
