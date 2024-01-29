package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1343e;
import p054b.p059c.p060a.p075b.C1347i;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p078l.C1350a;
import p054b.p059c.p060a.p075b.p084q.C1377a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes.dex */
public class C1903d extends AbstractC1914e {

    /* renamed from: o */
    private static final boolean f5663o;

    /* renamed from: d */
    private final TextWatcher f5664d;

    /* renamed from: e */
    private final TextInputLayout.C1888e f5665e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC1889f f5666f;

    /* renamed from: g */
    private boolean f5667g;

    /* renamed from: h */
    private boolean f5668h;

    /* renamed from: i */
    private long f5669i;

    /* renamed from: j */
    private StateListDrawable f5670j;

    /* renamed from: k */
    private C1315g f5671k;

    /* renamed from: l */
    private AccessibilityManager f5672l;

    /* renamed from: m */
    private ValueAnimator f5673m;

    /* renamed from: n */
    private ValueAnimator f5674n;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* loaded from: classes.dex */
    class C1904a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* loaded from: classes.dex */
        class RunnableC1905a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ AutoCompleteTextView f5676f;

            RunnableC1905a(AutoCompleteTextView autoCompleteTextView) {
                this.f5676f = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f5676f.isPopupShowing();
                C1903d.this.m2518z(isPopupShowing);
                C1903d.this.f5667g = isPopupShowing;
            }
        }

        C1904a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C1903d c1903d = C1903d.this;
            AutoCompleteTextView m2523u = c1903d.m2523u(c1903d.f5687a.getEditText());
            m2523u.post(new RunnableC1905a(m2523u));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    /* loaded from: classes.dex */
    class C1906b extends TextInputLayout.C1888e {
        C1906b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C1888e, p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            super.mo2517g(view, c0217c);
            c0217c.m8777W(Spinner.class.getName());
            if (c0217c.m8790J()) {
                c0217c.m8756i0(null);
            }
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: h */
        public void mo2516h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2516h(view, accessibilityEvent);
            C1903d c1903d = C1903d.this;
            AutoCompleteTextView m2523u = c1903d.m2523u(c1903d.f5687a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C1903d.this.f5672l.isTouchExplorationEnabled()) {
                C1903d.this.m2541C(m2523u);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* loaded from: classes.dex */
    class C1907c implements TextInputLayout.InterfaceC1889f {
        C1907c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC1889f
        /* renamed from: a */
        public void mo2471a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m2523u = C1903d.this.m2523u(textInputLayout.getEditText());
            C1903d.this.m2543A(m2523u);
            C1903d.this.m2526r(m2523u);
            C1903d.this.m2542B(m2523u);
            m2523u.setThreshold(0);
            m2523u.removeTextChangedListener(C1903d.this.f5664d);
            m2523u.addTextChangedListener(C1903d.this.f5664d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C1903d.this.f5665e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1908d implements View.OnClickListener {
        View$OnClickListenerC1908d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1903d.this.m2541C((AutoCompleteTextView) C1903d.this.f5687a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$e */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC1909e implements View.OnTouchListener {

        /* renamed from: f */
        final /* synthetic */ AutoCompleteTextView f5681f;

        View$OnTouchListenerC1909e(AutoCompleteTextView autoCompleteTextView) {
            this.f5681f = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C1903d.this.m2519y()) {
                    C1903d.this.f5667g = false;
                }
                C1903d.this.m2541C(this.f5681f);
                view.performClick();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$f */
    /* loaded from: classes.dex */
    public class View$OnFocusChangeListenerC1910f implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1910f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C1903d.this.f5687a.setEndIconActivated(z);
            if (z) {
                return;
            }
            C1903d.this.m2518z(false);
            C1903d.this.f5667g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$g */
    /* loaded from: classes.dex */
    public class C1911g implements AutoCompleteTextView.OnDismissListener {
        C1911g() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C1903d.this.f5667g = true;
            C1903d.this.f5669i = System.currentTimeMillis();
            C1903d.this.m2518z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$h */
    /* loaded from: classes.dex */
    public class C1912h extends AnimatorListenerAdapter {
        C1912h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1903d c1903d = C1903d.this;
            c1903d.f5689c.setChecked(c1903d.f5668h);
            C1903d.this.f5674n.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$i */
    /* loaded from: classes.dex */
    public class C1913i implements ValueAnimator.AnimatorUpdateListener {
        C1913i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C1903d.this.f5689c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static {
        f5663o = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1903d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5664d = new C1904a();
        this.f5665e = new C1906b(this.f5687a);
        this.f5666f = new C1907c();
        this.f5667g = false;
        this.f5668h = false;
        this.f5669i = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m2543A(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f5663o) {
            int boxBackgroundMode = this.f5687a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f5671k;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.f5670j;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m2542B(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View$OnTouchListenerC1909e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new View$OnFocusChangeListenerC1910f());
        if (f5663o) {
            autoCompleteTextView.setOnDismissListener(new C1911g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m2541C(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m2519y()) {
            this.f5667g = false;
        }
        if (this.f5667g) {
            this.f5667g = false;
            return;
        }
        if (f5663o) {
            m2518z(!this.f5668h);
        } else {
            this.f5668h = !this.f5668h;
            this.f5689c.toggle();
        }
        if (!this.f5668h) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m2526r(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f5687a.getBoxBackgroundMode();
        C1315g boxBackground = this.f5687a.getBoxBackground();
        int m4289c = C1377a.m4289c(autoCompleteTextView, C1338b.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            m2524t(autoCompleteTextView, m4289c, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m2525s(autoCompleteTextView, m4289c, iArr, boxBackground);
        }
    }

    /* renamed from: s */
    private void m2525s(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C1315g c1315g) {
        int boxBackgroundColor = this.f5687a.getBoxBackgroundColor();
        int[] iArr2 = {C1377a.m4286f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f5663o) {
            C0252s.m8619i0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c1315g, c1315g));
            return;
        }
        C1315g c1315g2 = new C1315g(c1315g.m4562B());
        c1315g2.m4544T(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c1315g, c1315g2});
        int m8661B = C0252s.m8661B(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m8662A = C0252s.m8662A(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0252s.m8619i0(autoCompleteTextView, layerDrawable);
        C0252s.m8599s0(autoCompleteTextView, m8661B, paddingTop, m8662A, paddingBottom);
    }

    /* renamed from: t */
    private void m2524t(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C1315g c1315g) {
        LayerDrawable layerDrawable;
        int m4289c = C1377a.m4289c(autoCompleteTextView, C1338b.colorSurface);
        C1315g c1315g2 = new C1315g(c1315g.m4562B());
        int m4286f = C1377a.m4286f(i, m4289c, 0.1f);
        c1315g2.m4544T(new ColorStateList(iArr, new int[]{m4286f, 0}));
        if (f5663o) {
            c1315g2.setTint(m4289c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m4286f, m4289c});
            C1315g c1315g3 = new C1315g(c1315g.m4562B());
            c1315g3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c1315g2, c1315g3), c1315g});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c1315g2, c1315g});
        }
        C0252s.m8619i0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public AutoCompleteTextView m2523u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: v */
    private ValueAnimator m2522v(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1350a.f4230a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new C1913i());
        return ofFloat;
    }

    /* renamed from: w */
    private C1315g m2521w(float f, float f2, float f3, int i) {
        C1322k.C1324b m4498a = C1322k.m4498a();
        m4498a.m4444z(f);
        m4498a.m4471D(f);
        m4498a.m4452r(f2);
        m4498a.m4448v(f2);
        C1322k m4457m = m4498a.m4457m();
        C1315g m4521l = C1315g.m4521l(this.f5688b, f3);
        m4521l.setShapeAppearanceModel(m4457m);
        m4521l.m4542V(0, i, 0, i);
        return m4521l;
    }

    /* renamed from: x */
    private void m2520x() {
        this.f5674n = m2522v(67, 0.0f, 1.0f);
        ValueAnimator m2522v = m2522v(50, 1.0f, 0.0f);
        this.f5673m = m2522v;
        m2522v.addListener(new C1912h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m2519y() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5669i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m2518z(boolean z) {
        if (this.f5668h != z) {
            this.f5668h = z;
            this.f5674n.cancel();
            this.f5673m.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC1914e
    /* renamed from: a */
    public void mo2475a() {
        float dimensionPixelOffset = this.f5688b.getResources().getDimensionPixelOffset(C1342d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f5688b.getResources().getDimensionPixelOffset(C1342d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f5688b.getResources().getDimensionPixelOffset(C1342d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1315g m2521w = m2521w(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1315g m2521w2 = m2521w(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f5671k = m2521w;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f5670j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, m2521w);
        this.f5670j.addState(new int[0], m2521w2);
        this.f5687a.setEndIconDrawable(C0010a.m9577d(this.f5688b, f5663o ? C1343e.mtrl_dropdown_arrow : C1343e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f5687a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1347i.exposed_dropdown_menu_content_description));
        this.f5687a.setEndIconOnClickListener(new View$OnClickListenerC1908d());
        this.f5687a.m2590c(this.f5666f);
        m2520x();
        C0252s.m8605p0(this.f5689c, 2);
        this.f5672l = (AccessibilityManager) this.f5688b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC1914e
    /* renamed from: b */
    public boolean mo2515b(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC1914e
    /* renamed from: c */
    public boolean mo2514c() {
        return true;
    }
}
