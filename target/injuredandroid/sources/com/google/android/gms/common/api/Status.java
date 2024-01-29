package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1677q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* loaded from: classes.dex */
public final class Status extends AbstractC1684a implements InterfaceC1624k, ReflectedParcelable {

    /* renamed from: f */
    private final int f4600f;

    /* renamed from: g */
    private final int f4601g;

    /* renamed from: h */
    private final String f4602h;

    /* renamed from: i */
    private final PendingIntent f4603i;

    /* renamed from: j */
    public static final Status f4597j = new Status(0);

    /* renamed from: k */
    public static final Status f4598k = new Status(15);

    /* renamed from: l */
    public static final Status f4599l = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new C1629p();

    public Status(int i) {
        this(i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f4600f = i;
        this.f4601g = i2;
        this.f4602h = str;
        this.f4603i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    /* renamed from: b */
    public final int m3969b() {
        return this.f4601g;
    }

    /* renamed from: c */
    public final String m3968c() {
        return this.f4602h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f4600f == status.f4600f && this.f4601g == status.f4601g && C1677q.m3642a(this.f4602h, status.f4602h) && C1677q.m3642a(this.f4603i, status.f4603i);
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.InterfaceC1624k
    public final Status getStatus() {
        return this;
    }

    /* renamed from: h */
    public final boolean m3967h() {
        return this.f4603i != null;
    }

    public final int hashCode() {
        return C1677q.m3641b(Integer.valueOf(this.f4600f), Integer.valueOf(this.f4601g), this.f4602h, this.f4603i);
    }

    /* renamed from: j */
    public final String m3966j() {
        String str = this.f4602h;
        return str != null ? str : C1561d.m3948a(this.f4601g);
    }

    public final String toString() {
        C1677q.C1678a m3640c = C1677q.m3640c(this);
        m3640c.m3639a("statusCode", m3966j());
        m3640c.m3639a("resolution", this.f4603i);
        return m3640c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, m3969b());
        C1687c.m3587k(parcel, 2, m3968c(), false);
        C1687c.m3588j(parcel, 3, this.f4603i, i, false);
        C1687c.m3591g(parcel, 1000, this.f4600f);
        C1687c.m3596b(parcel, m3597a);
    }
}
