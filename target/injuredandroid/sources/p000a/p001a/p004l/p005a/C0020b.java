package p000a.p001a.p004l.p005a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0759a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.a.l.a.b */
/* loaded from: classes.dex */
public class C0020b extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private AbstractC0023c f21f;

    /* renamed from: g */
    private Rect f22g;

    /* renamed from: h */
    private Drawable f23h;

    /* renamed from: i */
    private Drawable f24i;

    /* renamed from: k */
    private boolean f26k;

    /* renamed from: m */
    private boolean f28m;

    /* renamed from: n */
    private Runnable f29n;

    /* renamed from: o */
    private long f30o;

    /* renamed from: p */
    private long f31p;

    /* renamed from: q */
    private C0022b f32q;

    /* renamed from: j */
    private int f25j = 255;

    /* renamed from: l */
    private int f27l = -1;

    /* renamed from: a.a.l.a.b$a */
    /* loaded from: classes.dex */
    class RunnableC0021a implements Runnable {
        RunnableC0021a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0020b.this.m9550a(true);
            C0020b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.b$b */
    /* loaded from: classes.dex */
    public static class C0022b implements Drawable.Callback {

        /* renamed from: f */
        private Drawable.Callback f34f;

        C0022b() {
        }

        /* renamed from: a */
        public Drawable.Callback m9543a() {
            Drawable.Callback callback = this.f34f;
            this.f34f = null;
            return callback;
        }

        /* renamed from: b */
        public C0022b m9542b(Drawable.Callback callback) {
            this.f34f = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f34f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f34f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.a.l.a.b$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0023c extends Drawable.ConstantState {

        /* renamed from: A */
        int f35A;

        /* renamed from: B */
        int f36B;

        /* renamed from: C */
        boolean f37C;

        /* renamed from: D */
        ColorFilter f38D;

        /* renamed from: E */
        boolean f39E;

        /* renamed from: F */
        ColorStateList f40F;

        /* renamed from: G */
        PorterDuff.Mode f41G;

        /* renamed from: H */
        boolean f42H;

        /* renamed from: I */
        boolean f43I;

        /* renamed from: a */
        final C0020b f44a;

        /* renamed from: b */
        Resources f45b;

        /* renamed from: c */
        int f46c;

        /* renamed from: d */
        int f47d;

        /* renamed from: e */
        int f48e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f49f;

        /* renamed from: g */
        Drawable[] f50g;

        /* renamed from: h */
        int f51h;

        /* renamed from: i */
        boolean f52i;

        /* renamed from: j */
        boolean f53j;

        /* renamed from: k */
        Rect f54k;

        /* renamed from: l */
        boolean f55l;

        /* renamed from: m */
        boolean f56m;

        /* renamed from: n */
        int f57n;

        /* renamed from: o */
        int f58o;

        /* renamed from: p */
        int f59p;

        /* renamed from: q */
        int f60q;

        /* renamed from: r */
        boolean f61r;

        /* renamed from: s */
        int f62s;

        /* renamed from: t */
        boolean f63t;

        /* renamed from: u */
        boolean f64u;

        /* renamed from: v */
        boolean f65v;

        /* renamed from: w */
        boolean f66w;

        /* renamed from: x */
        boolean f67x;

        /* renamed from: y */
        boolean f68y;

        /* renamed from: z */
        int f69z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0023c(AbstractC0023c abstractC0023c, C0020b c0020b, Resources resources) {
            this.f46c = 160;
            this.f52i = false;
            this.f55l = false;
            this.f67x = true;
            this.f35A = 0;
            this.f36B = 0;
            this.f44a = c0020b;
            this.f45b = resources != null ? resources : abstractC0023c != null ? abstractC0023c.f45b : null;
            int m9546f = C0020b.m9546f(resources, abstractC0023c != null ? abstractC0023c.f46c : 0);
            this.f46c = m9546f;
            if (abstractC0023c == null) {
                this.f50g = new Drawable[10];
                this.f51h = 0;
                return;
            }
            this.f47d = abstractC0023c.f47d;
            this.f48e = abstractC0023c.f48e;
            this.f65v = true;
            this.f66w = true;
            this.f52i = abstractC0023c.f52i;
            this.f55l = abstractC0023c.f55l;
            this.f67x = abstractC0023c.f67x;
            this.f68y = abstractC0023c.f68y;
            this.f69z = abstractC0023c.f69z;
            this.f35A = abstractC0023c.f35A;
            this.f36B = abstractC0023c.f36B;
            this.f37C = abstractC0023c.f37C;
            this.f38D = abstractC0023c.f38D;
            this.f39E = abstractC0023c.f39E;
            this.f40F = abstractC0023c.f40F;
            this.f41G = abstractC0023c.f41G;
            this.f42H = abstractC0023c.f42H;
            this.f43I = abstractC0023c.f43I;
            if (abstractC0023c.f46c == m9546f) {
                if (abstractC0023c.f53j) {
                    this.f54k = new Rect(abstractC0023c.f54k);
                    this.f53j = true;
                }
                if (abstractC0023c.f56m) {
                    this.f57n = abstractC0023c.f57n;
                    this.f58o = abstractC0023c.f58o;
                    this.f59p = abstractC0023c.f59p;
                    this.f60q = abstractC0023c.f60q;
                    this.f56m = true;
                }
            }
            if (abstractC0023c.f61r) {
                this.f62s = abstractC0023c.f62s;
                this.f61r = true;
            }
            if (abstractC0023c.f63t) {
                this.f64u = abstractC0023c.f64u;
                this.f63t = true;
            }
            Drawable[] drawableArr = abstractC0023c.f50g;
            this.f50g = new Drawable[drawableArr.length];
            this.f51h = abstractC0023c.f51h;
            SparseArray<Drawable.ConstantState> sparseArray = abstractC0023c.f49f;
            this.f49f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f51h);
            int i = this.f51h;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f49f.put(i2, constantState);
                    } else {
                        this.f50g[i2] = drawableArr[i2];
                    }
                }
            }
        }

        /* renamed from: e */
        private void m9537e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f49f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f50g[this.f49f.keyAt(i)] = m9525s(this.f49f.valueAt(i).newDrawable(this.f45b));
                }
                this.f49f = null;
            }
        }

        /* renamed from: s */
        private Drawable m9525s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f69z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f44a);
            return mutate;
        }

        /* renamed from: a */
        public final int m9541a(Drawable drawable) {
            int i = this.f51h;
            if (i >= this.f50g.length) {
                mo9511o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f44a);
            this.f50g[i] = drawable;
            this.f51h++;
            this.f48e = drawable.getChangingConfigurations() | this.f48e;
            m9527p();
            this.f54k = null;
            this.f53j = false;
            this.f56m = false;
            this.f65v = false;
            return i;
        }

        /* renamed from: b */
        final void m9540b(Resources.Theme theme) {
            if (theme != null) {
                m9537e();
                int i = this.f51h;
                Drawable[] drawableArr = this.f50g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f48e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m9519y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean m9539c() {
            if (this.f65v) {
                return this.f66w;
            }
            m9537e();
            this.f65v = true;
            int i = this.f51h;
            Drawable[] drawableArr = this.f50g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f66w = false;
                    return false;
                }
            }
            this.f66w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f51h;
            Drawable[] drawableArr = this.f50g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f49f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m9538d() {
            this.f56m = true;
            m9537e();
            int i = this.f51h;
            Drawable[] drawableArr = this.f50g;
            this.f58o = -1;
            this.f57n = -1;
            this.f60q = 0;
            this.f59p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f57n) {
                    this.f57n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f58o) {
                    this.f58o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f59p) {
                    this.f59p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f60q) {
                    this.f60q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public final int m9536f() {
            return this.f50g.length;
        }

        /* renamed from: g */
        public final Drawable m9535g(int i) {
            int indexOfKey;
            Drawable drawable = this.f50g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f49f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m9525s = m9525s(this.f49f.valueAt(indexOfKey).newDrawable(this.f45b));
            this.f50g[i] = m9525s;
            this.f49f.removeAt(indexOfKey);
            if (this.f49f.size() == 0) {
                this.f49f = null;
            }
            return m9525s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f47d | this.f48e;
        }

        /* renamed from: h */
        public final int m9534h() {
            return this.f51h;
        }

        /* renamed from: i */
        public final int m9533i() {
            if (!this.f56m) {
                m9538d();
            }
            return this.f58o;
        }

        /* renamed from: j */
        public final int m9532j() {
            if (!this.f56m) {
                m9538d();
            }
            return this.f60q;
        }

        /* renamed from: k */
        public final int m9531k() {
            if (!this.f56m) {
                m9538d();
            }
            return this.f59p;
        }

        /* renamed from: l */
        public final Rect m9530l() {
            Rect rect = null;
            if (this.f52i) {
                return null;
            }
            if (this.f54k != null || this.f53j) {
                return this.f54k;
            }
            m9537e();
            Rect rect2 = new Rect();
            int i = this.f51h;
            Drawable[] drawableArr = this.f50g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect2.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect2.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect2.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect2.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f53j = true;
            this.f54k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int m9529m() {
            if (!this.f56m) {
                m9538d();
            }
            return this.f57n;
        }

        /* renamed from: n */
        public final int m9528n() {
            if (this.f61r) {
                return this.f62s;
            }
            m9537e();
            int i = this.f51h;
            Drawable[] drawableArr = this.f50g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f62s = opacity;
            this.f61r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo9511o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f50g, 0, drawableArr, 0, i);
            this.f50g = drawableArr;
        }

        /* renamed from: p */
        void m9527p() {
            this.f61r = false;
            this.f63t = false;
        }

        /* renamed from: q */
        public final boolean m9526q() {
            return this.f55l;
        }

        /* renamed from: r */
        abstract void mo9510r();

        /* renamed from: t */
        public final void m9524t(boolean z) {
            this.f55l = z;
        }

        /* renamed from: u */
        public final void m9523u(int i) {
            this.f35A = i;
        }

        /* renamed from: v */
        public final void m9522v(int i) {
            this.f36B = i;
        }

        /* renamed from: w */
        final boolean m9521w(int i, int i2) {
            int i3 = this.f51h;
            Drawable[] drawableArr = this.f50g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f69z = i;
            return z;
        }

        /* renamed from: x */
        public final void m9520x(boolean z) {
            this.f52i = z;
        }

        /* renamed from: y */
        final void m9519y(Resources resources) {
            if (resources != null) {
                this.f45b = resources;
                int m9546f = C0020b.m9546f(resources, this.f46c);
                int i = this.f46c;
                this.f46c = m9546f;
                if (i != m9546f) {
                    this.f56m = false;
                    this.f53j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m9548d(Drawable drawable) {
        if (this.f32q == null) {
            this.f32q = new C0022b();
        }
        C0022b c0022b = this.f32q;
        c0022b.m9542b(drawable.getCallback());
        drawable.setCallback(c0022b);
        try {
            if (this.f21f.f35A <= 0 && this.f26k) {
                drawable.setAlpha(this.f25j);
            }
            if (this.f21f.f39E) {
                drawable.setColorFilter(this.f21f.f38D);
            } else {
                if (this.f21f.f42H) {
                    C0759a.m6747o(drawable, this.f21f.f40F);
                }
                if (this.f21f.f43I) {
                    C0759a.m6746p(drawable, this.f21f.f41G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f21f.f67x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f21f.f37C);
            }
            Rect rect = this.f22g;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f32q.m9543a());
        }
    }

    /* renamed from: e */
    private boolean m9547e() {
        return isAutoMirrored() && C0759a.m6756f(this) == 1;
    }

    /* renamed from: f */
    static int m9546f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m9550a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f26k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f23h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f30o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f25j
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            a.a.l.a.b$c r9 = r13.f21f
            int r9 = r9.f35A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f25j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f30o = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f24i
            if (r9 == 0) goto L61
            long r10 = r13.f31p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f24i = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.a.l.a.b$c r4 = r13.f21f
            int r4 = r4.f36B
            int r3 = r3 / r4
            int r4 = r13.f25j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f31p = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f29n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p004l.p005a.C0020b.m9550a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f21f.m9540b(theme);
    }

    /* renamed from: b */
    abstract AbstractC0023c mo9516b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m9549c() {
        return this.f27l;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f21f.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f23h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f24i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m9545g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f27l
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.a.l.a.b$c r0 = r9.f21f
            int r0 = r0.f36B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f24i
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f23h
            if (r0 == 0) goto L29
            r9.f24i = r0
            a.a.l.a.b$c r0 = r9.f21f
            int r0 = r0.f36B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f31p = r0
            goto L35
        L29:
            r9.f24i = r4
            r9.f31p = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f23h
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            a.a.l.a.b$c r0 = r9.f21f
            int r1 = r0.f51h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m9535g(r10)
            r9.f23h = r0
            r9.f27l = r10
            if (r0 == 0) goto L5a
            a.a.l.a.b$c r10 = r9.f21f
            int r10 = r10.f35A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f30o = r2
        L51:
            r9.m9548d(r0)
            goto L5a
        L55:
            r9.f23h = r4
            r10 = -1
            r9.f27l = r10
        L5a:
            long r0 = r9.f30o
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f31p
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f29n
            if (r0 != 0) goto L73
            a.a.l.a.b$a r0 = new a.a.l.a.b$a
            r0.<init>()
            r9.f29n = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m9550a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p004l.p005a.C0020b.m9545g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f25j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f21f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f21f.m9539c()) {
            this.f21f.f47d = getChangingConfigurations();
            return this.f21f;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f23h;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f22g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f21f.m9526q()) {
            return this.f21f.m9533i();
        }
        Drawable drawable = this.f23h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f21f.m9526q()) {
            return this.f21f.m9529m();
        }
        Drawable drawable = this.f23h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f21f.m9526q()) {
            return this.f21f.m9532j();
        }
        Drawable drawable = this.f23h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f21f.m9526q()) {
            return this.f21f.m9531k();
        }
        Drawable drawable = this.f23h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f23h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f21f.m9528n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f23h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m9530l = this.f21f.m9530l();
        if (m9530l != null) {
            rect.set(m9530l);
            padding = (m9530l.right | ((m9530l.left | m9530l.top) | m9530l.bottom)) != 0;
        } else {
            Drawable drawable = this.f23h;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m9547e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9515h(AbstractC0023c abstractC0023c) {
        this.f21f = abstractC0023c;
        int i = this.f27l;
        if (i >= 0) {
            Drawable m9535g = abstractC0023c.m9535g(i);
            this.f23h = m9535g;
            if (m9535g != null) {
                m9548d(m9535g);
            }
        }
        this.f24i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m9544i(Resources resources) {
        this.f21f.m9519y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC0023c abstractC0023c = this.f21f;
        if (abstractC0023c != null) {
            abstractC0023c.m9527p();
        }
        if (drawable != this.f23h || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f21f.f37C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f24i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f24i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f23h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f26k) {
                this.f23h.setAlpha(this.f25j);
            }
        }
        if (this.f31p != 0) {
            this.f31p = 0L;
            z = true;
        }
        if (this.f30o != 0) {
            this.f30o = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f28m && super.mutate() == this) {
            AbstractC0023c mo9516b = mo9516b();
            mo9516b.mo9510r();
            mo9515h(mo9516b);
            this.f28m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f23h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f21f.m9521w(i, m9549c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f24i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f23h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f24i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f23h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f23h || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f26k && this.f25j == i) {
            return;
        }
        this.f26k = true;
        this.f25j = i;
        Drawable drawable = this.f23h;
        if (drawable != null) {
            if (this.f30o == 0) {
                drawable.setAlpha(i);
            } else {
                m9550a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC0023c abstractC0023c = this.f21f;
        if (abstractC0023c.f37C != z) {
            abstractC0023c.f37C = z;
            Drawable drawable = this.f23h;
            if (drawable != null) {
                C0759a.m6752j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0023c abstractC0023c = this.f21f;
        abstractC0023c.f39E = true;
        if (abstractC0023c.f38D != colorFilter) {
            abstractC0023c.f38D = colorFilter;
            Drawable drawable = this.f23h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC0023c abstractC0023c = this.f21f;
        if (abstractC0023c.f67x != z) {
            abstractC0023c.f67x = z;
            Drawable drawable = this.f23h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f23h;
        if (drawable != null) {
            C0759a.m6751k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f22g;
        if (rect == null) {
            this.f22g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f23h;
        if (drawable != null) {
            C0759a.m6750l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC0023c abstractC0023c = this.f21f;
        abstractC0023c.f42H = true;
        if (abstractC0023c.f40F != colorStateList) {
            abstractC0023c.f40F = colorStateList;
            C0759a.m6747o(this.f23h, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC0023c abstractC0023c = this.f21f;
        abstractC0023c.f43I = true;
        if (abstractC0023c.f41G != mode) {
            abstractC0023c.f41G = mode;
            C0759a.m6746p(this.f23h, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f24i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f23h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f23h || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
