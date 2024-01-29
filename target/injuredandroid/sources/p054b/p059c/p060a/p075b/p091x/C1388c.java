package p054b.p059c.p060a.p075b.p091x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0665w0;
import p000a.p001a.p002k.p003a.C0010a;
/* renamed from: b.c.a.b.x.c */
/* loaded from: classes.dex */
public class C1388c {
    /* renamed from: a */
    public static ColorStateList m4262a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList m9578c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m9578c = C0010a.m9578c(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) ? typedArray.getColorStateList(i) : ColorStateList.valueOf(color) : m9578c;
    }

    /* renamed from: b */
    public static ColorStateList m4261b(Context context, C0665w0 c0665w0, int i) {
        int m7232b;
        int m7220n;
        ColorStateList m9578c;
        return (!c0665w0.m7216r(i) || (m7220n = c0665w0.m7220n(i, 0)) == 0 || (m9578c = C0010a.m9578c(context, m7220n)) == null) ? (Build.VERSION.SDK_INT > 15 || (m7232b = c0665w0.m7232b(i, -1)) == -1) ? c0665w0.m7231c(i) : ColorStateList.valueOf(m7232b) : m9578c;
    }

    /* renamed from: c */
    public static int m4260c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    /* renamed from: d */
    public static Drawable m4259d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m9577d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m9577d = C0010a.m9577d(context, resourceId)) == null) ? typedArray.getDrawable(i) : m9577d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m4258e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C1389d m4257f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C1389d(context, resourceId);
    }
}
