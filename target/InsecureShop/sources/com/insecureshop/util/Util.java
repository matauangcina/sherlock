package com.insecureshop.util;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.insecureshop.ProductDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: Util.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e¨\u0006\u0019"}, m19d2 = {"Lcom/insecureshop/util/Util;", "", "()V", "getCartProduct", "Ljava/util/ArrayList;", "Lcom/insecureshop/ProductDetail;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "getProductList", "getProductsPrefs", "", "getUserCreds", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "saveProductList", "", "productList", "updateProductItem", "updateProductDetail", "verifyUserNamePassword", "", "username", "password", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class Util {
    public static final Util INSTANCE = new Util();

    private Util() {
    }

    private final HashMap<String, String> getUserCreds() {
        HashMap userCreds = new HashMap();
        userCreds.put("shopuser", "!ns3csh0p");
        return userCreds;
    }

    public final boolean verifyUserNamePassword(String username, String password) {
        Intrinsics.checkParameterIsNotNull(username, "username");
        Intrinsics.checkParameterIsNotNull(password, "password");
        if (getUserCreds().containsKey(username)) {
            String passwordValue = getUserCreds().get(username);
            return StringsKt.equals$default(passwordValue, password, false, 2, null);
        }
        return false;
    }

    private final ArrayList<ProductDetail> getProductList() {
        ArrayList productList = new ArrayList();
        productList.add(new ProductDetail(1, "Laptop", "https://images.pexels.com/photos/7974/pexels-photo.jpg", "80", 1, "https://www.insecureshopapp.com", 0, 64, null));
        productList.add(new ProductDetail(2, "Hat", "https://images.pexels.com/photos/984619/pexels-photo-984619.jpeg", "10", 2, "https://www.insecureshopapp.com", 0, 64, null));
        productList.add(new ProductDetail(3, "Sunglasses", "https://images.pexels.com/photos/343720/pexels-photo-343720.jpeg", "10", 4, "https://www.insecureshopapp.com", 0, 64, null));
        productList.add(new ProductDetail(4, "Watch", "https://images.pexels.com/photos/277390/pexels-photo-277390.jpeg", "30", 4, "https://www.insecureshopapp.com", 0, 64, null));
        productList.add(new ProductDetail(5, "Camera", "https://images.pexels.com/photos/225157/pexels-photo-225157.jpeg", "40", 2, "https://www.insecureshopapp.com", 0, 64, null));
        productList.add(new ProductDetail(6, "Perfumes", "https://images.pexels.com/photos/264819/pexels-photo-264819.jpeg", "10", 2, "https://www.insecureshopapp.com", 0, 64, null));
        productList.add(new ProductDetail(7, "Bagpack", "https://images.pexels.com/photos/532803/pexels-photo-532803.jpeg", "20", 2, "https://www.insecureshopapp.com", 0, 64, null));
        productList.add(new ProductDetail(8, "Jacket", "https://images.pexels.com/photos/789812/pexels-photo-789812.jpeg", "20", 2, "https://www.insecureshopapp.com", 0, 64, null));
        return productList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void saveProductList$default(Util util, Context context, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = util.getProductList();
        }
        util.saveProductList(context, list);
    }

    public final void saveProductList(Context context, List<ProductDetail> productList) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(productList, "productList");
        String productJson = new Gson().toJson(productList);
        Prefs.INSTANCE.getInstance(context).setProductList(productJson);
    }

    public final List<ProductDetail> getProductsPrefs(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String products = Prefs.INSTANCE.getInstance(context).getProductList();
        Object fromJson = new Gson().fromJson(products, new TypeToken<List<? extends ProductDetail>>() { // from class: com.insecureshop.util.Util$getProductsPrefs$1
        }.getType());
        Intrinsics.checkExpressionValueIsNotNull(fromJson, "Gson().fromJson(products…roductDetail>>() {}.type)");
        return (List) fromJson;
    }

    public final void updateProductItem(Context context, ProductDetail updateProductDetail) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(updateProductDetail, "updateProductDetail");
        List productList = getProductsPrefs(context);
        for (ProductDetail productDetail : productList) {
            if (productDetail.getId() == updateProductDetail.getId()) {
                productDetail.setQty(updateProductDetail.getQty());
            }
        }
        saveProductList(context, productList);
    }

    public final ArrayList<ProductDetail> getCartProduct(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ArrayList cartList = new ArrayList();
        List productList = getProductsPrefs(context);
        for (ProductDetail productDetail : productList) {
            if (productDetail.getQty() > 0) {
                cartList.add(productDetail);
            }
        }
        return cartList;
    }
}
