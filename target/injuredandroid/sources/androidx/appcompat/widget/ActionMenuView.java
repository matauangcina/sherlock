package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0507g;
import androidx.appcompat.view.menu.C0511i;
import androidx.appcompat.view.menu.InterfaceC0522m;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.appcompat.widget.C0606i0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.Reader;
/* loaded from: classes.dex */
public class ActionMenuView extends C0606i0 implements C0507g.InterfaceC0509b, InterfaceC0524n {

    /* renamed from: A */
    C0507g.InterfaceC0508a f1751A;

    /* renamed from: B */
    private boolean f1752B;

    /* renamed from: C */
    private int f1753C;

    /* renamed from: D */
    private int f1754D;

    /* renamed from: E */
    private int f1755E;

    /* renamed from: F */
    InterfaceC0543e f1756F;

    /* renamed from: u */
    private C0507g f1757u;

    /* renamed from: v */
    private Context f1758v;

    /* renamed from: w */
    private int f1759w;

    /* renamed from: x */
    private boolean f1760x;

    /* renamed from: y */
    private C0579c f1761y;

    /* renamed from: z */
    private InterfaceC0522m.InterfaceC0523a f1762z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0539a {
        /* renamed from: a */
        boolean mo7497a();

        /* renamed from: b */
        boolean mo7496b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0540b implements InterfaceC0522m.InterfaceC0523a {
        C0540b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: b */
        public void mo7494b(C0507g c0507g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0522m.InterfaceC0523a
        /* renamed from: c */
        public boolean mo7493c(C0507g c0507g) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0541c extends C0606i0.C0607a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f1763c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f1764d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f1765e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f1766f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f1767g;

        /* renamed from: h */
        boolean f1768h;

        public C0541c(int i, int i2) {
            super(i, i2);
            this.f1763c = false;
        }

        public C0541c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0541c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0541c(C0541c c0541c) {
            super(c0541c);
            this.f1763c = c0541c.f1763c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0542d implements C0507g.InterfaceC0508a {
        C0542d() {
        }

        @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
        /* renamed from: a */
        public boolean mo7687a(C0507g c0507g, MenuItem menuItem) {
            InterfaceC0543e interfaceC0543e = ActionMenuView.this.f1756F;
            return interfaceC0543e != null && interfaceC0543e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0508a
        /* renamed from: b */
        public void mo7686b(C0507g c0507g) {
            C0507g.InterfaceC0508a interfaceC0508a = ActionMenuView.this.f1751A;
            if (interfaceC0508a != null) {
                interfaceC0508a.mo7686b(c0507g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0543e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1754D = (int) (56.0f * f);
        this.f1755E = (int) (f * 4.0f);
        this.f1758v = context;
        this.f1759w = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m7693L(View view, int i, int i2, int i3, int i4) {
        C0541c c0541c = (C0541c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m7893f();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        c0541c.f1766f = (c0541c.f1763c || !z2) ? false : false;
        c0541c.f1764d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: M */
    private void m7692M(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f1754D;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    int i19 = this.f1755E;
                    i6 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    r14 = 0;
                }
                C0541c c0541c = (C0541c) childAt.getLayoutParams();
                c0541c.f1768h = r14;
                c0541c.f1765e = r14;
                c0541c.f1764d = r14;
                c0541c.f1766f = r14;
                ((ViewGroup.MarginLayoutParams) c0541c).leftMargin = r14;
                ((ViewGroup.MarginLayoutParams) c0541c).rightMargin = r14;
                c0541c.f1767g = z5 && ((ActionMenuItemView) childAt).m7893f();
                int m7693L = m7693L(childAt, i11, c0541c.f1763c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, m7693L);
                if (c0541c.f1766f) {
                    i16++;
                }
                if (c0541c.f1763c) {
                    z4 = true;
                }
                i9 -= m7693L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (m7693L == 1) {
                    j |= 1 << i13;
                    i12 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i20 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i16 > 0 && i9 > 0) {
            int i21 = 0;
            int i22 = 0;
            int i23 = Reader.READ_DONE;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                C0541c c0541c2 = (C0541c) getChildAt(i22).getLayoutParams();
                int i24 = i12;
                if (c0541c2.f1766f) {
                    int i25 = c0541c2.f1764d;
                    if (i25 < i23) {
                        j2 = 1 << i22;
                        i23 = i25;
                        i21 = 1;
                    } else if (i25 == i23) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                i12 = i24;
                z7 = z8;
            }
            z = z7;
            i5 = i12;
            j |= j2;
            if (i21 > i9) {
                i3 = mode;
                i4 = i7;
                break;
            }
            int i26 = i23 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                C0541c c0541c3 = (C0541c) childAt2.getLayoutParams();
                int i28 = i7;
                int i29 = mode;
                long j3 = 1 << i27;
                if ((j2 & j3) == 0) {
                    if (c0541c3.f1764d == i26) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && c0541c3.f1767g && i9 == 1) {
                        int i30 = this.f1755E;
                        z3 = z6;
                        childAt2.setPadding(i30 + i11, 0, i30, 0);
                    } else {
                        z3 = z6;
                    }
                    c0541c3.f1764d++;
                    c0541c3.f1768h = true;
                    i9--;
                }
                i27++;
                mode = i29;
                i7 = i28;
                z6 = z3;
            }
            i12 = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i7;
        z = z7;
        i5 = i12;
        boolean z9 = !z4 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z9 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z9) {
                if ((j & 1) != 0 && !((C0541c) getChildAt(0).getLayoutParams()).f1767g) {
                    bitCount -= 0.5f;
                }
                int i31 = childCount - 1;
                if ((j & (1 << i31)) != 0 && !((C0541c) getChildAt(i31).getLayoutParams()).f1767g) {
                    bitCount -= 0.5f;
                }
            }
            int i32 = bitCount > 0.0f ? (int) ((i9 * i11) / bitCount) : 0;
            z2 = z;
            for (int i33 = 0; i33 < childCount; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    C0541c c0541c4 = (C0541c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0541c4.f1765e = i32;
                        c0541c4.f1768h = true;
                        if (i33 == 0 && !c0541c4.f1767g) {
                            ((ViewGroup.MarginLayoutParams) c0541c4).leftMargin = (-i32) / 2;
                        }
                    } else if (c0541c4.f1763c) {
                        c0541c4.f1765e = i32;
                        c0541c4.f1768h = true;
                        ((ViewGroup.MarginLayoutParams) c0541c4).rightMargin = (-i32) / 2;
                    } else {
                        if (i33 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0541c4).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) c0541c4).rightMargin = i32 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt4 = getChildAt(i34);
                C0541c c0541c5 = (C0541c) childAt4.getLayoutParams();
                if (c0541c5.f1768h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0541c5.f1764d * i11) + c0541c5.f1765e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i20);
    }

    /* renamed from: B */
    public void m7703B() {
        C0579c c0579c = this.f1761y;
        if (c0579c != null) {
            c0579c.m7501x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0606i0
    /* renamed from: C */
    public C0541c mo7426m() {
        C0541c c0541c = new C0541c(-2, -2);
        c0541c.f2046b = 16;
        return c0541c;
    }

    @Override // androidx.appcompat.widget.C0606i0
    /* renamed from: D */
    public C0541c mo7425n(AttributeSet attributeSet) {
        return new C0541c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0606i0
    /* renamed from: E */
    public C0541c mo7424o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            C0541c c0541c = layoutParams instanceof C0541c ? new C0541c((C0541c) layoutParams) : new C0541c(layoutParams);
            if (c0541c.f2046b <= 0) {
                c0541c.f2046b = 16;
            }
            return c0541c;
        }
        return mo7426m();
    }

    /* renamed from: F */
    public C0541c m7699F() {
        C0541c mo7426m = mo7426m();
        mo7426m.f1763c = true;
        return mo7426m;
    }

    /* renamed from: G */
    protected boolean m7698G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0539a)) {
            z = false | ((InterfaceC0539a) childAt).mo7497a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0539a)) ? z : z | ((InterfaceC0539a) childAt2).mo7496b();
    }

    /* renamed from: H */
    public boolean m7697H() {
        C0579c c0579c = this.f1761y;
        return c0579c != null && c0579c.m7527A();
    }

    /* renamed from: I */
    public boolean m7696I() {
        C0579c c0579c = this.f1761y;
        return c0579c != null && c0579c.m7525C();
    }

    /* renamed from: J */
    public boolean m7695J() {
        C0579c c0579c = this.f1761y;
        return c0579c != null && c0579c.m7524D();
    }

    /* renamed from: K */
    public boolean m7694K() {
        return this.f1760x;
    }

    /* renamed from: N */
    public C0507g m7691N() {
        return this.f1757u;
    }

    /* renamed from: O */
    public void m7690O(InterfaceC0522m.InterfaceC0523a interfaceC0523a, C0507g.InterfaceC0508a interfaceC0508a) {
        this.f1762z = interfaceC0523a;
        this.f1751A = interfaceC0508a;
    }

    /* renamed from: P */
    public boolean m7689P() {
        C0579c c0579c = this.f1761y;
        return c0579c != null && c0579c.m7518J();
    }

    @Override // androidx.appcompat.view.menu.C0507g.InterfaceC0509b
    /* renamed from: a */
    public boolean mo7688a(C0511i c0511i) {
        return this.f1757u.m7848L(c0511i, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n
    /* renamed from: b */
    public void mo2797b(C0507g c0507g) {
        this.f1757u = c0507g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0606i0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0541c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1757u == null) {
            Context context = getContext();
            C0507g c0507g = new C0507g(context);
            this.f1757u = c0507g;
            c0507g.mo7736R(new C0542d());
            C0579c c0579c = new C0579c(context);
            this.f1761y = c0579c;
            c0579c.m7519I(true);
            C0579c c0579c2 = this.f1761y;
            InterfaceC0522m.InterfaceC0523a interfaceC0523a = this.f1762z;
            if (interfaceC0523a == null) {
                interfaceC0523a = new C0540b();
            }
            c0579c2.mo7580k(interfaceC0523a);
            this.f1757u.m7830c(this.f1761y, this.f1758v);
            this.f1761y.m7521G(this);
        }
        return this.f1757u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1761y.m7499z();
    }

    public int getPopupTheme() {
        return this.f1759w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0579c c0579c = this.f1761y;
        if (c0579c != null) {
            c0579c.mo7513f(false);
            if (this.f1761y.m7524D()) {
                this.f1761y.m7527A();
                this.f1761y.m7518J();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7703B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0606i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1752B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean m7482b = C0588c1.m7482b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0541c c0541c = (C0541c) childAt.getLayoutParams();
                if (c0541c.f1763c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m7698G(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m7482b) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0541c).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0541c).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0541c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0541c).rightMargin;
                    m7698G(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (m7482b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0541c c0541c2 = (C0541c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0541c2.f1763c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) c0541c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0541c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0541c c0541c3 = (C0541c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0541c3.f1763c) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0541c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0541c3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0606i0, android.view.View
    public void onMeasure(int i, int i2) {
        C0507g c0507g;
        boolean z = this.f1752B;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1752B = z2;
        if (z != z2) {
            this.f1753C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1752B && (c0507g = this.f1757u) != null && size != this.f1753C) {
            this.f1753C = size;
            c0507g.m7849K(true);
        }
        int childCount = getChildCount();
        if (this.f1752B && childCount > 0) {
            m7692M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0541c c0541c = (C0541c) getChildAt(i3).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0541c).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0541c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1761y.m7522F(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0543e interfaceC0543e) {
        this.f1756F = interfaceC0543e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1761y.m7520H(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1760x = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1759w != i) {
            this.f1759w = i;
            if (i == 0) {
                this.f1758v = getContext();
            } else {
                this.f1758v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0579c c0579c) {
        this.f1761y = c0579c;
        c0579c.m7521G(this);
    }
}
