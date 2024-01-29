package p054b.p059c.p060a.p075b.p079m;

import android.graphics.Canvas;
import android.os.Build;
/* renamed from: b.c.a.b.m.a */
/* loaded from: classes.dex */
public class C1361a {
    /* renamed from: a */
    public static int m4348a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
