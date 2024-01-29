package com.google.firebase.database.p124p.p125e0;

import com.google.firebase.database.p124p.C2411b;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p131r.C2570b;
/* renamed from: com.google.firebase.database.p.e0.c */
/* loaded from: classes.dex */
public class C2424c extends AbstractC2425d {

    /* renamed from: d */
    private final C2411b f6367d;

    public C2424c(C2427e c2427e, C2506l c2506l, C2411b c2411b) {
        super(AbstractC2425d.EnumC2426a.Merge, c2427e, c2506l);
        this.f6367d = c2411b;
    }

    @Override // com.google.firebase.database.p124p.p125e0.AbstractC2425d
    /* renamed from: d */
    public AbstractC2425d mo1695d(C2570b c2570b) {
        if (!this.f6370c.isEmpty()) {
            if (this.f6370c.m1384x().equals(c2570b)) {
                return new C2424c(this.f6369b, this.f6370c.m1396A(), this.f6367d);
            }
            return null;
        }
        C2411b m1747l = this.f6367d.m1747l(new C2506l(c2570b));
        if (m1747l.isEmpty()) {
            return null;
        }
        return m1747l.m1753C() != null ? new C2429f(this.f6369b, C2506l.m1385w(), m1747l.m1753C()) : new C2424c(this.f6369b, C2506l.m1385w(), m1747l);
    }

    /* renamed from: e */
    public C2411b m1703e() {
        return this.f6367d;
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", m1702a(), m1701b(), this.f6367d);
    }
}
