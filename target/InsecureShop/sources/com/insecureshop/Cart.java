package com.insecureshop;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Cart.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u001f"}, m19d2 = {"Lcom/insecureshop/Cart;", "", "name", "", "url", "price", "rating", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPrice", "setPrice", "getRating", "()I", "setRating", "(I)V", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class Cart {
    private String name;
    private String price;
    private int rating;
    private String url;

    public static /* synthetic */ Cart copy$default(Cart cart, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cart.name;
        }
        if ((i2 & 2) != 0) {
            str2 = cart.url;
        }
        if ((i2 & 4) != 0) {
            str3 = cart.price;
        }
        if ((i2 & 8) != 0) {
            i = cart.rating;
        }
        return cart.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.price;
    }

    public final int component4() {
        return this.rating;
    }

    public final Cart copy(String name, String url, String price, int i) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(url, "url");
        Intrinsics.checkParameterIsNotNull(price, "price");
        return new Cart(name, url, price, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Cart) {
                Cart cart = (Cart) obj;
                return Intrinsics.areEqual(this.name, cart.name) && Intrinsics.areEqual(this.url, cart.url) && Intrinsics.areEqual(this.price, cart.price) && this.rating == cart.rating;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.price;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.rating;
    }

    public String toString() {
        return "Cart(name=" + this.name + ", url=" + this.url + ", price=" + this.price + ", rating=" + this.rating + ")";
    }

    public Cart(String name, String url, String price, int rating) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(url, "url");
        Intrinsics.checkParameterIsNotNull(price, "price");
        this.name = name;
        this.url = url;
        this.price = price;
        this.rating = rating;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getRating() {
        return this.rating;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setPrice(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.price = str;
    }

    public final void setRating(int i) {
        this.rating = i;
    }

    public final void setUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.url = str;
    }
}
