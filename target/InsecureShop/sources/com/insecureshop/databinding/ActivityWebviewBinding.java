package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class ActivityWebviewBinding extends ViewDataBinding {
    public final Toolbar toolbar;
    public final WebView webview;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityWebviewBinding(Object _bindingComponent, View _root, int _localFieldCount, Toolbar toolbar, WebView webview) {
        super(_bindingComponent, _root, _localFieldCount);
        this.toolbar = toolbar;
        this.webview = webview;
    }

    public static ActivityWebviewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityWebviewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityWebviewBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_webview, root, attachToRoot, component);
    }

    public static ActivityWebviewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityWebviewBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityWebviewBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_webview, null, false, component);
    }

    public static ActivityWebviewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityWebviewBinding bind(View view, Object component) {
        return (ActivityWebviewBinding) bind(component, view, C0893R.layout.activity_webview);
    }
}
