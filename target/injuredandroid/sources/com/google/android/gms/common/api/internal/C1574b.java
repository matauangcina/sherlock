package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.C1548a.InterfaceC1552d;
import com.google.android.gms.common.internal.C1677q;
/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: classes.dex */
public final class C1574b<O extends C1548a.InterfaceC1552d> {

    /* renamed from: a */
    private final boolean f4631a = false;

    /* renamed from: b */
    private final int f4632b;

    /* renamed from: c */
    private final C1548a<O> f4633c;

    /* renamed from: d */
    private final O f4634d;

    private C1574b(C1548a<O> c1548a, O o) {
        this.f4633c = c1548a;
        this.f4634d = o;
        this.f4632b = C1677q.m3641b(c1548a, o);
    }

    /* renamed from: b */
    public static <O extends C1548a.InterfaceC1552d> C1574b<O> m3910b(C1548a<O> c1548a, O o) {
        return new C1574b<>(c1548a, o);
    }

    /* renamed from: a */
    public final String m3911a() {
        return this.f4633c.m3965a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1574b) {
            C1574b c1574b = (C1574b) obj;
            return !this.f4631a && !c1574b.f4631a && C1677q.m3642a(this.f4633c, c1574b.f4633c) && C1677q.m3642a(this.f4634d, c1574b.f4634d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4632b;
    }
}
