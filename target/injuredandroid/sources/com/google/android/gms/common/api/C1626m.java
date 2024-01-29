package com.google.android.gms.common.api;

import p054b.p059c.p060a.p061a.p063b.C1146c;
/* renamed from: com.google.android.gms.common.api.m */
/* loaded from: classes.dex */
public final class C1626m extends UnsupportedOperationException {

    /* renamed from: f */
    private final C1146c f4741f;

    public C1626m(C1146c c1146c) {
        this.f4741f = c1146c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.f4741f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
