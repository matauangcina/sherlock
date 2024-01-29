package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p000a.p001a.p002k.p003a.C0010a;
import p054b.p059c.p060a.p075b.C1343e;
import p054b.p059c.p060a.p075b.C1347i;
import p054b.p059c.p060a.p075b.p078l.C1350a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public class C1893a extends AbstractC1914e {

    /* renamed from: d */
    private final TextWatcher f5649d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC1889f f5650e;

    /* renamed from: f */
    private AnimatorSet f5651f;

    /* renamed from: g */
    private ValueAnimator f5652g;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes.dex */
    class C1894a implements TextWatcher {
        C1894a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!C1893a.m2554j(editable)) {
                C1893a.this.f5651f.cancel();
                C1893a.this.f5652g.start();
            } else if (C1893a.this.f5687a.m2616E()) {
            } else {
                C1893a.this.f5652g.cancel();
                C1893a.this.f5651f.start();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes.dex */
    class C1895b implements TextInputLayout.InterfaceC1889f {
        C1895b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1889f
        /* renamed from: a */
        public void mo2471a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C1893a.m2554j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C1893a.this.f5649d);
            editText.addTextChangedListener(C1893a.this.f5649d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1896c implements View.OnClickListener {
        View$OnClickListenerC1896c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1893a.this.f5687a.getEditText().setText((CharSequence) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes.dex */
    public class C1897d extends AnimatorListenerAdapter {
        C1897d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1893a.this.f5687a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes.dex */
    public class C1898e extends AnimatorListenerAdapter {
        C1898e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1893a.this.f5687a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes.dex */
    public class C1899f implements ValueAnimator.AnimatorUpdateListener {
        C1899f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C1893a.this.f5689c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes.dex */
    public class C1900g implements ValueAnimator.AnimatorUpdateListener {
        C1900g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1893a.this.f5689c.setScaleX(floatValue);
            C1893a.this.f5689c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1893a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5649d = new C1894a();
        this.f5650e = new C1895b();
    }

    /* renamed from: h */
    private ValueAnimator m2556h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1350a.f4230a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C1899f());
        return ofFloat;
    }

    /* renamed from: i */
    private ValueAnimator m2555i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C1350a.f4233d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C1900g());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m2554j(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: k */
    private void m2553k() {
        ValueAnimator m2555i = m2555i();
        ValueAnimator m2556h = m2556h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5651f = animatorSet;
        animatorSet.playTogether(m2555i, m2556h);
        this.f5651f.addListener(new C1897d());
        ValueAnimator m2556h2 = m2556h(1.0f, 0.0f);
        this.f5652g = m2556h2;
        m2556h2.addListener(new C1898e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC1914e
    /* renamed from: a */
    public void mo2475a() {
        this.f5687a.setEndIconDrawable(C0010a.m9577d(this.f5688b, C1343e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f5687a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1347i.clear_text_end_icon_content_description));
        this.f5687a.setEndIconOnClickListener(new View$OnClickListenerC1896c());
        this.f5687a.m2590c(this.f5650e);
        m2553k();
    }
}
