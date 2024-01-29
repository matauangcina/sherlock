package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import p000a.p019g.C0119a;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0244k;
import p000a.p019g.p028k.C0248o;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.InterfaceC0243j;
import p000a.p019g.p028k.InterfaceC0246m;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p019g.p028k.p029b0.C0225e;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0246m, InterfaceC0243j {

    /* renamed from: F */
    private static final C0765a f2704F = new C0765a();

    /* renamed from: G */
    private static final int[] f2705G = {16843130};

    /* renamed from: A */
    private C0767c f2706A;

    /* renamed from: B */
    private final C0248o f2707B;

    /* renamed from: C */
    private final C0244k f2708C;

    /* renamed from: D */
    private float f2709D;

    /* renamed from: E */
    private InterfaceC0766b f2710E;

    /* renamed from: f */
    private long f2711f;

    /* renamed from: g */
    private final Rect f2712g;

    /* renamed from: h */
    private OverScroller f2713h;

    /* renamed from: i */
    private EdgeEffect f2714i;

    /* renamed from: j */
    private EdgeEffect f2715j;

    /* renamed from: k */
    private int f2716k;

    /* renamed from: l */
    private boolean f2717l;

    /* renamed from: m */
    private boolean f2718m;

    /* renamed from: n */
    private View f2719n;

    /* renamed from: o */
    private boolean f2720o;

    /* renamed from: p */
    private VelocityTracker f2721p;

    /* renamed from: q */
    private boolean f2722q;

    /* renamed from: r */
    private boolean f2723r;

    /* renamed from: s */
    private int f2724s;

    /* renamed from: t */
    private int f2725t;

    /* renamed from: u */
    private int f2726u;

    /* renamed from: v */
    private int f2727v;

    /* renamed from: w */
    private final int[] f2728w;

    /* renamed from: x */
    private final int[] f2729x;

    /* renamed from: y */
    private int f2730y;

    /* renamed from: z */
    private int f2731z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0765a extends C0195a {
        C0765a() {
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: f */
        public void mo2807f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2807f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0225e.m8716a(accessibilityEvent, nestedScrollView.getScrollX());
            C0225e.m8715b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            int scrollRange;
            super.mo2517g(view, c0217c);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0217c.m8777W(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0217c.m8744o0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0217c.m8771b(C0217c.C0218a.f694g);
                c0217c.m8771b(C0217c.C0218a.f698k);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0217c.m8771b(C0217c.C0218a.f693f);
                c0217c.m8771b(C0217c.C0218a.f699l);
            }
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: j */
        public boolean mo2659j(View view, int i, Bundle bundle) {
            if (super.mo2659j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i != 4096) {
                    if (i == 8192 || i == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.m6721O(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.m6721O(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0766b {
        /* renamed from: a */
        void mo6692a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public static class C0767c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0767c> CREATOR = new C0768a();

        /* renamed from: f */
        public int f2732f;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        /* loaded from: classes.dex */
        class C0768a implements Parcelable.Creator<C0767c> {
            C0768a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0767c createFromParcel(Parcel parcel) {
                return new C0767c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C0767c[] newArray(int i) {
                return new C0767c[i];
            }
        }

        C0767c(Parcel parcel) {
            super(parcel);
            this.f2732f = parcel.readInt();
        }

        C0767c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2732f + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2732f);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0119a.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2712g = new Rect();
        this.f2717l = true;
        this.f2718m = false;
        this.f2719n = null;
        this.f2720o = false;
        this.f2723r = true;
        this.f2727v = -1;
        this.f2728w = new int[2];
        this.f2729x = new int[2];
        m6695x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2705G, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2707B = new C0248o(this);
        this.f2708C = new C0244k(this);
        setNestedScrollingEnabled(true);
        C0252s.m8625f0(this, f2704F);
    }

    /* renamed from: A */
    private static boolean m6735A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m6735A((View) parent, view2);
    }

    /* renamed from: B */
    private boolean m6734B(View view, int i, int i2) {
        view.getDrawingRect(this.f2712g);
        offsetDescendantRectToMyCoords(view, this.f2712g);
        return this.f2712g.bottom + i >= getScrollY() && this.f2712g.top - i <= getScrollY() + i2;
    }

    /* renamed from: C */
    private void m6733C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2708C.m8683e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: D */
    private void m6732D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2727v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2716k = (int) motionEvent.getY(i);
            this.f2727v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2721p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m6729G() {
        VelocityTracker velocityTracker = this.f2721p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2721p = null;
        }
    }

    /* renamed from: H */
    private void m6728H(boolean z) {
        if (z) {
            m6720P(2, 1);
        } else {
            m6719Q(1);
        }
        this.f2731z = getScrollY();
        C0252s.m8639X(this);
    }

    /* renamed from: I */
    private boolean m6727I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View m6701r = m6701r(z2, i2, i3);
        if (m6701r == null) {
            m6701r = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m6708k(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m6701r != findFocus()) {
            m6701r.requestFocus(i);
        }
        return z;
    }

    /* renamed from: J */
    private void m6726J(View view) {
        view.getDrawingRect(this.f2712g);
        offsetDescendantRectToMyCoords(view, this.f2712g);
        int m6713f = m6713f(this.f2712g);
        if (m6713f != 0) {
            scrollBy(0, m6713f);
        }
    }

    /* renamed from: K */
    private boolean m6725K(Rect rect, boolean z) {
        int m6713f = m6713f(rect);
        boolean z2 = m6713f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m6713f);
            } else {
                m6724L(0, m6713f);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m6723M(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2711f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2713h;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            m6728H(z);
        } else {
            if (!this.f2713h.isFinished()) {
                m6718a();
            }
            scrollBy(i, i2);
        }
        this.f2711f = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: a */
    private void m6718a() {
        this.f2713h.abortAnimation();
        m6719Q(1);
    }

    /* renamed from: d */
    private boolean m6715d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    /* renamed from: e */
    private static int m6714e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2709D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2709D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2709D;
    }

    /* renamed from: k */
    private void m6708k(int i) {
        if (i != 0) {
            if (this.f2723r) {
                m6724L(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: l */
    private void m6707l() {
        this.f2720o = false;
        m6729G();
        m6719Q(0);
        EdgeEffect edgeEffect = this.f2714i;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2715j.onRelease();
        }
    }

    /* renamed from: p */
    private void m6703p() {
        if (getOverScrollMode() == 2) {
            this.f2714i = null;
            this.f2715j = null;
        } else if (this.f2714i == null) {
            Context context = getContext();
            this.f2714i = new EdgeEffect(context);
            this.f2715j = new EdgeEffect(context);
        }
    }

    /* renamed from: r */
    private View m6701r(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m6697v(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    /* renamed from: w */
    private void m6696w() {
        VelocityTracker velocityTracker = this.f2721p;
        if (velocityTracker == null) {
            this.f2721p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m6695x() {
        this.f2713h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2724s = viewConfiguration.getScaledTouchSlop();
        this.f2725t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2726u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m6694y() {
        if (this.f2721p == null) {
            this.f2721p = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m6693z(View view) {
        return !m6734B(view, 0, getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean m6731E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.m6698u(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f2713h
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m6731E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean m6730F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2712g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2712g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2712g.top = getScrollY() - height;
            Rect rect2 = this.f2712g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2712g;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m6727I(i, i2, i3);
    }

    /* renamed from: L */
    public final void m6724L(int i, int i2) {
        m6723M(i, i2, 250, false);
    }

    /* renamed from: N */
    void m6722N(int i, int i2, int i3, boolean z) {
        m6723M(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: O */
    void m6721O(int i, int i2, boolean z) {
        m6722N(i, i2, 250, z);
    }

    /* renamed from: P */
    public boolean m6720P(int i, int i2) {
        return this.f2708C.m8671q(i, i2);
    }

    /* renamed from: Q */
    public void m6719Q(int i) {
        this.f2708C.m8669s(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public boolean m6717b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m6734B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m6708k(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2712g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2712g);
            m6708k(m6713f(this.f2712g));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m6693z(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: c */
    public void mo6716c(View view, View view2, int i, int i2) {
        this.f2707B.m8666c(view, view2, i, i2);
        m6720P(2, i2);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f2713h.isFinished()) {
            return;
        }
        this.f2713h.computeScrollOffset();
        int currY = this.f2713h.getCurrY();
        int i = currY - this.f2731z;
        this.f2731z = currY;
        int[] iArr = this.f2729x;
        boolean z = false;
        iArr[1] = 0;
        m6712g(0, i, iArr, null, 1);
        int i2 = i - this.f2729x[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m6731E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f2729x;
            iArr2[1] = 0;
            m6711h(0, scrollY2, 0, i3, this.f2728w, 1, iArr2);
            i2 = i3 - this.f2729x[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                m6703p();
                if (i2 < 0) {
                    if (this.f2714i.isFinished()) {
                        edgeEffect = this.f2714i;
                        edgeEffect.onAbsorb((int) this.f2713h.getCurrVelocity());
                    }
                } else if (this.f2715j.isFinished()) {
                    edgeEffect = this.f2715j;
                    edgeEffect.onAbsorb((int) this.f2713h.getCurrVelocity());
                }
            }
            m6718a();
        }
        if (this.f2713h.isFinished()) {
            m6719Q(1);
        } else {
            C0252s.m8639X(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m6702q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2708C.m8687a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2708C.m8686b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m6712g(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2708C.m8682f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f2714i != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f2714i.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f2714i.setSize(width, height);
                if (this.f2714i.draw(canvas)) {
                    C0252s.m8639X(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f2715j.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f2715j.setSize(width2, height2);
            if (this.f2715j.draw(canvas)) {
                C0252s.m8639X(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: f */
    protected int m6713f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: g */
    public boolean m6712g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2708C.m8684d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2707B.m8668a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void m6711h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2708C.m8683e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m6698u(0);
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: i */
    public void mo6710i(View view, int i) {
        this.f2707B.m8665d(view, i);
        m6719Q(i);
    }

    @Override // android.view.View, p000a.p019g.p028k.InterfaceC0243j
    public boolean isNestedScrollingEnabled() {
        return this.f2708C.m8675m();
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: j */
    public void mo6709j(View view, int i, int i2, int[] iArr, int i3) {
        m6712g(i, i2, iArr, null, i3);
    }

    @Override // p000a.p019g.p028k.InterfaceC0246m
    /* renamed from: m */
    public void mo6706m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m6733C(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: n */
    public void mo6705n(View view, int i, int i2, int i3, int i4, int i5) {
        m6733C(i4, i5, null);
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: o */
    public boolean mo6704o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2718m = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2720o) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2720o) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2727v;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2716k) > this.f2724s && (2 & getNestedScrollAxes()) == 0) {
                                this.f2720o = true;
                                this.f2716k = y;
                                m6694y();
                                this.f2721p.addMovement(motionEvent);
                                this.f2730y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m6732D(motionEvent);
                    }
                }
            }
            this.f2720o = false;
            this.f2727v = -1;
            m6729G();
            if (this.f2713h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0252s.m8639X(this);
            }
            m6719Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (m6697v((int) motionEvent.getX(), y2)) {
                this.f2716k = y2;
                this.f2727v = motionEvent.getPointerId(0);
                m6696w();
                this.f2721p.addMovement(motionEvent);
                this.f2713h.computeScrollOffset();
                this.f2720o = !this.f2713h.isFinished();
                m6720P(2, 0);
            } else {
                this.f2720o = false;
                m6729G();
            }
        }
        return this.f2720o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2717l = false;
        View view = this.f2719n;
        if (view != null && m6735A(view, this)) {
            m6726J(this.f2719n);
        }
        this.f2719n = null;
        if (!this.f2718m) {
            if (this.f2706A != null) {
                scrollTo(getScrollX(), this.f2706A.f2732f);
                this.f2706A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m6714e = m6714e(scrollY, paddingTop, i5);
            if (m6714e != scrollY) {
                scrollTo(getScrollX(), m6714e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2718m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2722q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m6700s((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo6709j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m6733C(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo6716c(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i) : focusFinder.findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || m6693z(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0767c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0767c c0767c = (C0767c) parcelable;
        super.onRestoreInstanceState(c0767c.getSuperState());
        this.f2706A = c0767c;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0767c c0767c = new C0767c(super.onSaveInstanceState());
        c0767c.f2732f = getScrollY();
        return c0767c;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0766b interfaceC0766b = this.f2710E;
        if (interfaceC0766b != null) {
            interfaceC0766b.mo6692a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m6734B(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f2712g);
        offsetDescendantRectToMyCoords(findFocus, this.f2712g);
        m6708k(m6713f(this.f2712g));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo6704o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onStopNestedScroll(View view) {
        mo6710i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r23.f2713h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        p000a.p019g.p028k.C0252s.m8639X(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0210, code lost:
        if (r23.f2713h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean m6702q(KeyEvent keyEvent) {
        this.f2712g.setEmpty();
        if (!m6715d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? m6717b(33) : m6699t(33);
            } else if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? m6717b(130) : m6699t(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                m6730F(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f2717l) {
            this.f2719n = view2;
        } else {
            m6726J(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m6725K(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m6729G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f2717l = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void m6700s(int i) {
        if (getChildCount() > 0) {
            this.f2713h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Reader.READ_DONE, 0, 0);
            m6728H(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int m6714e = m6714e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int m6714e2 = m6714e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (m6714e == getScrollX() && m6714e2 == getScrollY()) {
                return;
            }
            super.scrollTo(m6714e, m6714e2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2722q) {
            this.f2722q = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f2708C.m8674n(z);
    }

    public void setOnScrollChangeListener(InterfaceC0766b interfaceC0766b) {
        this.f2710E = interfaceC0766b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2723r = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m6720P(i, 0);
    }

    @Override // android.view.View, p000a.p019g.p028k.InterfaceC0243j
    public void stopNestedScroll() {
        m6719Q(0);
    }

    /* renamed from: t */
    public boolean m6699t(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2712g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2712g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2712g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2712g;
        return m6727I(i, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean m6698u(int i) {
        return this.f2708C.m8676l(i);
    }
}
