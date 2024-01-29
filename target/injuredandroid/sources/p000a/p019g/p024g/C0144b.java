package p000a.p019g.p024g;

import android.os.Build;
import android.os.CancellationSignal;
/* renamed from: a.g.g.b */
/* loaded from: classes.dex */
public final class C0144b {

    /* renamed from: a */
    private boolean f551a;

    /* renamed from: b */
    private InterfaceC0145a f552b;

    /* renamed from: c */
    private Object f553c;

    /* renamed from: d */
    private boolean f554d;

    /* renamed from: a.g.g.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0145a {
        /* renamed from: a */
        void mo6479a();
    }

    /* renamed from: d */
    private void m8966d() {
        while (this.f554d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m8969a() {
        synchronized (this) {
            if (this.f551a) {
                return;
            }
            this.f551a = true;
            this.f554d = true;
            InterfaceC0145a interfaceC0145a = this.f552b;
            Object obj = this.f553c;
            if (interfaceC0145a != null) {
                try {
                    interfaceC0145a.mo6479a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f554d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f554d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m8968b() {
        boolean z;
        synchronized (this) {
            z = this.f551a;
        }
        return z;
    }

    /* renamed from: c */
    public void m8967c(InterfaceC0145a interfaceC0145a) {
        synchronized (this) {
            m8966d();
            if (this.f552b == interfaceC0145a) {
                return;
            }
            this.f552b = interfaceC0145a;
            if (this.f551a && interfaceC0145a != null) {
                interfaceC0145a.mo6479a();
            }
        }
    }
}
