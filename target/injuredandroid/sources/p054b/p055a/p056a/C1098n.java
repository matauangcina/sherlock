package p054b.p055a.p056a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: b.a.a.n */
/* loaded from: classes.dex */
public class C1098n {

    /* renamed from: a */
    private final AtomicInteger f3779a;

    /* renamed from: b */
    private final Set<AbstractC1094m<?>> f3780b;

    /* renamed from: c */
    private final PriorityBlockingQueue<AbstractC1094m<?>> f3781c;

    /* renamed from: d */
    private final PriorityBlockingQueue<AbstractC1094m<?>> f3782d;

    /* renamed from: e */
    private final InterfaceC1078b f3783e;

    /* renamed from: f */
    private final InterfaceC1089h f3784f;

    /* renamed from: g */
    private final InterfaceC1103p f3785g;

    /* renamed from: h */
    private final C1090i[] f3786h;

    /* renamed from: i */
    private C1080c f3787i;

    /* renamed from: j */
    private final List<InterfaceC1099a> f3788j;

    /* renamed from: b.a.a.n$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1099a<T> {
        /* renamed from: a */
        void m4939a(AbstractC1094m<T> abstractC1094m);
    }

    public C1098n(InterfaceC1078b interfaceC1078b, InterfaceC1089h interfaceC1089h) {
        this(interfaceC1078b, interfaceC1089h, 4);
    }

    public C1098n(InterfaceC1078b interfaceC1078b, InterfaceC1089h interfaceC1089h, int i) {
        this(interfaceC1078b, interfaceC1089h, i, new C1085f(new Handler(Looper.getMainLooper())));
    }

    public C1098n(InterfaceC1078b interfaceC1078b, InterfaceC1089h interfaceC1089h, int i, InterfaceC1103p interfaceC1103p) {
        this.f3779a = new AtomicInteger();
        this.f3780b = new HashSet();
        this.f3781c = new PriorityBlockingQueue<>();
        this.f3782d = new PriorityBlockingQueue<>();
        this.f3788j = new ArrayList();
        this.f3783e = interfaceC1078b;
        this.f3784f = interfaceC1089h;
        this.f3786h = new C1090i[i];
        this.f3785g = interfaceC1103p;
    }

    /* renamed from: a */
    public <T> AbstractC1094m<T> m4944a(AbstractC1094m<T> abstractC1094m) {
        abstractC1094m.m4963V(this);
        synchronized (this.f3780b) {
            this.f3780b.add(abstractC1094m);
        }
        abstractC1094m.m4961X(m4942c());
        abstractC1094m.m4957e("add-to-queue");
        (!abstractC1094m.m4960Y() ? this.f3782d : this.f3781c).add(abstractC1094m);
        return abstractC1094m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void m4943b(AbstractC1094m<T> abstractC1094m) {
        synchronized (this.f3780b) {
            this.f3780b.remove(abstractC1094m);
        }
        synchronized (this.f3788j) {
            for (InterfaceC1099a interfaceC1099a : this.f3788j) {
                interfaceC1099a.m4939a(abstractC1094m);
            }
        }
    }

    /* renamed from: c */
    public int m4942c() {
        return this.f3779a.incrementAndGet();
    }

    /* renamed from: d */
    public void m4941d() {
        m4940e();
        C1080c c1080c = new C1080c(this.f3781c, this.f3782d, this.f3783e, this.f3785g);
        this.f3787i = c1080c;
        c1080c.start();
        for (int i = 0; i < this.f3786h.length; i++) {
            C1090i c1090i = new C1090i(this.f3782d, this.f3784f, this.f3783e, this.f3785g);
            this.f3786h[i] = c1090i;
            c1090i.start();
        }
    }

    /* renamed from: e */
    public void m4940e() {
        C1090i[] c1090iArr;
        C1080c c1080c = this.f3787i;
        if (c1080c != null) {
            c1080c.m4996e();
        }
        for (C1090i c1090i : this.f3786h) {
            if (c1090i != null) {
                c1090i.m4986e();
            }
        }
    }
}
