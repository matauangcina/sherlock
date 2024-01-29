package androidx.lifecycle;

import androidx.lifecycle.AbstractC0868e;
import p000a.p008b.p009a.p010a.C0043a;
import p000a.p008b.p009a.p011b.C0048b;
/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: i */
    static final Object f3098i = new Object();

    /* renamed from: g */
    private boolean f3105g;

    /* renamed from: h */
    private boolean f3106h;

    /* renamed from: a */
    final Object f3099a = new Object();

    /* renamed from: b */
    private C0048b<InterfaceC0883p<? super T>, LiveData<T>.AbstractC0859a> f3100b = new C0048b<>();

    /* renamed from: c */
    int f3101c = 0;

    /* renamed from: e */
    volatile Object f3103e = f3098i;

    /* renamed from: d */
    private volatile Object f3102d = f3098i;

    /* renamed from: f */
    private int f3104f = -1;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC0859a implements InterfaceC0873h {

        /* renamed from: e */
        final InterfaceC0875j f3107e;

        LifecycleBoundObserver(InterfaceC0875j interfaceC0875j, InterfaceC0883p<? super T> interfaceC0883p) {
            super(interfaceC0883p);
            this.f3107e = interfaceC0875j;
        }

        @Override // androidx.lifecycle.InterfaceC0873h
        /* renamed from: d */
        public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
            if (this.f3107e.mo698a().mo6123b() == AbstractC0868e.EnumC0870b.DESTROYED) {
                LiveData.this.mo6154i(this.f3109a);
            } else {
                m6153h(mo6150k());
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0859a
        /* renamed from: i */
        void mo6152i() {
            this.f3107e.mo698a().mo6122c(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0859a
        /* renamed from: j */
        boolean mo6151j(InterfaceC0875j interfaceC0875j) {
            return this.f3107e == interfaceC0875j;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0859a
        /* renamed from: k */
        boolean mo6150k() {
            return this.f3107e.mo698a().mo6123b().m6128d(AbstractC0868e.EnumC0870b.STARTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public abstract class AbstractC0859a {

        /* renamed from: a */
        final InterfaceC0883p<? super T> f3109a;

        /* renamed from: b */
        boolean f3110b;

        /* renamed from: c */
        int f3111c = -1;

        AbstractC0859a(InterfaceC0883p<? super T> interfaceC0883p) {
            this.f3109a = interfaceC0883p;
        }

        /* renamed from: h */
        void m6153h(boolean z) {
            if (z == this.f3110b) {
                return;
            }
            this.f3110b = z;
            boolean z2 = LiveData.this.f3101c == 0;
            LiveData.this.f3101c += this.f3110b ? 1 : -1;
            if (z2 && this.f3110b) {
                LiveData.this.mo6156g();
            }
            LiveData liveData = LiveData.this;
            if (liveData.f3101c == 0 && !this.f3110b) {
                liveData.mo6155h();
            }
            if (this.f3110b) {
                LiveData.this.m6160c(this);
            }
        }

        /* renamed from: i */
        void mo6152i() {
        }

        /* renamed from: j */
        boolean mo6151j(InterfaceC0875j interfaceC0875j) {
            return false;
        }

        /* renamed from: k */
        abstract boolean mo6150k();
    }

    /* renamed from: a */
    static void m6162a(String str) {
        if (C0043a.m9469b().mo9468a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: b */
    private void m6161b(LiveData<T>.AbstractC0859a abstractC0859a) {
        if (abstractC0859a.f3110b) {
            if (!abstractC0859a.mo6150k()) {
                abstractC0859a.m6153h(false);
                return;
            }
            int i = abstractC0859a.f3111c;
            int i2 = this.f3104f;
            if (i >= i2) {
                return;
            }
            abstractC0859a.f3111c = i2;
            abstractC0859a.f3109a.m6097a((Object) this.f3102d);
        }
    }

    /* renamed from: c */
    void m6160c(LiveData<T>.AbstractC0859a abstractC0859a) {
        if (this.f3105g) {
            this.f3106h = true;
            return;
        }
        this.f3105g = true;
        do {
            this.f3106h = false;
            if (abstractC0859a == null) {
                C0048b<InterfaceC0883p<? super T>, LiveData<T>.AbstractC0859a>.C0052d m9463g = this.f3100b.m9463g();
                while (m9463g.hasNext()) {
                    m6161b((AbstractC0859a) m9463g.next().getValue());
                    if (this.f3106h) {
                        break;
                    }
                }
            } else {
                m6161b(abstractC0859a);
                abstractC0859a = null;
            }
        } while (this.f3106h);
        this.f3105g = false;
    }

    /* renamed from: d */
    public T m6159d() {
        T t = (T) this.f3102d;
        if (t != f3098i) {
            return t;
        }
        return null;
    }

    /* renamed from: e */
    public boolean m6158e() {
        return this.f3101c > 0;
    }

    /* renamed from: f */
    public void m6157f(InterfaceC0875j interfaceC0875j, InterfaceC0883p<? super T> interfaceC0883p) {
        m6162a("observe");
        if (interfaceC0875j.mo698a().mo6123b() == AbstractC0868e.EnumC0870b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0875j, interfaceC0883p);
        LiveData<T>.AbstractC0859a mo9460m = this.f3100b.mo9460m(interfaceC0883p, lifecycleBoundObserver);
        if (mo9460m != null && !mo9460m.mo6151j(interfaceC0875j)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo9460m != null) {
            return;
        }
        interfaceC0875j.mo698a().mo6124a(lifecycleBoundObserver);
    }

    /* renamed from: g */
    protected void mo6156g() {
    }

    /* renamed from: h */
    protected void mo6155h() {
    }

    /* renamed from: i */
    public void mo6154i(InterfaceC0883p<? super T> interfaceC0883p) {
        m6162a("removeObserver");
        LiveData<T>.AbstractC0859a mo9459s = this.f3100b.mo9459s(interfaceC0883p);
        if (mo9459s == null) {
            return;
        }
        mo9459s.mo6152i();
        mo9459s.m6153h(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void mo6098j(T t) {
        m6162a("setValue");
        this.f3104f++;
        this.f3102d = t;
        m6160c(null);
    }
}
