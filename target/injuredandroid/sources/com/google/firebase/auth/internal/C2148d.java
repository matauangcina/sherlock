package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.util.C1698f;
import p054b.p059c.p060a.p061a.p063b.p064k.C1155a;
import p054b.p059c.p060a.p061a.p068d.p071c.HandlerC1206g2;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.auth.internal.d */
/* loaded from: classes.dex */
public final class C2148d {

    /* renamed from: h */
    private static C1155a f5886h = new C1155a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    private final C1415c f5887a;

    /* renamed from: b */
    volatile long f5888b;

    /* renamed from: c */
    volatile long f5889c;

    /* renamed from: d */
    private long f5890d;

    /* renamed from: e */
    private HandlerThread f5891e;

    /* renamed from: f */
    private Handler f5892f;

    /* renamed from: g */
    private Runnable f5893g;

    public C2148d(C1415c c1415c) {
        f5886h.m4763f("Initializing TokenRefresher", new Object[0]);
        C1679r.m3631h(c1415c);
        this.f5887a = c1415c;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f5891e = handlerThread;
        handlerThread.start();
        this.f5892f = new HandlerC1206g2(this.f5891e.getLooper());
        this.f5893g = new RunnableC2169n0(this, this.f5887a.m4197m());
        this.f5890d = 300000L;
    }

    /* renamed from: a */
    public final void m2379a() {
        C1155a c1155a = f5886h;
        long j = this.f5888b - this.f5890d;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        c1155a.m4763f(sb.toString(), new Object[0]);
        m2377c();
        this.f5889c = Math.max((this.f5888b - C1698f.m3560b().mo3561a()) - this.f5890d, 0L) / 1000;
        this.f5892f.postDelayed(this.f5893g, this.f5889c * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m2378b() {
        int i = (int) this.f5889c;
        this.f5889c = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * this.f5889c : i != 960 ? 30L : 960L;
        this.f5888b = C1698f.m3560b().mo3561a() + (this.f5889c * 1000);
        C1155a c1155a = f5886h;
        long j = this.f5888b;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        c1155a.m4763f(sb.toString(), new Object[0]);
        this.f5892f.postDelayed(this.f5893g, this.f5889c * 1000);
    }

    /* renamed from: c */
    public final void m2377c() {
        this.f5892f.removeCallbacks(this.f5893g);
    }
}
