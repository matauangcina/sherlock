package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
/* renamed from: com.google.android.gms.common.internal.s */
/* loaded from: classes.dex */
public class C1680s extends AbstractC1684a {
    public static final Parcelable.Creator<C1680s> CREATOR = new C1631a0();

    /* renamed from: f */
    private final int f4847f;

    /* renamed from: g */
    private final Account f4848g;

    /* renamed from: h */
    private final int f4849h;

    /* renamed from: i */
    private final GoogleSignInAccount f4850i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1680s(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f4847f = i;
        this.f4848g = account;
        this.f4849h = i2;
        this.f4850i = googleSignInAccount;
    }

    public C1680s(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: b */
    public Account m3627b() {
        return this.f4848g;
    }

    /* renamed from: c */
    public int m3626c() {
        return this.f4849h;
    }

    /* renamed from: h */
    public GoogleSignInAccount m3625h() {
        return this.f4850i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4847f);
        C1687c.m3588j(parcel, 2, m3627b(), i, false);
        C1687c.m3591g(parcel, 3, m3626c());
        C1687c.m3588j(parcel, 4, m3625h(), i, false);
        C1687c.m3596b(parcel, m3597a);
    }
}
