package p000a.p032i.p034b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p000a.p019g.p028k.C0252s;
/* renamed from: a.i.b.c */
/* loaded from: classes.dex */
public class C0291c {

    /* renamed from: x */
    private static final Interpolator f791x = new animationInterpolatorC0292a();

    /* renamed from: a */
    private int f792a;

    /* renamed from: b */
    private int f793b;

    /* renamed from: d */
    private float[] f795d;

    /* renamed from: e */
    private float[] f796e;

    /* renamed from: f */
    private float[] f797f;

    /* renamed from: g */
    private float[] f798g;

    /* renamed from: h */
    private int[] f799h;

    /* renamed from: i */
    private int[] f800i;

    /* renamed from: j */
    private int[] f801j;

    /* renamed from: k */
    private int f802k;

    /* renamed from: l */
    private VelocityTracker f803l;

    /* renamed from: m */
    private float f804m;

    /* renamed from: n */
    private float f805n;

    /* renamed from: o */
    private int f806o;

    /* renamed from: p */
    private final int f807p;

    /* renamed from: q */
    private int f808q;

    /* renamed from: r */
    private OverScroller f809r;

    /* renamed from: s */
    private final AbstractC0294c f810s;

    /* renamed from: t */
    private View f811t;

    /* renamed from: u */
    private boolean f812u;

    /* renamed from: v */
    private final ViewGroup f813v;

    /* renamed from: c */
    private int f794c = -1;

    /* renamed from: w */
    private final Runnable f814w = new RunnableC0293b();

    /* renamed from: a.i.b.c$a  reason: invalid class name */
    /* loaded from: classes.dex */
    class animationInterpolatorC0292a implements Interpolator {
        animationInterpolatorC0292a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: a.i.b.c$b */
    /* loaded from: classes.dex */
    class RunnableC0293b implements Runnable {
        RunnableC0293b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0291c.this.m8461E(0);
        }
    }

    /* renamed from: a.i.b.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0294c {
        /* renamed from: a */
        public abstract int mo3329a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo3328b(View view, int i, int i2);

        /* renamed from: c */
        public int m8430c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo3423d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo3327e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void m8429f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean m8428g(int i) {
            return false;
        }

        /* renamed from: h */
        public void m8427h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo3422i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo3326j(int i);

        /* renamed from: k */
        public abstract void mo3325k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo3324l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo3323m(View view, int i);
    }

    private C0291c(Context context, ViewGroup viewGroup, AbstractC0294c abstractC0294c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0294c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f813v = viewGroup;
        this.f810s = abstractC0294c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f807p = i;
        this.f806o = i;
        this.f793b = viewConfiguration.getScaledTouchSlop();
        this.f804m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f805n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f809r = new OverScroller(context, f791x);
    }

    /* renamed from: A */
    private void m8465A() {
        this.f803l.computeCurrentVelocity(1000, this.f804m);
        m8443n(m8452e(this.f803l.getXVelocity(this.f794c), this.f805n, this.f804m), m8452e(this.f803l.getYVelocity(this.f794c), this.f805n, this.f804m));
    }

    /* renamed from: B */
    private void m8464B(float f, float f2, int i) {
        int i2 = m8454c(f, f2, i, 1) ? 1 : 0;
        if (m8454c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m8454c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m8454c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f800i;
            iArr[i] = iArr[i] | i2;
            this.f810s.m8429f(i2, i);
        }
    }

    /* renamed from: C */
    private void m8463C(float f, float f2, int i) {
        m8440q(i);
        float[] fArr = this.f795d;
        this.f797f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f796e;
        this.f798g[i] = f2;
        fArr2[i] = f2;
        this.f799h[i] = m8437t((int) f, (int) f2);
        this.f802k |= 1 << i;
    }

    /* renamed from: D */
    private void m8462D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m8433x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f797f[pointerId] = x;
                this.f798g[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m8454c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f799h[i] & i2) != i2 || (this.f808q & i2) == 0 || (this.f801j[i] & i2) == i2 || (this.f800i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f793b;
        if (abs > i3 || abs2 > i3) {
            if (abs >= abs2 * 0.5f || !this.f810s.m8428g(i2)) {
                return (this.f800i[i] & i2) == 0 && abs > ((float) this.f793b);
            }
            int[] iArr = this.f801j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m8453d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f810s.mo3423d(view) > 0;
        boolean z2 = this.f810s.mo3327e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f793b) : z2 && Math.abs(f2) > ((float) this.f793b);
        }
        int i = this.f793b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: e */
    private float m8452e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: f */
    private int m8451f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: g */
    private void m8450g() {
        float[] fArr = this.f795d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f796e, 0.0f);
        Arrays.fill(this.f797f, 0.0f);
        Arrays.fill(this.f798g, 0.0f);
        Arrays.fill(this.f799h, 0);
        Arrays.fill(this.f800i, 0);
        Arrays.fill(this.f801j, 0);
        this.f802k = 0;
    }

    /* renamed from: h */
    private void m8449h(int i) {
        if (this.f795d == null || !m8434w(i)) {
            return;
        }
        this.f795d[i] = 0.0f;
        this.f796e[i] = 0.0f;
        this.f797f[i] = 0.0f;
        this.f798g[i] = 0.0f;
        this.f799h[i] = 0;
        this.f800i[i] = 0;
        this.f801j[i] = 0;
        this.f802k = (~(1 << i)) & this.f802k;
    }

    /* renamed from: i */
    private int m8448i(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f813v.getWidth();
        float f = width / 2;
        float m8442o = f + (m8442o(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(m8442o / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: j */
    private int m8447j(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m8451f = m8451f(i3, (int) this.f805n, (int) this.f804m);
        int m8451f2 = m8451f(i4, (int) this.f805n, (int) this.f804m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m8451f);
        int abs4 = Math.abs(m8451f2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m8451f != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m8451f2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m8448i(i, m8451f, this.f810s.mo3423d(view)) * f5) + (m8448i(i2, m8451f2, this.f810s.mo3327e(view)) * (f3 / f4)));
    }

    /* renamed from: l */
    public static C0291c m8445l(ViewGroup viewGroup, float f, AbstractC0294c abstractC0294c) {
        C0291c m8444m = m8444m(viewGroup, abstractC0294c);
        m8444m.f793b = (int) (m8444m.f793b * (1.0f / f));
        return m8444m;
    }

    /* renamed from: m */
    public static C0291c m8444m(ViewGroup viewGroup, AbstractC0294c abstractC0294c) {
        return new C0291c(viewGroup.getContext(), viewGroup, abstractC0294c);
    }

    /* renamed from: n */
    private void m8443n(float f, float f2) {
        this.f812u = true;
        this.f810s.mo3324l(this.f811t, f, f2);
        this.f812u = false;
        if (this.f792a == 1) {
            m8461E(0);
        }
    }

    /* renamed from: o */
    private float m8442o(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: p */
    private void m8441p(int i, int i2, int i3, int i4) {
        int left = this.f811t.getLeft();
        int top = this.f811t.getTop();
        if (i3 != 0) {
            i = this.f810s.mo3329a(this.f811t, i, i3);
            C0252s.m8645R(this.f811t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f810s.mo3328b(this.f811t, i2, i4);
            C0252s.m8644S(this.f811t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f810s.mo3325k(this.f811t, i5, i6, i5 - left, i6 - top);
    }

    /* renamed from: q */
    private void m8440q(int i) {
        float[] fArr = this.f795d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f795d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f796e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f797f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f798g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f799h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f800i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f801j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f795d = fArr2;
            this.f796e = fArr3;
            this.f797f = fArr4;
            this.f798g = fArr5;
            this.f799h = iArr;
            this.f800i = iArr2;
            this.f801j = iArr3;
        }
    }

    /* renamed from: s */
    private boolean m8438s(int i, int i2, int i3, int i4) {
        int left = this.f811t.getLeft();
        int top = this.f811t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f809r.abortAnimation();
            m8461E(0);
            return false;
        }
        this.f809r.startScroll(left, top, i5, i6, m8447j(this.f811t, i5, i6, i3, i4));
        m8461E(2);
        return true;
    }

    /* renamed from: t */
    private int m8437t(int i, int i2) {
        int i3 = i < this.f813v.getLeft() + this.f806o ? 1 : 0;
        if (i2 < this.f813v.getTop() + this.f806o) {
            i3 |= 4;
        }
        if (i > this.f813v.getRight() - this.f806o) {
            i3 |= 2;
        }
        return i2 > this.f813v.getBottom() - this.f806o ? i3 | 8 : i3;
    }

    /* renamed from: x */
    private boolean m8433x(int i) {
        if (m8434w(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: E */
    void m8461E(int i) {
        this.f813v.removeCallbacks(this.f814w);
        if (this.f792a != i) {
            this.f792a = i;
            this.f810s.mo3326j(i);
            if (this.f792a == 0) {
                this.f811t = null;
            }
        }
    }

    /* renamed from: F */
    public boolean m8460F(int i, int i2) {
        if (this.f812u) {
            return m8438s(i, i2, (int) this.f803l.getXVelocity(this.f794c), (int) this.f803l.getYVelocity(this.f794c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L57;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m8459G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p032i.p034b.C0291c.m8459G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean m8458H(View view, int i, int i2) {
        this.f811t = view;
        this.f794c = -1;
        boolean m8438s = m8438s(i, i2, 0, 0);
        if (!m8438s && this.f792a == 0 && this.f811t != null) {
            this.f811t = null;
        }
        return m8438s;
    }

    /* renamed from: I */
    boolean m8457I(View view, int i) {
        if (view == this.f811t && this.f794c == i) {
            return true;
        }
        if (view == null || !this.f810s.mo3323m(view, i)) {
            return false;
        }
        this.f794c = i;
        m8455b(view, i);
        return true;
    }

    /* renamed from: a */
    public void m8456a() {
        this.f794c = -1;
        m8450g();
        VelocityTracker velocityTracker = this.f803l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f803l = null;
        }
    }

    /* renamed from: b */
    public void m8455b(View view, int i) {
        if (view.getParent() == this.f813v) {
            this.f811t = view;
            this.f794c = i;
            this.f810s.mo3422i(view, i);
            m8461E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f813v + ")");
    }

    /* renamed from: k */
    public boolean m8446k(boolean z) {
        if (this.f792a == 2) {
            boolean computeScrollOffset = this.f809r.computeScrollOffset();
            int currX = this.f809r.getCurrX();
            int currY = this.f809r.getCurrY();
            int left = currX - this.f811t.getLeft();
            int top = currY - this.f811t.getTop();
            if (left != 0) {
                C0252s.m8645R(this.f811t, left);
            }
            if (top != 0) {
                C0252s.m8644S(this.f811t, top);
            }
            if (left != 0 || top != 0) {
                this.f810s.mo3325k(this.f811t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f809r.getFinalX() && currY == this.f809r.getFinalY()) {
                this.f809r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f813v.post(this.f814w);
                } else {
                    m8461E(0);
                }
            }
        }
        return this.f792a == 2;
    }

    /* renamed from: r */
    public View m8439r(int i, int i2) {
        for (int childCount = this.f813v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f813v;
            this.f810s.m8430c(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: u */
    public int m8436u() {
        return this.f793b;
    }

    /* renamed from: v */
    public boolean m8435v(int i, int i2) {
        return m8432y(this.f811t, i, i2);
    }

    /* renamed from: w */
    public boolean m8434w(int i) {
        return ((1 << i) & this.f802k) != 0;
    }

    /* renamed from: y */
    public boolean m8432y(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: z */
    public void m8431z(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m8456a();
        }
        if (this.f803l == null) {
            this.f803l = VelocityTracker.obtain();
        }
        this.f803l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m8439r = m8439r((int) x, (int) y);
            m8463C(x, y, pointerId);
            m8457I(m8439r, pointerId);
            int i3 = this.f799h[pointerId];
            int i4 = this.f808q;
            if ((i3 & i4) != 0) {
                this.f810s.m8427h(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f792a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m8433x(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f795d[pointerId2];
                            float f2 = y2 - this.f796e[pointerId2];
                            m8464B(f, f2, pointerId2);
                            if (this.f792a != 1) {
                                View m8439r2 = m8439r((int) x2, (int) y2);
                                if (m8453d(m8439r2, f, f2) && m8457I(m8439r2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else if (!m8433x(this.f794c)) {
                    return;
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f794c);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f797f;
                    int i5 = this.f794c;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f798g[i5]);
                    m8441p(this.f811t.getLeft() + i6, this.f811t.getTop() + i7, i6, i7);
                }
                m8462D(motionEvent);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    m8463C(x4, y4, pointerId3);
                    if (this.f792a != 0) {
                        if (m8435v((int) x4, (int) y4)) {
                            m8457I(this.f811t, pointerId3);
                            return;
                        }
                        return;
                    }
                    m8457I(m8439r((int) x4, (int) y4), pointerId3);
                    int i8 = this.f799h[pointerId3];
                    int i9 = this.f808q;
                    if ((i8 & i9) != 0) {
                        this.f810s.m8427h(i8 & i9, pointerId3);
                        return;
                    }
                    return;
                } else if (actionMasked != 6) {
                    return;
                } else {
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    if (this.f792a == 1 && pointerId4 == this.f794c) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (true) {
                            if (i2 >= pointerCount2) {
                                i = -1;
                                break;
                            }
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f794c) {
                                View m8439r3 = m8439r((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                View view = this.f811t;
                                if (m8439r3 == view && m8457I(view, pointerId5)) {
                                    i = this.f794c;
                                    break;
                                }
                            }
                            i2++;
                        }
                        if (i == -1) {
                            m8465A();
                        }
                    }
                    m8449h(pointerId4);
                    return;
                }
            } else if (this.f792a == 1) {
                m8443n(0.0f, 0.0f);
            }
        } else if (this.f792a == 1) {
            m8465A();
        }
        m8456a();
    }
}
