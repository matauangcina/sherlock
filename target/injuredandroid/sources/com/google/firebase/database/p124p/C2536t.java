package com.google.firebase.database.p124p;

import com.google.firebase.database.p131r.C2570b;
import com.google.firebase.database.p131r.InterfaceC2594n;
import java.util.Map;
/* renamed from: com.google.firebase.database.p.t */
/* loaded from: classes.dex */
class C2536t {

    /* renamed from: a */
    private InterfaceC2594n f6614a = null;

    /* renamed from: b */
    private Map<C2570b, C2536t> f6615b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.database.p.t$a */
    /* loaded from: classes.dex */
    public class C2537a implements InterfaceC2538b {

        /* renamed from: a */
        final /* synthetic */ C2506l f6616a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2539c f6617b;

        C2537a(C2536t c2536t, C2506l c2506l, InterfaceC2539c interfaceC2539c) {
            this.f6616a = c2506l;
            this.f6617b = interfaceC2539c;
        }

        @Override // com.google.firebase.database.p124p.C2536t.InterfaceC2538b
        /* renamed from: a */
        public void mo1283a(C2570b c2570b, C2536t c2536t) {
            c2536t.m1284b(this.f6616a.m1389l(c2570b), this.f6617b);
        }
    }

    /* renamed from: com.google.firebase.database.p.t$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2538b {
        /* renamed from: a */
        void mo1283a(C2570b c2570b, C2536t c2536t);
    }

    /* renamed from: com.google.firebase.database.p.t$c */
    /* loaded from: classes.dex */
    public interface InterfaceC2539c {
        /* renamed from: a */
        void mo1282a(C2506l c2506l, InterfaceC2594n interfaceC2594n);
    }

    /* renamed from: a */
    public void m1285a(InterfaceC2538b interfaceC2538b) {
        Map<C2570b, C2536t> map = this.f6615b;
        if (map != null) {
            for (Map.Entry<C2570b, C2536t> entry : map.entrySet()) {
                interfaceC2538b.mo1283a(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public void m1284b(C2506l c2506l, InterfaceC2539c interfaceC2539c) {
        InterfaceC2594n interfaceC2594n = this.f6614a;
        if (interfaceC2594n != null) {
            interfaceC2539c.mo1282a(c2506l, interfaceC2594n);
        } else {
            m1285a(new C2537a(this, c2506l, interfaceC2539c));
        }
    }
}
