package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p001a.C0000a;
import p000a.p001a.C0005f;
import p000a.p001a.C0006g;
import p000a.p001a.C0009j;
import p000a.p001a.p007n.AbstractC0030b;
import p000a.p019g.p028k.C0252s;
/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0572a {

    /* renamed from: n */
    private CharSequence f1708n;

    /* renamed from: o */
    private CharSequence f1709o;

    /* renamed from: p */
    private View f1710p;

    /* renamed from: q */
    private View f1711q;

    /* renamed from: r */
    private LinearLayout f1712r;

    /* renamed from: s */
    private TextView f1713s;

    /* renamed from: t */
    private TextView f1714t;

    /* renamed from: u */
    private int f1715u;

    /* renamed from: v */
    private int f1716v;

    /* renamed from: w */
    private boolean f1717w;

    /* renamed from: x */
    private int f1718x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0533a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ AbstractC0030b f1719f;

        View$OnClickListenerC0533a(ActionBarContextView actionBarContextView, AbstractC0030b abstractC0030b) {
            this.f1719f = abstractC0030b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1719f.mo7908c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0665w0 m7213u = C0665w0.m7213u(context, attributeSet, C0009j.ActionMode, i, 0);
        C0252s.m8619i0(this, m7213u.m7227g(C0009j.ActionMode_background));
        this.f1715u = m7213u.m7220n(C0009j.ActionMode_titleTextStyle, 0);
        this.f1716v = m7213u.m7220n(C0009j.ActionMode_subtitleTextStyle, 0);
        this.f1919j = m7213u.m7221m(C0009j.ActionMode_height, 0);
        this.f1718x = m7213u.m7220n(C0009j.ActionMode_closeItemLayout, C0006g.abc_action_mode_close_item_material);
        m7213u.m7212v();
    }

    /* renamed from: i */
    private void m7726i() {
        if (this.f1712r == null) {
            LayoutInflater.from(getContext()).inflate(C0006g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1712r = linearLayout;
            this.f1713s = (TextView) linearLayout.findViewById(C0005f.action_bar_title);
            this.f1714t = (TextView) this.f1712r.findViewById(C0005f.action_bar_subtitle);
            if (this.f1715u != 0) {
                this.f1713s.setTextAppearance(getContext(), this.f1715u);
            }
            if (this.f1716v != 0) {
                this.f1714t.setTextAppearance(getContext(), this.f1716v);
            }
        }
        this.f1713s.setText(this.f1708n);
        this.f1714t.setText(this.f1709o);
        boolean z = !TextUtils.isEmpty(this.f1708n);
        boolean z2 = !TextUtils.isEmpty(this.f1709o);
        int i = 0;
        this.f1714t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1712r;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1712r.getParent() == null) {
            addView(this.f1712r);
        }
    }

    /* renamed from: g */
    public void m7728g() {
        if (this.f1710p == null) {
            m7724k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0572a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0572a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1709o;
    }

    public CharSequence getTitle() {
        return this.f1708n;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m7727h(p000a.p001a.p007n.AbstractC0030b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1710p
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1718x
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1710p = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f1710p
            goto L15
        L22:
            android.view.View r0 = r3.f1710p
            int r1 = p000a.p001a.C0005f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo7906e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0507g) r4
            androidx.appcompat.widget.c r0 = r3.f1918i
            if (r0 == 0) goto L3f
            r0.m7501x()
        L3f:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1918i = r0
            r1 = 1
            r0.m7519I(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1918i
            android.content.Context r2 = r3.f1916g
            r4.m7830c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1918i
            androidx.appcompat.view.menu.n r4 = r4.mo7509o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1917h = r4
            r1 = 0
            p000a.p019g.p028k.C0252s.m8619i0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1917h
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m7727h(a.a.n.b):void");
    }

    /* renamed from: j */
    public boolean m7725j() {
        return this.f1717w;
    }

    /* renamed from: k */
    public void m7724k() {
        removeAllViews();
        this.f1711q = null;
        this.f1917h = null;
    }

    /* renamed from: l */
    public boolean m7723l() {
        C0579c c0579c = this.f1918i;
        if (c0579c != null) {
            return c0579c.m7518J();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0579c c0579c = this.f1918i;
        if (c0579c != null) {
            c0579c.m7527A();
            this.f1918i.m7526B();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1708n);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m7482b = C0588c1.m7482b(this);
        int paddingRight = m7482b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1710p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1710p.getLayoutParams();
            int i5 = m7482b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m7482b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m7570d = AbstractC0572a.m7570d(paddingRight, i5, m7482b);
            paddingRight = AbstractC0572a.m7570d(m7570d + m7569e(this.f1710p, m7570d, paddingTop, paddingTop2, m7482b), i6, m7482b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1712r;
        if (linearLayout != null && this.f1711q == null && linearLayout.getVisibility() != 8) {
            i7 += m7569e(this.f1712r, i7, paddingTop, paddingTop2, m7482b);
        }
        int i8 = i7;
        View view2 = this.f1711q;
        if (view2 != null) {
            m7569e(view2, i8, paddingTop, paddingTop2, m7482b);
        }
        int paddingLeft = m7482b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1917h;
        if (actionMenuView != null) {
            m7569e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m7482b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.f1919j;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, RecyclerView.UNDEFINED_DURATION);
            View view = this.f1710p;
            if (view != null) {
                int m7571c = m7571c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1710p.getLayoutParams();
                paddingLeft = m7571c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1917h;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = m7571c(this.f1917h, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1712r;
            if (linearLayout != null && this.f1711q == null) {
                if (this.f1717w) {
                    this.f1712r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1712r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1712r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = m7571c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1711q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                int i6 = layoutParams.width;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i7 = layoutParams.height == -2 ? RecyclerView.UNDEFINED_DURATION : 1073741824;
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i4 = Math.min(i8, i4);
                }
                this.f1711q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i7));
            }
            if (this.f1919j > 0) {
                setMeasuredDimension(size, i3);
                return;
            }
            int childCount = getChildCount();
            int i9 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                if (measuredHeight > i9) {
                    i9 = measuredHeight;
                }
            }
            setMeasuredDimension(size, i9);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0572a
    public void setContentHeight(int i) {
        this.f1919j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1711q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1711q = view;
        if (view != null && (linearLayout = this.f1712r) != null) {
            removeView(linearLayout);
            this.f1712r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1709o = charSequence;
        m7726i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1708n = charSequence;
        m7726i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1717w) {
            requestLayout();
        }
        this.f1717w = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0572a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
