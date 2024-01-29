package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class ActivityLoginBinding extends ViewDataBinding {
    public final AppCompatButton btnLogin;
    public final TextInputEditText edtPassword;
    public final TextInputEditText edtUserName;
    public final AppCompatImageView ivTop;
    public final AppCompatTextView lableLogin;
    public final TextInputLayout textInputPassword;
    public final TextInputLayout textInputUserName;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatButton btnLogin, TextInputEditText edtPassword, TextInputEditText edtUserName, AppCompatImageView ivTop, AppCompatTextView lableLogin, TextInputLayout textInputPassword, TextInputLayout textInputUserName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnLogin = btnLogin;
        this.edtPassword = edtPassword;
        this.edtUserName = edtUserName;
        this.ivTop = ivTop;
        this.lableLogin = lableLogin;
        this.textInputPassword = textInputPassword;
        this.textInputUserName = textInputUserName;
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityLoginBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ActivityLoginBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_login, root, attachToRoot, component);
    }

    public static ActivityLoginBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityLoginBinding inflate(LayoutInflater inflater, Object component) {
        return (ActivityLoginBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.activity_login, null, false, component);
    }

    public static ActivityLoginBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityLoginBinding bind(View view, Object component) {
        return (ActivityLoginBinding) bind(component, view, C0893R.layout.activity_login);
    }
}
