package p000a.p047p;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
/* renamed from: a.p.i */
/* loaded from: classes.dex */
class C0366i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static PropertyValuesHolder m8335a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C0364h(property, path), 0.0f, 1.0f);
    }
}
