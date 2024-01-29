package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1346h;
/* loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: y */
    private static final int[] f5557y = {C1338b.snackbarButtonStyle};

    /* renamed from: w */
    private final AccessibilityManager f5558w;

    /* renamed from: x */
    private boolean f5559x;

    /* loaded from: classes.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.C1876v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C1876v, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1878a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ View.OnClickListener f5560f;

        View$OnClickListenerC1878a(View.OnClickListener onClickListener) {
            this.f5560f = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f5560f.onClick(view);
            Snackbar.this.m2669u(1);
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, InterfaceC1879a interfaceC1879a) {
        super(viewGroup, view, interfaceC1879a);
        this.f5558w = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: V */
    private static ViewGroup m2649V(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: W */
    protected static boolean m2648W(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5557y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* renamed from: X */
    public static Snackbar m2647X(View view, CharSequence charSequence, int i) {
        ViewGroup m2649V = m2649V(view);
        if (m2649V != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(m2649V.getContext()).inflate(m2648W(m2649V.getContext()) ? C1346h.mtrl_layout_snackbar_include : C1346h.design_layout_snackbar_include, m2649V, false);
            Snackbar snackbar = new Snackbar(m2649V, snackbarContentLayout, snackbarContentLayout);
            snackbar.m2645Z(charSequence);
            snackbar.m2699J(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: N */
    public void mo2650N() {
        super.mo2650N();
    }

    /* renamed from: Y */
    public Snackbar m2646Y(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f5511c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f5559x = false;
        } else {
            this.f5559x = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View$OnClickListenerC1878a(onClickListener));
        }
        return this;
    }

    /* renamed from: Z */
    public Snackbar m2645Z(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f5511c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: t */
    public void mo2644t() {
        super.mo2644t();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* renamed from: w */
    public int mo2643w() {
        int mo2643w = super.mo2643w();
        if (mo2643w == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f5558w.getRecommendedTimeoutMillis(mo2643w, (this.f5559x ? 4 : 0) | 1 | 2);
        } else if (this.f5559x && this.f5558w.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return mo2643w;
        }
    }
}
