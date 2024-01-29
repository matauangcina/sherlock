package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.d */
/* loaded from: classes.dex */
public class C2130d extends AbstractC2126b {
    public static final Parcelable.Creator<C2130d> CREATOR = new C2189m0();

    /* renamed from: f */
    private final String f5865f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2130d(String str) {
        C1679r.m3633f(str);
        this.f5865f = str;
    }

    /* renamed from: h */
    public static C1182a2 m2395h(C2130d c2130d, String str) {
        C1679r.m3631h(c2130d);
        return new C1182a2(null, c2130d.f5865f, c2130d.mo2270b(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return new C2130d(this.f5865f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5865f, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
