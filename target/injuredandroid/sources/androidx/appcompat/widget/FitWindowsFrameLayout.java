package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.InterfaceC0599g0;
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0599g0 {

    /* renamed from: f */
    private InterfaceC0599g0.InterfaceC0600a f1782f;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0599g0.InterfaceC0600a interfaceC0600a = this.f1782f;
        if (interfaceC0600a != null) {
            interfaceC0600a.mo7450a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0599g0
    public void setOnFitSystemWindowsListener(InterfaceC0599g0.InterfaceC0600a interfaceC0600a) {
        this.f1782f = interfaceC0600a;
    }
}
