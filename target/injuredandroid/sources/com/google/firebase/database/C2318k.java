package com.google.firebase.database;

import com.google.firebase.database.p131r.InterfaceC2594n;
/* renamed from: com.google.firebase.database.k */
/* loaded from: classes.dex */
public class C2318k {

    /* renamed from: com.google.firebase.database.k$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2320b {
        /* renamed from: a */
        void m2043a(C2306b c2306b, boolean z, C2305a c2305a);

        /* renamed from: b */
        C2321c m2042b(C2313i c2313i);
    }

    /* renamed from: com.google.firebase.database.k$c */
    /* loaded from: classes.dex */
    public static class C2321c {

        /* renamed from: a */
        private boolean f6134a;

        /* renamed from: b */
        private InterfaceC2594n f6135b;

        private C2321c(boolean z, InterfaceC2594n interfaceC2594n) {
            this.f6134a = z;
            this.f6135b = interfaceC2594n;
        }

        /* renamed from: a */
        public InterfaceC2594n m2041a() {
            return this.f6135b;
        }

        /* renamed from: b */
        public boolean m2040b() {
            return this.f6134a;
        }
    }

    /* renamed from: a */
    public static C2321c m2044a() {
        return new C2321c(false, null);
    }
}
