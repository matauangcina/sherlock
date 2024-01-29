package com.insecureshop;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ProductDetail.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006+"}, m19d2 = {"Lcom/insecureshop/ProductDetail;", "", "id", "", "name", "", "imageUrl", "price", "rating", "url", "qty", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getId", "()I", "setId", "(I)V", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "getName", "setName", "getPrice", "setPrice", "getQty", "setQty", "getRating", "setRating", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ProductDetail {

    /* renamed from: id */
    private int f91id;
    private String imageUrl;
    private String name;
    private String price;
    private int qty;
    private int rating;
    private String url;

    public static /* synthetic */ ProductDetail copy$default(ProductDetail productDetail, int i, String str, String str2, String str3, int i2, String str4, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = productDetail.f91id;
        }
        if ((i4 & 2) != 0) {
            str = productDetail.name;
        }
        String str5 = str;
        if ((i4 & 4) != 0) {
            str2 = productDetail.imageUrl;
        }
        String str6 = str2;
        if ((i4 & 8) != 0) {
            str3 = productDetail.price;
        }
        String str7 = str3;
        if ((i4 & 16) != 0) {
            i2 = productDetail.rating;
        }
        int i5 = i2;
        if ((i4 & 32) != 0) {
            str4 = productDetail.url;
        }
        String str8 = str4;
        if ((i4 & 64) != 0) {
            i3 = productDetail.qty;
        }
        return productDetail.copy(i, str5, str6, str7, i5, str8, i3);
    }

    public final int component1() {
        return this.f91id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.price;
    }

    public final int component5() {
        return this.rating;
    }

    public final String component6() {
        return this.url;
    }

    public final int component7() {
        return this.qty;
    }

    public final ProductDetail copy(int i, String name, String imageUrl, String price, int i2, String url, int i3) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(imageUrl, "imageUrl");
        Intrinsics.checkParameterIsNotNull(price, "price");
        Intrinsics.checkParameterIsNotNull(url, "url");
        return new ProductDetail(i, name, imageUrl, price, i2, url, i3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetail) {
                ProductDetail productDetail = (ProductDetail) obj;
                return this.f91id == productDetail.f91id && Intrinsics.areEqual(this.name, productDetail.name) && Intrinsics.areEqual(this.imageUrl, productDetail.imageUrl) && Intrinsics.areEqual(this.price, productDetail.price) && this.rating == productDetail.rating && Intrinsics.areEqual(this.url, productDetail.url) && this.qty == productDetail.qty;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f91id * 31;
        String str = this.name;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.imageUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.price;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.rating) * 31;
        String str4 = this.url;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.qty;
    }

    public String toString() {
        return "ProductDetail(id=" + this.f91id + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ", price=" + this.price + ", rating=" + this.rating + ", url=" + this.url + ", qty=" + this.qty + ")";
    }

    public ProductDetail(int id, String name, String imageUrl, String price, int rating, String url, int qty) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(imageUrl, "imageUrl");
        Intrinsics.checkParameterIsNotNull(price, "price");
        Intrinsics.checkParameterIsNotNull(url, "url");
        this.f91id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
        this.rating = rating;
        this.url = url;
        this.qty = qty;
    }

    public final int getId() {
        return this.f91id;
    }

    public final void setId(int i) {
        this.f91id = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setImageUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.imageUrl = str;
    }

    public final String getPrice() {
        return this.price;
    }

    public final void setPrice(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.price = str;
    }

    public final int getRating() {
        return this.rating;
    }

    public final void setRating(int i) {
        this.rating = i;
    }

    public /* synthetic */ ProductDetail(int i, String str, String str2, String str3, int i2, String str4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, i2, (i4 & 32) != 0 ? "https://www.insecureshopapp.com" : str4, (i4 & 64) != 0 ? 0 : i3);
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.url = str;
    }

    public final int getQty() {
        return this.qty;
    }

    public final void setQty(int i) {
        this.qty = i;
    }
}
