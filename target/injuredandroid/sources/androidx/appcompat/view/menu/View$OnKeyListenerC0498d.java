package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.widget.C0620l0;
import androidx.appcompat.widget.InterfaceC0618k0;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.C0003d;
import p000a.p001a.C0006g;
import p000a.p019g.p028k.C0236d;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0498d extends AbstractC0519k implements InterfaceC0522m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G */
    private static final int f1530G = C0006g.abc_cascading_menu_item_layout;

    /* renamed from: B */
    private boolean f1532B;

    /* renamed from: C */
    private InterfaceC0522m.InterfaceC0523a f1533C;

    /* renamed from: D */
    ViewTreeObserver f1534D;

    /* renamed from: E */
    private PopupWindow.OnDismissListener f1535E;

    /* renamed from: F */
    boolean f1536F;

    /* renamed from: g */
    private final Context f1537g;

    /* renamed from: h */
    private final int f1538h;

    /* renamed from: i */
    private final int f1539i;

    /* renamed from: j */
    private final int f1540j;

    /* renamed from: k */
    private final boolean f1541k;

    /* renamed from: l */
    final Handler f1542l;

    /* renamed from: t */
    private View f1550t;

    /* renamed from: u */
    View f1551u;

    /* renamed from: w */
    private boolean f1553w;

    /* renamed from: x */
    private boolean f1554x;

    /* renamed from: y */
    private int f1555y;

    /* renamed from: z */
    private int f1556z;

    /* renamed from: m */
    private final List<C0507g> f1543m = new ArrayList();

    /* renamed from: n */
    final List<C0503d> f1544n = new ArrayList();

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f1545o = new ViewTreeObserver$OnGlobalLayoutListenerC0499a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f1546p = new View$OnAttachStateChangeListenerC0500b();

    /* renamed from: q */
    private final InterfaceC0618k0 f1547q = new C0501c();

    /* renamed from: r */
    private int f1548r = 0;

    /* renamed from: s */
    private int f1549s = 0;

    /* renamed from: A */
    private boolean f1531A = false;

    /* renamed from: v */
    private int f1552v = m7868D();

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0499a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0499a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!View$OnKeyListenerC0498d.this.mo7381c() || View$OnKeyListenerC0498d.this.f1544n.size() <= 0 || View$OnKeyListenerC0498d.this.f1544n.get(0).f1564a.m7368x()) {
                return;
            }
            View view = View$OnKeyListenerC0498d.this.f1551u;
            if (view == null || !view.isShown()) {
                View$OnKeyListenerC0498d.this.dismiss();
                return;
            }
            for (C0503d c0503d : View$OnKeyListenerC0498d.this.f1544n) {
                c0503d.f1564a.mo7383a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0500b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0500b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0498d.this.f1534D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0498d.this.f1534D = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0498d view$OnKeyListenerC0498d = View$OnKeyListenerC0498d.this;
                view$OnKeyListenerC0498d.f1534D.removeGlobalOnLayoutListener(view$OnKeyListenerC0498d.f1545o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* loaded from: classes.dex */
    class C0501c implements InterfaceC0618k0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* loaded from: classes.dex */
        class RunnableC0502a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0503d f1560f;

            /* renamed from: g */
            final /* synthetic */ MenuItem f1561g;

            /* renamed from: h */
            final /* synthetic */ C0507g f1562h;

            RunnableC0502a(C0503d c0503d, MenuItem menuItem, C0507g c0507g) {
                this.f1560f = c0503d;
                this.f1561g = menuItem;
                this.f1562h = c0507g;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0503d c0503d = this.f1560f;
                if (c0503d != null) {
                    View$OnKeyListenerC0498d.this.f1536F = true;
                    c0503d.f1565b.m7826e(false);
                    View$OnKeyListenerC0498d.this.f1536F = false;
                }
                if (this.f1561g.isEnabled() && this.f1561g.hasSubMenu()) {
                    this.f1562h.m7848L(this.f1561g, 4);
                }
            }
        }

        C0501c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0618k0
        /* renamed from: e */
        public void mo7360e(C0507g c0507g, MenuItem menuItem) {
            View$OnKeyListenerC0498d.this.f1542l.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0498d.this.f1544n.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0507g == View$OnKeyListenerC0498d.this.f1544n.get(i).f1565b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            View$OnKeyListenerC0498d.this.f1542l.postAtTime(new RunnableC0502a(i2 < View$OnKeyListenerC0498d.this.f1544n.size() ? View$OnKeyListenerC0498d.this.f1544n.get(i2) : null, menuItem, c0507g), c0507g, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0618k0
        /* renamed from: f */
        public void mo7359f(C0507g c0507g, MenuItem menuItem) {
            View$OnKeyListenerC0498d.this.f1542l.removeCallbacksAndMessages(c0507g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* loaded from: classes.dex */
    public static class C0503d {

        /* renamed from: a */
        public final C0620l0 f1564a;

        /* renamed from: b */
        public final C0507g f1565b;

        /* renamed from: c */
        public final int f1566c;

        public C0503d(C0620l0 c0620l0, C0507g c0507g, int i) {
            this.f1564a = c0620l0;
            this.f1565b = c0507g;
            this.f1566c = i;
        }

        /* renamed from: a */
        public ListView m7864a() {
            return this.f1564a.mo7378h();
        }
    }

    public View$OnKeyListenerC0498d(Context context, View view, int i, int i2, boolean z) {
        this.f1537g = context;
        this.f1550t = view;
        this.f1539i = i;
        this.f1540j = i2;
        this.f1541k = z;
        Resources resources = context.getResources();
        this.f1538h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0003d.abc_config_prefDialogWidth));
        this.f1542l = new Handler();
    }

    /* renamed from: A */
    private int m7871A(C0507g c0507g) {
        int size = this.f1544n.size();
        for (int i = 0; i < size; i++) {
            if (c0507g == this.f1544n.get(i).f1565b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: B */
    private MenuItem m7870B(C0507g c0507g, C0507g c0507g2) {
        int size = c0507g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0507g.getItem(i);
            if (item.hasSubMenu() && c0507g2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: C */
    private View m7869C(C0503d c0503d, C0507g c0507g) {
        C0506f c0506f;
        int i;
        int firstVisiblePosition;
        MenuItem m7870B = m7870B(c0503d.f1565b, c0507g);
        if (m7870B == null) {
            return null;
        }
        ListView m7864a = c0503d.m7864a();
        ListAdapter adapter = m7864a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0506f = (C0506f) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0506f = (C0506f) adapter;
            i = 0;
        }
        int count = c0506f.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (m7870B == c0506f.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - m7864a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m7864a.getChildCount()) {
            return m7864a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: D */
    private int m7868D() {
        return C0252s.m8592w(this.f1550t) == 1 ? 0 : 1;
    }

    /* renamed from: E */
    private int m7867E(int i) {
        List<C0503d> list = this.f1544n;
        ListView m7864a = list.get(list.size() - 1).m7864a();
        int[] iArr = new int[2];
        m7864a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1551u.getWindowVisibleDisplayFrame(rect);
        return this.f1552v == 1 ? (iArr[0] + m7864a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: F */
    private void m7866F(C0507g c0507g) {
        C0503d c0503d;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1537g);
        C0506f c0506f = new C0506f(c0507g, from, this.f1541k, f1530G);
        if (!mo7381c() && this.f1531A) {
            c0506f.m7856d(true);
        } else if (mo7381c()) {
            c0506f.m7856d(AbstractC0519k.m7764x(c0507g));
        }
        int m7766o = AbstractC0519k.m7766o(c0506f, null, this.f1537g, this.f1538h);
        C0620l0 m7865z = m7865z();
        m7865z.mo7234p(c0506f);
        m7865z.m7395B(m7766o);
        m7865z.m7394C(this.f1549s);
        if (this.f1544n.size() > 0) {
            List<C0503d> list = this.f1544n;
            c0503d = list.get(list.size() - 1);
            view = m7869C(c0503d, c0507g);
        } else {
            c0503d = null;
            view = null;
        }
        if (view != null) {
            m7865z.m7361Q(false);
            m7865z.m7364N(null);
            int m7867E = m7867E(m7766o);
            boolean z = m7867E == 1;
            this.f1552v = m7867E;
            if (Build.VERSION.SDK_INT >= 26) {
                m7865z.m7366z(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1550t.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1549s & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1550t.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1549s & 5) == 5) {
                if (!z) {
                    m7766o = view.getWidth();
                    i3 = i - m7766o;
                }
                i3 = i + m7766o;
            } else {
                if (z) {
                    m7766o = view.getWidth();
                    i3 = i + m7766o;
                }
                i3 = i - m7766o;
            }
            m7865z.m7376l(i3);
            m7865z.m7388I(true);
            m7865z.m7377j(i2);
        } else {
            if (this.f1553w) {
                m7865z.m7376l(this.f1555y);
            }
            if (this.f1554x) {
                m7865z.m7377j(this.f1556z);
            }
            m7865z.m7393D(m7767n());
        }
        this.f1544n.add(new C0503d(m7865z, c0507g, this.f1552v));
        m7865z.mo7383a();
        ListView mo7378h = m7865z.mo7378h();
        mo7378h.setOnKeyListener(this);
        if (c0503d == null && this.f1532B && c0507g.m7811x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0006g.abc_popup_menu_header_item_layout, (ViewGroup) mo7378h, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c0507g.m7811x());
            mo7378h.addHeaderView(frameLayout, null, false);
            m7865z.mo7383a();
        }
    }

    /* renamed from: z */
    private C0620l0 m7865z() {
        C0620l0 c0620l0 = new C0620l0(this.f1537g, null, this.f1539i, this.f1540j);
        c0620l0.m7362P(this.f1547q);
        c0620l0.m7389H(this);
        c0620l0.m7390G(this);
        c0620l0.m7366z(this.f1550t);
        c0620l0.m7394C(this.f1549s);
        c0620l0.m7391F(true);
        c0620l0.m7392E(2);
        return c0620l0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: a */
    public void mo7383a() {
        if (mo7381c()) {
            return;
        }
        for (C0507g c0507g : this.f1543m) {
            m7866F(c0507g);
        }
        this.f1543m.clear();
        View view = this.f1550t;
        this.f1551u = view;
        if (view != null) {
            boolean z = this.f1534D == null;
            ViewTreeObserver viewTreeObserver = this.f1551u.getViewTreeObserver();
            this.f1534D = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1545o);
            }
            this.f1551u.addOnAttachStateChangeListener(this.f1546p);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: b */
    public void mo7517b(C0507g c0507g, boolean z) {
        int m7871A = m7871A(c0507g);
        if (m7871A < 0) {
            return;
        }
        int i = m7871A + 1;
        if (i < this.f1544n.size()) {
            this.f1544n.get(i).f1565b.m7826e(false);
        }
        C0503d remove = this.f1544n.remove(m7871A);
        remove.f1565b.m7845O(this);
        if (this.f1536F) {
            remove.f1564a.m7363O(null);
            remove.f1564a.m7396A(0);
        }
        remove.f1564a.dismiss();
        int size = this.f1544n.size();
        this.f1552v = size > 0 ? this.f1544n.get(size - 1).f1566c : m7868D();
        if (size != 0) {
            if (z) {
                this.f1544n.get(0).f1565b.m7826e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1533C;
        if (interfaceC0523a != null) {
            interfaceC0523a.mo7494b(c0507g, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1534D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1534D.removeGlobalOnLayoutListener(this.f1545o);
            }
            this.f1534D = null;
        }
        this.f1551u.removeOnAttachStateChangeListener(this.f1546p);
        this.f1535E.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    /* renamed from: c */
    public boolean mo7381c() {
        return this.f1544n.size() > 0 && this.f1544n.get(0).f1564a.mo7381c();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0527p
    public void dismiss() {
        int size = this.f1544n.size();
        if (size > 0) {
            C0503d[] c0503dArr = (C0503d[]) this.f1544n.toArray(new C0503d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0503d c0503d = c0503dArr[i];
                if (c0503d.f1564a.mo7381c()) {
                    c0503d.f1564a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: e */
    public boolean mo7514e(SubMenuC0531r subMenuC0531r) {
        for (C0503d c0503d : this.f1544n) {
            if (subMenuC0531r == c0503d.f1565b) {
                c0503d.m7864a().requestFocus();
                return true;
            }
        }
        if (subMenuC0531r.hasVisibleItems()) {
            mo7749l(subMenuC0531r);
            InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1533C;
            if (interfaceC0523a != null) {
                interfaceC0523a.mo7493c(subMenuC0531r);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: f */
    public void mo7513f(boolean z) {
        for (C0503d c0503d : this.f1544n) {
            AbstractC0519k.m7763y(c0503d.m7864a().getAdapter()).notifyDataSetChanged();
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
        if (this.f1544n.isEmpty()) {
            return null;
        }
        List<C0503d> list = this.f1544n;
        return list.get(list.size() - 1).m7864a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0522m
    /* renamed from: k */
    public void mo7580k(InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
        this.f1533C = interfaceC0523a;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: l */
    public void mo7749l(C0507g c0507g) {
        c0507g.m7830c(this, this.f1537g);
        if (mo7381c()) {
            m7866F(c0507g);
        } else {
            this.f1543m.add(c0507g);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: m */
    protected boolean mo7768m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0503d c0503d;
        int size = this.f1544n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0503d = null;
                break;
            }
            c0503d = this.f1544n.get(i);
            if (!c0503d.f1564a.mo7381c()) {
                break;
            }
            i++;
        }
        if (c0503d != null) {
            c0503d.f1565b.m7826e(false);
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
        if (this.f1550t != view) {
            this.f1550t = view;
            this.f1549s = C0236d.m8706b(this.f1548r, C0252s.m8592w(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: r */
    public void mo7747r(boolean z) {
        this.f1531A = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: s */
    public void mo7746s(int i) {
        if (this.f1548r != i) {
            this.f1548r = i;
            this.f1549s = C0236d.m8706b(i, C0252s.m8592w(this.f1550t));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: t */
    public void mo7745t(int i) {
        this.f1553w = true;
        this.f1555y = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: u */
    public void mo7744u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1535E = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: v */
    public void mo7743v(boolean z) {
        this.f1532B = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0519k
    /* renamed from: w */
    public void mo7742w(int i) {
        this.f1554x = true;
        this.f1556z = i;
    }
}
