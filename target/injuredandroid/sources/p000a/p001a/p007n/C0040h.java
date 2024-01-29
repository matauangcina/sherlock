package p000a.p001a.p007n;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p019g.p028k.C0267w;
import p000a.p019g.p028k.C0272y;
import p000a.p019g.p028k.InterfaceC0271x;
/* renamed from: a.a.n.h */
/* loaded from: classes.dex */
public class C0040h {

    /* renamed from: c */
    private Interpolator f137c;

    /* renamed from: d */
    InterfaceC0271x f138d;

    /* renamed from: e */
    private boolean f139e;

    /* renamed from: b */
    private long f136b = -1;

    /* renamed from: f */
    private final C0272y f140f = new C0041a();

    /* renamed from: a */
    final ArrayList<C0267w> f135a = new ArrayList<>();

    /* renamed from: a.a.n.h$a */
    /* loaded from: classes.dex */
    class C0041a extends C0272y {

        /* renamed from: a */
        private boolean f141a = false;

        /* renamed from: b */
        private int f142b = 0;

        C0041a() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: b */
        public void mo7171b(View view) {
            int i = this.f142b + 1;
            this.f142b = i;
            if (i == C0040h.this.f135a.size()) {
                InterfaceC0271x interfaceC0271x = C0040h.this.f138d;
                if (interfaceC0271x != null) {
                    interfaceC0271x.mo7171b(null);
                }
                m9471d();
            }
        }

        @Override // p000a.p019g.p028k.C0272y, p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: c */
        public void mo7170c(View view) {
            if (this.f141a) {
                return;
            }
            this.f141a = true;
            InterfaceC0271x interfaceC0271x = C0040h.this.f138d;
            if (interfaceC0271x != null) {
                interfaceC0271x.mo7170c(null);
            }
        }

        /* renamed from: d */
        void m9471d() {
            this.f142b = 0;
            this.f141a = false;
            C0040h.this.m9478b();
        }
    }

    /* renamed from: a */
    public void m9479a() {
        if (this.f139e) {
            Iterator<C0267w> it = this.f135a.iterator();
            while (it.hasNext()) {
                it.next().m8537b();
            }
            this.f139e = false;
        }
    }

    /* renamed from: b */
    void m9478b() {
        this.f139e = false;
    }

    /* renamed from: c */
    public C0040h m9477c(C0267w c0267w) {
        if (!this.f139e) {
            this.f135a.add(c0267w);
        }
        return this;
    }

    /* renamed from: d */
    public C0040h m9476d(C0267w c0267w, C0267w c0267w2) {
        this.f135a.add(c0267w);
        c0267w2.m8531h(c0267w.m8536c());
        this.f135a.add(c0267w2);
        return this;
    }

    /* renamed from: e */
    public C0040h m9475e(long j) {
        if (!this.f139e) {
            this.f136b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0040h m9474f(Interpolator interpolator) {
        if (!this.f139e) {
            this.f137c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0040h m9473g(InterfaceC0271x interfaceC0271x) {
        if (!this.f139e) {
            this.f138d = interfaceC0271x;
        }
        return this;
    }

    /* renamed from: h */
    public void m9472h() {
        if (this.f139e) {
            return;
        }
        Iterator<C0267w> it = this.f135a.iterator();
        while (it.hasNext()) {
            C0267w next = it.next();
            long j = this.f136b;
            if (j >= 0) {
                next.m8535d(j);
            }
            Interpolator interpolator = this.f137c;
            if (interpolator != null) {
                next.m8534e(interpolator);
            }
            if (this.f138d != null) {
                next.m8533f(this.f140f);
            }
            next.m8529j();
        }
        this.f139e = true;
    }
}
