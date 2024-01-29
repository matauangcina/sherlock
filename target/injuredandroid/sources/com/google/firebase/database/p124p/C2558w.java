package com.google.firebase.database.p124p;
/* renamed from: com.google.firebase.database.p.w */
/* loaded from: classes.dex */
public final class C2558w {

    /* renamed from: a */
    private final long f6679a;

    public C2558w(long j) {
        this.f6679a = j;
    }

    /* renamed from: a */
    public long m1203a() {
        return this.f6679a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2558w.class == obj.getClass() && this.f6679a == ((C2558w) obj).f6679a;
    }

    public int hashCode() {
        long j = this.f6679a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.f6679a + '}';
    }
}
