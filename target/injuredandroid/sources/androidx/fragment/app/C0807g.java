package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p000a.p035j.C0297c;
/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public final class C0807g extends FrameLayout {

    /* renamed from: f */
    private ArrayList<View> f2908f;

    /* renamed from: g */
    private ArrayList<View> f2909g;

    /* renamed from: h */
    private boolean f2910h;

    public C0807g(Context context) {
        super(context);
        this.f2910h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0807g(Context context, AttributeSet attributeSet, AbstractC0814m abstractC0814m) {
        super(context, attributeSet);
        String str;
        this.f2910h = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0297c.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C0297c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(C0297c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment m6380W = abstractC0814m.m6380W(id);
        if (classAttribute == null || m6380W != null) {
            return;
        }
        if (id > 0) {
            Fragment mo6321a = abstractC0814m.m6364e0().mo6321a(context.getClassLoader(), classAttribute);
            mo6321a.mo5997q0(context, attributeSet, null);
            AbstractC0835t m6357i = abstractC0814m.m6357i();
            m6357i.m6229s(true);
            m6357i.m6245c(this, mo6321a, string);
            m6357i.mo6237k();
            return;
        }
        if (string != null) {
            str = " with tag " + string;
        } else {
            str = "";
        }
        throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
    }

    /* renamed from: a */
    private void m6477a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f2909g) != null && arrayList.contains(view))) {
            if (this.f2908f == null) {
                this.f2908f = new ArrayList<>();
            }
            this.f2908f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (AbstractC0814m.m6352k0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (AbstractC0814m.m6352k0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f2910h && this.f2908f != null) {
            for (int i = 0; i < this.f2908f.size(); i++) {
                super.drawChild(canvas, this.f2908f.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f2910h || (arrayList = this.f2908f) == null || arrayList.size() <= 0 || !this.f2908f.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2909g;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2908f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2910h = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m6477a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        if (z) {
            m6477a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m6477a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m6477a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m6477a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m6477a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m6477a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2910h = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT >= 18) {
            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        }
        super.setLayoutTransition(layoutTransition);
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2909g == null) {
                this.f2909g = new ArrayList<>();
            }
            this.f2909g.add(view);
        }
        super.startViewTransition(view);
    }
}
