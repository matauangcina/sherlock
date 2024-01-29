package p054b.p055a.p056a;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* renamed from: b.a.a.i */
/* loaded from: classes.dex */
public class C1090i extends Thread {

    /* renamed from: f */
    private final BlockingQueue<AbstractC1094m<?>> f3747f;

    /* renamed from: g */
    private final InterfaceC1089h f3748g;

    /* renamed from: h */
    private final InterfaceC1078b f3749h;

    /* renamed from: i */
    private final InterfaceC1103p f3750i;

    /* renamed from: j */
    private volatile boolean f3751j = false;

    public C1090i(BlockingQueue<AbstractC1094m<?>> blockingQueue, InterfaceC1089h interfaceC1089h, InterfaceC1078b interfaceC1078b, InterfaceC1103p interfaceC1103p) {
        this.f3747f = blockingQueue;
        this.f3748g = interfaceC1089h;
        this.f3749h = interfaceC1078b;
        this.f3750i = interfaceC1103p;
    }

    /* renamed from: a */
    private void m4990a(AbstractC1094m<?> abstractC1094m) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(abstractC1094m.m4973K());
        }
    }

    /* renamed from: b */
    private void m4989b(AbstractC1094m<?> abstractC1094m, C1107t c1107t) {
        abstractC1094m.m4966R(c1107t);
        this.f3750i.mo4935a(abstractC1094m, c1107t);
    }

    /* renamed from: c */
    private void m4988c() {
        m4987d(this.f3747f.take());
    }

    /* renamed from: d */
    void m4987d(AbstractC1094m<?> abstractC1094m) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            abstractC1094m.m4957e("network-queue-take");
            if (abstractC1094m.m4970N()) {
                abstractC1094m.m4952s("network-discard-cancelled");
                abstractC1094m.m4968P();
                return;
            }
            m4990a(abstractC1094m);
            C1092k mo4920a = this.f3748g.mo4920a(abstractC1094m);
            abstractC1094m.m4957e("network-http-complete");
            if (mo4920a.f3755d && abstractC1094m.m4971M()) {
                abstractC1094m.m4952s("not-modified");
                abstractC1094m.m4968P();
                return;
            }
            C1100o<?> mo4855S = abstractC1094m.mo4855S(mo4920a);
            abstractC1094m.m4957e("network-parse-complete");
            if (abstractC1094m.m4960Y() && mo4855S.f3790b != null) {
                this.f3749h.mo4909b(abstractC1094m.m4948y(), mo4855S.f3790b);
                abstractC1094m.m4957e("network-cache-written");
            }
            abstractC1094m.m4969O();
            this.f3750i.mo4934b(abstractC1094m, mo4855S);
            abstractC1094m.m4967Q(mo4855S);
        } catch (C1107t e) {
            e.m4929a(SystemClock.elapsedRealtime() - elapsedRealtime);
            m4989b(abstractC1094m, e);
            abstractC1094m.m4968P();
        } catch (Exception e2) {
            C1108u.m4925d(e2, "Unhandled exception %s", e2.toString());
            C1107t c1107t = new C1107t(e2);
            c1107t.m4929a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f3750i.mo4935a(abstractC1094m, c1107t);
            abstractC1094m.m4968P();
        }
    }

    /* renamed from: e */
    public void m4986e() {
        this.f3751j = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m4988c();
            } catch (InterruptedException unused) {
                if (this.f3751j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1108u.m4926c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
