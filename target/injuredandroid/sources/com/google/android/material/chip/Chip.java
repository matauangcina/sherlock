package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0598g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.C1760a;
import com.google.android.material.internal.C1851g;
import com.google.android.material.internal.C1852h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p000a.p019g.p028k.C0252s;
import p000a.p019g.p028k.p029b0.C0217c;
import p000a.p032i.p034b.AbstractC0283a;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1347i;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1319h;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n;
import p054b.p059c.p060a.p075b.p078l.C1357h;
import p054b.p059c.p060a.p075b.p091x.AbstractC1393f;
import p054b.p059c.p060a.p075b.p091x.C1388c;
import p054b.p059c.p060a.p075b.p091x.C1389d;
import p054b.p059c.p060a.p075b.p092y.C1397b;
/* loaded from: classes.dex */
public class Chip extends C0598g implements C1760a.InterfaceC1761a, InterfaceC1337n {

    /* renamed from: i */
    private C1760a f5084i;

    /* renamed from: j */
    private InsetDrawable f5085j;

    /* renamed from: k */
    private RippleDrawable f5086k;

    /* renamed from: l */
    private View.OnClickListener f5087l;

    /* renamed from: m */
    private CompoundButton.OnCheckedChangeListener f5088m;

    /* renamed from: n */
    private boolean f5089n;

    /* renamed from: o */
    private boolean f5090o;

    /* renamed from: p */
    private boolean f5091p;

    /* renamed from: q */
    private boolean f5092q;

    /* renamed from: r */
    private boolean f5093r;

    /* renamed from: s */
    private int f5094s;

    /* renamed from: t */
    private int f5095t;

    /* renamed from: u */
    private final C1754c f5096u;

    /* renamed from: v */
    private final Rect f5097v;

    /* renamed from: w */
    private final RectF f5098w;

    /* renamed from: x */
    private final AbstractC1393f f5099x;

    /* renamed from: y */
    private static final Rect f5082y = new Rect();

    /* renamed from: z */
    private static final int[] f5083z = {16842913};

    /* renamed from: A */
    private static final int[] f5081A = {16842911};

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes.dex */
    class C1752a extends AbstractC1393f {
        C1752a() {
        }

        @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
        /* renamed from: a */
        public void mo2727a(int i) {
        }

        @Override // p054b.p059c.p060a.p075b.p091x.AbstractC1393f
        /* renamed from: b */
        public void mo2726b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f5084i.m3225C2() ? Chip.this.f5084i.m3172a1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes.dex */
    public class C1753b extends ViewOutlineProvider {
        C1753b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f5084i != null) {
                Chip.this.f5084i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes.dex */
    public class C1754c extends AbstractC0283a {
        C1754c(Chip chip) {
            super(chip);
        }

        @Override // p000a.p032i.p034b.AbstractC0283a
        /* renamed from: B */
        protected int mo3249B(float f, float f2) {
            return (Chip.this.m3263m() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p000a.p032i.p034b.AbstractC0283a
        /* renamed from: C */
        protected void mo3248C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m3263m() && Chip.this.m3258r()) {
                list.add(1);
            }
        }

        @Override // p000a.p032i.p034b.AbstractC0283a
        /* renamed from: J */
        protected boolean mo3247J(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.m3257s();
                }
                return false;
            }
            return false;
        }

        @Override // p000a.p032i.p034b.AbstractC0283a
        /* renamed from: M */
        protected void mo3246M(C0217c c0217c) {
            c0217c.m8779U(Chip.this.m3259q());
            c0217c.m8776X(Chip.this.isClickable());
            c0217c.m8777W((Chip.this.m3259q() || Chip.this.isClickable()) ? Chip.this.m3259q() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c0217c.m8736s0(text);
            } else {
                c0217c.m8772a0(text);
            }
        }

        @Override // p000a.p032i.p034b.AbstractC0283a
        /* renamed from: N */
        protected void mo3245N(int i, C0217c c0217c) {
            if (i != 1) {
                c0217c.m8772a0("");
                c0217c.m8781S(Chip.f5082y);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i2 = C1347i.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(i2, objArr).trim();
            }
            c0217c.m8772a0(closeIconContentDescription);
            c0217c.m8781S(Chip.this.getCloseIconTouchBoundsInt());
            c0217c.m8771b(C0217c.C0218a.f692e);
            c0217c.m8766d0(Chip.this.isEnabled());
        }

        @Override // p000a.p032i.p034b.AbstractC0283a
        /* renamed from: O */
        protected void mo3244O(int i, boolean z) {
            if (i == 1) {
                Chip.this.f5092q = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5097v = new Rect();
        this.f5098w = new RectF();
        this.f5099x = new C1752a();
        m3275B(attributeSet);
        C1760a m3127r0 = C1760a.m3127r0(context, attributeSet, i, C1348j.Widget_MaterialComponents_Chip_Action);
        m3262n(context, attributeSet, i);
        setChipDrawable(m3127r0);
        m3127r0.m4545S(C0252s.m8602r(this));
        TypedArray m2714k = C1851g.m2714k(context, attributeSet, C1349k.Chip, i, C1348j.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C1388c.m4262a(context, m2714k, C1349k.Chip_android_textColor));
        }
        boolean hasValue = m2714k.hasValue(C1349k.Chip_shapeAppearance);
        m2714k.recycle();
        C1754c c1754c = new C1754c(this);
        this.f5096u = c1754c;
        if (Build.VERSION.SDK_INT >= 24) {
            C0252s.m8625f0(this, c1754c);
        } else {
            m3253w();
        }
        if (!hasValue) {
            m3261o();
        }
        setChecked(this.f5089n);
        setText(m3127r0.m3172a1());
        setEllipsize(m3127r0.m3184U0());
        setIncludeFontPadding(false);
        m3276A();
        if (!this.f5084i.m3225C2()) {
            setSingleLine();
        }
        setGravity(8388627);
        m3250z();
        if (m3255u()) {
            setMinHeight(this.f5095t);
        }
        this.f5094s = C0252s.m8592w(this);
    }

    /* renamed from: A */
    private void m3276A() {
        TextPaint paint = getPaint();
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            paint.drawableState = c1760a.getState();
        }
        C1389d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4248i(getContext(), paint, this.f5099x);
        }
    }

    /* renamed from: B */
    private void m3275B(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f5098w.setEmpty();
        if (m3263m()) {
            this.f5084i.m3186T0(this.f5098w);
        }
        return this.f5098w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f5097v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f5097v;
    }

    private C1389d getTextAppearance() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3170b1();
        }
        return null;
    }

    /* renamed from: h */
    private void m3268h(C1760a c1760a) {
        c1760a.m3158g2(this);
    }

    /* renamed from: i */
    private int[] m3267i() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f5092q) {
            i2++;
        }
        if (this.f5091p) {
            i2++;
        }
        if (this.f5090o) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f5092q) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f5091p) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f5090o) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: k */
    private void m3265k() {
        if (getBackgroundDrawable() == this.f5085j && this.f5084i.getCallback() == null) {
            this.f5084i.setCallback(this.f5085j);
        }
    }

    /* renamed from: l */
    private boolean m3264l(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC0283a.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f5096u)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC0283a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f5096u, Integer.valueOf((int) RecyclerView.UNDEFINED_DURATION));
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m3263m() {
        C1760a c1760a = this.f5084i;
        return (c1760a == null || c1760a.m3200M0() == null) ? false : true;
    }

    /* renamed from: n */
    private void m3262n(Context context, AttributeSet attributeSet, int i) {
        TypedArray m2714k = C1851g.m2714k(context, attributeSet, C1349k.Chip, i, C1348j.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f5093r = m2714k.getBoolean(C1349k.Chip_ensureMinTouchTargetSize, false);
        this.f5095t = (int) Math.ceil(m2714k.getDimension(C1349k.Chip_chipMinTouchTargetSize, (float) Math.ceil(C1852h.m2712a(getContext(), 48))));
        m2714k.recycle();
    }

    /* renamed from: o */
    private void m3261o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C1753b());
        }
    }

    /* renamed from: p */
    private void m3260p(int i, int i2, int i3, int i4) {
        this.f5085j = new InsetDrawable((Drawable) this.f5084i, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f5091p != z) {
            this.f5091p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f5090o != z) {
            this.f5090o = z;
            refreshDrawableState();
        }
    }

    /* renamed from: t */
    private void m3256t() {
        if (this.f5085j != null) {
            this.f5085j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m3252x();
        }
    }

    /* renamed from: v */
    private void m3254v(C1760a c1760a) {
        if (c1760a != null) {
            c1760a.m3158g2(null);
        }
    }

    /* renamed from: w */
    private void m3253w() {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        C0252s.m8625f0(this, (m3263m() && m3258r()) ? this.f5096u : null);
    }

    /* renamed from: x */
    private void m3252x() {
        if (C1397b.f4315a) {
            m3251y();
            return;
        }
        this.f5084i.m3228B2(true);
        C0252s.m8619i0(this, getBackgroundDrawable());
        m3265k();
    }

    /* renamed from: y */
    private void m3251y() {
        this.f5086k = new RippleDrawable(C1397b.m4240a(this.f5084i.m3176Y0()), getBackgroundDrawable(), null);
        this.f5084i.m3228B2(false);
        C0252s.m8619i0(this, this.f5086k);
    }

    /* renamed from: z */
    private void m3250z() {
        C1760a c1760a;
        if (TextUtils.isEmpty(getText()) || (c1760a = this.f5084i) == null) {
            return;
        }
        C0252s.m8599s0(this, (int) (this.f5084i.m3206J0() + this.f5084i.m3166d1() + this.f5084i.m3154i0()), getPaddingTop(), (int) (c1760a.m3221E0() + this.f5084i.m3168c1() + this.f5084i.m3142m0()), getPaddingBottom());
    }

    @Override // com.google.android.material.chip.C1760a.InterfaceC1761a
    /* renamed from: a */
    public void mo3100a() {
        m3266j(this.f5095t);
        m3252x();
        m3250z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m3264l(motionEvent) || this.f5096u.m8494v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f5096u.m8493w(keyEvent) || this.f5096u.m8518A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0598g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1760a c1760a = this.f5084i;
        if ((c1760a == null || !c1760a.m3153i1()) ? false : this.f5084i.m3167c2(m3267i())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5085j;
        return insetDrawable == null ? this.f5084i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3230B0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3227C0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3224D0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5084i;
    }

    public float getChipEndPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3221E0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3218F0();
        }
        return null;
    }

    public float getChipIconSize() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3215G0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3212H0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3209I0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3206J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3204K0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3202L0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3200M0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3198N0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3196O0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3194P0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3192Q0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3188S0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3184U0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f5096u.m8518A() == 1 || this.f5096u.m8492x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1357h getHideMotionSpec() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3182V0();
        }
        return null;
    }

    public float getIconEndPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3180W0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3178X0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3176Y0();
        }
        return null;
    }

    public C1322k getShapeAppearanceModel() {
        return this.f5084i.m4562B();
    }

    public C1357h getShowMotionSpec() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3174Z0();
        }
        return null;
    }

    public float getTextEndPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3168c1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            return c1760a.m3166d1();
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
        if (getMinWidth() != r6) goto L35;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3266j(int r6) {
        /*
            r5 = this;
            r5.f5095t = r6
            boolean r0 = r5.m3255u()
            r1 = 0
            if (r0 != 0) goto Ld
            r5.m3256t()
            return r1
        Ld:
            com.google.android.material.chip.a r0 = r5.f5084i
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r5.f5084i
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L2d
            if (r0 > 0) goto L2d
            r5.m3256t()
            return r1
        L2d:
            if (r2 <= 0) goto L32
            int r2 = r2 / 2
            goto L33
        L32:
            r2 = 0
        L33:
            if (r0 <= 0) goto L37
            int r1 = r0 / 2
        L37:
            android.graphics.drawable.InsetDrawable r0 = r5.f5085j
            r3 = 1
            if (r0 == 0) goto L57
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.f5085j
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L57
            int r4 = r0.bottom
            if (r4 != r1) goto L57
            int r4 = r0.left
            if (r4 != r2) goto L57
            int r0 = r0.right
            if (r0 != r2) goto L57
            return r3
        L57:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r0 < r4) goto L6d
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L66
            r5.setMinHeight(r6)
        L66:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L73
            goto L70
        L6d:
            r5.setMinHeight(r6)
        L70:
            r5.setMinWidth(r6)
        L73:
            r5.m3260p(r2, r1, r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m3266j(int):boolean");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1319h.m4501f(this, this.f5084i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f5083z);
        }
        if (m3259q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f5081A);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f5096u.m8512I(z, i, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((m3259q() || isClickable()) ? m3259q() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(m3259q());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f5094s != i) {
            this.f5094s = i;
            m3250z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f5090o
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f5090o
            if (r0 == 0) goto L34
            r5.m3257s()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean m3259q() {
        C1760a c1760a = this.f5084i;
        return c1760a != null && c1760a.m3156h1();
    }

    /* renamed from: r */
    public boolean m3258r() {
        C1760a c1760a = this.f5084i;
        return c1760a != null && c1760a.m3150j1();
    }

    /* renamed from: s */
    public boolean m3257s() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f5087l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f5096u.m8504U(1, 1);
        return z;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5086k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0598g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5086k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0598g, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3129q1(z);
        }
    }

    public void setCheckableResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3126r1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C1760a c1760a = this.f5084i;
        if (c1760a == null) {
            this.f5089n = z;
        } else if (c1760a.m3156h1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.f5088m) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3123s1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3120t1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3117u1(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3114v1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3111w1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3108x1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3105y1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3102z1(i);
        }
    }

    public void setChipDrawable(C1760a c1760a) {
        C1760a c1760a2 = this.f5084i;
        if (c1760a2 != c1760a) {
            m3254v(c1760a2);
            this.f5084i = c1760a;
            c1760a.m3125r2(false);
            m3268h(this.f5084i);
            m3266j(this.f5095t);
            m3252x();
        }
    }

    public void setChipEndPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3232A1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3229B1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3226C1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3223D1(i);
        }
    }

    public void setChipIconSize(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3220E1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3217F1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3214G1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3211H1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3208I1(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3205J1(z);
        }
    }

    public void setChipMinHeight(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3203K1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3201L1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3199M1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3197N1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3195O1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3193P1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3191Q1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3189R1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3185T1(drawable);
        }
        m3253w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3183U1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3181V1(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3179W1(i);
        }
    }

    public void setCloseIconResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3177X1(i);
        }
        m3253w();
    }

    public void setCloseIconSize(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3175Y1(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3173Z1(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3171a2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3169b2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3165d2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3163e2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3161f2(z);
        }
        m3253w();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m4545S(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5084i == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3155h2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f5093r = z;
        m3266j(this.f5095t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1357h c1357h) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3152i2(c1357h);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3149j2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3146k2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3143l2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3140m2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3137n2(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f5084i != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3134o2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5088m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f5087l = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3131p2(colorStateList);
        }
        if (this.f5084i.m3162f1()) {
            return;
        }
        m3251y();
    }

    public void setRippleColorResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3128q2(i);
            if (this.f5084i.m3162f1()) {
                return;
            }
            m3251y();
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n
    public void setShapeAppearanceModel(C1322k c1322k) {
        this.f5084i.setShapeAppearanceModel(c1322k);
    }

    public void setShowMotionSpec(C1357h c1357h) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3122s2(c1357h);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3119t2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f5084i == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(this.f5084i.m3225C2() ? null : charSequence, bufferType);
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3116u2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3110w2(i);
        }
        m3276A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3110w2(i);
        }
        m3276A();
    }

    public void setTextAppearance(C1389d c1389d) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3113v2(c1389d);
        }
        m3276A();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3107x2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3104y2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3101z2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C1760a c1760a = this.f5084i;
        if (c1760a != null) {
            c1760a.m3231A2(i);
        }
    }

    /* renamed from: u */
    public boolean m3255u() {
        return this.f5093r;
    }
}
