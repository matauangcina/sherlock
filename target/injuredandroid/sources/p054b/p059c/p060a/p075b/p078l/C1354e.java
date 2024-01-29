package p054b.p059c.p060a.p075b.p078l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;
/* renamed from: b.c.a.b.l.e */
/* loaded from: classes.dex */
public class C1354e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f4237b = new C1354e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f4238a;

    private C1354e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f4238a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f4238a.containsKey(drawable)) {
            return this.f4238a.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f4238a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
