package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class BaseMainBinding extends ViewDataBinding {
    public final FrameLayout container;
    public final LinearLayout linToolbar;
    public final ToolbarBinding toolbar;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseMainBinding(Object _bindingComponent, View _root, int _localFieldCount, FrameLayout container, LinearLayout linToolbar, ToolbarBinding toolbar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.container = container;
        this.linToolbar = linToolbar;
        this.toolbar = toolbar;
        setContainedBinding(toolbar);
    }

    public static BaseMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BaseMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (BaseMainBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.base_main, root, attachToRoot, component);
    }

    public static BaseMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BaseMainBinding inflate(LayoutInflater inflater, Object component) {
        return (BaseMainBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.base_main, null, false, component);
    }

    public static BaseMainBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BaseMainBinding bind(View view, Object component) {
        return (BaseMainBinding) bind(component, view, C0893R.layout.base_main);
    }
}
