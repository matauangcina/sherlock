package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0431b;
import androidx.activity.InterfaceC0432c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C0799e;
import androidx.fragment.app.C0837u;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0894v;
import androidx.lifecycle.InterfaceC0895w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p014d.C0068b;
import p000a.p019g.p024g.C0144b;
import p000a.p019g.p027j.C0188c;
import p000a.p035j.C0296b;
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public abstract class AbstractC0814m {

    /* renamed from: F */
    private static boolean f2922F = false;

    /* renamed from: A */
    private ArrayList<Boolean> f2923A;

    /* renamed from: B */
    private ArrayList<Fragment> f2924B;

    /* renamed from: C */
    private ArrayList<C0824j> f2925C;

    /* renamed from: D */
    private C0828p f2926D;

    /* renamed from: b */
    private boolean f2929b;

    /* renamed from: d */
    ArrayList<C0790a> f2931d;

    /* renamed from: e */
    private ArrayList<Fragment> f2932e;

    /* renamed from: g */
    private OnBackPressedDispatcher f2934g;

    /* renamed from: j */
    private ArrayList<InterfaceC0821g> f2937j;

    /* renamed from: o */
    AbstractC0810j<?> f2942o;

    /* renamed from: p */
    AbstractC0806f f2943p;

    /* renamed from: q */
    private Fragment f2944q;

    /* renamed from: r */
    Fragment f2945r;

    /* renamed from: u */
    private boolean f2948u;

    /* renamed from: v */
    private boolean f2949v;

    /* renamed from: w */
    private boolean f2950w;

    /* renamed from: x */
    private boolean f2951x;

    /* renamed from: y */
    private boolean f2952y;

    /* renamed from: z */
    private ArrayList<C0790a> f2953z;

    /* renamed from: a */
    private final ArrayList<InterfaceC0822h> f2928a = new ArrayList<>();

    /* renamed from: c */
    private final C0834s f2930c = new C0834s();

    /* renamed from: f */
    private final LayoutInflater$Factory2C0811k f2933f = new LayoutInflater$Factory2C0811k(this);

    /* renamed from: h */
    private final AbstractC0431b f2935h = new C0815a(false);

    /* renamed from: i */
    private final AtomicInteger f2936i = new AtomicInteger();

    /* renamed from: k */
    private ConcurrentHashMap<Fragment, HashSet<C0144b>> f2938k = new ConcurrentHashMap<>();

    /* renamed from: l */
    private final C0837u.InterfaceC0844g f2939l = new C0816b();

    /* renamed from: m */
    private final C0812l f2940m = new C0812l(this);

    /* renamed from: n */
    int f2941n = -1;

    /* renamed from: s */
    private C0809i f2946s = null;

    /* renamed from: t */
    private C0809i f2947t = new C0817c();

    /* renamed from: E */
    private Runnable f2927E = new RunnableC0818d();

    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    class C0815a extends AbstractC0431b {
        C0815a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.AbstractC0431b
        /* renamed from: b */
        public void mo6055b() {
            AbstractC0814m.this.m6348m0();
        }
    }

    /* renamed from: androidx.fragment.app.m$b */
    /* loaded from: classes.dex */
    class C0816b implements C0837u.InterfaceC0844g {
        C0816b() {
        }

        @Override // androidx.fragment.app.C0837u.InterfaceC0844g
        /* renamed from: a */
        public void mo6198a(Fragment fragment, C0144b c0144b) {
            if (c0144b.m8968b()) {
                return;
            }
            AbstractC0814m.this.m6405J0(fragment, c0144b);
        }

        @Override // androidx.fragment.app.C0837u.InterfaceC0844g
        /* renamed from: b */
        public void mo6197b(Fragment fragment, C0144b c0144b) {
            AbstractC0814m.this.m6369c(fragment, c0144b);
        }
    }

    /* renamed from: androidx.fragment.app.m$c */
    /* loaded from: classes.dex */
    class C0817c extends C0809i {
        C0817c() {
        }

        @Override // androidx.fragment.app.C0809i
        /* renamed from: a */
        public Fragment mo6321a(ClassLoader classLoader, String str) {
            AbstractC0810j<?> abstractC0810j = AbstractC0814m.this.f2942o;
            return abstractC0810j.m6478b(abstractC0810j.m6445g(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.m$d */
    /* loaded from: classes.dex */
    class RunnableC0818d implements Runnable {
        RunnableC0818d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0814m.this.m6392Q(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$e */
    /* loaded from: classes.dex */
    public class C0819e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2958a;

        /* renamed from: b */
        final /* synthetic */ View f2959b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2960c;

        C0819e(AbstractC0814m abstractC0814m, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2958a = viewGroup;
            this.f2959b = view;
            this.f2960c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2958a.endViewTransition(this.f2959b);
            animator.removeListener(this);
            Fragment fragment = this.f2960c;
            View view = fragment.f2789L;
            if (view == null || !fragment.f2781D) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* renamed from: androidx.fragment.app.m$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0820f {
        /* renamed from: a */
        public abstract void m6320a(AbstractC0814m abstractC0814m, Fragment fragment, Bundle bundle);

        /* renamed from: b */
        public abstract void m6319b(AbstractC0814m abstractC0814m, Fragment fragment, Context context);

        /* renamed from: c */
        public abstract void m6318c(AbstractC0814m abstractC0814m, Fragment fragment, Bundle bundle);

        /* renamed from: d */
        public abstract void m6317d(AbstractC0814m abstractC0814m, Fragment fragment);

        /* renamed from: e */
        public abstract void m6316e(AbstractC0814m abstractC0814m, Fragment fragment);

        /* renamed from: f */
        public abstract void m6315f(AbstractC0814m abstractC0814m, Fragment fragment);

        /* renamed from: g */
        public abstract void m6314g(AbstractC0814m abstractC0814m, Fragment fragment, Context context);

        /* renamed from: h */
        public abstract void m6313h(AbstractC0814m abstractC0814m, Fragment fragment, Bundle bundle);

        /* renamed from: i */
        public abstract void m6312i(AbstractC0814m abstractC0814m, Fragment fragment);

        /* renamed from: j */
        public abstract void m6311j(AbstractC0814m abstractC0814m, Fragment fragment, Bundle bundle);

        /* renamed from: k */
        public abstract void m6310k(AbstractC0814m abstractC0814m, Fragment fragment);

        /* renamed from: l */
        public abstract void m6309l(AbstractC0814m abstractC0814m, Fragment fragment);

        /* renamed from: m */
        public abstract void m6308m(AbstractC0814m abstractC0814m, Fragment fragment, View view, Bundle bundle);

        /* renamed from: n */
        public abstract void m6307n(AbstractC0814m abstractC0814m, Fragment fragment);
    }

    /* renamed from: androidx.fragment.app.m$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0821g {
        /* renamed from: a */
        void m6306a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$h */
    /* loaded from: classes.dex */
    public interface InterfaceC0822h {
        /* renamed from: a */
        boolean mo6305a(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.m$i */
    /* loaded from: classes.dex */
    private class C0823i implements InterfaceC0822h {

        /* renamed from: a */
        final String f2961a;

        /* renamed from: b */
        final int f2962b;

        /* renamed from: c */
        final int f2963c;

        C0823i(String str, int i, int i2) {
            this.f2961a = str;
            this.f2962b = i;
            this.f2963c = i2;
        }

        @Override // androidx.fragment.app.AbstractC0814m.InterfaceC0822h
        /* renamed from: a */
        public boolean mo6305a(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = AbstractC0814m.this.f2945r;
            if (fragment == null || this.f2962b >= 0 || this.f2961a != null || !fragment.m6540q().m6413F0()) {
                return AbstractC0814m.this.m6409H0(arrayList, arrayList2, this.f2961a, this.f2962b, this.f2963c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$j */
    /* loaded from: classes.dex */
    public static class C0824j implements Fragment.InterfaceC0789e {

        /* renamed from: a */
        final boolean f2965a;

        /* renamed from: b */
        final C0790a f2966b;

        /* renamed from: c */
        private int f2967c;

        C0824j(C0790a c0790a, boolean z) {
            this.f2965a = z;
            this.f2966b = c0790a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0789e
        /* renamed from: a */
        public void mo6304a() {
            int i = this.f2967c - 1;
            this.f2967c = i;
            if (i != 0) {
                return;
            }
            this.f2966b.f2846r.m6389R0();
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0789e
        /* renamed from: b */
        public void mo6303b() {
            this.f2967c++;
        }

        /* renamed from: c */
        void m6302c() {
            C0790a c0790a = this.f2966b;
            c0790a.f2846r.m6347n(c0790a, this.f2965a, false, false);
        }

        /* renamed from: d */
        void m6301d() {
            boolean z = this.f2967c > 0;
            for (Fragment fragment : this.f2966b.f2846r.m6362f0()) {
                fragment.m6547n1(null);
                if (z && fragment.m6585T()) {
                    fragment.m6541p1();
                }
            }
            C0790a c0790a = this.f2966b;
            c0790a.f2846r.m6347n(c0790a, this.f2965a, !z, true);
        }

        /* renamed from: e */
        public boolean m6300e() {
            return this.f2967c == 0;
        }
    }

    /* renamed from: C */
    private void m6420C(Fragment fragment) {
        if (fragment == null || !fragment.equals(m6382V(fragment.f2808j))) {
            return;
        }
        fragment.m6576X0();
    }

    /* renamed from: G0 */
    private boolean m6411G0(String str, int i, int i2) {
        m6392Q(false);
        m6394P(true);
        Fragment fragment = this.f2945r;
        if (fragment == null || i >= 0 || str != null || !fragment.m6540q().m6413F0()) {
            boolean m6409H0 = m6409H0(this.f2953z, this.f2923A, str, i, i2);
            if (m6409H0) {
                this.f2929b = true;
                try {
                    m6401L0(this.f2953z, this.f2923A);
                } finally {
                    m6349m();
                }
            }
            m6375Y0();
            m6402L();
            this.f2930c.m6265b();
            return m6409H0;
        }
        return true;
    }

    /* renamed from: I0 */
    private int m6407I0(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0068b<Fragment> c0068b) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0790a c0790a = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (c0790a.m6519E() && !c0790a.m6521C(arrayList, i4 + 1, i2)) {
                if (this.f2925C == null) {
                    this.f2925C = new ArrayList<>();
                }
                C0824j c0824j = new C0824j(c0790a, booleanValue);
                this.f2925C.add(c0824j);
                c0790a.m6517G(c0824j);
                if (booleanValue) {
                    c0790a.m6511x();
                } else {
                    c0790a.m6510y(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c0790a);
                }
                m6373a(c0068b);
            }
        }
        return i3;
    }

    /* renamed from: J */
    private void m6406J(int i) {
        try {
            this.f2929b = true;
            this.f2930c.m6263d(i);
            m6324y0(i, false);
            this.f2929b = false;
            m6392Q(true);
        } catch (Throwable th) {
            this.f2929b = false;
            throw th;
        }
    }

    /* renamed from: L */
    private void m6402L() {
        if (this.f2952y) {
            this.f2952y = false;
            m6377X0();
        }
    }

    /* renamed from: L0 */
    private void m6401L0(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m6384U(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f3014p) {
                if (i2 != i) {
                    m6386T(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f3014p) {
                        i2++;
                    }
                }
                m6386T(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m6386T(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: N */
    private void m6398N() {
        if (this.f2938k.isEmpty()) {
            return;
        }
        for (Fragment fragment : this.f2938k.keySet()) {
            m6355j(fragment);
            m6423A0(fragment, fragment.m6605J());
        }
    }

    /* renamed from: N0 */
    private void m6397N0() {
        if (this.f2937j != null) {
            for (int i = 0; i < this.f2937j.size(); i++) {
                this.f2937j.get(i).m6306a();
            }
        }
    }

    /* renamed from: P */
    private void m6394P(boolean z) {
        if (this.f2929b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2942o == null) {
            if (!this.f2951x) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else if (Looper.myLooper() != this.f2942o.m6444h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m6351l();
            }
            if (this.f2953z == null) {
                this.f2953z = new ArrayList<>();
                this.f2923A = new ArrayList<>();
            }
            this.f2929b = true;
            try {
                m6384U(null, null);
            } finally {
                this.f2929b = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public static int m6393P0(int i) {
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    /* renamed from: S */
    private static void m6388S(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0790a c0790a = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c0790a.m6515t(-1);
                c0790a.m6510y(i == i2 + (-1));
            } else {
                c0790a.m6515t(1);
                c0790a.m6511x();
            }
            i++;
        }
    }

    /* renamed from: T */
    private void m6386T(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z = arrayList.get(i4).f3014p;
        ArrayList<Fragment> arrayList3 = this.f2924B;
        if (arrayList3 == null) {
            this.f2924B = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f2924B.addAll(this.f2930c.m6254m());
        Fragment m6354j0 = m6354j0();
        boolean z2 = false;
        for (int i5 = i4; i5 < i2; i5++) {
            C0790a c0790a = arrayList.get(i5);
            m6354j0 = !arrayList2.get(i5).booleanValue() ? c0790a.m6509z(this.f2924B, m6354j0) : c0790a.m6516H(this.f2924B, m6354j0);
            z2 = z2 || c0790a.f3005g;
        }
        this.f2924B.clear();
        if (!z) {
            C0837u.m6226C(this, arrayList, arrayList2, i, i2, false, this.f2939l);
        }
        m6388S(arrayList, arrayList2, i, i2);
        if (z) {
            C0068b<Fragment> c0068b = new C0068b<>();
            m6373a(c0068b);
            int m6407I0 = m6407I0(arrayList, arrayList2, i, i2, c0068b);
            m6328w0(c0068b);
            i3 = m6407I0;
        } else {
            i3 = i2;
        }
        if (i3 != i4 && z) {
            C0837u.m6226C(this, arrayList, arrayList2, i, i3, true, this.f2939l);
            m6324y0(this.f2941n, true);
        }
        while (i4 < i2) {
            C0790a c0790a2 = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue() && c0790a2.f2848t >= 0) {
                c0790a2.f2848t = -1;
            }
            c0790a2.m6518F();
            i4++;
        }
        if (z2) {
            m6397N0();
        }
    }

    /* renamed from: U */
    private void m6384U(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0824j> arrayList3 = this.f2925C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0824j c0824j = this.f2925C.get(i);
            if (arrayList == null || c0824j.f2965a || (indexOf2 = arrayList.indexOf(c0824j.f2966b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (c0824j.m6300e() || (arrayList != null && c0824j.f2966b.m6521C(arrayList, 0, arrayList.size()))) {
                    this.f2925C.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || c0824j.f2965a || (indexOf = arrayList.indexOf(c0824j.f2966b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        c0824j.m6301d();
                    }
                }
                i++;
            } else {
                this.f2925C.remove(i);
                i--;
                size--;
            }
            c0824j.m6302c();
            i++;
        }
    }

    /* renamed from: V0 */
    private void m6381V0(Fragment fragment) {
        ViewGroup m6366d0 = m6366d0(fragment);
        if (m6366d0 != null) {
            if (m6366d0.getTag(C0296b.visible_removing_fragment_view_tag) == null) {
                m6366d0.setTag(C0296b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) m6366d0.getTag(C0296b.visible_removing_fragment_view_tag)).m6551l1(fragment.m6524z());
        }
    }

    /* renamed from: X0 */
    private void m6377X0() {
        for (Fragment fragment : this.f2930c.m6256k()) {
            if (fragment != null) {
                m6419C0(fragment);
            }
        }
    }

    /* renamed from: Y0 */
    private void m6375Y0() {
        synchronized (this.f2928a) {
            boolean z = true;
            if (this.f2928a.isEmpty()) {
                this.f2935h.m8128f((m6370b0() <= 0 || !m6338r0(this.f2944q)) ? false : false);
            } else {
                this.f2935h.m8128f(true);
            }
        }
    }

    /* renamed from: Z */
    private void m6374Z() {
        if (this.f2925C != null) {
            while (!this.f2925C.isEmpty()) {
                this.f2925C.remove(0).m6301d();
            }
        }
    }

    /* renamed from: a */
    private void m6373a(C0068b<Fragment> c0068b) {
        int i = this.f2941n;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 3);
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment.f2804f < min) {
                m6423A0(fragment, min);
                if (fragment.f2789L != null && !fragment.f2781D && fragment.f2793P) {
                    c0068b.add(fragment);
                }
            }
        }
    }

    /* renamed from: a0 */
    private boolean m6372a0(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2928a) {
            if (this.f2928a.isEmpty()) {
                return false;
            }
            int size = this.f2928a.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.f2928a.get(i).mo6305a(arrayList, arrayList2);
            }
            this.f2928a.clear();
            this.f2942o.m6444h().removeCallbacks(this.f2927E);
            return z;
        }
    }

    /* renamed from: c0 */
    private C0828p m6368c0(Fragment fragment) {
        return this.f2926D.m6294h(fragment);
    }

    /* renamed from: d0 */
    private ViewGroup m6366d0(Fragment fragment) {
        if (fragment.f2779B > 0 && this.f2943p.mo6447d()) {
            View mo6448c = this.f2943p.mo6448c(fragment.f2779B);
            if (mo6448c instanceof ViewGroup) {
                return (ViewGroup) mo6448c;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m6355j(Fragment fragment) {
        HashSet<C0144b> hashSet = this.f2938k.get(fragment);
        if (hashSet != null) {
            Iterator<C0144b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m8969a();
            }
            hashSet.clear();
            m6343p(fragment);
            this.f2938k.remove(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public static Fragment m6352k0(View view) {
        Object tag = view.getTag(C0296b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: l */
    private void m6351l() {
        if (m6334t0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: m */
    private void m6349m() {
        this.f2929b = false;
        this.f2923A.clear();
        this.f2953z.clear();
    }

    /* renamed from: o */
    private void m6345o(Fragment fragment) {
        Animator animator;
        if (fragment.f2789L != null) {
            C0799e.C0804d m6481b = C0799e.m6481b(this.f2942o.m6445g(), this.f2943p, fragment, !fragment.f2781D);
            if (m6481b == null || (animator = m6481b.f2902b) == null) {
                if (m6481b != null) {
                    fragment.f2789L.startAnimation(m6481b.f2901a);
                    m6481b.f2901a.start();
                }
                fragment.f2789L.setVisibility((!fragment.f2781D || fragment.m6589R()) ? 0 : 8);
                if (fragment.m6589R()) {
                    fragment.m6553k1(false);
                }
            } else {
                animator.setTarget(fragment.f2789L);
                if (!fragment.f2781D) {
                    fragment.f2789L.setVisibility(0);
                } else if (fragment.m6589R()) {
                    fragment.m6553k1(false);
                } else {
                    ViewGroup viewGroup = fragment.f2788K;
                    View view = fragment.f2789L;
                    viewGroup.startViewTransition(view);
                    m6481b.f2902b.addListener(new C0819e(this, viewGroup, view, fragment));
                }
                m6481b.f2902b.start();
            }
        }
        if (fragment.f2814p && m6340q0(fragment)) {
            this.f2948u = true;
        }
        fragment.f2794Q = false;
        fragment.m6545o0(fragment.f2781D);
    }

    /* renamed from: p */
    private void m6343p(Fragment fragment) {
        fragment.m6596N0();
        this.f2940m.m6425n(fragment, false);
        fragment.f2788K = null;
        fragment.f2789L = null;
        fragment.f2800W = null;
        fragment.f2801X.mo6098j(null);
        fragment.f2817s = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public static boolean m6342p0(int i) {
        return f2922F || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: q0 */
    private boolean m6340q0(Fragment fragment) {
        return (fragment.f2785H && fragment.f2786I) || fragment.f2823y.m6353k();
    }

    /* renamed from: v0 */
    private void m6330v0(C0832r c0832r) {
        Fragment m6277i = c0832r.m6277i();
        if (this.f2930c.m6264c(m6277i.f2808j)) {
            if (m6342p0(2)) {
                Log.v("FragmentManager", "Removed fragment from active set " + m6277i);
            }
            this.f2930c.m6252o(c0832r);
            m6399M0(m6277i);
        }
    }

    /* renamed from: w0 */
    private void m6328w0(C0068b<Fragment> c0068b) {
        int size = c0068b.size();
        for (int i = 0; i < size; i++) {
            Fragment m9390s = c0068b.m9390s(i);
            if (!m9390s.f2814p) {
                View m6566e1 = m9390s.m6566e1();
                m9390s.f2795R = m6566e1.getAlpha();
                m6566e1.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m6424A(MenuItem menuItem) {
        if (this.f2941n < 1) {
            return false;
        }
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null && fragment.m6586S0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r2 != 3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6423A0(androidx.fragment.app.Fragment r13, int r14) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.AbstractC0814m.m6423A0(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m6422B(Menu menu) {
        if (this.f2941n < 1) {
            return;
        }
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null) {
                fragment.m6584T0(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void m6421B0() {
        if (this.f2942o == null) {
            return;
        }
        this.f2949v = false;
        this.f2950w = false;
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null) {
                fragment.m6577X();
            }
        }
    }

    /* renamed from: C0 */
    void m6419C0(Fragment fragment) {
        if (fragment.f2790M) {
            if (this.f2929b) {
                this.f2952y = true;
                return;
            }
            fragment.f2790M = false;
            m6423A0(fragment, this.f2941n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m6418D() {
        m6406J(3);
    }

    /* renamed from: D0 */
    public void m6417D0(int i, int i2) {
        if (i >= 0) {
            m6396O(new C0823i(null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m6416E(boolean z) {
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null) {
                fragment.m6580V0(z);
            }
        }
    }

    /* renamed from: E0 */
    public void m6415E0(String str, int i) {
        m6396O(new C0823i(str, -1, i), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean m6414F(Menu menu) {
        boolean z = false;
        if (this.f2941n < 1) {
            return false;
        }
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null && fragment.m6578W0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F0 */
    public boolean m6413F0() {
        return m6411G0(null, -1, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m6412G() {
        m6375Y0();
        m6420C(this.f2945r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m6410H() {
        this.f2949v = false;
        this.f2950w = false;
        m6406J(4);
    }

    /* renamed from: H0 */
    boolean m6409H0(ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0790a> arrayList3 = this.f2931d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2931d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f2931d.size() - 1;
                while (size2 >= 0) {
                    C0790a c0790a = this.f2931d.get(size2);
                    if ((str != null && str.equals(c0790a.m6523A())) || (i >= 0 && i == c0790a.f2848t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0790a c0790a2 = this.f2931d.get(size2);
                        if (str == null || !str.equals(c0790a2.m6523A())) {
                            if (i < 0 || i != c0790a2.f2848t) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f2931d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2931d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2931d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m6408I() {
        this.f2949v = false;
        this.f2950w = false;
        m6406J(3);
    }

    /* renamed from: J0 */
    void m6405J0(Fragment fragment, C0144b c0144b) {
        HashSet<C0144b> hashSet = this.f2938k.get(fragment);
        if (hashSet != null && hashSet.remove(c0144b) && hashSet.isEmpty()) {
            this.f2938k.remove(fragment);
            if (fragment.f2804f < 3) {
                m6343p(fragment);
                m6423A0(fragment, fragment.m6605J());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m6404K() {
        this.f2950w = true;
        m6406J(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void m6403K0(Fragment fragment) {
        if (m6342p0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2820v);
        }
        boolean z = !fragment.m6587S();
        if (!fragment.f2782E || z) {
            this.f2930c.m6251p(fragment);
            if (m6340q0(fragment)) {
                this.f2948u = true;
            }
            fragment.f2815q = true;
            m6381V0(fragment);
        }
    }

    /* renamed from: M */
    public void m6400M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2930c.m6262e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2932e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f2932e.get(i).toString());
            }
        }
        ArrayList<C0790a> arrayList2 = this.f2931d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0790a c0790a = this.f2931d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c0790a.toString());
                c0790a.m6513v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2936i.get());
        synchronized (this.f2928a) {
            int size3 = this.f2928a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.f2928a.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2942o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2943p);
        if (this.f2944q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2944q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2941n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2949v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2950w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2951x);
        if (this.f2948u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2948u);
        }
    }

    /* renamed from: M0 */
    void m6399M0(Fragment fragment) {
        if (m6334t0()) {
            if (m6342p0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f2926D.m6289m(fragment) && m6342p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m6396O(InterfaceC0822h interfaceC0822h, boolean z) {
        if (!z) {
            if (this.f2942o == null) {
                if (!this.f2951x) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m6351l();
        }
        synchronized (this.f2928a) {
            if (this.f2942o == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f2928a.add(interfaceC0822h);
            m6389R0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m6395O0(Parcelable parcelable) {
        C0832r c0832r;
        if (parcelable == null) {
            return;
        }
        C0826o c0826o = (C0826o) parcelable;
        if (c0826o.f2968f == null) {
            return;
        }
        this.f2930c.m6250q();
        Iterator<C0830q> it = c0826o.f2968f.iterator();
        while (it.hasNext()) {
            C0830q next = it.next();
            if (next != null) {
                Fragment m6295g = this.f2926D.m6295g(next.f2981g);
                if (m6295g != null) {
                    if (m6342p0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m6295g);
                    }
                    c0832r = new C0832r(this.f2940m, m6295g, next);
                } else {
                    c0832r = new C0832r(this.f2940m, this.f2942o.m6445g().getClassLoader(), m6364e0(), next);
                }
                Fragment m6277i = c0832r.m6277i();
                m6277i.f2821w = this;
                if (m6342p0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m6277i.f2808j + "): " + m6277i);
                }
                c0832r.m6275k(this.f2942o.m6445g().getClassLoader());
                this.f2930c.m6253n(c0832r);
                c0832r.m6269q(this.f2941n);
            }
        }
        for (Fragment fragment : this.f2926D.m6292j()) {
            if (!this.f2930c.m6264c(fragment.f2808j)) {
                if (m6342p0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + c0826o.f2968f);
                }
                m6423A0(fragment, 1);
                fragment.f2815q = true;
                m6423A0(fragment, -1);
            }
        }
        this.f2930c.m6249r(c0826o.f2969g);
        if (c0826o.f2970h != null) {
            this.f2931d = new ArrayList<>(c0826o.f2970h.length);
            int i = 0;
            while (true) {
                C0791b[] c0791bArr = c0826o.f2970h;
                if (i >= c0791bArr.length) {
                    break;
                }
                C0790a m6508a = c0791bArr[i].m6508a(this);
                if (m6342p0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + m6508a.f2848t + "): " + m6508a);
                    PrintWriter printWriter = new PrintWriter(new C0188c("FragmentManager"));
                    m6508a.m6512w("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2931d.add(m6508a);
                i++;
            }
        } else {
            this.f2931d = null;
        }
        this.f2936i.set(c0826o.f2971i);
        String str = c0826o.f2972j;
        if (str != null) {
            Fragment m6382V = m6382V(str);
            this.f2945r = m6382V;
            m6420C(m6382V);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public boolean m6392Q(boolean z) {
        m6394P(z);
        boolean z2 = false;
        while (m6372a0(this.f2953z, this.f2923A)) {
            this.f2929b = true;
            try {
                m6401L0(this.f2953z, this.f2923A);
                m6349m();
                z2 = true;
            } catch (Throwable th) {
                m6349m();
                throw th;
            }
        }
        m6375Y0();
        m6402L();
        this.f2930c.m6265b();
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public Parcelable m6391Q0() {
        int size;
        m6374Z();
        m6398N();
        m6392Q(true);
        this.f2949v = true;
        ArrayList<C0830q> m6248s = this.f2930c.m6248s();
        C0791b[] c0791bArr = null;
        if (m6248s.isEmpty()) {
            if (m6342p0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> m6247t = this.f2930c.m6247t();
        ArrayList<C0790a> arrayList = this.f2931d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c0791bArr = new C0791b[size];
            for (int i = 0; i < size; i++) {
                c0791bArr[i] = new C0791b(this.f2931d.get(i));
                if (m6342p0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f2931d.get(i));
                }
            }
        }
        C0826o c0826o = new C0826o();
        c0826o.f2968f = m6248s;
        c0826o.f2969g = m6247t;
        c0826o.f2970h = c0791bArr;
        c0826o.f2971i = this.f2936i.get();
        Fragment fragment = this.f2945r;
        if (fragment != null) {
            c0826o.f2972j = fragment.f2808j;
        }
        return c0826o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m6390R(InterfaceC0822h interfaceC0822h, boolean z) {
        if (z && (this.f2942o == null || this.f2951x)) {
            return;
        }
        m6394P(z);
        if (interfaceC0822h.mo6305a(this.f2953z, this.f2923A)) {
            this.f2929b = true;
            try {
                m6401L0(this.f2953z, this.f2923A);
            } finally {
                m6349m();
            }
        }
        m6375Y0();
        m6402L();
        this.f2930c.m6265b();
    }

    /* renamed from: R0 */
    void m6389R0() {
        synchronized (this.f2928a) {
            boolean z = (this.f2925C == null || this.f2925C.isEmpty()) ? false : true;
            boolean z2 = this.f2928a.size() == 1;
            if (z || z2) {
                this.f2942o.m6444h().removeCallbacks(this.f2927E);
                this.f2942o.m6444h().post(this.f2927E);
                m6375Y0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void m6387S0(Fragment fragment, boolean z) {
        ViewGroup m6366d0 = m6366d0(fragment);
        if (m6366d0 == null || !(m6366d0 instanceof C0807g)) {
            return;
        }
        ((C0807g) m6366d0).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m6385T0(Fragment fragment, AbstractC0868e.EnumC0870b enumC0870b) {
        if (fragment.equals(m6382V(fragment.f2808j)) && (fragment.f2822x == null || fragment.f2821w == this)) {
            fragment.f2798U = enumC0870b;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m6383U0(Fragment fragment) {
        if (fragment == null || (fragment.equals(m6382V(fragment.f2808j)) && (fragment.f2822x == null || fragment.f2821w == this))) {
            Fragment fragment2 = this.f2945r;
            this.f2945r = fragment;
            m6420C(fragment2);
            m6420C(this.f2945r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public Fragment m6382V(String str) {
        return this.f2930c.m6261f(str);
    }

    /* renamed from: W */
    public Fragment m6380W(int i) {
        return this.f2930c.m6260g(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void m6379W0(Fragment fragment) {
        if (m6342p0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2781D) {
            fragment.f2781D = false;
            fragment.f2794Q = !fragment.f2794Q;
        }
    }

    /* renamed from: X */
    public Fragment m6378X(String str) {
        return this.f2930c.m6259h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public Fragment m6376Y(String str) {
        return this.f2930c.m6258i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6371b(C0790a c0790a) {
        if (this.f2931d == null) {
            this.f2931d = new ArrayList<>();
        }
        this.f2931d.add(c0790a);
    }

    /* renamed from: b0 */
    public int m6370b0() {
        ArrayList<C0790a> arrayList = this.f2931d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: c */
    void m6369c(Fragment fragment, C0144b c0144b) {
        if (this.f2938k.get(fragment) == null) {
            this.f2938k.put(fragment, new HashSet<>());
        }
        this.f2938k.get(fragment).add(c0144b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6367d(Fragment fragment) {
        if (m6342p0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m6332u0(fragment);
        if (fragment.f2782E) {
            return;
        }
        this.f2930c.m6266a(fragment);
        fragment.f2815q = false;
        if (fragment.f2789L == null) {
            fragment.f2794Q = false;
        }
        if (m6340q0(fragment)) {
            this.f2948u = true;
        }
    }

    /* renamed from: e */
    void m6365e(Fragment fragment) {
        if (m6334t0()) {
            if (m6342p0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f2926D.m6297e(fragment) && m6342p0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    /* renamed from: e0 */
    public C0809i m6364e0() {
        C0809i c0809i = this.f2946s;
        if (c0809i != null) {
            return c0809i;
        }
        Fragment fragment = this.f2944q;
        return fragment != null ? fragment.f2821w.m6364e0() : this.f2947t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m6363f() {
        return this.f2936i.getAndIncrement();
    }

    /* renamed from: f0 */
    public List<Fragment> m6362f0() {
        return this.f2930c.m6254m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public void m6361g(AbstractC0810j<?> abstractC0810j, AbstractC0806f abstractC0806f, Fragment fragment) {
        if (this.f2942o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2942o = abstractC0810j;
        this.f2943p = abstractC0806f;
        this.f2944q = fragment;
        if (fragment != null) {
            m6375Y0();
        }
        if (abstractC0810j instanceof InterfaceC0432c) {
            InterfaceC0432c interfaceC0432c = (InterfaceC0432c) abstractC0810j;
            this.f2934g = interfaceC0432c.mo6484i();
            Fragment fragment2 = interfaceC0432c;
            if (fragment != null) {
                fragment2 = fragment;
            }
            this.f2934g.m8135a(fragment2, this.f2935h);
        }
        this.f2926D = fragment != null ? fragment.f2821w.m6368c0(fragment) : abstractC0810j instanceof InterfaceC0895w ? C0828p.m6293i(((InterfaceC0895w) abstractC0810j).mo6025f()) : new C0828p(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public LayoutInflater.Factory2 m6360g0() {
        return this.f2933f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6359h(Fragment fragment) {
        if (m6342p0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2782E) {
            fragment.f2782E = false;
            if (fragment.f2814p) {
                return;
            }
            this.f2930c.m6266a(fragment);
            if (m6342p0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (m6340q0(fragment)) {
                this.f2948u = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public C0812l m6358h0() {
        return this.f2940m;
    }

    /* renamed from: i */
    public AbstractC0835t m6357i() {
        return new C0790a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public Fragment m6356i0() {
        return this.f2944q;
    }

    /* renamed from: j0 */
    public Fragment m6354j0() {
        return this.f2945r;
    }

    /* renamed from: k */
    boolean m6353k() {
        boolean z = false;
        for (Fragment fragment : this.f2930c.m6256k()) {
            if (fragment != null) {
                z = m6340q0(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public C0894v m6350l0(Fragment fragment) {
        return this.f2926D.m6291k(fragment);
    }

    /* renamed from: m0 */
    void m6348m0() {
        m6392Q(true);
        if (this.f2935h.m8131c()) {
            m6413F0();
        } else {
            this.f2934g.m8133c();
        }
    }

    /* renamed from: n */
    void m6347n(C0790a c0790a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0790a.m6510y(z3);
        } else {
            c0790a.m6511x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0790a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0837u.m6226C(this, arrayList, arrayList2, 0, 1, true, this.f2939l);
        }
        if (z3) {
            m6324y0(this.f2941n, true);
        }
        for (Fragment fragment : this.f2930c.m6256k()) {
            if (fragment != null && fragment.f2789L != null && fragment.f2793P && c0790a.m6522B(fragment.f2779B)) {
                float f = fragment.f2795R;
                if (f > 0.0f) {
                    fragment.f2789L.setAlpha(f);
                }
                if (z3) {
                    fragment.f2795R = 0.0f;
                } else {
                    fragment.f2795R = -1.0f;
                    fragment.f2793P = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void m6346n0(Fragment fragment) {
        if (m6342p0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f2781D) {
            return;
        }
        fragment.f2781D = true;
        fragment.f2794Q = true ^ fragment.f2794Q;
        m6381V0(fragment);
    }

    /* renamed from: o0 */
    public boolean m6344o0() {
        return this.f2951x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m6341q(Fragment fragment) {
        if (m6342p0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f2782E) {
            return;
        }
        fragment.f2782E = true;
        if (fragment.f2814p) {
            if (m6342p0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2930c.m6251p(fragment);
            if (m6340q0(fragment)) {
                this.f2948u = true;
            }
            m6381V0(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m6339r() {
        this.f2949v = false;
        this.f2950w = false;
        m6406J(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean m6338r0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        AbstractC0814m abstractC0814m = fragment.f2821w;
        return fragment.equals(abstractC0814m.m6354j0()) && m6338r0(abstractC0814m.f2944q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m6337s(Configuration configuration) {
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null) {
                fragment.m6608H0(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean m6336s0(int i) {
        return this.f2941n >= i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m6335t(MenuItem menuItem) {
        if (this.f2941n < 1) {
            return false;
        }
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null && fragment.m6606I0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t0 */
    public boolean m6334t0() {
        return this.f2949v || this.f2950w;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2944q;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2944q;
        } else {
            AbstractC0810j<?> abstractC0810j = this.f2942o;
            if (abstractC0810j == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(abstractC0810j.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2942o;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m6333u() {
        this.f2949v = false;
        this.f2950w = false;
        m6406J(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void m6332u0(Fragment fragment) {
        if (this.f2930c.m6264c(fragment.f2808j)) {
            return;
        }
        C0832r c0832r = new C0832r(this.f2940m, fragment);
        c0832r.m6275k(this.f2942o.m6445g().getClassLoader());
        this.f2930c.m6253n(c0832r);
        if (fragment.f2784G) {
            if (fragment.f2783F) {
                m6365e(fragment);
            } else {
                m6399M0(fragment);
            }
            fragment.f2784G = false;
        }
        c0832r.m6269q(this.f2941n);
        if (m6342p0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean m6331v(Menu menu, MenuInflater menuInflater) {
        if (this.f2941n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null && fragment.m6602K0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2932e != null) {
            for (int i = 0; i < this.f2932e.size(); i++) {
                Fragment fragment2 = this.f2932e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.m6554k0();
                }
            }
        }
        this.f2932e = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m6329w() {
        this.f2951x = true;
        m6392Q(true);
        m6398N();
        m6406J(-1);
        this.f2942o = null;
        this.f2943p = null;
        this.f2944q = null;
        if (this.f2934g != null) {
            this.f2935h.m8130d();
            this.f2934g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m6327x() {
        m6406J(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void m6326x0(Fragment fragment) {
        if (!this.f2930c.m6264c(fragment.f2808j)) {
            if (m6342p0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2941n + "since it is not added to " + this);
                return;
            }
            return;
        }
        m6322z0(fragment);
        if (fragment.f2789L != null) {
            Fragment m6257j = this.f2930c.m6257j(fragment);
            if (m6257j != null) {
                View view = m6257j.f2789L;
                ViewGroup viewGroup = fragment.f2788K;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.f2789L);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.f2789L, indexOfChild);
                }
            }
            if (fragment.f2793P && fragment.f2788K != null) {
                float f = fragment.f2795R;
                if (f > 0.0f) {
                    fragment.f2789L.setAlpha(f);
                }
                fragment.f2795R = 0.0f;
                fragment.f2793P = false;
                C0799e.C0804d m6481b = C0799e.m6481b(this.f2942o.m6445g(), this.f2943p, fragment, true);
                if (m6481b != null) {
                    Animation animation = m6481b.f2901a;
                    if (animation != null) {
                        fragment.f2789L.startAnimation(animation);
                    } else {
                        m6481b.f2902b.setTarget(fragment.f2789L);
                        m6481b.f2902b.start();
                    }
                }
            }
        }
        if (fragment.f2794Q) {
            m6345o(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m6325y() {
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null) {
                fragment.m6590Q0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void m6324y0(int i, boolean z) {
        AbstractC0810j<?> abstractC0810j;
        if (this.f2942o == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f2941n) {
            this.f2941n = i;
            for (Fragment fragment : this.f2930c.m6254m()) {
                m6326x0(fragment);
            }
            for (Fragment fragment2 : this.f2930c.m6256k()) {
                if (fragment2 != null && !fragment2.f2793P) {
                    m6326x0(fragment2);
                }
            }
            m6377X0();
            if (this.f2948u && (abstractC0810j = this.f2942o) != null && this.f2941n == 4) {
                abstractC0810j.mo6439o();
                this.f2948u = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m6323z(boolean z) {
        for (Fragment fragment : this.f2930c.m6254m()) {
            if (fragment != null) {
                fragment.m6588R0(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void m6322z0(Fragment fragment) {
        m6423A0(fragment, this.f2941n);
    }
}
