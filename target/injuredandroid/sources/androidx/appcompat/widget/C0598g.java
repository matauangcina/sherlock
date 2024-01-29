package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.InterfaceC0781j;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.InterfaceC0251r;
/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public class C0598g extends CheckBox implements InterfaceC0781j, InterfaceC0251r {

    /* renamed from: f */
    private final C0605i f2008f;

    /* renamed from: g */
    private final C0592e f2009g;

    /* renamed from: h */
    private final C0670y f2010h;

    public C0598g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.checkboxStyle);
    }

    public C0598g(Context context, AttributeSet attributeSet, int i) {
        super(C0648t0.m7263b(context), attributeSet, i);
        C0605i c0605i = new C0605i(this);
        this.f2008f = c0605i;
        c0605i.m7437e(attributeSet, i);
        C0592e c0592e = new C0592e(this);
        this.f2009g = c0592e;
        c0592e.m7475e(attributeSet, i);
        C0670y c0670y = new C0670y(this);
        this.f2010h = c0670y;
        c0670y.m7154m(attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0592e c0592e = this.f2009g;
        if (c0592e != null) {
            c0592e.m7478b();
        }
        C0670y c0670y = this.f2010h;
        if (c0670y != null) {
            c0670y.m7165b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0605i c0605i = this.f2008f;
        return c0605i != null ? c0605i.m7440b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        C0592e c0592e = this.f2009g;
        if (c0592e != null) {
            return c0592e.m7477c();
        }
        return null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0592e c0592e = this.f2009g;
        if (c0592e != null) {
            return c0592e.m7476d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0781j
    public ColorStateList getSupportButtonTintList() {
        C0605i c0605i = this.f2008f;
        if (c0605i != null) {
            return c0605i.m7439c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0605i c0605i = this.f2008f;
        if (c0605i != null) {
            return c0605i.m7438d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0592e c0592e = this.f2009g;
        if (c0592e != null) {
            c0592e.m7474f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0592e c0592e = this.f2009g;
        if (c0592e != null) {
            c0592e.m7473g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0010a.m9577d(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0605i c0605i = this.f2008f;
        if (c0605i != null) {
            c0605i.m7436f();
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0592e c0592e = this.f2009g;
        if (c0592e != null) {
            c0592e.m7471i(colorStateList);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0592e c0592e = this.f2009g;
        if (c0592e != null) {
            c0592e.m7470j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0781j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0605i c0605i = this.f2008f;
        if (c0605i != null) {
            c0605i.m7435g(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0781j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0605i c0605i = this.f2008f;
        if (c0605i != null) {
            c0605i.m7434h(mode);
        }
    }
}
