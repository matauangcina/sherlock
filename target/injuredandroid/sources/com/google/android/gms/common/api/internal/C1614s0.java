package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractC0835t;
import androidx.fragment.app.ActivityC0797d;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p014d.C0066a;
import p054b.p059c.p060a.p061a.p068d.p070b.HandlerC1178d;
/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* loaded from: classes.dex */
public final class C1614s0 extends Fragment implements InterfaceC1588g {

    /* renamed from: e0 */
    private static WeakHashMap<ActivityC0797d, WeakReference<C1614s0>> f4723e0 = new WeakHashMap<>();

    /* renamed from: b0 */
    private Map<String, LifecycleCallback> f4724b0 = new C0066a();

    /* renamed from: c0 */
    private int f4725c0 = 0;

    /* renamed from: d0 */
    private Bundle f4726d0;

    /* renamed from: r1 */
    public static C1614s0 m3782r1(ActivityC0797d activityC0797d) {
        C1614s0 c1614s0;
        WeakReference<C1614s0> weakReference = f4723e0.get(activityC0797d);
        if (weakReference == null || (c1614s0 = weakReference.get()) == null) {
            try {
                C1614s0 c1614s02 = (C1614s0) activityC0797d.m6491n().m6378X("SupportLifecycleFragmentImpl");
                if (c1614s02 == null || c1614s02.m6583U()) {
                    c1614s02 = new C1614s0();
                    AbstractC0835t m6357i = activityC0797d.m6491n().m6357i();
                    m6357i.m6244d(c1614s02, "SupportLifecycleFragmentImpl");
                    m6357i.mo6239i();
                }
                f4723e0.put(activityC0797d, new WeakReference<>(c1614s02));
                return c1614s02;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return c1614s0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public final void mo3010A0(Bundle bundle) {
        super.mo3010A0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f4724b0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().m3916h(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: B0 */
    public final void mo3034B0() {
        super.mo3034B0();
        this.f4725c0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f4724b0.values()) {
            lifecycleCallback.m3915i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: C0 */
    public final void mo3032C0() {
        super.mo3032C0();
        this.f4725c0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f4724b0.values()) {
            lifecycleCallback.mo3914j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Z */
    public final void mo3788Z(int i, int i2, Intent intent) {
        super.mo3788Z(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f4724b0.values()) {
            lifecycleCallback.m3920d(i, i2, intent);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1588g
    /* renamed from: b */
    public final void mo3787b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f4724b0.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f4724b0.put(str, lifecycleCallback);
        if (this.f4725c0 > 0) {
            new HandlerC1178d(Looper.getMainLooper()).post(new RunnableC1616t0(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1588g
    /* renamed from: c */
    public final <T extends LifecycleCallback> T mo3786c(String str, Class<T> cls) {
        return cls.cast(this.f4724b0.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e */
    public final void mo3785e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3785e(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f4724b0.values()) {
            lifecycleCallback.m3923a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e0 */
    public final void mo3009e0(Bundle bundle) {
        super.mo3009e0(bundle);
        this.f4725c0 = 1;
        this.f4726d0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f4724b0.entrySet()) {
            entry.getValue().m3919e(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: j0 */
    public final void mo3784j0() {
        super.mo3784j0();
        this.f4725c0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f4724b0.values()) {
            lifecycleCallback.m3918f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: z0 */
    public final void mo3780z0() {
        super.mo3780z0();
        this.f4725c0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f4724b0.values()) {
            lifecycleCallback.m3917g();
        }
    }
}
