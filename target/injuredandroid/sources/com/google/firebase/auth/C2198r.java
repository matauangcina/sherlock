package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.r */
/* loaded from: classes.dex */
public class C2198r extends AbstractC2126b {
    public static final Parcelable.Creator<C2198r> CREATOR = new C2203t0();

    /* renamed from: f */
    private final String f5961f;

    /* renamed from: g */
    private final String f5962g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2198r(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        m2281j(str, "idToken");
        this.f5961f = str;
        m2281j(str2, "accessToken");
        this.f5962g = str2;
    }

    /* renamed from: h */
    public static C1182a2 m2282h(C2198r c2198r, String str) {
        C1679r.m3631h(c2198r);
        return new C1182a2(c2198r.f5961f, c2198r.f5962g, c2198r.mo2270b(), null, null, null, str, null, null);
    }

    /* renamed from: j */
    private static String m2281j(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return new C2198r(this.f5961f, this.f5962g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5961f, false);
        C1687c.m3587k(parcel, 2, this.f5962g, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
