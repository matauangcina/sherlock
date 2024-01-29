package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.internal.C1581e;
import java.util.Map;
import p054b.p059c.p060a.p061a.p063b.C1144a;
/* renamed from: com.google.android.gms.common.api.internal.x */
/* loaded from: classes.dex */
final class RunnableC1620x implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C1144a f4734f;

    /* renamed from: g */
    private final /* synthetic */ C1581e.C1583b f4735g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1620x(C1581e.C1583b c1583b, C1144a c1144a) {
        this.f4735g = c1583b;
        this.f4734f = c1144a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1574b c1574b;
        C1548a.InterfaceC1556f interfaceC1556f;
        C1548a.InterfaceC1556f interfaceC1556f2;
        C1548a.InterfaceC1556f interfaceC1556f3;
        Map map = C1581e.this.f4661i;
        c1574b = this.f4735g.f4680b;
        C1581e.C1582a c1582a = (C1581e.C1582a) map.get(c1574b);
        if (c1582a == null) {
            return;
        }
        if (!this.f4734f.m4807k()) {
            c1582a.mo3827g(this.f4734f);
            return;
        }
        C1581e.C1583b.m3837e(this.f4735g, true);
        interfaceC1556f = this.f4735g.f4679a;
        if (interfaceC1556f.mo3739q()) {
            this.f4735g.m3835g();
            return;
        }
        try {
            interfaceC1556f2 = this.f4735g.f4679a;
            interfaceC1556f3 = this.f4735g.f4679a;
            interfaceC1556f2.m3958g(null, interfaceC1556f3.mo3683e());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            c1582a.mo3827g(new C1144a(10));
        }
    }
}
