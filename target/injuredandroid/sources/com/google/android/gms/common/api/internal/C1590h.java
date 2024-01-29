package com.google.android.gms.common.api.internal;
/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public final class C1590h<L> {

    /* renamed from: a */
    private final L f4691a;

    /* renamed from: b */
    private final String f4692b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1590h) {
            C1590h c1590h = (C1590h) obj;
            return this.f4691a == c1590h.f4691a && this.f4692b.equals(c1590h.f4692b);
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f4691a) * 31) + this.f4692b.hashCode();
    }
}
