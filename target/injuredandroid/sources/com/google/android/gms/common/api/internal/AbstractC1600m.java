package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.C1548a.InterfaceC1550b;
import com.google.android.gms.common.internal.C1679r;
import p054b.p059c.p060a.p061a.p063b.C1146c;
import p054b.p059c.p060a.p061a.p074f.C1289h;
/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractC1600m<A extends C1548a.InterfaceC1550b, ResultT> {

    /* renamed from: a */
    private final C1146c[] f4699a;

    /* renamed from: b */
    private final boolean f4700b;

    /* renamed from: com.google.android.gms.common.api.internal.m$a */
    /* loaded from: classes.dex */
    public static class C1601a<A extends C1548a.InterfaceC1550b, ResultT> {

        /* renamed from: a */
        private InterfaceC1596k<A, C1289h<ResultT>> f4701a;

        /* renamed from: b */
        private boolean f4702b;

        /* renamed from: c */
        private C1146c[] f4703c;

        private C1601a() {
            this.f4702b = true;
        }

        /* renamed from: a */
        public AbstractC1600m<A, ResultT> m3811a() {
            C1679r.m3637b(this.f4701a != null, "execute parameter required");
            return new C1589g0(this, this.f4703c, this.f4702b);
        }

        /* renamed from: b */
        public C1601a<A, ResultT> m3810b(InterfaceC1596k<A, C1289h<ResultT>> interfaceC1596k) {
            this.f4701a = interfaceC1596k;
            return this;
        }

        /* renamed from: c */
        public C1601a<A, ResultT> m3809c(boolean z) {
            this.f4702b = z;
            return this;
        }

        /* renamed from: d */
        public C1601a<A, ResultT> m3808d(C1146c... c1146cArr) {
            this.f4703c = c1146cArr;
            return this;
        }
    }

    private AbstractC1600m(C1146c[] c1146cArr, boolean z) {
        this.f4699a = c1146cArr;
        this.f4700b = z;
    }

    /* renamed from: a */
    public static <A extends C1548a.InterfaceC1550b, ResultT> C1601a<A, ResultT> m3815a() {
        return new C1601a<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3814b(A a, C1289h<ResultT> c1289h);

    /* renamed from: c */
    public boolean m3813c() {
        return this.f4700b;
    }

    /* renamed from: d */
    public final C1146c[] m3812d() {
        return this.f4699a;
    }
}
