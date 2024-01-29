package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC1667l;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import com.google.android.gms.common.internal.p117w.C1687c;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p063b.C1149e;
/* renamed from: com.google.android.gms.common.internal.g */
/* loaded from: classes.dex */
public class C1656g extends AbstractC1684a {
    public static final Parcelable.Creator<C1656g> CREATOR = new C1653e0();

    /* renamed from: f */
    private final int f4805f;

    /* renamed from: g */
    private final int f4806g;

    /* renamed from: h */
    private int f4807h;

    /* renamed from: i */
    String f4808i;

    /* renamed from: j */
    IBinder f4809j;

    /* renamed from: k */
    Scope[] f4810k;

    /* renamed from: l */
    Bundle f4811l;

    /* renamed from: m */
    Account f4812m;

    /* renamed from: n */
    C1146c[] f4813n;

    /* renamed from: o */
    C1146c[] f4814o;

    /* renamed from: p */
    private boolean f4815p;

    public C1656g(int i) {
        this.f4805f = 4;
        this.f4807h = C1149e.f3865a;
        this.f4806g = i;
        this.f4815p = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1656g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1146c[] c1146cArr, C1146c[] c1146cArr2, boolean z) {
        this.f4805f = i;
        this.f4806g = i2;
        this.f4807h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f4808i = "com.google.android.gms";
        } else {
            this.f4808i = str;
        }
        if (i < 2) {
            this.f4812m = iBinder != null ? BinderC1630a.m3778h(InterfaceC1667l.AbstractBinderC1668a.m3653g(iBinder)) : null;
        } else {
            this.f4809j = iBinder;
            this.f4812m = account;
        }
        this.f4810k = scopeArr;
        this.f4811l = bundle;
        this.f4813n = c1146cArr;
        this.f4814o = c1146cArr2;
        this.f4815p = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m3597a = C1687c.m3597a(parcel);
        C1687c.m3591g(parcel, 1, this.f4805f);
        C1687c.m3591g(parcel, 2, this.f4806g);
        C1687c.m3591g(parcel, 3, this.f4807h);
        C1687c.m3587k(parcel, 4, this.f4808i, false);
        C1687c.m3592f(parcel, 5, this.f4809j, false);
        C1687c.m3585m(parcel, 6, this.f4810k, i, false);
        C1687c.m3593e(parcel, 7, this.f4811l, false);
        C1687c.m3588j(parcel, 8, this.f4812m, i, false);
        C1687c.m3585m(parcel, 10, this.f4813n, i, false);
        C1687c.m3585m(parcel, 11, this.f4814o, i, false);
        C1687c.m3595c(parcel, 12, this.f4815p);
        C1687c.m3596b(parcel, m3597a);
    }
}
