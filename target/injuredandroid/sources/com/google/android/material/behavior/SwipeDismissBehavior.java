package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000a.p019g.p028k.C0252s;
import p000a.p032i.p034b.C0291c;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0693c<V> {

    /* renamed from: a */
    C0291c f4941a;

    /* renamed from: b */
    InterfaceC1728b f4942b;

    /* renamed from: c */
    private boolean f4943c;

    /* renamed from: e */
    private boolean f4945e;

    /* renamed from: d */
    private float f4944d = 0.0f;

    /* renamed from: f */
    int f4946f = 2;

    /* renamed from: g */
    float f4947g = 0.5f;

    /* renamed from: h */
    float f4948h = 0.0f;

    /* renamed from: i */
    float f4949i = 0.5f;

    /* renamed from: j */
    private final C0291c.AbstractC0294c f4950j = new C1727a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes.dex */
    class C1727a extends C0291c.AbstractC0294c {

        /* renamed from: a */
        private int f4951a;

        /* renamed from: b */
        private int f4952b = -1;

        C1727a() {
        }

        /* renamed from: n */
        private boolean m3421n(View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.f4951a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f4947g);
            }
            boolean z = C0252s.m8592w(view) == 1;
            int i2 = SwipeDismissBehavior.this.f4946f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 == 1) {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.f4951a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.f4951a - r3.getWidth();
            r3 = r2.f4951a;
         */
        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo3329a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = p000a.p019g.p028k.C0252s.m8592w(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f4946f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f4951a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f4951a
                goto L37
            L1c:
                int r5 = r2.f4951a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f4951a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f4951a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.m3430G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C1727a.mo3329a(android.view.View, int, int):int");
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: b */
        public int mo3328b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: d */
        public int mo3423d(View view) {
            return view.getWidth();
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: i */
        public void mo3422i(View view, int i) {
            this.f4952b = i;
            this.f4951a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: j */
        public void mo3326j(int i) {
            InterfaceC1728b interfaceC1728b = SwipeDismissBehavior.this.f4942b;
            if (interfaceC1728b != null) {
                interfaceC1728b.mo2657b(i);
            }
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: k */
        public void mo3325k(View view, int i, int i2, int i3, int i4) {
            float width = this.f4951a + (view.getWidth() * SwipeDismissBehavior.this.f4948h);
            float width2 = this.f4951a + (view.getWidth() * SwipeDismissBehavior.this.f4949i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m3431F(0.0f, 1.0f - SwipeDismissBehavior.m3428I(width, width2, f), 1.0f));
            }
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: l */
        public void mo3324l(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC1728b interfaceC1728b;
            this.f4952b = -1;
            int width = view.getWidth();
            if (m3421n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f4951a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f4951a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f4941a.m8460F(i, view.getTop())) {
                C0252s.m8638Y(view, new RunnableC1729c(view, z));
            } else if (!z || (interfaceC1728b = SwipeDismissBehavior.this.f4942b) == null) {
            } else {
                interfaceC1728b.mo2658a(view);
            }
        }

        @Override // p000a.p032i.p034b.C0291c.AbstractC0294c
        /* renamed from: m */
        public boolean mo3323m(View view, int i) {
            int i2 = this.f4952b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo2664E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1728b {
        /* renamed from: a */
        void mo2658a(View view);

        /* renamed from: b */
        void mo2657b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes.dex */
    private class RunnableC1729c implements Runnable {

        /* renamed from: f */
        private final View f4954f;

        /* renamed from: g */
        private final boolean f4955g;

        RunnableC1729c(View view, boolean z) {
            this.f4954f = view;
            this.f4955g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC1728b interfaceC1728b;
            C0291c c0291c = SwipeDismissBehavior.this.f4941a;
            if (c0291c != null && c0291c.m8446k(true)) {
                C0252s.m8638Y(this.f4954f, this);
            } else if (!this.f4955g || (interfaceC1728b = SwipeDismissBehavior.this.f4942b) == null) {
            } else {
                interfaceC1728b.mo2658a(this.f4954f);
            }
        }
    }

    /* renamed from: F */
    static float m3431F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m3430G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m3429H(ViewGroup viewGroup) {
        if (this.f4941a == null) {
            this.f4941a = this.f4945e ? C0291c.m8445l(viewGroup, this.f4944d, this.f4950j) : C0291c.m8444m(viewGroup, this.f4950j);
        }
    }

    /* renamed from: I */
    static float m3428I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: D */
    public boolean mo2436D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0291c c0291c = this.f4941a;
        if (c0291c != null) {
            c0291c.m8431z(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo2664E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m3427J(float f) {
        this.f4949i = m3431F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void m3426K(InterfaceC1728b interfaceC1728b) {
        this.f4942b = interfaceC1728b;
    }

    /* renamed from: L */
    public void m3425L(float f) {
        this.f4948h = m3431F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void m3424M(int i) {
        this.f4946f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: k */
    public boolean mo2661k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f4943c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m7089B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f4943c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4943c = false;
        }
        if (z) {
            m3429H(coordinatorLayout);
            return this.f4941a.m8459G(motionEvent);
        }
        return false;
    }
}
