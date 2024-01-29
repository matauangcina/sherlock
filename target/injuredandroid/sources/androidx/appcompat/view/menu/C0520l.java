package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0522m;
import p000a.p001a.C0003d;
import p000a.p019g.p028k.C0236d;
import p000a.p019g.p028k.C0252s;
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class C0520l {

    /* renamed from: a */
    private final Context f1658a;

    /* renamed from: b */
    private final C0507g f1659b;

    /* renamed from: c */
    private final boolean f1660c;

    /* renamed from: d */
    private final int f1661d;

    /* renamed from: e */
    private final int f1662e;

    /* renamed from: f */
    private View f1663f;

    /* renamed from: g */
    private int f1664g;

    /* renamed from: h */
    private boolean f1665h;

    /* renamed from: i */
    private InterfaceC0522m.InterfaceC0523a f1666i;

    /* renamed from: j */
    private AbstractC0519k f1667j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1668k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1669l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    class C0521a implements PopupWindow.OnDismissListener {
        C0521a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0520l.this.mo7495e();
        }
    }

    public C0520l(Context context, C0507g c0507g, View view, boolean z, int i) {
        this(context, c0507g, view, z, i, 0);
    }

    public C0520l(Context context, C0507g c0507g, View view, boolean z, int i, int i2) {
        this.f1664g = 8388611;
        this.f1669l = new C0521a();
        this.f1658a = context;
        this.f1659b = c0507g;
        this.f1663f = view;
        this.f1660c = z;
        this.f1661d = i;
        this.f1662e = i2;
    }

    /* renamed from: a */
    private AbstractC0519k m7762a() {
        Display defaultDisplay = ((WindowManager) this.f1658a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        AbstractC0519k view$OnKeyListenerC0498d = Math.min(point.x, point.y) >= this.f1658a.getResources().getDimensionPixelSize(C0003d.abc_cascading_menus_min_smallest_width) ? new View$OnKeyListenerC0498d(this.f1658a, this.f1663f, this.f1661d, this.f1662e, this.f1660c) : new View$OnKeyListenerC0528q(this.f1658a, this.f1659b, this.f1663f, this.f1661d, this.f1662e, this.f1660c);
        view$OnKeyListenerC0498d.mo7749l(this.f1659b);
        view$OnKeyListenerC0498d.mo7744u(this.f1669l);
        view$OnKeyListenerC0498d.mo7748p(this.f1663f);
        view$OnKeyListenerC0498d.mo7580k(this.f1666i);
        view$OnKeyListenerC0498d.mo7747r(this.f1665h);
        view$OnKeyListenerC0498d.mo7746s(this.f1664g);
        return view$OnKeyListenerC0498d;
    }

    /* renamed from: l */
    private void m7752l(int i, int i2, boolean z, boolean z2) {
        AbstractC0519k m7760c = m7760c();
        m7760c.mo7743v(z2);
        if (z) {
            if ((C0236d.m8706b(this.f1664g, C0252s.m8592w(this.f1663f)) & 7) == 5) {
                i -= this.f1663f.getWidth();
            }
            m7760c.mo7745t(i);
            m7760c.mo7742w(i2);
            int i3 = (int) ((this.f1658a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m7760c.m7765q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m7760c.mo7383a();
    }

    /* renamed from: b */
    public void m7761b() {
        if (m7759d()) {
            this.f1667j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0519k m7760c() {
        if (this.f1667j == null) {
            this.f1667j = m7762a();
        }
        return this.f1667j;
    }

    /* renamed from: d */
    public boolean m7759d() {
        AbstractC0519k abstractC0519k = this.f1667j;
        return abstractC0519k != null && abstractC0519k.mo7381c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo7495e() {
        this.f1667j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1668k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m7758f(View view) {
        this.f1663f = view;
    }

    /* renamed from: g */
    public void m7757g(boolean z) {
        this.f1665h = z;
        AbstractC0519k abstractC0519k = this.f1667j;
        if (abstractC0519k != null) {
            abstractC0519k.mo7747r(z);
        }
    }

    /* renamed from: h */
    public void m7756h(int i) {
        this.f1664g = i;
    }

    /* renamed from: i */
    public void m7755i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1668k = onDismissListener;
    }

    /* renamed from: j */
    public void m7754j(InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
        this.f1666i = interfaceC0523a;
        AbstractC0519k abstractC0519k = this.f1667j;
        if (abstractC0519k != null) {
            abstractC0519k.mo7580k(interfaceC0523a);
        }
    }

    /* renamed from: k */
    public void m7753k() {
        if (!m7751m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: m */
    public boolean m7751m() {
        if (m7759d()) {
            return true;
        }
        if (this.f1663f == null) {
            return false;
        }
        m7752l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m7750n(int i, int i2) {
        if (m7759d()) {
            return true;
        }
        if (this.f1663f == null) {
            return false;
        }
        m7752l(i, i2, true, true);
        return true;
    }
}
