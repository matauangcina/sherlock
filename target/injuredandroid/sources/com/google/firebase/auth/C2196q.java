package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.q */
/* loaded from: classes.dex */
public class C2196q extends AbstractC2126b {
    public static final Parcelable.Creator<C2196q> CREATOR = new C2201s0();

    /* renamed from: f */
    private String f5960f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2196q(String str) {
        C1679r.m3633f(str);
        this.f5960f = str;
    }

    /* renamed from: h */
    public static C1182a2 m2283h(C2196q c2196q, String str) {
        C1679r.m3631h(c2196q);
        return new C1182a2(null, c2196q.f5960f, c2196q.mo2270b(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return new C2196q(this.f5960f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5960f, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
