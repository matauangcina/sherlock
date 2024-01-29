package p054b.p059c.p060a.p061a.p074f;

import android.app.Activity;
import com.google.android.gms.common.api.internal.InterfaceC1588g;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C1679r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.c.a.a.f.x */
/* loaded from: classes.dex */
public final class C1306x<TResult> extends AbstractC1288g<TResult> {

    /* renamed from: a */
    private final Object f4089a = new Object();

    /* renamed from: b */
    private final C1304v<TResult> f4090b = new C1304v<>();

    /* renamed from: c */
    private boolean f4091c;

    /* renamed from: d */
    private volatile boolean f4092d;

    /* renamed from: e */
    private TResult f4093e;

    /* renamed from: f */
    private Exception f4094f;

    /* renamed from: b.c.a.a.f.x$a */
    /* loaded from: classes.dex */
    private static class C1307a extends LifecycleCallback {

        /* renamed from: g */
        private final List<WeakReference<InterfaceC1303u<?>>> f4095g;

        private C1307a(InterfaceC1588g interfaceC1588g) {
            super(interfaceC1588g);
            this.f4095g = new ArrayList();
            this.f4630f.mo3787b("TaskOnStopCallback", this);
        }

        /* renamed from: k */
        public static C1307a m4566k(Activity activity) {
            InterfaceC1588g m3922b = LifecycleCallback.m3922b(activity);
            C1307a c1307a = (C1307a) m3922b.mo3786c("TaskOnStopCallback", C1307a.class);
            return c1307a == null ? new C1307a(m3922b) : c1307a;
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        /* renamed from: j */
        public void mo3914j() {
            synchronized (this.f4095g) {
                for (WeakReference<InterfaceC1303u<?>> weakReference : this.f4095g) {
                    InterfaceC1303u<?> interfaceC1303u = weakReference.get();
                    if (interfaceC1303u != null) {
                        interfaceC1303u.cancel();
                    }
                }
                this.f4095g.clear();
            }
        }

        /* renamed from: l */
        public final <T> void m4565l(InterfaceC1303u<T> interfaceC1303u) {
            synchronized (this.f4095g) {
                this.f4095g.add(new WeakReference<>(interfaceC1303u));
            }
        }
    }

    /* renamed from: t */
    private final void m4570t() {
        C1679r.m3628k(this.f4091c, "Task is not yet complete");
    }

    /* renamed from: u */
    private final void m4569u() {
        C1679r.m3628k(!this.f4091c, "Task is already complete");
    }

    /* renamed from: v */
    private final void m4568v() {
        if (this.f4092d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: w */
    private final void m4567w() {
        synchronized (this.f4089a) {
            if (this.f4091c) {
                this.f4090b.m4591a(this);
            }
        }
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: a */
    public final AbstractC1288g<TResult> mo4589a(Executor executor, InterfaceC1283b interfaceC1283b) {
        this.f4090b.m4590b(new C1295m(executor, interfaceC1283b));
        m4567w();
        return this;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: b */
    public final AbstractC1288g<TResult> mo4588b(Activity activity, InterfaceC1284c<TResult> interfaceC1284c) {
        C1297o c1297o = new C1297o(C1290i.f4059a, interfaceC1284c);
        this.f4090b.m4590b(c1297o);
        C1307a.m4566k(activity).m4565l(c1297o);
        m4567w();
        return this;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: c */
    public final AbstractC1288g<TResult> mo4587c(InterfaceC1284c<TResult> interfaceC1284c) {
        m4577m(C1290i.f4059a, interfaceC1284c);
        return this;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: d */
    public final AbstractC1288g<TResult> mo4586d(InterfaceC1285d interfaceC1285d) {
        mo4585e(C1290i.f4059a, interfaceC1285d);
        return this;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: e */
    public final AbstractC1288g<TResult> mo4585e(Executor executor, InterfaceC1285d interfaceC1285d) {
        this.f4090b.m4590b(new C1299q(executor, interfaceC1285d));
        m4567w();
        return this;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: f */
    public final AbstractC1288g<TResult> mo4584f(InterfaceC1286e<? super TResult> interfaceC1286e) {
        mo4583g(C1290i.f4059a, interfaceC1286e);
        return this;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: g */
    public final AbstractC1288g<TResult> mo4583g(Executor executor, InterfaceC1286e<? super TResult> interfaceC1286e) {
        this.f4090b.m4590b(new C1301s(executor, interfaceC1286e));
        m4567w();
        return this;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: h */
    public final <TContinuationResult> AbstractC1288g<TContinuationResult> mo4582h(InterfaceC1282a<TResult, AbstractC1288g<TContinuationResult>> interfaceC1282a) {
        return m4576n(C1290i.f4059a, interfaceC1282a);
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: i */
    public final Exception mo4581i() {
        Exception exc;
        synchronized (this.f4089a) {
            exc = this.f4094f;
        }
        return exc;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: j */
    public final TResult mo4580j() {
        TResult tresult;
        synchronized (this.f4089a) {
            m4570t();
            m4568v();
            if (this.f4094f != null) {
                throw new C1287f(this.f4094f);
            }
            tresult = this.f4093e;
        }
        return tresult;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: k */
    public final boolean mo4579k() {
        return this.f4092d;
    }

    @Override // p054b.p059c.p060a.p061a.p074f.AbstractC1288g
    /* renamed from: l */
    public final boolean mo4578l() {
        boolean z;
        synchronized (this.f4089a) {
            z = this.f4091c && !this.f4092d && this.f4094f == null;
        }
        return z;
    }

    /* renamed from: m */
    public final AbstractC1288g<TResult> m4577m(Executor executor, InterfaceC1284c<TResult> interfaceC1284c) {
        this.f4090b.m4590b(new C1297o(executor, interfaceC1284c));
        m4567w();
        return this;
    }

    /* renamed from: n */
    public final <TContinuationResult> AbstractC1288g<TContinuationResult> m4576n(Executor executor, InterfaceC1282a<TResult, AbstractC1288g<TContinuationResult>> interfaceC1282a) {
        C1306x c1306x = new C1306x();
        this.f4090b.m4590b(new C1293k(executor, interfaceC1282a, c1306x));
        m4567w();
        return c1306x;
    }

    /* renamed from: o */
    public final void m4575o(Exception exc) {
        C1679r.m3630i(exc, "Exception must not be null");
        synchronized (this.f4089a) {
            m4569u();
            this.f4091c = true;
            this.f4094f = exc;
        }
        this.f4090b.m4591a(this);
    }

    /* renamed from: p */
    public final void m4574p(TResult tresult) {
        synchronized (this.f4089a) {
            m4569u();
            this.f4091c = true;
            this.f4093e = tresult;
        }
        this.f4090b.m4591a(this);
    }

    /* renamed from: q */
    public final boolean m4573q(Exception exc) {
        C1679r.m3630i(exc, "Exception must not be null");
        synchronized (this.f4089a) {
            if (this.f4091c) {
                return false;
            }
            this.f4091c = true;
            this.f4094f = exc;
            this.f4090b.m4591a(this);
            return true;
        }
    }

    /* renamed from: r */
    public final boolean m4572r(TResult tresult) {
        synchronized (this.f4089a) {
            if (this.f4091c) {
                return false;
            }
            this.f4091c = true;
            this.f4093e = tresult;
            this.f4090b.m4591a(this);
            return true;
        }
    }

    /* renamed from: s */
    public final boolean m4571s() {
        synchronized (this.f4089a) {
            if (this.f4091c) {
                return false;
            }
            this.f4091c = true;
            this.f4092d = true;
            this.f4090b.m4591a(this);
            return true;
        }
    }
}
