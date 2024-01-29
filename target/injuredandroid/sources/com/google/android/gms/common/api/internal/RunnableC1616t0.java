package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* loaded from: classes.dex */
final class RunnableC1616t0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ LifecycleCallback f4728f;

    /* renamed from: g */
    private final /* synthetic */ String f4729g;

    /* renamed from: h */
    private final /* synthetic */ C1614s0 f4730h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1616t0(C1614s0 c1614s0, LifecycleCallback lifecycleCallback, String str) {
        this.f4730h = c1614s0;
        this.f4728f = lifecycleCallback;
        this.f4729g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        i = this.f4730h.f4725c0;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f4728f;
            bundle = this.f4730h.f4726d0;
            if (bundle != null) {
                bundle3 = this.f4730h.f4726d0;
                bundle2 = bundle3.getBundle(this.f4729g);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.m3919e(bundle2);
        }
        i2 = this.f4730h.f4725c0;
        if (i2 >= 2) {
            this.f4728f.m3915i();
        }
        i3 = this.f4730h.f4725c0;
        if (i3 >= 3) {
            this.f4728f.m3917g();
        }
        i4 = this.f4730h.f4725c0;
        if (i4 >= 4) {
            this.f4728f.mo3914j();
        }
        i5 = this.f4730h.f4725c0;
        if (i5 >= 5) {
            this.f4728f.m3918f();
        }
    }
}
