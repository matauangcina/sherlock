package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class CartItemBinding extends ViewDataBinding {
    public final CardView cardView;
    public final ImageView picture;
    public final TextView prodName;
    public final TextView prodPrice;
    public final TextView productCount;

    /* JADX INFO: Access modifiers changed from: protected */
    public CartItemBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView cardView, ImageView picture, TextView prodName, TextView prodPrice, TextView productCount) {
        super(_bindingComponent, _root, _localFieldCount);
        this.cardView = cardView;
        this.picture = picture;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.productCount = productCount;
    }

    public static CartItemBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CartItemBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (CartItemBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.cart_item, root, attachToRoot, component);
    }

    public static CartItemBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CartItemBinding inflate(LayoutInflater inflater, Object component) {
        return (CartItemBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.cart_item, null, false, component);
    }

    public static CartItemBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static CartItemBinding bind(View view, Object component) {
        return (CartItemBinding) bind(component, view, C0893R.layout.cart_item);
    }
}
