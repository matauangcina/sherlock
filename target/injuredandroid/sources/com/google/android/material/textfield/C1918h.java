package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p000a.p001a.p002k.p003a.C0010a;
import p054b.p059c.p060a.p075b.C1343e;
import p054b.p059c.p060a.p075b.C1347i;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.h */
/* loaded from: classes.dex */
public class C1918h extends AbstractC1914e {

    /* renamed from: d */
    private final TextWatcher f5716d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC1889f f5717e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC1890g f5718f;

    /* renamed from: com.google.android.material.textfield.h$a */
    /* loaded from: classes.dex */
    class C1919a implements TextWatcher {
        C1919a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C1918h c1918h = C1918h.this;
            c1918h.f5689c.setChecked(!c1918h.m2472f());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    /* loaded from: classes.dex */
    class C1920b implements TextInputLayout.InterfaceC1889f {
        C1920b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1889f
        /* renamed from: a */
        public void mo2471a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C1918h c1918h = C1918h.this;
            c1918h.f5689c.setChecked(!c1918h.m2472f());
            editText.removeTextChangedListener(C1918h.this.f5716d);
            editText.addTextChangedListener(C1918h.this.f5716d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    /* loaded from: classes.dex */
    class C1921c implements TextInputLayout.InterfaceC1890g {
        C1921c(C1918h c1918h) {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1890g
        /* renamed from: a */
        public void mo2470a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1922d implements View.OnClickListener {
        View$OnClickListenerC1922d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C1918h.this.f5687a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(C1918h.this.m2472f() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1918h(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5716d = new C1919a();
        this.f5717e = new C1920b();
        this.f5718f = new C1921c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public boolean m2472f() {
        EditText editText = this.f5687a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC1914e
    /* renamed from: a */
    public void mo2475a() {
        this.f5687a.setEndIconDrawable(C0010a.m9577d(this.f5688b, C1343e.design_password_eye));
        TextInputLayout textInputLayout = this.f5687a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1347i.password_toggle_content_description));
        this.f5687a.setEndIconOnClickListener(new View$OnClickListenerC1922d());
        this.f5687a.m2590c(this.f5717e);
        this.f5687a.m2588d(this.f5718f);
    }
}
