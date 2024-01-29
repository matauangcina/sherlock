package com.insecureshop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.insecureshop.databinding.ProductItemBinding;
import com.insecureshop.util.Util;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ProductAdapter.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, m19d2 = {"Lcom/insecureshop/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/insecureshop/ProductAdapter$ProductViewHolder;", "()V", "productList", "", "Lcom/insecureshop/ProductDetail;", "getProductList", "()Ljava/util/List;", "setProductList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductViewHolder", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private List<ProductDetail> productList = new ArrayList();

    public final List<ProductDetail> getProductList() {
        return this.productList;
    }

    public final void setProductList(List<ProductDetail> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.productList = list;
    }

    /* compiled from: ProductAdapter.kt */
    @Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\t"}, m19d2 = {"Lcom/insecureshop/ProductAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/insecureshop/databinding/ProductItemBinding;", "(Lcom/insecureshop/databinding/ProductItemBinding;)V", "mBinding", "getMBinding", "()Lcom/insecureshop/databinding/ProductItemBinding;", "setMBinding", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
    /* loaded from: classes.dex */
    public static final class ProductViewHolder extends RecyclerView.ViewHolder {
        private ProductItemBinding mBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductViewHolder(ProductItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkParameterIsNotNull(binding, "binding");
            this.mBinding = binding;
        }

        public final ProductItemBinding getMBinding() {
            return this.mBinding;
        }

        public final void setMBinding(ProductItemBinding productItemBinding) {
            Intrinsics.checkParameterIsNotNull(productItemBinding, "<set-?>");
            this.mBinding = productItemBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkParameterIsNotNull(parent, "parent");
        ProductItemBinding binding = ProductItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        Intrinsics.checkExpressionValueIsNotNull(binding, "ProductItemBinding.infla…ter.from(parent.context))");
        return new ProductViewHolder(binding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.productList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ProductViewHolder holder, int position) {
        Intrinsics.checkParameterIsNotNull(holder, "holder");
        final ProductDetail prodDetail = this.productList.get(position);
        View root = holder.getMBinding().getRoot();
        Intrinsics.checkExpressionValueIsNotNull(root, "holder.mBinding.root");
        final Context context = root.getContext();
        ImageView imageView = holder.getMBinding().picture;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "holder.mBinding.picture");
        Glide.with(imageView.getContext()).load(prodDetail.getImageUrl()).placeholder(ContextCompat.getDrawable(context, C0893R.mipmap.ic_launcher)).into(holder.getMBinding().picture);
        TextView textView = holder.getMBinding().prodName;
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mBinding.prodName");
        textView.setText(prodDetail.getName());
        TextView textView2 = holder.getMBinding().productCount;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mBinding.productCount");
        textView2.setText(String.valueOf(prodDetail.getQty()));
        TextView textView3 = holder.getMBinding().prodPrice;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mBinding.prodPrice");
        textView3.setText("$ " + prodDetail.getPrice());
        holder.getMBinding().icAdd.setOnClickListener(new View.OnClickListener() { // from class: com.insecureshop.ProductAdapter$onBindViewHolder$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                ProductDetail productDetail = ProductDetail.this;
                productDetail.setQty(productDetail.getQty() + 1);
                TextView textView4 = holder.getMBinding().productCount;
                Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.mBinding.productCount");
                textView4.setText(String.valueOf(ProductDetail.this.getQty()));
                Util util = Util.INSTANCE;
                Context context2 = context;
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                util.updateProductItem(context2, ProductDetail.this);
            }
        });
        holder.getMBinding().icRemove.setOnClickListener(new View.OnClickListener() { // from class: com.insecureshop.ProductAdapter$onBindViewHolder$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                if (ProductDetail.this.getQty() > 0) {
                    ProductDetail productDetail = ProductDetail.this;
                    productDetail.setQty(productDetail.getQty() - 1);
                    TextView textView4 = holder.getMBinding().productCount;
                    Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.mBinding.productCount");
                    textView4.setText(String.valueOf(ProductDetail.this.getQty()));
                    Util util = Util.INSTANCE;
                    Context context2 = context;
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    util.updateProductItem(context2, ProductDetail.this);
                }
            }
        });
        holder.getMBinding().moreInfo.setOnClickListener(new View.OnClickListener() { // from class: com.insecureshop.ProductAdapter$onBindViewHolder$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                Intent intent = new Intent("com.insecureshop.action.PRODUCT_DETAIL");
                intent.putExtra("url", ProductDetail.this.getUrl());
                context.sendBroadcast(intent);
            }
        });
    }
}
