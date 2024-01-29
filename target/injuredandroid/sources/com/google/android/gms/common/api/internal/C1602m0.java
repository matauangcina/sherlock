package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1560c;
import java.util.Map;
import java.util.Set;
import p000a.p014d.C0066a;
import p054b.p059c.p060a.p061a.p063b.C1144a;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* loaded from: classes.dex */
public final class C1602m0 {

    /* renamed from: a */
    private final C0066a<C1574b<?>, C1144a> f4704a;

    /* renamed from: b */
    private final C0066a<C1574b<?>, String> f4705b;

    /* renamed from: c */
    private final C1289h<Map<C1574b<?>, String>> f4706c;

    /* renamed from: d */
    private int f4707d;

    /* renamed from: e */
    private boolean f4708e;

    /* renamed from: a */
    public final void m3806a(C1574b<?> c1574b, C1144a c1144a, String str) {
        this.f4704a.put(c1574b, c1144a);
        this.f4705b.put(c1574b, str);
        this.f4707d--;
        if (!c1144a.m4807k()) {
            this.f4708e = true;
        }
        if (this.f4707d == 0) {
            if (!this.f4708e) {
                this.f4706c.m4608c(this.f4705b);
                return;
            }
            this.f4706c.m4609b(new C1560c(this.f4704a));
        }
    }

    /* renamed from: b */
    public final Set<C1574b<?>> m3805b() {
        return this.f4704a.keySet();
    }
}
