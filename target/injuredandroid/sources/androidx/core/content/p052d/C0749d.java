package androidx.core.content.p052d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p019g.C0121c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.content.d.d */
/* loaded from: classes.dex */
public final class C0749d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.d.d$a */
    /* loaded from: classes.dex */
    public static final class C0750a {

        /* renamed from: a */
        final int[] f2664a;

        /* renamed from: b */
        final float[] f2665b;

        C0750a(int i, int i2) {
            this.f2664a = new int[]{i, i2};
            this.f2665b = new float[]{0.0f, 1.0f};
        }

        C0750a(int i, int i2, int i3) {
            this.f2664a = new int[]{i, i2, i3};
            this.f2665b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0750a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2664a = new int[size];
            this.f2665b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2664a[i] = list.get(i).intValue();
                this.f2665b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static C0750a m6811a(C0750a c0750a, int i, int i2, boolean z, int i3) {
        return c0750a != null ? c0750a : z ? new C0750a(i, i3, i2) : new C0750a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Shader m6810b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0121c.GradientColor);
        float m6784f = C0758g.m6784f(m6779k, xmlPullParser, "startX", C0121c.GradientColor_android_startX, 0.0f);
        float m6784f2 = C0758g.m6784f(m6779k, xmlPullParser, "startY", C0121c.GradientColor_android_startY, 0.0f);
        float m6784f3 = C0758g.m6784f(m6779k, xmlPullParser, "endX", C0121c.GradientColor_android_endX, 0.0f);
        float m6784f4 = C0758g.m6784f(m6779k, xmlPullParser, "endY", C0121c.GradientColor_android_endY, 0.0f);
        float m6784f5 = C0758g.m6784f(m6779k, xmlPullParser, "centerX", C0121c.GradientColor_android_centerX, 0.0f);
        float m6784f6 = C0758g.m6784f(m6779k, xmlPullParser, "centerY", C0121c.GradientColor_android_centerY, 0.0f);
        int m6783g = C0758g.m6783g(m6779k, xmlPullParser, "type", C0121c.GradientColor_android_type, 0);
        int m6788b = C0758g.m6788b(m6779k, xmlPullParser, "startColor", C0121c.GradientColor_android_startColor, 0);
        boolean m6780j = C0758g.m6780j(xmlPullParser, "centerColor");
        int m6788b2 = C0758g.m6788b(m6779k, xmlPullParser, "centerColor", C0121c.GradientColor_android_centerColor, 0);
        int m6788b3 = C0758g.m6788b(m6779k, xmlPullParser, "endColor", C0121c.GradientColor_android_endColor, 0);
        int m6783g2 = C0758g.m6783g(m6779k, xmlPullParser, "tileMode", C0121c.GradientColor_android_tileMode, 0);
        float m6784f7 = C0758g.m6784f(m6779k, xmlPullParser, "gradientRadius", C0121c.GradientColor_android_gradientRadius, 0.0f);
        m6779k.recycle();
        C0750a m6811a = m6811a(m6809c(resources, xmlPullParser, attributeSet, theme), m6788b, m6788b3, m6780j, m6788b2);
        if (m6783g != 1) {
            return m6783g != 2 ? new LinearGradient(m6784f, m6784f2, m6784f3, m6784f4, m6811a.f2664a, m6811a.f2665b, m6808d(m6783g2)) : new SweepGradient(m6784f5, m6784f6, m6811a.f2664a, m6811a.f2665b);
        } else if (m6784f7 > 0.0f) {
            return new RadialGradient(m6784f5, m6784f6, m6784f7, m6811a.f2664a, m6811a.f2665b, m6808d(m6783g2));
        } else {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.p052d.C0749d.C0750a m6809c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = p000a.p019g.C0121c.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.p052d.C0758g.m6779k(r8, r11, r10, r3)
            int r5 = p000a.p019g.C0121c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p000a.p019g.C0121c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = p000a.p019g.C0121c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p000a.p019g.C0121c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            androidx.core.content.d.d$a r8 = new androidx.core.content.d.d$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p052d.C0749d.m6809c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.d.d$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m6808d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
