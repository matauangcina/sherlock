package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: com.google.firebase.auth.t */
/* loaded from: classes.dex */
public class C2202t extends AbstractC2126b implements Cloneable {
    public static final Parcelable.Creator<C2202t> CREATOR = new C2129c0();

    /* renamed from: f */
    private String f5964f;

    /* renamed from: g */
    private String f5965g;

    /* renamed from: h */
    private boolean f5966h;

    /* renamed from: i */
    private String f5967i;

    /* renamed from: j */
    private boolean f5968j;

    /* renamed from: k */
    private String f5969k;

    /* renamed from: l */
    private String f5970l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2202t(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        C1679r.m3637b((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || (z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || !((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f5964f = str;
        this.f5965g = str2;
        this.f5966h = z;
        this.f5967i = str3;
        this.f5968j = z2;
        this.f5969k = str4;
        this.f5970l = str5;
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: b */
    public String mo2270b() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AbstractC2126b
    /* renamed from: c */
    public final AbstractC2126b mo2269c() {
        return (C2202t) clone();
    }

    public /* synthetic */ Object clone() {
        return new C2202t(this.f5964f, m2280h(), this.f5966h, this.f5967i, this.f5968j, this.f5969k, this.f5970l);
    }

    /* renamed from: h */
    public String m2280h() {
        return this.f5965g;
    }

    /* renamed from: j */
    public final C2202t m2279j(boolean z) {
        this.f5968j = false;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3587k(parcel, 1, this.f5964f, false);
        C1687c.m3587k(parcel, 2, m2280h(), false);
        C1687c.m3595c(parcel, 3, this.f5966h);
        C1687c.m3587k(parcel, 4, this.f5967i, false);
        C1687c.m3595c(parcel, 5, this.f5968j);
        C1687c.m3587k(parcel, 6, this.f5969k, false);
        C1687c.m3587k(parcel, 7, this.f5970l, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
