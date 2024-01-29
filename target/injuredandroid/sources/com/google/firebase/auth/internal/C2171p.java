package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1576c;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.auth.internal.p */
/* loaded from: classes.dex */
public final class C2171p {

    /* renamed from: a */
    private volatile int f5929a;

    /* renamed from: b */
    private final C2148d f5930b;

    /* renamed from: c */
    private volatile boolean f5931c;

    private C2171p(Context context, C2148d c2148d) {
        this.f5931c = false;
        this.f5929a = 0;
        this.f5930b = c2148d;
        ComponentCallbacks2C1576c.m3907c((Application) context.getApplicationContext());
        ComponentCallbacks2C1576c.m3908b().m3909a(new C2174s(this));
    }

    public C2171p(C1415c c1415c) {
        this(c1415c.m4200j(), new C2148d(c1415c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final boolean m2333g() {
        return this.f5929a > 0 && !this.f5931c;
    }

    /* renamed from: a */
    public final void m2339a() {
        this.f5930b.m2377c();
    }

    /* renamed from: b */
    public final void m2338b(int i) {
        if (i > 0 && this.f5929a == 0) {
            this.f5929a = i;
            if (m2333g()) {
                this.f5930b.m2379a();
            }
        } else if (i == 0 && this.f5929a != 0) {
            this.f5930b.m2377c();
        }
        this.f5929a = i;
    }

    /* renamed from: c */
    public final void m2337c(C1237q1 c1237q1) {
        if (c1237q1 == null) {
            return;
        }
        long m4671n = c1237q1.m4671n();
        if (m4671n <= 0) {
            m4671n = 3600;
        }
        C2148d c2148d = this.f5930b;
        c2148d.f5888b = c1237q1.m4670o() + (m4671n * 1000);
        c2148d.f5889c = -1L;
        if (m2333g()) {
            this.f5930b.m2379a();
        }
    }
}
