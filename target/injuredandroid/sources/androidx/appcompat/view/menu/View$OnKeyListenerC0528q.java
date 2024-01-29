package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.widget.C0620l0;
import p000a.p001a.C0003d;
import p000a.p001a.C0006g;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0528q extends AbstractC0519k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0522m, View.OnKeyListener {

    /* renamed from: A */
    private static final int f1672A = C0006g.abc_popup_menu_item_layout;

    /* renamed from: g */
    private final Context f1673g;

    /* renamed from: h */
    private final C0507g f1674h;

    /* renamed from: i */
    private final C0506f f1675i;

    /* renamed from: j */
    private final boolean f1676j;

    /* renamed from: k */
    private final int f1677k;

    /* renamed from: l */
    private final int f1678l;

    /* renamed from: m */
    private final int f1679m;

    /* renamed from: n */
    final C0620l0 f1680n;

    /* renamed from: q */
    private PopupWindow.OnDismissListener f1683q;

    /* renamed from: r */
    private View f1684r;

    /* renamed from: s */
    View f1685s;

    /* renamed from: t */
    private InterfaceC0522m.InterfaceC0523a f1686t;

    /* renamed from: u */
    ViewTreeObserver f1687u;

    /* renamed from: v */
    private boolean f1688v;

    /* renamed from: w */
    private boolean f1689w;

    /* renamed from: x */
    private int f1690x;

    /* renamed from: z */
    private boolean f1692z;

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f1681o = new ViewTreeObserver$OnGlobalLayoutListenerC0529a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f1682p = new View$OnAttachStateChangeListenerC0530b();

    /* renamed from: y */
    private int f1691y = 0;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0529a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0529a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0528q.this.mo7381c() || View$OnKeyListenerC0528q.this.f1680n.m7368x()) {
                return;
            }
            View view = View$OnKeyListenerC0528q.this.f1685s;
            if (view == null || !view.isShown()) {
                View$OnKeyListenerC0528q.this.dismiss();
            } else {
                View$OnKeyListenerC0528q.this.f1680n.mo7383a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0530b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0530b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0528q.this.f1687u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0528q.this.f1687u = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0528q view$OnKeyListenerC0528q = View$OnKeyListenerC0528q.this;
                view$OnKeyListenerC0528q.f1687u.removeGlobalOnLayoutListener(view$OnKeyListenerC0528q.f1681o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0528q(Context context, C0507g c0507g, View view, int i, int i2, boolean z) {
        this.f1673g = context;
        this.f1674h = c0507g;
        this.f1676j = z;
        this.f1675i = new C0506f(c0507g, LayoutInflater.from(context), this.f1676j, f1672A);
        this.f1678l = i;
        this.f1679m = i2;
        Resources resources = context.getResources();
        this.f1677k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0003d.abc_config_prefDialogWidth));
        this.f1684r = view;
        this.f1680n = new C0620l0(this.f1673g, null, this.f1678l, this.f1679m);
        c0507g.m7830c(this, context);
    }

    /* renamed from: z */
    private boolean m7741z() {
        View view;
        if (mo7381c()) {
            return true;
        }
        if (this.f1688v || (view = this.f1684r) == null) {
            return false;
        }
        this.f1685s = view;
        this.f1680n.m7390G(this);
        this.f1680n.m7389H(this);
        this.f1680n.m7391F(true);
        View view2 = this.f1685s;
        boolean z = this.f1687u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1687u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1681o);
        }
        view2.addOnAttachStateChangeListener(this.f1682p);
        this.f1680n.m7366z(view2);
        this.f1680n.m7394C(this.f1691y);
        if (!this.f1689w) {
            this.f1690x = AbstractC0519k.m7766o(this.f1675i, null, this.f1673g, this.f1677k);
            this.f1689w = true;
        }
        this.f1680n.m7395B(this.f1690x);
        this.f1680n.m7392E(2);
        this.f1680n.m7393D(m7767n());
        this.f1680n.mo7383a();
        ListView mo7378h = this.f1680n.mo7378h();
        mo7378h.setOnKeyListener(this);
        if (this.f1692z && this.f1674h.m7811x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1673g).inflate(C0006g.abc_popup_menu_header_item_layout, (ViewGroup) mo7378h, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1674h.m7811x());
            }
            frameLayout.setEnabled(false);
            mo7378h.addHeaderView(frameLayout, null, false);
        }
        this.f1680n.mo7234p(this.f1675i);
        this.f1680n.mo7383a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: a */
    public void mo7383a() {
        if (!m7741z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: b */
    public void mo7517b(C0507g c0507g, boolean z) {
        if (c0507g != this.f1674h) {
            return;
        }
        dismiss();
        InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1686t;
        if (interfaceC0523a != null) {
            interfaceC0523a.mo7494b(c0507g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: c */
    public boolean mo7381c() {
        return !this.f1688v && this.f1680n.mo7381c();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    public void dismiss() {
        if (mo7381c()) {
            this.f1680n.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: e */
    public boolean mo7514e(SubMenuC0531r subMenuC0531r) {
        if (subMenuC0531r.hasVisibleItems()) {
            C0520l c0520l = new C0520l(this.f1673g, subMenuC0531r, this.f1685s, this.f1676j, this.f1678l, this.f1679m);
            c0520l.m7754j(this.f1686t);
            c0520l.m7757g(AbstractC0519k.m7764x(subMenuC0531r));
            c0520l.m7755i(this.f1683q);
            this.f1683q = null;
            this.f1674h.m7826e(false);
            int m7380d = this.f1680n.m7380d();
            int m7375n = this.f1680n.m7375n();
            if ((Gravity.getAbsoluteGravity(this.f1691y, C0252s.m8592w(this.f1684r)) & 7) == 5) {
                m7380d += this.f1684r.getWidth();
            }
            if (c0520l.m7750n(m7380d, m7375n)) {
                InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1686t;
                if (interfaceC0523a != null) {
                    interfaceC0523a.mo7493c(subMenuC0531r);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: f */
    public void mo7513f(boolean z) {
        this.f1689w = false;
        C0506f c0506f = this.f1675i;
        if (c0506f != null) {
            c0506f.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: g */
    public boolean mo7512g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: h */
    public ListView mo7378h() {
        return this.f1680n.mo7378h();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: k */
    public void mo7580k(InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
        this.f1686t = interfaceC0523a;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: l */
    public void mo7749l(C0507g c0507g) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1688v = true;
        this.f1674h.close();
        ViewTreeObserver viewTreeObserver = this.f1687u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1687u = this.f1685s.getViewTreeObserver();
            }
            this.f1687u.removeGlobalOnLayoutListener(this.f1681o);
            this.f1687u = null;
        }
        this.f1685s.removeOnAttachStateChangeListener(this.f1682p);
        PopupWindow.OnDismissListener onDismissListener = this.f1683q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: p */
    public void mo7748p(View view) {
        this.f1684r = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: r */
    public void mo7747r(boolean z) {
        this.f1675i.m7856d(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: s */
    public void mo7746s(int i) {
        this.f1691y = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: t */
    public void mo7745t(int i) {
        this.f1680n.m7376l(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: u */
    public void mo7744u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1683q = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: v */
    public void mo7743v(boolean z) {
        this.f1692z = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: w */
    public void mo7742w(int i) {
        this.f1680n.m7377j(i);
    }
}
