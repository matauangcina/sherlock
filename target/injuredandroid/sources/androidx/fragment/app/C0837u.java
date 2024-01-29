package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.AbstractC0729m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000a.p014d.C0066a;
import p000a.p019g.p024g.C0144b;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.ViewTreeObserver$OnPreDrawListenerC0250q;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.u */
/* loaded from: classes.dex */
public class C0837u {

    /* renamed from: a */
    private static final int[] f3024a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final AbstractC0852w f3025b;

    /* renamed from: c */
    private static final AbstractC0852w f3026c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$a */
    /* loaded from: classes.dex */
    public static class RunnableC0838a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ InterfaceC0844g f3027f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3028g;

        /* renamed from: h */
        final /* synthetic */ C0144b f3029h;

        RunnableC0838a(InterfaceC0844g interfaceC0844g, Fragment fragment, C0144b c0144b) {
            this.f3027f = interfaceC0844g;
            this.f3028g = fragment;
            this.f3029h = c0144b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3027f.mo6198a(this.f3028g, this.f3029h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$b */
    /* loaded from: classes.dex */
    public static class RunnableC0839b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3030f;

        RunnableC0839b(ArrayList arrayList) {
            this.f3030f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0837u.m6227B(this.f3030f, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$c */
    /* loaded from: classes.dex */
    public static class RunnableC0840c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ InterfaceC0844g f3031f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3032g;

        /* renamed from: h */
        final /* synthetic */ C0144b f3033h;

        RunnableC0840c(InterfaceC0844g interfaceC0844g, Fragment fragment, C0144b c0144b) {
            this.f3031f = interfaceC0844g;
            this.f3032g = fragment;
            this.f3033h = c0144b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3031f.mo6198a(this.f3032g, this.f3033h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$d */
    /* loaded from: classes.dex */
    public static class RunnableC0841d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f3034f;

        /* renamed from: g */
        final /* synthetic */ AbstractC0852w f3035g;

        /* renamed from: h */
        final /* synthetic */ View f3036h;

        /* renamed from: i */
        final /* synthetic */ Fragment f3037i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3038j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f3039k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f3040l;

        /* renamed from: m */
        final /* synthetic */ Object f3041m;

        RunnableC0841d(Object obj, AbstractC0852w abstractC0852w, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3034f = obj;
            this.f3035g = abstractC0852w;
            this.f3036h = view;
            this.f3037i = fragment;
            this.f3038j = arrayList;
            this.f3039k = arrayList2;
            this.f3040l = arrayList3;
            this.f3041m = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3034f;
            if (obj != null) {
                this.f3035g.mo6178p(obj, this.f3036h);
                this.f3039k.addAll(C0837u.m6214k(this.f3035g, this.f3034f, this.f3037i, this.f3038j, this.f3036h));
            }
            if (this.f3040l != null) {
                if (this.f3041m != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f3036h);
                    this.f3035g.mo6177q(this.f3041m, this.f3040l, arrayList);
                }
                this.f3040l.clear();
                this.f3040l.add(this.f3036h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$e */
    /* loaded from: classes.dex */
    public static class RunnableC0842e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f3042f;

        /* renamed from: g */
        final /* synthetic */ Fragment f3043g;

        /* renamed from: h */
        final /* synthetic */ boolean f3044h;

        /* renamed from: i */
        final /* synthetic */ C0066a f3045i;

        /* renamed from: j */
        final /* synthetic */ View f3046j;

        /* renamed from: k */
        final /* synthetic */ AbstractC0852w f3047k;

        /* renamed from: l */
        final /* synthetic */ Rect f3048l;

        RunnableC0842e(Fragment fragment, Fragment fragment2, boolean z, C0066a c0066a, View view, AbstractC0852w abstractC0852w, Rect rect) {
            this.f3042f = fragment;
            this.f3043g = fragment2;
            this.f3044h = z;
            this.f3045i = c0066a;
            this.f3046j = view;
            this.f3047k = abstractC0852w;
            this.f3048l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0837u.m6219f(this.f3042f, this.f3043g, this.f3044h, this.f3045i, false);
            View view = this.f3046j;
            if (view != null) {
                this.f3047k.m6183k(view, this.f3048l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$f */
    /* loaded from: classes.dex */
    public static class RunnableC0843f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AbstractC0852w f3049f;

        /* renamed from: g */
        final /* synthetic */ C0066a f3050g;

        /* renamed from: h */
        final /* synthetic */ Object f3051h;

        /* renamed from: i */
        final /* synthetic */ C0845h f3052i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3053j;

        /* renamed from: k */
        final /* synthetic */ View f3054k;

        /* renamed from: l */
        final /* synthetic */ Fragment f3055l;

        /* renamed from: m */
        final /* synthetic */ Fragment f3056m;

        /* renamed from: n */
        final /* synthetic */ boolean f3057n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f3058o;

        /* renamed from: p */
        final /* synthetic */ Object f3059p;

        /* renamed from: q */
        final /* synthetic */ Rect f3060q;

        RunnableC0843f(AbstractC0852w abstractC0852w, C0066a c0066a, Object obj, C0845h c0845h, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3049f = abstractC0852w;
            this.f3050g = c0066a;
            this.f3051h = obj;
            this.f3052i = c0845h;
            this.f3053j = arrayList;
            this.f3054k = view;
            this.f3055l = fragment;
            this.f3056m = fragment2;
            this.f3057n = z;
            this.f3058o = arrayList2;
            this.f3059p = obj2;
            this.f3060q = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0066a<String, View> m6217h = C0837u.m6217h(this.f3049f, this.f3050g, this.f3051h, this.f3052i);
            if (m6217h != null) {
                this.f3053j.addAll(m6217h.values());
                this.f3053j.add(this.f3054k);
            }
            C0837u.m6219f(this.f3055l, this.f3056m, this.f3057n, m6217h, false);
            Object obj = this.f3051h;
            if (obj != null) {
                this.f3049f.mo6195A(obj, this.f3058o, this.f3053j);
                View m6205t = C0837u.m6205t(m6217h, this.f3052i, this.f3059p, this.f3057n);
                if (m6205t != null) {
                    this.f3049f.m6183k(m6205t, this.f3060q);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0844g {
        /* renamed from: a */
        void mo6198a(Fragment fragment, C0144b c0144b);

        /* renamed from: b */
        void mo6197b(Fragment fragment, C0144b c0144b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.u$h */
    /* loaded from: classes.dex */
    public static class C0845h {

        /* renamed from: a */
        public Fragment f3061a;

        /* renamed from: b */
        public boolean f3062b;

        /* renamed from: c */
        public C0790a f3063c;

        /* renamed from: d */
        public Fragment f3064d;

        /* renamed from: e */
        public boolean f3065e;

        /* renamed from: f */
        public C0790a f3066f;

        C0845h() {
        }
    }

    static {
        f3025b = Build.VERSION.SDK_INT >= 21 ? new C0846v() : null;
        f3026c = m6201x();
    }

    /* renamed from: A */
    private static void m6228A(AbstractC0852w abstractC0852w, Object obj, Object obj2, C0066a<String, View> c0066a, boolean z, C0790a c0790a) {
        ArrayList<String> arrayList = c0790a.f3012n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0066a.get((z ? c0790a.f3013o : c0790a.f3012n).get(0));
        abstractC0852w.mo6172v(obj, view);
        if (obj2 != null) {
            abstractC0852w.mo6172v(obj2, view);
        }
    }

    /* renamed from: B */
    static void m6227B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m6226C(AbstractC0814m abstractC0814m, ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, InterfaceC0844g interfaceC0844g) {
        if (abstractC0814m.f2941n < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0790a c0790a = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m6220e(c0790a, sparseArray, z);
            } else {
                m6222c(c0790a, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(abstractC0814m.f2942o.m6445g());
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C0066a<String, String> m6221d = m6221d(keyAt, arrayList, arrayList2, i, i2);
                C0845h c0845h = (C0845h) sparseArray.valueAt(i4);
                if (z) {
                    m6210o(abstractC0814m, keyAt, c0845h, view, m6221d, interfaceC0844g);
                } else {
                    m6211n(abstractC0814m, keyAt, c0845h, view, m6221d, interfaceC0844g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static boolean m6225D() {
        return (f3025b == null && f3026c == null) ? false : true;
    }

    /* renamed from: a */
    private static void m6224a(ArrayList<View> arrayList, C0066a<String, View> c0066a, Collection<String> collection) {
        for (int size = c0066a.size() - 1; size >= 0; size--) {
            View m9330m = c0066a.m9330m(size);
            if (collection.contains(C0252s.m8658E(m9330m))) {
                arrayList.add(m9330m);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.f2814p != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
        if (r0.f2781D == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d7 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m6223b(androidx.fragment.app.C0790a r8, androidx.fragment.app.AbstractC0835t.C0836a r9, android.util.SparseArray<androidx.fragment.app.C0837u.C0845h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0837u.m6223b(androidx.fragment.app.a, androidx.fragment.app.t$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m6222c(C0790a c0790a, SparseArray<C0845h> sparseArray, boolean z) {
        int size = c0790a.f2999a.size();
        for (int i = 0; i < size; i++) {
            m6223b(c0790a, c0790a.f2999a.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C0066a<String, String> m6221d(int i, ArrayList<C0790a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0066a<String, String> c0066a = new C0066a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0790a c0790a = arrayList.get(i4);
            if (c0790a.m6522B(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = c0790a.f3012n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c0790a.f3012n;
                        arrayList4 = c0790a.f3013o;
                    } else {
                        ArrayList<String> arrayList6 = c0790a.f3012n;
                        arrayList3 = c0790a.f3013o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c0066a.remove(str2);
                        if (remove != null) {
                            c0066a.put(str, remove);
                        } else {
                            c0066a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0066a;
    }

    /* renamed from: e */
    public static void m6220e(C0790a c0790a, SparseArray<C0845h> sparseArray, boolean z) {
        if (c0790a.f2846r.f2943p.mo6447d()) {
            for (int size = c0790a.f2999a.size() - 1; size >= 0; size--) {
                m6223b(c0790a, c0790a.f2999a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m6219f(Fragment fragment, Fragment fragment2, boolean z, C0066a<String, View> c0066a, boolean z2) {
        AbstractC0729m m6535t = z ? fragment2.m6535t() : fragment.m6535t();
        if (m6535t != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0066a == null ? 0 : c0066a.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(c0066a.m9334i(i));
                arrayList.add(c0066a.m9330m(i));
            }
            if (z2) {
                m6535t.m6894c(arrayList2, arrayList, null);
            } else {
                m6535t.m6895b(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: g */
    private static boolean m6218g(AbstractC0852w abstractC0852w, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0852w.mo6189e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C0066a<String, View> m6217h(AbstractC0852w abstractC0852w, C0066a<String, String> c0066a, Object obj, C0845h c0845h) {
        AbstractC0729m m6535t;
        ArrayList<String> arrayList;
        String m6208q;
        Fragment fragment = c0845h.f3061a;
        View m6597N = fragment.m6597N();
        if (c0066a.isEmpty() || obj == null || m6597N == null) {
            c0066a.clear();
            return null;
        }
        C0066a<String, View> c0066a2 = new C0066a<>();
        abstractC0852w.m6184j(c0066a2, m6597N);
        C0790a c0790a = c0845h.f3063c;
        if (c0845h.f3062b) {
            m6535t = fragment.m6531v();
            arrayList = c0790a.f3012n;
        } else {
            m6535t = fragment.m6535t();
            arrayList = c0790a.f3013o;
        }
        if (arrayList != null) {
            c0066a2.m9398o(arrayList);
            c0066a2.m9398o(c0066a.values());
        }
        if (m6535t != null) {
            m6535t.m6896a(arrayList, c0066a2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0066a2.get(str);
                if (view == null) {
                    String m6208q2 = m6208q(c0066a, str);
                    if (m6208q2 != null) {
                        c0066a.remove(m6208q2);
                    }
                } else if (!str.equals(C0252s.m8658E(view)) && (m6208q = m6208q(c0066a, str)) != null) {
                    c0066a.put(m6208q, C0252s.m8658E(view));
                }
            }
        } else {
            m6200y(c0066a, c0066a2);
        }
        return c0066a2;
    }

    /* renamed from: i */
    private static C0066a<String, View> m6216i(AbstractC0852w abstractC0852w, C0066a<String, String> c0066a, Object obj, C0845h c0845h) {
        AbstractC0729m m6531v;
        ArrayList<String> arrayList;
        if (c0066a.isEmpty() || obj == null) {
            c0066a.clear();
            return null;
        }
        Fragment fragment = c0845h.f3064d;
        C0066a<String, View> c0066a2 = new C0066a<>();
        abstractC0852w.m6184j(c0066a2, fragment.m6566e1());
        C0790a c0790a = c0845h.f3066f;
        if (c0845h.f3065e) {
            m6531v = fragment.m6535t();
            arrayList = c0790a.f3013o;
        } else {
            m6531v = fragment.m6531v();
            arrayList = c0790a.f3012n;
        }
        if (arrayList != null) {
            c0066a2.m9398o(arrayList);
        }
        if (m6531v != null) {
            m6531v.m6896a(arrayList, c0066a2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0066a2.get(str);
                if (view == null) {
                    c0066a.remove(str);
                } else if (!str.equals(C0252s.m8658E(view))) {
                    c0066a.put(C0252s.m8658E(view), c0066a.remove(str));
                }
            }
        } else {
            c0066a.m9398o(c0066a2.keySet());
        }
        return c0066a2;
    }

    /* renamed from: j */
    private static AbstractC0852w m6215j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m6533u = fragment.m6533u();
            if (m6533u != null) {
                arrayList.add(m6533u);
            }
            Object m6611G = fragment.m6611G();
            if (m6611G != null) {
                arrayList.add(m6611G);
            }
            Object m6607I = fragment.m6607I();
            if (m6607I != null) {
                arrayList.add(m6607I);
            }
        }
        if (fragment2 != null) {
            Object m6537s = fragment2.m6537s();
            if (m6537s != null) {
                arrayList.add(m6537s);
            }
            Object m6616D = fragment2.m6616D();
            if (m6616D != null) {
                arrayList.add(m6616D);
            }
            Object m6609H = fragment2.m6609H();
            if (m6609H != null) {
                arrayList.add(m6609H);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0852w abstractC0852w = f3025b;
        if (abstractC0852w == null || !m6218g(abstractC0852w, arrayList)) {
            AbstractC0852w abstractC0852w2 = f3026c;
            if (abstractC0852w2 == null || !m6218g(abstractC0852w2, arrayList)) {
                if (f3025b == null && f3026c == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return f3026c;
        }
        return f3025b;
    }

    /* renamed from: k */
    static ArrayList<View> m6214k(AbstractC0852w abstractC0852w, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View m6597N = fragment.m6597N();
            if (m6597N != null) {
                abstractC0852w.m6188f(arrayList2, m6597N);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            abstractC0852w.mo6192b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    /* renamed from: l */
    private static Object m6213l(AbstractC0852w abstractC0852w, ViewGroup viewGroup, View view, C0066a<String, String> c0066a, C0845h c0845h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m6204u;
        C0066a<String, String> c0066a2;
        Object obj3;
        Rect rect;
        Fragment fragment = c0845h.f3061a;
        Fragment fragment2 = c0845h.f3064d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c0845h.f3062b;
        if (c0066a.isEmpty()) {
            c0066a2 = c0066a;
            m6204u = null;
        } else {
            m6204u = m6204u(abstractC0852w, fragment, fragment2, z);
            c0066a2 = c0066a;
        }
        C0066a<String, View> m6216i = m6216i(abstractC0852w, c0066a2, m6204u, c0845h);
        if (c0066a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m6216i.values());
            obj3 = m6204u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m6219f(fragment, fragment2, z, m6216i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC0852w.mo6168z(obj3, view, arrayList);
            m6228A(abstractC0852w, obj3, obj2, m6216i, c0845h.f3065e, c0845h.f3066f);
            if (obj != null) {
                abstractC0852w.mo6173u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(viewGroup, new RunnableC0843f(abstractC0852w, c0066a, obj3, c0845h, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m6212m(AbstractC0852w abstractC0852w, ViewGroup viewGroup, View view, C0066a<String, String> c0066a, C0845h c0845h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = c0845h.f3061a;
        Fragment fragment2 = c0845h.f3064d;
        if (fragment != null) {
            fragment.m6566e1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c0845h.f3062b;
        Object m6204u = c0066a.isEmpty() ? null : m6204u(abstractC0852w, fragment, fragment2, z);
        C0066a<String, View> m6216i = m6216i(abstractC0852w, c0066a, m6204u, c0845h);
        C0066a<String, View> m6217h = m6217h(abstractC0852w, c0066a, m6204u, c0845h);
        if (c0066a.isEmpty()) {
            if (m6216i != null) {
                m6216i.clear();
            }
            if (m6217h != null) {
                m6217h.clear();
            }
            obj3 = null;
        } else {
            m6224a(arrayList, m6216i, c0066a.keySet());
            m6224a(arrayList2, m6217h, c0066a.values());
            obj3 = m6204u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m6219f(fragment, fragment2, z, m6216i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC0852w.mo6168z(obj3, view, arrayList);
            m6228A(abstractC0852w, obj3, obj2, m6216i, c0845h.f3065e, c0845h.f3066f);
            Rect rect2 = new Rect();
            View m6205t = m6205t(m6217h, c0845h, obj, z);
            if (m6205t != null) {
                abstractC0852w.mo6173u(obj, rect2);
            }
            rect = rect2;
            view2 = m6205t;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(viewGroup, new RunnableC0842e(fragment, fragment2, z, m6217h, view2, abstractC0852w, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m6211n(AbstractC0814m abstractC0814m, int i, C0845h c0845h, View view, C0066a<String, String> c0066a, InterfaceC0844g interfaceC0844g) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC0852w m6215j;
        Object obj;
        ViewGroup viewGroup = abstractC0814m.f2943p.mo6447d() ? (ViewGroup) abstractC0814m.f2943p.mo6448c(i) : null;
        if (viewGroup == null || (m6215j = m6215j((fragment2 = c0845h.f3064d), (fragment = c0845h.f3061a))) == null) {
            return;
        }
        boolean z = c0845h.f3062b;
        boolean z2 = c0845h.f3065e;
        Object m6207r = m6207r(m6215j, fragment, z);
        Object m6206s = m6206s(m6215j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m6213l = m6213l(m6215j, viewGroup, view, c0066a, c0845h, arrayList, arrayList2, m6207r, m6206s);
        if (m6207r == null && m6213l == null) {
            obj = m6206s;
            if (obj == null) {
                return;
            }
        } else {
            obj = m6206s;
        }
        ArrayList<View> m6214k = m6214k(m6215j, obj, fragment2, arrayList, view);
        Object obj2 = (m6214k == null || m6214k.isEmpty()) ? null : obj;
        m6215j.mo6193a(m6207r, view);
        Object m6203v = m6203v(m6215j, m6207r, obj2, m6213l, fragment, c0845h.f3062b);
        if (fragment2 != null && m6214k != null && (m6214k.size() > 0 || arrayList.size() > 0)) {
            C0144b c0144b = new C0144b();
            interfaceC0844g.mo6197b(fragment2, c0144b);
            m6215j.mo6171w(fragment2, m6203v, c0144b, new RunnableC0840c(interfaceC0844g, fragment2, c0144b));
        }
        if (m6203v != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m6215j.mo6174t(m6203v, m6207r, arrayList3, obj2, m6214k, m6213l, arrayList2);
            m6199z(m6215j, viewGroup, fragment, view, arrayList2, m6207r, arrayList3, obj2, m6214k);
            m6215j.m6170x(viewGroup, arrayList2, c0066a);
            m6215j.mo6191c(viewGroup, m6203v);
            m6215j.m6175s(viewGroup, arrayList2, c0066a);
        }
    }

    /* renamed from: o */
    private static void m6210o(AbstractC0814m abstractC0814m, int i, C0845h c0845h, View view, C0066a<String, String> c0066a, InterfaceC0844g interfaceC0844g) {
        Fragment fragment;
        Fragment fragment2;
        AbstractC0852w m6215j;
        Object obj;
        ViewGroup viewGroup = abstractC0814m.f2943p.mo6447d() ? (ViewGroup) abstractC0814m.f2943p.mo6448c(i) : null;
        if (viewGroup == null || (m6215j = m6215j((fragment2 = c0845h.f3064d), (fragment = c0845h.f3061a))) == null) {
            return;
        }
        boolean z = c0845h.f3062b;
        boolean z2 = c0845h.f3065e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m6207r = m6207r(m6215j, fragment, z);
        Object m6206s = m6206s(m6215j, fragment2, z2);
        Object m6212m = m6212m(m6215j, viewGroup, view, c0066a, c0845h, arrayList2, arrayList, m6207r, m6206s);
        if (m6207r == null && m6212m == null) {
            obj = m6206s;
            if (obj == null) {
                return;
            }
        } else {
            obj = m6206s;
        }
        ArrayList<View> m6214k = m6214k(m6215j, obj, fragment2, arrayList2, view);
        ArrayList<View> m6214k2 = m6214k(m6215j, m6207r, fragment, arrayList, view);
        m6227B(m6214k2, 4);
        Object m6203v = m6203v(m6215j, m6207r, obj, m6212m, fragment, z);
        if (fragment2 != null && m6214k != null && (m6214k.size() > 0 || arrayList2.size() > 0)) {
            C0144b c0144b = new C0144b();
            interfaceC0844g.mo6197b(fragment2, c0144b);
            m6215j.mo6171w(fragment2, m6203v, c0144b, new RunnableC0838a(interfaceC0844g, fragment2, c0144b));
        }
        if (m6203v != null) {
            m6202w(m6215j, obj, fragment2, m6214k);
            ArrayList<String> m6179o = m6215j.m6179o(arrayList);
            m6215j.mo6174t(m6203v, m6207r, m6214k2, obj, m6214k, m6212m, arrayList);
            m6215j.mo6191c(viewGroup, m6203v);
            m6215j.m6169y(viewGroup, arrayList2, arrayList, m6179o, c0066a);
            m6227B(m6214k2, 0);
            m6215j.mo6195A(m6212m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static C0845h m6209p(C0845h c0845h, SparseArray<C0845h> sparseArray, int i) {
        if (c0845h == null) {
            C0845h c0845h2 = new C0845h();
            sparseArray.put(i, c0845h2);
            return c0845h2;
        }
        return c0845h;
    }

    /* renamed from: q */
    private static String m6208q(C0066a<String, String> c0066a, String str) {
        int size = c0066a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0066a.m9330m(i))) {
                return c0066a.m9334i(i);
            }
        }
        return null;
    }

    /* renamed from: r */
    private static Object m6207r(AbstractC0852w abstractC0852w, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return abstractC0852w.mo6187g(z ? fragment.m6616D() : fragment.m6537s());
    }

    /* renamed from: s */
    private static Object m6206s(AbstractC0852w abstractC0852w, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return abstractC0852w.mo6187g(z ? fragment.m6611G() : fragment.m6533u());
    }

    /* renamed from: t */
    static View m6205t(C0066a<String, View> c0066a, C0845h c0845h, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0790a c0790a = c0845h.f3063c;
        if (obj == null || c0066a == null || (arrayList = c0790a.f3012n) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0066a.get((z ? c0790a.f3012n : c0790a.f3013o).get(0));
    }

    /* renamed from: u */
    private static Object m6204u(AbstractC0852w abstractC0852w, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return abstractC0852w.mo6194B(abstractC0852w.mo6187g(z ? fragment2.m6607I() : fragment.m6609H()));
    }

    /* renamed from: v */
    private static Object m6203v(AbstractC0852w abstractC0852w, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.m6550m() : fragment.m6552l() ? abstractC0852w.mo6180n(obj2, obj, obj3) : abstractC0852w.mo6181m(obj2, obj, obj3);
    }

    /* renamed from: w */
    private static void m6202w(AbstractC0852w abstractC0852w, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2814p && fragment.f2781D && fragment.f2794Q) {
            fragment.m6553k1(true);
            abstractC0852w.mo6176r(obj, fragment.m6597N(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(fragment.f2788K, new RunnableC0839b(arrayList));
        }
    }

    /* renamed from: x */
    private static AbstractC0852w m6201x() {
        try {
            return (AbstractC0852w) Class.forName("a.p.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: y */
    private static void m6200y(C0066a<String, String> c0066a, C0066a<String, View> c0066a2) {
        for (int size = c0066a.size() - 1; size >= 0; size--) {
            if (!c0066a2.containsKey(c0066a.m9330m(size))) {
                c0066a.m9332k(size);
            }
        }
    }

    /* renamed from: z */
    private static void m6199z(AbstractC0852w abstractC0852w, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC0250q.m8664a(viewGroup, new RunnableC0841d(obj, abstractC0852w, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
