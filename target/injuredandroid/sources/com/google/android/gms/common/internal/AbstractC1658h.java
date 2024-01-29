package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1548a;
import com.google.android.gms.common.api.InterfaceC1565f;
import com.google.android.gms.common.api.InterfaceC1566g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC1579d;
import com.google.android.gms.common.api.internal.InterfaceC1592i;
import com.google.android.gms.common.internal.AbstractC1634c;
import java.util.Collections;
import java.util.Set;
import p054b.p059c.p060a.p061a.p063b.C1147d;
/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes.dex */
public abstract class AbstractC1658h<T extends IInterface> extends AbstractC1634c<T> implements C1548a.InterfaceC1556f {

    /* renamed from: v */
    private final Set<Scope> f4823v;

    /* renamed from: w */
    private final Account f4824w;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public AbstractC1658h(Context context, Looper looper, int i, C1648d c1648d, InterfaceC1565f interfaceC1565f, InterfaceC1566g interfaceC1566g) {
        this(context, looper, i, c1648d, (InterfaceC1579d) interfaceC1565f, (InterfaceC1592i) interfaceC1566g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1658h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C1648d r13, com.google.android.gms.common.api.internal.InterfaceC1579d r14, com.google.android.gms.common.api.internal.InterfaceC1592i r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.AbstractC1660i.m3674a(r10)
            b.c.a.a.b.d r4 = p054b.p059c.p060a.p061a.p063b.C1147d.m4800l()
            com.google.android.gms.common.internal.C1679r.m3631h(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.d r7 = (com.google.android.gms.common.api.internal.InterfaceC1579d) r7
            com.google.android.gms.common.internal.C1679r.m3631h(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.i r8 = (com.google.android.gms.common.api.internal.InterfaceC1592i) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC1658h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.i):void");
    }

    protected AbstractC1658h(Context context, Looper looper, AbstractC1660i abstractC1660i, C1147d c1147d, int i, C1648d c1648d, InterfaceC1579d interfaceC1579d, InterfaceC1592i interfaceC1592i) {
        super(context, looper, abstractC1660i, c1147d, i, m3681h0(interfaceC1579d), m3680i0(interfaceC1592i), c1648d.m3719e());
        this.f4824w = c1648d.m3723a();
        Set<Scope> m3721c = c1648d.m3721c();
        m3679j0(m3721c);
        this.f4823v = m3721c;
    }

    /* renamed from: h0 */
    private static AbstractC1634c.InterfaceC1635a m3681h0(InterfaceC1579d interfaceC1579d) {
        if (interfaceC1579d == null) {
            return null;
        }
        return new C1691y(interfaceC1579d);
    }

    /* renamed from: i0 */
    private static AbstractC1634c.InterfaceC1636b m3680i0(InterfaceC1592i interfaceC1592i) {
        if (interfaceC1592i == null) {
            return null;
        }
        return new C1692z(interfaceC1592i);
    }

    /* renamed from: j0 */
    private final Set<Scope> m3679j0(Set<Scope> set) {
        m3682g0(set);
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: B */
    protected final Set<Scope> mo3684B() {
        return this.f4823v;
    }

    @Override // com.google.android.gms.common.api.C1548a.InterfaceC1556f
    /* renamed from: e */
    public Set<Scope> mo3683e() {
        return mo3739q() ? this.f4823v : Collections.emptySet();
    }

    /* renamed from: g0 */
    protected Set<Scope> m3682g0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c, com.google.android.gms.common.api.C1548a.InterfaceC1556f
    /* renamed from: k */
    public int mo2214k() {
        return super.mo2214k();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1634c
    /* renamed from: v */
    public final Account mo3678v() {
        return this.f4824w;
    }
}
