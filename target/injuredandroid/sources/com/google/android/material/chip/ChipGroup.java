package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.C1843c;
import com.google.android.material.internal.C1851g;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
/* loaded from: classes.dex */
public class ChipGroup extends C1843c {

    /* renamed from: i */
    private int f5103i;

    /* renamed from: j */
    private int f5104j;

    /* renamed from: k */
    private boolean f5105k;

    /* renamed from: l */
    private InterfaceC1758d f5106l;

    /* renamed from: m */
    private final C1756b f5107m;

    /* renamed from: n */
    private ViewGroup$OnHierarchyChangeListenerC1759e f5108n;

    /* renamed from: o */
    private int f5109o;

    /* renamed from: p */
    private boolean f5110p;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes.dex */
    private class C1756b implements CompoundButton.OnCheckedChangeListener {
        private C1756b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.f5110p) {
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (ChipGroup.this.f5109o == id) {
                    ChipGroup.this.setCheckedId(-1);
                    return;
                }
                return;
            }
            if (ChipGroup.this.f5109o != -1 && ChipGroup.this.f5109o != id && ChipGroup.this.f5105k) {
                ChipGroup chipGroup = ChipGroup.this;
                chipGroup.m3236k(chipGroup.f5109o, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes.dex */
    public static class C1757c extends ViewGroup.MarginLayoutParams {
        public C1757c(int i, int i2) {
            super(i, i2);
        }

        public C1757c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1757c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1758d {
        /* renamed from: a */
        void m3235a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes.dex */
    private class ViewGroup$OnHierarchyChangeListenerC1759e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: f */
        private ViewGroup.OnHierarchyChangeListener f5112f;

        private ViewGroup$OnHierarchyChangeListenerC1759e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f5107m);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5112f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5112f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5107m = new C1756b();
        this.f5108n = new ViewGroup$OnHierarchyChangeListenerC1759e();
        this.f5109o = -1;
        this.f5110p = false;
        TypedArray m2714k = C1851g.m2714k(context, attributeSet, C1349k.ChipGroup, i, C1348j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = m2714k.getDimensionPixelOffset(C1349k.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(m2714k.getDimensionPixelOffset(C1349k.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(m2714k.getDimensionPixelOffset(C1349k.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(m2714k.getBoolean(C1349k.ChipGroup_singleLine, false));
        setSingleSelection(m2714k.getBoolean(C1349k.ChipGroup_singleSelection, false));
        int resourceId = m2714k.getResourceId(C1349k.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f5109o = resourceId;
        }
        m2714k.recycle();
        super.setOnHierarchyChangeListener(this.f5108n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m3236k(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f5110p = true;
            ((Chip) findViewById).setChecked(z);
            this.f5110p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f5109o = i;
        InterfaceC1758d interfaceC1758d = this.f5106l;
        if (interfaceC1758d == null || !this.f5105k) {
            return;
        }
        interfaceC1758d.m3235a(this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f5109o;
                if (i2 != -1 && this.f5105k) {
                    m3236k(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.material.internal.C1843c
    /* renamed from: b */
    public boolean mo2744b() {
        return super.mo2744b();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1757c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1757c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1757c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1757c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f5105k) {
            return this.f5109o;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f5103i;
    }

    public int getChipSpacingVertical() {
        return this.f5104j;
    }

    /* renamed from: j */
    public void m3237j() {
        this.f5110p = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f5110p = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f5109o;
        if (i != -1) {
            m3236k(i, true);
            setCheckedId(this.f5109o);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f5103i != i) {
            this.f5103i = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f5104j != i) {
            this.f5104j = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC1758d interfaceC1758d) {
        this.f5106l = interfaceC1758d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f5108n.f5112f = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // com.google.android.material.internal.C1843c
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f5105k != z) {
            this.f5105k = z;
            m3237j();
        }
    }
}
