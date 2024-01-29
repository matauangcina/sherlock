package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class ActivityMainBinding extends ViewDataBinding {
    public final BottomNavigationView bottomNavigation;
    public final FrameLayout container;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount, BottomNavigationView bottomNavigation, FrameLayout container) {
        super(_bindingComponent, _root, _localFieldCount);
        this.bottomNavigation = bottomNavigation;
        this.container = container;
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_main, root, attachToRoot, component);
    }

    public static ActivityMainBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityMainBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_main, null, false, component);
    }

    public static ActivityMainBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityMainBinding bind(View view, Object component) {
        return (ActivityMainBinding) bind(component, view, C0893R.layout.activity_main);
    }
}
