package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes.dex */
abstract class AbstractC1914e {

    /* renamed from: a */
    TextInputLayout f5687a;

    /* renamed from: b */
    Context f5688b;

    /* renamed from: c */
    CheckableImageButton f5689c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1914e(TextInputLayout textInputLayout) {
        this.f5687a = textInputLayout;
        this.f5688b = textInputLayout.getContext();
        this.f5689c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo2475a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2515b(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2514c() {
        return false;
    }
}
