package p000a.p048q.p049a.p050a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.p052d.C0743b;
import androidx.core.content.p052d.C0752f;
import androidx.core.content.p052d.C0758g;
import androidx.core.graphics.drawable.C0759a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p014d.C0066a;
import p000a.p019g.p020d.C0124c;
/* renamed from: a.q.a.a.h */
/* loaded from: classes.dex */
public class C0415h extends AbstractC0414g {

    /* renamed from: o */
    static final PorterDuff.Mode f1079o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    private C0423h f1080g;

    /* renamed from: h */
    private PorterDuffColorFilter f1081h;

    /* renamed from: i */
    private ColorFilter f1082i;

    /* renamed from: j */
    private boolean f1083j;

    /* renamed from: k */
    private boolean f1084k;

    /* renamed from: l */
    private final float[] f1085l;

    /* renamed from: m */
    private final Matrix f1086m;

    /* renamed from: n */
    private final Rect f1087n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.h$b */
    /* loaded from: classes.dex */
    public static class C0417b extends AbstractC0421f {
        C0417b() {
        }

        C0417b(C0417b c0417b) {
            super(c0417b);
        }

        /* renamed from: f */
        private void m8167f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1114b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1113a = C0124c.m9039d(string2);
            }
            this.f1115c = C0758g.m6783g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p000a.p048q.p049a.p050a.C0415h.AbstractC0421f
        /* renamed from: c */
        public boolean mo8157c() {
            return true;
        }

        /* renamed from: e */
        public void m8168e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0758g.m6780j(xmlPullParser, "pathData")) {
                TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1054d);
                m8167f(m6779k, xmlPullParser);
                m6779k.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.h$c */
    /* loaded from: classes.dex */
    public static class C0418c extends AbstractC0421f {

        /* renamed from: e */
        private int[] f1088e;

        /* renamed from: f */
        C0743b f1089f;

        /* renamed from: g */
        float f1090g;

        /* renamed from: h */
        C0743b f1091h;

        /* renamed from: i */
        float f1092i;

        /* renamed from: j */
        float f1093j;

        /* renamed from: k */
        float f1094k;

        /* renamed from: l */
        float f1095l;

        /* renamed from: m */
        float f1096m;

        /* renamed from: n */
        Paint.Cap f1097n;

        /* renamed from: o */
        Paint.Join f1098o;

        /* renamed from: p */
        float f1099p;

        C0418c() {
            this.f1090g = 0.0f;
            this.f1092i = 1.0f;
            this.f1093j = 1.0f;
            this.f1094k = 0.0f;
            this.f1095l = 1.0f;
            this.f1096m = 0.0f;
            this.f1097n = Paint.Cap.BUTT;
            this.f1098o = Paint.Join.MITER;
            this.f1099p = 4.0f;
        }

        C0418c(C0418c c0418c) {
            super(c0418c);
            this.f1090g = 0.0f;
            this.f1092i = 1.0f;
            this.f1093j = 1.0f;
            this.f1094k = 0.0f;
            this.f1095l = 1.0f;
            this.f1096m = 0.0f;
            this.f1097n = Paint.Cap.BUTT;
            this.f1098o = Paint.Join.MITER;
            this.f1099p = 4.0f;
            this.f1088e = c0418c.f1088e;
            this.f1089f = c0418c.f1089f;
            this.f1090g = c0418c.f1090g;
            this.f1092i = c0418c.f1092i;
            this.f1091h = c0418c.f1091h;
            this.f1115c = c0418c.f1115c;
            this.f1093j = c0418c.f1093j;
            this.f1094k = c0418c.f1094k;
            this.f1095l = c0418c.f1095l;
            this.f1096m = c0418c.f1096m;
            this.f1097n = c0418c.f1097n;
            this.f1098o = c0418c.f1098o;
            this.f1099p = c0418c.f1099p;
        }

        /* renamed from: e */
        private Paint.Cap m8166e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m8165f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m8163h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f1088e = null;
            if (C0758g.m6780j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1114b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1113a = C0124c.m9039d(string2);
                }
                this.f1091h = C0758g.m6785e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f1093j = C0758g.m6784f(typedArray, xmlPullParser, "fillAlpha", 12, this.f1093j);
                this.f1097n = m8166e(C0758g.m6783g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f1097n);
                this.f1098o = m8165f(C0758g.m6783g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f1098o);
                this.f1099p = C0758g.m6784f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f1099p);
                this.f1089f = C0758g.m6785e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f1092i = C0758g.m6784f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1092i);
                this.f1090g = C0758g.m6784f(typedArray, xmlPullParser, "strokeWidth", 4, this.f1090g);
                this.f1095l = C0758g.m6784f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f1095l);
                this.f1096m = C0758g.m6784f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f1096m);
                this.f1094k = C0758g.m6784f(typedArray, xmlPullParser, "trimPathStart", 5, this.f1094k);
                this.f1115c = C0758g.m6783g(typedArray, xmlPullParser, "fillType", 13, this.f1115c);
            }
        }

        @Override // p000a.p048q.p049a.p050a.C0415h.AbstractC0420e
        /* renamed from: a */
        public boolean mo8159a() {
            return this.f1091h.m6834i() || this.f1089f.m6834i();
        }

        @Override // p000a.p048q.p049a.p050a.C0415h.AbstractC0420e
        /* renamed from: b */
        public boolean mo8158b(int[] iArr) {
            return this.f1089f.m6833j(iArr) | this.f1091h.m6833j(iArr);
        }

        /* renamed from: g */
        public void m8164g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1053c);
            m8163h(m6779k, xmlPullParser, theme);
            m6779k.recycle();
        }

        float getFillAlpha() {
            return this.f1093j;
        }

        int getFillColor() {
            return this.f1091h.m6838e();
        }

        float getStrokeAlpha() {
            return this.f1092i;
        }

        int getStrokeColor() {
            return this.f1089f.m6838e();
        }

        float getStrokeWidth() {
            return this.f1090g;
        }

        float getTrimPathEnd() {
            return this.f1095l;
        }

        float getTrimPathOffset() {
            return this.f1096m;
        }

        float getTrimPathStart() {
            return this.f1094k;
        }

        void setFillAlpha(float f) {
            this.f1093j = f;
        }

        void setFillColor(int i) {
            this.f1091h.m6832k(i);
        }

        void setStrokeAlpha(float f) {
            this.f1092i = f;
        }

        void setStrokeColor(int i) {
            this.f1089f.m6832k(i);
        }

        void setStrokeWidth(float f) {
            this.f1090g = f;
        }

        void setTrimPathEnd(float f) {
            this.f1095l = f;
        }

        void setTrimPathOffset(float f) {
            this.f1096m = f;
        }

        void setTrimPathStart(float f) {
            this.f1094k = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.h$d */
    /* loaded from: classes.dex */
    public static class C0419d extends AbstractC0420e {

        /* renamed from: a */
        final Matrix f1100a;

        /* renamed from: b */
        final ArrayList<AbstractC0420e> f1101b;

        /* renamed from: c */
        float f1102c;

        /* renamed from: d */
        private float f1103d;

        /* renamed from: e */
        private float f1104e;

        /* renamed from: f */
        private float f1105f;

        /* renamed from: g */
        private float f1106g;

        /* renamed from: h */
        private float f1107h;

        /* renamed from: i */
        private float f1108i;

        /* renamed from: j */
        final Matrix f1109j;

        /* renamed from: k */
        int f1110k;

        /* renamed from: l */
        private int[] f1111l;

        /* renamed from: m */
        private String f1112m;

        public C0419d() {
            super();
            this.f1100a = new Matrix();
            this.f1101b = new ArrayList<>();
            this.f1102c = 0.0f;
            this.f1103d = 0.0f;
            this.f1104e = 0.0f;
            this.f1105f = 1.0f;
            this.f1106g = 1.0f;
            this.f1107h = 0.0f;
            this.f1108i = 0.0f;
            this.f1109j = new Matrix();
            this.f1112m = null;
        }

        public C0419d(C0419d c0419d, C0066a<String, Object> c0066a) {
            super();
            AbstractC0421f c0417b;
            this.f1100a = new Matrix();
            this.f1101b = new ArrayList<>();
            this.f1102c = 0.0f;
            this.f1103d = 0.0f;
            this.f1104e = 0.0f;
            this.f1105f = 1.0f;
            this.f1106g = 1.0f;
            this.f1107h = 0.0f;
            this.f1108i = 0.0f;
            this.f1109j = new Matrix();
            this.f1112m = null;
            this.f1102c = c0419d.f1102c;
            this.f1103d = c0419d.f1103d;
            this.f1104e = c0419d.f1104e;
            this.f1105f = c0419d.f1105f;
            this.f1106g = c0419d.f1106g;
            this.f1107h = c0419d.f1107h;
            this.f1108i = c0419d.f1108i;
            this.f1111l = c0419d.f1111l;
            String str = c0419d.f1112m;
            this.f1112m = str;
            this.f1110k = c0419d.f1110k;
            if (str != null) {
                c0066a.put(str, this);
            }
            this.f1109j.set(c0419d.f1109j);
            ArrayList<AbstractC0420e> arrayList = c0419d.f1101b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC0420e abstractC0420e = arrayList.get(i);
                if (abstractC0420e instanceof C0419d) {
                    this.f1101b.add(new C0419d((C0419d) abstractC0420e, c0066a));
                } else {
                    if (abstractC0420e instanceof C0418c) {
                        c0417b = new C0418c((C0418c) abstractC0420e);
                    } else if (!(abstractC0420e instanceof C0417b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        c0417b = new C0417b((C0417b) abstractC0420e);
                    }
                    this.f1101b.add(c0417b);
                    String str2 = c0417b.f1114b;
                    if (str2 != null) {
                        c0066a.put(str2, c0417b);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m8161d() {
            this.f1109j.reset();
            this.f1109j.postTranslate(-this.f1103d, -this.f1104e);
            this.f1109j.postScale(this.f1105f, this.f1106g);
            this.f1109j.postRotate(this.f1102c, 0.0f, 0.0f);
            this.f1109j.postTranslate(this.f1107h + this.f1103d, this.f1108i + this.f1104e);
        }

        /* renamed from: e */
        private void m8160e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f1111l = null;
            this.f1102c = C0758g.m6784f(typedArray, xmlPullParser, "rotation", 5, this.f1102c);
            this.f1103d = typedArray.getFloat(1, this.f1103d);
            this.f1104e = typedArray.getFloat(2, this.f1104e);
            this.f1105f = C0758g.m6784f(typedArray, xmlPullParser, "scaleX", 3, this.f1105f);
            this.f1106g = C0758g.m6784f(typedArray, xmlPullParser, "scaleY", 4, this.f1106g);
            this.f1107h = C0758g.m6784f(typedArray, xmlPullParser, "translateX", 6, this.f1107h);
            this.f1108i = C0758g.m6784f(typedArray, xmlPullParser, "translateY", 7, this.f1108i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1112m = string;
            }
            m8161d();
        }

        @Override // p000a.p048q.p049a.p050a.C0415h.AbstractC0420e
        /* renamed from: a */
        public boolean mo8159a() {
            for (int i = 0; i < this.f1101b.size(); i++) {
                if (this.f1101b.get(i).mo8159a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000a.p048q.p049a.p050a.C0415h.AbstractC0420e
        /* renamed from: b */
        public boolean mo8158b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f1101b.size(); i++) {
                z |= this.f1101b.get(i).mo8158b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m8162c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1052b);
            m8160e(m6779k, xmlPullParser);
            m6779k.recycle();
        }

        public String getGroupName() {
            return this.f1112m;
        }

        public Matrix getLocalMatrix() {
            return this.f1109j;
        }

        public float getPivotX() {
            return this.f1103d;
        }

        public float getPivotY() {
            return this.f1104e;
        }

        public float getRotation() {
            return this.f1102c;
        }

        public float getScaleX() {
            return this.f1105f;
        }

        public float getScaleY() {
            return this.f1106g;
        }

        public float getTranslateX() {
            return this.f1107h;
        }

        public float getTranslateY() {
            return this.f1108i;
        }

        public void setPivotX(float f) {
            if (f != this.f1103d) {
                this.f1103d = f;
                m8161d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f1104e) {
                this.f1104e = f;
                m8161d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f1102c) {
                this.f1102c = f;
                m8161d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f1105f) {
                this.f1105f = f;
                m8161d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f1106g) {
                this.f1106g = f;
                m8161d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f1107h) {
                this.f1107h = f;
                m8161d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f1108i) {
                this.f1108i = f;
                m8161d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.h$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0420e {
        private AbstractC0420e() {
        }

        /* renamed from: a */
        public boolean mo8159a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo8158b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.h$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0421f extends AbstractC0420e {

        /* renamed from: a */
        protected C0124c.C0126b[] f1113a;

        /* renamed from: b */
        String f1114b;

        /* renamed from: c */
        int f1115c;

        /* renamed from: d */
        int f1116d;

        public AbstractC0421f() {
            super();
            this.f1113a = null;
            this.f1115c = 0;
        }

        public AbstractC0421f(AbstractC0421f abstractC0421f) {
            super();
            this.f1113a = null;
            this.f1115c = 0;
            this.f1114b = abstractC0421f.f1114b;
            this.f1116d = abstractC0421f.f1116d;
            this.f1113a = C0124c.m9037f(abstractC0421f.f1113a);
        }

        /* renamed from: c */
        public boolean mo8157c() {
            return false;
        }

        /* renamed from: d */
        public void m8156d(Path path) {
            path.reset();
            C0124c.C0126b[] c0126bArr = this.f1113a;
            if (c0126bArr != null) {
                C0124c.C0126b.m9028e(c0126bArr, path);
            }
        }

        public C0124c.C0126b[] getPathData() {
            return this.f1113a;
        }

        public String getPathName() {
            return this.f1114b;
        }

        public void setPathData(C0124c.C0126b[] c0126bArr) {
            if (C0124c.m9041b(this.f1113a, c0126bArr)) {
                C0124c.m9033j(this.f1113a, c0126bArr);
            } else {
                this.f1113a = C0124c.m9037f(c0126bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.h$g */
    /* loaded from: classes.dex */
    public static class C0422g {

        /* renamed from: q */
        private static final Matrix f1117q = new Matrix();

        /* renamed from: a */
        private final Path f1118a;

        /* renamed from: b */
        private final Path f1119b;

        /* renamed from: c */
        private final Matrix f1120c;

        /* renamed from: d */
        Paint f1121d;

        /* renamed from: e */
        Paint f1122e;

        /* renamed from: f */
        private PathMeasure f1123f;

        /* renamed from: g */
        private int f1124g;

        /* renamed from: h */
        final C0419d f1125h;

        /* renamed from: i */
        float f1126i;

        /* renamed from: j */
        float f1127j;

        /* renamed from: k */
        float f1128k;

        /* renamed from: l */
        float f1129l;

        /* renamed from: m */
        int f1130m;

        /* renamed from: n */
        String f1131n;

        /* renamed from: o */
        Boolean f1132o;

        /* renamed from: p */
        final C0066a<String, Object> f1133p;

        public C0422g() {
            this.f1120c = new Matrix();
            this.f1126i = 0.0f;
            this.f1127j = 0.0f;
            this.f1128k = 0.0f;
            this.f1129l = 0.0f;
            this.f1130m = 255;
            this.f1131n = null;
            this.f1132o = null;
            this.f1133p = new C0066a<>();
            this.f1125h = new C0419d();
            this.f1118a = new Path();
            this.f1119b = new Path();
        }

        public C0422g(C0422g c0422g) {
            this.f1120c = new Matrix();
            this.f1126i = 0.0f;
            this.f1127j = 0.0f;
            this.f1128k = 0.0f;
            this.f1129l = 0.0f;
            this.f1130m = 255;
            this.f1131n = null;
            this.f1132o = null;
            C0066a<String, Object> c0066a = new C0066a<>();
            this.f1133p = c0066a;
            this.f1125h = new C0419d(c0422g.f1125h, c0066a);
            this.f1118a = new Path(c0422g.f1118a);
            this.f1119b = new Path(c0422g.f1119b);
            this.f1126i = c0422g.f1126i;
            this.f1127j = c0422g.f1127j;
            this.f1128k = c0422g.f1128k;
            this.f1129l = c0422g.f1129l;
            this.f1124g = c0422g.f1124g;
            this.f1130m = c0422g.f1130m;
            this.f1131n = c0422g.f1131n;
            String str = c0422g.f1131n;
            if (str != null) {
                this.f1133p.put(str, this);
            }
            this.f1132o = c0422g.f1132o;
        }

        /* renamed from: a */
        private static float m8155a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m8153c(C0419d c0419d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0419d.f1100a.set(matrix);
            c0419d.f1100a.preConcat(c0419d.f1109j);
            canvas.save();
            for (int i3 = 0; i3 < c0419d.f1101b.size(); i3++) {
                AbstractC0420e abstractC0420e = c0419d.f1101b.get(i3);
                if (abstractC0420e instanceof C0419d) {
                    m8153c((C0419d) abstractC0420e, c0419d.f1100a, canvas, i, i2, colorFilter);
                } else if (abstractC0420e instanceof AbstractC0421f) {
                    m8152d(c0419d, (AbstractC0421f) abstractC0420e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m8152d(C0419d c0419d, AbstractC0421f abstractC0421f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f1128k;
            float f2 = i2 / this.f1129l;
            float min = Math.min(f, f2);
            Matrix matrix = c0419d.f1100a;
            this.f1120c.set(matrix);
            this.f1120c.postScale(f, f2);
            float m8151e = m8151e(matrix);
            if (m8151e == 0.0f) {
                return;
            }
            abstractC0421f.m8156d(this.f1118a);
            Path path = this.f1118a;
            this.f1119b.reset();
            if (abstractC0421f.mo8157c()) {
                this.f1119b.setFillType(abstractC0421f.f1115c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f1119b.addPath(path, this.f1120c);
                canvas.clipPath(this.f1119b);
                return;
            }
            C0418c c0418c = (C0418c) abstractC0421f;
            if (c0418c.f1094k != 0.0f || c0418c.f1095l != 1.0f) {
                float f3 = c0418c.f1094k;
                float f4 = c0418c.f1096m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c0418c.f1095l + f4) % 1.0f;
                if (this.f1123f == null) {
                    this.f1123f = new PathMeasure();
                }
                this.f1123f.setPath(this.f1118a, false);
                float length = this.f1123f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f1123f.getSegment(f7, length, path, true);
                    this.f1123f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f1123f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1119b.addPath(path, this.f1120c);
            if (c0418c.f1091h.m6831l()) {
                C0743b c0743b = c0418c.f1091h;
                if (this.f1122e == null) {
                    Paint paint = new Paint(1);
                    this.f1122e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f1122e;
                if (c0743b.m6835h()) {
                    Shader m6837f = c0743b.m6837f();
                    m6837f.setLocalMatrix(this.f1120c);
                    paint2.setShader(m6837f);
                    paint2.setAlpha(Math.round(c0418c.f1093j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C0415h.m8178a(c0743b.m6838e(), c0418c.f1093j));
                }
                paint2.setColorFilter(colorFilter);
                this.f1119b.setFillType(c0418c.f1115c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1119b, paint2);
            }
            if (c0418c.f1089f.m6831l()) {
                C0743b c0743b2 = c0418c.f1089f;
                if (this.f1121d == null) {
                    Paint paint3 = new Paint(1);
                    this.f1121d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f1121d;
                Paint.Join join = c0418c.f1098o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c0418c.f1097n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c0418c.f1099p);
                if (c0743b2.m6835h()) {
                    Shader m6837f2 = c0743b2.m6837f();
                    m6837f2.setLocalMatrix(this.f1120c);
                    paint4.setShader(m6837f2);
                    paint4.setAlpha(Math.round(c0418c.f1092i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C0415h.m8178a(c0743b2.m6838e(), c0418c.f1092i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c0418c.f1090g * min * m8151e);
                canvas.drawPath(this.f1119b, paint4);
            }
        }

        /* renamed from: e */
        private float m8151e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m8155a = m8155a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(m8155a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void m8154b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m8153c(this.f1125h, f1117q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean m8150f() {
            if (this.f1132o == null) {
                this.f1132o = Boolean.valueOf(this.f1125h.mo8159a());
            }
            return this.f1132o.booleanValue();
        }

        /* renamed from: g */
        public boolean m8149g(int[] iArr) {
            return this.f1125h.mo8158b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f1130m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f1130m = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.q.a.a.h$h */
    /* loaded from: classes.dex */
    public static class C0423h extends Drawable.ConstantState {

        /* renamed from: a */
        int f1134a;

        /* renamed from: b */
        C0422g f1135b;

        /* renamed from: c */
        ColorStateList f1136c;

        /* renamed from: d */
        PorterDuff.Mode f1137d;

        /* renamed from: e */
        boolean f1138e;

        /* renamed from: f */
        Bitmap f1139f;

        /* renamed from: g */
        ColorStateList f1140g;

        /* renamed from: h */
        PorterDuff.Mode f1141h;

        /* renamed from: i */
        int f1142i;

        /* renamed from: j */
        boolean f1143j;

        /* renamed from: k */
        boolean f1144k;

        /* renamed from: l */
        Paint f1145l;

        public C0423h() {
            this.f1136c = null;
            this.f1137d = C0415h.f1079o;
            this.f1135b = new C0422g();
        }

        public C0423h(C0423h c0423h) {
            this.f1136c = null;
            this.f1137d = C0415h.f1079o;
            if (c0423h != null) {
                this.f1134a = c0423h.f1134a;
                C0422g c0422g = new C0422g(c0423h.f1135b);
                this.f1135b = c0422g;
                if (c0423h.f1135b.f1122e != null) {
                    c0422g.f1122e = new Paint(c0423h.f1135b.f1122e);
                }
                if (c0423h.f1135b.f1121d != null) {
                    this.f1135b.f1121d = new Paint(c0423h.f1135b.f1121d);
                }
                this.f1136c = c0423h.f1136c;
                this.f1137d = c0423h.f1137d;
                this.f1138e = c0423h.f1138e;
            }
        }

        /* renamed from: a */
        public boolean m8148a(int i, int i2) {
            return i == this.f1139f.getWidth() && i2 == this.f1139f.getHeight();
        }

        /* renamed from: b */
        public boolean m8147b() {
            return !this.f1144k && this.f1140g == this.f1136c && this.f1141h == this.f1137d && this.f1143j == this.f1138e && this.f1142i == this.f1135b.getRootAlpha();
        }

        /* renamed from: c */
        public void m8146c(int i, int i2) {
            if (this.f1139f == null || !m8148a(i, i2)) {
                this.f1139f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f1144k = true;
            }
        }

        /* renamed from: d */
        public void m8145d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f1139f, (Rect) null, rect, m8144e(colorFilter));
        }

        /* renamed from: e */
        public Paint m8144e(ColorFilter colorFilter) {
            if (m8143f() || colorFilter != null) {
                if (this.f1145l == null) {
                    Paint paint = new Paint();
                    this.f1145l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f1145l.setAlpha(this.f1135b.getRootAlpha());
                this.f1145l.setColorFilter(colorFilter);
                return this.f1145l;
            }
            return null;
        }

        /* renamed from: f */
        public boolean m8143f() {
            return this.f1135b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m8142g() {
            return this.f1135b.m8150f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1134a;
        }

        /* renamed from: h */
        public boolean m8141h(int[] iArr) {
            boolean m8149g = this.f1135b.m8149g(iArr);
            this.f1144k |= m8149g;
            return m8149g;
        }

        /* renamed from: i */
        public void m8140i() {
            this.f1140g = this.f1136c;
            this.f1141h = this.f1137d;
            this.f1142i = this.f1135b.getRootAlpha();
            this.f1143j = this.f1138e;
            this.f1144k = false;
        }

        /* renamed from: j */
        public void m8139j(int i, int i2) {
            this.f1139f.eraseColor(0);
            this.f1135b.m8154b(new Canvas(this.f1139f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0415h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0415h(this);
        }
    }

    /* renamed from: a.q.a.a.h$i */
    /* loaded from: classes.dex */
    private static class C0424i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f1146a;

        public C0424i(Drawable.ConstantState constantState) {
            this.f1146a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1146a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1146a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0415h c0415h = new C0415h();
            c0415h.f1078f = (VectorDrawable) this.f1146a.newDrawable();
            return c0415h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0415h c0415h = new C0415h();
            c0415h.f1078f = (VectorDrawable) this.f1146a.newDrawable(resources);
            return c0415h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0415h c0415h = new C0415h();
            c0415h.f1078f = (VectorDrawable) this.f1146a.newDrawable(resources, theme);
            return c0415h;
        }
    }

    C0415h() {
        this.f1084k = true;
        this.f1085l = new float[9];
        this.f1086m = new Matrix();
        this.f1087n = new Rect();
        this.f1080g = new C0423h();
    }

    C0415h(C0423h c0423h) {
        this.f1084k = true;
        this.f1085l = new float[9];
        this.f1086m = new Matrix();
        this.f1087n = new Rect();
        this.f1080g = c0423h;
        this.f1081h = m8169j(this.f1081h, c0423h.f1136c, c0423h.f1137d);
    }

    /* renamed from: a */
    static int m8178a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static C0415h m8177b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C0415h c0415h = new C0415h();
            c0415h.f1078f = C0752f.m6801d(resources, i, theme);
            new C0424i(c0415h.f1078f.getConstantState());
            return c0415h;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m8176c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    /* renamed from: c */
    public static C0415h m8176c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0415h c0415h = new C0415h();
        c0415h.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0415h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m8174e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C0417b c0417b;
        C0423h c0423h = this.f1080g;
        C0422g c0422g = c0423h.f1135b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0422g.f1125h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0419d c0419d = (C0419d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0418c c0418c = new C0418c();
                    c0418c.m8164g(resources, attributeSet, theme, xmlPullParser);
                    c0419d.f1101b.add(c0418c);
                    if (c0418c.getPathName() != null) {
                        c0422g.f1133p.put(c0418c.getPathName(), c0418c);
                    }
                    z = false;
                    c0417b = c0418c;
                } else if ("clip-path".equals(name)) {
                    C0417b c0417b2 = new C0417b();
                    c0417b2.m8168e(resources, attributeSet, theme, xmlPullParser);
                    c0419d.f1101b.add(c0417b2);
                    String pathName = c0417b2.getPathName();
                    c0417b = c0417b2;
                    if (pathName != null) {
                        c0422g.f1133p.put(c0417b2.getPathName(), c0417b2);
                        c0417b = c0417b2;
                    }
                } else if ("group".equals(name)) {
                    C0419d c0419d2 = new C0419d();
                    c0419d2.m8162c(resources, attributeSet, theme, xmlPullParser);
                    c0419d.f1101b.add(c0419d2);
                    arrayDeque.push(c0419d2);
                    if (c0419d2.getGroupName() != null) {
                        c0422g.f1133p.put(c0419d2.getGroupName(), c0419d2);
                    }
                    i = c0423h.f1134a;
                    i2 = c0419d2.f1110k;
                    c0423h.f1134a = i2 | i;
                }
                i = c0423h.f1134a;
                i2 = c0417b.f1116d;
                c0423h.f1134a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m8173f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0759a.m6756f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m8172g(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: i */
    private void m8170i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0423h c0423h = this.f1080g;
        C0422g c0422g = c0423h.f1135b;
        c0423h.f1137d = m8172g(C0758g.m6783g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m6787c = C0758g.m6787c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m6787c != null) {
            c0423h.f1136c = m6787c;
        }
        c0423h.f1138e = C0758g.m6789a(typedArray, xmlPullParser, "autoMirrored", 5, c0423h.f1138e);
        c0422g.f1128k = C0758g.m6784f(typedArray, xmlPullParser, "viewportWidth", 7, c0422g.f1128k);
        float m6784f = C0758g.m6784f(typedArray, xmlPullParser, "viewportHeight", 8, c0422g.f1129l);
        c0422g.f1129l = m6784f;
        if (c0422g.f1128k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (m6784f <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0422g.f1126i = typedArray.getDimension(3, c0422g.f1126i);
            float dimension = typedArray.getDimension(2, c0422g.f1127j);
            c0422g.f1127j = dimension;
            if (c0422g.f1126i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0422g.setAlpha(C0758g.m6784f(typedArray, xmlPullParser, "alpha", 4, c0422g.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c0422g.f1131n = string;
                    c0422g.f1133p.put(string, c0422g);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6760b(drawable);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object m8175d(String str) {
        return this.f1080g.f1135b.f1133p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f1087n);
        if (this.f1087n.width() <= 0 || this.f1087n.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1082i;
        if (colorFilter == null) {
            colorFilter = this.f1081h;
        }
        canvas.getMatrix(this.f1086m);
        this.f1086m.getValues(this.f1085l);
        float abs = Math.abs(this.f1085l[0]);
        float abs2 = Math.abs(this.f1085l[4]);
        float abs3 = Math.abs(this.f1085l[1]);
        float abs4 = Math.abs(this.f1085l[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f1087n.width() * abs));
        int min2 = Math.min(2048, (int) (this.f1087n.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f1087n;
        canvas.translate(rect.left, rect.top);
        if (m8173f()) {
            canvas.translate(this.f1087n.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f1087n.offsetTo(0, 0);
        this.f1080g.m8146c(min, min2);
        if (!this.f1084k) {
            this.f1080g.m8139j(min, min2);
        } else if (!this.f1080g.m8147b()) {
            this.f1080g.m8139j(min, min2);
            this.f1080g.m8140i();
        }
        this.f1080g.m8145d(canvas, colorFilter, this.f1087n);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1078f;
        return drawable != null ? C0759a.m6758d(drawable) : this.f1080g.f1135b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1080g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1078f;
        return drawable != null ? C0759a.m6757e(drawable) : this.f1082i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1078f == null || Build.VERSION.SDK_INT < 24) {
            this.f1080g.f1134a = getChangingConfigurations();
            return this.f1080g;
        }
        return new C0424i(this.f1078f.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1080g.f1135b.f1127j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1080g.f1135b.f1126i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m8171h(boolean z) {
        this.f1084k = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6755g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0423h c0423h = this.f1080g;
        c0423h.f1135b = new C0422g();
        TypedArray m6779k = C0758g.m6779k(resources, theme, attributeSet, C0404a.f1051a);
        m8170i(m6779k, xmlPullParser, theme);
        m6779k.recycle();
        c0423h.f1134a = getChangingConfigurations();
        c0423h.f1144k = true;
        m8174e(resources, xmlPullParser, attributeSet, theme);
        this.f1081h = m8169j(this.f1081h, c0423h.f1136c, c0423h.f1137d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1078f;
        return drawable != null ? C0759a.m6754h(drawable) : this.f1080g.f1138e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0423h c0423h;
        ColorStateList colorStateList;
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0423h = this.f1080g) != null && (c0423h.m8142g() || ((colorStateList = this.f1080g.f1136c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    PorterDuffColorFilter m8169j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1083j && super.mutate() == this) {
            this.f1080g = new C0423h(this.f1080g);
            this.f1083j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0423h c0423h = this.f1080g;
        ColorStateList colorStateList = c0423h.f1136c;
        if (colorStateList != null && (mode = c0423h.f1137d) != null) {
            this.f1081h = m8169j(this.f1081h, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (c0423h.m8142g() && c0423h.m8141h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1080g.f1135b.getRootAlpha() != i) {
            this.f1080g.f1135b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6752j(drawable, z);
        } else {
            this.f1080g.f1138e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f1082i = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTint(int i) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6748n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6747o(drawable, colorStateList);
            return;
        }
        C0423h c0423h = this.f1080g;
        if (c0423h.f1136c != colorStateList) {
            c0423h.f1136c = colorStateList;
            this.f1081h = m8169j(this.f1081h, colorStateList, c0423h.f1137d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0760b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            C0759a.m6746p(drawable, mode);
            return;
        }
        C0423h c0423h = this.f1080g;
        if (c0423h.f1137d != mode) {
            c0423h.f1137d = mode;
            this.f1081h = m8169j(this.f1081h, c0423h.f1136c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1078f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1078f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
