package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0778h;
import p000a.p001a.C0009j;
/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
class C0640q extends PopupWindow {

    /* renamed from: b */
    private static final boolean f2154b;

    /* renamed from: a */
    private boolean f2155a;

    static {
        f2154b = Build.VERSION.SDK_INT < 21;
    }

    public C0640q(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m7298a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m7298a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0665w0 m7213u = C0665w0.m7213u(context, attributeSet, C0009j.PopupWindow, i, i2);
        if (m7213u.m7216r(C0009j.PopupWindow_overlapAnchor)) {
            m7297b(m7213u.m7233a(C0009j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(m7213u.m7227g(C0009j.PopupWindow_android_popupBackground));
        m7213u.m7212v();
    }

    /* renamed from: b */
    private void m7297b(boolean z) {
        if (f2154b) {
            this.f2155a = z;
        } else {
            C0778h.m6644a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f2154b && this.f2155a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2154b && this.f2155a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2154b && this.f2155a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
