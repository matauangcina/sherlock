package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C1559b;
import com.google.android.gms.common.api.C1623j;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes.dex */
public class C1632b {
    /* renamed from: a */
    public static C1559b m3777a(Status status) {
        return status.m3967h() ? new C1623j(status) : new C1559b(status);
    }
}
