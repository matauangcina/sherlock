package p000a.p019g.p028k.p029b0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
/* renamed from: a.g.k.b0.b */
/* loaded from: classes.dex */
public final class C0216b {
    /* renamed from: a */
    public static int m8801a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m8800b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
