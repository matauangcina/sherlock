package com.insecureshop.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public class ProductItemBindingImpl extends ProductItemBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C0893R.C0896id.card_view, 1);
        sViewsWithIds.put(C0893R.C0896id.picture, 2);
        sViewsWithIds.put(C0893R.C0896id.prod_name, 3);
        sViewsWithIds.put(C0893R.C0896id.more_info, 4);
        sViewsWithIds.put(C0893R.C0896id.prod_price, 5);
        sViewsWithIds.put(C0893R.C0896id.ic_add, 6);
        sViewsWithIds.put(C0893R.C0896id.product_count, 7);
        sViewsWithIds.put(C0893R.C0896id.ic_remove, 8);
    }

    public ProductItemBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }

    private ProductItemBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (CardView) bindings[1], (AppCompatImageView) bindings[6], (AppCompatImageView) bindings[8], (TextView) bindings[4], (ImageView) bindings[2], (TextView) bindings[3], (TextView) bindings[5], (TextView) bindings[7]);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) bindings[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        synchronized (this) {
            long j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
    }
}
