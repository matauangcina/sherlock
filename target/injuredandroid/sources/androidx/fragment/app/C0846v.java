package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p000a.p019g.p024g.C0144b;
/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
class C0846v extends AbstractC0852w {

    /* renamed from: androidx.fragment.app.v$a */
    /* loaded from: classes.dex */
    class C0847a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3067a;

        C0847a(C0846v c0846v, Rect rect) {
            this.f3067a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3067a;
        }
    }

    /* renamed from: androidx.fragment.app.v$b */
    /* loaded from: classes.dex */
    class C0848b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3068a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3069b;

        C0848b(C0846v c0846v, View view, ArrayList arrayList) {
            this.f3068a = view;
            this.f3069b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3068a.setVisibility(8);
            int size = this.f3069b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3069b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.v$c */
    /* loaded from: classes.dex */
    class C0849c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3070a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3071b;

        /* renamed from: c */
        final /* synthetic */ Object f3072c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3073d;

        /* renamed from: e */
        final /* synthetic */ Object f3074e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3075f;

        C0849c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3070a = obj;
            this.f3071b = arrayList;
            this.f3072c = obj2;
            this.f3073d = arrayList2;
            this.f3074e = obj3;
            this.f3075f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3070a;
            if (obj != null) {
                C0846v.this.mo6177q(obj, this.f3071b, null);
            }
            Object obj2 = this.f3072c;
            if (obj2 != null) {
                C0846v.this.mo6177q(obj2, this.f3073d, null);
            }
            Object obj3 = this.f3074e;
            if (obj3 != null) {
                C0846v.this.mo6177q(obj3, this.f3075f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$d */
    /* loaded from: classes.dex */
    class C0850d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3077a;

        C0850d(C0846v c0846v, Runnable runnable) {
            this.f3077a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3077a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.v$e */
    /* loaded from: classes.dex */
    class C0851e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3078a;

        C0851e(C0846v c0846v, Rect rect) {
            this.f3078a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3078a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3078a;
        }
    }

    /* renamed from: C */
    private static boolean m6196C(Transition transition) {
        return (AbstractC0852w.m6182l(transition.getTargetIds()) && AbstractC0852w.m6182l(transition.getTargetNames()) && AbstractC0852w.m6182l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: A */
    public void mo6195A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo6177q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: B */
    public Object mo6194B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: a */
    public void mo6193a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: b */
    public void mo6192b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo6192b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (m6196C(transition) || !AbstractC0852w.m6182l(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: c */
    public void mo6191c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: e */
    public boolean mo6189e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: g */
    public Object mo6187g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: m */
    public Object mo6181m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: n */
    public Object mo6180n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: p */
    public void mo6178p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: q */
    public void mo6177q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo6177q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m6196C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: r */
    public void mo6176r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0848b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: t */
    public void mo6174t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0849c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: u */
    public void mo6173u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0851e(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: v */
    public void mo6172v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m6183k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0847a(this, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: w */
    public void mo6171w(Fragment fragment, Object obj, C0144b c0144b, Runnable runnable) {
        ((Transition) obj).addListener(new C0850d(this, runnable));
    }

    @Override // androidx.fragment.app.AbstractC0852w
    /* renamed from: z */
    public void mo6168z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0852w.m6190d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo6192b(transitionSet, arrayList);
    }
}
