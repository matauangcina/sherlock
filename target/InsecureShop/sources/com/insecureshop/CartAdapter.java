package com.insecureshop;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.insecureshop.databinding.CartItemBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CartAdapter.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, m19d2 = {"Lcom/insecureshop/CartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/insecureshop/CartAdapter$CartViewHolder;", "()V", "cartList", "", "Lcom/insecureshop/ProductDetail;", "getCartList", "()Ljava/util/List;", "setCartList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CartViewHolder", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {
    private List<ProductDetail> cartList = new ArrayList();

    public final List<ProductDetail> getCartList() {
        return this.cartList;
    }

    public final void setCartList(List<ProductDetail> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.cartList = list;
    }

    /* compiled from: CartAdapter.kt */
    @Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\t"}, m19d2 = {"Lcom/insecureshop/CartAdapter$CartViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/insecureshop/databinding/CartItemBinding;", "(Lcom/insecureshop/databinding/CartItemBinding;)V", "mBinding", "getMBinding", "()Lcom/insecureshop/databinding/CartItemBinding;", "setMBinding", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class CartViewHolder extends RecyclerView.ViewHolder {
        private CartItemBinding mBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CartViewHolder(CartItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkParameterIsNotNull(binding, "binding");
            this.mBinding = binding;
        }

        public final CartItemBinding getMBinding() {
            return this.mBinding;
        }

        public final void setMBinding(CartItemBinding cartItemBinding) {
            Intrinsics.checkParameterIsNotNull(cartItemBinding, "<set-?>");
            this.mBinding = cartItemBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkParameterIsNotNull(parent, "parent");
        CartItemBinding binding = CartItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        Intrinsics.checkExpressionValueIsNotNull(binding, "CartItemBinding.inflate(…ter.from(parent.context))");
        return new CartViewHolder(binding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cartList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(CartViewHolder holder, int position) {
        Intrinsics.checkParameterIsNotNull(holder, "holder");
        ProductDetail prodDetail = this.cartList.get(position);
        ImageView imageView = holder.getMBinding().picture;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "holder.mBinding.picture");
        Glide.with(imageView.getContext()).load(prodDetail.getImageUrl()).into(holder.getMBinding().picture);
        TextView textView = holder.getMBinding().prodName;
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mBinding.prodName");
        textView.setText(prodDetail.getName());
        TextView textView2 = holder.getMBinding().prodPrice;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mBinding.prodPrice");
        textView2.setText("$ " + prodDetail.getPrice());
        TextView textView3 = holder.getMBinding().productCount;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mBinding.productCount");
        textView3.setText(" Qty : " + prodDetail.getQty());
    }
}
