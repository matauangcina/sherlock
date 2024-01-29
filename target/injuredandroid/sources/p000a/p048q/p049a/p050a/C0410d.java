package p000a.p048q.p049a.p050a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.p052d.C0758g;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p019g.p020d.C0124c;
/* renamed from: a.q.a.a.d */
/* loaded from: classes.dex */
public class C0410d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.d$a */
    /* loaded from: classes.dex */
    public static class C0411a implements TypeEvaluator<C0124c.C0126b[]> {

        /* renamed from: a */
        private C0124c.C0126b[] f1074a;

        C0411a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C0124c.C0126b[] evaluate(float f, C0124c.C0126b[] c0126bArr, C0124c.C0126b[] c0126bArr2) {
            if (C0124c.m9041b(c0126bArr, c0126bArr2)) {
                if (!C0124c.m9041b(this.f1074a, c0126bArr)) {
                    this.f1074a = C0124c.m9037f(c0126bArr);
                }
                for (int i = 0; i < c0126bArr.length; i++) {
                    this.f1074a[i].m9029d(c0126bArr[i], c0126bArr2[i], f);
                }
                return this.f1074a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m8203a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m8202b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator m8202b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p048q.p049a.p050a.C0410d.m8202b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m8201c(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: d */
    private static void m8200d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m8199e(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m8196h(i4)) || (z2 && m8196h(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C0412e m8183a = i == 3 ? C0412e.m8183a() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m8196h(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m8196h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m8196h(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolder == null || m8183a == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m8183a);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C0124c.C0126b[] m9039d = C0124c.m9039d(string);
        C0124c.C0126b[] m9039d2 = C0124c.m9039d(string2);
        if (m9039d == null && m9039d2 == null) {
            return null;
        }
        if (m9039d == null) {
            if (m9039d2 != null) {
                return PropertyValuesHolder.ofObject(str, new C0411a(), m9039d2);
            }
            return null;
        }
        C0411a c0411a = new C0411a();
        if (m9039d2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c0411a, m9039d);
        } else if (!C0124c.m9041b(m9039d, m9039d2)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, c0411a, m9039d, m9039d2);
        }
        return ofObject;
    }

    /* renamed from: f */
    private static int m8198f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && m8196h(i3)) || (z2 && m8196h(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: g */
    private static int m8197g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1060j);
        int i = 0;
        TypedValue m6778l = C0758g.m6778l(m6779k, xmlPullParser, "value", 0);
        if ((m6778l != null) && m8196h(m6778l.type)) {
            i = 3;
        }
        m6779k.recycle();
        return i;
    }

    /* renamed from: h */
    private static boolean m8196h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m8195i(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i) : m8194j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m8194j(Context context, Resources resources, Resources.Theme theme, int i) {
        return m8193k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m8193k(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m8203a(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m8192l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1057g);
        TypedArray m6779k2 = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1061k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m8187q(valueAnimator, m6779k, m6779k2, f, xmlPullParser);
        int m6782h = C0758g.m6782h(m6779k, xmlPullParser, "interpolator", 0, 0);
        if (m6782h > 0) {
            valueAnimator.setInterpolator(C0409c.m8204b(context, m6782h));
        }
        m6779k.recycle();
        if (m6779k2 != null) {
            m6779k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m8191m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1060j);
        float m6784f = C0758g.m6784f(m6779k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m6778l = C0758g.m6778l(m6779k, xmlPullParser, "value", 0);
        boolean z = m6778l != null;
        if (i == 4) {
            i = (z && m8196h(m6778l.type)) ? 3 : 0;
        }
        Keyframe ofInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(m6784f, C0758g.m6783g(m6779k, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m6784f, C0758g.m6784f(m6779k, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(m6784f) : Keyframe.ofInt(m6784f);
        int m6782h = C0758g.m6782h(m6779k, xmlPullParser, "interpolator", 1, 0);
        if (m6782h > 0) {
            ofInt.setInterpolator(C0409c.m8204b(context, m6782h));
        }
        m6779k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m8190n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m8192l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m8189o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m8197g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m8191m = m8191m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m8191m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m8191m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m8201c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m8201c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m8200d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C0412e.m8183a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m8188p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1059i);
                String m6781i = C0758g.m6781i(m6779k, xmlPullParser, "propertyName", 3);
                int m6783g = C0758g.m6783g(m6779k, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder m8189o = m8189o(context, resources, theme, xmlPullParser, m6781i, m6783g);
                if (m8189o == null) {
                    m8189o = m8199e(m6779k, m6783g, 0, 1, m6781i);
                }
                if (m8189o != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m8189o);
                }
                m6779k.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m8187q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long m6783g = C0758g.m6783g(typedArray, xmlPullParser, "duration", 1, 300);
        long m6783g2 = C0758g.m6783g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m6783g3 = C0758g.m6783g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0758g.m6780j(xmlPullParser, "valueFrom") && C0758g.m6780j(xmlPullParser, "valueTo")) {
            if (m6783g3 == 4) {
                m6783g3 = m8198f(typedArray, 5, 6);
            }
            PropertyValuesHolder m8199e = m8199e(typedArray, m6783g3, 5, 6, "");
            if (m8199e != null) {
                valueAnimator.setValues(m8199e);
            }
        }
        valueAnimator.setDuration(m6783g);
        valueAnimator.setStartDelay(m6783g2);
        valueAnimator.setRepeatCount(C0758g.m6783g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0758g.m6783g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m8186r(valueAnimator, typedArray2, m6783g3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m8186r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m6781i = C0758g.m6781i(typedArray, xmlPullParser, "pathData", 1);
        if (m6781i == null) {
            objectAnimator.setPropertyName(C0758g.m6781i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m6781i2 = C0758g.m6781i(typedArray, xmlPullParser, "propertyXName", 2);
        String m6781i3 = C0758g.m6781i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i != 2) {
        }
        if (m6781i2 != null || m6781i3 != null) {
            m8185s(C0124c.m9038e(m6781i), objectAnimator, f * 0.5f, m6781i2, m6781i3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: s */
    private static void m8185s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
