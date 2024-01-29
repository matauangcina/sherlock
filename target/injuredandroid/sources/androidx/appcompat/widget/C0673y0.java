package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
/* renamed from: androidx.appcompat.widget.y0 */
/* loaded from: classes.dex */
public class C0673y0 {
    /* renamed from: a */
    public static void m7140a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            View$OnLongClickListenerC0675z0.m7133f(view, charSequence);
        }
    }
}
