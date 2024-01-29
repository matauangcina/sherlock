package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p000a.p019g.p028k.C0252s;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
public abstract class AbstractC1720a<V extends View> extends C1723c<V> {

    /* renamed from: d */
    private Runnable f4911d;

    /* renamed from: e */
    OverScroller f4912e;

    /* renamed from: f */
    private boolean f4913f;

    /* renamed from: g */
    private int f4914g;

    /* renamed from: h */
    private int f4915h;

    /* renamed from: i */
    private int f4916i;

    /* renamed from: j */
    private VelocityTracker f4917j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.a$a */
    /* loaded from: classes.dex */
    public class RunnableC1721a implements Runnable {

        /* renamed from: f */
        private final CoordinatorLayout f4918f;

        /* renamed from: g */
        private final V f4919g;

        RunnableC1721a(CoordinatorLayout coordinatorLayout, V v) {
            this.f4918f = coordinatorLayout;
            this.f4919g = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f4919g == null || (overScroller = AbstractC1720a.this.f4912e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC1720a.this.mo3463N(this.f4918f, this.f4919g);
                return;
            }
            AbstractC1720a abstractC1720a = AbstractC1720a.this;
            abstractC1720a.m3461P(this.f4918f, this.f4919g, abstractC1720a.f4912e.getCurrY());
            C0252s.m8638Y(this.f4919g, this);
        }
    }

    public AbstractC1720a() {
        this.f4914g = -1;
        this.f4916i = -1;
    }

    public AbstractC1720a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4914g = -1;
        this.f4916i = -1;
    }

    /* renamed from: I */
    private void m3468I() {
        if (this.f4917j == null) {
            this.f4917j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r0 != 3) goto L15;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2436D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f4916i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f4916i = r0
        L12:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            r3 = -1
            if (r0 == r1) goto L5c
            r4 = 2
            if (r0 == r4) goto L25
            r12 = 3
            if (r0 == r12) goto L7e
            goto Lae
        L25:
            int r0 = r11.f4914g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            return r2
        L2e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f4915h
            int r2 = r2 - r0
            boolean r3 = r11.f4913f
            if (r3 != 0) goto L49
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f4916i
            if (r3 <= r4) goto L49
            r11.f4913f = r1
            if (r2 <= 0) goto L48
            int r2 = r2 - r4
            goto L49
        L48:
            int r2 = r2 + r4
        L49:
            r6 = r2
            boolean r2 = r11.f4913f
            if (r2 == 0) goto Lae
            r11.f4915h = r0
            int r7 = r11.mo3466K(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.m3462O(r4, r5, r6, r7, r8)
            goto Lae
        L5c:
            android.view.VelocityTracker r0 = r11.f4917j
            if (r0 == 0) goto L7e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f4917j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f4917j
            int r4 = r11.f4914g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo3465L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.m3467J(r6, r7, r8, r9, r10)
        L7e:
            r11.f4913f = r2
            r11.f4914g = r3
            android.view.VelocityTracker r12 = r11.f4917j
            if (r12 == 0) goto Lae
            r12.recycle()
            r12 = 0
            r11.f4917j = r12
            goto Lae
        L8d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.m7089B(r13, r0, r3)
            if (r12 == 0) goto Lb6
            boolean r12 = r11.mo3469H(r13)
            if (r12 == 0) goto Lb6
            r11.f4915h = r3
            int r12 = r14.getPointerId(r2)
            r11.f4914g = r12
            r11.m3468I()
        Lae:
            android.view.VelocityTracker r12 = r11.f4917j
            if (r12 == 0) goto Lb5
            r12.addMovement(r14)
        Lb5:
            return r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC1720a.mo2436D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    abstract boolean mo3469H(V v);

    /* renamed from: J */
    final boolean m3467J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.f4911d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f4911d = null;
        }
        if (this.f4912e == null) {
            this.f4912e = new OverScroller(v.getContext());
        }
        this.f4912e.fling(0, m3449E(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f4912e.computeScrollOffset()) {
            mo3463N(coordinatorLayout, v);
            return false;
        }
        RunnableC1721a runnableC1721a = new RunnableC1721a(coordinatorLayout, v);
        this.f4911d = runnableC1721a;
        C0252s.m8638Y(v, runnableC1721a);
        return true;
    }

    /* renamed from: K */
    abstract int mo3466K(V v);

    /* renamed from: L */
    abstract int mo3465L(V v);

    /* renamed from: M */
    abstract int mo3464M();

    /* renamed from: N */
    abstract void mo3463N(CoordinatorLayout coordinatorLayout, V v);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final int m3462O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo3460Q(coordinatorLayout, v, mo3464M() - i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public int m3461P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo3460Q(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, Reader.READ_DONE);
    }

    /* renamed from: Q */
    abstract int mo3460Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0693c
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2661k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f4916i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f4916i = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f4913f
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L83
        L2f:
            int r6 = r4.f4914g
            if (r6 != r5) goto L34
            goto L83
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L83
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f4915h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f4916i
            if (r6 <= r0) goto L83
            r4.f4913f = r2
            r4.f4915h = r5
            goto L83
        L51:
            r4.f4913f = r3
            r4.f4914g = r5
            android.view.VelocityTracker r5 = r4.f4917j
            if (r5 == 0) goto L83
            r5.recycle()
            r5 = 0
            r4.f4917j = r5
            goto L83
        L60:
            r4.f4913f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo3469H(r6)
            if (r2 == 0) goto L83
            boolean r5 = r5.m7089B(r6, r0, r1)
            if (r5 == 0) goto L83
            r4.f4915h = r1
            int r5 = r7.getPointerId(r3)
            r4.f4914g = r5
            r4.m3468I()
        L83:
            android.view.VelocityTracker r5 = r4.f4917j
            if (r5 == 0) goto L8a
            r5.addMovement(r7)
        L8a:
            boolean r5 = r4.f4913f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AbstractC1720a.mo2661k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
