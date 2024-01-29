package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: com.google.firebase.auth.c */
/* loaded from: classes.dex */
public class C2128c extends AbstractC2126b {
    public static final Parcelable.Creator<C2128c> CREATOR = new C2187l0();

    /* renamed from: f */
    private String f5860f;

    /* renamed from: g */
    private String f5861g;

    /* renamed from: h */
    private final String f5862h;

    /* renamed from: i */
    private String f5863i;

    /* renamed from: j */
    private boolean f5864j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2128c(String str, String str2, String str3, String str4, boolean z) {
        C1679r.m3633f(str);
        this.f5860f = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f5861g = str2;
        this.f5862h = str3;
        this.f5863i = str4;
        this.f5864j = z;
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return "password";
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return new C2128c(this.f5860f, this.f5861g, this.f5862h, this.f5863i, this.f5864j);
    }

    /* renamed from: h */
    public String m2401h() {
        return !TextUtils.isEmpty(this.f5861g) ? "password" : "emailLink";
    }

    /* renamed from: j */
    public final C2128c m2400j(AbstractC2190n abstractC2190n) {
        this.f5863i = abstractC2190n.mo2291x();
        this.f5864j = true;
        return this;
    }

    /* renamed from: k */
    public final String m2399k() {
        return this.f5860f;
    }

    /* renamed from: n */
    public final String m2398n() {
        return this.f5861g;
    }

    /* renamed from: o */
    public final String m2397o() {
        return this.f5862h;
    }

    /* renamed from: p */
    public final boolean m2396p() {
        return !TextUtils.isEmpty(this.f5862h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5860f, false);
        C1687c.m3587k(parcel, 2, this.f5861g, false);
        C1687c.m3587k(parcel, 3, this.f5862h, false);
        C1687c.m3587k(parcel, 4, this.f5863i, false);
        C1687c.m3595c(parcel, 5, this.f5864j);
        C1687c.m3596b(parcel, m3597a);
    }
}
