package p000a.p047p;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
/* renamed from: a.p.f */
/* loaded from: classes.dex */
class C0360f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> ObjectAnimator m8338a(T t, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t, new C0364h(property, path), 0.0f, 1.0f);
    }
}
