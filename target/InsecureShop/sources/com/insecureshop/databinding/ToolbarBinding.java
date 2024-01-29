package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class ToolbarBinding extends ViewDataBinding {
    public final TextView title;
    public final Toolbar toolbar;

    /* JADX INFO: Access modifiers changed from: protected */
    public ToolbarBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView title, Toolbar toolbar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.title = title;
        this.toolbar = toolbar;
    }

    public static ToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ToolbarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.toolbar, root, attachToRoot, component);
    }

    public static ToolbarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ToolbarBinding inflate(LayoutInflater inflater, Object component) {
        return (ToolbarBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.toolbar, null, false, component);
    }

    public static ToolbarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ToolbarBinding bind(View view, Object component) {
        return (ToolbarBinding) bind(component, view, C0893R.layout.toolbar);
    }
}
