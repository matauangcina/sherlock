package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000a.p001a.C0005f;
import p000a.p001a.C0009j;
import p000a.p019g.p028k.C0252s;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f1698f;

    /* renamed from: g */
    private View f1699g;

    /* renamed from: h */
    private View f1700h;

    /* renamed from: i */
    private View f1701i;

    /* renamed from: j */
    Drawable f1702j;

    /* renamed from: k */
    Drawable f1703k;

    /* renamed from: l */
    Drawable f1704l;

    /* renamed from: m */
    boolean f1705m;

    /* renamed from: n */
    boolean f1706n;

    /* renamed from: o */
    private int f1707o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0252s.m8619i0(this, new C0576b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0009j.ActionBar);
        this.f1702j = obtainStyledAttributes.getDrawable(C0009j.ActionBar_background);
        this.f1703k = obtainStyledAttributes.getDrawable(C0009j.ActionBar_backgroundStacked);
        this.f1707o = obtainStyledAttributes.getDimensionPixelSize(C0009j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C0005f.split_action_bar) {
            this.f1705m = true;
            this.f1704l = obtainStyledAttributes.getDrawable(C0009j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1705m ? this.f1702j != null || this.f1703k != null : this.f1704l != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m7730a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m7729b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1702j;
        if (drawable != null && drawable.isStateful()) {
            this.f1702j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1703k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1703k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1704l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1704l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1699g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1702j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1703k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1704l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1700h = findViewById(C0005f.action_bar);
        this.f1701i = findViewById(C0005f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1698f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1699g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1705m) {
            Drawable drawable3 = this.f1704l;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1702j != null) {
                if (this.f1700h.getVisibility() == 0) {
                    drawable2 = this.f1702j;
                    left = this.f1700h.getLeft();
                    top = this.f1700h.getTop();
                    right = this.f1700h.getRight();
                    view = this.f1700h;
                } else {
                    View view3 = this.f1701i;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1702j.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f1702j;
                        left = this.f1701i.getLeft();
                        top = this.f1701i.getTop();
                        right = this.f1701i.getRight();
                        view = this.f1701i;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f1706n = z4;
            if (!z4 || (drawable = this.f1703k) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1700h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f1707o
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1700h
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1699g
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f1700h
            boolean r0 = r3.m7729b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f1700h
        L42:
            int r0 = r3.m7730a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f1701i
            boolean r0 = r3.m7729b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f1701i
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1699g
            int r1 = r3.m7730a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1702j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1702j);
        }
        this.f1702j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1700h;
            if (view != null) {
                this.f1702j.setBounds(view.getLeft(), this.f1700h.getTop(), this.f1700h.getRight(), this.f1700h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1705m ? this.f1702j != null || this.f1703k != null : this.f1704l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1704l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1704l);
        }
        this.f1704l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1705m && (drawable2 = this.f1704l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1705m ? !(this.f1702j != null || this.f1703k != null) : this.f1704l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1703k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1703k);
        }
        this.f1703k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1706n && (drawable2 = this.f1703k) != null) {
                drawable2.setBounds(this.f1699g.getLeft(), this.f1699g.getTop(), this.f1699g.getRight(), this.f1699g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1705m ? this.f1702j != null || this.f1703k != null : this.f1704l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0635p0 c0635p0) {
        View view = this.f1699g;
        if (view != null) {
            removeView(view);
        }
        this.f1699g = c0635p0;
        if (c0635p0 != null) {
            addView(c0635p0);
            ViewGroup.LayoutParams layoutParams = c0635p0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0635p0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1698f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1702j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1703k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1704l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1702j && !this.f1705m) || (drawable == this.f1703k && this.f1706n) || ((drawable == this.f1704l && this.f1705m) || super.verifyDrawable(drawable));
    }
}
