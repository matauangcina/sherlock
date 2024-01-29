package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0835t;
import androidx.fragment.app.C0807g;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0793c;
import androidx.fragment.app.Fragment;
import androidx.navigation.AbstractC0952r;
import androidx.navigation.C0930m;
import androidx.navigation.C0951q;
import androidx.navigation.C0957u;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C0912a;
/* renamed from: androidx.navigation.fragment.b */
/* loaded from: classes.dex */
public class C0915b extends Fragment {

    /* renamed from: b0 */
    private C0930m f3210b0;

    /* renamed from: c0 */
    private Boolean f3211c0 = null;

    /* renamed from: d0 */
    private View f3212d0;

    /* renamed from: e0 */
    private int f3213e0;

    /* renamed from: f0 */
    private boolean f3214f0;

    /* renamed from: r1 */
    public static NavController m5995r1(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.m6618B()) {
            if (fragment2 instanceof C0915b) {
                return ((C0915b) fragment2).m5993t1();
            }
            Fragment m6354j0 = fragment2.m6617C().m6354j0();
            if (m6354j0 instanceof C0915b) {
                return ((C0915b) m6354j0).m5993t1();
            }
        }
        View m6597N = fragment.m6597N();
        if (m6597N != null) {
            return C0951q.m5859a(m6597N);
        }
        Dialog m6498u1 = fragment instanceof DialogInterface$OnCancelListenerC0793c ? ((DialogInterface$OnCancelListenerC0793c) fragment).m6498u1() : null;
        if (m6498u1 == null || m6498u1.getWindow() == null) {
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }
        return C0951q.m5859a(m6498u1.getWindow().getDecorView());
    }

    /* renamed from: s1 */
    private int m5994s1() {
        int m6527x = m6527x();
        return (m6527x == 0 || m6527x == -1) ? C0916c.nav_host_fragment_container : m6527x;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public void mo3010A0(Bundle bundle) {
        super.mo3010A0(bundle);
        Bundle m6060q = this.f3210b0.m6060q();
        if (m6060q != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", m6060q);
        }
        if (this.f3214f0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.f3213e0;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public void mo6001D0(View view, Bundle bundle) {
        super.mo6001D0(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        C0951q.m5856d(view, this.f3210b0);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f3212d0 = view2;
            if (view2.getId() == m6527x()) {
                C0951q.m5856d(this.f3212d0, this.f3210b0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b0 */
    public void mo6000b0(Context context) {
        super.mo6000b0(context);
        if (this.f3214f0) {
            AbstractC0835t m6357i = m6617C().m6357i();
            m6357i.mo6230r(this);
            m6357i.mo6240h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: c0 */
    public void mo5999c0(Fragment fragment) {
        super.mo5999c0(fragment);
        ((DialogFragmentNavigator) this.f3210b0.m6068i().m5847d(DialogFragmentNavigator.class)).m6011h(fragment);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e0 */
    public void mo3009e0(Bundle bundle) {
        Bundle bundle2;
        C0930m c0930m = new C0930m(m6567d1());
        this.f3210b0 = c0930m;
        c0930m.mo5936u(this);
        this.f3210b0.mo5935v(m6570c1().mo6484i());
        C0930m c0930m2 = this.f3210b0;
        Boolean bool = this.f3211c0;
        c0930m2.mo5937b(bool != null && bool.booleanValue());
        this.f3211c0 = null;
        this.f3210b0.mo5934w(mo6025f());
        m5992u1(this.f3210b0);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f3214f0 = true;
                AbstractC0835t m6357i = m6617C().m6357i();
                m6357i.mo6230r(this);
                m6357i.mo6240h();
            }
            this.f3213e0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f3210b0.m6061p(bundle2);
        }
        int i = this.f3213e0;
        if (i != 0) {
            this.f3210b0.m6059r(i);
        } else {
            Bundle m6543p = m6543p();
            int i2 = m6543p != null ? m6543p.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = m6543p != null ? m6543p.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i2 != 0) {
                this.f3210b0.m6058s(i2, bundle3);
            }
        }
        super.mo3009e0(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: i0 */
    public View mo3008i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0807g c0807g = new C0807g(layoutInflater.getContext());
        c0807g.setId(m5994s1());
        return c0807g;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: l0 */
    public void mo5998l0() {
        super.mo5998l0();
        View view = this.f3212d0;
        if (view != null && C0951q.m5859a(view) == this.f3210b0) {
            C0951q.m5856d(this.f3212d0, null);
        }
        this.f3212d0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: q0 */
    public void mo5997q0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.mo5997q0(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0957u.NavHost);
        int resourceId = obtainStyledAttributes.getResourceId(C0957u.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f3213e0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0917d.NavHostFragment);
        if (obtainStyledAttributes2.getBoolean(C0917d.NavHostFragment_defaultNavHost, false)) {
            this.f3214f0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Deprecated
    /* renamed from: q1 */
    protected AbstractC0952r<? extends C0912a.C0913a> m5996q1() {
        return new C0912a(m6567d1(), m6540q(), m5994s1());
    }

    /* renamed from: t1 */
    public final NavController m5993t1() {
        C0930m c0930m = this.f3210b0;
        if (c0930m != null) {
            return c0930m;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    /* renamed from: u1 */
    protected void m5992u1(NavController navController) {
        navController.m6068i().m5850a(new DialogFragmentNavigator(m6567d1(), m6540q()));
        navController.m6068i().m5850a(m5996q1());
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: x0 */
    public void mo5991x0(boolean z) {
        C0930m c0930m = this.f3210b0;
        if (c0930m != null) {
            c0930m.mo5937b(z);
        } else {
            this.f3211c0 = Boolean.valueOf(z);
        }
    }
}
