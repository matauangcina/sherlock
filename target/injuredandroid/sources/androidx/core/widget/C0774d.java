package androidx.core.widget;

import android.os.Build;
import android.widget.EdgeEffect;
/* renamed from: androidx.core.widget.d */
/* loaded from: classes.dex */
public final class C0774d {
    /* renamed from: a */
    public static void m6653a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
