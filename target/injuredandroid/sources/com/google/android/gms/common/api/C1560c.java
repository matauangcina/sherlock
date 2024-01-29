package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C1574b;
import java.util.ArrayList;
import p000a.p014d.C0066a;
import p054b.p059c.p060a.p061a.p063b.C1144a;
/* renamed from: com.google.android.gms.common.api.c */
/* loaded from: classes.dex */
public class C1560c extends Exception {

    /* renamed from: f */
    private final C0066a<C1574b<?>, C1144a> f4606f;

    public C1560c(C0066a<C1574b<?>, C1144a> c0066a) {
        this.f4606f = c0066a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C1574b<?> c1574b : this.f4606f.keySet()) {
            C1144a c1144a = this.f4606f.get(c1574b);
            if (c1144a.m4807k()) {
                z = false;
            }
            String m3911a = c1574b.m3911a();
            String valueOf = String.valueOf(c1144a);
            StringBuilder sb = new StringBuilder(String.valueOf(m3911a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(m3911a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
