package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0759a;
import androidx.core.widget.C0776f;
import java.lang.reflect.Field;
import p000a.p001a.C0000a;
import p000a.p001a.p004l.p005a.C0024c;
import p000a.p019g.p028k.C0267w;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public class C0595f0 extends ListView {

    /* renamed from: f */
    private final Rect f1992f;

    /* renamed from: g */
    private int f1993g;

    /* renamed from: h */
    private int f1994h;

    /* renamed from: i */
    private int f1995i;

    /* renamed from: j */
    private int f1996j;

    /* renamed from: k */
    private int f1997k;

    /* renamed from: l */
    private Field f1998l;

    /* renamed from: m */
    private C0596a f1999m;

    /* renamed from: n */
    private boolean f2000n;

    /* renamed from: o */
    private boolean f2001o;

    /* renamed from: p */
    private boolean f2002p;

    /* renamed from: q */
    private C0267w f2003q;

    /* renamed from: r */
    private C0776f f2004r;

    /* renamed from: s */
    RunnableC0597b f2005s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$a */
    /* loaded from: classes.dex */
    public static class C0596a extends C0024c {

        /* renamed from: g */
        private boolean f2006g;

        C0596a(Drawable drawable) {
            super(drawable);
            this.f2006g = true;
        }

        /* renamed from: c */
        void m7453c(boolean z) {
            this.f2006g = z;
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f2006g) {
                super.draw(canvas);
            }
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f2006g) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2006g) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f2006g) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p000a.p001a.p004l.p005a.C0024c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2006g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.f0$b */
    /* loaded from: classes.dex */
    public class RunnableC0597b implements Runnable {
        RunnableC0597b() {
        }

        /* renamed from: a */
        public void m7452a() {
            C0595f0 c0595f0 = C0595f0.this;
            c0595f0.f2005s = null;
            c0595f0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m7451b() {
            C0595f0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0595f0 c0595f0 = C0595f0.this;
            c0595f0.f2005s = null;
            c0595f0.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0595f0(Context context, boolean z) {
        super(context, null, C0000a.dropDownListViewStyle);
        this.f1992f = new Rect();
        this.f1993g = 0;
        this.f1994h = 0;
        this.f1995i = 0;
        this.f1996j = 0;
        this.f2001o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1998l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m7464a() {
        this.f2002p = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1997k - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0267w c0267w = this.f2003q;
        if (c0267w != null) {
            c0267w.m8537b();
            this.f2003q = null;
        }
    }

    /* renamed from: b */
    private void m7463b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m7462c(Canvas canvas) {
        Drawable selector;
        if (this.f1992f.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1992f);
        selector.draw(canvas);
    }

    /* renamed from: f */
    private void m7459f(int i, View view) {
        Rect rect = this.f1992f;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1993g;
        rect.top -= this.f1994h;
        rect.right += this.f1995i;
        rect.bottom += this.f1996j;
        try {
            boolean z = this.f1998l.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1998l.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m7458g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m7459f(i, view);
        if (z) {
            Rect rect = this.f1992f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0759a.m6751k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m7457h(int i, View view, float f, float f2) {
        m7458g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C0759a.m6751k(selector, f, f2);
    }

    /* renamed from: i */
    private void m7456i(View view, int i, float f, float f2) {
        View childAt;
        this.f2002p = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1997k;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1997k = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m7457h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m7455j() {
        return this.f2002p;
    }

    /* renamed from: k */
    private void m7454k() {
        Drawable selector = getSelector();
        if (selector != null && m7455j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0596a c0596a = this.f1999m;
        if (c0596a != null) {
            c0596a.m7453c(z);
        }
    }

    /* renamed from: d */
    public int m7461d(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m7462c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f2005s != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m7454k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m7460e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m7456i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m7463b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m7464a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f2004r
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f2004r = r9
        L5a:
            androidx.core.widget.f r9 = r7.f2004r
            r9.m6680m(r2)
            androidx.core.widget.f r9 = r7.f2004r
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f2004r
            if (r8 == 0) goto L6c
            r8.m6680m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0595f0.m7460e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f2001o || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f2001o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f2001o || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f2001o && this.f2000n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f2005s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2005s == null) {
            RunnableC0597b runnableC0597b = new RunnableC0597b();
            this.f2005s = runnableC0597b;
            runnableC0597b.m7451b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m7454k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1997k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0597b runnableC0597b = this.f2005s;
        if (runnableC0597b != null) {
            runnableC0597b.m7452a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f2000n = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0596a c0596a = drawable != null ? new C0596a(drawable) : null;
        this.f1999m = c0596a;
        super.setSelector(c0596a);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1993g = rect.left;
        this.f1994h = rect.top;
        this.f1995i = rect.right;
        this.f1996j = rect.bottom;
    }
}
