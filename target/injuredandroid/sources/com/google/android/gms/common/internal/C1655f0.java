package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1660i;
import java.util.HashMap;
import p054b.p059c.p060a.p061a.p063b.p065l.C1156a;
import p054b.p059c.p060a.p061a.p068d.p070b.HandlerC1178d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.f0 */
/* loaded from: classes.dex */
public final class C1655f0 extends AbstractC1660i implements Handler.Callback {

    /* renamed from: d */
    private final Context f4800d;

    /* renamed from: e */
    private final Handler f4801e;

    /* renamed from: c */
    private final HashMap<AbstractC1660i.C1661a, ServiceConnectionC1657g0> f4799c = new HashMap<>();

    /* renamed from: f */
    private final C1156a f4802f = C1156a.m4760a();

    /* renamed from: g */
    private final long f4803g = 5000;

    /* renamed from: h */
    private final long f4804h = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1655f0(Context context) {
        this.f4800d = context.getApplicationContext();
        this.f4801e = new HandlerC1178d(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1660i
    /* renamed from: c */
    protected final boolean mo3672c(AbstractC1660i.C1661a c1661a, ServiceConnection serviceConnection, String str) {
        boolean m3691d;
        C1679r.m3630i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4799c) {
            ServiceConnectionC1657g0 serviceConnectionC1657g0 = this.f4799c.get(c1661a);
            if (serviceConnectionC1657g0 == null) {
                serviceConnectionC1657g0 = new ServiceConnectionC1657g0(this, c1661a);
                serviceConnectionC1657g0.m3690e(serviceConnection, str);
                serviceConnectionC1657g0.m3687h(str);
                this.f4799c.put(c1661a, serviceConnectionC1657g0);
            } else {
                this.f4801e.removeMessages(0, c1661a);
                if (serviceConnectionC1657g0.m3689f(serviceConnection)) {
                    String valueOf = String.valueOf(c1661a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                serviceConnectionC1657g0.m3690e(serviceConnection, str);
                int m3692c = serviceConnectionC1657g0.m3692c();
                if (m3692c == 1) {
                    serviceConnection.onServiceConnected(serviceConnectionC1657g0.m3693b(), serviceConnectionC1657g0.m3694a());
                } else if (m3692c == 2) {
                    serviceConnectionC1657g0.m3687h(str);
                }
            }
            m3691d = serviceConnectionC1657g0.m3691d();
        }
        return m3691d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1660i
    /* renamed from: d */
    protected final void mo3671d(AbstractC1660i.C1661a c1661a, ServiceConnection serviceConnection, String str) {
        C1679r.m3630i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4799c) {
            ServiceConnectionC1657g0 serviceConnectionC1657g0 = this.f4799c.get(c1661a);
            if (serviceConnectionC1657g0 == null) {
                String valueOf = String.valueOf(c1661a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (!serviceConnectionC1657g0.m3689f(serviceConnection)) {
                String valueOf2 = String.valueOf(c1661a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            } else {
                serviceConnectionC1657g0.m3688g(serviceConnection, str);
                if (serviceConnectionC1657g0.m3685j()) {
                    this.f4801e.sendMessageDelayed(this.f4801e.obtainMessage(0, c1661a), this.f4803g);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f4799c) {
                AbstractC1660i.C1661a c1661a = (AbstractC1660i.C1661a) message.obj;
                ServiceConnectionC1657g0 serviceConnectionC1657g0 = this.f4799c.get(c1661a);
                if (serviceConnectionC1657g0 != null && serviceConnectionC1657g0.m3685j()) {
                    if (serviceConnectionC1657g0.m3691d()) {
                        serviceConnectionC1657g0.m3686i("GmsClientSupervisor");
                    }
                    this.f4799c.remove(c1661a);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f4799c) {
                AbstractC1660i.C1661a c1661a2 = (AbstractC1660i.C1661a) message.obj;
                ServiceConnectionC1657g0 serviceConnectionC1657g02 = this.f4799c.get(c1661a2);
                if (serviceConnectionC1657g02 != null && serviceConnectionC1657g02.m3692c() == 3) {
                    String valueOf = String.valueOf(c1661a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName m3693b = serviceConnectionC1657g02.m3693b();
                    if (m3693b == null) {
                        m3693b = c1661a2.m3670a();
                    }
                    if (m3693b == null) {
                        m3693b = new ComponentName(c1661a2.m3669b(), "unknown");
                    }
                    serviceConnectionC1657g02.onServiceDisconnected(m3693b);
                }
            }
            return true;
        }
    }
}
