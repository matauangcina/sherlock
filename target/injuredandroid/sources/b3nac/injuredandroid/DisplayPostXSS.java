package b3nac.injuredandroid;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.ActivityC0453c;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class DisplayPostXSS extends ActivityC0453c {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setContentView(webView);
        String stringExtra = getIntent().getStringExtra("com.b3nac.injuredandroid.DisplayPostXSS");
        WebSettings settings = webView.getSettings();
        C2725g.m882d(settings, "vulnWebView.settings");
        settings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadData(stringExtra, "text/html", "UTF-8");
    }
}
