package com.google.firebase.database.p122o.p123m;

import com.google.firebase.database.p130q.C2566c;
import com.google.firebase.database.p130q.InterfaceC2567d;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.firebase.database.o.m.a */
/* loaded from: classes.dex */
public class C2403a {

    /* renamed from: a */
    private final ScheduledExecutorService f6313a;

    /* renamed from: b */
    private final C2566c f6314b;

    /* renamed from: c */
    private final long f6315c;

    /* renamed from: d */
    private final long f6316d;

    /* renamed from: e */
    private final double f6317e;

    /* renamed from: f */
    private final double f6318f;

    /* renamed from: g */
    private final Random f6319g;

    /* renamed from: h */
    private ScheduledFuture<?> f6320h;

    /* renamed from: i */
    private long f6321i;

    /* renamed from: j */
    private boolean f6322j;

    /* renamed from: com.google.firebase.database.o.m.a$a */
    /* loaded from: classes.dex */
    class RunnableC2404a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f6323f;

        RunnableC2404a(Runnable runnable) {
            this.f6323f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2403a.this.f6320h = null;
            this.f6323f.run();
        }
    }

    /* renamed from: com.google.firebase.database.o.m.a$b */
    /* loaded from: classes.dex */
    public static class C2405b {

        /* renamed from: a */
        private final ScheduledExecutorService f6325a;

        /* renamed from: b */
        private long f6326b = 1000;

        /* renamed from: c */
        private double f6327c = 0.5d;

        /* renamed from: d */
        private long f6328d = 30000;

        /* renamed from: e */
        private double f6329e = 1.3d;

        /* renamed from: f */
        private final C2566c f6330f;

        public C2405b(ScheduledExecutorService scheduledExecutorService, InterfaceC2567d interfaceC2567d, String str) {
            this.f6325a = scheduledExecutorService;
            this.f6330f = new C2566c(interfaceC2567d, str);
        }

        /* renamed from: a */
        public C2403a m1768a() {
            return new C2403a(this.f6325a, this.f6330f, this.f6326b, this.f6328d, this.f6329e, this.f6327c, null);
        }

        /* renamed from: b */
        public C2405b m1767b(double d) {
            if (d >= 0.0d && d <= 1.0d) {
                this.f6327c = d;
                return this;
            }
            throw new IllegalArgumentException("Argument out of range: " + d);
        }

        /* renamed from: c */
        public C2405b m1766c(long j) {
            this.f6328d = j;
            return this;
        }

        /* renamed from: d */
        public C2405b m1765d(long j) {
            this.f6326b = j;
            return this;
        }

        /* renamed from: e */
        public C2405b m1764e(double d) {
            this.f6329e = d;
            return this;
        }
    }

    private C2403a(ScheduledExecutorService scheduledExecutorService, C2566c c2566c, long j, long j2, double d, double d2) {
        this.f6319g = new Random();
        this.f6322j = true;
        this.f6313a = scheduledExecutorService;
        this.f6314b = c2566c;
        this.f6315c = j;
        this.f6316d = j2;
        this.f6318f = d;
        this.f6317e = d2;
    }

    /* synthetic */ C2403a(ScheduledExecutorService scheduledExecutorService, C2566c c2566c, long j, long j2, double d, double d2, RunnableC2404a runnableC2404a) {
        this(scheduledExecutorService, c2566c, j, j2, d, d2);
    }

    /* renamed from: b */
    public void m1772b() {
        if (this.f6320h != null) {
            this.f6314b.m1178b("Cancelling existing retry attempt", new Object[0]);
            this.f6320h.cancel(false);
            this.f6320h = null;
        } else {
            this.f6314b.m1178b("No existing retry attempt to cancel", new Object[0]);
        }
        this.f6321i = 0L;
    }

    /* renamed from: c */
    public void m1771c(Runnable runnable) {
        RunnableC2404a runnableC2404a = new RunnableC2404a(runnable);
        if (this.f6320h != null) {
            this.f6314b.m1178b("Cancelling previous scheduled retry", new Object[0]);
            this.f6320h.cancel(false);
            this.f6320h = null;
        }
        long j = 0;
        if (!this.f6322j) {
            long j2 = this.f6321i;
            this.f6321i = j2 == 0 ? this.f6315c : Math.min((long) (j2 * this.f6318f), this.f6316d);
            double d = this.f6317e;
            long j3 = this.f6321i;
            j = (long) (((1.0d - d) * j3) + (d * j3 * this.f6319g.nextDouble()));
        }
        this.f6322j = false;
        this.f6314b.m1178b("Scheduling retry in %dms", Long.valueOf(j));
        this.f6320h = this.f6313a.schedule(runnableC2404a, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    public void m1770d() {
        this.f6321i = this.f6316d;
    }

    /* renamed from: e */
    public void m1769e() {
        this.f6322j = true;
        this.f6321i = 0L;
    }
}
