package p054b.p058b;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
/* renamed from: b.b.a */
/* loaded from: classes.dex */
public class C1130a extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        C1131b.f3836c.m4036c("onUrlChanged", hashMap);
        hashMap.put("type", "finishLoad");
        C1131b.f3836c.m4036c("onState", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("type", "startLoad");
        C1131b.f3836c.m4036c("onState", hashMap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        HashMap hashMap = new HashMap();
        hashMap.put("url", webResourceRequest.getUrl().toString());
        hashMap.put("code", Integer.toString(webResourceResponse.getStatusCode()));
        C1131b.f3836c.m4036c("onHttpError", hashMap);
    }
}
