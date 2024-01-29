package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0779i;
import androidx.core.widget.InterfaceC0772b;
import androidx.core.widget.InterfaceC0782k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p001a.p002k.p003a.C0010a;
import p000a.p019g.p020d.C0127d;
import p000a.p019g.p026i.C0174c;
import p000a.p019g.p028k.InterfaceC0251r;
/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public class C0674z extends TextView implements InterfaceC0251r, InterfaceC0782k, InterfaceC0772b {

    /* renamed from: f */
    private final C0592e f2278f;

    /* renamed from: g */
    private final C0670y f2279g;

    /* renamed from: h */
    private final C0666x f2280h;

    /* renamed from: i */
    private Future<C0174c> f2281i;

    public C0674z(Context context) {
        this(context, null);
    }

    public C0674z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0674z(Context context, AttributeSet attributeSet, int i) {
        super(C0648t0.m7263b(context), attributeSet, i);
        C0592e c0592e = new C0592e(this);
        this.f2278f = c0592e;
        c0592e.m7475e(attributeSet, i);
        C0670y c0670y = new C0670y(this);
        this.f2279g = c0670y;
        c0670y.m7154m(attributeSet, i);
        this.f2279g.m7165b();
        this.f2280h = new C0666x(this);
    }

    /* renamed from: c */
    private void m7139c() {
        Future<C0174c> future = this.f2281i;
        if (future != null) {
            try {
                this.f2281i = null;
                C0779i.m6629m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0592e c0592e = this.f2278f;
        if (c0592e != null) {
            c0592e.m7478b();
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7165b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0772b.f2763a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            return c0670y.m7162e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0772b.f2763a) {
            return super.getAutoSizeMinTextSize();
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            return c0670y.m7161f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0772b.f2763a) {
            return super.getAutoSizeStepGranularity();
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            return c0670y.m7160g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0772b.f2763a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0670y c0670y = this.f2279g;
        return c0670y != null ? c0670y.m7159h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0772b.f2763a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            return c0670y.m7158i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C0779i.m6640b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C0779i.m6639c(this);
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        C0592e c0592e = this.f2278f;
        if (c0592e != null) {
            return c0592e.m7477c();
        }
        return null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0592e c0592e = this.f2278f;
        if (c0592e != null) {
            return c0592e.m7476d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2279g.m7157j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2279g.m7156k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m7139c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0666x c0666x;
        return (Build.VERSION.SDK_INT >= 28 || (c0666x = this.f2280h) == null) ? super.getTextClassifier() : c0666x.m7211a();
    }

    public C0174c.C0175a getTextMetricsParamsCompat() {
        return C0779i.m6636f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0619l.m7365a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7153n(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m7139c();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0670y c0670y = this.f2279g;
        if (c0670y == null || InterfaceC0772b.f2763a || !c0670y.m7155l()) {
            return;
        }
        this.f2279g.m7164c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0772b.f2763a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7148s(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0772b.f2763a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7147t(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0772b.f2763a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7146u(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0592e c0592e = this.f2278f;
        if (c0592e != null) {
            c0592e.m7474f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0592e c0592e = this.f2278f;
        if (c0592e != null) {
            c0592e.m7473g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7152o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7152o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0010a.m9577d(context, i) : null, i2 != 0 ? C0010a.m9577d(context, i2) : null, i3 != 0 ? C0010a.m9577d(context, i3) : null, i4 != 0 ? C0010a.m9577d(context, i4) : null);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7152o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7152o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0010a.m9577d(context, i) : null, i2 != 0 ? C0010a.m9577d(context, i2) : null, i3 != 0 ? C0010a.m9577d(context, i3) : null, i4 != 0 ? C0010a.m9577d(context, i4) : null);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7152o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7152o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0779i.m6626p(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0779i.m6632j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0779i.m6631k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0779i.m6630l(this, i);
    }

    public void setPrecomputedText(C0174c c0174c) {
        C0779i.m6629m(this, c0174c);
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0592e c0592e = this.f2278f;
        if (c0592e != null) {
            c0592e.m7471i(colorStateList);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0592e c0592e = this.f2278f;
        if (c0592e != null) {
            c0592e.m7470j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0782k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2279g.m7145v(colorStateList);
        this.f2279g.m7165b();
    }

    @Override // androidx.core.widget.InterfaceC0782k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2279g.m7144w(mode);
        this.f2279g.m7165b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7151p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0666x c0666x;
        if (Build.VERSION.SDK_INT >= 28 || (c0666x = this.f2280h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0666x.m7210b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0174c> future) {
        this.f2281i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0174c.C0175a c0175a) {
        C0779i.m6627o(this, c0175a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC0772b.f2763a) {
            super.setTextSize(i, f);
            return;
        }
        C0670y c0670y = this.f2279g;
        if (c0670y != null) {
            c0670y.m7141z(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface m9027a = (typeface == null || i <= 0) ? null : C0127d.m9027a(getContext(), typeface, i);
        if (m9027a != null) {
            typeface = m9027a;
        }
        super.setTypeface(typeface, i);
    }
}
