package com.insecureshop;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.insecureshop.databinding.ActivityLoginBinding;
import com.insecureshop.util.Prefs;
import com.insecureshop.util.Util;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: LoginActivity.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0015J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m19d2 = {"Lcom/insecureshop/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mBinding", "Lcom/insecureshop/databinding/ActivityLoginBinding;", "getMBinding", "()Lcom/insecureshop/databinding/ActivityLoginBinding;", "setMBinding", "(Lcom/insecureshop/databinding/ActivityLoginBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onLogin", "view", "Landroid/view/View;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class LoginActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    public ActivityLoginBinding mBinding;

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

    public final ActivityLoginBinding getMBinding() {
        ActivityLoginBinding activityLoginBinding = this.mBinding;
        if (activityLoginBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        }
        return activityLoginBinding;
    }

    public final void setMBinding(ActivityLoginBinding activityLoginBinding) {
        Intrinsics.checkParameterIsNotNull(activityLoginBinding, "<set-?>");
        this.mBinding = activityLoginBinding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, C0893R.layout.activity_login);
        Intrinsics.checkExpressionValueIsNotNull(contentView, "DataBindingUtil.setConte… R.layout.activity_login)");
        this.mBinding = (ActivityLoginBinding) contentView;
        requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 100);
    }

    public final void onLogin(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        ActivityLoginBinding activityLoginBinding = this.mBinding;
        if (activityLoginBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        }
        TextInputEditText textInputEditText = activityLoginBinding.edtUserName;
        Intrinsics.checkExpressionValueIsNotNull(textInputEditText, "mBinding.edtUserName");
        String username = String.valueOf(textInputEditText.getText());
        ActivityLoginBinding activityLoginBinding2 = this.mBinding;
        if (activityLoginBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        }
        TextInputEditText textInputEditText2 = activityLoginBinding2.edtPassword;
        Intrinsics.checkExpressionValueIsNotNull(textInputEditText2, "mBinding.edtPassword");
        String password = String.valueOf(textInputEditText2.getText());
        Log.d("userName", username);
        Log.d("password", password);
        boolean auth = Util.INSTANCE.verifyUserNamePassword(username, password);
        if (auth) {
            Prefs prefs = Prefs.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
            prefs.getInstance(applicationContext).setUsername(username);
            Prefs prefs2 = Prefs.INSTANCE;
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext2, "applicationContext");
            prefs2.getInstance(applicationContext2).setPassword(password);
            Util.saveProductList$default(Util.INSTANCE, this, null, 2, null);
            Intent intent = new Intent(this, ProductListActivity.class);
            startActivity(intent);
            return;
        }
        for (PackageInfo info : getPackageManager().getInstalledPackages(0)) {
            String packageName = info.packageName;
            Intrinsics.checkExpressionValueIsNotNull(packageName, "packageName");
            if (StringsKt.startsWith$default(packageName, "com.insecureshopapp", false, 2, (Object) null)) {
                try {
                    Context packageContext = createPackageContext(packageName, 3);
                    Intrinsics.checkExpressionValueIsNotNull(packageContext, "packageContext");
                    Object value = packageContext.getClassLoader().loadClass("com.insecureshopapp.MainInterface").getMethod("getInstance", Context.class).invoke(null, this);
                    Intrinsics.checkExpressionValueIsNotNull(value, "packageContext.classLoad…      .invoke(null, this)");
                    Log.d("object_value", value.toString());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Toast.makeText(getApplicationContext(), "Invalid username and password", 1).show();
    }
}
