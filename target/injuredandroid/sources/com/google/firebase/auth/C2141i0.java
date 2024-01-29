package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1182a2;
/* renamed from: com.google.firebase.auth.i0 */
/* loaded from: classes.dex */
public class C2141i0 extends AbstractC2200s {
    public static final Parcelable.Creator<C2141i0> CREATOR = new C2185k0();

    /* renamed from: f */
    private final String f5874f;

    /* renamed from: g */
    private final String f5875g;

    /* renamed from: h */
    private final String f5876h;

    /* renamed from: i */
    private final C1182a2 f5877i;

    /* renamed from: j */
    private final String f5878j;

    /* renamed from: k */
    private final String f5879k;

    /* renamed from: l */
    private final String f5880l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2141i0(String str, String str2, String str3, C1182a2 c1182a2, String str4, String str5, String str6) {
        this.f5874f = str;
        this.f5875g = str2;
        this.f5876h = str3;
        this.f5877i = c1182a2;
        this.f5878j = str4;
        this.f5879k = str5;
        this.f5880l = str6;
    }

    /* renamed from: n */
    public static C1182a2 m2387n(C2141i0 c2141i0, String str) {
        C1679r.m3631h(c2141i0);
        C1182a2 c1182a2 = c2141i0.f5877i;
        return c1182a2 != null ? c1182a2 : new C1182a2(c2141i0.m2389j(), c2141i0.m2390h(), c2141i0.mo2270b(), null, c2141i0.m2388k(), null, str, c2141i0.f5878j, c2141i0.f5880l);
    }

    /* renamed from: o */
    public static C2141i0 m2386o(C1182a2 c1182a2) {
        C1679r.m3630i(c1182a2, "Must specify a non-null webSignInCredential");
        return new C2141i0(null, null, null, c1182a2, null, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return this.f5874f;
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return new C2141i0(this.f5874f, this.f5875g, this.f5876h, this.f5877i, this.f5878j, this.f5879k, this.f5880l);
    }

    /* renamed from: h */
    public String m2390h() {
        return this.f5876h;
    }

    /* renamed from: j */
    public String m2389j() {
        return this.f5875g;
    }

    /* renamed from: k */
    public String m2388k() {
        return this.f5879k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, mo2270b(), false);
        C1687c.m3587k(parcel, 2, m2389j(), false);
        C1687c.m3587k(parcel, 3, m2390h(), false);
        C1687c.m3588j(parcel, 4, this.f5877i, i, false);
        C1687c.m3587k(parcel, 5, this.f5878j, false);
        C1687c.m3587k(parcel, 6, m2388k(), false);
        C1687c.m3587k(parcel, 7, this.f5880l, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
