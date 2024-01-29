package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class FragmentHomeBinding extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount) {
        super(_bindingComponent, _root, _localFieldCount);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentHomeBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.fragment_home, root, attachToRoot, component);
    }

    public static FragmentHomeBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentHomeBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.fragment_home, null, false, component);
    }

    public static FragmentHomeBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentHomeBinding bind(View view, Object component) {
        return (FragmentHomeBinding) bind(component, view, C0893R.layout.fragment_home);
    }
}
