package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.InterfaceC0895w;
import p000a.p019g.p028k.C0252s;
import p000a.p035j.C0296b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public class C0832r {

    /* renamed from: a */
    private final C0812l f2993a;

    /* renamed from: b */
    private final Fragment f2994b;

    /* renamed from: c */
    private int f2995c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.r$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0833a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2996a;

        static {
            int[] iArr = new int[AbstractC0868e.EnumC0870b.values().length];
            f2996a = iArr;
            try {
                iArr[AbstractC0868e.EnumC0870b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2996a[AbstractC0868e.EnumC0870b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2996a[AbstractC0868e.EnumC0870b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0832r(C0812l c0812l, Fragment fragment) {
        this.f2993a = c0812l;
        this.f2994b = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0832r(C0812l c0812l, Fragment fragment, C0830q c0830q) {
        this.f2993a = c0812l;
        this.f2994b = fragment;
        fragment.f2806h = null;
        fragment.f2820v = 0;
        fragment.f2817s = false;
        fragment.f2814p = false;
        Fragment fragment2 = fragment.f2810l;
        fragment.f2811m = fragment2 != null ? fragment2.f2808j : null;
        Fragment fragment3 = this.f2994b;
        fragment3.f2810l = null;
        Bundle bundle = c0830q.f2992r;
        fragment3.f2805g = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0832r(C0812l c0812l, ClassLoader classLoader, C0809i c0809i, C0830q c0830q) {
        this.f2993a = c0812l;
        this.f2994b = c0809i.mo6321a(classLoader, c0830q.f2980f);
        Bundle bundle = c0830q.f2989o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f2994b.m6556j1(c0830q.f2989o);
        Fragment fragment = this.f2994b;
        fragment.f2808j = c0830q.f2981g;
        fragment.f2816r = c0830q.f2982h;
        fragment.f2818t = true;
        fragment.f2778A = c0830q.f2983i;
        fragment.f2779B = c0830q.f2984j;
        fragment.f2780C = c0830q.f2985k;
        fragment.f2783F = c0830q.f2986l;
        fragment.f2815q = c0830q.f2987m;
        fragment.f2782E = c0830q.f2988n;
        fragment.f2781D = c0830q.f2990p;
        fragment.f2798U = AbstractC0868e.EnumC0870b.values()[c0830q.f2991q];
        Bundle bundle2 = c0830q.f2992r;
        if (bundle2 != null) {
            this.f2994b.f2805g = bundle2;
        } else {
            this.f2994b.f2805g = new Bundle();
        }
        if (AbstractC0814m.m6342p0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f2994b);
        }
    }

    /* renamed from: n */
    private Bundle m6272n() {
        Bundle bundle = new Bundle();
        this.f2994b.m6574Z0(bundle);
        this.f2993a.m6429j(this.f2994b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2994b.f2789L != null) {
            m6270p();
        }
        if (this.f2994b.f2806h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2994b.f2806h);
        }
        if (!this.f2994b.f2791N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2994b.f2791N);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6285a() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2994b);
        }
        Fragment fragment = this.f2994b;
        fragment.m6612F0(fragment.f2805g);
        C0812l c0812l = this.f2993a;
        Fragment fragment2 = this.f2994b;
        c0812l.m6438a(fragment2, fragment2.f2805g, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6284b(AbstractC0810j<?> abstractC0810j, AbstractC0814m abstractC0814m, Fragment fragment) {
        Fragment fragment2 = this.f2994b;
        fragment2.f2822x = abstractC0810j;
        fragment2.f2824z = fragment;
        fragment2.f2821w = abstractC0814m;
        this.f2993a.m6432g(fragment2, abstractC0810j.m6445g(), false);
        this.f2994b.m6610G0();
        Fragment fragment3 = this.f2994b;
        Fragment fragment4 = fragment3.f2824z;
        if (fragment4 == null) {
            abstractC0810j.mo6443k(fragment3);
        } else {
            fragment4.mo5999c0(fragment3);
        }
        this.f2993a.m6437b(this.f2994b, abstractC0810j.m6445g(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m6283c() {
        int i = this.f2995c;
        Fragment fragment = this.f2994b;
        if (fragment.f2816r) {
            i = fragment.f2817s ? Math.max(i, 1) : i < 2 ? Math.min(i, fragment.f2804f) : Math.min(i, 1);
        }
        if (!this.f2994b.f2814p) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f2994b;
        if (fragment2.f2815q) {
            i = fragment2.m6587S() ? Math.min(i, 1) : Math.min(i, -1);
        }
        Fragment fragment3 = this.f2994b;
        if (fragment3.f2790M && fragment3.f2804f < 3) {
            i = Math.min(i, 2);
        }
        int i2 = C0833a.f2996a[this.f2994b.f2798U.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(i, -1) : Math.min(i, 1) : Math.min(i, 3) : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m6282d() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2994b);
        }
        Fragment fragment = this.f2994b;
        if (fragment.f2797T) {
            fragment.m6564f1(fragment.f2805g);
            this.f2994b.f2804f = 1;
            return;
        }
        this.f2993a.m6431h(fragment, fragment.f2805g, false);
        Fragment fragment2 = this.f2994b;
        fragment2.m6604J0(fragment2.f2805g);
        C0812l c0812l = this.f2993a;
        Fragment fragment3 = this.f2994b;
        c0812l.m6436c(fragment3, fragment3.f2805g, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m6281e(AbstractC0806f abstractC0806f) {
        String str;
        if (this.f2994b.f2816r) {
            return;
        }
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2994b);
        }
        ViewGroup viewGroup = null;
        Fragment fragment = this.f2994b;
        ViewGroup viewGroup2 = fragment.f2788K;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.f2779B;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2994b + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractC0806f.mo6448c(i);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f2994b;
                    if (!fragment2.f2818t) {
                        try {
                            str = fragment2.m6615E().getResourceName(this.f2994b.f2779B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2994b.f2779B) + " (" + str + ") for fragment " + this.f2994b);
                    }
                }
            }
        }
        Fragment fragment3 = this.f2994b;
        fragment3.f2788K = viewGroup;
        fragment3.m6600L0(fragment3.m6592P0(fragment3.f2805g), viewGroup, this.f2994b.f2805g);
        View view = this.f2994b.f2789L;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f2994b;
            fragment4.f2789L.setTag(C0296b.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                viewGroup.addView(this.f2994b.f2789L);
            }
            Fragment fragment5 = this.f2994b;
            if (fragment5.f2781D) {
                fragment5.f2789L.setVisibility(8);
            }
            C0252s.m8629d0(this.f2994b.f2789L);
            Fragment fragment6 = this.f2994b;
            fragment6.mo6001D0(fragment6.f2789L, fragment6.f2805g);
            C0812l c0812l = this.f2993a;
            Fragment fragment7 = this.f2994b;
            c0812l.m6426m(fragment7, fragment7.f2789L, fragment7.f2805g, false);
            Fragment fragment8 = this.f2994b;
            if (fragment8.f2789L.getVisibility() == 0 && this.f2994b.f2788K != null) {
                z = true;
            }
            fragment8.f2793P = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m6280f(AbstractC0810j<?> abstractC0810j, C0828p c0828p) {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2994b);
        }
        Fragment fragment = this.f2994b;
        boolean z = true;
        boolean z2 = fragment.f2815q && !fragment.m6587S();
        if (!(z2 || c0828p.m6288n(this.f2994b))) {
            this.f2994b.f2804f = 0;
            return;
        }
        if (abstractC0810j instanceof InterfaceC0895w) {
            z = c0828p.m6290l();
        } else if (abstractC0810j.m6445g() instanceof Activity) {
            z = true ^ ((Activity) abstractC0810j.m6445g()).isChangingConfigurations();
        }
        if (z2 || z) {
            c0828p.m6296f(this.f2994b);
        }
        this.f2994b.m6598M0();
        this.f2993a.m6435d(this.f2994b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m6279g(C0828p c0828p) {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2994b);
        }
        this.f2994b.m6594O0();
        boolean z = false;
        this.f2993a.m6434e(this.f2994b, false);
        Fragment fragment = this.f2994b;
        fragment.f2804f = -1;
        fragment.f2822x = null;
        fragment.f2824z = null;
        fragment.f2821w = null;
        if (fragment.f2815q && !fragment.m6587S()) {
            z = true;
        }
        if (z || c0828p.m6288n(this.f2994b)) {
            if (AbstractC0814m.m6342p0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2994b);
            }
            this.f2994b.m6593P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m6278h() {
        Fragment fragment = this.f2994b;
        if (fragment.f2816r && fragment.f2817s && !fragment.f2819u) {
            if (AbstractC0814m.m6342p0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2994b);
            }
            Fragment fragment2 = this.f2994b;
            fragment2.m6600L0(fragment2.m6592P0(fragment2.f2805g), null, this.f2994b.f2805g);
            View view = this.f2994b.f2789L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2994b;
                fragment3.f2789L.setTag(C0296b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2994b;
                if (fragment4.f2781D) {
                    fragment4.f2789L.setVisibility(8);
                }
                Fragment fragment5 = this.f2994b;
                fragment5.mo6001D0(fragment5.f2789L, fragment5.f2805g);
                C0812l c0812l = this.f2993a;
                Fragment fragment6 = this.f2994b;
                c0812l.m6426m(fragment6, fragment6.f2789L, fragment6.f2805g, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m6277i() {
        return this.f2994b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m6276j() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2994b);
        }
        this.f2994b.m6582U0();
        this.f2993a.m6433f(this.f2994b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m6275k(ClassLoader classLoader) {
        Bundle bundle = this.f2994b.f2805g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2994b;
        fragment.f2806h = fragment.f2805g.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2994b;
        fragment2.f2811m = fragment2.f2805g.getString("android:target_state");
        Fragment fragment3 = this.f2994b;
        if (fragment3.f2811m != null) {
            fragment3.f2812n = fragment3.f2805g.getInt("android:target_req_state", 0);
        }
        Fragment fragment4 = this.f2994b;
        Boolean bool = fragment4.f2807i;
        if (bool != null) {
            fragment4.f2791N = bool.booleanValue();
            this.f2994b.f2807i = null;
        } else {
            fragment4.f2791N = fragment4.f2805g.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment5 = this.f2994b;
        if (fragment5.f2791N) {
            return;
        }
        fragment5.f2790M = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m6274l() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f2994b);
        }
        Fragment fragment = this.f2994b;
        if (fragment.f2789L != null) {
            fragment.m6561g1(fragment.f2805g);
        }
        this.f2994b.f2805g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m6273m() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2994b);
        }
        this.f2994b.m6575Y0();
        this.f2993a.m6430i(this.f2994b, false);
        Fragment fragment = this.f2994b;
        fragment.f2805g = null;
        fragment.f2806h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C0830q m6271o() {
        C0830q c0830q = new C0830q(this.f2994b);
        if (this.f2994b.f2804f <= -1 || c0830q.f2992r != null) {
            c0830q.f2992r = this.f2994b.f2805g;
        } else {
            Bundle m6272n = m6272n();
            c0830q.f2992r = m6272n;
            if (this.f2994b.f2811m != null) {
                if (m6272n == null) {
                    c0830q.f2992r = new Bundle();
                }
                c0830q.f2992r.putString("android:target_state", this.f2994b.f2811m);
                int i = this.f2994b.f2812n;
                if (i != 0) {
                    c0830q.f2992r.putInt("android:target_req_state", i);
                }
            }
        }
        return c0830q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m6270p() {
        if (this.f2994b.f2789L == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2994b.f2789L.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2994b.f2806h = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m6269q(int i) {
        this.f2995c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m6268r() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2994b);
        }
        this.f2994b.m6572a1();
        this.f2993a.m6428k(this.f2994b, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m6267s() {
        if (AbstractC0814m.m6342p0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2994b);
        }
        this.f2994b.m6571b1();
        this.f2993a.m6427l(this.f2994b, false);
    }
}
