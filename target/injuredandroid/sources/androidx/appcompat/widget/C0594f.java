package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0779i;
import androidx.core.widget.InterfaceC0772b;
import p000a.p001a.C0000a;
import p000a.p019g.p028k.InterfaceC0251r;
/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public class C0594f extends Button implements InterfaceC0251r, InterfaceC0772b {

    /* renamed from: f */
    private final C0592e f1990f;

    /* renamed from: g */
    private final C0670y f1991g;

    public C0594f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0000a.buttonStyle);
    }

    public C0594f(Context context, AttributeSet attributeSet, int i) {
        super(C0648t0.m7263b(context), attributeSet, i);
        C0592e c0592e = new C0592e(this);
        this.f1990f = c0592e;
        c0592e.m7475e(attributeSet, i);
        C0670y c0670y = new C0670y(this);
        this.f1991g = c0670y;
        c0670y.m7154m(attributeSet, i);
        this.f1991g.m7165b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0592e c0592e = this.f1990f;
        if (c0592e != null) {
            c0592e.m7478b();
        }
        C0670y c0670y = this.f1991g;
        if (c0670y != null) {
            c0670y.m7165b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0772b.f2763a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0670y c0670y = this.f1991g;
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
        C0670y c0670y = this.f1991g;
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
        C0670y c0670y = this.f1991g;
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
        C0670y c0670y = this.f1991g;
        return c0670y != null ? c0670y.m7159h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0772b.f2763a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0670y c0670y = this.f1991g;
        if (c0670y != null) {
            return c0670y.m7158i();
        }
        return 0;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public ColorStateList getSupportBackgroundTintList() {
        C0592e c0592e = this.f1990f;
        if (c0592e != null) {
            return c0592e.m7477c();
        }
        return null;
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0592e c0592e = this.f1990f;
        if (c0592e != null) {
            return c0592e.m7476d();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0670y c0670y = this.f1991g;
        if (c0670y != null) {
            c0670y.m7153n(z, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0670y c0670y = this.f1991g;
        if (c0670y == null || InterfaceC0772b.f2763a || !c0670y.m7155l()) {
            return;
        }
        this.f1991g.m7164c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0772b.f2763a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0670y c0670y = this.f1991g;
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
        C0670y c0670y = this.f1991g;
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
        C0670y c0670y = this.f1991g;
        if (c0670y != null) {
            c0670y.m7146u(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0592e c0592e = this.f1990f;
        if (c0592e != null) {
            c0592e.m7474f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0592e c0592e = this.f1990f;
        if (c0592e != null) {
            c0592e.m7473g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0779i.m6626p(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0670y c0670y = this.f1991g;
        if (c0670y != null) {
            c0670y.m7149r(z);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0592e c0592e = this.f1990f;
        if (c0592e != null) {
            c0592e.m7471i(colorStateList);
        }
    }

    @Override // p000a.p019g.p028k.InterfaceC0251r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0592e c0592e = this.f1990f;
        if (c0592e != null) {
            c0592e.m7470j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0670y c0670y = this.f1991g;
        if (c0670y != null) {
            c0670y.m7151p(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (InterfaceC0772b.f2763a) {
            super.setTextSize(i, f);
            return;
        }
        C0670y c0670y = this.f1991g;
        if (c0670y != null) {
            c0670y.m7141z(i, f);
        }
    }
}
