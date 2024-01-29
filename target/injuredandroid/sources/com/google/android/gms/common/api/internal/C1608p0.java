package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1559b;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* loaded from: classes.dex */
public final class C1608p0 {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f4711a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C1289h<?>, Boolean> f4712b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final void m3800b(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f4711a) {
            hashMap = new HashMap(this.f4711a);
        }
        synchronized (this.f4712b) {
            hashMap2 = new HashMap(this.f4712b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m3925j(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1289h) entry2.getKey()).m4607d(new C1559b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final <TResult> void m3801a(C1289h<TResult> c1289h, boolean z) {
        this.f4712b.put(c1289h, Boolean.valueOf(z));
        c1289h.m4610a().mo4587c(new C1605o(this, c1289h));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m3799c() {
        return (this.f4711a.isEmpty() && this.f4712b.isEmpty()) ? false : true;
    }

    /* renamed from: d */
    public final void m3798d() {
        m3800b(false, C1581e.f4649n);
    }

    /* renamed from: e */
    public final void m3797e() {
        m3800b(true, C1591h0.f4693a);
    }
}
