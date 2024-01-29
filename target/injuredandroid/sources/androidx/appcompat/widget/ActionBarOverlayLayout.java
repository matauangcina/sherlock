package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p019g.p028k.C0248o;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.InterfaceC0245l;
import p000a.p019g.p028k.InterfaceC0246m;
import p000a.p019g.p028k.InterfaceC0247n;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0587c0, InterfaceC0247n, InterfaceC0245l, InterfaceC0246m {

    /* renamed from: G */
    static final int[] f1720G = {C0000a.actionBarSize, 16842841};

    /* renamed from: A */
    private OverScroller f1721A;

    /* renamed from: B */
    ViewPropertyAnimator f1722B;

    /* renamed from: C */
    final AnimatorListenerAdapter f1723C;

    /* renamed from: D */
    private final Runnable f1724D;

    /* renamed from: E */
    private final Runnable f1725E;

    /* renamed from: F */
    private final C0248o f1726F;

    /* renamed from: f */
    private int f1727f;

    /* renamed from: g */
    private int f1728g;

    /* renamed from: h */
    private ContentFrameLayout f1729h;

    /* renamed from: i */
    ActionBarContainer f1730i;

    /* renamed from: j */
    private InterfaceC0590d0 f1731j;

    /* renamed from: k */
    private Drawable f1732k;

    /* renamed from: l */
    private boolean f1733l;

    /* renamed from: m */
    private boolean f1734m;

    /* renamed from: n */
    private boolean f1735n;

    /* renamed from: o */
    private boolean f1736o;

    /* renamed from: p */
    boolean f1737p;

    /* renamed from: q */
    private int f1738q;

    /* renamed from: r */
    private int f1739r;

    /* renamed from: s */
    private final Rect f1740s;

    /* renamed from: t */
    private final Rect f1741t;

    /* renamed from: u */
    private final Rect f1742u;

    /* renamed from: v */
    private final Rect f1743v;

    /* renamed from: w */
    private final Rect f1744w;

    /* renamed from: x */
    private final Rect f1745x;

    /* renamed from: y */
    private final Rect f1746y;

    /* renamed from: z */
    private InterfaceC0537d f1747z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C0534a extends AnimatorListenerAdapter {
        C0534a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1722B = null;
            actionBarOverlayLayout.f1737p = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1722B = null;
            actionBarOverlayLayout.f1737p = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC0535b implements Runnable {
        RunnableC0535b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m7715u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1722B = actionBarOverlayLayout.f1730i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1723C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC0536c implements Runnable {
        RunnableC0536c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m7715u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1722B = actionBarOverlayLayout.f1730i.animate().translationY(-ActionBarOverlayLayout.this.f1730i.getHeight()).setListener(ActionBarOverlayLayout.this.f1723C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0537d {
        /* renamed from: a */
        void mo7709a();

        /* renamed from: b */
        void mo7708b();

        /* renamed from: c */
        void mo7707c(int i);

        /* renamed from: d */
        void mo7706d();

        /* renamed from: e */
        void mo7705e(boolean z);

        /* renamed from: f */
        void mo7704f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0538e extends ViewGroup.MarginLayoutParams {
        public C0538e(int i, int i2) {
            super(i, i2);
        }

        public C0538e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0538e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1728g = 0;
        this.f1740s = new Rect();
        this.f1741t = new Rect();
        this.f1742u = new Rect();
        this.f1743v = new Rect();
        this.f1744w = new Rect();
        this.f1745x = new Rect();
        this.f1746y = new Rect();
        this.f1723C = new C0534a();
        this.f1724D = new RunnableC0535b();
        this.f1725E = new RunnableC0536c();
        m7714v(context);
        this.f1726F = new C0248o(this);
    }

    /* renamed from: A */
    private void m7722A() {
        m7715u();
        this.f1724D.run();
    }

    /* renamed from: B */
    private boolean m7721B(float f, float f2) {
        this.f1721A.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Reader.READ_DONE);
        return this.f1721A.getFinalY() > this.f1730i.getHeight();
    }

    /* renamed from: p */
    private void m7720p() {
        m7715u();
        this.f1725E.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m7719q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0538e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m7719q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: t */
    private InterfaceC0590d0 m7716t(View view) {
        if (view instanceof InterfaceC0590d0) {
            return (InterfaceC0590d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m7714v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1720G);
        this.f1727f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1732k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1733l = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1721A = new OverScroller(context);
    }

    /* renamed from: x */
    private void m7712x() {
        m7715u();
        postDelayed(this.f1725E, 600L);
    }

    /* renamed from: y */
    private void m7711y() {
        m7715u();
        postDelayed(this.f1724D, 600L);
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: a */
    public void mo7492a(Menu menu, InterfaceC0522m.InterfaceC0523a interfaceC0523a) {
        m7710z();
        this.f1731j.mo7198a(menu, interfaceC0523a);
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: b */
    public boolean mo7491b() {
        m7710z();
        return this.f1731j.mo7197b();
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: c */
    public void mo6716c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0538e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: d */
    public void mo7490d() {
        m7710z();
        this.f1731j.mo7195d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1732k == null || this.f1733l) {
            return;
        }
        int bottom = this.f1730i.getVisibility() == 0 ? (int) (this.f1730i.getBottom() + this.f1730i.getTranslationY() + 0.5f) : 0;
        this.f1732k.setBounds(0, bottom, getWidth(), this.f1732k.getIntrinsicHeight() + bottom);
        this.f1732k.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: e */
    public boolean mo7489e() {
        m7710z();
        return this.f1731j.mo7194e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: f */
    public boolean mo7488f() {
        m7710z();
        return this.f1731j.mo7193f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m7710z();
        int m8657F = C0252s.m8657F(this) & 256;
        boolean m7719q = m7719q(this.f1730i, rect, true, true, false, true);
        this.f1743v.set(rect);
        C0588c1.m7483a(this, this.f1743v, this.f1740s);
        if (!this.f1744w.equals(this.f1743v)) {
            this.f1744w.set(this.f1743v);
            m7719q = true;
        }
        if (!this.f1741t.equals(this.f1740s)) {
            this.f1741t.set(this.f1740s);
            m7719q = true;
        }
        if (m7719q) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: g */
    public boolean mo7487g() {
        m7710z();
        return this.f1731j.mo7192g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0538e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1730i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1726F.m8668a();
    }

    public CharSequence getTitle() {
        m7710z();
        return this.f1731j.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: h */
    public boolean mo7486h() {
        m7710z();
        return this.f1731j.mo7191h();
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: i */
    public void mo6710i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: j */
    public void mo6709j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: k */
    public void mo7485k(int i) {
        m7710z();
        if (i == 2) {
            this.f1731j.mo7177v();
        } else if (i == 5) {
            this.f1731j.mo7176w();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    /* renamed from: l */
    public void mo7484l() {
        m7710z();
        this.f1731j.mo7190i();
    }

    @Override // p000a.p019g.p028k.InterfaceC0246m
    /* renamed from: m */
    public void mo6706m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo6705n(view, i, i2, i3, i4, i5);
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: n */
    public void mo6705n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0245l
    /* renamed from: o */
    public boolean mo6704o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m7714v(getContext());
        C0252s.m8629d0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7715u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0538e c0538e = (C0538e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0538e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0538e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m7710z();
        measureChildWithMargins(this.f1730i, i, 0, i2, 0);
        C0538e c0538e = (C0538e) this.f1730i.getLayoutParams();
        int max = Math.max(0, this.f1730i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0538e).leftMargin + ((ViewGroup.MarginLayoutParams) c0538e).rightMargin);
        int max2 = Math.max(0, this.f1730i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0538e).topMargin + ((ViewGroup.MarginLayoutParams) c0538e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1730i.getMeasuredState());
        boolean z = (C0252s.m8657F(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1727f;
            if (this.f1735n && this.f1730i.getTabContainer() != null) {
                measuredHeight += this.f1727f;
            }
        } else {
            measuredHeight = this.f1730i.getVisibility() != 8 ? this.f1730i.getMeasuredHeight() : 0;
        }
        this.f1742u.set(this.f1740s);
        this.f1745x.set(this.f1743v);
        Rect rect = (this.f1734m || z) ? this.f1745x : this.f1742u;
        rect.top += measuredHeight;
        rect.bottom += 0;
        m7719q(this.f1729h, this.f1742u, true, true, true, true);
        if (!this.f1746y.equals(this.f1745x)) {
            this.f1746y.set(this.f1745x);
            this.f1729h.m7679a(this.f1745x);
        }
        measureChildWithMargins(this.f1729h, i, 0, i2, 0);
        C0538e c0538e2 = (C0538e) this.f1729h.getLayoutParams();
        int max3 = Math.max(max, this.f1729h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0538e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0538e2).rightMargin);
        int max4 = Math.max(max2, this.f1729h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0538e2).topMargin + ((ViewGroup.MarginLayoutParams) c0538e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1729h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f1736o && z) {
            if (m7721B(f, f2)) {
                m7720p();
            } else {
                m7722A();
            }
            this.f1737p = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1738q + i2;
        this.f1738q = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1726F.m8667b(view, view2, i);
        this.f1738q = getActionBarHideOffset();
        m7715u();
        InterfaceC0537d interfaceC0537d = this.f1747z;
        if (interfaceC0537d != null) {
            interfaceC0537d.mo7708b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1730i.getVisibility() != 0) {
            return false;
        }
        return this.f1736o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p019g.p028k.InterfaceC0247n
    public void onStopNestedScroll(View view) {
        if (this.f1736o && !this.f1737p) {
            if (this.f1738q <= this.f1730i.getHeight()) {
                m7711y();
            } else {
                m7712x();
            }
        }
        InterfaceC0537d interfaceC0537d = this.f1747z;
        if (interfaceC0537d != null) {
            interfaceC0537d.mo7706d();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m7710z();
        int i2 = this.f1739r ^ i;
        this.f1739r = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0537d interfaceC0537d = this.f1747z;
        if (interfaceC0537d != null) {
            interfaceC0537d.mo7705e(!z2);
            if (z || !z2) {
                this.f1747z.mo7709a();
            } else {
                this.f1747z.mo7704f();
            }
        }
        if ((i2 & 256) == 0 || this.f1747z == null) {
            return;
        }
        C0252s.m8629d0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1728g = i;
        InterfaceC0537d interfaceC0537d = this.f1747z;
        if (interfaceC0537d != null) {
            interfaceC0537d.mo7707c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r */
    public C0538e generateDefaultLayoutParams() {
        return new C0538e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public C0538e generateLayoutParams(AttributeSet attributeSet) {
        return new C0538e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        m7715u();
        this.f1730i.setTranslationY(-Math.max(0, Math.min(i, this.f1730i.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0537d interfaceC0537d) {
        this.f1747z = interfaceC0537d;
        if (getWindowToken() != null) {
            this.f1747z.mo7707c(this.f1728g);
            int i = this.f1739r;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0252s.m8629d0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1735n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1736o) {
            this.f1736o = z;
            if (z) {
                return;
            }
            m7715u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m7710z();
        this.f1731j.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m7710z();
        this.f1731j.setIcon(drawable);
    }

    public void setLogo(int i) {
        m7710z();
        this.f1731j.mo7180s(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1734m = z;
        this.f1733l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    public void setWindowCallback(Window.Callback callback) {
        m7710z();
        this.f1731j.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0587c0
    public void setWindowTitle(CharSequence charSequence) {
        m7710z();
        this.f1731j.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    void m7715u() {
        removeCallbacks(this.f1724D);
        removeCallbacks(this.f1725E);
        ViewPropertyAnimator viewPropertyAnimator = this.f1722B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean m7713w() {
        return this.f1734m;
    }

    /* renamed from: z */
    void m7710z() {
        if (this.f1729h == null) {
            this.f1729h = (ContentFrameLayout) findViewById(C0005f.action_bar_activity_content);
            this.f1730i = (ActionBarContainer) findViewById(C0005f.action_bar_container);
            this.f1731j = m7716t(findViewById(C0005f.action_bar));
        }
    }
}
