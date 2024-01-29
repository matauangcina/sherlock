package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.C0893R;
/* loaded from: classes.dex */
public abstract class UploadSuccessDialogBinding extends ViewDataBinding {
    public final AppCompatButton btnOk;
    public final AppCompatTextView tvMessage;
    public final AppCompatTextView tvSuccess;

    /* JADX INFO: Access modifiers changed from: protected */
    public UploadSuccessDialogBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatButton btnOk, AppCompatTextView tvMessage, AppCompatTextView tvSuccess) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnOk = btnOk;
        this.tvMessage = tvMessage;
        this.tvSuccess = tvSuccess;
    }

    public static UploadSuccessDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static UploadSuccessDialogBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (UploadSuccessDialogBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.upload_success_dialog, root, attachToRoot, component);
    }

    public static UploadSuccessDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static UploadSuccessDialogBinding inflate(LayoutInflater inflater, Object component) {
        return (UploadSuccessDialogBinding) ViewDataBinding.inflateInternal(inflater, C0893R.layout.upload_success_dialog, null, false, component);
    }

    public static UploadSuccessDialogBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static UploadSuccessDialogBinding bind(View view, Object component) {
        return (UploadSuccessDialogBinding) bind(component, view, C0893R.layout.upload_success_dialog);
    }
}
