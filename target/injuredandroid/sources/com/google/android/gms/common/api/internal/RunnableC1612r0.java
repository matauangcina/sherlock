package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* loaded from: classes.dex */
final class RunnableC1612r0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ LifecycleCallback f4719f;

    /* renamed from: g */
    private final /* synthetic */ String f4720g;

    /* renamed from: h */
    private final /* synthetic */ FragmentC1610q0 f4721h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1612r0(FragmentC1610q0 fragmentC1610q0, LifecycleCallback lifecycleCallback, String str) {
        this.f4721h = fragmentC1610q0;
        this.f4719f = lifecycleCallback;
        this.f4720g = str;
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
        i = this.f4721h.f4717g;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f4719f;
            bundle = this.f4721h.f4718h;
            if (bundle != null) {
                bundle3 = this.f4721h.f4718h;
                bundle2 = bundle3.getBundle(this.f4720g);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.m3919e(bundle2);
        }
        i2 = this.f4721h.f4717g;
        if (i2 >= 2) {
            this.f4719f.m3915i();
        }
        i3 = this.f4721h.f4717g;
        if (i3 >= 3) {
            this.f4719f.m3917g();
        }
        i4 = this.f4721h.f4717g;
        if (i4 >= 4) {
            this.f4719f.mo3914j();
        }
        i5 = this.f4721h.f4717g;
        if (i5 >= 5) {
            this.f4719f.m3918f();
        }
    }
}
