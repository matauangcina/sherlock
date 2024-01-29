package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p000a.p019g.p028k.C0252s;
/* renamed from: androidx.core.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0769a implements View.OnTouchListener {

    /* renamed from: w */
    private static final int f2733w = ViewConfiguration.getTapTimeout();

    /* renamed from: h */
    final View f2736h;

    /* renamed from: i */
    private Runnable f2737i;

    /* renamed from: l */
    private int f2740l;

    /* renamed from: m */
    private int f2741m;

    /* renamed from: q */
    private boolean f2745q;

    /* renamed from: r */
    boolean f2746r;

    /* renamed from: s */
    boolean f2747s;

    /* renamed from: t */
    boolean f2748t;

    /* renamed from: u */
    private boolean f2749u;

    /* renamed from: v */
    private boolean f2750v;

    /* renamed from: f */
    final C0770a f2734f = new C0770a();

    /* renamed from: g */
    private final Interpolator f2735g = new AccelerateInterpolator();

    /* renamed from: j */
    private float[] f2738j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f2739k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n */
    private float[] f2742n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f2743o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f2744p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes.dex */
    public static class C0770a {

        /* renamed from: a */
        private int f2751a;

        /* renamed from: b */
        private int f2752b;

        /* renamed from: c */
        private float f2753c;

        /* renamed from: d */
        private float f2754d;

        /* renamed from: j */
        private float f2760j;

        /* renamed from: k */
        private int f2761k;

        /* renamed from: e */
        private long f2755e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f2759i = -1;

        /* renamed from: f */
        private long f2756f = 0;

        /* renamed from: g */
        private int f2757g = 0;

        /* renamed from: h */
        private int f2758h = 0;

        C0770a() {
        }

        /* renamed from: e */
        private float m6666e(long j) {
            if (j < this.f2755e) {
                return 0.0f;
            }
            long j2 = this.f2759i;
            if (j2 < 0 || j < j2) {
                return AbstractView$OnTouchListenerC0769a.m6687e(((float) (j - this.f2755e)) / this.f2751a, 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f2760j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC0769a.m6687e(((float) j3) / this.f2761k, 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m6664g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void m6670a() {
            if (this.f2756f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m6664g = m6664g(m6666e(currentAnimationTimeMillis));
            this.f2756f = currentAnimationTimeMillis;
            float f = ((float) (currentAnimationTimeMillis - this.f2756f)) * m6664g;
            this.f2757g = (int) (this.f2753c * f);
            this.f2758h = (int) (f * this.f2754d);
        }

        /* renamed from: b */
        public int m6669b() {
            return this.f2757g;
        }

        /* renamed from: c */
        public int m6668c() {
            return this.f2758h;
        }

        /* renamed from: d */
        public int m6667d() {
            float f = this.f2753c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int m6665f() {
            float f = this.f2754d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean m6663h() {
            return this.f2759i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2759i + ((long) this.f2761k);
        }

        /* renamed from: i */
        public void m6662i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2761k = AbstractView$OnTouchListenerC0769a.m6686f((int) (currentAnimationTimeMillis - this.f2755e), 0, this.f2752b);
            this.f2760j = m6666e(currentAnimationTimeMillis);
            this.f2759i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m6661j(int i) {
            this.f2752b = i;
        }

        /* renamed from: k */
        public void m6660k(int i) {
            this.f2751a = i;
        }

        /* renamed from: l */
        public void m6659l(float f, float f2) {
            this.f2753c = f;
            this.f2754d = f2;
        }

        /* renamed from: m */
        public void m6658m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2755e = currentAnimationTimeMillis;
            this.f2759i = -1L;
            this.f2756f = currentAnimationTimeMillis;
            this.f2760j = 0.5f;
            this.f2757g = 0;
            this.f2758h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes.dex */
    public class RunnableC0771b implements Runnable {
        RunnableC0771b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0769a abstractView$OnTouchListenerC0769a = AbstractView$OnTouchListenerC0769a.this;
            if (abstractView$OnTouchListenerC0769a.f2748t) {
                if (abstractView$OnTouchListenerC0769a.f2746r) {
                    abstractView$OnTouchListenerC0769a.f2746r = false;
                    abstractView$OnTouchListenerC0769a.f2734f.m6658m();
                }
                C0770a c0770a = AbstractView$OnTouchListenerC0769a.this.f2734f;
                if (c0770a.m6663h() || !AbstractView$OnTouchListenerC0769a.this.m6672u()) {
                    AbstractView$OnTouchListenerC0769a.this.f2748t = false;
                    return;
                }
                AbstractView$OnTouchListenerC0769a abstractView$OnTouchListenerC0769a2 = AbstractView$OnTouchListenerC0769a.this;
                if (abstractView$OnTouchListenerC0769a2.f2747s) {
                    abstractView$OnTouchListenerC0769a2.f2747s = false;
                    abstractView$OnTouchListenerC0769a2.m6689c();
                }
                c0770a.m6670a();
                AbstractView$OnTouchListenerC0769a.this.mo6646j(c0770a.m6669b(), c0770a.m6668c());
                C0252s.m8638Y(AbstractView$OnTouchListenerC0769a.this.f2736h, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC0769a(View view) {
        this.f2736h = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m6678o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m6677p(f3, f3);
        m6681l(1);
        m6679n(Float.MAX_VALUE, Float.MAX_VALUE);
        m6674s(0.2f, 0.2f);
        m6673t(1.0f, 1.0f);
        m6682k(f2733w);
        m6675r(500);
        m6676q(500);
    }

    /* renamed from: d */
    private float m6688d(int i, float f, float f2, float f3) {
        float m6684h = m6684h(this.f2738j[i], f2, this.f2739k[i], f);
        int i2 = (m6684h > 0.0f ? 1 : (m6684h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2742n[i];
        float f5 = this.f2743o[i];
        float f6 = this.f2744p[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m6687e(m6684h * f7, f5, f6) : -m6687e((-m6684h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m6687e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m6686f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m6685g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2740l;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f2748t && this.f2740l == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m6684h(float f, float f2, float f3, float f4) {
        float interpolation;
        float m6687e = m6687e(f * f2, 0.0f, f3);
        float m6685g = m6685g(f2 - f4, m6687e) - m6685g(f4, m6687e);
        if (m6685g < 0.0f) {
            interpolation = -this.f2735g.getInterpolation(-m6685g);
        } else if (m6685g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f2735g.getInterpolation(m6685g);
        }
        return m6687e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m6683i() {
        if (this.f2746r) {
            this.f2748t = false;
        } else {
            this.f2734f.m6662i();
        }
    }

    /* renamed from: v */
    private void m6671v() {
        int i;
        if (this.f2737i == null) {
            this.f2737i = new RunnableC0771b();
        }
        this.f2748t = true;
        this.f2746r = true;
        if (this.f2745q || (i = this.f2741m) <= 0) {
            this.f2737i.run();
        } else {
            C0252s.m8637Z(this.f2736h, this.f2737i, i);
        }
        this.f2745q = true;
    }

    /* renamed from: a */
    public abstract boolean mo6648a(int i);

    /* renamed from: b */
    public abstract boolean mo6647b(int i);

    /* renamed from: c */
    void m6689c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2736h.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo6646j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC0769a m6682k(int i) {
        this.f2741m = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC0769a m6681l(int i) {
        this.f2740l = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC0769a m6680m(boolean z) {
        if (this.f2749u && !z) {
            m6683i();
        }
        this.f2749u = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC0769a m6679n(float f, float f2) {
        float[] fArr = this.f2739k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC0769a m6678o(float f, float f2) {
        float[] fArr = this.f2744p;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2749u
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m6683i()
            goto L58
        L1a:
            r5.f2747s = r2
            r5.f2745q = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2736h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m6688d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2736h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m6688d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2734f
            r7.m6659l(r0, r6)
            boolean r6 = r5.f2748t
            if (r6 != 0) goto L58
            boolean r6 = r5.m6672u()
            if (r6 == 0) goto L58
            r5.m6671v()
        L58:
            boolean r6 = r5.f2750v
            if (r6 == 0) goto L61
            boolean r6 = r5.f2748t
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC0769a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC0769a m6677p(float f, float f2) {
        float[] fArr = this.f2743o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC0769a m6676q(int i) {
        this.f2734f.m6661j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC0769a m6675r(int i) {
        this.f2734f.m6660k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC0769a m6674s(float f, float f2) {
        float[] fArr = this.f2738j;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC0769a m6673t(float f, float f2) {
        float[] fArr = this.f2742n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m6672u() {
        C0770a c0770a = this.f2734f;
        int m6665f = c0770a.m6665f();
        int m6667d = c0770a.m6667d();
        return (m6665f != 0 && mo6647b(m6665f)) || (m6667d != 0 && mo6648a(m6667d));
    }
}
