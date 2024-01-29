package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p000a.p001a.C0009j;
/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: classes.dex */
public class C0606i0 extends ViewGroup {

    /* renamed from: f */
    private boolean f2030f;

    /* renamed from: g */
    private int f2031g;

    /* renamed from: h */
    private int f2032h;

    /* renamed from: i */
    private int f2033i;

    /* renamed from: j */
    private int f2034j;

    /* renamed from: k */
    private int f2035k;

    /* renamed from: l */
    private float f2036l;

    /* renamed from: m */
    private boolean f2037m;

    /* renamed from: n */
    private int[] f2038n;

    /* renamed from: o */
    private int[] f2039o;

    /* renamed from: p */
    private Drawable f2040p;

    /* renamed from: q */
    private int f2041q;

    /* renamed from: r */
    private int f2042r;

    /* renamed from: s */
    private int f2043s;

    /* renamed from: t */
    private int f2044t;

    /* renamed from: androidx.appcompat.widget.i0$a */
    /* loaded from: classes.dex */
    public static class C0607a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f2045a;

        /* renamed from: b */
        public int f2046b;

        public C0607a(int i, int i2) {
            super(i, i2);
            this.f2046b = -1;
            this.f2045a = 0.0f;
        }

        public C0607a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2046b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.LinearLayoutCompat_Layout);
            this.f2045a = obtainStyledAttributes.getFloat(C0009j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f2046b = obtainStyledAttributes.getInt(C0009j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0607a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2046b = -1;
        }
    }

    public C0606i0(Context context) {
        this(context, null);
    }

    public C0606i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0606i0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2030f = true;
        this.f2031g = -1;
        this.f2032h = 0;
        this.f2034j = 8388659;
        C0665w0 m7213u = C0665w0.m7213u(context, attributeSet, C0009j.LinearLayoutCompat, i, 0);
        int m7223k = m7213u.m7223k(C0009j.LinearLayoutCompat_android_orientation, -1);
        if (m7223k >= 0) {
            setOrientation(m7223k);
        }
        int m7223k2 = m7213u.m7223k(C0009j.LinearLayoutCompat_android_gravity, -1);
        if (m7223k2 >= 0) {
            setGravity(m7223k2);
        }
        boolean m7233a = m7213u.m7233a(C0009j.LinearLayoutCompat_android_baselineAligned, true);
        if (!m7233a) {
            setBaselineAligned(m7233a);
        }
        this.f2036l = m7213u.m7225i(C0009j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2031g = m7213u.m7223k(C0009j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2037m = m7213u.m7233a(C0009j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m7213u.m7227g(C0009j.LinearLayoutCompat_divider));
        this.f2043s = m7213u.m7223k(C0009j.LinearLayoutCompat_showDividers, 0);
        this.f2044t = m7213u.m7228f(C0009j.LinearLayoutCompat_dividerPadding, 0);
        m7213u.m7212v();
    }

    /* renamed from: A */
    private void m7433A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: k */
    private void m7428k(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m7420s = m7420s(i3);
            if (m7420s.getVisibility() != 8) {
                C0607a c0607a = (C0607a) m7420s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0607a).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) c0607a).width;
                    ((ViewGroup.MarginLayoutParams) c0607a).width = m7420s.getMeasuredWidth();
                    measureChildWithMargins(m7420s, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) c0607a).width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    private void m7427l(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m7420s = m7420s(i3);
            if (m7420s.getVisibility() != 8) {
                C0607a c0607a = (C0607a) m7420s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0607a).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) c0607a).height;
                    ((ViewGroup.MarginLayoutParams) c0607a).height = m7420s.getMeasuredHeight();
                    measureChildWithMargins(m7420s, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) c0607a).height = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0607a;
    }

    /* renamed from: g */
    void m7432g(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean m7482b = C0588c1.m7482b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m7420s = m7420s(i2);
            if (m7420s != null && m7420s.getVisibility() != 8 && m7419t(i2)) {
                C0607a c0607a = (C0607a) m7420s.getLayoutParams();
                m7429j(canvas, m7482b ? m7420s.getRight() + ((ViewGroup.MarginLayoutParams) c0607a).rightMargin : (m7420s.getLeft() - ((ViewGroup.MarginLayoutParams) c0607a).leftMargin) - this.f2041q);
            }
        }
        if (m7419t(virtualChildCount)) {
            View m7420s2 = m7420s(virtualChildCount - 1);
            if (m7420s2 != null) {
                C0607a c0607a2 = (C0607a) m7420s2.getLayoutParams();
                if (m7482b) {
                    left = m7420s2.getLeft();
                    i = ((ViewGroup.MarginLayoutParams) c0607a2).leftMargin;
                    right = (left - i) - this.f2041q;
                } else {
                    right = m7420s2.getRight() + ((ViewGroup.MarginLayoutParams) c0607a2).rightMargin;
                }
            } else if (m7482b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.f2041q;
            }
            m7429j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2031g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2031g;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f2031g == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f2032h;
            if (this.f2033i == 1 && (i = this.f2034j & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2035k) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2035k;
                }
            }
            return i3 + ((ViewGroup.MarginLayoutParams) ((C0607a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2031g;
    }

    public Drawable getDividerDrawable() {
        return this.f2040p;
    }

    public int getDividerPadding() {
        return this.f2044t;
    }

    public int getDividerWidth() {
        return this.f2041q;
    }

    public int getGravity() {
        return this.f2034j;
    }

    public int getOrientation() {
        return this.f2033i;
    }

    public int getShowDividers() {
        return this.f2043s;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2036l;
    }

    /* renamed from: h */
    void m7431h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m7420s = m7420s(i);
            if (m7420s != null && m7420s.getVisibility() != 8 && m7419t(i)) {
                m7430i(canvas, (m7420s.getTop() - ((ViewGroup.MarginLayoutParams) ((C0607a) m7420s.getLayoutParams())).topMargin) - this.f2042r);
            }
        }
        if (m7419t(virtualChildCount)) {
            View m7420s2 = m7420s(virtualChildCount - 1);
            m7430i(canvas, m7420s2 == null ? (getHeight() - getPaddingBottom()) - this.f2042r : m7420s2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0607a) m7420s2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: i */
    void m7430i(Canvas canvas, int i) {
        this.f2040p.setBounds(getPaddingLeft() + this.f2044t, i, (getWidth() - getPaddingRight()) - this.f2044t, this.f2042r + i);
        this.f2040p.draw(canvas);
    }

    /* renamed from: j */
    void m7429j(Canvas canvas, int i) {
        this.f2040p.setBounds(i, getPaddingTop() + this.f2044t, this.f2041q + i, (getHeight() - getPaddingBottom()) - this.f2044t);
        this.f2040p.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0607a generateDefaultLayoutParams() {
        int i = this.f2033i;
        if (i == 0) {
            return new C0607a(-2, -2);
        }
        if (i == 1) {
            return new C0607a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0607a generateLayoutParams(AttributeSet attributeSet) {
        return new C0607a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0607a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0607a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f2040p == null) {
            return;
        }
        if (this.f2033i == 1) {
            m7431h(canvas);
        } else {
            m7432g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2033i == 1) {
            m7417v(i, i2, i3, i4);
        } else {
            m7418u(i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f2033i == 1) {
            m7413z(i, i2);
        } else {
            m7415x(i, i2);
        }
    }

    /* renamed from: p */
    int m7423p(View view, int i) {
        return 0;
    }

    /* renamed from: q */
    int m7422q(View view) {
        return 0;
    }

    /* renamed from: r */
    int m7421r(View view) {
        return 0;
    }

    /* renamed from: s */
    View m7420s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f2030f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2031g = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2040p) {
            return;
        }
        this.f2040p = drawable;
        if (drawable != null) {
            this.f2041q = drawable.getIntrinsicWidth();
            this.f2042r = drawable.getIntrinsicHeight();
        } else {
            this.f2041q = 0;
            this.f2042r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2044t = i;
    }

    public void setGravity(int i) {
        if (this.f2034j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2034j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2034j;
        if ((8388615 & i3) != i2) {
            this.f2034j = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2037m = z;
    }

    public void setOrientation(int i) {
        if (this.f2033i != i) {
            this.f2033i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2043s) {
            requestLayout();
        }
        this.f2043s = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f2034j;
        if ((i3 & 112) != i2) {
            this.f2034j = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f2036l = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public boolean m7419t(int i) {
        if (i == 0) {
            return (this.f2043s & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f2043s & 4) != 0;
        } else if ((this.f2043s & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m7418u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0606i0.m7418u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m7417v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f2034j
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f2035k
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f2035k
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc6
            android.view.View r13 = r6.m7420s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m7414y(r12)
            int r0 = r0 + r1
            goto Lc3
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc3
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.i0$a r5 = (androidx.appcompat.widget.C0606i0.C0607a) r5
            int r1 = r5.f2046b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = p000a.p019g.p028k.C0252s.m8592w(r17)
            int r1 = p000a.p019g.p028k.C0236d.m8706b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.m7419t(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f2042r
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m7422q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m7433A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m7421r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m7423p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc3:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0606i0.m7417v(int, int, int, int):void");
    }

    /* renamed from: w */
    void m7416w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x03a3, code lost:
        if (r8 > 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ae, code lost:
        if (r8 < 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b0, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03b1, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m7415x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0606i0.m7415x(int, int):void");
    }

    /* renamed from: y */
    int m7414y(int i) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d0, code lost:
        if (r15 > 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02db, code lost:
        if (r15 < 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02dd, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02de, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031b  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m7413z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0606i0.m7413z(int, int):void");
    }
}
