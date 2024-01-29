package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0496b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.C0511i;
import androidx.appcompat.view.menu.C0520l;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.appcompat.view.menu.InterfaceC0527p;
import androidx.appcompat.view.menu.SubMenuC0531r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0759a;
import java.util.ArrayList;
import p000a.p001a.C0000a;
import p000a.p001a.C0006g;
import p000a.p001a.p007n.C0029a;
import p000a.p019g.p028k.AbstractC0212b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0579c extends AbstractC0496b implements AbstractC0212b.InterfaceC0213a {

    /* renamed from: A */
    private final SparseBooleanArray f1950A;

    /* renamed from: B */
    C0585e f1951B;

    /* renamed from: C */
    C0580a f1952C;

    /* renamed from: D */
    RunnableC0582c f1953D;

    /* renamed from: E */
    private C0581b f1954E;

    /* renamed from: F */
    final C0586f f1955F;

    /* renamed from: G */
    int f1956G;

    /* renamed from: n */
    C0583d f1957n;

    /* renamed from: o */
    private Drawable f1958o;

    /* renamed from: p */
    private boolean f1959p;

    /* renamed from: q */
    private boolean f1960q;

    /* renamed from: r */
    private boolean f1961r;

    /* renamed from: s */
    private int f1962s;

    /* renamed from: t */
    private int f1963t;

    /* renamed from: u */
    private int f1964u;

    /* renamed from: v */
    private boolean f1965v;

    /* renamed from: w */
    private boolean f1966w;

    /* renamed from: x */
    private boolean f1967x;

    /* renamed from: y */
    private boolean f1968y;

    /* renamed from: z */
    private int f1969z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public class C0580a extends C0520l {
        public C0580a(Context context, SubMenuC0531r subMenuC0531r, View view) {
            super(context, subMenuC0531r, view, false, C0000a.actionOverflowMenuStyle);
            if (!((C0511i) subMenuC0531r.getItem()).m7793l()) {
                View view2 = C0579c.this.f1957n;
                m7758f(view2 == null ? (View) ((AbstractC0496b) C0579c.this).f1526m : view2);
            }
            m7754j(C0579c.this.f1955F);
        }

        @Override // androidx.appcompat.view.menu.C0520l
        /* renamed from: e */
        protected void mo7495e() {
            C0579c c0579c = C0579c.this;
            c0579c.f1952C = null;
            c0579c.f1956G = 0;
            super.mo7495e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    private class C0581b extends ActionMenuItemView.AbstractC0494b {
        C0581b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0494b
        /* renamed from: a */
        public InterfaceC0527p mo7498a() {
            C0580a c0580a = C0579c.this.f1952C;
            if (c0580a != null) {
                return c0580a.m7760c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0582c implements Runnable {

        /* renamed from: f */
        private C0585e f1972f;

        public RunnableC0582c(C0585e c0585e) {
            this.f1972f = c0585e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0496b) C0579c.this).f1521h != null) {
                ((AbstractC0496b) C0579c.this).f1521h.m7828d();
            }
            View view = (View) ((AbstractC0496b) C0579c.this).f1526m;
            if (view != null && view.getWindowToken() != null && this.f1972f.m7751m()) {
                C0579c.this.f1951B = this.f1972f;
            }
            C0579c.this.f1953D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    public class C0583d extends C0632o implements ActionMenuView.InterfaceC0539a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes.dex */
        class C0584a extends AbstractView$OnTouchListenerC0602h0 {
            C0584a(View view, C0579c c0579c) {
                super(view);
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0
            /* renamed from: b */
            public InterfaceC0527p mo7253b() {
                C0585e c0585e = C0579c.this.f1951B;
                if (c0585e == null) {
                    return null;
                }
                return c0585e.m7760c();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0
            /* renamed from: c */
            public boolean mo7252c() {
                C0579c.this.m7518J();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0
            /* renamed from: d */
            public boolean mo7448d() {
                C0579c c0579c = C0579c.this;
                if (c0579c.f1953D != null) {
                    return false;
                }
                c0579c.m7527A();
                return true;
            }
        }

        public C0583d(Context context) {
            super(context, null, C0000a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0673y0.m7140a(this, getContentDescription());
            setOnTouchListener(new C0584a(this, C0579c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0539a
        /* renamed from: a */
        public boolean mo7497a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0539a
        /* renamed from: b */
        public boolean mo7496b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0579c.this.m7518J();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0759a.m6750l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes.dex */
    public class C0585e extends C0520l {
        public C0585e(Context context, C0507g c0507g, View view, boolean z) {
            super(context, c0507g, view, z, C0000a.actionOverflowMenuStyle);
            m7756h(8388613);
            m7754j(C0579c.this.f1955F);
        }

        @Override // androidx.appcompat.view.menu.C0520l
        /* renamed from: e */
        protected void mo7495e() {
            if (((AbstractC0496b) C0579c.this).f1521h != null) {
                ((AbstractC0496b) C0579c.this).f1521h.close();
            }
            C0579c.this.f1951B = null;
            super.mo7495e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes.dex */
    private class C0586f implements InterfaceC0522m.InterfaceC0523a {
        C0586f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: b */
        public void mo7494b(C0507g c0507g, boolean z) {
            if (c0507g instanceof SubMenuC0531r) {
                c0507g.mo7740D().m7826e(false);
            }
            InterfaceC0522m.InterfaceC0523a m7878m = C0579c.this.m7878m();
            if (m7878m != null) {
                m7878m.mo7494b(c0507g, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: c */
        public boolean mo7493c(C0507g c0507g) {
            if (c0507g == null) {
                return false;
            }
            C0579c.this.f1956G = ((SubMenuC0531r) c0507g).getItem().getItemId();
            InterfaceC0522m.InterfaceC0523a m7878m = C0579c.this.m7878m();
            if (m7878m != null) {
                return m7878m.mo7493c(c0507g);
            }
            return false;
        }
    }

    public C0579c(Context context) {
        super(context, C0006g.abc_action_menu_layout, C0006g.abc_action_menu_item_layout);
        this.f1950A = new SparseBooleanArray();
        this.f1955F = new C0586f();
    }

    /* renamed from: y */
    private View m7500y(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1526m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0524n.InterfaceC0525a) && ((InterfaceC0524n.InterfaceC0525a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public boolean m7527A() {
        InterfaceC0524n interfaceC0524n;
        RunnableC0582c runnableC0582c = this.f1953D;
        if (runnableC0582c != null && (interfaceC0524n = this.f1526m) != null) {
            ((View) interfaceC0524n).removeCallbacks(runnableC0582c);
            this.f1953D = null;
            return true;
        }
        C0585e c0585e = this.f1951B;
        if (c0585e != null) {
            c0585e.m7761b();
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m7526B() {
        C0580a c0580a = this.f1952C;
        if (c0580a != null) {
            c0580a.m7761b();
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m7525C() {
        return this.f1953D != null || m7524D();
    }

    /* renamed from: D */
    public boolean m7524D() {
        C0585e c0585e = this.f1951B;
        return c0585e != null && c0585e.m7759d();
    }

    /* renamed from: E */
    public void m7523E(Configuration configuration) {
        if (!this.f1965v) {
            this.f1964u = C0029a.m9507b(this.f1520g).m9505d();
        }
        C0507g c0507g = this.f1521h;
        if (c0507g != null) {
            c0507g.m7849K(true);
        }
    }

    /* renamed from: F */
    public void m7522F(boolean z) {
        this.f1968y = z;
    }

    /* renamed from: G */
    public void m7521G(ActionMenuView actionMenuView) {
        this.f1526m = actionMenuView;
        actionMenuView.mo2797b(this.f1521h);
    }

    /* renamed from: H */
    public void m7520H(Drawable drawable) {
        C0583d c0583d = this.f1957n;
        if (c0583d != null) {
            c0583d.setImageDrawable(drawable);
            return;
        }
        this.f1959p = true;
        this.f1958o = drawable;
    }

    /* renamed from: I */
    public void m7519I(boolean z) {
        this.f1960q = z;
        this.f1961r = true;
    }

    /* renamed from: J */
    public boolean m7518J() {
        C0507g c0507g;
        if (!this.f1960q || m7524D() || (c0507g = this.f1521h) == null || this.f1526m == null || this.f1953D != null || c0507g.m7809z().isEmpty()) {
            return false;
        }
        RunnableC0582c runnableC0582c = new RunnableC0582c(new C0585e(this.f1520g, this.f1521h, this.f1957n, true));
        this.f1953D = runnableC0582c;
        ((View) this.f1526m).post(runnableC0582c);
        super.mo7514e(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b, androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: b */
    public void mo7517b(C0507g c0507g, boolean z) {
        m7501x();
        super.mo7517b(c0507g, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b
    /* renamed from: c */
    public void mo7516c(C0511i c0511i, InterfaceC0524n.InterfaceC0525a interfaceC0525a) {
        interfaceC0525a.mo2798e(c0511i, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0525a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1526m);
        if (this.f1954E == null) {
            this.f1954E = new C0581b();
        }
        actionMenuItemView.setPopupCallback(this.f1954E);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b, androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: d */
    public void mo7515d(Context context, C0507g c0507g) {
        super.mo7515d(context, c0507g);
        Resources resources = context.getResources();
        C0029a m9507b = C0029a.m9507b(context);
        if (!this.f1961r) {
            this.f1960q = m9507b.m9501h();
        }
        if (!this.f1967x) {
            this.f1962s = m9507b.m9506c();
        }
        if (!this.f1965v) {
            this.f1964u = m9507b.m9505d();
        }
        int i = this.f1962s;
        if (this.f1960q) {
            if (this.f1957n == null) {
                C0583d c0583d = new C0583d(this.f1519f);
                this.f1957n = c0583d;
                if (this.f1959p) {
                    c0583d.setImageDrawable(this.f1958o);
                    this.f1958o = null;
                    this.f1959p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1957n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1957n.getMeasuredWidth();
        } else {
            this.f1957n = null;
        }
        this.f1963t = i;
        this.f1969z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b, androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: e */
    public boolean mo7514e(SubMenuC0531r subMenuC0531r) {
        boolean z = false;
        if (subMenuC0531r.hasVisibleItems()) {
            SubMenuC0531r subMenuC0531r2 = subMenuC0531r;
            while (subMenuC0531r2.m7735e0() != this.f1521h) {
                subMenuC0531r2 = (SubMenuC0531r) subMenuC0531r2.m7735e0();
            }
            View m7500y = m7500y(subMenuC0531r2.getItem());
            if (m7500y == null) {
                return false;
            }
            subMenuC0531r.getItem().getItemId();
            int size = subMenuC0531r.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = subMenuC0531r.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            C0580a c0580a = new C0580a(this.f1520g, subMenuC0531r, m7500y);
            this.f1952C = c0580a;
            c0580a.m7757g(z);
            this.f1952C.m7753k();
            super.mo7514e(subMenuC0531r);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b, androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: f */
    public void mo7513f(boolean z) {
        super.mo7513f(z);
        ((View) this.f1526m).requestLayout();
        C0507g c0507g = this.f1521h;
        boolean z2 = false;
        if (c0507g != null) {
            ArrayList<C0511i> m7815s = c0507g.m7815s();
            int size = m7815s.size();
            for (int i = 0; i < size; i++) {
                AbstractC0212b mo7803b = m7815s.get(i).mo7803b();
                if (mo7803b != null) {
                    mo7803b.m8802i(this);
                }
            }
        }
        C0507g c0507g2 = this.f1521h;
        ArrayList<C0511i> m7809z = c0507g2 != null ? c0507g2.m7809z() : null;
        if (this.f1960q && m7809z != null) {
            int size2 = m7809z.size();
            if (size2 == 1) {
                z2 = !m7809z.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0583d c0583d = this.f1957n;
        if (z2) {
            if (c0583d == null) {
                this.f1957n = new C0583d(this.f1519f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1957n.getParent();
            if (viewGroup != this.f1526m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1957n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1526m;
                actionMenuView.addView(this.f1957n, actionMenuView.m7699F());
            }
        } else if (c0583d != null) {
            ViewParent parent = c0583d.getParent();
            InterfaceC0524n interfaceC0524n = this.f1526m;
            if (parent == interfaceC0524n) {
                ((ViewGroup) interfaceC0524n).removeView(this.f1957n);
            }
        }
        ((ActionMenuView) this.f1526m).setOverflowReserved(this.f1960q);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: g */
    public boolean mo7512g() {
        ArrayList<C0511i> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        C0579c c0579c = this;
        C0507g c0507g = c0579c.f1521h;
        View view = null;
        int i5 = 0;
        if (c0507g != null) {
            arrayList = c0507g.m7852E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = c0579c.f1964u;
        int i7 = c0579c.f1963t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0579c.f1526m;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0511i c0511i = arrayList.get(i10);
            if (c0511i.m7790o()) {
                i8++;
            } else if (c0511i.m7791n()) {
                i9++;
            } else {
                z = true;
            }
            if (c0579c.f1968y && c0511i.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (c0579c.f1960q && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = c0579c.f1950A;
        sparseBooleanArray.clear();
        if (c0579c.f1966w) {
            int i12 = c0579c.f1969z;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0511i c0511i2 = arrayList.get(i13);
            if (c0511i2.m7790o()) {
                View mo7510n = c0579c.mo7510n(c0511i2, view, viewGroup);
                if (c0579c.f1966w) {
                    i3 -= ActionMenuView.m7693L(mo7510n, i2, i3, makeMeasureSpec, i5);
                } else {
                    mo7510n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo7510n.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = c0511i2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0511i2.m7784u(true);
                i4 = i;
            } else if (c0511i2.m7791n()) {
                int groupId2 = c0511i2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!c0579c.f1966w || i3 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View mo7510n2 = c0579c.mo7510n(c0511i2, null, viewGroup);
                    if (c0579c.f1966w) {
                        int m7693L = ActionMenuView.m7693L(mo7510n2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m7693L;
                        if (m7693L == 0) {
                            z4 = false;
                        }
                    } else {
                        mo7510n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = mo7510n2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!c0579c.f1966w ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C0511i c0511i3 = arrayList.get(i15);
                        if (c0511i3.getGroupId() == groupId2) {
                            if (c0511i3.m7793l()) {
                                i11++;
                            }
                            c0511i3.m7784u(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                c0511i2.m7784u(z3);
            } else {
                i4 = i;
                c0511i2.m7784u(false);
                i13++;
                view = null;
                c0579c = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            c0579c = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b
    /* renamed from: l */
    public boolean mo7511l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1957n) {
            return false;
        }
        return super.mo7511l(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b
    /* renamed from: n */
    public View mo7510n(C0511i c0511i, View view, ViewGroup viewGroup) {
        View actionView = c0511i.getActionView();
        if (actionView == null || c0511i.m7795j()) {
            actionView = super.mo7510n(c0511i, view, viewGroup);
        }
        actionView.setVisibility(c0511i.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo7424o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b
    /* renamed from: o */
    public InterfaceC0524n mo7509o(ViewGroup viewGroup) {
        InterfaceC0524n interfaceC0524n = this.f1526m;
        InterfaceC0524n mo7509o = super.mo7509o(viewGroup);
        if (interfaceC0524n != mo7509o) {
            ((ActionMenuView) mo7509o).setPresenter(this);
        }
        return mo7509o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0496b
    /* renamed from: q */
    public boolean mo7508q(int i, C0511i c0511i) {
        return c0511i.m7793l();
    }

    /* renamed from: x */
    public boolean m7501x() {
        return m7527A() | m7526B();
    }

    /* renamed from: z */
    public Drawable m7499z() {
        C0583d c0583d = this.f1957n;
        if (c0583d != null) {
            return c0583d.getDrawable();
        }
        if (this.f1959p) {
            return this.f1958o;
        }
        return null;
    }
}
