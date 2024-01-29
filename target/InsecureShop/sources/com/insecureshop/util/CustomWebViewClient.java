package com.insecureshop.util;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
/* compiled from: CustomWebViewClient.kt */
@Metadata(m21bv = {1, 0, 3}, m20d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m19d2 = {"Lcom/insecureshop/util/CustomWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "onReceivedSslError", "", "view", "Landroid/webkit/WebView;", "handler", "Landroid/webkit/SslErrorHandler;", "error", "Landroid/net/http/SslError;", "app_debug"}, m18k = 1, m17mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class CustomWebViewClient extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        if (handler != null) {
            handler.proceed();
        }
    }
}
