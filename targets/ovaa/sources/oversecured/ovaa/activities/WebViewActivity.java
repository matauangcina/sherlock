package oversecured.ovaa.activities;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;
import oversecured.ovaa.C1162R;
/* loaded from: classes8.dex */
public class WebViewActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C1162R.layout.activity_web_view);
        WebView webView = (WebView) findViewById(C1162R.C1165id.webview);
        setupWebView(webView);
        webView.loadUrl((String) Objects.requireNonNull(getIntent().getStringExtra("url")));
    }

    private void setupWebView(WebView webView) {
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
    }
}
