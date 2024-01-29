package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p000a.p014d.C0071d;
import p000a.p014d.C0079g;
import p000a.p019g.p027j.C0192g;
import p000a.p019g.p027j.InterfaceC0191f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
public class C1061p {

    /* renamed from: a */
    final C0079g<RecyclerView.AbstractC0974d0, C1062a> f3683a = new C0079g<>();

    /* renamed from: b */
    final C0071d<RecyclerView.AbstractC0974d0> f3684b = new C0071d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.p$a */
    /* loaded from: classes.dex */
    public static class C1062a {

        /* renamed from: d */
        static InterfaceC0191f<C1062a> f3685d = new C0192g(20);

        /* renamed from: a */
        int f3686a;

        /* renamed from: b */
        RecyclerView.AbstractC0982l.C0985c f3687b;

        /* renamed from: c */
        RecyclerView.AbstractC0982l.C0985c f3688c;

        private C1062a() {
        }

        /* renamed from: a */
        static void m5070a() {
            do {
            } while (f3685d.mo8869b() != null);
        }

        /* renamed from: b */
        static C1062a m5069b() {
            C1062a mo8869b = f3685d.mo8869b();
            return mo8869b == null ? new C1062a() : mo8869b;
        }

        /* renamed from: c */
        static void m5068c(C1062a c1062a) {
            c1062a.f3686a = 0;
            c1062a.f3687b = null;
            c1062a.f3688c = null;
            f3685d.mo8870a(c1062a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.p$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1063b {
        /* renamed from: a */
        void mo5067a(RecyclerView.AbstractC0974d0 abstractC0974d0);

        /* renamed from: b */
        void mo5066b(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c, RecyclerView.AbstractC0982l.C0985c c0985c2);

        /* renamed from: c */
        void mo5065c(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c, RecyclerView.AbstractC0982l.C0985c c0985c2);

        /* renamed from: d */
        void mo5064d(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c, RecyclerView.AbstractC0982l.C0985c c0985c2);
    }

    /* renamed from: l */
    private RecyclerView.AbstractC0982l.C0985c m5076l(RecyclerView.AbstractC0974d0 abstractC0974d0, int i) {
        C1062a m9330m;
        RecyclerView.AbstractC0982l.C0985c c0985c;
        int m9337f = this.f3683a.m9337f(abstractC0974d0);
        if (m9337f >= 0 && (m9330m = this.f3683a.m9330m(m9337f)) != null) {
            int i2 = m9330m.f3686a;
            if ((i2 & i) != 0) {
                m9330m.f3686a = (~i) & i2;
                if (i == 4) {
                    c0985c = m9330m.f3687b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    c0985c = m9330m.f3688c;
                }
                if ((m9330m.f3686a & 12) == 0) {
                    this.f3683a.m9332k(m9337f);
                    C1062a.m5068c(m9330m);
                }
                return c0985c;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5087a(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c) {
        C1062a c1062a = this.f3683a.get(abstractC0974d0);
        if (c1062a == null) {
            c1062a = C1062a.m5069b();
            this.f3683a.put(abstractC0974d0, c1062a);
        }
        c1062a.f3686a |= 2;
        c1062a.f3687b = c0985c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5086b(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        C1062a c1062a = this.f3683a.get(abstractC0974d0);
        if (c1062a == null) {
            c1062a = C1062a.m5069b();
            this.f3683a.put(abstractC0974d0, c1062a);
        }
        c1062a.f3686a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m5085c(long j, RecyclerView.AbstractC0974d0 abstractC0974d0) {
        this.f3684b.m9374j(j, abstractC0974d0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m5084d(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c) {
        C1062a c1062a = this.f3683a.get(abstractC0974d0);
        if (c1062a == null) {
            c1062a = C1062a.m5069b();
            this.f3683a.put(abstractC0974d0, c1062a);
        }
        c1062a.f3688c = c0985c;
        c1062a.f3686a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m5083e(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0982l.C0985c c0985c) {
        C1062a c1062a = this.f3683a.get(abstractC0974d0);
        if (c1062a == null) {
            c1062a = C1062a.m5069b();
            this.f3683a.put(abstractC0974d0, c1062a);
        }
        c1062a.f3687b = c0985c;
        c1062a.f3686a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m5082f() {
        this.f3683a.clear();
        this.f3684b.m9382b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.AbstractC0974d0 m5081g(long j) {
        return this.f3684b.m9378f(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m5080h(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        C1062a c1062a = this.f3683a.get(abstractC0974d0);
        return (c1062a == null || (c1062a.f3686a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m5079i(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        C1062a c1062a = this.f3683a.get(abstractC0974d0);
        return (c1062a == null || (c1062a.f3686a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m5078j() {
        C1062a.m5070a();
    }

    /* renamed from: k */
    public void m5077k(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5072p(abstractC0974d0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.AbstractC0982l.C0985c m5075m(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        return m5076l(abstractC0974d0, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.AbstractC0982l.C0985c m5074n(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        return m5076l(abstractC0974d0, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m5073o(InterfaceC1063b interfaceC1063b) {
        RecyclerView.AbstractC0982l.C0985c c0985c;
        RecyclerView.AbstractC0982l.C0985c c0985c2;
        for (int size = this.f3683a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0974d0 m9334i = this.f3683a.m9334i(size);
            C1062a m9332k = this.f3683a.m9332k(size);
            int i = m9332k.f3686a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    c0985c = m9332k.f3687b;
                    c0985c2 = c0985c != null ? m9332k.f3688c : null;
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            interfaceC1063b.mo5064d(m9334i, m9332k.f3687b, m9332k.f3688c);
                        } else if ((i & 4) != 0) {
                            c0985c = m9332k.f3687b;
                        } else if ((i & 8) == 0) {
                        }
                        C1062a.m5068c(m9332k);
                    }
                    interfaceC1063b.mo5066b(m9334i, m9332k.f3687b, m9332k.f3688c);
                    C1062a.m5068c(m9332k);
                }
                interfaceC1063b.mo5065c(m9334i, c0985c, c0985c2);
                C1062a.m5068c(m9332k);
            }
            interfaceC1063b.mo5067a(m9334i);
            C1062a.m5068c(m9332k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m5072p(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        C1062a c1062a = this.f3683a.get(abstractC0974d0);
        if (c1062a == null) {
            return;
        }
        c1062a.f3686a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m5071q(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        int m9371m = this.f3684b.m9371m() - 1;
        while (true) {
            if (m9371m < 0) {
                break;
            } else if (abstractC0974d0 == this.f3684b.m9370n(m9371m)) {
                this.f3684b.m9372l(m9371m);
                break;
            } else {
                m9371m--;
            }
        }
        C1062a remove = this.f3683a.remove(abstractC0974d0);
        if (remove != null) {
            C1062a.m5068c(remove);
        }
    }
}
