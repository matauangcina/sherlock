package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.internal.AbstractC1660i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p054b.p059c.p060a.p061a.p063b.p065l.C1156a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.g0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC1657g0 implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f4816a = new HashSet();

    /* renamed from: b */
    private int f4817b = 2;

    /* renamed from: c */
    private boolean f4818c;

    /* renamed from: d */
    private IBinder f4819d;

    /* renamed from: e */
    private final AbstractC1660i.C1661a f4820e;

    /* renamed from: f */
    private ComponentName f4821f;

    /* renamed from: g */
    private final /* synthetic */ C1655f0 f4822g;

    public ServiceConnectionC1657g0(C1655f0 c1655f0, AbstractC1660i.C1661a c1661a) {
        this.f4822g = c1655f0;
        this.f4820e = c1661a;
    }

    /* renamed from: a */
    public final IBinder m3694a() {
        return this.f4819d;
    }

    /* renamed from: b */
    public final ComponentName m3693b() {
        return this.f4821f;
    }

    /* renamed from: c */
    public final int m3692c() {
        return this.f4817b;
    }

    /* renamed from: d */
    public final boolean m3691d() {
        return this.f4818c;
    }

    /* renamed from: e */
    public final void m3690e(ServiceConnection serviceConnection, String str) {
        Context context;
        C1156a unused;
        Context unused2;
        unused = this.f4822g.f4802f;
        unused2 = this.f4822g.f4800d;
        AbstractC1660i.C1661a c1661a = this.f4820e;
        context = this.f4822g.f4800d;
        c1661a.m3668c(context);
        this.f4816a.add(serviceConnection);
    }

    /* renamed from: f */
    public final boolean m3689f(ServiceConnection serviceConnection) {
        return this.f4816a.contains(serviceConnection);
    }

    /* renamed from: g */
    public final void m3688g(ServiceConnection serviceConnection, String str) {
        C1156a unused;
        Context unused2;
        unused = this.f4822g.f4802f;
        unused2 = this.f4822g.f4800d;
        this.f4816a.remove(serviceConnection);
    }

    /* renamed from: h */
    public final void m3687h(String str) {
        C1156a c1156a;
        Context context;
        Context context2;
        C1156a c1156a2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f4817b = 3;
        c1156a = this.f4822g.f4802f;
        context = this.f4822g.f4800d;
        AbstractC1660i.C1661a c1661a = this.f4820e;
        context2 = this.f4822g.f4800d;
        boolean m4758c = c1156a.m4758c(context, str, c1661a.m3668c(context2), this, this.f4820e.m3667d());
        this.f4818c = m4758c;
        if (m4758c) {
            handler = this.f4822g.f4801e;
            Message obtainMessage = handler.obtainMessage(1, this.f4820e);
            handler2 = this.f4822g.f4801e;
            j = this.f4822g.f4804h;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f4817b = 2;
        try {
            c1156a2 = this.f4822g.f4802f;
            context3 = this.f4822g.f4800d;
            c1156a2.m4759b(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: i */
    public final void m3686i(String str) {
        Handler handler;
        C1156a c1156a;
        Context context;
        handler = this.f4822g.f4801e;
        handler.removeMessages(1, this.f4820e);
        c1156a = this.f4822g.f4802f;
        context = this.f4822g.f4800d;
        c1156a.m4759b(context, this);
        this.f4818c = false;
        this.f4817b = 2;
    }

    /* renamed from: j */
    public final boolean m3685j() {
        return this.f4816a.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f4822g.f4799c;
        synchronized (hashMap) {
            handler = this.f4822g.f4801e;
            handler.removeMessages(1, this.f4820e);
            this.f4819d = iBinder;
            this.f4821f = componentName;
            for (ServiceConnection serviceConnection : this.f4816a) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f4817b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f4822g.f4799c;
        synchronized (hashMap) {
            handler = this.f4822g.f4801e;
            handler.removeMessages(1, this.f4820e);
            this.f4819d = null;
            this.f4821f = componentName;
            for (ServiceConnection serviceConnection : this.f4816a) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f4817b = 2;
        }
    }
}
