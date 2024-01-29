package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0593e0;
import androidx.appcompat.widget.C0608j;
import androidx.appcompat.widget.C0665w0;
import androidx.appcompat.widget.C0674z;
import androidx.core.content.C0734a;
import androidx.core.graphics.drawable.C0759a;
import androidx.core.widget.C0779i;
import com.google.android.material.internal.C1840a;
import com.google.android.material.internal.C1842b;
import com.google.android.material.internal.C1851g;
import com.google.android.material.internal.C1852h;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.C0195a;
import p000a.p019g.p028k.C0240g;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p032i.p033a.AbstractC0280a;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1341c;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.C1346h;
import p054b.p059c.p060a.p075b.C1347i;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p078l.C1350a;
import p054b.p059c.p060a.p075b.p084q.C1377a;
import p054b.p059c.p060a.p075b.p091x.C1388c;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: w0 */
    private static final int f5575w0 = C1348j.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private final int f5576A;

    /* renamed from: B */
    private int f5577B;

    /* renamed from: C */
    private final int f5578C;

    /* renamed from: D */
    private final int f5579D;

    /* renamed from: E */
    private int f5580E;

    /* renamed from: F */
    private int f5581F;

    /* renamed from: G */
    private final Rect f5582G;

    /* renamed from: H */
    private final Rect f5583H;

    /* renamed from: I */
    private final RectF f5584I;

    /* renamed from: J */
    private Typeface f5585J;

    /* renamed from: K */
    private final CheckableImageButton f5586K;

    /* renamed from: L */
    private ColorStateList f5587L;

    /* renamed from: M */
    private boolean f5588M;

    /* renamed from: N */
    private PorterDuff.Mode f5589N;

    /* renamed from: O */
    private boolean f5590O;

    /* renamed from: P */
    private Drawable f5591P;

    /* renamed from: Q */
    private View.OnLongClickListener f5592Q;

    /* renamed from: R */
    private final LinkedHashSet<InterfaceC1889f> f5593R;

    /* renamed from: S */
    private int f5594S;

    /* renamed from: T */
    private final SparseArray<AbstractC1914e> f5595T;

    /* renamed from: U */
    private final CheckableImageButton f5596U;

    /* renamed from: V */
    private final LinkedHashSet<InterfaceC1890g> f5597V;

    /* renamed from: W */
    private ColorStateList f5598W;

    /* renamed from: a0 */
    private boolean f5599a0;

    /* renamed from: b0 */
    private PorterDuff.Mode f5600b0;

    /* renamed from: c0 */
    private boolean f5601c0;

    /* renamed from: d0 */
    private Drawable f5602d0;

    /* renamed from: e0 */
    private Drawable f5603e0;

    /* renamed from: f */
    private final FrameLayout f5604f;

    /* renamed from: f0 */
    private final CheckableImageButton f5605f0;

    /* renamed from: g */
    private final FrameLayout f5606g;

    /* renamed from: g0 */
    private View.OnLongClickListener f5607g0;

    /* renamed from: h */
    EditText f5608h;

    /* renamed from: h0 */
    private ColorStateList f5609h0;

    /* renamed from: i */
    private CharSequence f5610i;

    /* renamed from: i0 */
    private ColorStateList f5611i0;

    /* renamed from: j */
    private final C1915f f5612j;

    /* renamed from: j0 */
    private final int f5613j0;

    /* renamed from: k */
    boolean f5614k;

    /* renamed from: k0 */
    private final int f5615k0;

    /* renamed from: l */
    private int f5616l;

    /* renamed from: l0 */
    private int f5617l0;

    /* renamed from: m */
    private boolean f5618m;

    /* renamed from: m0 */
    private int f5619m0;

    /* renamed from: n */
    private TextView f5620n;

    /* renamed from: n0 */
    private final int f5621n0;

    /* renamed from: o */
    private int f5622o;

    /* renamed from: o0 */
    private final int f5623o0;

    /* renamed from: p */
    private int f5624p;

    /* renamed from: p0 */
    private final int f5625p0;

    /* renamed from: q */
    private ColorStateList f5626q;

    /* renamed from: q0 */
    private boolean f5627q0;

    /* renamed from: r */
    private ColorStateList f5628r;

    /* renamed from: r0 */
    final C1840a f5629r0;

    /* renamed from: s */
    private boolean f5630s;

    /* renamed from: s0 */
    private boolean f5631s0;

    /* renamed from: t */
    private CharSequence f5632t;

    /* renamed from: t0 */
    private ValueAnimator f5633t0;

    /* renamed from: u */
    private boolean f5634u;

    /* renamed from: u0 */
    private boolean f5635u0;

    /* renamed from: v */
    private C1315g f5636v;

    /* renamed from: v0 */
    private boolean f5637v0;

    /* renamed from: w */
    private C1315g f5638w;

    /* renamed from: x */
    private C1322k f5639x;

    /* renamed from: y */
    private final int f5640y;

    /* renamed from: z */
    private int f5641z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes.dex */
    public class C1884a implements TextWatcher {
        C1884a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m2589c0(!textInputLayout.f5637v0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f5614k) {
                textInputLayout2.m2599V(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes.dex */
    class RunnableC1885b implements Runnable {
        RunnableC1885b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5596U.performClick();
            TextInputLayout.this.f5596U.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes.dex */
    class RunnableC1886c implements Runnable {
        RunnableC1886c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5608h.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes.dex */
    public class C1887d implements ValueAnimator.AnimatorUpdateListener {
        C1887d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f5629r0.m2782O(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes.dex */
    public static class C1888e extends C0195a {

        /* renamed from: d */
        private final TextInputLayout f5646d;

        public C1888e(TextInputLayout textInputLayout) {
            this.f5646d = textInputLayout;
        }

        @Override // p000a.p019g.p028k.C0195a
        /* renamed from: g */
        public void mo2517g(View view, C0217c c0217c) {
            super.mo2517g(view, c0217c);
            EditText editText = this.f5646d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f5646d.getHint();
            CharSequence error = this.f5646d.getError();
            CharSequence counterOverflowDescription = this.f5646d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                c0217c.m8736s0(text);
            } else if (z2) {
                c0217c.m8736s0(hint);
            }
            if (z2) {
                c0217c.m8756i0(hint);
                if (!z && z2) {
                    z4 = true;
                }
                c0217c.m8742p0(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                c0217c.m8764e0(error);
                c0217c.m8770b0(true);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1889f {
        /* renamed from: a */
        void mo2471a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes.dex */
    public interface InterfaceC1890g {
        /* renamed from: a */
        void mo2470a(TextInputLayout textInputLayout, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    /* loaded from: classes.dex */
    public static class C1891h extends AbstractC0280a {
        public static final Parcelable.Creator<C1891h> CREATOR = new C1892a();

        /* renamed from: h */
        CharSequence f5647h;

        /* renamed from: i */
        boolean f5648i;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        /* loaded from: classes.dex */
        static class C1892a implements Parcelable.ClassLoaderCreator<C1891h> {
            C1892a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1891h createFromParcel(Parcel parcel) {
                return new C1891h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1891h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1891h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1891h[] newArray(int i) {
                return new C1891h[i];
            }
        }

        C1891h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5647h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5648i = parcel.readInt() == 1;
        }

        C1891h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5647h) + "}";
        }

        @Override // p000a.p032i.p033a.AbstractC0280a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f5647h, parcel, i);
            parcel.writeInt(this.f5648i ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(C1851g.m2719f(context, attributeSet, i, f5575w0), attributeSet, i);
        int colorForState;
        this.f5612j = new C1915f(this);
        this.f5582G = new Rect();
        this.f5583H = new Rect();
        this.f5584I = new RectF();
        this.f5593R = new LinkedHashSet<>();
        this.f5594S = 0;
        this.f5595T = new SparseArray<>();
        this.f5597V = new LinkedHashSet<>();
        this.f5629r0 = new C1840a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f5604f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f5604f);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f5606g = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        this.f5604f.addView(this.f5606g);
        this.f5629r0.m2777T(C1350a.f4230a);
        this.f5629r0.m2780Q(C1350a.f4230a);
        this.f5629r0.m2791F(8388659);
        C0665w0 m2713l = C1851g.m2713l(context2, attributeSet, C1349k.TextInputLayout, i, f5575w0, C1349k.TextInputLayout_counterTextAppearance, C1349k.TextInputLayout_counterOverflowTextAppearance, C1349k.TextInputLayout_errorTextAppearance, C1349k.TextInputLayout_helperTextTextAppearance, C1349k.TextInputLayout_hintTextAppearance);
        this.f5630s = m2713l.m7233a(C1349k.TextInputLayout_hintEnabled, true);
        setHint(m2713l.m7218p(C1349k.TextInputLayout_android_hint));
        this.f5631s0 = m2713l.m7233a(C1349k.TextInputLayout_hintAnimationEnabled, true);
        this.f5639x = C1322k.m4494e(context2, attributeSet, i, f5575w0).m4457m();
        this.f5640y = context2.getResources().getDimensionPixelOffset(C1342d.mtrl_textinput_box_label_cutout_padding);
        this.f5576A = m2713l.m7229e(C1349k.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f5578C = m2713l.m7228f(C1349k.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C1342d.mtrl_textinput_box_stroke_width_default));
        this.f5579D = m2713l.m7228f(C1349k.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C1342d.mtrl_textinput_box_stroke_width_focused));
        this.f5577B = this.f5578C;
        float m7230d = m2713l.m7230d(C1349k.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float m7230d2 = m2713l.m7230d(C1349k.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float m7230d3 = m2713l.m7230d(C1349k.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float m7230d4 = m2713l.m7230d(C1349k.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C1322k.C1324b m4477v = this.f5639x.m4477v();
        if (m7230d >= 0.0f) {
            m4477v.m4444z(m7230d);
        }
        if (m7230d2 >= 0.0f) {
            m4477v.m4471D(m7230d2);
        }
        if (m7230d3 >= 0.0f) {
            m4477v.m4448v(m7230d3);
        }
        if (m7230d4 >= 0.0f) {
            m4477v.m4452r(m7230d4);
        }
        this.f5639x = m4477v.m4457m();
        ColorStateList m4261b = C1388c.m4261b(context2, m2713l, C1349k.TextInputLayout_boxBackgroundColor);
        if (m4261b != null) {
            int defaultColor = m4261b.getDefaultColor();
            this.f5619m0 = defaultColor;
            this.f5581F = defaultColor;
            if (m4261b.isStateful()) {
                this.f5621n0 = m4261b.getColorForState(new int[]{-16842910}, -1);
                colorForState = m4261b.getColorForState(new int[]{16843623}, -1);
            } else {
                ColorStateList m9578c = C0010a.m9578c(context2, C1341c.mtrl_filled_background_color);
                this.f5621n0 = m9578c.getColorForState(new int[]{-16842910}, -1);
                colorForState = m9578c.getColorForState(new int[]{16843623}, -1);
            }
            this.f5623o0 = colorForState;
        } else {
            this.f5581F = 0;
            this.f5619m0 = 0;
            this.f5621n0 = 0;
            this.f5623o0 = 0;
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_android_textColorHint)) {
            ColorStateList m7231c = m2713l.m7231c(C1349k.TextInputLayout_android_textColorHint);
            this.f5611i0 = m7231c;
            this.f5609h0 = m7231c;
        }
        ColorStateList m4261b2 = C1388c.m4261b(context2, m2713l, C1349k.TextInputLayout_boxStrokeColor);
        if (m4261b2 == null || !m4261b2.isStateful()) {
            this.f5617l0 = m2713l.m7232b(C1349k.TextInputLayout_boxStrokeColor, 0);
            this.f5613j0 = C0734a.m6876b(context2, C1341c.mtrl_textinput_default_box_stroke_color);
            this.f5625p0 = C0734a.m6876b(context2, C1341c.mtrl_textinput_disabled_color);
            this.f5615k0 = C0734a.m6876b(context2, C1341c.mtrl_textinput_hovered_box_stroke_color);
        } else {
            this.f5613j0 = m4261b2.getDefaultColor();
            this.f5625p0 = m4261b2.getColorForState(new int[]{-16842910}, -1);
            this.f5615k0 = m4261b2.getColorForState(new int[]{16843623}, -1);
            this.f5617l0 = m4261b2.getColorForState(new int[]{16842908}, -1);
        }
        if (m2713l.m7220n(C1349k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(m2713l.m7220n(C1349k.TextInputLayout_hintTextAppearance, 0));
        }
        int m7220n = m2713l.m7220n(C1349k.TextInputLayout_errorTextAppearance, 0);
        boolean m7233a = m2713l.m7233a(C1349k.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1346h.design_text_input_end_icon, (ViewGroup) this.f5604f, false);
        this.f5605f0 = checkableImageButton;
        this.f5604f.addView(checkableImageButton);
        this.f5605f0.setVisibility(8);
        if (m2713l.m7216r(C1349k.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(m2713l.m7227g(C1349k.TextInputLayout_errorIconDrawable));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(C1388c.m4261b(context2, m2713l, C1349k.TextInputLayout_errorIconTint));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(C1852h.m2710c(m2713l.m7223k(C1349k.TextInputLayout_errorIconTintMode, -1), null));
        }
        this.f5605f0.setContentDescription(getResources().getText(C1347i.error_icon_content_description));
        C0252s.m8605p0(this.f5605f0, 2);
        this.f5605f0.setClickable(false);
        this.f5605f0.setPressable(false);
        this.f5605f0.setFocusable(false);
        int m7220n2 = m2713l.m7220n(C1349k.TextInputLayout_helperTextTextAppearance, 0);
        boolean m7233a2 = m2713l.m7233a(C1349k.TextInputLayout_helperTextEnabled, false);
        CharSequence m7218p = m2713l.m7218p(C1349k.TextInputLayout_helperText);
        boolean m7233a3 = m2713l.m7233a(C1349k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(m2713l.m7223k(C1349k.TextInputLayout_counterMaxLength, -1));
        this.f5624p = m2713l.m7220n(C1349k.TextInputLayout_counterTextAppearance, 0);
        this.f5622o = m2713l.m7220n(C1349k.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1346h.design_text_input_start_icon, (ViewGroup) this.f5604f, false);
        this.f5586K = checkableImageButton2;
        this.f5604f.addView(checkableImageButton2);
        this.f5586K.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (m2713l.m7216r(C1349k.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(m2713l.m7227g(C1349k.TextInputLayout_startIconDrawable));
            if (m2713l.m7216r(C1349k.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(m2713l.m7218p(C1349k.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(m2713l.m7233a(C1349k.TextInputLayout_startIconCheckable, true));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_startIconTint)) {
            setStartIconTintList(C1388c.m4261b(context2, m2713l, C1349k.TextInputLayout_startIconTint));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(C1852h.m2710c(m2713l.m7223k(C1349k.TextInputLayout_startIconTintMode, -1), null));
        }
        setHelperTextEnabled(m7233a2);
        setHelperText(m7218p);
        setHelperTextTextAppearance(m7220n2);
        setErrorEnabled(m7233a);
        setErrorTextAppearance(m7220n);
        setCounterTextAppearance(this.f5624p);
        setCounterOverflowTextAppearance(this.f5622o);
        if (m2713l.m7216r(C1349k.TextInputLayout_errorTextColor)) {
            setErrorTextColor(m2713l.m7231c(C1349k.TextInputLayout_errorTextColor));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(m2713l.m7231c(C1349k.TextInputLayout_helperTextTextColor));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_hintTextColor)) {
            setHintTextColor(m2713l.m7231c(C1349k.TextInputLayout_hintTextColor));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_counterTextColor)) {
            setCounterTextColor(m2713l.m7231c(C1349k.TextInputLayout_counterTextColor));
        }
        if (m2713l.m7216r(C1349k.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(m2713l.m7231c(C1349k.TextInputLayout_counterOverflowTextColor));
        }
        setCounterEnabled(m7233a3);
        setBoxBackgroundMode(m2713l.m7223k(C1349k.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C1346h.design_text_input_end_icon, (ViewGroup) this.f5606g, false);
        this.f5596U = checkableImageButton3;
        this.f5606g.addView(checkableImageButton3);
        this.f5596U.setVisibility(8);
        this.f5595T.append(-1, new C1901b(this));
        this.f5595T.append(0, new C1917g(this));
        this.f5595T.append(1, new C1918h(this));
        this.f5595T.append(2, new C1893a(this));
        this.f5595T.append(3, new C1903d(this));
        if (m2713l.m7216r(C1349k.TextInputLayout_endIconMode)) {
            setEndIconMode(m2713l.m7223k(C1349k.TextInputLayout_endIconMode, 0));
            if (m2713l.m7216r(C1349k.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(m2713l.m7227g(C1349k.TextInputLayout_endIconDrawable));
            }
            if (m2713l.m7216r(C1349k.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(m2713l.m7218p(C1349k.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(m2713l.m7233a(C1349k.TextInputLayout_endIconCheckable, true));
        } else if (m2713l.m7216r(C1349k.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(m2713l.m7233a(C1349k.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(m2713l.m7227g(C1349k.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(m2713l.m7218p(C1349k.TextInputLayout_passwordToggleContentDescription));
            if (m2713l.m7216r(C1349k.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(C1388c.m4261b(context2, m2713l, C1349k.TextInputLayout_passwordToggleTint));
            }
            if (m2713l.m7216r(C1349k.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(C1852h.m2710c(m2713l.m7223k(C1349k.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!m2713l.m7216r(C1349k.TextInputLayout_passwordToggleEnabled)) {
            if (m2713l.m7216r(C1349k.TextInputLayout_endIconTint)) {
                setEndIconTintList(C1388c.m4261b(context2, m2713l, C1349k.TextInputLayout_endIconTint));
            }
            if (m2713l.m7216r(C1349k.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(C1852h.m2710c(m2713l.m7223k(C1349k.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        m2713l.m7212v();
        C0252s.m8605p0(this, 2);
    }

    /* renamed from: A */
    private void m2620A(Canvas canvas) {
        if (this.f5630s) {
            this.f5629r0.m2767i(canvas);
        }
    }

    /* renamed from: B */
    private void m2619B(boolean z) {
        ValueAnimator valueAnimator = this.f5633t0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5633t0.cancel();
        }
        if (z && this.f5631s0) {
            m2586e(0.0f);
        } else {
            this.f5629r0.m2782O(0.0f);
        }
        if (m2567w() && ((C1902c) this.f5636v).m2552g0()) {
            m2569u();
        }
        this.f5627q0 = true;
    }

    /* renamed from: C */
    private boolean m2618C() {
        return this.f5594S != 0;
    }

    /* renamed from: D */
    private boolean m2617D() {
        return getStartIconDrawable() != null;
    }

    /* renamed from: H */
    private boolean m2613H() {
        return this.f5641z == 1 && (Build.VERSION.SDK_INT < 16 || this.f5608h.getMinLines() <= 1);
    }

    /* renamed from: J */
    private void m2611J() {
        m2578l();
        m2608M();
        m2585e0();
        if (this.f5641z != 0) {
            m2591b0();
        }
    }

    /* renamed from: K */
    private void m2610K() {
        if (m2567w()) {
            RectF rectF = this.f5584I;
            this.f5629r0.m2765k(rectF);
            m2582h(rectF);
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((C1902c) this.f5636v).m2546m0(rectF);
        }
    }

    /* renamed from: L */
    private static void m2609L(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m2609L((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: M */
    private void m2608M() {
        if (m2603R()) {
            C0252s.m8619i0(this.f5608h, this.f5636v);
        }
    }

    /* renamed from: N */
    private static void m2607N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m8655H = C0252s.m8655H(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (m8655H || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(m8655H);
        checkableImageButton.setPressable(m8655H);
        checkableImageButton.setLongClickable(z2);
        C0252s.m8605p0(checkableImageButton, z ? 1 : 2);
    }

    /* renamed from: O */
    private static void m2606O(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m2607N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: P */
    private static void m2605P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m2607N(checkableImageButton, onLongClickListener);
    }

    /* renamed from: R */
    private boolean m2603R() {
        EditText editText = this.f5608h;
        return (editText == null || this.f5636v == null || editText.getBackground() != null || this.f5641z == 0) ? false : true;
    }

    /* renamed from: S */
    private void m2602S(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m2581i();
            return;
        }
        Drawable mutate = C0759a.m6744r(getEndIconDrawable()).mutate();
        C0759a.m6748n(mutate, this.f5612j.m2488n());
        this.f5596U.setImageDrawable(mutate);
    }

    /* renamed from: T */
    private void m2601T(Rect rect) {
        C1315g c1315g = this.f5638w;
        if (c1315g != null) {
            int i = rect.bottom;
            c1315g.setBounds(rect.left, i - this.f5579D, rect.right, i);
        }
    }

    /* renamed from: U */
    private void m2600U() {
        if (this.f5620n != null) {
            EditText editText = this.f5608h;
            m2599V(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: W */
    private static void m2598W(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C1347i.character_counter_overflowed_content_description : C1347i.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: X */
    private void m2597X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f5620n;
        if (textView != null) {
            m2604Q(textView, this.f5618m ? this.f5622o : this.f5624p);
            if (!this.f5618m && (colorStateList2 = this.f5626q) != null) {
                this.f5620n.setTextColor(colorStateList2);
            }
            if (!this.f5618m || (colorStateList = this.f5628r) == null) {
                return;
            }
            this.f5620n.setTextColor(colorStateList);
        }
    }

    /* renamed from: Z */
    private boolean m2595Z() {
        int max;
        if (this.f5608h != null && this.f5608h.getMeasuredHeight() < (max = Math.max(this.f5596U.getMeasuredHeight(), this.f5586K.getMeasuredHeight()))) {
            this.f5608h.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m2593a0() {
        boolean z;
        if (this.f5608h == null) {
            return false;
        }
        boolean z2 = true;
        if (m2617D() && m2612I() && this.f5586K.getMeasuredWidth() > 0) {
            if (this.f5591P == null) {
                this.f5591P = new ColorDrawable();
                this.f5591P.setBounds(0, 0, (this.f5586K.getMeasuredWidth() - this.f5608h.getPaddingLeft()) + C0240g.m8697a((ViewGroup.MarginLayoutParams) this.f5586K.getLayoutParams()), 1);
            }
            Drawable[] m6641a = C0779i.m6641a(this.f5608h);
            Drawable drawable = m6641a[0];
            Drawable drawable2 = this.f5591P;
            if (drawable != drawable2) {
                C0779i.m6633i(this.f5608h, drawable2, m6641a[1], m6641a[2], m6641a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f5591P != null) {
                Drawable[] m6641a2 = C0779i.m6641a(this.f5608h);
                C0779i.m6633i(this.f5608h, null, m6641a2[1], m6641a2[2], m6641a2[3]);
                this.f5591P = null;
                z = true;
            }
            z = false;
        }
        CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.f5602d0 == null) {
                this.f5602d0 = new ColorDrawable();
                this.f5602d0.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.f5608h.getPaddingRight()) + C0240g.m8696b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()), 1);
            }
            Drawable[] m6641a3 = C0779i.m6641a(this.f5608h);
            Drawable drawable3 = m6641a3[2];
            Drawable drawable4 = this.f5602d0;
            if (drawable3 != drawable4) {
                this.f5603e0 = m6641a3[2];
                C0779i.m6633i(this.f5608h, m6641a3[0], m6641a3[1], drawable4, m6641a3[3]);
            } else {
                z2 = z;
            }
        } else if (this.f5602d0 == null) {
            return z;
        } else {
            Drawable[] m6641a4 = C0779i.m6641a(this.f5608h);
            if (m6641a4[2] == this.f5602d0) {
                C0779i.m6633i(this.f5608h, m6641a4[0], m6641a4[1], this.f5603e0, m6641a4[3]);
            } else {
                z2 = z;
            }
            this.f5602d0 = null;
        }
        return z2;
    }

    /* renamed from: b0 */
    private void m2591b0() {
        if (this.f5641z != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5604f.getLayoutParams();
            int m2572r = m2572r();
            if (m2572r != layoutParams.topMargin) {
                layoutParams.topMargin = m2572r;
                this.f5604f.requestLayout();
            }
        }
    }

    /* renamed from: d0 */
    private void m2587d0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C1840a c1840a;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f5608h;
        boolean z3 = true;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5608h;
        z3 = (editText2 == null || !editText2.hasFocus()) ? false : false;
        boolean m2491k = this.f5612j.m2491k();
        ColorStateList colorStateList2 = this.f5609h0;
        if (colorStateList2 != null) {
            this.f5629r0.m2792E(colorStateList2);
            this.f5629r0.m2786K(this.f5609h0);
        }
        if (!isEnabled) {
            this.f5629r0.m2792E(ColorStateList.valueOf(this.f5625p0));
            this.f5629r0.m2786K(ColorStateList.valueOf(this.f5625p0));
        } else if (m2491k) {
            this.f5629r0.m2792E(this.f5612j.m2487o());
        } else {
            if (this.f5618m && (textView = this.f5620n) != null) {
                c1840a = this.f5629r0;
                colorStateList = textView.getTextColors();
            } else if (z3 && (colorStateList = this.f5611i0) != null) {
                c1840a = this.f5629r0;
            }
            c1840a.m2792E(colorStateList);
        }
        if (z4 || (isEnabled() && (z3 || m2491k))) {
            if (z2 || this.f5627q0) {
                m2568v(z);
            }
        } else if (z2 || !this.f5627q0) {
            m2619B(z);
        }
    }

    /* renamed from: f */
    private void m2584f() {
        C1315g c1315g = this.f5636v;
        if (c1315g == null) {
            return;
        }
        c1315g.setShapeAppearanceModel(this.f5639x);
        if (m2571s()) {
            this.f5636v.m4538Z(this.f5577B, this.f5580E);
        }
        int m2577m = m2577m();
        this.f5581F = m2577m;
        this.f5636v.m4544T(ColorStateList.valueOf(m2577m));
        if (this.f5594S == 3) {
            this.f5608h.getBackground().invalidateSelf();
        }
        m2583g();
        invalidate();
    }

    /* renamed from: g */
    private void m2583g() {
        if (this.f5638w == null) {
            return;
        }
        if (m2570t()) {
            this.f5638w.m4544T(ColorStateList.valueOf(this.f5580E));
        }
        invalidate();
    }

    private AbstractC1914e getEndIconDelegate() {
        AbstractC1914e abstractC1914e = this.f5595T.get(this.f5594S);
        return abstractC1914e != null ? abstractC1914e : this.f5595T.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f5605f0.getVisibility() == 0) {
            return this.f5605f0;
        }
        if (m2618C() && m2616E()) {
            return this.f5596U;
        }
        return null;
    }

    /* renamed from: h */
    private void m2582h(RectF rectF) {
        float f = rectF.left;
        int i = this.f5640y;
        rectF.left = f - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    /* renamed from: i */
    private void m2581i() {
        m2580j(this.f5596U, this.f5599a0, this.f5598W, this.f5601c0, this.f5600b0);
    }

    /* renamed from: j */
    private void m2580j(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0759a.m6744r(drawable).mutate();
            if (z) {
                C0759a.m6747o(drawable, colorStateList);
            }
            if (z2) {
                C0759a.m6746p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: k */
    private void m2579k() {
        m2580j(this.f5586K, this.f5588M, this.f5587L, this.f5590O, this.f5589N);
    }

    /* renamed from: l */
    private void m2578l() {
        int i = this.f5641z;
        if (i == 0) {
            this.f5636v = null;
        } else if (i == 1) {
            this.f5636v = new C1315g(this.f5639x);
            this.f5638w = new C1315g();
            return;
        } else if (i != 2) {
            throw new IllegalArgumentException(this.f5641z + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.f5636v = (!this.f5630s || (this.f5636v instanceof C1902c)) ? new C1315g(this.f5639x) : new C1902c(this.f5639x);
        }
        this.f5638w = null;
    }

    /* renamed from: m */
    private int m2577m() {
        return this.f5641z == 1 ? C1377a.m4287e(C1377a.m4288d(this, C1338b.colorSurface, 0), this.f5581F) : this.f5581F;
    }

    /* renamed from: n */
    private Rect m2576n(Rect rect) {
        int i;
        int i2;
        int i3;
        EditText editText = this.f5608h;
        if (editText != null) {
            Rect rect2 = this.f5583H;
            rect2.bottom = rect.bottom;
            int i4 = this.f5641z;
            if (i4 == 1) {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = rect.top + this.f5576A;
            } else if (i4 == 2) {
                rect2.left = rect.left + editText.getPaddingLeft();
                rect2.top = rect.top - m2572r();
                i2 = rect.right;
                i3 = this.f5608h.getPaddingRight();
                rect2.right = i2 - i3;
                return rect2;
            } else {
                rect2.left = rect.left + editText.getCompoundPaddingLeft();
                i = getPaddingTop();
            }
            rect2.top = i;
            i2 = rect.right;
            i3 = this.f5608h.getCompoundPaddingRight();
            rect2.right = i2 - i3;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    private int m2575o(Rect rect, Rect rect2, float f) {
        return this.f5641z == 1 ? (int) (rect2.top + f) : rect.bottom - this.f5608h.getCompoundPaddingBottom();
    }

    /* renamed from: p */
    private int m2574p(Rect rect, float f) {
        return m2613H() ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f5608h.getCompoundPaddingTop();
    }

    /* renamed from: q */
    private Rect m2573q(Rect rect) {
        if (this.f5608h != null) {
            Rect rect2 = this.f5583H;
            float m2759q = this.f5629r0.m2759q();
            rect2.left = rect.left + this.f5608h.getCompoundPaddingLeft();
            rect2.top = m2574p(rect, m2759q);
            rect2.right = rect.right - this.f5608h.getCompoundPaddingRight();
            rect2.bottom = m2575o(rect, rect2, m2759q);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    private int m2572r() {
        float m2763m;
        if (this.f5630s) {
            int i = this.f5641z;
            if (i == 0 || i == 1) {
                m2763m = this.f5629r0.m2763m();
            } else if (i != 2) {
                return 0;
            } else {
                m2763m = this.f5629r0.m2763m() / 2.0f;
            }
            return (int) m2763m;
        }
        return 0;
    }

    /* renamed from: s */
    private boolean m2571s() {
        return this.f5641z == 2 && m2570t();
    }

    private void setEditText(EditText editText) {
        if (this.f5608h != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f5594S != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f5608h = editText;
        m2611J();
        setTextInputAccessibilityDelegate(new C1888e(this));
        this.f5629r0.m2776U(this.f5608h.getTypeface());
        this.f5629r0.m2784M(this.f5608h.getTextSize());
        int gravity = this.f5608h.getGravity();
        this.f5629r0.m2791F((gravity & (-113)) | 48);
        this.f5629r0.m2785L(gravity);
        this.f5608h.addTextChangedListener(new C1884a());
        if (this.f5609h0 == null) {
            this.f5609h0 = this.f5608h.getHintTextColors();
        }
        if (this.f5630s) {
            if (TextUtils.isEmpty(this.f5632t)) {
                CharSequence hint = this.f5608h.getHint();
                this.f5610i = hint;
                setHint(hint);
                this.f5608h.setHint((CharSequence) null);
            }
            this.f5634u = true;
        }
        if (this.f5620n != null) {
            m2599V(this.f5608h.getText().length());
        }
        m2596Y();
        this.f5612j.m2497e();
        this.f5586K.bringToFront();
        this.f5606g.bringToFront();
        this.f5605f0.bringToFront();
        m2566x();
        m2587d0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f5605f0.setVisibility(z ? 0 : 8);
        this.f5606g.setVisibility(z ? 8 : 0);
        if (m2618C()) {
            return;
        }
        m2593a0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5632t)) {
            return;
        }
        this.f5632t = charSequence;
        this.f5629r0.m2778S(charSequence);
        if (this.f5627q0) {
            return;
        }
        m2610K();
    }

    /* renamed from: t */
    private boolean m2570t() {
        return this.f5577B > -1 && this.f5580E != 0;
    }

    /* renamed from: u */
    private void m2569u() {
        if (m2567w()) {
            ((C1902c) this.f5636v).m2549j0();
        }
    }

    /* renamed from: v */
    private void m2568v(boolean z) {
        ValueAnimator valueAnimator = this.f5633t0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5633t0.cancel();
        }
        if (z && this.f5631s0) {
            m2586e(1.0f);
        } else {
            this.f5629r0.m2782O(1.0f);
        }
        this.f5627q0 = false;
        if (m2567w()) {
            m2610K();
        }
    }

    /* renamed from: w */
    private boolean m2567w() {
        return this.f5630s && !TextUtils.isEmpty(this.f5632t) && (this.f5636v instanceof C1902c);
    }

    /* renamed from: x */
    private void m2566x() {
        Iterator<InterfaceC1889f> it = this.f5593R.iterator();
        while (it.hasNext()) {
            it.next().mo2471a(this);
        }
    }

    /* renamed from: y */
    private void m2565y(int i) {
        Iterator<InterfaceC1890g> it = this.f5597V.iterator();
        while (it.hasNext()) {
            it.next().mo2470a(this, i);
        }
    }

    /* renamed from: z */
    private void m2564z(Canvas canvas) {
        C1315g c1315g = this.f5638w;
        if (c1315g != null) {
            Rect bounds = c1315g.getBounds();
            bounds.top = bounds.bottom - this.f5577B;
            this.f5638w.draw(canvas);
        }
    }

    /* renamed from: E */
    public boolean m2616E() {
        return this.f5606g.getVisibility() == 0 && this.f5596U.getVisibility() == 0;
    }

    /* renamed from: F */
    public boolean m2615F() {
        return this.f5612j.m2479w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean m2614G() {
        return this.f5634u;
    }

    /* renamed from: I */
    public boolean m2612I() {
        return this.f5586K.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2604Q(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.C0779i.m6628n(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = p054b.p059c.p060a.p075b.C1348j.TextAppearance_AppCompat_Caption
            androidx.core.widget.C0779i.m6628n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = p054b.p059c.p060a.p075b.C1341c.design_error
            int r4 = androidx.core.content.C0734a.m6876b(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2604Q(android.widget.TextView, int):void");
    }

    /* renamed from: V */
    void m2599V(int i) {
        boolean z = this.f5618m;
        if (this.f5616l == -1) {
            this.f5620n.setText(String.valueOf(i));
            this.f5620n.setContentDescription(null);
            this.f5618m = false;
        } else {
            if (C0252s.m8616k(this.f5620n) == 1) {
                C0252s.m8621h0(this.f5620n, 0);
            }
            this.f5618m = i > this.f5616l;
            m2598W(getContext(), this.f5620n, i, this.f5616l, this.f5618m);
            if (z != this.f5618m) {
                m2597X();
                if (this.f5618m) {
                    C0252s.m8621h0(this.f5620n, 1);
                }
            }
            this.f5620n.setText(getContext().getString(C1347i.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f5616l)));
        }
        if (this.f5608h == null || z == this.f5618m) {
            return;
        }
        m2589c0(false);
        m2585e0();
        m2596Y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m2596Y() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f5608h;
        if (editText == null || this.f5641z != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C0593e0.m7468a(background)) {
            background = background.mutate();
        }
        if (this.f5612j.m2491k()) {
            currentTextColor = this.f5612j.m2488n();
        } else if (!this.f5618m || (textView = this.f5620n) == null) {
            C0759a.m6759c(background);
            this.f5608h.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C0608j.m7408e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f5604f.addView(view, layoutParams2);
        this.f5604f.setLayoutParams(layoutParams);
        m2591b0();
        setEditText((EditText) view);
    }

    /* renamed from: c */
    public void m2590c(InterfaceC1889f interfaceC1889f) {
        this.f5593R.add(interfaceC1889f);
        if (this.f5608h != null) {
            interfaceC1889f.mo2471a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m2589c0(boolean z) {
        m2587d0(z, false);
    }

    /* renamed from: d */
    public void m2588d(InterfaceC1890g interfaceC1890g) {
        this.f5597V.add(interfaceC1890g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f5610i == null || (editText = this.f5608h) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f5634u;
        this.f5634u = false;
        CharSequence hint = editText.getHint();
        this.f5608h.setHint(this.f5610i);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f5608h.setHint(hint);
            this.f5634u = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f5637v0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f5637v0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m2620A(canvas);
        m2564z(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f5635u0) {
            return;
        }
        boolean z = true;
        this.f5635u0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1840a c1840a = this.f5629r0;
        boolean m2779R = c1840a != null ? c1840a.m2779R(drawableState) | false : false;
        m2589c0((C0252s.m8650M(this) && isEnabled()) ? false : false);
        m2596Y();
        m2585e0();
        if (m2779R) {
            invalidate();
        }
        this.f5635u0 = false;
    }

    /* renamed from: e */
    void m2586e(float f) {
        if (this.f5629r0.m2758r() == f) {
            return;
        }
        if (this.f5633t0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5633t0 = valueAnimator;
            valueAnimator.setInterpolator(C1350a.f4231b);
            this.f5633t0.setDuration(167L);
            this.f5633t0.addUpdateListener(new C1887d());
        }
        this.f5633t0.setFloatValues(this.f5629r0.m2758r(), f);
        this.f5633t0.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m2585e0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f5636v == null || this.f5641z == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f5608h) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f5608h) != null && editText.isHovered());
        this.f5580E = !isEnabled() ? this.f5625p0 : this.f5612j.m2491k() ? this.f5612j.m2488n() : (!this.f5618m || (textView = this.f5620n) == null) ? z2 ? this.f5617l0 : z3 ? this.f5615k0 : this.f5613j0 : textView.getCurrentTextColor();
        m2602S(this.f5612j.m2491k() && getEndIconDelegate().mo2514c());
        if (getErrorIconDrawable() != null && this.f5612j.m2480v() && this.f5612j.m2491k()) {
            z = true;
        }
        setErrorIconVisible(z);
        this.f5577B = ((z3 || z2) && isEnabled()) ? this.f5579D : this.f5578C;
        if (this.f5641z == 1) {
            this.f5581F = !isEnabled() ? this.f5621n0 : z3 ? this.f5623o0 : this.f5619m0;
        }
        m2584f();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5608h;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m2572r() : super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1315g getBoxBackground() {
        int i = this.f5641z;
        if (i == 1 || i == 2) {
            return this.f5636v;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5581F;
    }

    public int getBoxBackgroundMode() {
        return this.f5641z;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f5636v.m4515r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f5636v.m4514s();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f5636v.m4558F();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f5636v.m4559E();
    }

    public int getBoxStrokeColor() {
        return this.f5617l0;
    }

    public int getCounterMaxLength() {
        return this.f5616l;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f5614k && this.f5618m && (textView = this.f5620n) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5626q;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5626q;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5609h0;
    }

    public EditText getEditText() {
        return this.f5608h;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5596U.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f5596U.getDrawable();
    }

    public int getEndIconMode() {
        return this.f5594S;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f5596U;
    }

    public CharSequence getError() {
        if (this.f5612j.m2480v()) {
            return this.f5612j.m2489m();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.f5612j.m2488n();
    }

    public Drawable getErrorIconDrawable() {
        return this.f5605f0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f5612j.m2488n();
    }

    public CharSequence getHelperText() {
        if (this.f5612j.m2479w()) {
            return this.f5612j.m2486p();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f5612j.m2485q();
    }

    public CharSequence getHint() {
        if (this.f5630s) {
            return this.f5632t;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f5629r0.m2763m();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f5629r0.m2762n();
    }

    public ColorStateList getHintTextColor() {
        return this.f5611i0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5596U.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5596U.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5586K.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f5586K.getDrawable();
    }

    public Typeface getTypeface() {
        return this.f5585J;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f5608h;
        if (editText != null) {
            Rect rect = this.f5582G;
            C1842b.m2748a(this, editText, rect);
            m2601T(rect);
            if (this.f5630s) {
                this.f5629r0.m2794C(m2576n(rect));
                this.f5629r0.m2787J(m2573q(rect));
                this.f5629r0.m2750z();
                if (!m2567w() || this.f5627q0) {
                    return;
                }
                m2610K();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean m2595Z = m2595Z();
        boolean m2593a0 = m2593a0();
        if (m2595Z || m2593a0) {
            this.f5608h.post(new RunnableC1886c());
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1891h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1891h c1891h = (C1891h) parcelable;
        super.onRestoreInstanceState(c1891h.m8522a());
        setError(c1891h.f5647h);
        if (c1891h.f5648i) {
            this.f5596U.post(new RunnableC1885b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1891h c1891h = new C1891h(super.onSaveInstanceState());
        if (this.f5612j.m2491k()) {
            c1891h.f5647h = getError();
        }
        c1891h.f5648i = m2618C() && this.f5596U.isChecked();
        return c1891h;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f5581F != i) {
            this.f5581F = i;
            this.f5619m0 = i;
            m2584f();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0734a.m6876b(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f5641z) {
            return;
        }
        this.f5641z = i;
        if (this.f5608h != null) {
            m2611J();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f5617l0 != i) {
            this.f5617l0 = i;
            m2585e0();
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.f5614k != z) {
            if (z) {
                C0674z c0674z = new C0674z(getContext());
                this.f5620n = c0674z;
                c0674z.setId(C1344f.textinput_counter);
                Typeface typeface = this.f5585J;
                if (typeface != null) {
                    this.f5620n.setTypeface(typeface);
                }
                this.f5620n.setMaxLines(1);
                this.f5612j.m2498d(this.f5620n, 2);
                m2597X();
                m2600U();
            } else {
                this.f5612j.m2478x(this.f5620n, 2);
                this.f5620n = null;
            }
            this.f5614k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f5616l != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f5616l = i;
            if (this.f5614k) {
                m2600U();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f5622o != i) {
            this.f5622o = i;
            m2597X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5628r != colorStateList) {
            this.f5628r = colorStateList;
            m2597X();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f5624p != i) {
            this.f5624p = i;
            m2597X();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5626q != colorStateList) {
            this.f5626q = colorStateList;
            m2597X();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5609h0 = colorStateList;
        this.f5611i0 = colorStateList;
        if (this.f5608h != null) {
            m2589c0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m2609L(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f5596U.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f5596U.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f5596U.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C0010a.m9577d(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f5596U.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f5594S;
        this.f5594S = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo2515b(this.f5641z)) {
            getEndIconDelegate().mo2475a();
            m2581i();
            m2565y(i2);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f5641z + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m2606O(this.f5596U, onClickListener, this.f5607g0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5607g0 = onLongClickListener;
        m2605P(this.f5596U, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f5598W != colorStateList) {
            this.f5598W = colorStateList;
            this.f5599a0 = true;
            m2581i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f5600b0 != mode) {
            this.f5600b0 = mode;
            this.f5601c0 = true;
            m2581i();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m2616E() != z) {
            this.f5596U.setVisibility(z ? 0 : 4);
            m2593a0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f5612j.m2480v()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f5612j.m2484r();
        } else {
            this.f5612j.m2504J(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        this.f5612j.m2476z(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C0010a.m9577d(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5605f0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f5612j.m2480v());
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5605f0.getDrawable();
        if (drawable != null) {
            drawable = C0759a.m6744r(drawable).mutate();
            C0759a.m6747o(drawable, colorStateList);
        }
        if (this.f5605f0.getDrawable() != drawable) {
            this.f5605f0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5605f0.getDrawable();
        if (drawable != null) {
            drawable = C0759a.m6744r(drawable).mutate();
            C0759a.m6746p(drawable, mode);
        }
        if (this.f5605f0.getDrawable() != drawable) {
            this.f5605f0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f5612j.m2513A(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f5612j.m2512B(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m2615F()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!m2615F()) {
            setHelperTextEnabled(true);
        }
        this.f5612j.m2503K(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f5612j.m2509E(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f5612j.m2510D(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f5612j.m2511C(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5630s) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f5631s0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f5630s) {
            this.f5630s = z;
            if (z) {
                CharSequence hint = this.f5608h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5632t)) {
                        setHint(hint);
                    }
                    this.f5608h.setHint((CharSequence) null);
                }
                this.f5634u = true;
            } else {
                this.f5634u = false;
                if (!TextUtils.isEmpty(this.f5632t) && TextUtils.isEmpty(this.f5608h.getHint())) {
                    this.f5608h.setHint(this.f5632t);
                }
                setHintInternal(null);
            }
            if (this.f5608h != null) {
                m2591b0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f5629r0.m2793D(i);
        this.f5611i0 = this.f5629r0.m2764l();
        if (this.f5608h != null) {
            m2589c0(false);
            m2591b0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5611i0 != colorStateList) {
            if (this.f5609h0 == null) {
                this.f5629r0.m2792E(colorStateList);
            }
            this.f5611i0 = colorStateList;
            if (this.f5608h != null) {
                m2589c0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5596U.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0010a.m9577d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5596U.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f5594S != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f5598W = colorStateList;
        this.f5599a0 = true;
        m2581i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f5600b0 = mode;
        this.f5601c0 = true;
        m2581i();
    }

    public void setStartIconCheckable(boolean z) {
        this.f5586K.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f5586K.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0010a.m9577d(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5586K.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m2579k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m2606O(this.f5586K, onClickListener, this.f5592Q);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5592Q = onLongClickListener;
        m2605P(this.f5586K, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f5587L != colorStateList) {
            this.f5587L = colorStateList;
            this.f5588M = true;
            m2579k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f5589N != mode) {
            this.f5589N = mode;
            this.f5590O = true;
            m2579k();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (m2612I() != z) {
            this.f5586K.setVisibility(z ? 0 : 8);
            m2593a0();
        }
    }

    public void setTextInputAccessibilityDelegate(C1888e c1888e) {
        EditText editText = this.f5608h;
        if (editText != null) {
            C0252s.m8625f0(editText, c1888e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5585J) {
            this.f5585J = typeface;
            this.f5629r0.m2776U(typeface);
            this.f5612j.m2507G(typeface);
            TextView textView = this.f5620n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }
}
