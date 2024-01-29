package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.w */
/* loaded from: classes.dex */
public class C2208w extends AbstractC2126b {
    public static final Parcelable.Creator<C2208w> CREATOR = new C2135f0();

    /* renamed from: f */
    private final String f5972f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2208w(String str) {
        C1679r.m3633f(str);
        this.f5972f = str;
    }

    /* renamed from: h */
    public static C1182a2 m2271h(C2208w c2208w, String str) {
        C1679r.m3631h(c2208w);
        return new C1182a2(null, null, c2208w.mo2270b(), null, null, c2208w.f5972f, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return new C2208w(this.f5972f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5972f, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
