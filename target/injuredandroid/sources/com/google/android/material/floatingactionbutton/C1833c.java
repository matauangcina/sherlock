package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.C0734a;
import java.util.ArrayList;
import p000a.p019g.p027j.C0194i;
import p054b.p059c.p060a.p075b.C1341c;
import p054b.p059c.p060a.p075b.p076a0.C1315g;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p092y.C1397b;
import p054b.p059c.p060a.p075b.p093z.InterfaceC1399b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes.dex */
public class C1833c extends C1820b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.c$a */
    /* loaded from: classes.dex */
    public static class C1834a extends C1315g {
        C1834a(C1322k c1322k) {
            super(c1322k);
        }

        @Override // p054b.p059c.p060a.p075b.p076a0.C1315g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1833c(FloatingActionButton floatingActionButton, InterfaceC1399b interfaceC1399b) {
        super(floatingActionButton, interfaceC1399b);
    }

    /* renamed from: j0 */
    private Animator m2821j0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f5387y, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f5387y, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C1820b.f5351F);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: A */
    public void mo2831A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: C */
    public void mo2830C() {
        m2857f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: E */
    public void mo2829E(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f5387y.isEnabled()) {
                this.f5387y.setElevation(this.f5370h);
                if (this.f5387y.isPressed()) {
                    floatingActionButton = this.f5387y;
                    f = this.f5372j;
                } else if (this.f5387y.isFocused() || this.f5387y.isHovered()) {
                    floatingActionButton = this.f5387y;
                    f = this.f5371i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f5387y.setElevation(0.0f);
            floatingActionButton = this.f5387y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: F */
    void mo2828F(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f5387y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C1820b.f5352G, m2821j0(f, f3));
            stateListAnimator.addState(C1820b.f5353H, m2821j0(f, f2));
            stateListAnimator.addState(C1820b.f5354I, m2821j0(f, f2));
            stateListAnimator.addState(C1820b.f5355J, m2821j0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f5387y, "elevation", f).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f5387y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f5387y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C1820b.f5351F);
            stateListAnimator.addState(C1820b.f5356K, animatorSet);
            stateListAnimator.addState(C1820b.f5357L, m2821j0(0.0f, 0.0f));
            this.f5387y.setStateListAnimator(stateListAnimator);
        }
        if (mo2825Z()) {
            m2857f0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: K */
    boolean mo2827K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: V */
    public void mo2826V(ColorStateList colorStateList) {
        Drawable drawable = this.f5365c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C1397b.m4240a(colorStateList));
        } else {
            super.mo2826V(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: Z */
    boolean mo2825Z() {
        return this.f5388z.mo2893c() || !m2864b0();
    }

    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: d0 */
    void mo2824d0() {
    }

    /* renamed from: i0 */
    C1817a m2823i0(int i, ColorStateList colorStateList) {
        Context context = this.f5387y.getContext();
        C1322k c1322k = this.f5363a;
        C0194i.m8866c(c1322k);
        C1817a c1817a = new C1817a(c1322k);
        c1817a.m2888e(C0734a.m6876b(context, C1341c.design_fab_stroke_top_outer_color), C0734a.m6876b(context, C1341c.design_fab_stroke_top_inner_color), C0734a.m6876b(context, C1341c.design_fab_stroke_end_inner_color), C0734a.m6876b(context, C1341c.design_fab_stroke_end_outer_color));
        c1817a.m2889d(i);
        c1817a.m2890c(colorStateList);
        return c1817a;
    }

    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: j */
    C1315g mo2822j() {
        C1322k c1322k = this.f5363a;
        C0194i.m8866c(c1322k);
        return new C1834a(c1322k);
    }

    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: n */
    public float mo2820n() {
        return this.f5387y.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: s */
    public void mo2819s(Rect rect) {
        if (this.f5388z.mo2893c()) {
            super.mo2819s(rect);
            return;
        }
        int sizeDimension = !m2864b0() ? (this.f5373k - this.f5387y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C1820b
    /* renamed from: x */
    public void mo2818x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C1315g mo2822j = mo2822j();
        this.f5364b = mo2822j;
        mo2822j.setTintList(colorStateList);
        if (mode != null) {
            this.f5364b.setTintMode(mode);
        }
        this.f5364b.m4552L(this.f5387y.getContext());
        if (i > 0) {
            this.f5366d = m2823i0(i, colorStateList);
            C1817a c1817a = this.f5366d;
            C0194i.m8866c(c1817a);
            C1315g c1315g = this.f5364b;
            C0194i.m8866c(c1315g);
            drawable = new LayerDrawable(new Drawable[]{c1817a, c1315g});
        } else {
            this.f5366d = null;
            drawable = this.f5364b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C1397b.m4240a(colorStateList2), drawable, null);
        this.f5365c = rippleDrawable;
        this.f5367e = rippleDrawable;
    }
}
