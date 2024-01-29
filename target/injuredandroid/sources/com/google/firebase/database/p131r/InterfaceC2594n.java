package com.google.firebase.database.p131r;

import com.google.firebase.database.p124p.C2506l;
import java.util.Iterator;
/* renamed from: com.google.firebase.database.r.n */
/* loaded from: classes.dex */
public interface InterfaceC2594n extends Comparable<InterfaceC2594n>, Iterable<C2593m> {

    /* renamed from: b */
    public static final C2573c f6747b = new C2595a();

    /* renamed from: com.google.firebase.database.r.n$a */
    /* loaded from: classes.dex */
    class C2595a extends C2573c {
        C2595a() {
        }

        @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
        /* renamed from: b */
        public InterfaceC2594n mo1079b(C2570b c2570b) {
            if (c2570b.m1158w()) {
                mo1078c();
                return this;
            }
            return C2585g.m1115s();
        }

        @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
        /* renamed from: c */
        public InterfaceC2594n mo1078c() {
            return this;
        }

        @Override // com.google.firebase.database.p131r.C2573c, java.lang.Comparable
        /* renamed from: e */
        public int compareTo(InterfaceC2594n interfaceC2594n) {
            return interfaceC2594n == this ? 0 : 1;
        }

        @Override // com.google.firebase.database.p131r.C2573c
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
        public boolean isEmpty() {
            return false;
        }

        @Override // com.google.firebase.database.p131r.C2573c, com.google.firebase.database.p131r.InterfaceC2594n
        /* renamed from: o */
        public boolean mo1076o(C2570b c2570b) {
            return false;
        }

        @Override // com.google.firebase.database.p131r.C2573c
        public String toString() {
            return "<Max Node>";
        }
    }

    /* renamed from: com.google.firebase.database.r.n$b */
    /* loaded from: classes.dex */
    public enum EnumC2596b {
        V1,
        V2
    }

    /* renamed from: a */
    int mo1087a();

    /* renamed from: b */
    InterfaceC2594n mo1079b(C2570b c2570b);

    /* renamed from: c */
    InterfaceC2594n mo1078c();

    String getHash();

    Object getValue();

    /* renamed from: h */
    InterfaceC2594n mo1086h(C2506l c2506l);

    boolean isEmpty();

    /* renamed from: j */
    InterfaceC2594n mo1061j(InterfaceC2594n interfaceC2594n);

    /* renamed from: k */
    boolean mo1085k();

    /* renamed from: n */
    C2570b mo1084n(C2570b c2570b);

    /* renamed from: o */
    boolean mo1076o(C2570b c2570b);

    /* renamed from: p */
    InterfaceC2594n mo1083p(C2570b c2570b, InterfaceC2594n interfaceC2594n);

    /* renamed from: q */
    InterfaceC2594n mo1082q(C2506l c2506l, InterfaceC2594n interfaceC2594n);

    /* renamed from: r */
    Object mo1081r(boolean z);

    /* renamed from: t */
    Iterator<C2593m> mo1080t();

    /* renamed from: v */
    String mo1058v(EnumC2596b enumC2596b);
}
