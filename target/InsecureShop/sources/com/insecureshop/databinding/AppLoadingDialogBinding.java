package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class AppLoadingDialogBinding extends ViewDataBinding {
    public final ImageView imageView2;
    public final TextView tvDescription;

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLoadingDialogBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView imageView2, TextView tvDescription) {
        super(_bindingComponent, _root, _localFieldCount);
        this.imageView2 = imageView2;
        this.tvDescription = tvDescription;
    }

    public static AppLoadingDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AppLoadingDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (AppLoadingDialogBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.app_loading_dialog, root, attachToRoot, component);
    }

    public static AppLoadingDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AppLoadingDialogBinding inflate(LayoutInflater inflater, Object component) {
        return (AppLoadingDialogBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.app_loading_dialog, null, false, component);
    }

    public static AppLoadingDialogBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AppLoadingDialogBinding bind(View view, Object component) {
        return (AppLoadingDialogBinding) bind(component, view, C0893R.layout.app_loading_dialog);
    }
}
