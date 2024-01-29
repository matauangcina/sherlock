package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p014d.C0066a;
import p054b.p059c.p060a.p061a.p068d.p070b.HandlerC1178d;
/* renamed from: com.google.android.gms.common.api.internal.q0 */
/* loaded from: classes.dex */
public final class FragmentC1610q0 extends Fragment implements InterfaceC1588g {

    /* renamed from: i */
    private static WeakHashMap<Activity, WeakReference<FragmentC1610q0>> f4715i = new WeakHashMap<>();

    /* renamed from: f */
    private Map<String, LifecycleCallback> f4716f = new C0066a();

    /* renamed from: g */
    private int f4717g = 0;

    /* renamed from: h */
    private Bundle f4718h;

    /* renamed from: d */
    public static FragmentC1610q0 m3792d(Activity activity) {
        FragmentC1610q0 fragmentC1610q0;
        WeakReference<FragmentC1610q0> weakReference = f4715i.get(activity);
        if (weakReference == null || (fragmentC1610q0 = weakReference.get()) == null) {
            try {
                FragmentC1610q0 fragmentC1610q02 = (FragmentC1610q0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (fragmentC1610q02 == null || fragmentC1610q02.isRemoving()) {
                    fragmentC1610q02 = new FragmentC1610q0();
                    activity.getFragmentManager().beginTransaction().add(fragmentC1610q02, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                f4715i.put(activity, new WeakReference<>(fragmentC1610q02));
                return fragmentC1610q02;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return fragmentC1610q0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1588g
    /* renamed from: b */
    public final void mo3787b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f4716f.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f4716f.put(str, lifecycleCallback);
        if (this.f4717g > 0) {
            new HandlerC1178d(Looper.getMainLooper()).post(new RunnableC1612r0(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1588g
    /* renamed from: c */
    public final <T extends LifecycleCallback> T mo3786c(String str, Class<T> cls) {
        return cls.cast(this.f4716f.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f4716f.values()) {
            lifecycleCallback.m3923a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f4716f.values()) {
            lifecycleCallback.m3920d(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4717g = 1;
        this.f4718h = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f4716f.entrySet()) {
            entry.getValue().m3919e(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f4717g = 5;
        for (LifecycleCallback lifecycleCallback : this.f4716f.values()) {
            lifecycleCallback.m3918f();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f4717g = 3;
        for (LifecycleCallback lifecycleCallback : this.f4716f.values()) {
            lifecycleCallback.m3917g();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f4716f.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().m3916h(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f4717g = 2;
        for (LifecycleCallback lifecycleCallback : this.f4716f.values()) {
            lifecycleCallback.m3915i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f4717g = 4;
        for (LifecycleCallback lifecycleCallback : this.f4716f.values()) {
            lifecycleCallback.mo3914j();
        }
    }
}
