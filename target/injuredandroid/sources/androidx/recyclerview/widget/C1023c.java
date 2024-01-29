package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p019g.p028k.C0252s;
/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C1023c extends AbstractC1054m {

    /* renamed from: s */
    private static TimeInterpolator f3540s;

    /* renamed from: h */
    private ArrayList<RecyclerView.AbstractC0974d0> f3541h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC0974d0> f3542i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C1033j> f3543j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C1032i> f3544k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.AbstractC0974d0>> f3545l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C1033j>> f3546m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C1032i>> f3547n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.AbstractC0974d0> f3548o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC0974d0> f3549p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC0974d0> f3550q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC0974d0> f3551r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class RunnableC1024a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3552f;

        RunnableC1024a(ArrayList arrayList) {
            this.f3552f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3552f.iterator();
            while (it.hasNext()) {
                C1033j c1033j = (C1033j) it.next();
                C1023c.this.m5251S(c1033j.f3586a, c1033j.f3587b, c1033j.f3588c, c1033j.f3589d, c1033j.f3590e);
            }
            this.f3552f.clear();
            C1023c.this.f3546m.remove(this.f3552f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    class RunnableC1025b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3554f;

        RunnableC1025b(ArrayList arrayList) {
            this.f3554f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3554f.iterator();
            while (it.hasNext()) {
                C1023c.this.m5252R((C1032i) it.next());
            }
            this.f3554f.clear();
            C1023c.this.f3547n.remove(this.f3554f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class RunnableC1026c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3556f;

        RunnableC1026c(ArrayList arrayList) {
            this.f3556f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3556f.iterator();
            while (it.hasNext()) {
                C1023c.this.m5253Q((RecyclerView.AbstractC0974d0) it.next());
            }
            this.f3556f.clear();
            C1023c.this.f3545l.remove(this.f3556f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public class C1027d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0974d0 f3558a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3559b;

        /* renamed from: c */
        final /* synthetic */ View f3560c;

        C1027d(RecyclerView.AbstractC0974d0 abstractC0974d0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3558a = abstractC0974d0;
            this.f3559b = viewPropertyAnimator;
            this.f3560c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3559b.setListener(null);
            this.f3560c.setAlpha(1.0f);
            C1023c.this.m5131G(this.f3558a);
            C1023c.this.f3550q.remove(this.f3558a);
            C1023c.this.m5248V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1023c.this.m5130H(this.f3558a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public class C1028e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0974d0 f3562a;

        /* renamed from: b */
        final /* synthetic */ View f3563b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3564c;

        C1028e(RecyclerView.AbstractC0974d0 abstractC0974d0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3562a = abstractC0974d0;
            this.f3563b = view;
            this.f3564c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3563b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3564c.setListener(null);
            C1023c.this.m5137A(this.f3562a);
            C1023c.this.f3548o.remove(this.f3562a);
            C1023c.this.m5248V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1023c.this.m5136B(this.f3562a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public class C1029f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC0974d0 f3566a;

        /* renamed from: b */
        final /* synthetic */ int f3567b;

        /* renamed from: c */
        final /* synthetic */ View f3568c;

        /* renamed from: d */
        final /* synthetic */ int f3569d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3570e;

        C1029f(RecyclerView.AbstractC0974d0 abstractC0974d0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3566a = abstractC0974d0;
            this.f3567b = i;
            this.f3568c = view;
            this.f3569d = i2;
            this.f3570e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3567b != 0) {
                this.f3568c.setTranslationX(0.0f);
            }
            if (this.f3569d != 0) {
                this.f3568c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3570e.setListener(null);
            C1023c.this.m5133E(this.f3566a);
            C1023c.this.f3549p.remove(this.f3566a);
            C1023c.this.m5248V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1023c.this.m5132F(this.f3566a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public class C1030g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1032i f3572a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3573b;

        /* renamed from: c */
        final /* synthetic */ View f3574c;

        C1030g(C1032i c1032i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3572a = c1032i;
            this.f3573b = viewPropertyAnimator;
            this.f3574c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3573b.setListener(null);
            this.f3574c.setAlpha(1.0f);
            this.f3574c.setTranslationX(0.0f);
            this.f3574c.setTranslationY(0.0f);
            C1023c.this.m5135C(this.f3572a.f3580a, true);
            C1023c.this.f3551r.remove(this.f3572a.f3580a);
            C1023c.this.m5248V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1023c.this.m5134D(this.f3572a.f3580a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public class C1031h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1032i f3576a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3577b;

        /* renamed from: c */
        final /* synthetic */ View f3578c;

        C1031h(C1032i c1032i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3576a = c1032i;
            this.f3577b = viewPropertyAnimator;
            this.f3578c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3577b.setListener(null);
            this.f3578c.setAlpha(1.0f);
            this.f3578c.setTranslationX(0.0f);
            this.f3578c.setTranslationY(0.0f);
            C1023c.this.m5135C(this.f3576a.f3581b, false);
            C1023c.this.f3551r.remove(this.f3576a.f3581b);
            C1023c.this.m5248V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1023c.this.m5134D(this.f3576a.f3581b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    public static class C1032i {

        /* renamed from: a */
        public RecyclerView.AbstractC0974d0 f3580a;

        /* renamed from: b */
        public RecyclerView.AbstractC0974d0 f3581b;

        /* renamed from: c */
        public int f3582c;

        /* renamed from: d */
        public int f3583d;

        /* renamed from: e */
        public int f3584e;

        /* renamed from: f */
        public int f3585f;

        private C1032i(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0974d0 abstractC0974d02) {
            this.f3580a = abstractC0974d0;
            this.f3581b = abstractC0974d02;
        }

        C1032i(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0974d0 abstractC0974d02, int i, int i2, int i3, int i4) {
            this(abstractC0974d0, abstractC0974d02);
            this.f3582c = i;
            this.f3583d = i2;
            this.f3584e = i3;
            this.f3585f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3580a + ", newHolder=" + this.f3581b + ", fromX=" + this.f3582c + ", fromY=" + this.f3583d + ", toX=" + this.f3584e + ", toY=" + this.f3585f + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    public static class C1033j {

        /* renamed from: a */
        public RecyclerView.AbstractC0974d0 f3586a;

        /* renamed from: b */
        public int f3587b;

        /* renamed from: c */
        public int f3588c;

        /* renamed from: d */
        public int f3589d;

        /* renamed from: e */
        public int f3590e;

        C1033j(RecyclerView.AbstractC0974d0 abstractC0974d0, int i, int i2, int i3, int i4) {
            this.f3586a = abstractC0974d0;
            this.f3587b = i;
            this.f3588c = i2;
            this.f3589d = i3;
            this.f3590e = i4;
        }
    }

    /* renamed from: T */
    private void m5250T(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        View view = abstractC0974d0.f3376a;
        ViewPropertyAnimator animate = view.animate();
        this.f3550q.add(abstractC0974d0);
        animate.setDuration(m5666o()).alpha(0.0f).setListener(new C1027d(abstractC0974d0, animate, view)).start();
    }

    /* renamed from: W */
    private void m5247W(List<C1032i> list, RecyclerView.AbstractC0974d0 abstractC0974d0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1032i c1032i = list.get(size);
            if (m5245Y(c1032i, abstractC0974d0) && c1032i.f3580a == null && c1032i.f3581b == null) {
                list.remove(c1032i);
            }
        }
    }

    /* renamed from: X */
    private void m5246X(C1032i c1032i) {
        RecyclerView.AbstractC0974d0 abstractC0974d0 = c1032i.f3580a;
        if (abstractC0974d0 != null) {
            m5245Y(c1032i, abstractC0974d0);
        }
        RecyclerView.AbstractC0974d0 abstractC0974d02 = c1032i.f3581b;
        if (abstractC0974d02 != null) {
            m5245Y(c1032i, abstractC0974d02);
        }
    }

    /* renamed from: Y */
    private boolean m5245Y(C1032i c1032i, RecyclerView.AbstractC0974d0 abstractC0974d0) {
        boolean z = false;
        if (c1032i.f3581b == abstractC0974d0) {
            c1032i.f3581b = null;
        } else if (c1032i.f3580a != abstractC0974d0) {
            return false;
        } else {
            c1032i.f3580a = null;
            z = true;
        }
        abstractC0974d0.f3376a.setAlpha(1.0f);
        abstractC0974d0.f3376a.setTranslationX(0.0f);
        abstractC0974d0.f3376a.setTranslationY(0.0f);
        m5135C(abstractC0974d0, z);
        return true;
    }

    /* renamed from: Z */
    private void m5244Z(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        if (f3540s == null) {
            f3540s = new ValueAnimator().getInterpolator();
        }
        abstractC0974d0.f3376a.animate().setInterpolator(f3540s);
        mo5242j(abstractC0974d0);
    }

    /* renamed from: Q */
    void m5253Q(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        View view = abstractC0974d0.f3376a;
        ViewPropertyAnimator animate = view.animate();
        this.f3548o.add(abstractC0974d0);
        animate.alpha(1.0f).setDuration(m5669l()).setListener(new C1028e(abstractC0974d0, view, animate)).start();
    }

    /* renamed from: R */
    void m5252R(C1032i c1032i) {
        RecyclerView.AbstractC0974d0 abstractC0974d0 = c1032i.f3580a;
        View view = abstractC0974d0 == null ? null : abstractC0974d0.f3376a;
        RecyclerView.AbstractC0974d0 abstractC0974d02 = c1032i.f3581b;
        View view2 = abstractC0974d02 != null ? abstractC0974d02.f3376a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m5668m());
            this.f3551r.add(c1032i.f3580a);
            duration.translationX(c1032i.f3584e - c1032i.f3582c);
            duration.translationY(c1032i.f3585f - c1032i.f3583d);
            duration.alpha(0.0f).setListener(new C1030g(c1032i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3551r.add(c1032i.f3581b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m5668m()).alpha(1.0f).setListener(new C1031h(c1032i, animate, view2)).start();
        }
    }

    /* renamed from: S */
    void m5251S(RecyclerView.AbstractC0974d0 abstractC0974d0, int i, int i2, int i3, int i4) {
        View view = abstractC0974d0.f3376a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3549p.add(abstractC0974d0);
        animate.setDuration(m5667n()).setListener(new C1029f(abstractC0974d0, i5, view, i6, animate)).start();
    }

    /* renamed from: U */
    void m5249U(List<RecyclerView.AbstractC0974d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3376a.animate().cancel();
        }
    }

    /* renamed from: V */
    void m5248V() {
        if (mo5240p()) {
            return;
        }
        m5670i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: g */
    public boolean mo5243g(RecyclerView.AbstractC0974d0 abstractC0974d0, List<Object> list) {
        return !list.isEmpty() || super.mo5243g(abstractC0974d0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: j */
    public void mo5242j(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        View view = abstractC0974d0.f3376a;
        view.animate().cancel();
        int size = this.f3543j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3543j.get(size).f3586a == abstractC0974d0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5133E(abstractC0974d0);
                this.f3543j.remove(size);
            }
        }
        m5247W(this.f3544k, abstractC0974d0);
        if (this.f3541h.remove(abstractC0974d0)) {
            view.setAlpha(1.0f);
            m5131G(abstractC0974d0);
        }
        if (this.f3542i.remove(abstractC0974d0)) {
            view.setAlpha(1.0f);
            m5137A(abstractC0974d0);
        }
        for (int size2 = this.f3547n.size() - 1; size2 >= 0; size2--) {
            ArrayList<C1032i> arrayList = this.f3547n.get(size2);
            m5247W(arrayList, abstractC0974d0);
            if (arrayList.isEmpty()) {
                this.f3547n.remove(size2);
            }
        }
        for (int size3 = this.f3546m.size() - 1; size3 >= 0; size3--) {
            ArrayList<C1033j> arrayList2 = this.f3546m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f3586a == abstractC0974d0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5133E(abstractC0974d0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3546m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3545l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0974d0> arrayList3 = this.f3545l.get(size5);
            if (arrayList3.remove(abstractC0974d0)) {
                view.setAlpha(1.0f);
                m5137A(abstractC0974d0);
                if (arrayList3.isEmpty()) {
                    this.f3545l.remove(size5);
                }
            }
        }
        this.f3550q.remove(abstractC0974d0);
        this.f3548o.remove(abstractC0974d0);
        this.f3551r.remove(abstractC0974d0);
        this.f3549p.remove(abstractC0974d0);
        m5248V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: k */
    public void mo5241k() {
        int size = this.f3543j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1033j c1033j = this.f3543j.get(size);
            View view = c1033j.f3586a.f3376a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5133E(c1033j.f3586a);
            this.f3543j.remove(size);
        }
        for (int size2 = this.f3541h.size() - 1; size2 >= 0; size2--) {
            m5131G(this.f3541h.get(size2));
            this.f3541h.remove(size2);
        }
        int size3 = this.f3542i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0974d0 abstractC0974d0 = this.f3542i.get(size3);
            abstractC0974d0.f3376a.setAlpha(1.0f);
            m5137A(abstractC0974d0);
            this.f3542i.remove(size3);
        }
        for (int size4 = this.f3544k.size() - 1; size4 >= 0; size4--) {
            m5246X(this.f3544k.get(size4));
        }
        this.f3544k.clear();
        if (mo5240p()) {
            for (int size5 = this.f3546m.size() - 1; size5 >= 0; size5--) {
                ArrayList<C1033j> arrayList = this.f3546m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1033j c1033j2 = arrayList.get(size6);
                    View view2 = c1033j2.f3586a.f3376a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5133E(c1033j2.f3586a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3546m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3545l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0974d0> arrayList2 = this.f3545l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0974d0 abstractC0974d02 = arrayList2.get(size8);
                    abstractC0974d02.f3376a.setAlpha(1.0f);
                    m5137A(abstractC0974d02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3545l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3547n.size() - 1; size9 >= 0; size9--) {
                ArrayList<C1032i> arrayList3 = this.f3547n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5246X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3547n.remove(arrayList3);
                    }
                }
            }
            m5249U(this.f3550q);
            m5249U(this.f3549p);
            m5249U(this.f3548o);
            m5249U(this.f3551r);
            m5670i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: p */
    public boolean mo5240p() {
        return (this.f3542i.isEmpty() && this.f3544k.isEmpty() && this.f3543j.isEmpty() && this.f3541h.isEmpty() && this.f3549p.isEmpty() && this.f3550q.isEmpty() && this.f3548o.isEmpty() && this.f3551r.isEmpty() && this.f3546m.isEmpty() && this.f3545l.isEmpty() && this.f3547n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0982l
    /* renamed from: u */
    public void mo5239u() {
        boolean z = !this.f3541h.isEmpty();
        boolean z2 = !this.f3543j.isEmpty();
        boolean z3 = !this.f3544k.isEmpty();
        boolean z4 = !this.f3542i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.AbstractC0974d0> it = this.f3541h.iterator();
            while (it.hasNext()) {
                m5250T(it.next());
            }
            this.f3541h.clear();
            if (z2) {
                ArrayList<C1033j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f3543j);
                this.f3546m.add(arrayList);
                this.f3543j.clear();
                RunnableC1024a runnableC1024a = new RunnableC1024a(arrayList);
                if (z) {
                    C0252s.m8637Z(arrayList.get(0).f3586a.f3376a, runnableC1024a, m5666o());
                } else {
                    runnableC1024a.run();
                }
            }
            if (z3) {
                ArrayList<C1032i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3544k);
                this.f3547n.add(arrayList2);
                this.f3544k.clear();
                RunnableC1025b runnableC1025b = new RunnableC1025b(arrayList2);
                if (z) {
                    C0252s.m8637Z(arrayList2.get(0).f3580a.f3376a, runnableC1025b, m5666o());
                } else {
                    runnableC1025b.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.AbstractC0974d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f3542i);
                this.f3545l.add(arrayList3);
                this.f3542i.clear();
                RunnableC1026c runnableC1026c = new RunnableC1026c(arrayList3);
                if (z || z2 || z3) {
                    C0252s.m8637Z(arrayList3.get(0).f3376a, runnableC1026c, (z ? m5666o() : 0L) + Math.max(z2 ? m5667n() : 0L, z3 ? m5668m() : 0L));
                } else {
                    runnableC1026c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1054m
    /* renamed from: w */
    public boolean mo5116w(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5244Z(abstractC0974d0);
        abstractC0974d0.f3376a.setAlpha(0.0f);
        this.f3542i.add(abstractC0974d0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1054m
    /* renamed from: x */
    public boolean mo5115x(RecyclerView.AbstractC0974d0 abstractC0974d0, RecyclerView.AbstractC0974d0 abstractC0974d02, int i, int i2, int i3, int i4) {
        if (abstractC0974d0 == abstractC0974d02) {
            return mo5114y(abstractC0974d0, i, i2, i3, i4);
        }
        float translationX = abstractC0974d0.f3376a.getTranslationX();
        float translationY = abstractC0974d0.f3376a.getTranslationY();
        float alpha = abstractC0974d0.f3376a.getAlpha();
        m5244Z(abstractC0974d0);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC0974d0.f3376a.setTranslationX(translationX);
        abstractC0974d0.f3376a.setTranslationY(translationY);
        abstractC0974d0.f3376a.setAlpha(alpha);
        if (abstractC0974d02 != null) {
            m5244Z(abstractC0974d02);
            abstractC0974d02.f3376a.setTranslationX(-i5);
            abstractC0974d02.f3376a.setTranslationY(-i6);
            abstractC0974d02.f3376a.setAlpha(0.0f);
        }
        this.f3544k.add(new C1032i(abstractC0974d0, abstractC0974d02, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1054m
    /* renamed from: y */
    public boolean mo5114y(RecyclerView.AbstractC0974d0 abstractC0974d0, int i, int i2, int i3, int i4) {
        View view = abstractC0974d0.f3376a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0974d0.f3376a.getTranslationY());
        m5244Z(abstractC0974d0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m5133E(abstractC0974d0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f3543j.add(new C1033j(abstractC0974d0, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1054m
    /* renamed from: z */
    public boolean mo5113z(RecyclerView.AbstractC0974d0 abstractC0974d0) {
        m5244Z(abstractC0974d0);
        this.f3541h.add(abstractC0974d0);
        return true;
    }
}
