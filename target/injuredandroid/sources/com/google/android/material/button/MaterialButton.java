package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0594f;
import androidx.core.graphics.drawable.C0759a;
import androidx.core.widget.C0779i;
import com.google.android.material.internal.C1851g;
import com.google.android.material.internal.C1852h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.C0252s;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1348j;
import p054b.p059c.p060a.p075b.C1349k;
import p054b.p059c.p060a.p075b.p076a0.C1319h;
import p054b.p059c.p060a.p075b.p076a0.C1322k;
import p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n;
import p054b.p059c.p060a.p075b.p091x.C1388c;
/* loaded from: classes.dex */
public class MaterialButton extends C0594f implements Checkable, InterfaceC1337n {

    /* renamed from: t */
    private static final int[] f5047t = {16842911};

    /* renamed from: u */
    private static final int[] f5048u = {16842912};

    /* renamed from: v */
    private static final int f5049v = C1348j.Widget_MaterialComponents_Button;

    /* renamed from: h */
    private final C1751a f5050h;

    /* renamed from: i */
    private final LinkedHashSet<InterfaceC1749a> f5051i;

    /* renamed from: j */
    private InterfaceC1750b f5052j;

    /* renamed from: k */
    private PorterDuff.Mode f5053k;

    /* renamed from: l */
    private ColorStateList f5054l;

    /* renamed from: m */
    private Drawable f5055m;

    /* renamed from: n */
    private int f5056n;

    /* renamed from: o */
    private int f5057o;

    /* renamed from: p */
    private int f5058p;

    /* renamed from: q */
    private boolean f5059q;

    /* renamed from: r */
    private boolean f5060r;

    /* renamed from: s */
    private int f5061s;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1749a {
        /* renamed from: a */
        void m3308a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes.dex */
    interface InterfaceC1750b {
        /* renamed from: a */
        void m3307a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1338b.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C1851g.m2719f(context, attributeSet, i, f5049v), attributeSet, i);
        this.f5051i = new LinkedHashSet<>();
        this.f5059q = false;
        this.f5060r = false;
        Context context2 = getContext();
        TypedArray m2714k = C1851g.m2714k(context2, attributeSet, C1349k.MaterialButton, i, f5049v, new int[0]);
        this.f5058p = m2714k.getDimensionPixelSize(C1349k.MaterialButton_iconPadding, 0);
        this.f5053k = C1852h.m2710c(m2714k.getInt(C1349k.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f5054l = C1388c.m4262a(getContext(), m2714k, C1349k.MaterialButton_iconTint);
        this.f5055m = C1388c.m4259d(getContext(), m2714k, C1349k.MaterialButton_icon);
        this.f5061s = m2714k.getInteger(C1349k.MaterialButton_iconGravity, 1);
        this.f5056n = m2714k.getDimensionPixelSize(C1349k.MaterialButton_iconSize, 0);
        C1751a c1751a = new C1751a(this, C1322k.m4494e(context2, attributeSet, i, f5049v).m4457m());
        this.f5050h = c1751a;
        c1751a.m3288o(m2714k);
        m2714k.recycle();
        setCompoundDrawablePadding(this.f5058p);
        m3310e(this.f5055m != null);
    }

    /* renamed from: b */
    private boolean m3313b() {
        return C0252s.m8592w(this) == 1;
    }

    /* renamed from: c */
    private boolean m3312c() {
        C1751a c1751a = this.f5050h;
        return (c1751a == null || c1751a.m3290m()) ? false : true;
    }

    /* renamed from: d */
    private void m3311d(boolean z) {
        if (z) {
            C0779i.m6633i(this, this.f5055m, null, null, null);
        } else {
            C0779i.m6633i(this, null, null, this.f5055m, null);
        }
    }

    /* renamed from: e */
    private void m3310e(boolean z) {
        Drawable drawable = this.f5055m;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C0759a.m6744r(drawable).mutate();
            this.f5055m = mutate;
            C0759a.m6747o(mutate, this.f5054l);
            PorterDuff.Mode mode = this.f5053k;
            if (mode != null) {
                C0759a.m6746p(this.f5055m, mode);
            }
            int i = this.f5056n;
            if (i == 0) {
                i = this.f5055m.getIntrinsicWidth();
            }
            int i2 = this.f5056n;
            if (i2 == 0) {
                i2 = this.f5055m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f5055m;
            int i3 = this.f5057o;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f5061s;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m3311d(z3);
            return;
        }
        Drawable[] m6641a = C0779i.m6641a(this);
        Drawable drawable3 = m6641a[0];
        Drawable drawable4 = m6641a[2];
        if ((z3 && drawable3 != this.f5055m) || (!z3 && drawable4 != this.f5055m)) {
            z2 = true;
        }
        if (z2) {
            m3311d(z3);
        }
    }

    /* renamed from: f */
    private void m3309f() {
        if (this.f5055m == null || getLayout() == null) {
            return;
        }
        int i = this.f5061s;
        if (i == 1 || i == 3) {
            this.f5057o = 0;
            m3310e(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
        int i2 = this.f5056n;
        if (i2 == 0) {
            i2 = this.f5055m.getIntrinsicWidth();
        }
        int measuredWidth = (((((getMeasuredWidth() - min) - C0252s.m8662A(this)) - i2) - this.f5058p) - C0252s.m8661B(this)) / 2;
        if (m3313b() != (this.f5061s == 4)) {
            measuredWidth = -measuredWidth;
        }
        if (this.f5057o != measuredWidth) {
            this.f5057o = measuredWidth;
            m3310e(false);
        }
    }

    private String getA11yClassName() {
        return (m3314a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean m3314a() {
        C1751a c1751a = this.f5050h;
        return c1751a != null && c1751a.m3289n();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m3312c()) {
            return this.f5050h.m3301b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f5055m;
    }

    public int getIconGravity() {
        return this.f5061s;
    }

    public int getIconPadding() {
        return this.f5058p;
    }

    public int getIconSize() {
        return this.f5056n;
    }

    public ColorStateList getIconTint() {
        return this.f5054l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5053k;
    }

    public ColorStateList getRippleColor() {
        if (m3312c()) {
            return this.f5050h.m3297f();
        }
        return null;
    }

    public C1322k getShapeAppearanceModel() {
        if (m3312c()) {
            return this.f5050h.m3296g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m3312c()) {
            return this.f5050h.m3295h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m3312c()) {
            return this.f5050h.m3294i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0594f, p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        return m3312c() ? this.f5050h.m3293j() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0594f, p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m3312c() ? this.f5050h.m3292k() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5059q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1319h.m4501f(this, this.f5050h.m3299d());
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m3314a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f5047t);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f5048u);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0594f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0594f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m3314a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0594f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1751a c1751a;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (c1751a = this.f5050h) == null) {
            return;
        }
        c1751a.m3305B(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m3309f();
    }

    @Override // androidx.appcompat.widget.C0594f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m3309f();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m3312c()) {
            this.f5050h.m3287p(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C0594f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m3312c()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f5050h.m3286q();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0594f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0010a.m9577d(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m3312c()) {
            this.f5050h.m3285r(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m3314a() && isEnabled() && this.f5059q != z) {
            this.f5059q = z;
            refreshDrawableState();
            if (this.f5060r) {
                return;
            }
            this.f5060r = true;
            Iterator<InterfaceC1749a> it = this.f5051i.iterator();
            while (it.hasNext()) {
                it.next().m3308a(this, this.f5059q);
            }
            this.f5060r = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m3312c()) {
            this.f5050h.m3284s(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m3312c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m3312c()) {
            this.f5050h.m3299d().m4545S(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f5055m != drawable) {
            this.f5055m = drawable;
            m3310e(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f5061s != i) {
            this.f5061s = i;
            m3309f();
        }
    }

    public void setIconPadding(int i) {
        if (this.f5058p != i) {
            this.f5058p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0010a.m9577d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f5056n != i) {
            this.f5056n = i;
            m3310e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f5054l != colorStateList) {
            this.f5054l = colorStateList;
            m3310e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f5053k != mode) {
            this.f5053k = mode;
            m3310e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0010a.m9578c(getContext(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(InterfaceC1750b interfaceC1750b) {
        this.f5052j = interfaceC1750b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC1750b interfaceC1750b = this.f5052j;
        if (interfaceC1750b != null) {
            interfaceC1750b.m3307a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m3312c()) {
            this.f5050h.m3283t(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m3312c()) {
            setRippleColor(C0010a.m9578c(getContext(), i));
        }
    }

    @Override // p054b.p059c.p060a.p075b.p076a0.InterfaceC1337n
    public void setShapeAppearanceModel(C1322k c1322k) {
        if (!m3312c()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f5050h.m3282u(c1322k);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m3312c()) {
            this.f5050h.m3281v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m3312c()) {
            this.f5050h.m3280w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m3312c()) {
            setStrokeColor(C0010a.m9578c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m3312c()) {
            this.f5050h.m3279x(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m3312c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0594f, p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m3312c()) {
            this.f5050h.m3278y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0594f, p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m3312c()) {
            this.f5050h.m3277z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f5059q);
    }
}
