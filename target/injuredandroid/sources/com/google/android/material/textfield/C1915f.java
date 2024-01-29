package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.C0674z;
import androidx.core.widget.C0779i;
import java.util.ArrayList;
import java.util.List;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1342d;
import p054b.p059c.p060a.p075b.C1344f;
import p054b.p059c.p060a.p075b.p078l.C1350a;
import p054b.p059c.p060a.p075b.p078l.C1351b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: classes.dex */
public final class C1915f {

    /* renamed from: a */
    private final Context f5690a;

    /* renamed from: b */
    private final TextInputLayout f5691b;

    /* renamed from: c */
    private LinearLayout f5692c;

    /* renamed from: d */
    private int f5693d;

    /* renamed from: e */
    private FrameLayout f5694e;

    /* renamed from: f */
    private int f5695f;

    /* renamed from: g */
    private Animator f5696g;

    /* renamed from: h */
    private final float f5697h;

    /* renamed from: i */
    private int f5698i;

    /* renamed from: j */
    private int f5699j;

    /* renamed from: k */
    private CharSequence f5700k;

    /* renamed from: l */
    private boolean f5701l;

    /* renamed from: m */
    private TextView f5702m;

    /* renamed from: n */
    private int f5703n;

    /* renamed from: o */
    private ColorStateList f5704o;

    /* renamed from: p */
    private CharSequence f5705p;

    /* renamed from: q */
    private boolean f5706q;

    /* renamed from: r */
    private TextView f5707r;

    /* renamed from: s */
    private int f5708s;

    /* renamed from: t */
    private ColorStateList f5709t;

    /* renamed from: u */
    private Typeface f5710u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.f$a */
    /* loaded from: classes.dex */
    public class C1916a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f5711a;

        /* renamed from: b */
        final /* synthetic */ TextView f5712b;

        /* renamed from: c */
        final /* synthetic */ int f5713c;

        /* renamed from: d */
        final /* synthetic */ TextView f5714d;

        C1916a(int i, TextView textView, int i2, TextView textView2) {
            this.f5711a = i;
            this.f5712b = textView;
            this.f5713c = i2;
            this.f5714d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1915f.this.f5698i = this.f5711a;
            C1915f.this.f5696g = null;
            TextView textView = this.f5712b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f5713c == 1 && C1915f.this.f5702m != null) {
                    C1915f.this.f5702m.setText((CharSequence) null);
                }
                TextView textView2 = this.f5714d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f5714d.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f5714d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C1915f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5690a = context;
        this.f5691b = textInputLayout;
        this.f5697h = context.getResources().getDimensionPixelSize(C1342d.design_textinput_caption_translate_y);
    }

    /* renamed from: F */
    private void m2508F(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: H */
    private void m2506H(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: I */
    private boolean m2505I(TextView textView, CharSequence charSequence) {
        return C0252s.m8650M(this.f5691b) && this.f5691b.isEnabled() && !(this.f5699j == this.f5698i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: L */
    private void m2502L(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5696g = animatorSet;
            ArrayList arrayList = new ArrayList();
            m2494h(arrayList, this.f5706q, this.f5707r, 2, i, i2);
            m2494h(arrayList, this.f5701l, this.f5702m, 1, i, i2);
            C1351b.m4376a(animatorSet, arrayList);
            animatorSet.addListener(new C1916a(i2, m2490l(i), i, m2490l(i2)));
            animatorSet.start();
        } else {
            m2477y(i, i2);
        }
        this.f5691b.m2596Y();
        this.f5691b.m2589c0(z);
        this.f5691b.m2585e0();
    }

    /* renamed from: f */
    private boolean m2496f() {
        return (this.f5692c == null || this.f5691b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m2494h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(m2493i(textView, i3 == i));
            if (i3 == i) {
                list.add(m2492j(textView));
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m2493i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C1350a.f4230a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m2492j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f5697h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C1350a.f4233d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m2490l(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f5707r;
        }
        return this.f5702m;
    }

    /* renamed from: t */
    private boolean m2482t(int i) {
        return (i != 1 || this.f5702m == null || TextUtils.isEmpty(this.f5700k)) ? false : true;
    }

    /* renamed from: y */
    private void m2477y(int i, int i2) {
        TextView m2490l;
        TextView m2490l2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m2490l2 = m2490l(i2)) != null) {
            m2490l2.setVisibility(0);
            m2490l2.setAlpha(1.0f);
        }
        if (i != 0 && (m2490l = m2490l(i)) != null) {
            m2490l.setVisibility(4);
            if (i == 1) {
                m2490l.setText((CharSequence) null);
            }
        }
        this.f5698i = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m2513A(int i) {
        this.f5703n = i;
        TextView textView = this.f5702m;
        if (textView != null) {
            this.f5691b.m2604Q(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m2512B(ColorStateList colorStateList) {
        this.f5704o = colorStateList;
        TextView textView = this.f5702m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m2511C(int i) {
        this.f5708s = i;
        TextView textView = this.f5707r;
        if (textView != null) {
            C0779i.m6628n(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m2510D(boolean z) {
        if (this.f5706q == z) {
            return;
        }
        m2495g();
        if (z) {
            C0674z c0674z = new C0674z(this.f5690a);
            this.f5707r = c0674z;
            c0674z.setId(C1344f.textinput_helper_text);
            Typeface typeface = this.f5710u;
            if (typeface != null) {
                this.f5707r.setTypeface(typeface);
            }
            this.f5707r.setVisibility(4);
            C0252s.m8621h0(this.f5707r, 1);
            m2511C(this.f5708s);
            m2509E(this.f5709t);
            m2498d(this.f5707r, 1);
        } else {
            m2483s();
            m2478x(this.f5707r, 1);
            this.f5707r = null;
            this.f5691b.m2596Y();
            this.f5691b.m2585e0();
        }
        this.f5706q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m2509E(ColorStateList colorStateList) {
        this.f5709t = colorStateList;
        TextView textView = this.f5707r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m2507G(Typeface typeface) {
        if (typeface != this.f5710u) {
            this.f5710u = typeface;
            m2508F(this.f5702m, typeface);
            m2508F(this.f5707r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m2504J(CharSequence charSequence) {
        m2495g();
        this.f5700k = charSequence;
        this.f5702m.setText(charSequence);
        if (this.f5698i != 1) {
            this.f5699j = 1;
        }
        m2502L(this.f5698i, this.f5699j, m2505I(this.f5702m, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m2503K(CharSequence charSequence) {
        m2495g();
        this.f5705p = charSequence;
        this.f5707r.setText(charSequence);
        if (this.f5698i != 2) {
            this.f5699j = 2;
        }
        m2502L(this.f5698i, this.f5699j, m2505I(this.f5707r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m2498d(TextView textView, int i) {
        if (this.f5692c == null && this.f5694e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f5690a);
            this.f5692c = linearLayout;
            linearLayout.setOrientation(0);
            this.f5691b.addView(this.f5692c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f5690a);
            this.f5694e = frameLayout;
            this.f5692c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f5692c.addView(new Space(this.f5690a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f5691b.getEditText() != null) {
                m2497e();
            }
        }
        if (m2481u(i)) {
            this.f5694e.setVisibility(0);
            this.f5694e.addView(textView);
            this.f5695f++;
        } else {
            this.f5692c.addView(textView, i);
        }
        this.f5692c.setVisibility(0);
        this.f5693d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2497e() {
        if (m2496f()) {
            C0252s.m8599s0(this.f5692c, C0252s.m8661B(this.f5691b.getEditText()), 0, C0252s.m8662A(this.f5691b.getEditText()), 0);
        }
    }

    /* renamed from: g */
    void m2495g() {
        Animator animator = this.f5696g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m2491k() {
        return m2482t(this.f5699j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence m2489m() {
        return this.f5700k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m2488n() {
        TextView textView = this.f5702m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ColorStateList m2487o() {
        TextView textView = this.f5702m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public CharSequence m2486p() {
        return this.f5705p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m2485q() {
        TextView textView = this.f5707r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m2484r() {
        this.f5700k = null;
        m2495g();
        if (this.f5698i == 1) {
            this.f5699j = (!this.f5706q || TextUtils.isEmpty(this.f5705p)) ? 0 : 2;
        }
        m2502L(this.f5698i, this.f5699j, m2505I(this.f5702m, null));
    }

    /* renamed from: s */
    void m2483s() {
        m2495g();
        if (this.f5698i == 2) {
            this.f5699j = 0;
        }
        m2502L(this.f5698i, this.f5699j, m2505I(this.f5707r, null));
    }

    /* renamed from: u */
    boolean m2481u(int i) {
        return i == 0 || i == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean m2480v() {
        return this.f5701l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m2479w() {
        return this.f5706q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m2478x(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f5692c == null) {
            return;
        }
        if (!m2481u(i) || (frameLayout = this.f5694e) == null) {
            this.f5692c.removeView(textView);
        } else {
            int i2 = this.f5695f - 1;
            this.f5695f = i2;
            m2506H(frameLayout, i2);
            this.f5694e.removeView(textView);
        }
        int i3 = this.f5693d - 1;
        this.f5693d = i3;
        m2506H(this.f5692c, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m2476z(boolean z) {
        if (this.f5701l == z) {
            return;
        }
        m2495g();
        if (z) {
            C0674z c0674z = new C0674z(this.f5690a);
            this.f5702m = c0674z;
            c0674z.setId(C1344f.textinput_error);
            Typeface typeface = this.f5710u;
            if (typeface != null) {
                this.f5702m.setTypeface(typeface);
            }
            m2513A(this.f5703n);
            m2512B(this.f5704o);
            this.f5702m.setVisibility(4);
            C0252s.m8621h0(this.f5702m, 1);
            m2498d(this.f5702m, 0);
        } else {
            m2484r();
            m2478x(this.f5702m, 0);
            this.f5702m = null;
            this.f5691b.m2596Y();
            this.f5691b.m2585e0();
        }
        this.f5701l = z;
    }
}
