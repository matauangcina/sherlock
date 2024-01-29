package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.InterfaceC1565f;
import com.google.android.gms.common.api.InterfaceC1566g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1648d;
import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.C1681t;
import java.util.Set;
import p054b.p059c.p060a.p061a.p063b.C1144a;
import p054b.p059c.p060a.p061a.p072e.C1265a;
import p054b.p059c.p060a.p061a.p072e.C1279d;
import p054b.p059c.p060a.p061a.p072e.InterfaceC1280e;
import p054b.p059c.p060a.p061a.p072e.p073b.BinderC1270e;
import p054b.p059c.p060a.p061a.p072e.p073b.C1277l;
/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: classes.dex */
public final class BinderC1578c0 extends BinderC1270e implements InterfaceC1565f, InterfaceC1566g {

    /* renamed from: h */
    private static C1548a.AbstractC1549a<? extends InterfaceC1280e, C1265a> f4641h = C1279d.f4056c;

    /* renamed from: a */
    private final Context f4642a;

    /* renamed from: b */
    private final Handler f4643b;

    /* renamed from: c */
    private final C1548a.AbstractC1549a<? extends InterfaceC1280e, C1265a> f4644c;

    /* renamed from: d */
    private Set<Scope> f4645d;

    /* renamed from: e */
    private C1648d f4646e;

    /* renamed from: f */
    private InterfaceC1280e f4647f;

    /* renamed from: g */
    private InterfaceC1580d0 f4648g;

    public BinderC1578c0(Context context, Handler handler, C1648d c1648d) {
        this(context, handler, c1648d, f4641h);
    }

    public BinderC1578c0(Context context, Handler handler, C1648d c1648d, C1548a.AbstractC1549a<? extends InterfaceC1280e, C1265a> abstractC1549a) {
        this.f4642a = context;
        this.f4643b = handler;
        C1679r.m3630i(c1648d, "ClientSettings must not be null");
        this.f4646e = c1648d;
        this.f4645d = c1648d.m3717g();
        this.f4644c = abstractC1549a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final void m3898d0(C1277l c1277l) {
        C1144a m4614b = c1277l.m4614b();
        if (m4614b.m4807k()) {
            C1681t m4613c = c1277l.m4613c();
            m4614b = m4613c.m3623c();
            if (m4614b.m4807k()) {
                this.f4648g.mo3839c(m4613c.m3624b(), this.f4645d);
                this.f4647f.m3953p();
            }
            String valueOf = String.valueOf(m4614b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Sign-in succeeded with resolve account failure: ");
            sb.append(valueOf);
            Log.wtf("SignInCoordinator", sb.toString(), new Exception());
        }
        this.f4648g.mo3840b(m4614b);
        this.f4647f.m3953p();
    }

    @Override // p054b.p059c.p060a.p061a.p072e.p073b.InterfaceC1269d
    /* renamed from: D */
    public final void mo3903D(C1277l c1277l) {
        this.f4643b.post(new RunnableC1585e0(this, c1277l));
    }

    /* renamed from: b0 */
    public final void m3900b0(InterfaceC1580d0 interfaceC1580d0) {
        InterfaceC1280e interfaceC1280e = this.f4647f;
        if (interfaceC1280e != null) {
            interfaceC1280e.m3953p();
        }
        this.f4646e.m3715i(Integer.valueOf(System.identityHashCode(this)));
        C1548a.AbstractC1549a<? extends InterfaceC1280e, C1265a> abstractC1549a = this.f4644c;
        Context context = this.f4642a;
        Looper looper = this.f4643b.getLooper();
        C1648d c1648d = this.f4646e;
        this.f4647f = abstractC1549a.mo3963a(context, looper, c1648d, c1648d.m3716h(), this, this);
        this.f4648g = interfaceC1580d0;
        Set<Scope> set = this.f4645d;
        if (set == null || set.isEmpty()) {
            this.f4643b.post(new RunnableC1575b0(this));
        } else {
            this.f4647f.mo4612a();
        }
    }

    /* renamed from: c0 */
    public final void m3899c0() {
        InterfaceC1280e interfaceC1280e = this.f4647f;
        if (interfaceC1280e != null) {
            interfaceC1280e.m3953p();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1579d
    /* renamed from: d */
    public final void mo3862d(int i) {
        this.f4647f.m3953p();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1592i
    /* renamed from: g */
    public final void mo3827g(C1144a c1144a) {
        this.f4648g.mo3840b(c1144a);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1579d
    /* renamed from: h */
    public final void mo3859h(Bundle bundle) {
        this.f4647f.mo4611i(this);
    }
}
