package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* loaded from: classes.dex */
public final class Scope extends AbstractC1684a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1628o();

    /* renamed from: f */
    private final int f4595f;

    /* renamed from: g */
    private final String f4596g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        C1679r.m3632g(str, "scopeUri must not be null or empty");
        this.f4595f = i;
        this.f4596g = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: b */
    public final String m3970b() {
        return this.f4596g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4596g.equals(((Scope) obj).f4596g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4596g.hashCode();
    }

    public final String toString() {
        return this.f4596g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4595f);
        C1687c.m3587k(parcel, 2, m3970b(), false);
        C1687c.m3596b(parcel, m3597a);
    }
}
