package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C1701i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1576c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j */
    private static final ComponentCallbacks2C1576c f4636j = new ComponentCallbacks2C1576c();

    /* renamed from: f */
    private final AtomicBoolean f4637f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f4638g = new AtomicBoolean();

    /* renamed from: h */
    private final ArrayList<InterfaceC1577a> f4639h = new ArrayList<>();

    /* renamed from: i */
    private boolean f4640i = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1577a {
        /* renamed from: a */
        void mo2324a(boolean z);
    }

    private ComponentCallbacks2C1576c() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C1576c m3908b() {
        return f4636j;
    }

    /* renamed from: c */
    public static void m3907c(Application application) {
        synchronized (f4636j) {
            if (!f4636j.f4640i) {
                application.registerActivityLifecycleCallbacks(f4636j);
                application.registerComponentCallbacks(f4636j);
                f4636j.f4640i = true;
            }
        }
    }

    /* renamed from: e */
    private final void m3905e(boolean z) {
        synchronized (f4636j) {
            ArrayList<InterfaceC1577a> arrayList = this.f4639h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                InterfaceC1577a interfaceC1577a = arrayList.get(i);
                i++;
                interfaceC1577a.mo2324a(z);
            }
        }
    }

    /* renamed from: a */
    public final void m3909a(InterfaceC1577a interfaceC1577a) {
        synchronized (f4636j) {
            this.f4639h.add(interfaceC1577a);
        }
    }

    /* renamed from: d */
    public final boolean m3906d() {
        return this.f4637f.get();
    }

    /* renamed from: f */
    public final boolean m3904f(boolean z) {
        if (!this.f4638g.get()) {
            if (!C1701i.m3552c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4638g.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4637f.set(true);
            }
        }
        return m3906d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4637f.compareAndSet(true, false);
        this.f4638g.set(true);
        if (compareAndSet) {
            m3905e(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f4637f.compareAndSet(true, false);
        this.f4638g.set(true);
        if (compareAndSet) {
            m3905e(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f4637f.compareAndSet(false, true)) {
            this.f4638g.set(true);
            m3905e(true);
        }
    }
}
