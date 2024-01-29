package com.insecureshop;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.insecureshop.broadcast.ProductDetailBroadCast;
import com.insecureshop.util.Prefs;
import com.insecureshop.util.Util;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ProductListActivity.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m19d2 = {"Lcom/insecureshop/ProductListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "productDetailBroadCast", "Lcom/insecureshop/broadcast/ProductDetailBroadCast;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ProductListActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    private final ProductDetailBroadCast productDetailBroadCast = new ProductDetailBroadCast();

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Prefs prefs = Prefs.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
        if (TextUtils.isEmpty(prefs.getInstance(applicationContext).getUsername())) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
            return;
        }
        setContentView(C0893R.layout.activity_product_list);
        setSupportActionBar((Toolbar) _$_findCachedViewById(C0893R.C0896id.toolbar));
        IntentFilter intentFilter = new IntentFilter("com.insecureshop.action.PRODUCT_DETAIL");
        registerReceiver(this.productDetailBroadCast, intentFilter);
        ProductAdapter productAdapter = new ProductAdapter();
        RecyclerView recyclerview = (RecyclerView) _$_findCachedViewById(C0893R.C0896id.recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerview, "recyclerview");
        recyclerview.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        RecyclerView recyclerview2 = (RecyclerView) _$_findCachedViewById(C0893R.C0896id.recyclerview);
        Intrinsics.checkExpressionValueIsNotNull(recyclerview2, "recyclerview");
        recyclerview2.setAdapter(productAdapter);
        productAdapter.setProductList(Util.INSTANCE.getProductsPrefs(this));
        productAdapter.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0893R.C0898menu.main_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        super.onOptionsItemSelected(item);
        if (item.getItemId() == C0893R.C0896id.logout) {
            Prefs prefs = Prefs.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
            prefs.getInstance(applicationContext).clearAll();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
        if (item.getItemId() == C0893R.C0896id.cart) {
            Intent intent2 = new Intent(this, CartListActivity.class);
            startActivity(intent2);
        }
        if (item.getItemId() == C0893R.C0896id.about) {
            Intent intent3 = new Intent(this, AboutUsActivity.class);
            startActivity(intent3);
            return true;
        }
        return true;
    }
}
