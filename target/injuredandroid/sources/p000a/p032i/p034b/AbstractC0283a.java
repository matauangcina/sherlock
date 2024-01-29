package p000a.p032i.p034b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.List;
import p000a.p014d.C0080h;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p019g.p028k.p029b0.C0221d;
import p000a.p019g.p028k.p029b0.C0225e;
import p000a.p032i.p034b.C0287b;
/* renamed from: a.i.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC0283a extends C0195a {

    /* renamed from: n */
    private static final Rect f773n = new Rect(Reader.READ_DONE, Reader.READ_DONE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o */
    private static final C0287b.InterfaceC0288a<C0217c> f774o = new C0284a();

    /* renamed from: p */
    private static final C0287b.InterfaceC0289b<C0080h<C0217c>, C0217c> f775p = new C0285b();

    /* renamed from: h */
    private final AccessibilityManager f780h;

    /* renamed from: i */
    private final View f781i;

    /* renamed from: j */
    private C0286c f782j;

    /* renamed from: d */
    private final Rect f776d = new Rect();

    /* renamed from: e */
    private final Rect f777e = new Rect();

    /* renamed from: f */
    private final Rect f778f = new Rect();

    /* renamed from: g */
    private final int[] f779g = new int[2];

    /* renamed from: k */
    int f783k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l */
    int f784l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m */
    private int f785m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: a.i.b.a$a */
    /* loaded from: classes.dex */
    class C0284a implements C0287b.InterfaceC0288a<C0217c> {
        C0284a() {
        }

        @Override // p000a.p032i.p034b.C0287b.InterfaceC0288a
        /* renamed from: b */
        public void mo8468a(C0217c c0217c, Rect rect) {
            c0217c.m8751l(rect);
        }
    }

    /* renamed from: a.i.b.a$b */
    /* loaded from: classes.dex */
    class C0285b implements C0287b.InterfaceC0289b<C0080h<C0217c>, C0217c> {
        C0285b() {
        }

        @Override // p000a.p032i.p034b.C0287b.InterfaceC0289b
        /* renamed from: c */
        public C0217c mo8467a(C0080h<C0217c> c0080h, int i) {
            return c0080h.m9317m(i);
        }

        @Override // p000a.p032i.p034b.C0287b.InterfaceC0289b
        /* renamed from: d */
        public int mo8466b(C0080h<C0217c> c0080h) {
            return c0080h.m9318l();
        }
    }

    /* renamed from: a.i.b.a$c */
    /* loaded from: classes.dex */
    private class C0286c extends C0221d {
        C0286c() {
        }

        @Override // p000a.p019g.p028k.p029b0.C0221d
        /* renamed from: b */
        public C0217c mo8486b(int i) {
            return C0217c.m8787M(AbstractC0283a.this.m8513H(i));
        }

        @Override // p000a.p019g.p028k.p029b0.C0221d
        /* renamed from: d */
        public C0217c mo8485d(int i) {
            int i2 = i == 2 ? AbstractC0283a.this.f783k : AbstractC0283a.this.f784l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo8486b(i2);
        }

        @Override // p000a.p019g.p028k.p029b0.C0221d
        /* renamed from: f */
        public boolean mo8484f(int i, int i2, Bundle bundle) {
            return AbstractC0283a.this.m8509P(i, i2, bundle);
        }
    }

    public AbstractC0283a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f781i = view;
        this.f780h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C0252s.m8596u(view) == 0) {
            C0252s.m8605p0(view, 1);
        }
    }

    /* renamed from: D */
    private static Rect m8517D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m8516E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f781i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f781i;
        do {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    /* renamed from: F */
    private static int m8515F(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    /* renamed from: G */
    private boolean m8514G(int i, Rect rect) {
        Object m8480d;
        C0080h<C0217c> m8491y = m8491y();
        int i2 = this.f784l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        C0217c m9325e = i2 == Integer.MIN_VALUE ? null : m8491y.m9325e(i2);
        if (i == 1 || i == 2) {
            m8480d = C0287b.m8480d(m8491y, f775p, f774o, m9325e, i, C0252s.m8592w(this.f781i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i4 = this.f784l;
            if (i4 != Integer.MIN_VALUE) {
                m8490z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m8517D(this.f781i, i, rect2);
            }
            m8480d = C0287b.m8481c(m8491y, f775p, f774o, m9325e, rect2, i);
        }
        C0217c c0217c = (C0217c) m8480d;
        if (c0217c != null) {
            i3 = m8491y.m9322h(m8491y.m9323g(c0217c));
        }
        return m8505T(i3);
    }

    /* renamed from: Q */
    private boolean m8508Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo3247J(i, i2, bundle) : m8502n(i) : m8506S(i) : m8501o(i) : m8505T(i);
    }

    /* renamed from: R */
    private boolean m8507R(int i, Bundle bundle) {
        return C0252s.m8640W(this.f781i, i, bundle);
    }

    /* renamed from: S */
    private boolean m8506S(int i) {
        int i2;
        if (this.f780h.isEnabled() && this.f780h.isTouchExplorationEnabled() && (i2 = this.f783k) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m8502n(i2);
            }
            this.f783k = i;
            this.f781i.invalidate();
            m8504U(i, 32768);
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private void m8503V(int i) {
        int i2 = this.f785m;
        if (i2 == i) {
            return;
        }
        this.f785m = i;
        m8504U(i, 128);
        m8504U(i2, 256);
    }

    /* renamed from: n */
    private boolean m8502n(int i) {
        if (this.f783k == i) {
            this.f783k = RecyclerView.UNDEFINED_DURATION;
            this.f781i.invalidate();
            m8504U(i, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m8500p() {
        int i = this.f784l;
        return i != Integer.MIN_VALUE && mo3247J(i, 16, null);
    }

    /* renamed from: q */
    private AccessibilityEvent m8499q(int i, int i2) {
        return i != -1 ? m8498r(i, i2) : m8497s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m8498r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0217c m8513H = m8513H(i);
        obtain.getText().add(m8513H.m8731v());
        obtain.setContentDescription(m8513H.m8741q());
        obtain.setScrollable(m8513H.m8792H());
        obtain.setPassword(m8513H.m8793G());
        obtain.setEnabled(m8513H.m8797C());
        obtain.setChecked(m8513H.m8799A());
        m8510L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m8513H.m8745o());
        C0225e.m8714c(obtain, this.f781i, i);
        obtain.setPackageName(this.f781i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    private AccessibilityEvent m8497s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f781i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C0217c m8496t(int i) {
        C0217c m8789K = C0217c.m8789K();
        m8789K.m8766d0(true);
        m8789K.m8762f0(true);
        m8789K.m8777W("android.view.View");
        m8789K.m8781S(f773n);
        m8789K.m8780T(f773n);
        m8789K.m8750l0(this.f781i);
        mo3245N(i, m8789K);
        if (m8789K.m8731v() == null && m8789K.m8741q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m8789K.m8751l(this.f777e);
        if (this.f777e.equals(f773n)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int m8755j = m8789K.m8755j();
        if ((m8755j & 64) == 0) {
            if ((m8755j & 128) == 0) {
                m8789K.m8754j0(this.f781i.getContext().getPackageName());
                m8789K.m8740q0(this.f781i, i);
                if (this.f783k == i) {
                    m8789K.m8783Q(true);
                    m8789K.m8773a(128);
                } else {
                    m8789K.m8783Q(false);
                    m8789K.m8773a(64);
                }
                boolean z = this.f784l == i;
                if (z) {
                    m8789K.m8773a(2);
                } else if (m8789K.m8796D()) {
                    m8789K.m8773a(1);
                }
                m8789K.m8760g0(z);
                this.f781i.getLocationOnScreen(this.f779g);
                m8789K.m8749m(this.f776d);
                if (this.f776d.equals(f773n)) {
                    m8789K.m8751l(this.f776d);
                    if (m8789K.f690b != -1) {
                        C0217c m8789K2 = C0217c.m8789K();
                        for (int i2 = m8789K.f690b; i2 != -1; i2 = m8789K2.f690b) {
                            m8789K2.m8748m0(this.f781i, -1);
                            m8789K2.m8781S(f773n);
                            mo3245N(i2, m8789K2);
                            m8789K2.m8751l(this.f777e);
                            Rect rect = this.f776d;
                            Rect rect2 = this.f777e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        m8789K2.m8785O();
                    }
                    this.f776d.offset(this.f779g[0] - this.f781i.getScrollX(), this.f779g[1] - this.f781i.getScrollY());
                }
                if (this.f781i.getLocalVisibleRect(this.f778f)) {
                    this.f778f.offset(this.f779g[0] - this.f781i.getScrollX(), this.f779g[1] - this.f781i.getScrollY());
                    if (this.f776d.intersect(this.f778f)) {
                        m8789K.m8780T(this.f776d);
                        if (m8516E(this.f776d)) {
                            m8789K.m8734t0(true);
                        }
                    }
                }
                return m8789K;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    /* renamed from: u */
    private C0217c m8495u() {
        C0217c m8788L = C0217c.m8788L(this.f781i);
        C0252s.m8642U(this.f781i, m8788L);
        ArrayList arrayList = new ArrayList();
        mo3248C(arrayList);
        if (m8788L.m8747n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m8788L.m8769c(this.f781i, ((Integer) arrayList.get(i)).intValue());
            }
            return m8788L;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private C0080h<C0217c> m8491y() {
        ArrayList arrayList = new ArrayList();
        mo3248C(arrayList);
        C0080h<C0217c> c0080h = new C0080h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            c0080h.m9321i(arrayList.get(i).intValue(), m8496t(arrayList.get(i).intValue()));
        }
        return c0080h;
    }

    /* renamed from: z */
    private void m8490z(int i, Rect rect) {
        m8513H(i).m8751l(rect);
    }

    /* renamed from: A */
    public final int m8518A() {
        return this.f784l;
    }

    /* renamed from: B */
    protected abstract int mo3249B(float f, float f2);

    /* renamed from: C */
    protected abstract void mo3248C(List<Integer> list);

    /* renamed from: H */
    C0217c m8513H(int i) {
        return i == -1 ? m8495u() : m8496t(i);
    }

    /* renamed from: I */
    public final void m8512I(boolean z, int i, Rect rect) {
        int i2 = this.f784l;
        if (i2 != Integer.MIN_VALUE) {
            m8501o(i2);
        }
        if (z) {
            m8514G(i, rect);
        }
    }

    /* renamed from: J */
    protected abstract boolean mo3247J(int i, int i2, Bundle bundle);

    /* renamed from: K */
    protected void m8511K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    protected void m8510L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    protected void mo3246M(C0217c c0217c) {
    }

    /* renamed from: N */
    protected abstract void mo3245N(int i, C0217c c0217c);

    /* renamed from: O */
    protected void mo3244O(int i, boolean z) {
    }

    /* renamed from: P */
    boolean m8509P(int i, int i2, Bundle bundle) {
        return i != -1 ? m8508Q(i, i2, bundle) : m8507R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean m8505T(int i) {
        int i2;
        if ((this.f781i.isFocused() || this.f781i.requestFocus()) && (i2 = this.f784l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m8501o(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.f784l = i;
            mo3244O(i, true);
            m8504U(i, 8);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean m8504U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f780h.isEnabled() || (parent = this.f781i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f781i, m8499q(i, i2));
    }

    @Override // p000a.p019g.p028k.C0195a
    /* renamed from: b */
    public C0221d mo5146b(View view) {
        if (this.f782j == null) {
            this.f782j = new C0286c();
        }
        return this.f782j;
    }

    @Override // p000a.p019g.p028k.C0195a
    /* renamed from: f */
    public void mo2807f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2807f(view, accessibilityEvent);
        m8511K(accessibilityEvent);
    }

    @Override // p000a.p019g.p028k.C0195a
    /* renamed from: g */
    public void mo2517g(View view, C0217c c0217c) {
        super.mo2517g(view, c0217c);
        mo3246M(c0217c);
    }

    /* renamed from: o */
    public final boolean m8501o(int i) {
        if (this.f784l != i) {
            return false;
        }
        this.f784l = RecyclerView.UNDEFINED_DURATION;
        mo3244O(i, false);
        m8504U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean m8494v(MotionEvent motionEvent) {
        if (this.f780h.isEnabled() && this.f780h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int mo3249B = mo3249B(motionEvent.getX(), motionEvent.getY());
                m8503V(mo3249B);
                return mo3249B != Integer.MIN_VALUE;
            } else if (action == 10 && this.f785m != Integer.MIN_VALUE) {
                m8503V(RecyclerView.UNDEFINED_DURATION);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m8493w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m8514G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m8514G(1, null);
                }
                return false;
            }
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            int m8515F = m8515F(keyCode);
                            int repeatCount = keyEvent.getRepeatCount() + 1;
                            boolean z = false;
                            while (i < repeatCount && m8514G(m8515F, null)) {
                                i++;
                                z = true;
                            }
                            return z;
                        }
                        return false;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                m8500p();
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: x */
    public final int m8492x() {
        return this.f783k;
    }
}
