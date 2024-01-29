package com.google.firebase.auth.p118z.p119a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1679r;
import com.google.firebase.auth.AbstractC2126b;
import com.google.firebase.auth.AbstractC2190n;
import com.google.firebase.auth.AbstractC2206v;
import com.google.firebase.auth.internal.InterfaceC2154g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p054b.p059c.p060a.p061a.p068d.p071c.C1209h1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1219k1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1225m1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p060a.p061a.p068d.p071c.C1258x1;
import p054b.p059c.p098c.C1415c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.z.a.z0 */
/* loaded from: classes.dex */
public abstract class AbstractC2272z0<ResultT, CallbackT> implements InterfaceC2223e<InterfaceC2248n0, ResultT> {

    /* renamed from: a */
    protected final int f6039a;

    /* renamed from: c */
    protected C1415c f6041c;

    /* renamed from: d */
    protected AbstractC2190n f6042d;

    /* renamed from: e */
    protected CallbackT f6043e;

    /* renamed from: f */
    protected InterfaceC2154g f6044f;

    /* renamed from: g */
    protected InterfaceC2213a1<ResultT> f6045g;

    /* renamed from: i */
    protected Executor f6047i;

    /* renamed from: j */
    protected C1237q1 f6048j;

    /* renamed from: k */
    protected C1225m1 f6049k;

    /* renamed from: l */
    protected C1219k1 f6050l;

    /* renamed from: m */
    protected C1258x1 f6051m;

    /* renamed from: n */
    protected String f6052n;

    /* renamed from: o */
    protected String f6053o;

    /* renamed from: p */
    protected AbstractC2126b f6054p;

    /* renamed from: q */
    protected String f6055q;

    /* renamed from: r */
    protected String f6056r;

    /* renamed from: s */
    protected C1209h1 f6057s;

    /* renamed from: t */
    protected boolean f6058t;

    /* renamed from: u */
    protected boolean f6059u;

    /* renamed from: v */
    private boolean f6060v;

    /* renamed from: w */
    boolean f6061w;

    /* renamed from: x */
    private ResultT f6062x;

    /* renamed from: b */
    final BinderC2216b1 f6040b = new BinderC2216b1(this);

    /* renamed from: h */
    protected final List<AbstractC2206v> f6046h = new ArrayList();

    public AbstractC2272z0(int i) {
        this.f6039a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static /* synthetic */ boolean m2153l(AbstractC2272z0 abstractC2272z0, boolean z) {
        abstractC2272z0.f6060v = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m2152m(Status status) {
        InterfaceC2154g interfaceC2154g = this.f6044f;
        if (interfaceC2154g != null) {
            interfaceC2154g.mo2287e(status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m2149p() {
        mo2150o();
        C1679r.m3628k(this.f6060v, "no success or failure set on method implementation");
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2223e
    /* renamed from: b */
    public final InterfaceC2223e<InterfaceC2248n0, ResultT> mo2162b() {
        this.f6058t = true;
        return this;
    }

    @Override // com.google.firebase.auth.p118z.p119a.InterfaceC2223e
    /* renamed from: d */
    public final InterfaceC2223e<InterfaceC2248n0, ResultT> mo2161d() {
        this.f6059u = true;
        return this;
    }

    /* renamed from: e */
    public final AbstractC2272z0<ResultT, CallbackT> m2160e(C1415c c1415c) {
        C1679r.m3630i(c1415c, "firebaseApp cannot be null");
        this.f6041c = c1415c;
        return this;
    }

    /* renamed from: f */
    public final AbstractC2272z0<ResultT, CallbackT> m2159f(AbstractC2190n abstractC2190n) {
        C1679r.m3630i(abstractC2190n, "firebaseUser cannot be null");
        this.f6042d = abstractC2190n;
        return this;
    }

    /* renamed from: g */
    public final AbstractC2272z0<ResultT, CallbackT> m2158g(InterfaceC2154g interfaceC2154g) {
        C1679r.m3630i(interfaceC2154g, "external failure callback cannot be null");
        this.f6044f = interfaceC2154g;
        return this;
    }

    /* renamed from: h */
    public final AbstractC2272z0<ResultT, CallbackT> m2157h(CallbackT callbackt) {
        C1679r.m3630i(callbackt, "external callback cannot be null");
        this.f6043e = callbackt;
        return this;
    }

    /* renamed from: i */
    public final void m2156i(Status status) {
        this.f6060v = true;
        this.f6045g.mo2236a(null, status);
    }

    /* renamed from: n */
    public final void m2151n(ResultT resultt) {
        this.f6060v = true;
        this.f6062x = resultt;
        this.f6045g.mo2236a(resultt, null);
    }

    /* renamed from: o */
    public abstract void mo2150o();
}
