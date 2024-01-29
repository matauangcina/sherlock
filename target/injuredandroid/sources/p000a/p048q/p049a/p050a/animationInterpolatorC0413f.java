package p000a.p048q.p049a.p050a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.p052d.C0758g;
import org.xmlpull.v1.XmlPullParser;
import p000a.p019g.p020d.C0124c;
/* renamed from: a.q.a.a.f  reason: invalid class name */
/* loaded from: classes.dex */
public class animationInterpolatorC0413f implements Interpolator {

    /* renamed from: a */
    private float[] f1076a;

    /* renamed from: b */
    private float[] f1077b;

    public animationInterpolatorC0413f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public animationInterpolatorC0413f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1062l);
        m8179d(m6779k, xmlPullParser);
        m6779k.recycle();
    }

    /* renamed from: a */
    private void m8182a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m8181b(path);
    }

    /* renamed from: b */
    private void m8181b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f1076a = new float[min];
        this.f1077b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f1076a[i2] = fArr[0];
            this.f1077b[i2] = fArr[1];
        }
        if (Math.abs(this.f1076a[0]) <= 1.0E-5d && Math.abs(this.f1077b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f1076a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f1077b[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.f1076a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f1076a[0]);
        sb.append(",");
        sb.append(this.f1077b[0]);
        sb.append(" end:");
        int i6 = min - 1;
        sb.append(this.f1076a[i6]);
        sb.append(",");
        sb.append(this.f1077b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private void m8180c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m8181b(path);
    }

    /* renamed from: d */
    private void m8179d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0758g.m6780j(xmlPullParser, "pathData")) {
            String m6781i = C0758g.m6781i(typedArray, xmlPullParser, "pathData", 4);
            Path m9038e = C0124c.m9038e(m6781i);
            if (m9038e != null) {
                m8181b(m9038e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m6781i);
        } else if (!C0758g.m6780j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else {
            if (!C0758g.m6780j(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float m6784f = C0758g.m6784f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float m6784f2 = C0758g.m6784f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean m6780j = C0758g.m6780j(xmlPullParser, "controlX2");
            if (m6780j != C0758g.m6780j(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (m6780j) {
                m8182a(m6784f, m6784f2, C0758g.m6784f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0758g.m6784f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            } else {
                m8180c(m6784f, m6784f2);
            }
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f1076a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f1076a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f1076a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f1077b[i];
        }
        float[] fArr2 = this.f1077b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
