package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0495a;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.widget.Toolbar;
import p000a.p001a.C0000a;
import p000a.p001a.C0004e;
import p000a.p001a.C0005f;
import p000a.p001a.C0007h;
import p000a.p001a.C0009j;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.C0267w;
import p000a.p019g.p028k.C0272y;
/* renamed from: androidx.appcompat.widget.x0 */
/* loaded from: classes.dex */
public class C0667x0 implements InterfaceC0590d0 {

    /* renamed from: a */
    Toolbar f2238a;

    /* renamed from: b */
    private int f2239b;

    /* renamed from: c */
    private View f2240c;

    /* renamed from: d */
    private View f2241d;

    /* renamed from: e */
    private Drawable f2242e;

    /* renamed from: f */
    private Drawable f2243f;

    /* renamed from: g */
    private Drawable f2244g;

    /* renamed from: h */
    private boolean f2245h;

    /* renamed from: i */
    CharSequence f2246i;

    /* renamed from: j */
    private CharSequence f2247j;

    /* renamed from: k */
    private CharSequence f2248k;

    /* renamed from: l */
    Window.Callback f2249l;

    /* renamed from: m */
    boolean f2250m;

    /* renamed from: n */
    private C0579c f2251n;

    /* renamed from: o */
    private int f2252o;

    /* renamed from: p */
    private int f2253p;

    /* renamed from: q */
    private Drawable f2254q;

    /* renamed from: androidx.appcompat.widget.x0$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0668a implements View.OnClickListener {

        /* renamed from: f */
        final C0495a f2255f;

        View$OnClickListenerC0668a() {
            this.f2255f = new C0495a(C0667x0.this.f2238a.getContext(), 0, 16908332, 0, 0, C0667x0.this.f2246i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0667x0 c0667x0 = C0667x0.this;
            Window.Callback callback = c0667x0.f2249l;
            if (callback == null || !c0667x0.f2250m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f2255f);
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$b */
    /* loaded from: classes.dex */
    class C0669b extends C0272y {

        /* renamed from: a */
        private boolean f2257a = false;

        /* renamed from: b */
        final /* synthetic */ int f2258b;

        C0669b(int i) {
            this.f2258b = i;
        }

        @Override // p000a.p019g.p028k.C0272y, p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: a */
        public void mo7172a(View view) {
            this.f2257a = true;
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: b */
        public void mo7171b(View view) {
            if (this.f2257a) {
                return;
            }
            C0667x0.this.f2238a.setVisibility(this.f2258b);
        }

        @Override // p000a.p019g.p028k.C0272y, p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: c */
        public void mo7170c(View view) {
            C0667x0.this.f2238a.setVisibility(0);
        }
    }

    public C0667x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0007h.abc_action_bar_up_description, C0004e.abc_ic_ab_back_material);
    }

    public C0667x0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f2252o = 0;
        this.f2253p = 0;
        this.f2238a = toolbar;
        this.f2246i = toolbar.getTitle();
        this.f2247j = toolbar.getSubtitle();
        this.f2245h = this.f2246i != null;
        this.f2244g = toolbar.getNavigationIcon();
        C0665w0 m7213u = C0665w0.m7213u(toolbar.getContext(), null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        this.f2254q = m7213u.m7227g(C0009j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m7218p = m7213u.m7218p(C0009j.ActionBar_title);
            if (!TextUtils.isEmpty(m7218p)) {
                m7203G(m7218p);
            }
            CharSequence m7218p2 = m7213u.m7218p(C0009j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m7218p2)) {
                m7204F(m7218p2);
            }
            Drawable m7227g = m7213u.m7227g(C0009j.ActionBar_logo);
            if (m7227g != null) {
                m7208B(m7227g);
            }
            Drawable m7227g2 = m7213u.m7227g(C0009j.ActionBar_icon);
            if (m7227g2 != null) {
                setIcon(m7227g2);
            }
            if (this.f2244g == null && (drawable = this.f2254q) != null) {
                m7205E(drawable);
            }
            mo7183p(m7213u.m7223k(C0009j.ActionBar_displayOptions, 0));
            int m7220n = m7213u.m7220n(C0009j.ActionBar_customNavigationLayout, 0);
            if (m7220n != 0) {
                m7173z(LayoutInflater.from(this.f2238a.getContext()).inflate(m7220n, (ViewGroup) this.f2238a, false));
                mo7183p(this.f2239b | 16);
            }
            int m7221m = m7213u.m7221m(C0009j.ActionBar_height, 0);
            if (m7221m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2238a.getLayoutParams();
                layoutParams.height = m7221m;
                this.f2238a.setLayoutParams(layoutParams);
            }
            int m7229e = m7213u.m7229e(C0009j.ActionBar_contentInsetStart, -1);
            int m7229e2 = m7213u.m7229e(C0009j.ActionBar_contentInsetEnd, -1);
            if (m7229e >= 0 || m7229e2 >= 0) {
                this.f2238a.m7616H(Math.max(m7229e, 0), Math.max(m7229e2, 0));
            }
            int m7220n2 = m7213u.m7220n(C0009j.ActionBar_titleTextStyle, 0);
            if (m7220n2 != 0) {
                Toolbar toolbar2 = this.f2238a;
                toolbar2.m7612L(toolbar2.getContext(), m7220n2);
            }
            int m7220n3 = m7213u.m7220n(C0009j.ActionBar_subtitleTextStyle, 0);
            if (m7220n3 != 0) {
                Toolbar toolbar3 = this.f2238a;
                toolbar3.m7613K(toolbar3.getContext(), m7220n3);
            }
            int m7220n4 = m7213u.m7220n(C0009j.ActionBar_popupTheme, 0);
            if (m7220n4 != 0) {
                this.f2238a.setPopupTheme(m7220n4);
            }
        } else {
            this.f2239b = m7174y();
        }
        m7213u.m7212v();
        m7209A(i);
        this.f2248k = this.f2238a.getNavigationContentDescription();
        this.f2238a.setNavigationOnClickListener(new View$OnClickListenerC0668a());
    }

    /* renamed from: H */
    private void m7202H(CharSequence charSequence) {
        this.f2246i = charSequence;
        if ((this.f2239b & 8) != 0) {
            this.f2238a.setTitle(charSequence);
        }
    }

    /* renamed from: I */
    private void m7201I() {
        if ((this.f2239b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2248k)) {
                this.f2238a.setNavigationContentDescription(this.f2253p);
            } else {
                this.f2238a.setNavigationContentDescription(this.f2248k);
            }
        }
    }

    /* renamed from: J */
    private void m7200J() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f2239b & 4) != 0) {
            toolbar = this.f2238a;
            drawable = this.f2244g;
            if (drawable == null) {
                drawable = this.f2254q;
            }
        } else {
            toolbar = this.f2238a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: K */
    private void m7199K() {
        Drawable drawable;
        int i = this.f2239b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2243f) == null) {
            drawable = this.f2242e;
        }
        this.f2238a.setLogo(drawable);
    }

    /* renamed from: y */
    private int m7174y() {
        if (this.f2238a.getNavigationIcon() != null) {
            this.f2254q = this.f2238a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    /* renamed from: A */
    public void m7209A(int i) {
        if (i == this.f2253p) {
            return;
        }
        this.f2253p = i;
        if (TextUtils.isEmpty(this.f2238a.getNavigationContentDescription())) {
            m7207C(this.f2253p);
        }
    }

    /* renamed from: B */
    public void m7208B(Drawable drawable) {
        this.f2243f = drawable;
        m7199K();
    }

    /* renamed from: C */
    public void m7207C(int i) {
        m7206D(i == 0 ? null : mo7196c().getString(i));
    }

    /* renamed from: D */
    public void m7206D(CharSequence charSequence) {
        this.f2248k = charSequence;
        m7201I();
    }

    /* renamed from: E */
    public void m7205E(Drawable drawable) {
        this.f2244g = drawable;
        m7200J();
    }

    /* renamed from: F */
    public void m7204F(CharSequence charSequence) {
        this.f2247j = charSequence;
        if ((this.f2239b & 8) != 0) {
            this.f2238a.setSubtitle(charSequence);
        }
    }

    /* renamed from: G */
    public void m7203G(CharSequence charSequence) {
        this.f2245h = true;
        m7202H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: a */
    public void mo7198a(Menu menu, InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
        if (this.f2251n == null) {
            C0579c c0579c = new C0579c(this.f2238a.getContext());
            this.f2251n = c0579c;
            c0579c.m7877p(C0005f.action_menu_presenter);
        }
        this.f2251n.mo7580k(interfaceC0523a);
        this.f2238a.m7615I((C0507g) menu, this.f2251n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: b */
    public boolean mo7197b() {
        return this.f2238a.m7623A();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: c */
    public Context mo7196c() {
        return this.f2238a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    public void collapseActionView() {
        this.f2238a.m7604e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: d */
    public void mo7195d() {
        this.f2250m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: e */
    public boolean mo7194e() {
        return this.f2238a.m7583z();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: f */
    public boolean mo7193f() {
        return this.f2238a.m7586w();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: g */
    public boolean mo7192g() {
        return this.f2238a.m7609O();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    public CharSequence getTitle() {
        return this.f2238a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: h */
    public boolean mo7191h() {
        return this.f2238a.m7605d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: i */
    public void mo7190i() {
        this.f2238a.m7603f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: j */
    public void mo7189j(InterfaceC0522m.InterfaceC0523a interfaceC0523a, C0507g.InterfaceC0508a interfaceC0508a) {
        this.f2238a.m7614J(interfaceC0523a, interfaceC0508a);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: k */
    public void mo7188k(int i) {
        this.f2238a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: l */
    public void mo7187l(C0635p0 c0635p0) {
        View view = this.f2240c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2238a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2240c);
            }
        }
        this.f2240c = c0635p0;
        if (c0635p0 == null || this.f2252o != 2) {
            return;
        }
        this.f2238a.addView(c0635p0, 0);
        Toolbar.C0567e c0567e = (Toolbar.C0567e) this.f2240c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0567e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0567e).height = -2;
        c0567e.f1288a = 8388691;
        c0635p0.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: m */
    public ViewGroup mo7186m() {
        return this.f2238a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: n */
    public void mo7185n(boolean z) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: o */
    public boolean mo7184o() {
        return this.f2238a.m7587v();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: p */
    public void mo7183p(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f2239b ^ i;
        this.f2239b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m7201I();
                }
                m7200J();
            }
            if ((i2 & 3) != 0) {
                m7199K();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2238a.setTitle(this.f2246i);
                    toolbar = this.f2238a;
                    charSequence = this.f2247j;
                } else {
                    charSequence = null;
                    this.f2238a.setTitle((CharSequence) null);
                    toolbar = this.f2238a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f2241d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f2238a.addView(view);
            } else {
                this.f2238a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: q */
    public int mo7182q() {
        return this.f2239b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: r */
    public Menu mo7181r() {
        return this.f2238a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: s */
    public void mo7180s(int i) {
        m7208B(i != 0 ? C0010a.m9577d(mo7196c(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    public void setIcon(int i) {
        setIcon(i != 0 ? C0010a.m9577d(mo7196c(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    public void setIcon(Drawable drawable) {
        this.f2242e = drawable;
        m7199K();
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    public void setWindowCallback(Window.Callback callback) {
        this.f2249l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f2245h) {
            return;
        }
        m7202H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: t */
    public int mo7179t() {
        return this.f2252o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: u */
    public C0267w mo7178u(int i, long j) {
        C0267w m8632c = C0252s.m8632c(this.f2238a);
        m8632c.m8538a(i == 0 ? 1.0f : 0.0f);
        m8632c.m8535d(j);
        m8632c.m8533f(new C0669b(i));
        return m8632c;
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: v */
    public void mo7177v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: w */
    public void mo7176w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0590d0
    /* renamed from: x */
    public void mo7175x(boolean z) {
        this.f2238a.setCollapsible(z);
    }

    /* renamed from: z */
    public void m7173z(View view) {
        View view2 = this.f2241d;
        if (view2 != null && (this.f2239b & 16) != 0) {
            this.f2238a.removeView(view2);
        }
        this.f2241d = view;
        if (view == null || (this.f2239b & 16) == 0) {
            return;
        }
        this.f2238a.addView(view);
    }
}
