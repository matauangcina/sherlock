package p054b.p059c.p060a.p061a.p063b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1677q;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: b.c.a.a.b.c */
/* loaded from: classes.dex */
public class C1146c extends AbstractC1684a {
    public static final Parcelable.Creator<C1146c> CREATOR = new C1160o();

    /* renamed from: f */
    private final String f3857f;
    @Deprecated

    /* renamed from: g */
    private final int f3858g;

    /* renamed from: h */
    private final long f3859h;

    public C1146c(String str, int i, long j) {
        this.f3857f = str;
        this.f3858g = i;
        this.f3859h = j;
    }

    public C1146c(String str, long j) {
        this.f3857f = str;
        this.f3859h = j;
        this.f3858g = -1;
    }

    /* renamed from: b */
    public String m4804b() {
        return this.f3857f;
    }

    /* renamed from: c */
    public long m4803c() {
        long j = this.f3859h;
        return j == -1 ? this.f3858g : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1146c) {
            C1146c c1146c = (C1146c) obj;
            if (((m4804b() != null && m4804b().equals(c1146c.m4804b())) || (m4804b() == null && c1146c.m4804b() == null)) && m4803c() == c1146c.m4803c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1677q.m3641b(m4804b(), Long.valueOf(m4803c()));
    }

    public String toString() {
        C1677q.C1678a m3640c = C1677q.m3640c(this);
        m3640c.m3639a("name", m4804b());
        m3640c.m3639a("version", Long.valueOf(m4803c()));
        return m3640c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, m4804b(), false);
        C1687c.m3591g(parcel, 2, this.f3858g);
        C1687c.m3590h(parcel, 3, m4803c());
        C1687c.m3596b(parcel, m3597a);
    }
}
