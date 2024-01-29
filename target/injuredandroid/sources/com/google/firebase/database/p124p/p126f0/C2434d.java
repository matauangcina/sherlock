package com.google.firebase.database.p124p.p126f0;

import com.google.firebase.database.p124p.C2411b;
import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p124p.C2561y;
import com.google.firebase.database.p124p.p127g0.C2472l;
import com.google.firebase.database.p124p.p128h0.C2475a;
import com.google.firebase.database.p124p.p128h0.C2488i;
import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.C2585g;
import com.google.firebase.database.p131r.C2587i;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* renamed from: com.google.firebase.database.p.f0.d */
/* loaded from: classes.dex */
public class C2434d implements InterfaceC2435e {

    /* renamed from: a */
    private boolean f6393a = false;

    /* renamed from: p */
    private void m1687p() {
        C2472l.m1519f(this.f6393a, "Transaction expected to already be in progress.");
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: a */
    public void mo1686a(long j) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: b */
    public void mo1685b(C2506l c2506l, C2411b c2411b, long j) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: c */
    public List<C2561y> mo1684c() {
        return Collections.emptyList();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: d */
    public void mo1683d(C2506l c2506l, InterfaceC2594n interfaceC2594n, long j) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: e */
    public void mo1682e(C2488i c2488i) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: f */
    public void mo1681f(C2488i c2488i) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: g */
    public void mo1680g(C2488i c2488i, Set<C2570b> set, Set<C2570b> set2) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: h */
    public void mo1679h(C2488i c2488i, Set<C2570b> set) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: i */
    public <T> T mo1678i(Callable<T> callable) {
        C2472l.m1519f(!this.f6393a, "runInTransaction called when an existing transaction is already in progress.");
        this.f6393a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: j */
    public void mo1677j(C2488i c2488i, InterfaceC2594n interfaceC2594n) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: k */
    public void mo1676k(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: l */
    public void mo1675l(C2488i c2488i) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: m */
    public void mo1674m(C2506l c2506l, C2411b c2411b) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: n */
    public void mo1673n(C2506l c2506l, C2411b c2411b) {
        m1687p();
    }

    @Override // com.google.firebase.database.p124p.p126f0.InterfaceC2435e
    /* renamed from: o */
    public C2475a mo1672o(C2488i c2488i) {
        return new C2475a(C2587i.m1107f(C2585g.m1115s(), c2488i.m1458c()), false, false);
    }
}
