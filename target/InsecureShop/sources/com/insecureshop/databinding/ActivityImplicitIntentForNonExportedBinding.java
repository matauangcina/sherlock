package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class ActivityImplicitIntentForNonExportedBinding extends ViewDataBinding {
    public final Button logout;
    public final Toolbar toolbar;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityImplicitIntentForNonExportedBinding(Object _bindingComponent, View _root, int _localFieldCount, Button logout, Toolbar toolbar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.logout = logout;
        this.toolbar = toolbar;
    }

    public static ActivityImplicitIntentForNonExportedBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityImplicitIntentForNonExportedBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityImplicitIntentForNonExportedBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_implicit_intent_for_non_exported, root, attachToRoot, component);
    }

    public static ActivityImplicitIntentForNonExportedBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityImplicitIntentForNonExportedBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityImplicitIntentForNonExportedBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_implicit_intent_for_non_exported, null, false, component);
    }

    public static ActivityImplicitIntentForNonExportedBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityImplicitIntentForNonExportedBinding bind(View view, Object component) {
        return (ActivityImplicitIntentForNonExportedBinding) bind(component, view, C0893R.layout.activity_implicit_intent_for_non_exported);
    }
}
