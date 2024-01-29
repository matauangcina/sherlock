package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0729m;
import androidx.lifecycle.AbstractC0868e;
import androidx.lifecycle.C0876k;
import androidx.lifecycle.C0882o;
import androidx.lifecycle.C0894v;
import androidx.lifecycle.InterfaceC0873h;
import androidx.lifecycle.InterfaceC0875j;
import androidx.lifecycle.InterfaceC0895w;
import androidx.savedstate.C1068a;
import androidx.savedstate.InterfaceC1069b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p000a.p019g.p028k.C0239f;
import p000a.p039l.p040a.AbstractC0302a;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0875j, InterfaceC0895w, InterfaceC1069b {

    /* renamed from: a0 */
    static final Object f2777a0 = new Object();

    /* renamed from: A */
    int f2778A;

    /* renamed from: B */
    int f2779B;

    /* renamed from: C */
    String f2780C;

    /* renamed from: D */
    boolean f2781D;

    /* renamed from: E */
    boolean f2782E;

    /* renamed from: F */
    boolean f2783F;

    /* renamed from: G */
    boolean f2784G;

    /* renamed from: H */
    boolean f2785H;

    /* renamed from: J */
    private boolean f2787J;

    /* renamed from: K */
    ViewGroup f2788K;

    /* renamed from: L */
    View f2789L;

    /* renamed from: M */
    boolean f2790M;

    /* renamed from: O */
    C0787c f2792O;

    /* renamed from: P */
    boolean f2793P;

    /* renamed from: Q */
    boolean f2794Q;

    /* renamed from: R */
    float f2795R;

    /* renamed from: S */
    LayoutInflater f2796S;

    /* renamed from: T */
    boolean f2797T;

    /* renamed from: V */
    C0876k f2799V;

    /* renamed from: W */
    C0856x f2800W;

    /* renamed from: Y */
    C1068a f2802Y;

    /* renamed from: Z */
    private int f2803Z;

    /* renamed from: g */
    Bundle f2805g;

    /* renamed from: h */
    SparseArray<Parcelable> f2806h;

    /* renamed from: i */
    Boolean f2807i;

    /* renamed from: k */
    Bundle f2809k;

    /* renamed from: l */
    Fragment f2810l;

    /* renamed from: n */
    int f2812n;

    /* renamed from: p */
    boolean f2814p;

    /* renamed from: q */
    boolean f2815q;

    /* renamed from: r */
    boolean f2816r;

    /* renamed from: s */
    boolean f2817s;

    /* renamed from: t */
    boolean f2818t;

    /* renamed from: u */
    boolean f2819u;

    /* renamed from: v */
    int f2820v;

    /* renamed from: w */
    AbstractC0814m f2821w;

    /* renamed from: x */
    AbstractC0810j<?> f2822x;

    /* renamed from: z */
    Fragment f2824z;

    /* renamed from: f */
    int f2804f = -1;

    /* renamed from: j */
    String f2808j = UUID.randomUUID().toString();

    /* renamed from: m */
    String f2811m = null;

    /* renamed from: o */
    private Boolean f2813o = null;

    /* renamed from: y */
    AbstractC0814m f2823y = new C0825n();

    /* renamed from: I */
    boolean f2786I = true;

    /* renamed from: N */
    boolean f2791N = true;

    /* renamed from: U */
    AbstractC0868e.EnumC0870b f2798U = AbstractC0868e.EnumC0870b.RESUMED;

    /* renamed from: X */
    C0882o<InterfaceC0875j> f2801X = new C0882o<>();

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes.dex */
    class RunnableC0785a implements Runnable {
        RunnableC0785a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.m6569d();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes.dex */
    class C0786b extends AbstractC0806f {
        C0786b() {
        }

        @Override // androidx.fragment.app.AbstractC0806f
        /* renamed from: c */
        public View mo6448c(int i) {
            View view = Fragment.this.f2789L;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0806f
        /* renamed from: d */
        public boolean mo6447d() {
            return Fragment.this.f2789L != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes.dex */
    public static class C0787c {

        /* renamed from: a */
        View f2828a;

        /* renamed from: b */
        Animator f2829b;

        /* renamed from: c */
        int f2830c;

        /* renamed from: d */
        int f2831d;

        /* renamed from: e */
        int f2832e;

        /* renamed from: f */
        Object f2833f = null;

        /* renamed from: g */
        Object f2834g;

        /* renamed from: h */
        Object f2835h;

        /* renamed from: i */
        Object f2836i;

        /* renamed from: j */
        Object f2837j;

        /* renamed from: k */
        Object f2838k;

        /* renamed from: l */
        Boolean f2839l;

        /* renamed from: m */
        Boolean f2840m;

        /* renamed from: n */
        AbstractC0729m f2841n;

        /* renamed from: o */
        AbstractC0729m f2842o;

        /* renamed from: p */
        boolean f2843p;

        /* renamed from: q */
        InterfaceC0789e f2844q;

        /* renamed from: r */
        boolean f2845r;

        C0787c() {
            Object obj = Fragment.f2777a0;
            this.f2834g = obj;
            this.f2835h = null;
            this.f2836i = obj;
            this.f2837j = null;
            this.f2838k = obj;
            this.f2841n = null;
            this.f2842o = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes.dex */
    public static class C0788d extends RuntimeException {
        public C0788d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0789e {
        /* renamed from: a */
        void mo6304a();

        /* renamed from: b */
        void mo6303b();
    }

    public Fragment() {
        m6595O();
    }

    /* renamed from: O */
    private void m6595O() {
        this.f2799V = new C0876k(this);
        this.f2802Y = C1068a.m5054a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2799V.mo6124a(new InterfaceC0873h() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.InterfaceC0873h
                /* renamed from: d */
                public void mo5007d(InterfaceC0875j interfaceC0875j, AbstractC0868e.EnumC0869a enumC0869a) {
                    View view;
                    if (enumC0869a != AbstractC0868e.EnumC0869a.ON_STOP || (view = Fragment.this.f2789L) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    /* renamed from: Q */
    public static Fragment m6591Q(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C0809i.m6449d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.m6556j1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new C0788d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0788d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0788d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0788d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: g */
    private C0787c m6563g() {
        if (this.f2792O == null) {
            this.f2792O = new C0787c();
        }
        return this.f2792O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public int m6619A() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return 0;
        }
        return c0787c.f2832e;
    }

    /* renamed from: A0 */
    public void mo3010A0(Bundle bundle) {
    }

    /* renamed from: B */
    public final Fragment m6618B() {
        return this.f2824z;
    }

    /* renamed from: B0 */
    public void mo3034B0() {
        this.f2787J = true;
    }

    /* renamed from: C */
    public final AbstractC0814m m6617C() {
        AbstractC0814m abstractC0814m = this.f2821w;
        if (abstractC0814m != null) {
            return abstractC0814m;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: C0 */
    public void mo3032C0() {
        this.f2787J = true;
    }

    /* renamed from: D */
    public Object m6616D() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        Object obj = c0787c.f2836i;
        return obj == f2777a0 ? m6533u() : obj;
    }

    /* renamed from: D0 */
    public void mo6001D0(View view, Bundle bundle) {
    }

    /* renamed from: E */
    public final Resources m6615E() {
        return m6567d1().getResources();
    }

    /* renamed from: E0 */
    public void m6614E0(Bundle bundle) {
        this.f2787J = true;
    }

    /* renamed from: F */
    public final boolean m6613F() {
        return this.f2783F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void m6612F0(Bundle bundle) {
        this.f2823y.m6421B0();
        this.f2804f = 2;
        this.f2787J = false;
        mo6505Y(bundle);
        if (this.f2787J) {
            this.f2823y.m6339r();
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: G */
    public Object m6611G() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        Object obj = c0787c.f2834g;
        return obj == f2777a0 ? m6537s() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public void m6610G0() {
        this.f2823y.m6361g(this.f2822x, new C0786b(), this);
        this.f2804f = 0;
        this.f2787J = false;
        mo6000b0(this.f2822x.m6445g());
        if (this.f2787J) {
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* renamed from: H */
    public Object m6609H() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        return c0787c.f2837j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void m6608H0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2823y.m6337s(configuration);
    }

    /* renamed from: I */
    public Object m6607I() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        Object obj = c0787c.f2838k;
        return obj == f2777a0 ? m6609H() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public boolean m6606I0(MenuItem menuItem) {
        if (this.f2781D) {
            return false;
        }
        return m6568d0(menuItem) || this.f2823y.m6335t(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public int m6605J() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return 0;
        }
        return c0787c.f2830c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void m6604J0(Bundle bundle) {
        this.f2823y.m6421B0();
        this.f2804f = 1;
        this.f2787J = false;
        this.f2802Y.m5052c(bundle);
        mo3009e0(bundle);
        this.f2797T = true;
        if (this.f2787J) {
            this.f2799V.m6116i(AbstractC0868e.EnumC0869a.ON_CREATE);
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: K */
    public final String m6603K(int i) {
        return m6615E().getString(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public boolean m6602K0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2781D) {
            return false;
        }
        if (this.f2785H && this.f2786I) {
            z = true;
            m6559h0(menu, menuInflater);
        }
        return z | this.f2823y.m6331v(menu, menuInflater);
    }

    /* renamed from: L */
    public final String m6601L() {
        return this.f2780C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void m6600L0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2823y.m6421B0();
        this.f2819u = true;
        this.f2800W = new C0856x();
        View mo3008i0 = mo3008i0(layoutInflater, viewGroup, bundle);
        this.f2789L = mo3008i0;
        if (mo3008i0 != null) {
            this.f2800W.m6166c();
            this.f2801X.mo6098j(this.f2800W);
        } else if (this.f2800W.m6165d()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.f2800W = null;
        }
    }

    /* renamed from: M */
    public final Fragment m6599M() {
        String str;
        Fragment fragment = this.f2810l;
        if (fragment != null) {
            return fragment;
        }
        AbstractC0814m abstractC0814m = this.f2821w;
        if (abstractC0814m == null || (str = this.f2811m) == null) {
            return null;
        }
        return abstractC0814m.m6382V(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void m6598M0() {
        this.f2823y.m6329w();
        this.f2799V.m6116i(AbstractC0868e.EnumC0869a.ON_DESTROY);
        this.f2804f = 0;
        this.f2787J = false;
        this.f2797T = false;
        mo3784j0();
        if (this.f2787J) {
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: N */
    public View m6597N() {
        return this.f2789L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void m6596N0() {
        this.f2823y.m6327x();
        if (this.f2789L != null) {
            this.f2800W.m6167b(AbstractC0868e.EnumC0869a.ON_DESTROY);
        }
        this.f2804f = 1;
        this.f2787J = false;
        mo5998l0();
        if (this.f2787J) {
            AbstractC0302a.m8426b(this).mo8424c();
            this.f2819u = false;
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void m6594O0() {
        this.f2804f = -1;
        this.f2787J = false;
        mo6504m0();
        this.f2796S = null;
        if (this.f2787J) {
            if (this.f2823y.m6344o0()) {
                return;
            }
            this.f2823y.m6329w();
            this.f2823y = new C0825n();
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m6593P() {
        m6595O();
        this.f2808j = UUID.randomUUID().toString();
        this.f2814p = false;
        this.f2815q = false;
        this.f2816r = false;
        this.f2817s = false;
        this.f2818t = false;
        this.f2820v = 0;
        this.f2821w = null;
        this.f2823y = new C0825n();
        this.f2822x = null;
        this.f2778A = 0;
        this.f2779B = 0;
        this.f2780C = null;
        this.f2781D = false;
        this.f2782E = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public LayoutInflater m6592P0(Bundle bundle) {
        LayoutInflater mo6503n0 = mo6503n0(bundle);
        this.f2796S = mo6503n0;
        return mo6503n0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void m6590Q0() {
        onLowMemory();
        this.f2823y.m6325y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean m6589R() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return false;
        }
        return c0787c.f2845r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void m6588R0(boolean z) {
        m6538r0(z);
        this.f2823y.m6323z(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean m6587S() {
        return this.f2820v > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public boolean m6586S0(MenuItem menuItem) {
        if (this.f2781D) {
            return false;
        }
        return (this.f2785H && this.f2786I && m6536s0(menuItem)) || this.f2823y.m6424A(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean m6585T() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return false;
        }
        return c0787c.f2843p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void m6584T0(Menu menu) {
        if (this.f2781D) {
            return;
        }
        if (this.f2785H && this.f2786I) {
            m6534t0(menu);
        }
        this.f2823y.m6422B(menu);
    }

    /* renamed from: U */
    public final boolean m6583U() {
        return this.f2815q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void m6582U0() {
        this.f2823y.m6418D();
        if (this.f2789L != null) {
            this.f2800W.m6167b(AbstractC0868e.EnumC0869a.ON_PAUSE);
        }
        this.f2799V.m6116i(AbstractC0868e.EnumC0869a.ON_PAUSE);
        this.f2804f = 3;
        this.f2787J = false;
        m6532u0();
        if (this.f2787J) {
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onPause()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean m6581V() {
        Fragment m6618B = m6618B();
        return m6618B != null && (m6618B.m6583U() || m6618B.m6581V());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void m6580V0(boolean z) {
        m6530v0(z);
        this.f2823y.m6416E(z);
    }

    /* renamed from: W */
    public final boolean m6579W() {
        AbstractC0814m abstractC0814m = this.f2821w;
        if (abstractC0814m == null) {
            return false;
        }
        return abstractC0814m.m6334t0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public boolean m6578W0(Menu menu) {
        boolean z = false;
        if (this.f2781D) {
            return false;
        }
        if (this.f2785H && this.f2786I) {
            z = true;
            m6528w0(menu);
        }
        return z | this.f2823y.m6414F(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m6577X() {
        this.f2823y.m6421B0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void m6576X0() {
        boolean m6338r0 = this.f2821w.m6338r0(this);
        Boolean bool = this.f2813o;
        if (bool == null || bool.booleanValue() != m6338r0) {
            this.f2813o = Boolean.valueOf(m6338r0);
            mo5991x0(m6338r0);
            this.f2823y.m6412G();
        }
    }

    /* renamed from: Y */
    public void mo6505Y(Bundle bundle) {
        this.f2787J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void m6575Y0() {
        this.f2823y.m6421B0();
        this.f2823y.m6392Q(true);
        this.f2804f = 4;
        this.f2787J = false;
        mo3780z0();
        if (this.f2787J) {
            this.f2799V.m6116i(AbstractC0868e.EnumC0869a.ON_RESUME);
            if (this.f2789L != null) {
                this.f2800W.m6167b(AbstractC0868e.EnumC0869a.ON_RESUME);
            }
            this.f2823y.m6410H();
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: Z */
    public void mo3788Z(int i, int i2, Intent intent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void m6574Z0(Bundle bundle) {
        mo3010A0(bundle);
        this.f2802Y.m5051d(bundle);
        Parcelable m6391Q0 = this.f2823y.m6391Q0();
        if (m6391Q0 != null) {
            bundle.putParcelable("android:support:fragments", m6391Q0);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0875j
    /* renamed from: a */
    public AbstractC0868e mo698a() {
        return this.f2799V;
    }

    @Deprecated
    /* renamed from: a0 */
    public void m6573a0(Activity activity) {
        this.f2787J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void m6572a1() {
        this.f2823y.m6421B0();
        this.f2823y.m6392Q(true);
        this.f2804f = 3;
        this.f2787J = false;
        mo3034B0();
        if (this.f2787J) {
            this.f2799V.m6116i(AbstractC0868e.EnumC0869a.ON_START);
            if (this.f2789L != null) {
                this.f2800W.m6167b(AbstractC0868e.EnumC0869a.ON_START);
            }
            this.f2823y.m6408I();
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: b0 */
    public void mo6000b0(Context context) {
        this.f2787J = true;
        AbstractC0810j<?> abstractC0810j = this.f2822x;
        Activity m6446e = abstractC0810j == null ? null : abstractC0810j.m6446e();
        if (m6446e != null) {
            this.f2787J = false;
            m6573a0(m6446e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void m6571b1() {
        this.f2823y.m6404K();
        if (this.f2789L != null) {
            this.f2800W.m6167b(AbstractC0868e.EnumC0869a.ON_STOP);
        }
        this.f2799V.m6116i(AbstractC0868e.EnumC0869a.ON_STOP);
        this.f2804f = 2;
        this.f2787J = false;
        mo3032C0();
        if (this.f2787J) {
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onStop()");
    }

    /* renamed from: c0 */
    public void mo5999c0(Fragment fragment) {
    }

    /* renamed from: c1 */
    public final ActivityC0797d m6570c1() {
        ActivityC0797d m6555k = m6555k();
        if (m6555k != null) {
            return m6555k;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: d */
    void m6569d() {
        C0787c c0787c = this.f2792O;
        InterfaceC0789e interfaceC0789e = null;
        if (c0787c != null) {
            c0787c.f2843p = false;
            InterfaceC0789e interfaceC0789e2 = c0787c.f2844q;
            c0787c.f2844q = null;
            interfaceC0789e = interfaceC0789e2;
        }
        if (interfaceC0789e != null) {
            interfaceC0789e.mo6304a();
        }
    }

    /* renamed from: d0 */
    public boolean m6568d0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: d1 */
    public final Context m6567d1() {
        Context m6539r = m6539r();
        if (m6539r != null) {
            return m6539r;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: e */
    public void mo3785e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2778A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2779B));
        printWriter.print(" mTag=");
        printWriter.println(this.f2780C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2804f);
        printWriter.print(" mWho=");
        printWriter.print(this.f2808j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2820v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2814p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2815q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2816r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2817s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2781D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2782E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2786I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2785H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2783F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2791N);
        if (this.f2821w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2821w);
        }
        if (this.f2822x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2822x);
        }
        if (this.f2824z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2824z);
        }
        if (this.f2809k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2809k);
        }
        if (this.f2805g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2805g);
        }
        if (this.f2806h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2806h);
        }
        Fragment m6599M = m6599M();
        if (m6599M != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m6599M);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2812n);
        }
        if (m6524z() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(m6524z());
        }
        if (this.f2788K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2788K);
        }
        if (this.f2789L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2789L);
        }
        if (m6548n() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m6548n());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(m6605J());
        }
        if (m6539r() != null) {
            AbstractC0302a.m8426b(this).mo8425a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2823y + ":");
        AbstractC0814m abstractC0814m = this.f2823y;
        abstractC0814m.m6400M(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e0 */
    public void mo3009e0(Bundle bundle) {
        this.f2787J = true;
        m6564f1(bundle);
        if (this.f2823y.m6336s0(1)) {
            return;
        }
        this.f2823y.m6333u();
    }

    /* renamed from: e1 */
    public final View m6566e1() {
        View m6597N = m6597N();
        if (m6597N != null) {
            return m6597N;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.lifecycle.InterfaceC0895w
    /* renamed from: f */
    public C0894v mo6025f() {
        AbstractC0814m abstractC0814m = this.f2821w;
        if (abstractC0814m != null) {
            return abstractC0814m.m6350l0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: f0 */
    public Animation m6565f0(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void m6564f1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f2823y.m6395O0(parcelable);
        this.f2823y.m6333u();
    }

    /* renamed from: g0 */
    public Animator m6562g0(int i, boolean z, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1 */
    public final void m6561g1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2806h;
        if (sparseArray != null) {
            this.f2789L.restoreHierarchyState(sparseArray);
            this.f2806h = null;
        }
        this.f2787J = false;
        m6614E0(bundle);
        if (this.f2787J) {
            if (this.f2789L != null) {
                this.f2800W.m6167b(AbstractC0868e.EnumC0869a.ON_CREATE);
                return;
            }
            return;
        }
        throw new C0857y("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m6560h(String str) {
        return str.equals(this.f2808j) ? this : this.f2823y.m6376Y(str);
    }

    /* renamed from: h0 */
    public void m6559h0(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void m6558h1(View view) {
        m6563g().f2828a = view;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public View mo3008i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2803Z;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void m6557i1(Animator animator) {
        m6563g().f2829b = animator;
    }

    @Override // androidx.savedstate.InterfaceC1069b
    /* renamed from: j */
    public final SavedStateRegistry mo5050j() {
        return this.f2802Y.m5053b();
    }

    /* renamed from: j0 */
    public void mo3784j0() {
        this.f2787J = true;
    }

    /* renamed from: j1 */
    public void m6556j1(Bundle bundle) {
        if (this.f2821w != null && m6579W()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2809k = bundle;
    }

    /* renamed from: k */
    public final ActivityC0797d m6555k() {
        AbstractC0810j<?> abstractC0810j = this.f2822x;
        if (abstractC0810j == null) {
            return null;
        }
        return (ActivityC0797d) abstractC0810j.m6446e();
    }

    /* renamed from: k0 */
    public void m6554k0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void m6553k1(boolean z) {
        m6563g().f2845r = z;
    }

    /* renamed from: l */
    public boolean m6552l() {
        Boolean bool;
        C0787c c0787c = this.f2792O;
        if (c0787c == null || (bool = c0787c.f2840m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: l0 */
    public void mo5998l0() {
        this.f2787J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void m6551l1(int i) {
        if (this.f2792O == null && i == 0) {
            return;
        }
        m6563g().f2831d = i;
    }

    /* renamed from: m */
    public boolean m6550m() {
        Boolean bool;
        C0787c c0787c = this.f2792O;
        if (c0787c == null || (bool = c0787c.f2839l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: m0 */
    public void mo6504m0() {
        this.f2787J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void m6549m1(int i) {
        if (this.f2792O == null && i == 0) {
            return;
        }
        m6563g();
        this.f2792O.f2832e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public View m6548n() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        return c0787c.f2828a;
    }

    /* renamed from: n0 */
    public LayoutInflater mo6503n0(Bundle bundle) {
        return m6526y(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void m6547n1(InterfaceC0789e interfaceC0789e) {
        m6563g();
        InterfaceC0789e interfaceC0789e2 = this.f2792O.f2844q;
        if (interfaceC0789e == interfaceC0789e2) {
            return;
        }
        if (interfaceC0789e != null && interfaceC0789e2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        C0787c c0787c = this.f2792O;
        if (c0787c.f2843p) {
            c0787c.f2844q = interfaceC0789e;
        }
        if (interfaceC0789e != null) {
            interfaceC0789e.mo6303b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public Animator m6546o() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        return c0787c.f2829b;
    }

    /* renamed from: o0 */
    public void m6545o0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o1 */
    public void m6544o1(int i) {
        m6563g().f2830c = i;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f2787J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m6570c1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f2787J = true;
    }

    /* renamed from: p */
    public final Bundle m6543p() {
        return this.f2809k;
    }

    @Deprecated
    /* renamed from: p0 */
    public void m6542p0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2787J = true;
    }

    /* renamed from: p1 */
    public void m6541p1() {
        AbstractC0814m abstractC0814m = this.f2821w;
        if (abstractC0814m == null || abstractC0814m.f2942o == null) {
            m6563g().f2843p = false;
        } else if (Looper.myLooper() != this.f2821w.f2942o.m6444h().getLooper()) {
            this.f2821w.f2942o.m6444h().postAtFrontOfQueue(new RunnableC0785a());
        } else {
            m6569d();
        }
    }

    /* renamed from: q */
    public final AbstractC0814m m6540q() {
        if (this.f2822x != null) {
            return this.f2823y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: q0 */
    public void mo5997q0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2787J = true;
        AbstractC0810j<?> abstractC0810j = this.f2822x;
        Activity m6446e = abstractC0810j == null ? null : abstractC0810j.m6446e();
        if (m6446e != null) {
            this.f2787J = false;
            m6542p0(m6446e, attributeSet, bundle);
        }
    }

    /* renamed from: r */
    public Context m6539r() {
        AbstractC0810j<?> abstractC0810j = this.f2822x;
        if (abstractC0810j == null) {
            return null;
        }
        return abstractC0810j.m6445g();
    }

    /* renamed from: r0 */
    public void m6538r0(boolean z) {
    }

    /* renamed from: s */
    public Object m6537s() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        return c0787c.f2833f;
    }

    /* renamed from: s0 */
    public boolean m6536s0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public AbstractC0729m m6535t() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        return c0787c.f2841n;
    }

    /* renamed from: t0 */
    public void m6534t0(Menu menu) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2808j);
        sb.append(")");
        if (this.f2778A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2778A));
        }
        if (this.f2780C != null) {
            sb.append(" ");
            sb.append(this.f2780C);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public Object m6533u() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        return c0787c.f2835h;
    }

    /* renamed from: u0 */
    public void m6532u0() {
        this.f2787J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public AbstractC0729m m6531v() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return null;
        }
        return c0787c.f2842o;
    }

    /* renamed from: v0 */
    public void m6530v0(boolean z) {
    }

    /* renamed from: w */
    public final Object m6529w() {
        AbstractC0810j<?> abstractC0810j = this.f2822x;
        if (abstractC0810j == null) {
            return null;
        }
        return abstractC0810j.mo6442l();
    }

    /* renamed from: w0 */
    public void m6528w0(Menu menu) {
    }

    /* renamed from: x */
    public final int m6527x() {
        return this.f2778A;
    }

    /* renamed from: x0 */
    public void mo5991x0(boolean z) {
    }

    @Deprecated
    /* renamed from: y */
    public LayoutInflater m6526y(Bundle bundle) {
        AbstractC0810j<?> abstractC0810j = this.f2822x;
        if (abstractC0810j != null) {
            LayoutInflater mo6441m = abstractC0810j.mo6441m();
            C0239f.m8698b(mo6441m, this.f2823y.m6360g0());
            return mo6441m;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: y0 */
    public void m6525y0(int i, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m6524z() {
        C0787c c0787c = this.f2792O;
        if (c0787c == null) {
            return 0;
        }
        return c0787c.f2831d;
    }

    /* renamed from: z0 */
    public void mo3780z0() {
        this.f2787J = true;
    }
}
