package b3nac.injuredandroid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.ActivityC0453c;
import androidx.appcompat.widget.Toolbar;
import p135d.p142s.p144d.C2725g;
/* loaded from: classes.dex */
public final class FlagTwelveProtectedActivity extends ActivityC0453c {
    /* renamed from: F */
    private final void m4091F() {
        startActivity(new Intent(this, FlagOneSuccess.class));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0453c, androidx.fragment.app.ActivityC0797d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0714e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setContentView(webView);
        ApplicationC1493j.f4523j.m4062a(this);
        m8078C((Toolbar) findViewById(R.id.toolbar));
        Uri parse = Uri.parse(getIntent().getStringExtra("totally_secure"));
        WebSettings settings = webView.getSettings();
        C2725g.m882d(settings, "flagWebView.settings");
        settings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        if (getIntent() == null || !getIntent().hasExtra("totally_secure")) {
            finish();
            return;
        }
        C2725g.m882d(parse, "uri");
        if (!C2725g.m885a("https", parse.getScheme())) {
            webView.loadData(getIntent().getStringExtra("totally_secure"), "text/html", "UTF-8");
            return;
        }
        FlagsOverview.f4483K = true;
        ApplicationC1493j applicationC1493j = new ApplicationC1493j();
        Context applicationContext = getApplicationContext();
        C2725g.m882d(applicationContext, "applicationContext");
        applicationC1493j.m4065b(applicationContext, "flagTwelveButtonColor", true);
        m4091F();
    }
}
