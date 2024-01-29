package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.C0779i;
import p000a.p001a.C0000a;
import p000a.p019g.p028k.InterfaceC0251r;
/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public class C0617k extends EditText implements InterfaceC0251r {

    /* renamed from: f */
    private final C0592e f2096f;

    /* renamed from: g */
    private final C0670y f2097g;

    /* renamed from: h */
    private final C0666x f2098h;

    public C0617k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.editTextStyle);
    }

    public C0617k(Context context, AttributeSet attributeSet, int i) {
        super(C0648t0.m7263b(context), attributeSet, i);
        C0592e c0592e = new C0592e(this);
        this.f2096f = c0592e;
        c0592e.m7475e(attributeSet, i);
        C0670y c0670y = new C0670y(this);
        this.f2097g = c0670y;
        c0670y.m7154m(attributeSet, i);
        this.f2097g.m7165b();
        this.f2098h = new C0666x(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0592e c0592e = this.f2096f;
        if (c0592e != null) {
            c0592e.m7478b();
        }
        C0670y c0670y = this.f2097g;
        if (c0670y != null) {
            c0670y.m7165b();
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        C0592e c0592e = this.f2096f;
        if (c0592e != null) {
            return c0592e.m7477c();
        }
        return null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0592e c0592e = this.f2096f;
        if (c0592e != null) {
            return c0592e.m7476d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0666x c0666x;
        return (Build.VERSION.SDK_INT >= 28 || (c0666x = this.f2098h) == null) ? super.getTextClassifier() : c0666x.m7211a();
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
        C0592e c0592e = this.f2096f;
        if (c0592e != null) {
            c0592e.m7474f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0592e c0592e = this.f2096f;
        if (c0592e != null) {
            c0592e.m7473g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0779i.m6626p(this, callback));
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0592e c0592e = this.f2096f;
        if (c0592e != null) {
            c0592e.m7471i(colorStateList);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0592e c0592e = this.f2096f;
        if (c0592e != null) {
            c0592e.m7470j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0670y c0670y = this.f2097g;
        if (c0670y != null) {
            c0670y.m7151p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0666x c0666x;
        if (Build.VERSION.SDK_INT >= 28 || (c0666x = this.f2098h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0666x.m7210b(textClassifier);
        }
    }
}
