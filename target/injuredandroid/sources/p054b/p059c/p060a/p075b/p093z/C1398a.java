package p054b.p059c.p060a.p075b.p093z;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p000a.p019g.p020d.C0122a;
/* renamed from: b.c.a.b.z.a */
/* loaded from: classes.dex */
public class C1398a {

    /* renamed from: h */
    private static final int[] f4318h = new int[3];

    /* renamed from: i */
    private static final float[] f4319i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j */
    private static final int[] f4320j = new int[4];

    /* renamed from: k */
    private static final float[] f4321k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f4322a;

    /* renamed from: b */
    private final Paint f4323b;

    /* renamed from: c */
    private final Paint f4324c;

    /* renamed from: d */
    private int f4325d;

    /* renamed from: e */
    private int f4326e;

    /* renamed from: f */
    private int f4327f;

    /* renamed from: g */
    private final Path f4328g;

    public C1398a() {
        this(-16777216);
    }

    public C1398a(int i) {
        this.f4328g = new Path();
        m4235d(i);
        Paint paint = new Paint(4);
        this.f4323b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f4322a = paint2;
        paint2.setColor(this.f4325d);
        this.f4324c = new Paint(this.f4323b);
    }

    /* renamed from: a */
    public void m4238a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z = f2 < 0.0f;
        Path path = this.f4328g;
        if (z) {
            int[] iArr = f4320j;
            iArr[0] = 0;
            iArr[1] = this.f4327f;
            iArr[2] = this.f4326e;
            iArr[3] = this.f4325d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f4320j;
            iArr2[0] = 0;
            iArr2[1] = this.f4325d;
            iArr2[2] = this.f4326e;
            iArr2[3] = this.f4327f;
        }
        float width = 1.0f - (i / (rectF.width() / 2.0f));
        float[] fArr = f4321k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f4323b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f4320j, f4321k, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        canvas.drawArc(rectF, f, f2, true, this.f4323b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m4237b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f4318h;
        iArr[0] = this.f4327f;
        iArr[1] = this.f4326e;
        iArr[2] = this.f4325d;
        Paint paint = this.f4324c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, f4318h, f4319i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f4324c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m4236c() {
        return this.f4322a;
    }

    /* renamed from: d */
    public void m4235d(int i) {
        this.f4325d = C0122a.m9048d(i, 68);
        this.f4326e = C0122a.m9048d(i, 20);
        this.f4327f = C0122a.m9048d(i, 0);
    }
}
