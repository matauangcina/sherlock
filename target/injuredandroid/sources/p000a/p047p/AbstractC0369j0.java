package p000a.p047p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p000a.p047p.AbstractC0377m;
import p000a.p047p.C0328a;
/* renamed from: a.p.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC0369j0 extends AbstractC0377m {

    /* renamed from: P */
    private static final String[] f948P = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: O */
    private int f949O = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.p.j0$a */
    /* loaded from: classes.dex */
    public class C0370a extends C0385n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f950a;

        /* renamed from: b */
        final /* synthetic */ View f951b;

        /* renamed from: c */
        final /* synthetic */ View f952c;

        C0370a(ViewGroup viewGroup, View view, View view2) {
            this.f950a = viewGroup;
            this.f951b = view;
            this.f952c = view2;
        }

        @Override // p000a.p047p.C0385n, p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: c */
        public void mo8276c(AbstractC0377m abstractC0377m) {
            C0399x.m8225a(this.f950a).mo8226c(this.f951b);
        }

        @Override // p000a.p047p.C0385n, p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: d */
        public void mo8275d(AbstractC0377m abstractC0377m) {
            if (this.f951b.getParent() == null) {
                C0399x.m8225a(this.f950a).mo8227a(this.f951b);
            } else {
                AbstractC0369j0.this.mo8249f();
            }
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            this.f952c.setTag(C0368j.save_overlay_view, null);
            C0399x.m8225a(this.f950a).mo8226c(this.f951b);
            abstractC0377m.mo8265P(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.p.j0$b */
    /* loaded from: classes.dex */
    public static class C0371b extends AnimatorListenerAdapter implements AbstractC0377m.InterfaceC0383f, C0328a.InterfaceC0329a {

        /* renamed from: a */
        private final View f954a;

        /* renamed from: b */
        private final int f955b;

        /* renamed from: c */
        private final ViewGroup f956c;

        /* renamed from: d */
        private final boolean f957d;

        /* renamed from: e */
        private boolean f958e;

        /* renamed from: f */
        boolean f959f = false;

        C0371b(View view, int i, boolean z) {
            this.f954a = view;
            this.f955b = i;
            this.f956c = (ViewGroup) view.getParent();
            this.f957d = z;
            m8317g(true);
        }

        /* renamed from: f */
        private void m8318f() {
            if (!this.f959f) {
                C0345c0.m8348h(this.f954a, this.f955b);
                ViewGroup viewGroup = this.f956c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m8317g(false);
        }

        /* renamed from: g */
        private void m8317g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f957d || this.f958e == z || (viewGroup = this.f956c) == null) {
                return;
            }
            this.f958e = z;
            C0399x.m8223c(viewGroup, z);
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: a */
        public void mo8233a(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: b */
        public void mo8277b(AbstractC0377m abstractC0377m) {
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: c */
        public void mo8276c(AbstractC0377m abstractC0377m) {
            m8317g(false);
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: d */
        public void mo8275d(AbstractC0377m abstractC0377m) {
            m8317g(true);
        }

        @Override // p000a.p047p.AbstractC0377m.InterfaceC0383f
        /* renamed from: e */
        public void mo8232e(AbstractC0377m abstractC0377m) {
            m8318f();
            abstractC0377m.mo8265P(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f959f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m8318f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p000a.p047p.C0328a.InterfaceC0329a
        public void onAnimationPause(Animator animator) {
            if (this.f959f) {
                return;
            }
            C0345c0.m8348h(this.f954a, this.f955b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p000a.p047p.C0328a.InterfaceC0329a
        public void onAnimationResume(Animator animator) {
            if (this.f959f) {
                return;
            }
            C0345c0.m8348h(this.f954a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.p.j0$c */
    /* loaded from: classes.dex */
    public static class C0372c {

        /* renamed from: a */
        boolean f960a;

        /* renamed from: b */
        boolean f961b;

        /* renamed from: c */
        int f962c;

        /* renamed from: d */
        int f963d;

        /* renamed from: e */
        ViewGroup f964e;

        /* renamed from: f */
        ViewGroup f965f;

        C0372c() {
        }
    }

    /* renamed from: c0 */
    private void m8325c0(C0394s c0394s) {
        c0394s.f1031a.put("android:visibility:visibility", Integer.valueOf(c0394s.f1032b.getVisibility()));
        c0394s.f1031a.put("android:visibility:parent", c0394s.f1032b.getParent());
        int[] iArr = new int[2];
        c0394s.f1032b.getLocationOnScreen(iArr);
        c0394s.f1031a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r9 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r0.f964e == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r0.f962c == 0) goto L26;
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p000a.p047p.AbstractC0369j0.C0372c m8324d0(p000a.p047p.C0394s r8, p000a.p047p.C0394s r9) {
        /*
            r7 = this;
            a.p.j0$c r0 = new a.p.j0$c
            r0.<init>()
            r1 = 0
            r0.f960a = r1
            r0.f961b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1031a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1031a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f962c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1031a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f964e = r6
            goto L37
        L33:
            r0.f962c = r4
            r0.f964e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1031a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1031a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f963d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1031a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f965f = r2
            goto L5e
        L5a:
            r0.f963d = r4
            r0.f965f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L86
            if (r9 == 0) goto L86
            int r8 = r0.f962c
            int r9 = r0.f963d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.f964e
            android.view.ViewGroup r9 = r0.f965f
            if (r8 != r9) goto L70
            return r0
        L70:
            int r8 = r0.f962c
            int r9 = r0.f963d
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L79
            goto L97
        L79:
            if (r9 != 0) goto L9a
            goto L8c
        L7c:
            android.view.ViewGroup r8 = r0.f965f
            if (r8 != 0) goto L81
            goto L97
        L81:
            android.view.ViewGroup r8 = r0.f964e
            if (r8 != 0) goto L9a
            goto L8c
        L86:
            if (r8 != 0) goto L91
            int r8 = r0.f963d
            if (r8 != 0) goto L91
        L8c:
            r0.f961b = r2
        L8e:
            r0.f960a = r2
            goto L9a
        L91:
            if (r9 != 0) goto L9a
            int r8 = r0.f962c
            if (r8 != 0) goto L9a
        L97:
            r0.f961b = r1
            goto L8e
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p047p.AbstractC0369j0.m8324d0(a.p.s, a.p.s):a.p.j0$c");
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: D */
    public String[] mo8309D() {
        return f948P;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: F */
    public boolean mo8307F(C0394s c0394s, C0394s c0394s2) {
        if (c0394s == null && c0394s2 == null) {
            return false;
        }
        if (c0394s == null || c0394s2 == null || c0394s2.f1031a.containsKey("android:visibility:visibility") == c0394s.f1031a.containsKey("android:visibility:visibility")) {
            C0372c m8324d0 = m8324d0(c0394s, c0394s2);
            if (m8324d0.f960a) {
                return m8324d0.f962c == 0 || m8324d0.f963d == 0;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e0 */
    public abstract Animator mo8323e0(ViewGroup viewGroup, View view, C0394s c0394s, C0394s c0394s2);

    /* renamed from: f0 */
    public Animator m8322f0(ViewGroup viewGroup, C0394s c0394s, int i, C0394s c0394s2, int i2) {
        if ((this.f949O & 1) != 1 || c0394s2 == null) {
            return null;
        }
        if (c0394s == null) {
            View view = (View) c0394s2.f1032b.getParent();
            if (m8324d0(m8285t(view, false), m8308E(view, false)).f960a) {
                return null;
            }
        }
        return mo8323e0(viewGroup, c0394s2.f1032b, c0394s, c0394s2);
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: g */
    public void mo8247g(C0394s c0394s) {
        m8325c0(c0394s);
    }

    /* renamed from: g0 */
    public abstract Animator mo8321g0(ViewGroup viewGroup, View view, C0394s c0394s, C0394s c0394s2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
        if (r10.f974A != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m8320h0(android.view.ViewGroup r11, p000a.p047p.C0394s r12, int r13, p000a.p047p.C0394s r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p047p.AbstractC0369j0.m8320h0(android.view.ViewGroup, a.p.s, int, a.p.s, int):android.animation.Animator");
    }

    /* renamed from: i0 */
    public void m8319i0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f949O = i;
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: j */
    public void mo8242j(C0394s c0394s) {
        m8325c0(c0394s);
    }

    @Override // p000a.p047p.AbstractC0377m
    /* renamed from: n */
    public Animator mo8290n(ViewGroup viewGroup, C0394s c0394s, C0394s c0394s2) {
        C0372c m8324d0 = m8324d0(c0394s, c0394s2);
        if (m8324d0.f960a) {
            if (m8324d0.f964e == null && m8324d0.f965f == null) {
                return null;
            }
            return m8324d0.f961b ? m8322f0(viewGroup, c0394s, m8324d0.f962c, c0394s2, m8324d0.f963d) : m8320h0(viewGroup, c0394s, m8324d0.f962c, c0394s2, m8324d0.f963d);
        }
        return null;
    }
}
