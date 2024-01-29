package com.google.firebase.database.p124p.p125e0;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.p125e0.AbstractC2425d;
import com.google.firebase.database.p124p.p127g0.C2457d;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p131r.C2570b;
/* renamed from: com.google.firebase.database.p.e0.a */
/* loaded from: classes.dex */
public class C2422a extends AbstractC2425d {

    /* renamed from: d */
    private final boolean f6365d;

    /* renamed from: e */
    private final C2457d<Boolean> f6366e;

    public C2422a(C2506l c2506l, C2457d<Boolean> c2457d, boolean z) {
        super(AbstractC2425d.EnumC2426a.AckUserWrite, C2427e.f6376d, c2506l);
        this.f6366e = c2457d;
        this.f6365d = z;
    }

    @Override // com.google.firebase.database.p124p.p125e0.AbstractC2425d
    /* renamed from: d */
    public AbstractC2425d mo1695d(C2570b c2570b) {
        if (!this.f6370c.isEmpty()) {
            C2472l.m1519f(this.f6370c.m1384x().equals(c2570b), "operationForChild called for unrelated child.");
            return new C2422a(this.f6370c.m1396A(), this.f6366e, this.f6365d);
        } else if (this.f6366e.getValue() != null) {
            C2472l.m1519f(this.f6366e.m1553w().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new C2422a(C2506l.m1385w(), this.f6366e.m1564D(new C2506l(c2570b)), this.f6365d);
        }
    }

    /* renamed from: e */
    public C2457d<Boolean> m1705e() {
        return this.f6366e;
    }

    /* renamed from: f */
    public boolean m1704f() {
        return this.f6365d;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", m1702a(), Boolean.valueOf(this.f6365d), this.f6366e);
    }
}
