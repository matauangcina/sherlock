package p054b.p058b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import p054b.p058b.C1133c;
import p108c.p109a.p110c.p111a.C1515h;
import p108c.p109a.p110c.p111a.C1516i;
/* renamed from: b.b.d */
/* loaded from: classes.dex */
class C1135d {

    /* renamed from: a */
    private ValueCallback<Uri> f3840a;

    /* renamed from: b */
    private ValueCallback<Uri[]> f3841b;

    /* renamed from: d */
    WebView f3843d;

    /* renamed from: c */
    boolean f3842c = false;

    /* renamed from: e */
    C1141f f3844e = new C1141f();

    /* renamed from: b.b.d$a */
    /* loaded from: classes.dex */
    class View$OnKeyListenerC1136a implements View.OnKeyListener {
        View$OnKeyListenerC1136a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0 && i == 4) {
                if (C1135d.this.f3843d.canGoBack()) {
                    C1135d.this.f3843d.goBack();
                    return true;
                }
                C1135d.this.m4826h();
                return true;
            }
            return false;
        }
    }

    /* renamed from: b.b.d$b */
    /* loaded from: classes.dex */
    class C1137b implements C1133c.InterfaceC1134a {
        C1137b(C1135d c1135d) {
        }

        @Override // p054b.p058b.C1133c.InterfaceC1134a
        /* renamed from: a */
        public void mo4815a(int i, int i2, int i3, int i4) {
            HashMap hashMap = new HashMap();
            hashMap.put("yDirection", Double.valueOf(i2));
            C1131b.f3836c.m4036c("onScrollYChanged", hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("xDirection", Double.valueOf(i));
            C1131b.f3836c.m4036c("onScrollXChanged", hashMap2);
        }
    }

    /* renamed from: b.b.d$c */
    /* loaded from: classes.dex */
    class C1138c extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ Activity f3846a;

        C1138c(Activity activity) {
            this.f3846a = activity;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            if (C1135d.this.f3841b != null) {
                C1135d.this.f3841b.onReceiveValue(null);
            }
            C1135d.this.f3841b = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            Intent intent2 = new Intent("android.intent.action.CHOOSER");
            intent2.putExtra("android.intent.extra.INTENT", intent);
            intent2.putExtra("android.intent.extra.TITLE", "Image Chooser");
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[0]);
            this.f3846a.startActivityForResult(intent2, 1);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b.b.d$d */
    /* loaded from: classes.dex */
    public class C1139d implements ValueCallback<Boolean> {
        C1139d(C1135d c1135d) {
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
        }
    }

    /* renamed from: b.b.d$e */
    /* loaded from: classes.dex */
    class C1140e implements ValueCallback<String> {

        /* renamed from: a */
        final /* synthetic */ C1516i.InterfaceC1521d f3848a;

        C1140e(C1135d c1135d, C1516i.InterfaceC1521d interfaceC1521d) {
            this.f3848a = interfaceC1521d;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(String str) {
            this.f3848a.mo419c(str);
        }
    }

    /* renamed from: b.b.d$f */
    /* loaded from: classes.dex */
    class C1141f {
        C1141f() {
        }

        /* renamed from: a */
        public boolean m4812a(int i, int i2, Intent intent) {
            String dataString;
            if (Build.VERSION.SDK_INT >= 21) {
                if (i != 1) {
                    return false;
                }
                Uri[] uriArr = (i2 != -1 || (dataString = intent.getDataString()) == null) ? null : new Uri[]{Uri.parse(dataString)};
                if (C1135d.this.f3841b != null) {
                    C1135d.this.f3841b.onReceiveValue(uriArr);
                    C1135d.this.f3841b = null;
                }
            } else if (i != 1) {
                return false;
            } else {
                Uri data = (i2 != -1 || intent == null) ? null : intent.getData();
                if (C1135d.this.f3840a != null) {
                    C1135d.this.f3840a.onReceiveValue(data);
                    C1135d.this.f3840a = null;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1135d(Activity activity) {
        this.f3843d = new C1133c(activity);
        C1130a c1130a = new C1130a();
        this.f3843d.setOnKeyListener(new View$OnKeyListenerC1136a());
        ((C1133c) this.f3843d).setOnScrollChangedCallback(new C1137b(this));
        this.f3843d.setWebViewClient(c1130a);
        this.f3843d.setWebChromeClient(new C1138c(activity));
    }

    /* renamed from: f */
    private void m4828f() {
        this.f3843d.clearCache(true);
        this.f3843d.clearFormData();
    }

    /* renamed from: g */
    private void m4827g() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new C1139d(this));
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m4829e(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        WebView webView = this.f3843d;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.f3843d.goBack();
    }

    /* renamed from: h */
    void m4826h() {
        m4825i(null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m4825i(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        WebView webView = this.f3843d;
        if (webView != null) {
            ((ViewGroup) webView.getParent()).removeView(this.f3843d);
        }
        this.f3843d = null;
        if (interfaceC1521d != null) {
            interfaceC1521d.mo419c(null);
        }
        this.f3842c = true;
        C1131b.f3836c.m4036c("onDestroy", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m4824j(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        this.f3843d.evaluateJavascript((String) c1515h.m4040a("code"), new C1140e(this, interfaceC1521d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m4823k(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        WebView webView = this.f3843d;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.f3843d.goForward();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m4822l(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        WebView webView = this.f3843d;
        if (webView != null) {
            webView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m4821m(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Map<String, String> map, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f3843d.getSettings().setJavaScriptEnabled(z);
        this.f3843d.getSettings().setBuiltInZoomControls(z5);
        this.f3843d.getSettings().setSupportZoom(z5);
        this.f3843d.getSettings().setDomStorageEnabled(z6);
        this.f3843d.getSettings().setJavaScriptCanOpenWindowsAutomatically(z8);
        this.f3843d.getSettings().setSupportMultipleWindows(z8);
        this.f3843d.getSettings().setAppCacheEnabled(z9);
        this.f3843d.getSettings().setAllowFileAccessFromFileURLs(z10);
        this.f3843d.getSettings().setAllowUniversalAccessFromFileURLs(z10);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3843d.getSettings().setMixedContentMode(2);
        }
        if (z2) {
            m4828f();
        }
        if (z3) {
            this.f3843d.setVisibility(4);
        }
        if (z4) {
            m4827g();
        }
        if (str != null) {
            this.f3843d.getSettings().setUserAgentString(str);
        }
        if (!z7) {
            this.f3843d.setVerticalScrollBarEnabled(false);
        }
        WebView webView = this.f3843d;
        if (map != null) {
            webView.loadUrl(str2, map);
        } else {
            webView.loadUrl(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m4820n(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        WebView webView = this.f3843d;
        if (webView != null) {
            webView.reload();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m4819o(String str) {
        this.f3843d.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m4818p(FrameLayout.LayoutParams layoutParams) {
        this.f3843d.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m4817q(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        WebView webView = this.f3843d;
        if (webView != null) {
            webView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m4816r(C1515h c1515h, C1516i.InterfaceC1521d interfaceC1521d) {
        WebView webView = this.f3843d;
        if (webView != null) {
            webView.stopLoading();
        }
    }
}
