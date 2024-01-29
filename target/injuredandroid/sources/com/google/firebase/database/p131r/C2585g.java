package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.C2506l;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.google.firebase.database.r.g */
/* loaded from: classes.dex */
public class C2585g extends C2573c implements InterfaceC2594n {

    /* renamed from: j */
    private static final C2585g f6728j = new C2585g();

    private C2585g() {
    }

    /* renamed from: s */
    public static C2585g m1115s() {
        return f6728j;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: a */
    public int mo1087a() {
        return 0;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: b */
    public InterfaceC2594n mo1079b(C2570b c2570b) {
        return this;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: c */
    public InterfaceC2594n mo1078c() {
        return this;
    }

    @Override // com.google.firebase.database.p131r.C2573c, java.lang.Comparable
    /* renamed from: e */
    public int compareTo(InterfaceC2594n interfaceC2594n) {
        return interfaceC2594n.isEmpty() ? 0 : -1;
    }

    @Override // com.google.firebase.database.p131r.C2573c
    public boolean equals(Object obj) {
        if (obj instanceof C2585g) {
            return true;
        }
        if (obj instanceof InterfaceC2594n) {
            InterfaceC2594n interfaceC2594n = (InterfaceC2594n) obj;
            if (interfaceC2594n.isEmpty()) {
                mo1078c();
                if (equals(interfaceC2594n.mo1078c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    public String getHash() {
        return "";
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    public Object getValue() {
        return null;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: h */
    public InterfaceC2594n mo1086h(C2506l c2506l) {
        return this;
    }

    @Override // com.google.firebase.database.p131r.C2573c
    public int hashCode() {
        return 0;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.p131r.C2573c, java.lang.Iterable
    public Iterator<C2593m> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: j */
    public /* bridge */ /* synthetic */ InterfaceC2594n mo1061j(InterfaceC2594n interfaceC2594n) {
        m1114u(interfaceC2594n);
        return this;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: k */
    public boolean mo1085k() {
        return false;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: n */
    public C2570b mo1084n(C2570b c2570b) {
        return null;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: o */
    public boolean mo1076o(C2570b c2570b) {
        return false;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: p */
    public InterfaceC2594n mo1083p(C2570b c2570b, InterfaceC2594n interfaceC2594n) {
        return (interfaceC2594n.isEmpty() || c2570b.m1158w()) ? this : new C2573c().mo1083p(c2570b, interfaceC2594n);
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: q */
    public InterfaceC2594n mo1082q(C2506l c2506l, InterfaceC2594n interfaceC2594n) {
        if (c2506l.isEmpty()) {
            return interfaceC2594n;
        }
        C2570b m1384x = c2506l.m1384x();
        mo1079b(m1384x);
        return mo1083p(m1384x, mo1082q(c2506l.m1396A(), interfaceC2594n));
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: r */
    public Object mo1081r(boolean z) {
        return null;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: t */
    public Iterator<C2593m> mo1080t() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.firebase.database.p131r.C2573c
    public String toString() {
        return "<Empty Node>";
    }

    /* renamed from: u */
    public C2585g m1114u(InterfaceC2594n interfaceC2594n) {
        return this;
    }

    @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
    /* renamed from: v */
    public String mo1058v(InterfaceC2594n.EnumC2596b enumC2596b) {
        return "";
    }
}
