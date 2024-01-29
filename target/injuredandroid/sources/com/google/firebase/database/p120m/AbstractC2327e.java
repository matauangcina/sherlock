package com.google.firebase.database.p120m;

import com.google.firebase.auth.C2194p;
import com.google.firebase.auth.internal.InterfaceC2144b;
import com.google.firebase.database.p124p.InterfaceC2407a;
import java.util.concurrent.ExecutorService;
import p054b.p059c.p060a.p061a.p074f.AbstractC1288g;
import p054b.p059c.p098c.C1413a;
import p054b.p059c.p098c.p102m.p103c.C1438a;
/* renamed from: com.google.firebase.database.m.e */
/* loaded from: classes.dex */
public abstract class AbstractC2327e implements InterfaceC2407a {

    /* renamed from: com.google.firebase.database.m.e$a */
    /* loaded from: classes.dex */
    class C2328a implements InterfaceC2407a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2144b f6142a;

        C2328a(InterfaceC2144b interfaceC2144b) {
            this.f6142a = interfaceC2144b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public static /* synthetic */ void m2023f(InterfaceC2407a.InterfaceC2408a interfaceC2408a, Exception exc) {
            if (AbstractC2327e.m2027f(exc)) {
                interfaceC2408a.mo1576a(null);
            } else {
                interfaceC2408a.mo1575b(exc.getMessage());
            }
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2407a
        /* renamed from: a */
        public void mo1757a(boolean z, InterfaceC2407a.InterfaceC2408a interfaceC2408a) {
            AbstractC1288g<C2194p> mo2380b = this.f6142a.mo2380b(z);
            mo2380b.mo4584f(C2323a.m2037a(interfaceC2408a));
            mo2380b.mo4586d(C2324b.m2035a(interfaceC2408a));
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2407a
        /* renamed from: b */
        public void mo1756b(ExecutorService executorService, InterfaceC2407a.InterfaceC2409b interfaceC2409b) {
            this.f6142a.mo2381a(C2325c.m2032b(executorService, interfaceC2409b));
        }
    }

    /* renamed from: com.google.firebase.database.m.e$b */
    /* loaded from: classes.dex */
    class C2329b implements InterfaceC2407a {
        C2329b() {
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2407a
        /* renamed from: a */
        public void mo1757a(boolean z, InterfaceC2407a.InterfaceC2408a interfaceC2408a) {
            interfaceC2408a.mo1576a(null);
        }

        @Override // com.google.firebase.database.p124p.InterfaceC2407a
        /* renamed from: b */
        public void mo1756b(ExecutorService executorService, InterfaceC2407a.InterfaceC2409b interfaceC2409b) {
            executorService.execute(RunnableC2330f.m2021a(interfaceC2409b));
        }
    }

    /* renamed from: d */
    public static InterfaceC2407a m2029d(InterfaceC2144b interfaceC2144b) {
        return new C2328a(interfaceC2144b);
    }

    /* renamed from: e */
    public static InterfaceC2407a m2028e() {
        return new C2329b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m2027f(Exception exc) {
        return (exc instanceof C1413a) || (exc instanceof C1438a);
    }
}
