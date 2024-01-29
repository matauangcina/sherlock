package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.x */
/* loaded from: classes.dex */
public class C2209x extends AbstractC2126b {
    public static final Parcelable.Creator<C2209x> CREATOR = new C2137g0();

    /* renamed from: f */
    private String f5973f;

    /* renamed from: g */
    private String f5974g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2209x(String str, String str2) {
        C1679r.m3633f(str);
        this.f5973f = str;
        C1679r.m3633f(str2);
        this.f5974g = str2;
    }

    /* renamed from: h */
    public static C1182a2 m2268h(C2209x c2209x, String str) {
        C1679r.m3631h(c2209x);
        return new C1182a2(null, c2209x.f5973f, c2209x.mo2270b(), null, c2209x.f5974g, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return new C2209x(this.f5973f, this.f5974g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5973f, false);
        C1687c.m3587k(parcel, 2, this.f5974g, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
