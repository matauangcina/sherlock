package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0511i;
import androidx.appcompat.view.menu.InterfaceC0524n;
import androidx.appcompat.widget.C0606i0;
import androidx.appcompat.widget.C0673y0;
import androidx.core.content.p052d.C0752f;
import androidx.core.graphics.drawable.C0759a;
import androidx.core.widget.C0779i;
import p000a.p001a.C0000a;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1343e;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.C1346h;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends C1844d implements InterfaceC0524n.InterfaceC0525a {

    /* renamed from: K */
    private static final int[] f5413K = {16842912};

    /* renamed from: A */
    private int f5414A;

    /* renamed from: B */
    private boolean f5415B;

    /* renamed from: C */
    boolean f5416C;

    /* renamed from: D */
    private final CheckedTextView f5417D;

    /* renamed from: E */
    private FrameLayout f5418E;

    /* renamed from: F */
    private C0511i f5419F;

    /* renamed from: G */
    private ColorStateList f5420G;

    /* renamed from: H */
    private boolean f5421H;

    /* renamed from: I */
    private Drawable f5422I;

    /* renamed from: J */
    private final C0195a f5423J;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes.dex */
    class C1839a extends C0195a {
        C1839a() {
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            super.mo2517g(view, c0217c);
            c0217c.m8779U(NavigationMenuItemView.this.f5416C);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5423J = new C1839a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1346h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1342d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1344f.design_menu_item_text);
        this.f5417D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0252s.m8625f0(this.f5417D, this.f5423J);
    }

    /* renamed from: B */
    private void m2802B() {
        C0606i0.C0607a c0607a;
        int i;
        if (m2800D()) {
            this.f5417D.setVisibility(8);
            FrameLayout frameLayout = this.f5418E;
            if (frameLayout == null) {
                return;
            }
            c0607a = (C0606i0.C0607a) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.f5417D.setVisibility(0);
            FrameLayout frameLayout2 = this.f5418E;
            if (frameLayout2 == null) {
                return;
            }
            c0607a = (C0606i0.C0607a) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((ViewGroup.MarginLayoutParams) c0607a).width = i;
        this.f5418E.setLayoutParams(c0607a);
    }

    /* renamed from: C */
    private StateListDrawable m2801C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C0000a.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f5413K, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: D */
    private boolean m2800D() {
        return this.f5419F.getTitle() == null && this.f5419F.getIcon() == null && this.f5419F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f5418E == null) {
                this.f5418E = (FrameLayout) ((ViewStub) findViewById(C1344f.design_menu_item_action_area_stub)).inflate();
            }
            this.f5418E.removeAllViews();
            this.f5418E.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    /* renamed from: d */
    public boolean mo2799d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    /* renamed from: e */
    public void mo2798e(C0511i c0511i, int i) {
        this.f5419F = c0511i;
        setVisibility(c0511i.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0252s.m8619i0(this, m2801C());
        }
        setCheckable(c0511i.isCheckable());
        setChecked(c0511i.isChecked());
        setEnabled(c0511i.isEnabled());
        setTitle(c0511i.getTitle());
        setIcon(c0511i.getIcon());
        setActionView(c0511i.getActionView());
        setContentDescription(c0511i.getContentDescription());
        C0673y0.m7140a(this, c0511i.getTooltipText());
        m2802B();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0524n.InterfaceC0525a
    public C0511i getItemData() {
        return this.f5419F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0511i c0511i = this.f5419F;
        if (c0511i != null && c0511i.isCheckable() && this.f5419F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f5413K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f5416C != z) {
            this.f5416C = z;
            this.f5423J.mo5144l(this.f5417D, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f5417D.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f5421H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0759a.m6744r(drawable).mutate();
                C0759a.m6747o(drawable, this.f5420G);
            }
            int i = this.f5414A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f5415B) {
            if (this.f5422I == null) {
                Drawable m6801d = C0752f.m6801d(getResources(), C1343e.navigation_empty_icon, getContext().getTheme());
                this.f5422I = m6801d;
                if (m6801d != null) {
                    int i2 = this.f5414A;
                    m6801d.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f5422I;
        }
        C0779i.m6633i(this.f5417D, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f5417D.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f5414A = i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f5420G = colorStateList;
        this.f5421H = colorStateList != null;
        C0511i c0511i = this.f5419F;
        if (c0511i != null) {
            setIcon(c0511i.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f5417D.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f5415B = z;
    }

    public void setTextAppearance(int i) {
        C0779i.m6628n(this.f5417D, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f5417D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5417D.setText(charSequence);
    }
}
