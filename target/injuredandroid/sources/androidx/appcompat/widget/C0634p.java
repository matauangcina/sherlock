package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p000a.p001a.C0000a;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p028k.InterfaceC0251r;
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public class C0634p extends MultiAutoCompleteTextView implements InterfaceC0251r {

    /* renamed from: h */
    private static final int[] f2132h = {16843126};

    /* renamed from: f */
    private final C0592e f2133f;

    /* renamed from: g */
    private final C0670y f2134g;

    public C0634p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.autoCompleteTextViewStyle);
    }

    public C0634p(Context context, AttributeSet attributeSet, int i) {
        super(C0648t0.m7263b(context), attributeSet, i);
        C0665w0 m7213u = C0665w0.m7213u(getContext(), attributeSet, f2132h, i, 0);
        if (m7213u.m7216r(0)) {
            setDropDownBackgroundDrawable(m7213u.m7227g(0));
        }
        m7213u.m7212v();
        C0592e c0592e = new C0592e(this);
        this.f2133f = c0592e;
        c0592e.m7475e(attributeSet, i);
        C0670y c0670y = new C0670y(this);
        this.f2134g = c0670y;
        c0670y.m7154m(attributeSet, i);
        this.f2134g.m7165b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0592e c0592e = this.f2133f;
        if (c0592e != null) {
            c0592e.m7478b();
        }
        C0670y c0670y = this.f2134g;
        if (c0670y != null) {
            c0670y.m7165b();
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        C0592e c0592e = this.f2133f;
        if (c0592e != null) {
            return c0592e.m7477c();
        }
        return null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0592e c0592e = this.f2133f;
        if (c0592e != null) {
            return c0592e.m7476d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0619l.m7365a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0592e c0592e = this.f2133f;
        if (c0592e != null) {
            c0592e.m7474f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0592e c0592e = this.f2133f;
        if (c0592e != null) {
            c0592e.m7473g(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0010a.m9577d(getContext(), i));
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0592e c0592e = this.f2133f;
        if (c0592e != null) {
            c0592e.m7471i(colorStateList);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0592e c0592e = this.f2133f;
        if (c0592e != null) {
            c0592e.m7470j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0670y c0670y = this.f2134g;
        if (c0670y != null) {
            c0670y.m7151p(context, i);
        }
    }
}
