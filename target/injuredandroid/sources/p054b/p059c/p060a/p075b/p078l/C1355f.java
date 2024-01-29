package p054b.p059c.p060a.p075b.p078l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
/* renamed from: b.c.a.b.l.f */
/* loaded from: classes.dex */
public class C1355f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f4239a;

    public C1355f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f4239a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f4239a.set(imageView.getImageMatrix());
        return this.f4239a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
