package p000a.p019g.p028k.p029b0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
/* renamed from: a.g.k.b0.e */
/* loaded from: classes.dex */
public class C0225e {
    /* renamed from: a */
    public static void m8716a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m8715b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: c */
    public static void m8714c(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }
}
