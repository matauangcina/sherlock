package p000a.p047p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p014d.C0066a;
import p000a.p019g.p028k.C0252s;
/* renamed from: a.p.o */
/* loaded from: classes.dex */
public class C0386o {

    /* renamed from: a */
    private static AbstractC0377m f1014a = new C0331b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0066a<ViewGroup, ArrayList<AbstractC0377m>>>> f1015b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f1016c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.p.o$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC0387a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        AbstractC0377m f1017f;

        /* renamed from: g */
        ViewGroup f1018g;

        /* renamed from: a.p.o$a$a */
        /* loaded from: classes.dex */
        class C0388a extends C0385n {

            /* renamed from: a */
            final /* synthetic */ C0066a f1019a;

            C0388a(C0066a c0066a) {
                this.f1019a = c0066a;
            }

            @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
            /* renamed from: e */
            public void mo8232e(AbstractC0377m abstractC0377m) {
                ((ArrayList) this.f1019a.get(ViewTreeObserver$OnPreDrawListenerC0387a.this.f1018g)).remove(abstractC0377m);
                abstractC0377m.mo8265P(this);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC0387a(AbstractC0377m abstractC0377m, ViewGroup viewGroup) {
            this.f1017f = abstractC0377m;
            this.f1018g = viewGroup;
        }

        /* renamed from: a */
        private void m8270a() {
            this.f1018g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1018g.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m8270a();
            if (C0386o.f1016c.remove(this.f1018g)) {
                C0066a<ViewGroup, ArrayList<AbstractC0377m>> m8273b = C0386o.m8273b();
                ArrayList<AbstractC0377m> arrayList = m8273b.get(this.f1018g);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    m8273b.put(this.f1018g, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f1017f);
                this.f1017f.mo8255a(new C0388a(m8273b));
                this.f1017f.m8292k(this.f1018g, false);
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0377m) it.next()).mo8263R(this.f1018g);
                    }
                }
                this.f1017f.m8299O(this.f1018g);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m8270a();
            C0386o.f1016c.remove(this.f1018g);
            ArrayList<AbstractC0377m> arrayList = C0386o.m8273b().get(this.f1018g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC0377m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo8263R(this.f1018g);
                }
            }
            this.f1017f.m8291l(true);
        }
    }

    /* renamed from: a */
    public static void m8274a(ViewGroup viewGroup, AbstractC0377m abstractC0377m) {
        if (f1016c.contains(viewGroup) || !C0252s.m8650M(viewGroup)) {
            return;
        }
        f1016c.add(viewGroup);
        if (abstractC0377m == null) {
            abstractC0377m = f1014a;
        }
        AbstractC0377m clone = abstractC0377m.clone();
        m8271d(viewGroup, clone);
        C0375l.m8313c(viewGroup, null);
        m8272c(viewGroup, clone);
    }

    /* renamed from: b */
    static C0066a<ViewGroup, ArrayList<AbstractC0377m>> m8273b() {
        C0066a<ViewGroup, ArrayList<AbstractC0377m>> c0066a;
        WeakReference<C0066a<ViewGroup, ArrayList<AbstractC0377m>>> weakReference = f1015b.get();
        if (weakReference == null || (c0066a = weakReference.get()) == null) {
            C0066a<ViewGroup, ArrayList<AbstractC0377m>> c0066a2 = new C0066a<>();
            f1015b.set(new WeakReference<>(c0066a2));
            return c0066a2;
        }
        return c0066a;
    }

    /* renamed from: c */
    private static void m8272c(ViewGroup viewGroup, AbstractC0377m abstractC0377m) {
        if (abstractC0377m == null || viewGroup == null) {
            return;
        }
        ViewTreeObserver$OnPreDrawListenerC0387a viewTreeObserver$OnPreDrawListenerC0387a = new ViewTreeObserver$OnPreDrawListenerC0387a(abstractC0377m, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC0387a);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0387a);
    }

    /* renamed from: d */
    private static void m8271d(ViewGroup viewGroup, AbstractC0377m abstractC0377m) {
        ArrayList<AbstractC0377m> arrayList = m8273b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC0377m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8266N(viewGroup);
            }
        }
        if (abstractC0377m != null) {
            abstractC0377m.m8292k(viewGroup, true);
        }
        C0375l m8314b = C0375l.m8314b(viewGroup);
        if (m8314b != null) {
            m8314b.m8315a();
        }
    }
}
