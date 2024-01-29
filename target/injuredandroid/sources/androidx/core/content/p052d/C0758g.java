package androidx.core.content.p052d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: androidx.core.content.d.g */
/* loaded from: classes.dex */
public class C0758g {
    /* renamed from: a */
    public static boolean m6789a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m6780j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m6788b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m6780j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m6787c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (m6780j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 != 2) {
                return (i2 < 28 || i2 > 31) ? C0742a.m6847d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m6786d(typedValue);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        return null;
    }

    /* renamed from: d */
    private static ColorStateList m6786d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0743b m6785e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m6780j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0743b.m6841b(typedValue.data);
            }
            C0743b m6836g = C0743b.m6836g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (m6836g != null) {
                return m6836g;
            }
        }
        return C0743b.m6841b(i2);
    }

    /* renamed from: f */
    public static float m6784f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m6780j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m6783g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m6780j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m6782h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m6780j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m6781i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m6780j(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m6780j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m6779k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m6778l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m6780j(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }
}
