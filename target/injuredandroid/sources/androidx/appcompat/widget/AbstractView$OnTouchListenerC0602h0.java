package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.InterfaceC0527p;
/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0602h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f2013f;

    /* renamed from: g */
    private final int f2014g;

    /* renamed from: h */
    private final int f2015h;

    /* renamed from: i */
    final View f2016i;

    /* renamed from: j */
    private Runnable f2017j;

    /* renamed from: k */
    private Runnable f2018k;

    /* renamed from: l */
    private boolean f2019l;

    /* renamed from: m */
    private int f2020m;

    /* renamed from: n */
    private final int[] f2021n = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h0$a */
    /* loaded from: classes.dex */
    public class RunnableC0603a implements Runnable {
        RunnableC0603a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0602h0.this.f2016i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.h0$b */
    /* loaded from: classes.dex */
    public class RunnableC0604b implements Runnable {
        RunnableC0604b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC0602h0.this.m7447e();
        }
    }

    public AbstractView$OnTouchListenerC0602h0(View view) {
        this.f2016i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2013f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2014g = tapTimeout;
        this.f2015h = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m7449a() {
        Runnable runnable = this.f2018k;
        if (runnable != null) {
            this.f2016i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2017j;
        if (runnable2 != null) {
            this.f2016i.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m7446f(MotionEvent motionEvent) {
        C0595f0 c0595f0;
        View view = this.f2016i;
        InterfaceC0527p mo7253b = mo7253b();
        if (mo7253b == null || !mo7253b.mo7381c() || (c0595f0 = (C0595f0) mo7253b.mo7378h()) == null || !c0595f0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m7443i(view, obtainNoHistory);
        m7442j(c0595f0, obtainNoHistory);
        boolean m7460e = c0595f0.m7460e(obtainNoHistory, this.f2020m);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return m7460e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m7445g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f2016i
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f2020m
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f2013f
            boolean r6 = m7444h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.m7449a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.m7449a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f2020m = r6
            java.lang.Runnable r6 = r5.f2017j
            if (r6 != 0) goto L52
            androidx.appcompat.widget.h0$a r6 = new androidx.appcompat.widget.h0$a
            r6.<init>()
            r5.f2017j = r6
        L52:
            java.lang.Runnable r6 = r5.f2017j
            int r1 = r5.f2014g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f2018k
            if (r6 != 0) goto L65
            androidx.appcompat.widget.h0$b r6 = new androidx.appcompat.widget.h0$b
            r6.<init>()
            r5.f2018k = r6
        L65:
            java.lang.Runnable r6 = r5.f2018k
            int r1 = r5.f2015h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractView$OnTouchListenerC0602h0.m7445g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m7444h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m7443i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2021n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m7442j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2021n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC0527p mo7253b();

    /* renamed from: c */
    protected abstract boolean mo7252c();

    /* renamed from: d */
    protected boolean mo7448d() {
        InterfaceC0527p mo7253b = mo7253b();
        if (mo7253b == null || !mo7253b.mo7381c()) {
            return true;
        }
        mo7253b.dismiss();
        return true;
    }

    /* renamed from: e */
    void m7447e() {
        m7449a();
        View view = this.f2016i;
        if (view.isEnabled() && !view.isLongClickable() && mo7252c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f2019l = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f2019l;
        if (z2) {
            z = m7446f(motionEvent) || !mo7448d();
        } else {
            z = m7445g(motionEvent) && mo7252c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2016i.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f2019l = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f2019l = false;
        this.f2020m = -1;
        Runnable runnable = this.f2017j;
        if (runnable != null) {
            this.f2016i.removeCallbacks(runnable);
        }
    }
}
