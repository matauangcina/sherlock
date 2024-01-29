package p000a.p047p;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* renamed from: a.p.h */
/* loaded from: classes.dex */
class C0364h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f937a;

    /* renamed from: b */
    private final PathMeasure f938b;

    /* renamed from: c */
    private final float f939c;

    /* renamed from: d */
    private final float[] f940d;

    /* renamed from: e */
    private final PointF f941e;

    /* renamed from: f */
    private float f942f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0364h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f940d = new float[2];
        this.f941e = new PointF();
        this.f937a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f938b = pathMeasure;
        this.f939c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f942f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t, Float f) {
        this.f942f = f.floatValue();
        this.f938b.getPosTan(this.f939c * f.floatValue(), this.f940d, null);
        PointF pointF = this.f941e;
        float[] fArr = this.f940d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f937a.set(t, pointF);
    }
}
