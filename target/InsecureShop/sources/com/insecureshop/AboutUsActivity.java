package com.insecureshop;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.insecureshop.util.Prefs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AboutUsActivity.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m19d2 = {"Lcom/insecureshop/AboutUsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "receiver", "Lcom/insecureshop/CustomReceiver;", "getReceiver", "()Lcom/insecureshop/CustomReceiver;", "setReceiver", "(Lcom/insecureshop/CustomReceiver;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSendData", "view", "Landroid/view/View;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class AboutUsActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    public CustomReceiver receiver;

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

    public final CustomReceiver getReceiver() {
        CustomReceiver customReceiver = this.receiver;
        if (customReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
        }
        return customReceiver;
    }

    public final void setReceiver(CustomReceiver customReceiver) {
        Intrinsics.checkParameterIsNotNull(customReceiver, "<set-?>");
        this.receiver = customReceiver;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0893R.layout.activity_about_us);
        CustomReceiver customReceiver = new CustomReceiver();
        this.receiver = customReceiver;
        if (customReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
        }
        registerReceiver(customReceiver, new IntentFilter("com.insecureshop.CUSTOM_INTENT"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CustomReceiver customReceiver = this.receiver;
        if (customReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("receiver");
        }
        unregisterReceiver(customReceiver);
        super.onDestroy();
    }

    public final void onSendData(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        String userName = Prefs.INSTANCE.getUsername();
        if (userName == null) {
            Intrinsics.throwNpe();
        }
        String password = Prefs.INSTANCE.getPassword();
        if (password == null) {
            Intrinsics.throwNpe();
        }
        Intent intent = new Intent("com.insecureshop.action.BROADCAST");
        intent.putExtra("username", userName);
        intent.putExtra("password", password);
        sendBroadcast(intent);
        TextView textView = (TextView) _$_findCachedViewById(C0893R.C0896id.textView);
        Intrinsics.checkExpressionValueIsNotNull(textView, "textView");
        textView.setText("InsecureShop is an intentionally designed vulnerable android app built in Kotlin.");
    }
}
