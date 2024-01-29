package com.google.firebase.database.p124p;

import com.google.firebase.database.p124p.p128h0.C2475a;
import com.google.firebase.database.p131r.AbstractC2586h;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2593m;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.firebase.database.p.c0 */
/* loaded from: classes.dex */
public class C2418c0 {

    /* renamed from: a */
    private final C2506l f6357a;

    /* renamed from: b */
    private final C2414b0 f6358b;

    public C2418c0(C2506l c2506l, C2414b0 c2414b0) {
        this.f6357a = c2506l;
        this.f6358b = c2414b0;
    }

    /* renamed from: a */
    public InterfaceC2594n m1721a(C2570b c2570b, C2475a c2475a) {
        return this.f6358b.m1735c(this.f6357a, c2570b, c2475a);
    }

    /* renamed from: b */
    public InterfaceC2594n m1720b(InterfaceC2594n interfaceC2594n) {
        return m1719c(interfaceC2594n, Collections.emptyList());
    }

    /* renamed from: c */
    public InterfaceC2594n m1719c(InterfaceC2594n interfaceC2594n, List<Long> list) {
        return m1718d(interfaceC2594n, list, false);
    }

    /* renamed from: d */
    public InterfaceC2594n m1718d(InterfaceC2594n interfaceC2594n, List<Long> list, boolean z) {
        return this.f6358b.m1734d(this.f6357a, interfaceC2594n, list, z);
    }

    /* renamed from: e */
    public InterfaceC2594n m1717e(InterfaceC2594n interfaceC2594n) {
        return this.f6358b.m1733e(this.f6357a, interfaceC2594n);
    }

    /* renamed from: f */
    public InterfaceC2594n m1716f(C2506l c2506l, InterfaceC2594n interfaceC2594n, InterfaceC2594n interfaceC2594n2) {
        return this.f6358b.m1732f(this.f6357a, c2506l, interfaceC2594n, interfaceC2594n2);
    }

    /* renamed from: g */
    public C2593m m1715g(InterfaceC2594n interfaceC2594n, C2593m c2593m, boolean z, AbstractC2586h abstractC2586h) {
        return this.f6358b.m1731g(this.f6357a, interfaceC2594n, c2593m, z, abstractC2586h);
    }

    /* renamed from: h */
    public C2418c0 m1714h(C2570b c2570b) {
        return new C2418c0(this.f6357a.m1389l(c2570b), this.f6358b);
    }

    /* renamed from: i */
    public InterfaceC2594n m1713i(C2506l c2506l) {
        return this.f6358b.m1724n(this.f6357a.m1390i(c2506l));
    }
}
