package com.insecureshop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.insecureshop.util.CustomWebViewClient;
import com.insecureshop.util.Prefs;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: WebViewActivity.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m19d2 = {"Lcom/insecureshop/WebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "USER_AGENT", "", "getUSER_AGENT", "()Ljava/lang/String;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class WebViewActivity extends AppCompatActivity {
    private final String USER_AGENT = "Mozilla/5.0 (Linux; Android 4.1.1; Galaxy Nexus Build/JRO03C) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.65 Mobile Safari/537.36";
    private HashMap _$_findViewCache;

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

    public final String getUSER_AGENT() {
        return this.USER_AGENT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0893R.layout.activity_webview);
        setSupportActionBar((Toolbar) _$_findCachedViewById(C0893R.C0896id.toolbar));
        setTitle(getString(C0893R.string.webview));
        WebView webview = (WebView) findViewById(C0893R.C0896id.webview);
        Intrinsics.checkExpressionValueIsNotNull(webview, "webview");
        WebSettings settings = webview.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings, "webview.settings");
        settings.setJavaScriptEnabled(true);
        WebSettings settings2 = webview.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings2, "webview.settings");
        settings2.setLoadWithOverviewMode(true);
        WebSettings settings3 = webview.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings3, "webview.settings");
        settings3.setUseWideViewPort(true);
        WebSettings settings4 = webview.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings4, "webview.settings");
        settings4.setAllowUniversalAccessFromFileURLs(true);
        WebSettings settings5 = webview.getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings5, "webview.settings");
        settings5.setUserAgentString(this.USER_AGENT);
        webview.setWebViewClient(new CustomWebViewClient());
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Uri uri = intent.getData();
        if (uri != null) {
            String data = null;
            if (!StringsKt.equals$default(uri.getPath(), "/web", false, 2, null)) {
                if (StringsKt.equals$default(uri.getPath(), "/webview", false, 2, null)) {
                    Intent intent2 = getIntent();
                    Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
                    Uri data2 = intent2.getData();
                    if (data2 == null) {
                        Intrinsics.throwNpe();
                    }
                    String queryParameter = data2.getQueryParameter("url");
                    if (queryParameter == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(queryParameter, "intent.data!!.getQueryParameter(\"url\")!!");
                    if (StringsKt.endsWith$default(queryParameter, "insecureshopapp.com", false, 2, (Object) null)) {
                        Intent intent3 = getIntent();
                        Intrinsics.checkExpressionValueIsNotNull(intent3, "intent");
                        Uri data3 = intent3.getData();
                        data = data3 != null ? data3.getQueryParameter("url") : null;
                    }
                }
            } else {
                Intent intent4 = getIntent();
                Intrinsics.checkExpressionValueIsNotNull(intent4, "intent");
                Uri data4 = intent4.getData();
                data = data4 != null ? data4.getQueryParameter("url") : null;
            }
            if (data == null) {
                finish();
            }
            webview.loadUrl(data);
            Prefs.INSTANCE.getInstance(this).setData(data);
        }
    }
}
