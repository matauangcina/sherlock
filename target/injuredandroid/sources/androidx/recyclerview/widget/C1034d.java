package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public class C1034d extends RecyclerView.AbstractC0987n implements RecyclerView.InterfaceC0996s {

    /* renamed from: D */
    private static final int[] f3591D = {16842919};

    /* renamed from: E */
    private static final int[] f3592E = new int[0];

    /* renamed from: a */
    private final int f3596a;

    /* renamed from: b */
    private final int f3597b;

    /* renamed from: c */
    final StateListDrawable f3598c;

    /* renamed from: d */
    final Drawable f3599d;

    /* renamed from: e */
    private final int f3600e;

    /* renamed from: f */
    private final int f3601f;

    /* renamed from: g */
    private final StateListDrawable f3602g;

    /* renamed from: h */
    private final Drawable f3603h;

    /* renamed from: i */
    private final int f3604i;

    /* renamed from: j */
    private final int f3605j;

    /* renamed from: k */
    int f3606k;

    /* renamed from: l */
    int f3607l;

    /* renamed from: m */
    float f3608m;

    /* renamed from: n */
    int f3609n;

    /* renamed from: o */
    int f3610o;

    /* renamed from: p */
    float f3611p;

    /* renamed from: s */
    private RecyclerView f3614s;

    /* renamed from: q */
    private int f3612q = 0;

    /* renamed from: r */
    private int f3613r = 0;

    /* renamed from: t */
    private boolean f3615t = false;

    /* renamed from: u */
    private boolean f3616u = false;

    /* renamed from: v */
    private int f3617v = 0;

    /* renamed from: w */
    private int f3618w = 0;

    /* renamed from: x */
    private final int[] f3619x = new int[2];

    /* renamed from: y */
    private final int[] f3620y = new int[2];

    /* renamed from: z */
    final ValueAnimator f3621z = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: A */
    int f3593A = 0;

    /* renamed from: B */
    private final Runnable f3594B = new RunnableC1035a();

    /* renamed from: C */
    private final RecyclerView.AbstractC0997t f3595C = new C1036b();

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes.dex */
    class RunnableC1035a implements Runnable {
        RunnableC1035a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1034d.this.m5224q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes.dex */
    class C1036b extends RecyclerView.AbstractC0997t {
        C1036b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0997t
        /* renamed from: b */
        public void mo3036b(RecyclerView recyclerView, int i, int i2) {
            C1034d.this.m5237B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes.dex */
    private class C1037c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3624a = false;

        C1037c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3624a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3624a) {
                this.f3624a = false;
            } else if (((Float) C1034d.this.f3621z.getAnimatedValue()).floatValue() == 0.0f) {
                C1034d c1034d = C1034d.this;
                c1034d.f3593A = 0;
                c1034d.m5216y(0);
            } else {
                C1034d c1034d2 = C1034d.this;
                c1034d2.f3593A = 2;
                c1034d2.m5219v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: classes.dex */
    private class C1038d implements ValueAnimator.AnimatorUpdateListener {
        C1038d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1034d.this.f3598c.setAlpha(floatValue);
            C1034d.this.f3599d.setAlpha(floatValue);
            C1034d.this.m5219v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1034d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3598c = stateListDrawable;
        this.f3599d = drawable;
        this.f3602g = stateListDrawable2;
        this.f3603h = drawable2;
        this.f3600e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3601f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3604i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3605j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3596a = i2;
        this.f3597b = i3;
        this.f3598c.setAlpha(255);
        this.f3599d.setAlpha(255);
        this.f3621z.addListener(new C1037c());
        this.f3621z.addUpdateListener(new C1038d());
        m5231j(recyclerView);
    }

    /* renamed from: C */
    private void m5236C(float f) {
        int[] m5225p = m5225p();
        float max = Math.max(m5225p[0], Math.min(m5225p[1], f));
        if (Math.abs(this.f3607l - max) < 2.0f) {
            return;
        }
        int m5217x = m5217x(this.f3608m, max, m5225p, this.f3614s.computeVerticalScrollRange(), this.f3614s.computeVerticalScrollOffset(), this.f3613r);
        if (m5217x != 0) {
            this.f3614s.scrollBy(0, m5217x);
        }
        this.f3608m = max;
    }

    /* renamed from: k */
    private void m5230k() {
        this.f3614s.removeCallbacks(this.f3594B);
    }

    /* renamed from: l */
    private void m5229l() {
        this.f3614s.removeItemDecoration(this);
        this.f3614s.removeOnItemTouchListener(this);
        this.f3614s.removeOnScrollListener(this.f3595C);
        m5230k();
    }

    /* renamed from: m */
    private void m5228m(Canvas canvas) {
        int i = this.f3613r;
        int i2 = this.f3604i;
        int i3 = i - i2;
        int i4 = this.f3610o;
        int i5 = this.f3609n;
        int i6 = i4 - (i5 / 2);
        this.f3602g.setBounds(0, 0, i5, i2);
        this.f3603h.setBounds(0, 0, this.f3612q, this.f3605j);
        canvas.translate(0.0f, i3);
        this.f3603h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f3602g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: n */
    private void m5227n(Canvas canvas) {
        int i = this.f3612q;
        int i2 = this.f3600e;
        int i3 = i - i2;
        int i4 = this.f3607l;
        int i5 = this.f3606k;
        int i6 = i4 - (i5 / 2);
        this.f3598c.setBounds(0, 0, i2, i5);
        this.f3599d.setBounds(0, 0, this.f3601f, this.f3613r);
        if (m5222s()) {
            this.f3599d.draw(canvas);
            canvas.translate(this.f3600e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3598c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f3600e;
        } else {
            canvas.translate(i3, 0.0f);
            this.f3599d.draw(canvas);
            canvas.translate(0.0f, i6);
            this.f3598c.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    /* renamed from: o */
    private int[] m5226o() {
        int[] iArr = this.f3620y;
        int i = this.f3597b;
        iArr[0] = i;
        iArr[1] = this.f3612q - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m5225p() {
        int[] iArr = this.f3619x;
        int i = this.f3597b;
        iArr[0] = i;
        iArr[1] = this.f3613r - i;
        return iArr;
    }

    /* renamed from: r */
    private void m5223r(float f) {
        int[] m5226o = m5226o();
        float max = Math.max(m5226o[0], Math.min(m5226o[1], f));
        if (Math.abs(this.f3610o - max) < 2.0f) {
            return;
        }
        int m5217x = m5217x(this.f3611p, max, m5226o, this.f3614s.computeHorizontalScrollRange(), this.f3614s.computeHorizontalScrollOffset(), this.f3612q);
        if (m5217x != 0) {
            this.f3614s.scrollBy(m5217x, 0);
        }
        this.f3611p = max;
    }

    /* renamed from: s */
    private boolean m5222s() {
        return C0252s.m8592w(this.f3614s) == 1;
    }

    /* renamed from: w */
    private void m5218w(int i) {
        m5230k();
        this.f3614s.postDelayed(this.f3594B, i);
    }

    /* renamed from: x */
    private int m5217x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m5215z() {
        this.f3614s.addItemDecoration(this);
        this.f3614s.addOnItemTouchListener(this);
        this.f3614s.addOnScrollListener(this.f3595C);
    }

    /* renamed from: A */
    public void m5238A() {
        int i = this.f3593A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.f3621z.cancel();
        }
        this.f3593A = 1;
        ValueAnimator valueAnimator = this.f3621z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3621z.setDuration(500L);
        this.f3621z.setStartDelay(0L);
        this.f3621z.start();
    }

    /* renamed from: B */
    void m5237B(int i, int i2) {
        int computeVerticalScrollRange = this.f3614s.computeVerticalScrollRange();
        int i3 = this.f3613r;
        this.f3615t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3596a;
        int computeHorizontalScrollRange = this.f3614s.computeHorizontalScrollRange();
        int i4 = this.f3612q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3596a;
        this.f3616u = z;
        if (!this.f3615t && !z) {
            if (this.f3617v != 0) {
                m5216y(0);
                return;
            }
            return;
        }
        if (this.f3615t) {
            float f = i3;
            this.f3607l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f3606k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f3616u) {
            float f2 = i4;
            this.f3610o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f3609n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f3617v;
        if (i5 == 0 || i5 == 1) {
            m5216y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0996s
    /* renamed from: a */
    public boolean mo5235a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3617v;
        if (i == 1) {
            boolean m5220u = m5220u(motionEvent.getX(), motionEvent.getY());
            boolean m5221t = m5221t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m5220u && !m5221t) {
                return false;
            }
            if (m5221t) {
                this.f3618w = 1;
                this.f3611p = (int) motionEvent.getX();
            } else if (m5220u) {
                this.f3618w = 2;
                this.f3608m = (int) motionEvent.getY();
            }
            m5216y(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0996s
    /* renamed from: b */
    public void mo5234b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3617v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m5220u = m5220u(motionEvent.getX(), motionEvent.getY());
            boolean m5221t = m5221t(motionEvent.getX(), motionEvent.getY());
            if (m5220u || m5221t) {
                if (m5221t) {
                    this.f3618w = 1;
                    this.f3611p = (int) motionEvent.getX();
                } else if (m5220u) {
                    this.f3618w = 2;
                    this.f3608m = (int) motionEvent.getY();
                }
                m5216y(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f3617v == 2) {
            this.f3608m = 0.0f;
            this.f3611p = 0.0f;
            m5216y(1);
            this.f3618w = 0;
        } else if (motionEvent.getAction() == 2 && this.f3617v == 2) {
            m5238A();
            if (this.f3618w == 1) {
                m5223r(motionEvent.getX());
            }
            if (this.f3618w == 2) {
                m5236C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0996s
    /* renamed from: c */
    public void mo5233c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0987n
    /* renamed from: i */
    public void mo5232i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0968a0 c0968a0) {
        if (this.f3612q != this.f3614s.getWidth() || this.f3613r != this.f3614s.getHeight()) {
            this.f3612q = this.f3614s.getWidth();
            this.f3613r = this.f3614s.getHeight();
            m5216y(0);
        } else if (this.f3593A != 0) {
            if (this.f3615t) {
                m5227n(canvas);
            }
            if (this.f3616u) {
                m5228m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void m5231j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3614s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m5229l();
        }
        this.f3614s = recyclerView;
        if (recyclerView != null) {
            m5215z();
        }
    }

    /* renamed from: q */
    void m5224q(int i) {
        int i2 = this.f3593A;
        if (i2 == 1) {
            this.f3621z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3593A = 3;
        ValueAnimator valueAnimator = this.f3621z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3621z.setDuration(i);
        this.f3621z.start();
    }

    /* renamed from: t */
    boolean m5221t(float f, float f2) {
        if (f2 >= this.f3613r - this.f3604i) {
            int i = this.f3610o;
            int i2 = this.f3609n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    boolean m5220u(float f, float f2) {
        if (!m5222s() ? f >= this.f3612q - this.f3600e : f <= this.f3600e / 2) {
            int i = this.f3607l;
            int i2 = this.f3606k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    void m5219v() {
        this.f3614s.invalidate();
    }

    /* renamed from: y */
    void m5216y(int i) {
        int i2;
        if (i == 2 && this.f3617v != 2) {
            this.f3598c.setState(f3591D);
            m5230k();
        }
        if (i == 0) {
            m5219v();
        } else {
            m5238A();
        }
        if (this.f3617v != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1500;
            this.f3617v = i;
        }
        this.f3598c.setState(f3592E);
        i2 = 1200;
        m5218w(i2);
        this.f3617v = i;
    }
}
