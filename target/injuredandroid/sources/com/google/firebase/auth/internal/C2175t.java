package com.google.firebase.auth.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.C1689e;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.auth.internal.t */
/* loaded from: classes.dex */
public final class C2175t {

    /* renamed from: a */
    private static final Map<String, String> f5939a;

    static {
        HashMap hashMap = new HashMap();
        f5939a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f5939a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f5939a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f5939a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f5939a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static void m2323a(Intent intent, Status status) {
        C1689e.m3575e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: b */
    public static boolean m2322b(Intent intent) {
        C1679r.m3631h(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: c */
    public static Status m2321c(Intent intent) {
        C1679r.m3631h(intent);
        C1679r.m3638a(m2322b(intent));
        return (Status) C1689e.m3578b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }
}
