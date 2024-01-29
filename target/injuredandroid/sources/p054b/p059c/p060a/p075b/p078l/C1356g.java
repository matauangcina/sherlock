package p054b.p059c.p060a.p075b.p078l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* renamed from: b.c.a.b.l.g */
/* loaded from: classes.dex */
public class C1356g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f4240a = new float[9];

    /* renamed from: b */
    private final float[] f4241b = new float[9];

    /* renamed from: c */
    private final Matrix f4242c = new Matrix();

    /* renamed from: a */
    public Matrix mo2838a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f4240a);
        matrix2.getValues(this.f4241b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f4241b;
            float f2 = fArr[i];
            float[] fArr2 = this.f4240a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f4242c.setValues(this.f4241b);
        return this.f4242c;
    }
}
