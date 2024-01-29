package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes.dex */
class C1880b {

    /* renamed from: e */
    private static C1880b f5566e;

    /* renamed from: a */
    private final Object f5567a = new Object();

    /* renamed from: b */
    private final Handler f5568b = new Handler(Looper.getMainLooper(), new C1881a());

    /* renamed from: c */
    private C1883c f5569c;

    /* renamed from: d */
    private C1883c f5570d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    /* loaded from: classes.dex */
    class C1881a implements Handler.Callback {
        C1881a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C1880b.this.m2634d((C1883c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1882b {
        /* renamed from: a */
        void mo2623a();

        /* renamed from: b */
        void mo2622b(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.b$c */
    /* loaded from: classes.dex */
    public static class C1883c {

        /* renamed from: a */
        final WeakReference<InterfaceC1882b> f5572a;

        /* renamed from: b */
        int f5573b;

        /* renamed from: c */
        boolean f5574c;

        C1883c(int i, InterfaceC1882b interfaceC1882b) {
            this.f5572a = new WeakReference<>(interfaceC1882b);
            this.f5573b = i;
        }

        /* renamed from: a */
        boolean m2621a(InterfaceC1882b interfaceC1882b) {
            return interfaceC1882b != null && this.f5572a.get() == interfaceC1882b;
        }
    }

    private C1880b() {
    }

    /* renamed from: a */
    private boolean m2637a(C1883c c1883c, int i) {
        InterfaceC1882b interfaceC1882b = c1883c.f5572a.get();
        if (interfaceC1882b != null) {
            this.f5568b.removeCallbacksAndMessages(c1883c);
            interfaceC1882b.mo2622b(i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C1880b m2635c() {
        if (f5566e == null) {
            f5566e = new C1880b();
        }
        return f5566e;
    }

    /* renamed from: f */
    private boolean m2632f(InterfaceC1882b interfaceC1882b) {
        C1883c c1883c = this.f5569c;
        return c1883c != null && c1883c.m2621a(interfaceC1882b);
    }

    /* renamed from: g */
    private boolean m2631g(InterfaceC1882b interfaceC1882b) {
        C1883c c1883c = this.f5570d;
        return c1883c != null && c1883c.m2621a(interfaceC1882b);
    }

    /* renamed from: l */
    private void m2626l(C1883c c1883c) {
        int i = c1883c.f5573b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f5568b.removeCallbacksAndMessages(c1883c);
        Handler handler = this.f5568b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c1883c), i);
    }

    /* renamed from: n */
    private void m2624n() {
        C1883c c1883c = this.f5570d;
        if (c1883c != null) {
            this.f5569c = c1883c;
            this.f5570d = null;
            InterfaceC1882b interfaceC1882b = c1883c.f5572a.get();
            if (interfaceC1882b != null) {
                interfaceC1882b.mo2623a();
            } else {
                this.f5569c = null;
            }
        }
    }

    /* renamed from: b */
    public void m2636b(InterfaceC1882b interfaceC1882b, int i) {
        C1883c c1883c;
        synchronized (this.f5567a) {
            if (m2632f(interfaceC1882b)) {
                c1883c = this.f5569c;
            } else if (m2631g(interfaceC1882b)) {
                c1883c = this.f5570d;
            }
            m2637a(c1883c, i);
        }
    }

    /* renamed from: d */
    void m2634d(C1883c c1883c) {
        synchronized (this.f5567a) {
            if (this.f5569c == c1883c || this.f5570d == c1883c) {
                m2637a(c1883c, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean m2633e(InterfaceC1882b interfaceC1882b) {
        boolean z;
        synchronized (this.f5567a) {
            z = m2632f(interfaceC1882b) || m2631g(interfaceC1882b);
        }
        return z;
    }

    /* renamed from: h */
    public void m2630h(InterfaceC1882b interfaceC1882b) {
        synchronized (this.f5567a) {
            if (m2632f(interfaceC1882b)) {
                this.f5569c = null;
                if (this.f5570d != null) {
                    m2624n();
                }
            }
        }
    }

    /* renamed from: i */
    public void m2629i(InterfaceC1882b interfaceC1882b) {
        synchronized (this.f5567a) {
            if (m2632f(interfaceC1882b)) {
                m2626l(this.f5569c);
            }
        }
    }

    /* renamed from: j */
    public void m2628j(InterfaceC1882b interfaceC1882b) {
        synchronized (this.f5567a) {
            if (m2632f(interfaceC1882b) && !this.f5569c.f5574c) {
                this.f5569c.f5574c = true;
                this.f5568b.removeCallbacksAndMessages(this.f5569c);
            }
        }
    }

    /* renamed from: k */
    public void m2627k(InterfaceC1882b interfaceC1882b) {
        synchronized (this.f5567a) {
            if (m2632f(interfaceC1882b) && this.f5569c.f5574c) {
                this.f5569c.f5574c = false;
                m2626l(this.f5569c);
            }
        }
    }

    /* renamed from: m */
    public void m2625m(int i, InterfaceC1882b interfaceC1882b) {
        synchronized (this.f5567a) {
            if (m2632f(interfaceC1882b)) {
                this.f5569c.f5573b = i;
                this.f5568b.removeCallbacksAndMessages(this.f5569c);
                m2626l(this.f5569c);
                return;
            }
            if (m2631g(interfaceC1882b)) {
                this.f5570d.f5573b = i;
            } else {
                this.f5570d = new C1883c(i, interfaceC1882b);
            }
            if (this.f5569c == null || !m2637a(this.f5569c, 4)) {
                this.f5569c = null;
                m2624n();
            }
        }
    }
}
