package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class ProductItemBinding extends ViewDataBinding {
    public final CardView cardView;
    public final AppCompatImageView icAdd;
    public final AppCompatImageView icRemove;
    public final TextView moreInfo;
    public final ImageView picture;
    public final TextView prodName;
    public final TextView prodPrice;
    public final TextView productCount;

    /* JADX INFO: Access modifiers changed from: protected */
    public ProductItemBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView cardView, AppCompatImageView icAdd, AppCompatImageView icRemove, TextView moreInfo, ImageView picture, TextView prodName, TextView prodPrice, TextView productCount) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cardView = cardView;
        this.icAdd = icAdd;
        this.icRemove = icRemove;
        this.moreInfo = moreInfo;
        this.picture = picture;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.productCount = productCount;
    }

    public static ProductItemBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProductItemBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ProductItemBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.product_item, root, attachToRoot, component);
    }

    public static ProductItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProductItemBinding inflate(LayoutInflater inflater, Object component) {
        return (ProductItemBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.product_item, null, false, component);
    }

    public static ProductItemBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProductItemBinding bind(View view, Object component) {
        return (ProductItemBinding) bind(component, view, C0893R.layout.product_item);
    }
}
