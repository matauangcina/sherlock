package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC1660i;
import com.google.android.gms.common.internal.InterfaceC1671m;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p054b.p059c.p060a.p061a.p063b.C1144a;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p063b.C1149e;
import p054b.p059c.p060a.p061a.p068d.p070b.HandlerC1178d;
/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC1634c<T extends IInterface> {

    /* renamed from: u */
    private static final C1146c[] f4742u = new C1146c[0];

    /* renamed from: a */
    private C1662i0 f4743a;

    /* renamed from: b */
    private final Context f4744b;

    /* renamed from: c */
    private final AbstractC1660i f4745c;

    /* renamed from: d */
    final Handler f4746d;

    /* renamed from: g */
    private InterfaceC1675o f4749g;

    /* renamed from: h */
    protected InterfaceC1637c f4750h;

    /* renamed from: i */
    private T f4751i;

    /* renamed from: k */
    private ServiceConnectionC1644j f4753k;

    /* renamed from: m */
    private final InterfaceC1635a f4755m;

    /* renamed from: n */
    private final InterfaceC1636b f4756n;

    /* renamed from: o */
    private final int f4757o;

    /* renamed from: p */
    private final String f4758p;

    /* renamed from: e */
    private final Object f4747e = new Object();

    /* renamed from: f */
    private final Object f4748f = new Object();

    /* renamed from: j */
    private final ArrayList<AbstractC1642h<?>> f4752j = new ArrayList<>();

    /* renamed from: l */
    private int f4754l = 1;

    /* renamed from: q */
    private C1144a f4759q = null;

    /* renamed from: r */
    private boolean f4760r = false;

    /* renamed from: s */
    private volatile C1647c0 f4761s = null;

    /* renamed from: t */
    protected AtomicInteger f4762t = new AtomicInteger(0);

    /* renamed from: com.google.android.gms.common.internal.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1635a {
        /* renamed from: d */
        void mo3572d(int i);

        /* renamed from: h */
        void mo3571h(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1636b {
        /* renamed from: g */
        void mo3570g(C1144a c1144a);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1637c {
        /* renamed from: a */
        void mo3734a(C1144a c1144a);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    /* loaded from: classes.dex */
    protected class C1638d implements InterfaceC1637c {
        public C1638d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.InterfaceC1637c
        /* renamed from: a */
        public void mo3734a(C1144a c1144a) {
            if (c1144a.m4807k()) {
                AbstractC1634c abstractC1634c = AbstractC1634c.this;
                abstractC1634c.m3745g(null, abstractC1634c.mo3684B());
            } else if (AbstractC1634c.this.f4756n != null) {
                AbstractC1634c.this.f4756n.mo3570g(c1144a);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    /* loaded from: classes.dex */
    public interface InterfaceC1639e {
        /* renamed from: a */
        void mo3733a();
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    /* loaded from: classes.dex */
    private abstract class AbstractC1640f extends AbstractC1642h<Boolean> {

        /* renamed from: d */
        private final int f4764d;

        /* renamed from: e */
        private final Bundle f4765e;

        protected AbstractC1640f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f4764d = i;
            this.f4765e = bundle;
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.AbstractC1642h
        /* renamed from: c */
        protected final /* synthetic */ void mo3728c(Boolean bool) {
            if (bool == null) {
                AbstractC1634c.this.m3764P(1, null);
                return;
            }
            int i = this.f4764d;
            if (i == 0) {
                if (mo3724g()) {
                    return;
                }
                AbstractC1634c.this.m3764P(1, null);
                mo3725f(new C1144a(8, null));
            } else if (i == 10) {
                AbstractC1634c.this.m3764P(1, null);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), AbstractC1634c.this.mo2213r(), AbstractC1634c.this.mo2217f()));
            } else {
                AbstractC1634c.this.m3764P(1, null);
                Bundle bundle = this.f4765e;
                mo3725f(new C1144a(this.f4764d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.AbstractC1642h
        /* renamed from: d */
        protected final void mo3727d() {
        }

        /* renamed from: f */
        protected abstract void mo3725f(C1144a c1144a);

        /* renamed from: g */
        protected abstract boolean mo3724g();
    }

    /* renamed from: com.google.android.gms.common.internal.c$g */
    /* loaded from: classes.dex */
    final class HandlerC1641g extends HandlerC1178d {
        public HandlerC1641g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m3732a(Message message) {
            AbstractC1642h abstractC1642h = (AbstractC1642h) message.obj;
            abstractC1642h.mo3727d();
            abstractC1642h.m3729b();
        }

        /* renamed from: b */
        private static boolean m3731b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (AbstractC1634c.this.f4762t.get() != message.arg1) {
                if (m3731b(message)) {
                    m3732a(message);
                    return;
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !AbstractC1634c.this.m3737u()) || message.what == 5)) && !AbstractC1634c.this.m3744l()) {
                m3732a(message);
                return;
            }
            int i2 = message.what;
            if (i2 == 4) {
                AbstractC1634c.this.f4759q = new C1144a(message.arg2);
                if (AbstractC1634c.this.m3746f0() && !AbstractC1634c.this.f4760r) {
                    AbstractC1634c.this.m3764P(3, null);
                    return;
                }
                C1144a c1144a = AbstractC1634c.this.f4759q != null ? AbstractC1634c.this.f4759q : new C1144a(8);
                AbstractC1634c.this.f4750h.mo3734a(c1144a);
                AbstractC1634c.this.m3773F(c1144a);
            } else if (i2 == 5) {
                C1144a c1144a2 = AbstractC1634c.this.f4759q != null ? AbstractC1634c.this.f4759q : new C1144a(8);
                AbstractC1634c.this.f4750h.mo3734a(c1144a2);
                AbstractC1634c.this.m3773F(c1144a2);
            } else if (i2 == 3) {
                Object obj = message.obj;
                C1144a c1144a3 = new C1144a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                AbstractC1634c.this.f4750h.mo3734a(c1144a3);
                AbstractC1634c.this.m3773F(c1144a3);
            } else if (i2 == 6) {
                AbstractC1634c.this.m3764P(5, null);
                if (AbstractC1634c.this.f4755m != null) {
                    AbstractC1634c.this.f4755m.mo3572d(message.arg2);
                }
                AbstractC1634c.this.m3772G(message.arg2);
                AbstractC1634c.this.m3759U(5, 1, null);
            } else if (i2 == 2 && !AbstractC1634c.this.m3749d()) {
                m3732a(message);
            } else if (m3731b(message)) {
                ((AbstractC1642h) message.obj).m3726e();
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("GmsClient", sb.toString(), new Exception());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$h */
    /* loaded from: classes.dex */
    public abstract class AbstractC1642h<TListener> {

        /* renamed from: a */
        private TListener f4768a;

        /* renamed from: b */
        private boolean f4769b = false;

        public AbstractC1642h(TListener tlistener) {
            this.f4768a = tlistener;
        }

        /* renamed from: a */
        public final void m3730a() {
            synchronized (this) {
                this.f4768a = null;
            }
        }

        /* renamed from: b */
        public final void m3729b() {
            m3730a();
            synchronized (AbstractC1634c.this.f4752j) {
                AbstractC1634c.this.f4752j.remove(this);
            }
        }

        /* renamed from: c */
        protected abstract void mo3728c(TListener tlistener);

        /* renamed from: d */
        protected abstract void mo3727d();

        /* renamed from: e */
        public final void m3726e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f4768a;
                if (this.f4769b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo3728c(tlistener);
                } catch (RuntimeException e) {
                    mo3727d();
                    throw e;
                }
            } else {
                mo3727d();
            }
            synchronized (this) {
                this.f4769b = true;
            }
            m3729b();
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    /* loaded from: classes.dex */
    public static final class BinderC1643i extends InterfaceC1671m.AbstractBinderC1672a {

        /* renamed from: a */
        private AbstractC1634c f4771a;

        /* renamed from: b */
        private final int f4772b;

        public BinderC1643i(AbstractC1634c abstractC1634c, int i) {
            this.f4771a = abstractC1634c;
            this.f4772b = i;
        }

        @Override // com.google.android.gms.common.internal.InterfaceC1671m
        /* renamed from: N */
        public final void mo3649N(int i, IBinder iBinder, C1647c0 c1647c0) {
            C1679r.m3630i(this.f4771a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C1679r.m3631h(c1647c0);
            this.f4771a.m3760T(c1647c0);
            mo3647X(i, iBinder, c1647c0.f4778f);
        }

        @Override // com.google.android.gms.common.internal.InterfaceC1671m
        /* renamed from: Q */
        public final void mo3648Q(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.InterfaceC1671m
        /* renamed from: X */
        public final void mo3647X(int i, IBinder iBinder, Bundle bundle) {
            C1679r.m3630i(this.f4771a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f4771a.m3771H(i, iBinder, bundle, this.f4772b);
            this.f4771a = null;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    /* loaded from: classes.dex */
    public final class ServiceConnectionC1644j implements ServiceConnection {

        /* renamed from: a */
        private final int f4773a;

        public ServiceConnectionC1644j(int i) {
            this.f4773a = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC1675o c1674n;
            AbstractC1634c abstractC1634c = AbstractC1634c.this;
            if (iBinder == null) {
                abstractC1634c.m3757W(16);
                return;
            }
            synchronized (abstractC1634c.f4748f) {
                AbstractC1634c abstractC1634c2 = AbstractC1634c.this;
                if (iBinder == null) {
                    c1674n = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    c1674n = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC1675o)) ? new C1674n(iBinder) : (InterfaceC1675o) queryLocalInterface;
                }
                abstractC1634c2.f4749g = c1674n;
            }
            AbstractC1634c.this.m3765O(0, null, this.f4773a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (AbstractC1634c.this.f4748f) {
                AbstractC1634c.this.f4749g = null;
            }
            Handler handler = AbstractC1634c.this.f4746d;
            handler.sendMessage(handler.obtainMessage(6, this.f4773a, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$k */
    /* loaded from: classes.dex */
    public final class C1645k extends AbstractC1640f {

        /* renamed from: g */
        private final IBinder f4775g;

        public C1645k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f4775g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.AbstractC1640f
        /* renamed from: f */
        protected final void mo3725f(C1144a c1144a) {
            if (AbstractC1634c.this.f4756n != null) {
                AbstractC1634c.this.f4756n.mo3570g(c1144a);
            }
            AbstractC1634c.this.m3773F(c1144a);
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.AbstractC1640f
        /* renamed from: g */
        protected final boolean mo3724g() {
            try {
                String interfaceDescriptor = this.f4775g.getInterfaceDescriptor();
                if (!AbstractC1634c.this.mo2217f().equals(interfaceDescriptor)) {
                    String mo2217f = AbstractC1634c.this.mo2217f();
                    StringBuilder sb = new StringBuilder(String.valueOf(mo2217f).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(mo2217f);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface mo2216h = AbstractC1634c.this.mo2216h(this.f4775g);
                if (mo2216h == null || !(AbstractC1634c.this.m3759U(2, 4, mo2216h) || AbstractC1634c.this.m3759U(3, 4, mo2216h))) {
                    return false;
                }
                AbstractC1634c.this.f4759q = null;
                Bundle m3736x = AbstractC1634c.this.m3736x();
                if (AbstractC1634c.this.f4755m != null) {
                    AbstractC1634c.this.f4755m.mo3571h(m3736x);
                    return true;
                }
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$l */
    /* loaded from: classes.dex */
    public final class C1646l extends AbstractC1640f {
        public C1646l(int i, Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.AbstractC1640f
        /* renamed from: f */
        protected final void mo3725f(C1144a c1144a) {
            if (AbstractC1634c.this.m3737u() && AbstractC1634c.this.m3746f0()) {
                AbstractC1634c.this.m3757W(16);
                return;
            }
            AbstractC1634c.this.f4750h.mo3734a(c1144a);
            AbstractC1634c.this.m3773F(c1144a);
        }

        @Override // com.google.android.gms.common.internal.AbstractC1634c.AbstractC1640f
        /* renamed from: g */
        protected final boolean mo3724g() {
            AbstractC1634c.this.f4750h.mo3734a(C1144a.f3850j);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1634c(Context context, Looper looper, AbstractC1660i abstractC1660i, C1149e c1149e, int i, InterfaceC1635a interfaceC1635a, InterfaceC1636b interfaceC1636b, String str) {
        C1679r.m3630i(context, "Context must not be null");
        this.f4744b = context;
        C1679r.m3630i(looper, "Looper must not be null");
        C1679r.m3630i(abstractC1660i, "Supervisor must not be null");
        this.f4745c = abstractC1660i;
        C1679r.m3630i(c1149e, "API availability must not be null");
        this.f4746d = new HandlerC1641g(looper);
        this.f4757o = i;
        this.f4755m = interfaceC1635a;
        this.f4756n = interfaceC1636b;
        this.f4758p = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m3764P(int i, T t) {
        C1679r.m3638a((i == 4) == (t != null));
        synchronized (this.f4747e) {
            this.f4754l = i;
            this.f4751i = t;
            mo3620I(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (this.f4753k != null && this.f4743a != null) {
                        String m3664c = this.f4743a.m3664c();
                        String m3666a = this.f4743a.m3666a();
                        StringBuilder sb = new StringBuilder(String.valueOf(m3664c).length() + 70 + String.valueOf(m3666a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(m3664c);
                        sb.append(" on ");
                        sb.append(m3666a);
                        Log.e("GmsClient", sb.toString());
                        this.f4745c.m3673b(this.f4743a.m3664c(), this.f4743a.m3666a(), this.f4743a.m3665b(), this.f4753k, m3748d0());
                        this.f4762t.incrementAndGet();
                    }
                    this.f4753k = new ServiceConnectionC1644j(this.f4762t.get());
                    C1662i0 c1662i0 = (this.f4754l != 3 || m3776A() == null) ? new C1662i0(mo2219D(), mo2213r(), false, 129) : new C1662i0(m3735y().getPackageName(), m3776A(), true, 129);
                    this.f4743a = c1662i0;
                    if (!this.f4745c.mo3672c(new AbstractC1660i.C1661a(c1662i0.m3664c(), this.f4743a.m3666a(), this.f4743a.m3665b()), this.f4753k, m3748d0())) {
                        String m3664c2 = this.f4743a.m3664c();
                        String m3666a2 = this.f4743a.m3666a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(m3664c2).length() + 34 + String.valueOf(m3666a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(m3664c2);
                        sb2.append(" on ");
                        sb2.append(m3666a2);
                        Log.e("GmsClient", sb2.toString());
                        m3765O(16, null, this.f4762t.get());
                    }
                } else if (i == 4) {
                    m3774E(t);
                }
            } else if (this.f4753k != null) {
                this.f4745c.m3673b(this.f4743a.m3664c(), this.f4743a.m3666a(), this.f4743a.m3665b(), this.f4753k, m3748d0());
                this.f4753k = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final void m3760T(C1647c0 c1647c0) {
        this.f4761s = c1647c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final boolean m3759U(int i, int i2, T t) {
        synchronized (this.f4747e) {
            if (this.f4754l != i) {
                return false;
            }
            m3764P(i2, t);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m3757W(int i) {
        int i2;
        if (m3747e0()) {
            i2 = 5;
            this.f4760r = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f4746d;
        handler.sendMessage(handler.obtainMessage(i2, this.f4762t.get(), 16));
    }

    /* renamed from: d0 */
    private final String m3748d0() {
        String str = this.f4758p;
        return str == null ? this.f4744b.getClass().getName() : str;
    }

    /* renamed from: e0 */
    private final boolean m3747e0() {
        boolean z;
        synchronized (this.f4747e) {
            z = this.f4754l == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final boolean m3746f0() {
        if (this.f4760r || TextUtils.isEmpty(mo2217f()) || TextUtils.isEmpty(m3776A())) {
            return false;
        }
        try {
            Class.forName(mo2217f());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: A */
    protected String m3776A() {
        return null;
    }

    /* renamed from: B */
    protected abstract Set<Scope> mo3684B();

    /* renamed from: C */
    public final T m3775C() {
        T t;
        synchronized (this.f4747e) {
            if (this.f4754l == 5) {
                throw new DeadObjectException();
            }
            m3738t();
            C1679r.m3628k(this.f4751i != null, "Client is connected but service is null");
            t = this.f4751i;
        }
        return t;
    }

    /* renamed from: D */
    protected String mo2219D() {
        return "com.google.android.gms";
    }

    /* renamed from: E */
    protected void m3774E(T t) {
        System.currentTimeMillis();
    }

    /* renamed from: F */
    protected void m3773F(C1144a c1144a) {
        c1144a.m4811b();
        System.currentTimeMillis();
    }

    /* renamed from: G */
    protected void m3772G(int i) {
        System.currentTimeMillis();
    }

    /* renamed from: H */
    protected void m3771H(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f4746d;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C1645k(i, iBinder, bundle)));
    }

    /* renamed from: I */
    void mo3620I(int i, T t) {
    }

    /* renamed from: J */
    public boolean m3770J() {
        return false;
    }

    /* renamed from: K */
    public void m3769K(int i) {
        Handler handler = this.f4746d;
        handler.sendMessage(handler.obtainMessage(6, this.f4762t.get(), i));
    }

    /* renamed from: O */
    protected final void m3765O(int i, Bundle bundle, int i2) {
        Handler handler = this.f4746d;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C1646l(i, null)));
    }

    /* renamed from: b */
    public void m3752b(InterfaceC1639e interfaceC1639e) {
        interfaceC1639e.mo3733a();
    }

    /* renamed from: d */
    public boolean m3749d() {
        boolean z;
        synchronized (this.f4747e) {
            z = this.f4754l == 4;
        }
        return z;
    }

    /* renamed from: f */
    protected abstract String mo2217f();

    /* renamed from: g */
    public void m3745g(InterfaceC1667l interfaceC1667l, Set<Scope> set) {
        Bundle mo2211z = mo2211z();
        C1656g c1656g = new C1656g(this.f4757o);
        c1656g.f4808i = this.f4744b.getPackageName();
        c1656g.f4811l = mo2211z;
        if (set != null) {
            c1656g.f4810k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo3739q()) {
            c1656g.f4812m = mo3678v() != null ? mo3678v() : new Account("<<default account>>", "com.google");
            if (interfaceC1667l != null) {
                c1656g.f4809j = interfaceC1667l.asBinder();
            }
        } else if (m3770J()) {
            c1656g.f4812m = mo3678v();
        }
        c1656g.f4813n = f4742u;
        c1656g.f4814o = mo2212w();
        try {
            synchronized (this.f4748f) {
                if (this.f4749g != null) {
                    this.f4749g.mo3645C(new BinderC1643i(this, this.f4762t.get()), c1656g);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m3769K(1);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m3771H(8, null, null, this.f4762t.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m3771H(8, null, null, this.f4762t.get());
        }
    }

    /* renamed from: h */
    protected abstract T mo2216h(IBinder iBinder);

    /* renamed from: j */
    public boolean mo2215j() {
        return true;
    }

    /* renamed from: k */
    public int mo2214k() {
        return C1149e.f3865a;
    }

    /* renamed from: l */
    public boolean m3744l() {
        boolean z;
        synchronized (this.f4747e) {
            z = this.f4754l == 2 || this.f4754l == 3;
        }
        return z;
    }

    /* renamed from: m */
    public final C1146c[] m3743m() {
        C1647c0 c1647c0 = this.f4761s;
        if (c1647c0 == null) {
            return null;
        }
        return c1647c0.f4779g;
    }

    /* renamed from: n */
    public String m3742n() {
        C1662i0 c1662i0;
        if (!m3749d() || (c1662i0 = this.f4743a) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c1662i0.m3666a();
    }

    /* renamed from: o */
    public void m3741o(InterfaceC1637c interfaceC1637c) {
        C1679r.m3630i(interfaceC1637c, "Connection progress callbacks cannot be null.");
        this.f4750h = interfaceC1637c;
        m3764P(2, null);
    }

    /* renamed from: p */
    public void m3740p() {
        this.f4762t.incrementAndGet();
        synchronized (this.f4752j) {
            int size = this.f4752j.size();
            for (int i = 0; i < size; i++) {
                this.f4752j.get(i).m3730a();
            }
            this.f4752j.clear();
        }
        synchronized (this.f4748f) {
            this.f4749g = null;
        }
        m3764P(1, null);
    }

    /* renamed from: q */
    public boolean mo3739q() {
        return false;
    }

    /* renamed from: r */
    protected abstract String mo2213r();

    /* renamed from: t */
    protected final void m3738t() {
        if (!m3749d()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: u */
    protected boolean m3737u() {
        return false;
    }

    /* renamed from: v */
    public abstract Account mo3678v();

    /* renamed from: w */
    public C1146c[] mo2212w() {
        return f4742u;
    }

    /* renamed from: x */
    public Bundle m3736x() {
        return null;
    }

    /* renamed from: y */
    public final Context m3735y() {
        return this.f4744b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public Bundle mo2211z() {
        return new Bundle();
    }
}
