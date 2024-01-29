package com.insecureshop.util;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Prefs.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006#"}, m19d2 = {"Lcom/insecureshop/util/Prefs;", "", "()V", "value", "", "data", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "password", "getPassword", "setPassword", "prefs", "getPrefs", "()Lcom/insecureshop/util/Prefs;", "setPrefs", "(Lcom/insecureshop/util/Prefs;)V", "productList", "getProductList", "setProductList", "sharedpreferences", "Landroid/content/SharedPreferences;", "getSharedpreferences", "()Landroid/content/SharedPreferences;", "setSharedpreferences", "(Landroid/content/SharedPreferences;)V", "username", "getUsername", "setUsername", "clearAll", "", "getInstance", "context", "Landroid/content/Context;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class Prefs {
    public static final Prefs INSTANCE = new Prefs();
    private static Prefs prefs;
    public static SharedPreferences sharedpreferences;

    private Prefs() {
    }

    public final SharedPreferences getSharedpreferences() {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        return sharedPreferences;
    }

    public final void setSharedpreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "<set-?>");
        sharedpreferences = sharedPreferences;
    }

    public final Prefs getPrefs() {
        return prefs;
    }

    public final void setPrefs(Prefs prefs2) {
        prefs = prefs2;
    }

    public final Prefs getInstance(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (prefs == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("Prefs", 0);
            Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "context.getSharedPrefere…s\", Context.MODE_PRIVATE)");
            sharedpreferences = sharedPreferences;
            prefs = this;
        }
        Prefs prefs2 = prefs;
        if (prefs2 == null) {
            Intrinsics.throwNpe();
        }
        return prefs2;
    }

    public final String getData() {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        return sharedPreferences.getString("data", "");
    }

    public final void setData(String value) {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        sharedPreferences.edit().putString("data", value).apply();
    }

    public final String getUsername() {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        return sharedPreferences.getString("username", "");
    }

    public final void setUsername(String value) {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        sharedPreferences.edit().putString("username", value).apply();
    }

    public final String getPassword() {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        return sharedPreferences.getString("password", "");
    }

    public final void setPassword(String value) {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        sharedPreferences.edit().putString("password", value).apply();
    }

    public final String getProductList() {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        return sharedPreferences.getString("productList", "");
    }

    public final void setProductList(String value) {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        sharedPreferences.edit().putString("productList", value).apply();
    }

    public final void clearAll() {
        SharedPreferences sharedPreferences = sharedpreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedpreferences");
        }
        sharedPreferences.edit().clear().apply();
    }
}
