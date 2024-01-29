package p000a.p047p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0852w;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import p000a.p019g.p024g.C0144b;
import p000a.p047p.AbstractC0377m;
/* renamed from: a.p.e */
/* loaded from: classes.dex */
public class C0352e extends AbstractC0852w {

    /* renamed from: a.p.e$a */
    /* loaded from: classes.dex */
    class C0353a extends AbstractC0377m.AbstractC0382e {
        C0353a(C0352e c0352e, Rect rect) {
        }
    }

    /* renamed from: a.p.e$b */
    /* loaded from: classes.dex */
    class C0354b implements AbstractC0377m.InterfaceC0383f {

        /* renamed from: a */
        final /* synthetic */ View f922a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f923b;

        C0354b(C0352e c0352e, View view, ArrayList arrayList) {
            this.f922a = view;
            this.f923b = arrayList;
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: a */
        public void mo8233a(AbstractC0377m abstractC0377m) {
            abstractC0377m.mo8265P(this);
            abstractC0377m.mo8255a(this);
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: b */
        public void mo8277b(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: c */
        public void mo8276c(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: d */
        public void mo8275d(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            abstractC0377m.mo8265P(this);
            this.f922a.setVisibility(8);
            int size = this.f923b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f923b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: a.p.e$c */
    /* loaded from: classes.dex */
    class C0355c extends C0385n {

        /* renamed from: a */
        final /* synthetic */ Object f924a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f925b;

        /* renamed from: c */
        final /* synthetic */ Object f926c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f927d;

        /* renamed from: e */
        final /* synthetic */ Object f928e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f929f;

        C0355c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f924a = obj;
            this.f925b = arrayList;
            this.f926c = obj2;
            this.f927d = arrayList2;
            this.f928e = obj3;
            this.f929f = arrayList3;
        }

        @Override // p000a.p047p.C0385n, p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: a */
        public void mo8233a(AbstractC0377m abstractC0377m) {
            Object obj = this.f924a;
            if (obj != null) {
                C0352e.this.mo6177q(obj, this.f925b, null);
            }
            Object obj2 = this.f926c;
            if (obj2 != null) {
                C0352e.this.mo6177q(obj2, this.f927d, null);
            }
            Object obj3 = this.f928e;
            if (obj3 != null) {
                C0352e.this.mo6177q(obj3, this.f929f, null);
            }
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            abstractC0377m.mo8265P(this);
        }
    }

    /* renamed from: a.p.e$d */
    /* loaded from: classes.dex */
    class C0356d implements C0144b.InterfaceC0145a {

        /* renamed from: a */
        final /* synthetic */ AbstractC0377m f931a;

        C0356d(C0352e c0352e, AbstractC0377m abstractC0377m) {
            this.f931a = abstractC0377m;
        }

        @Override // p000a.p019g.p024g.C0144b.InterfaceC0145a
        /* renamed from: a */
        public void mo6479a() {
            this.f931a.mo8249f();
        }
    }

    /* renamed from: a.p.e$e */
    /* loaded from: classes.dex */
    class C0357e implements AbstractC0377m.InterfaceC0383f {

        /* renamed from: a */
        final /* synthetic */ Runnable f932a;

        C0357e(C0352e c0352e, Runnable runnable) {
            this.f932a = runnable;
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: a */
        public void mo8233a(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: b */
        public void mo8277b(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: c */
        public void mo8276c(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: d */
        public void mo8275d(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            this.f932a.run();
        }
    }

    /* renamed from: a.p.e$f */
    /* loaded from: classes.dex */
    class C0358f extends AbstractC0377m.AbstractC0382e {
        C0358f(C0352e c0352e, Rect rect) {
        }
    }

    /* renamed from: C */
    private static boolean m8339C(AbstractC0377m abstractC0377m) {
        return (AbstractC0852w.m6182l(abstractC0377m.m8279z()) && AbstractC0852w.m6182l(abstractC0377m.m8312A()) && AbstractC0852w.m6182l(abstractC0377m.m8311B())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: A */
    public void mo6195A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0390q c0390q = (C0390q) obj;
        if (c0390q != null) {
            c0390q.m8310C().clear();
            c0390q.m8310C().addAll(arrayList2);
            mo6177q(c0390q, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: B */
    public Object mo6194B(Object obj) {
        if (obj == null) {
            return null;
        }
        C0390q c0390q = new C0390q();
        c0390q.m8250e0((AbstractC0377m) obj);
        return c0390q;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: a */
    public void mo6193a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0377m) obj).mo8254b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: b */
    public void mo6192b(Object obj, ArrayList<View> arrayList) {
        AbstractC0377m abstractC0377m = (AbstractC0377m) obj;
        if (abstractC0377m == null) {
            return;
        }
        int i = 0;
        if (abstractC0377m instanceof C0390q) {
            C0390q c0390q = (C0390q) abstractC0377m;
            int m8245h0 = c0390q.m8245h0();
            while (i < m8245h0) {
                mo6192b(c0390q.m8246g0(i), arrayList);
                i++;
            }
        } else if (m8339C(abstractC0377m) || !AbstractC0852w.m6182l(abstractC0377m.m8310C())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                abstractC0377m.mo8254b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: c */
    public void mo6191c(ViewGroup viewGroup, Object obj) {
        C0386o.m8274a(viewGroup, (AbstractC0377m) obj);
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: e */
    public boolean mo6189e(Object obj) {
        return obj instanceof AbstractC0377m;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: g */
    public Object mo6187g(Object obj) {
        if (obj != null) {
            return ((AbstractC0377m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: m */
    public Object mo6181m(Object obj, Object obj2, Object obj3) {
        AbstractC0377m abstractC0377m = (AbstractC0377m) obj;
        AbstractC0377m abstractC0377m2 = (AbstractC0377m) obj2;
        AbstractC0377m abstractC0377m3 = (AbstractC0377m) obj3;
        if (abstractC0377m != null && abstractC0377m2 != null) {
            C0390q c0390q = new C0390q();
            c0390q.m8250e0(abstractC0377m);
            c0390q.m8250e0(abstractC0377m2);
            c0390q.m8237m0(1);
            abstractC0377m = c0390q;
        } else if (abstractC0377m == null) {
            abstractC0377m = abstractC0377m2 != null ? abstractC0377m2 : null;
        }
        if (abstractC0377m3 != null) {
            C0390q c0390q2 = new C0390q();
            if (abstractC0377m != null) {
                c0390q2.m8250e0(abstractC0377m);
            }
            c0390q2.m8250e0(abstractC0377m3);
            return c0390q2;
        }
        return abstractC0377m;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: n */
    public Object mo6180n(Object obj, Object obj2, Object obj3) {
        C0390q c0390q = new C0390q();
        if (obj != null) {
            c0390q.m8250e0((AbstractC0377m) obj);
        }
        if (obj2 != null) {
            c0390q.m8250e0((AbstractC0377m) obj2);
        }
        if (obj3 != null) {
            c0390q.m8250e0((AbstractC0377m) obj3);
        }
        return c0390q;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: p */
    public void mo6178p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0377m) obj).mo8264Q(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: q */
    public void mo6177q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC0377m abstractC0377m = (AbstractC0377m) obj;
        int i = 0;
        if (abstractC0377m instanceof C0390q) {
            C0390q c0390q = (C0390q) abstractC0377m;
            int m8245h0 = c0390q.m8245h0();
            while (i < m8245h0) {
                mo6177q(c0390q.m8246g0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m8339C(abstractC0377m)) {
            List<View> m8310C = abstractC0377m.m8310C();
            if (m8310C.size() == arrayList.size() && m8310C.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    abstractC0377m.mo8254b(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    abstractC0377m.mo8264Q(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: r */
    public void mo6176r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC0377m) obj).mo8255a(new C0354b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: t */
    public void mo6174t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC0377m) obj).mo8255a(new C0355c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: u */
    public void mo6173u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0377m) obj).mo8260V(new C0358f(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: v */
    public void mo6172v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m6183k(view, rect);
            ((AbstractC0377m) obj).mo8260V(new C0353a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: w */
    public void mo6171w(Fragment fragment, Object obj, C0144b c0144b, Runnable runnable) {
        AbstractC0377m abstractC0377m = (AbstractC0377m) obj;
        c0144b.m8967c(new C0356d(this, abstractC0377m));
        abstractC0377m.mo8255a(new C0357e(this, runnable));
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: z */
    public void mo6168z(Object obj, View view, ArrayList<View> arrayList) {
        C0390q c0390q = (C0390q) obj;
        List<View> m8310C = c0390q.m8310C();
        m8310C.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0852w.m6190d(m8310C, arrayList.get(i));
        }
        m8310C.add(view);
        arrayList.add(view);
        mo6192b(c0390q, arrayList);
    }
}
