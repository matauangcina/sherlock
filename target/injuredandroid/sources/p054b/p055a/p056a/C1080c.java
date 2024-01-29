package p054b.p055a.p056a;

import android.os.Process;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import p054b.p055a.p056a.AbstractC1094m;
import p054b.p055a.p056a.InterfaceC1078b;
/* renamed from: b.a.a.c */
/* loaded from: classes.dex */
public class C1080c extends Thread {

    /* renamed from: l */
    private static final boolean f3725l = C1108u.f3794b;

    /* renamed from: f */
    private final BlockingQueue<AbstractC1094m<?>> f3726f;

    /* renamed from: g */
    private final BlockingQueue<AbstractC1094m<?>> f3727g;

    /* renamed from: h */
    private final InterfaceC1078b f3728h;

    /* renamed from: i */
    private final InterfaceC1103p f3729i;

    /* renamed from: j */
    private volatile boolean f3730j = false;

    /* renamed from: k */
    private final C1082b f3731k = new C1082b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.a.a.c$a */
    /* loaded from: classes.dex */
    public class RunnableC1081a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC1094m f3732f;

        RunnableC1081a(AbstractC1094m abstractC1094m) {
            this.f3732f = abstractC1094m;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C1080c.this.f3727g.put(this.f3732f);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.a.c$b */
    /* loaded from: classes.dex */
    public static class C1082b implements AbstractC1094m.InterfaceC1096b {

        /* renamed from: a */
        private final Map<String, List<AbstractC1094m<?>>> f3734a = new HashMap();

        /* renamed from: b */
        private final C1080c f3735b;

        C1082b(C1080c c1080c) {
            this.f3735b = c1080c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public synchronized boolean m4994d(AbstractC1094m<?> abstractC1094m) {
            String m4948y = abstractC1094m.m4948y();
            if (!this.f3734a.containsKey(m4948y)) {
                this.f3734a.put(m4948y, null);
                abstractC1094m.m4964U(this);
                if (C1108u.f3794b) {
                    C1108u.m4927b("new request, sending to network %s", m4948y);
                }
                return false;
            }
            List<AbstractC1094m<?>> list = this.f3734a.get(m4948y);
            if (list == null) {
                list = new ArrayList<>();
            }
            abstractC1094m.m4957e("waiting-for-response");
            list.add(abstractC1094m);
            this.f3734a.put(m4948y, list);
            if (C1108u.f3794b) {
                C1108u.m4927b("Request for cacheKey=%s is in flight, putting on hold.", m4948y);
            }
            return true;
        }

        @Override // p054b.p055a.p056a.AbstractC1094m.InterfaceC1096b
        /* renamed from: a */
        public synchronized void mo4946a(AbstractC1094m<?> abstractC1094m) {
            String m4948y = abstractC1094m.m4948y();
            List<AbstractC1094m<?>> remove = this.f3734a.remove(m4948y);
            if (remove != null && !remove.isEmpty()) {
                if (C1108u.f3794b) {
                    C1108u.m4924e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), m4948y);
                }
                AbstractC1094m<?> remove2 = remove.remove(0);
                this.f3734a.put(m4948y, remove);
                remove2.m4964U(this);
                try {
                    this.f3735b.f3727g.put(remove2);
                } catch (InterruptedException e) {
                    C1108u.m4926c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f3735b.m4996e();
                }
            }
        }

        @Override // p054b.p055a.p056a.AbstractC1094m.InterfaceC1096b
        /* renamed from: b */
        public void mo4945b(AbstractC1094m<?> abstractC1094m, C1100o<?> c1100o) {
            List<AbstractC1094m<?>> remove;
            InterfaceC1078b.C1079a c1079a = c1100o.f3790b;
            if (c1079a == null || c1079a.m5002a()) {
                mo4946a(abstractC1094m);
                return;
            }
            String m4948y = abstractC1094m.m4948y();
            synchronized (this) {
                remove = this.f3734a.remove(m4948y);
            }
            if (remove != null) {
                if (C1108u.f3794b) {
                    C1108u.m4924e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m4948y);
                }
                for (AbstractC1094m<?> abstractC1094m2 : remove) {
                    this.f3735b.f3729i.mo4934b(abstractC1094m2, c1100o);
                }
            }
        }
    }

    public C1080c(BlockingQueue<AbstractC1094m<?>> blockingQueue, BlockingQueue<AbstractC1094m<?>> blockingQueue2, InterfaceC1078b interfaceC1078b, InterfaceC1103p interfaceC1103p) {
        this.f3726f = blockingQueue;
        this.f3727g = blockingQueue2;
        this.f3728h = interfaceC1078b;
        this.f3729i = interfaceC1103p;
    }

    /* renamed from: c */
    private void m4998c() {
        m4997d(this.f3726f.take());
    }

    /* renamed from: d */
    void m4997d(AbstractC1094m<?> abstractC1094m) {
        abstractC1094m.m4957e("cache-queue-take");
        if (abstractC1094m.m4970N()) {
            abstractC1094m.m4952s("cache-discard-canceled");
            return;
        }
        InterfaceC1078b.C1079a mo4908c = this.f3728h.mo4908c(abstractC1094m.m4948y());
        if (mo4908c == null) {
            abstractC1094m.m4957e("cache-miss");
            if (this.f3731k.m4994d(abstractC1094m)) {
                return;
            }
            this.f3727g.put(abstractC1094m);
        } else if (mo4908c.m5002a()) {
            abstractC1094m.m4957e("cache-hit-expired");
            abstractC1094m.m4965T(mo4908c);
            if (this.f3731k.m4994d(abstractC1094m)) {
                return;
            }
            this.f3727g.put(abstractC1094m);
        } else {
            abstractC1094m.m4957e("cache-hit");
            C1100o<?> mo4855S = abstractC1094m.mo4855S(new C1092k(mo4908c.f3717a, mo4908c.f3723g));
            abstractC1094m.m4957e("cache-hit-parsed");
            if (mo4908c.m5001b()) {
                abstractC1094m.m4957e("cache-hit-refresh-needed");
                abstractC1094m.m4965T(mo4908c);
                mo4855S.f3792d = true;
                if (!this.f3731k.m4994d(abstractC1094m)) {
                    this.f3729i.mo4933c(abstractC1094m, mo4855S, new RunnableC1081a(abstractC1094m));
                    return;
                }
            }
            this.f3729i.mo4934b(abstractC1094m, mo4855S);
        }
    }

    /* renamed from: e */
    public void m4996e() {
        this.f3730j = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f3725l) {
            C1108u.m4924e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f3728h.mo4910a();
        while (true) {
            try {
                m4998c();
            } catch (InterruptedException unused) {
                if (this.f3730j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1108u.m4926c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
