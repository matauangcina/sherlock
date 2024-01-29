package com.google.firebase.auth;

import com.google.android.gms.common.internal.C1679r;
import com.google.android.gms.common.internal.p117w.AbstractC1684a;
import java.util.List;
import p054b.p059c.p060a.p061a.p068d.p071c.C1237q1;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p098c.C1415c;
/* renamed from: com.google.firebase.auth.n */
/* loaded from: classes.dex */
public abstract class AbstractC2190n extends AbstractC1684a implements InterfaceC2210y {
    /* renamed from: b */
    public abstract List<? extends InterfaceC2210y> mo2304b();

    /* renamed from: c */
    public abstract String mo2303c();

    /* renamed from: h */
    public abstract boolean mo2302h();

    /* renamed from: j */
    public AbstractC1288g<Object> m2301j(AbstractC2126b abstractC2126b) {
        C1679r.m3631h(abstractC2126b);
        return FirebaseAuth.getInstance(mo2294t()).m2408r(this, abstractC2126b);
    }

    /* renamed from: k */
    public AbstractC1288g<Object> m2300k(AbstractC2126b abstractC2126b) {
        C1679r.m3631h(abstractC2126b);
        return FirebaseAuth.getInstance(mo2294t()).m2412n(this, abstractC2126b);
    }

    /* renamed from: n */
    public abstract AbstractC2190n mo2299n(List<? extends InterfaceC2210y> list);

    /* renamed from: o */
    public abstract List<String> mo2298o();

    /* renamed from: p */
    public abstract void mo2297p(C1237q1 c1237q1);

    /* renamed from: q */
    public abstract AbstractC2190n mo2296q();

    /* renamed from: r */
    public abstract void mo2295r(List<AbstractC2205u0> list);

    /* renamed from: t */
    public abstract C1415c mo2294t();

    /* renamed from: v */
    public abstract String mo2293v();

    /* renamed from: w */
    public abstract C1237q1 mo2292w();

    /* renamed from: x */
    public abstract String mo2291x();

    /* renamed from: y */
    public abstract String mo2290y();

    /* renamed from: z */
    public abstract AbstractC2207v0 mo2289z();
}
