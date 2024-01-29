package p054b.p059c.p060a.p075b.p086s;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* renamed from: b.c.a.b.s.a */
/* loaded from: classes.dex */
public final class C1379a {
    /* renamed from: a */
    public static PorterDuffColorFilter m4284a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
