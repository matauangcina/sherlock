package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.AbstractC0447a;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0635p0;
import androidx.appcompat.widget.InterfaceC0590d0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.AbstractC0030b;
import p000a.p001a.p007n.C0029a;
import p000a.p001a.p007n.C0037g;
import p000a.p001a.p007n.C0040h;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.C0267w;
import p000a.p019g.p028k.C0272y;
import p000a.p019g.p028k.InterfaceC0271x;
import p000a.p019g.p028k.InterfaceC0273z;
/* renamed from: androidx.appcompat.app.l */
/* loaded from: classes.dex */
public class C0488l extends AbstractC0447a implements ActionBarOverlayLayout.InterfaceC0537d {

    /* renamed from: B */
    private static final Interpolator f1431B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f1432C = new DecelerateInterpolator();

    /* renamed from: A */
    final InterfaceC0273z f1433A;

    /* renamed from: a */
    Context f1434a;

    /* renamed from: b */
    private Context f1435b;

    /* renamed from: c */
    ActionBarOverlayLayout f1436c;

    /* renamed from: d */
    ActionBarContainer f1437d;

    /* renamed from: e */
    InterfaceC0590d0 f1438e;

    /* renamed from: f */
    ActionBarContextView f1439f;

    /* renamed from: g */
    View f1440g;

    /* renamed from: h */
    C0635p0 f1441h;

    /* renamed from: i */
    private boolean f1442i;

    /* renamed from: j */
    C0492d f1443j;

    /* renamed from: k */
    AbstractC0030b f1444k;

    /* renamed from: l */
    AbstractC0030b.InterfaceC0031a f1445l;

    /* renamed from: m */
    private boolean f1446m;

    /* renamed from: n */
    private ArrayList<AbstractC0447a.InterfaceC0449b> f1447n;

    /* renamed from: o */
    private boolean f1448o;

    /* renamed from: p */
    private int f1449p;

    /* renamed from: q */
    boolean f1450q;

    /* renamed from: r */
    boolean f1451r;

    /* renamed from: s */
    boolean f1452s;

    /* renamed from: t */
    private boolean f1453t;

    /* renamed from: u */
    private boolean f1454u;

    /* renamed from: v */
    C0040h f1455v;

    /* renamed from: w */
    private boolean f1456w;

    /* renamed from: x */
    boolean f1457x;

    /* renamed from: y */
    final InterfaceC0271x f1458y;

    /* renamed from: z */
    final InterfaceC0271x f1459z;

    /* renamed from: androidx.appcompat.app.l$a */
    /* loaded from: classes.dex */
    class C0489a extends C0272y {
        C0489a() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: b */
        public void mo7171b(View view) {
            View view2;
            C0488l c0488l = C0488l.this;
            if (c0488l.f1450q && (view2 = c0488l.f1440g) != null) {
                view2.setTranslationY(0.0f);
                C0488l.this.f1437d.setTranslationY(0.0f);
            }
            C0488l.this.f1437d.setVisibility(8);
            C0488l.this.f1437d.setTransitioning(false);
            C0488l c0488l2 = C0488l.this;
            c0488l2.f1455v = null;
            c0488l2.m7912x();
            ActionBarOverlayLayout actionBarOverlayLayout = C0488l.this.f1436c;
            if (actionBarOverlayLayout != null) {
                C0252s.m8629d0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.l$b */
    /* loaded from: classes.dex */
    class C0490b extends C0272y {
        C0490b() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0271x
        /* renamed from: b */
        public void mo7171b(View view) {
            C0488l c0488l = C0488l.this;
            c0488l.f1455v = null;
            c0488l.f1437d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.l$c */
    /* loaded from: classes.dex */
    class C0491c implements InterfaceC0273z {
        C0491c() {
        }

        @Override // p000a.p019g.p028k.InterfaceC0273z
        /* renamed from: a */
        public void mo7909a(View view) {
            ((View) C0488l.this.f1437d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.l$d */
    /* loaded from: classes.dex */
    public class C0492d extends AbstractC0030b implements C0507g.InterfaceC0508a {

        /* renamed from: h */
        private final Context f1463h;

        /* renamed from: i */
        private final C0507g f1464i;

        /* renamed from: j */
        private AbstractC0030b.InterfaceC0031a f1465j;

        /* renamed from: k */
        private WeakReference<View> f1466k;

        public C0492d(Context context, AbstractC0030b.InterfaceC0031a interfaceC0031a) {
            this.f1463h = context;
            this.f1465j = interfaceC0031a;
            C0507g c0507g = new C0507g(context);
            c0507g.m7842S(1);
            this.f1464i = c0507g;
            c0507g.mo7736R(this);
        }

        @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
        /* renamed from: a */
        public boolean mo7687a(C0507g c0507g, MenuItem menuItem) {
            AbstractC0030b.InterfaceC0031a interfaceC0031a = this.f1465j;
            if (interfaceC0031a != null) {
                return interfaceC0031a.mo7978c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
        /* renamed from: b */
        public void mo7686b(C0507g c0507g) {
            if (this.f1465j == null) {
                return;
            }
            mo7902k();
            C0488l.this.f1439f.m7723l();
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: c */
        public void mo7908c() {
            C0488l c0488l = C0488l.this;
            if (c0488l.f1443j != this) {
                return;
            }
            if (C0488l.m7913w(c0488l.f1451r, c0488l.f1452s, false)) {
                this.f1465j.mo7979b(this);
            } else {
                C0488l c0488l2 = C0488l.this;
                c0488l2.f1444k = this;
                c0488l2.f1445l = this.f1465j;
            }
            this.f1465j = null;
            C0488l.this.m7914v(false);
            C0488l.this.f1439f.m7728g();
            C0488l.this.f1438e.mo7186m().sendAccessibilityEvent(32);
            C0488l c0488l3 = C0488l.this;
            c0488l3.f1436c.setHideOnContentScrollEnabled(c0488l3.f1457x);
            C0488l.this.f1443j = null;
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: d */
        public View mo7907d() {
            WeakReference<View> weakReference = this.f1466k;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: e */
        public Menu mo7906e() {
            return this.f1464i;
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: f */
        public MenuInflater mo7905f() {
            return new C0037g(this.f1463h);
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: g */
        public CharSequence mo7904g() {
            return C0488l.this.f1439f.getSubtitle();
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: i */
        public CharSequence mo7903i() {
            return C0488l.this.f1439f.getTitle();
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: k */
        public void mo7902k() {
            if (C0488l.this.f1443j != this) {
                return;
            }
            this.f1464i.m7827d0();
            try {
                this.f1465j.mo7980a(this, this.f1464i);
            } finally {
                this.f1464i.m7829c0();
            }
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: l */
        public boolean mo7901l() {
            return C0488l.this.f1439f.m7725j();
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: m */
        public void mo7900m(View view) {
            C0488l.this.f1439f.setCustomView(view);
            this.f1466k = new WeakReference<>(view);
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: n */
        public void mo7899n(int i) {
            mo7898o(C0488l.this.f1434a.getResources().getString(i));
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: o */
        public void mo7898o(CharSequence charSequence) {
            C0488l.this.f1439f.setSubtitle(charSequence);
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: q */
        public void mo7897q(int i) {
            mo7896r(C0488l.this.f1434a.getResources().getString(i));
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: r */
        public void mo7896r(CharSequence charSequence) {
            C0488l.this.f1439f.setTitle(charSequence);
        }

        @Override // p000a.p001a.p007n.AbstractC0030b
        /* renamed from: s */
        public void mo7895s(boolean z) {
            super.mo7895s(z);
            C0488l.this.f1439f.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m7894t() {
            this.f1464i.m7827d0();
            try {
                return this.f1465j.mo7977d(this, this.f1464i);
            } finally {
                this.f1464i.m7829c0();
            }
        }
    }

    public C0488l(Activity activity, boolean z) {
        new ArrayList();
        this.f1447n = new ArrayList<>();
        this.f1449p = 0;
        this.f1450q = true;
        this.f1454u = true;
        this.f1458y = new C0489a();
        this.f1459z = new C0490b();
        this.f1433A = new C0491c();
        View decorView = activity.getWindow().getDecorView();
        m7934D(decorView);
        if (z) {
            return;
        }
        this.f1440g = decorView.findViewById(16908290);
    }

    public C0488l(Dialog dialog) {
        new ArrayList();
        this.f1447n = new ArrayList<>();
        this.f1449p = 0;
        this.f1450q = true;
        this.f1454u = true;
        this.f1458y = new C0489a();
        this.f1459z = new C0490b();
        this.f1433A = new C0491c();
        m7934D(dialog.getWindow().getDecorView());
    }

    /* renamed from: A */
    private InterfaceC0590d0 m7937A(View view) {
        if (view instanceof InterfaceC0590d0) {
            return (InterfaceC0590d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: C */
    private void m7935C() {
        if (this.f1453t) {
            this.f1453t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1436c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m7925M(false);
        }
    }

    /* renamed from: D */
    private void m7934D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0005f.decor_content_parent);
        this.f1436c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1438e = m7937A(view.findViewById(C0005f.action_bar));
        this.f1439f = (ActionBarContextView) view.findViewById(C0005f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0005f.action_bar_container);
        this.f1437d = actionBarContainer;
        InterfaceC0590d0 interfaceC0590d0 = this.f1438e;
        if (interfaceC0590d0 == null || this.f1439f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0488l.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1434a = interfaceC0590d0.mo7196c();
        boolean z = (this.f1438e.mo7182q() & 4) != 0;
        if (z) {
            this.f1442i = true;
        }
        C0029a m9507b = C0029a.m9507b(this.f1434a);
        m7928J(m9507b.m9508a() || z);
        m7930H(m9507b.m9502g());
        TypedArray obtainStyledAttributes = this.f1434a.obtainStyledAttributes(null, C0009j.ActionBar, C0000a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0009j.ActionBar_hideOnContentScroll, false)) {
            m7929I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m7931G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: H */
    private void m7930H(boolean z) {
        this.f1448o = z;
        if (z) {
            this.f1437d.setTabContainer(null);
            this.f1438e.mo7187l(this.f1441h);
        } else {
            this.f1438e.mo7187l(null);
            this.f1437d.setTabContainer(this.f1441h);
        }
        boolean z2 = true;
        boolean z3 = m7936B() == 2;
        C0635p0 c0635p0 = this.f1441h;
        if (c0635p0 != null) {
            if (z3) {
                c0635p0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1436c;
                if (actionBarOverlayLayout != null) {
                    C0252s.m8629d0(actionBarOverlayLayout);
                }
            } else {
                c0635p0.setVisibility(8);
            }
        }
        this.f1438e.mo7175x(!this.f1448o && z3);
        this.f1436c.setHasNonEmbeddedTabs((this.f1448o || !z3) ? false : false);
    }

    /* renamed from: K */
    private boolean m7927K() {
        return C0252s.m8650M(this.f1437d);
    }

    /* renamed from: L */
    private void m7926L() {
        if (this.f1453t) {
            return;
        }
        this.f1453t = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1436c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m7925M(false);
    }

    /* renamed from: M */
    private void m7925M(boolean z) {
        if (m7913w(this.f1451r, this.f1452s, this.f1453t)) {
            if (this.f1454u) {
                return;
            }
            this.f1454u = true;
            m7910z(z);
        } else if (this.f1454u) {
            this.f1454u = false;
            m7911y(z);
        }
    }

    /* renamed from: w */
    static boolean m7913w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: B */
    public int m7936B() {
        return this.f1438e.mo7179t();
    }

    /* renamed from: E */
    public void m7933E(boolean z) {
        m7932F(z ? 4 : 0, 4);
    }

    /* renamed from: F */
    public void m7932F(int i, int i2) {
        int mo7182q = this.f1438e.mo7182q();
        if ((i2 & 4) != 0) {
            this.f1442i = true;
        }
        this.f1438e.mo7183p((i & i2) | ((~i2) & mo7182q));
    }

    /* renamed from: G */
    public void m7931G(float f) {
        C0252s.m8611m0(this.f1437d, f);
    }

    /* renamed from: I */
    public void m7929I(boolean z) {
        if (z && !this.f1436c.m7713w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f1457x = z;
        this.f1436c.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: J */
    public void m7928J(boolean z) {
        this.f1438e.mo7185n(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0537d
    /* renamed from: a */
    public void mo7709a() {
        if (this.f1452s) {
            this.f1452s = false;
            m7925M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0537d
    /* renamed from: b */
    public void mo7708b() {
        C0040h c0040h = this.f1455v;
        if (c0040h != null) {
            c0040h.m9479a();
            this.f1455v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0537d
    /* renamed from: c */
    public void mo7707c(int i) {
        this.f1449p = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0537d
    /* renamed from: d */
    public void mo7706d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0537d
    /* renamed from: e */
    public void mo7705e(boolean z) {
        this.f1450q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0537d
    /* renamed from: f */
    public void mo7704f() {
        if (this.f1452s) {
            return;
        }
        this.f1452s = true;
        m7925M(true);
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: h */
    public boolean mo7924h() {
        InterfaceC0590d0 interfaceC0590d0 = this.f1438e;
        if (interfaceC0590d0 == null || !interfaceC0590d0.mo7184o()) {
            return false;
        }
        this.f1438e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: i */
    public void mo7923i(boolean z) {
        if (z == this.f1446m) {
            return;
        }
        this.f1446m = z;
        int size = this.f1447n.size();
        for (int i = 0; i < size; i++) {
            this.f1447n.get(i).m8096a(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: j */
    public int mo7922j() {
        return this.f1438e.mo7182q();
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: k */
    public Context mo7921k() {
        if (this.f1435b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1434a.getTheme().resolveAttribute(C0000a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1435b = new ContextThemeWrapper(this.f1434a, i);
            } else {
                this.f1435b = this.f1434a;
            }
        }
        return this.f1435b;
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: m */
    public void mo7920m(Configuration configuration) {
        m7930H(C0029a.m9507b(this.f1434a).m9502g());
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: o */
    public boolean mo7919o(int i, KeyEvent keyEvent) {
        Menu mo7906e;
        C0492d c0492d = this.f1443j;
        if (c0492d == null || (mo7906e = c0492d.mo7906e()) == null) {
            return false;
        }
        mo7906e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo7906e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: r */
    public void mo7918r(boolean z) {
        if (this.f1442i) {
            return;
        }
        m7933E(z);
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: s */
    public void mo7917s(boolean z) {
        C0040h c0040h;
        this.f1456w = z;
        if (z || (c0040h = this.f1455v) == null) {
            return;
        }
        c0040h.m9479a();
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: t */
    public void mo7916t(CharSequence charSequence) {
        this.f1438e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0447a
    /* renamed from: u */
    public AbstractC0030b mo7915u(AbstractC0030b.InterfaceC0031a interfaceC0031a) {
        C0492d c0492d = this.f1443j;
        if (c0492d != null) {
            c0492d.mo7908c();
        }
        this.f1436c.setHideOnContentScrollEnabled(false);
        this.f1439f.m7724k();
        C0492d c0492d2 = new C0492d(this.f1439f.getContext(), interfaceC0031a);
        if (c0492d2.m7894t()) {
            this.f1443j = c0492d2;
            c0492d2.mo7902k();
            this.f1439f.m7727h(c0492d2);
            m7914v(true);
            this.f1439f.sendAccessibilityEvent(32);
            return c0492d2;
        }
        return null;
    }

    /* renamed from: v */
    public void m7914v(boolean z) {
        C0267w mo7178u;
        C0267w f;
        if (z) {
            m7926L();
        } else {
            m7935C();
        }
        if (!m7927K()) {
            if (z) {
                this.f1438e.mo7188k(4);
                this.f1439f.setVisibility(0);
                return;
            }
            this.f1438e.mo7188k(0);
            this.f1439f.setVisibility(8);
            return;
        }
        if (z) {
            f = this.f1438e.mo7178u(4, 100L);
            mo7178u = this.f1439f.m7568f(0, 200L);
        } else {
            mo7178u = this.f1438e.mo7178u(0, 200L);
            f = this.f1439f.m7568f(8, 100L);
        }
        C0040h c0040h = new C0040h();
        c0040h.m9476d(f, mo7178u);
        c0040h.m9472h();
    }

    /* renamed from: x */
    void m7912x() {
        AbstractC0030b.InterfaceC0031a interfaceC0031a = this.f1445l;
        if (interfaceC0031a != null) {
            interfaceC0031a.mo7979b(this.f1444k);
            this.f1444k = null;
            this.f1445l = null;
        }
    }

    /* renamed from: y */
    public void m7911y(boolean z) {
        View view;
        int[] iArr;
        C0040h c0040h = this.f1455v;
        if (c0040h != null) {
            c0040h.m9479a();
        }
        if (this.f1449p != 0 || (!this.f1456w && !z)) {
            this.f1458y.mo7171b(null);
            return;
        }
        this.f1437d.setAlpha(1.0f);
        this.f1437d.setTransitioning(true);
        C0040h c0040h2 = new C0040h();
        float f = -this.f1437d.getHeight();
        if (z) {
            this.f1437d.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        C0267w m8632c = C0252s.m8632c(this.f1437d);
        m8632c.m8528k(f);
        m8632c.m8530i(this.f1433A);
        c0040h2.m9477c(m8632c);
        if (this.f1450q && (view = this.f1440g) != null) {
            C0267w m8632c2 = C0252s.m8632c(view);
            m8632c2.m8528k(f);
            c0040h2.m9477c(m8632c2);
        }
        c0040h2.m9474f(f1431B);
        c0040h2.m9475e(250L);
        c0040h2.m9473g(this.f1458y);
        this.f1455v = c0040h2;
        c0040h2.m9472h();
    }

    /* renamed from: z */
    public void m7910z(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C0040h c0040h = this.f1455v;
        if (c0040h != null) {
            c0040h.m9479a();
        }
        this.f1437d.setVisibility(0);
        if (this.f1449p == 0 && (this.f1456w || z)) {
            this.f1437d.setTranslationY(0.0f);
            float f = -this.f1437d.getHeight();
            if (z) {
                this.f1437d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f1437d.setTranslationY(f);
            C0040h c0040h2 = new C0040h();
            C0267w m8632c = C0252s.m8632c(this.f1437d);
            m8632c.m8528k(0.0f);
            m8632c.m8530i(this.f1433A);
            c0040h2.m9477c(m8632c);
            if (this.f1450q && (view2 = this.f1440g) != null) {
                view2.setTranslationY(f);
                C0267w m8632c2 = C0252s.m8632c(this.f1440g);
                m8632c2.m8528k(0.0f);
                c0040h2.m9477c(m8632c2);
            }
            c0040h2.m9474f(f1432C);
            c0040h2.m9475e(250L);
            c0040h2.m9473g(this.f1459z);
            this.f1455v = c0040h2;
            c0040h2.m9472h();
        } else {
            this.f1437d.setAlpha(1.0f);
            this.f1437d.setTranslationY(0.0f);
            if (this.f1450q && (view = this.f1440g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1459z.mo7171b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1436c;
        if (actionBarOverlayLayout != null) {
            C0252s.m8629d0(actionBarOverlayLayout);
        }
    }
}
