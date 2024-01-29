package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.C0009j;
/* renamed from: androidx.appcompat.widget.a0 */
/* loaded from: classes.dex */
class C0574a0 {

    /* renamed from: k */
    private static final RectF f1926k = new RectF();

    /* renamed from: l */
    private static ConcurrentHashMap<String, Method> f1927l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Field> f1928m = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1929a = 0;

    /* renamed from: b */
    private boolean f1930b = false;

    /* renamed from: c */
    private float f1931c = -1.0f;

    /* renamed from: d */
    private float f1932d = -1.0f;

    /* renamed from: e */
    private float f1933e = -1.0f;

    /* renamed from: f */
    private int[] f1934f = new int[0];

    /* renamed from: g */
    private boolean f1935g = false;

    /* renamed from: h */
    private TextPaint f1936h;

    /* renamed from: i */
    private final TextView f1937i;

    /* renamed from: j */
    private final Context f1938j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0574a0(TextView textView) {
        this.f1937i = textView;
        this.f1938j = textView.getContext();
    }

    /* renamed from: A */
    private void m7566A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1934f = m7559c(iArr);
            m7565B();
        }
    }

    /* renamed from: B */
    private boolean m7565B() {
        int length = this.f1934f.length;
        boolean z = length > 0;
        this.f1935g = z;
        if (z) {
            this.f1929a = 1;
            int[] iArr = this.f1934f;
            this.f1932d = iArr[0];
            this.f1933e = iArr[length - 1];
            this.f1931c = -1.0f;
        }
        return this.f1935g;
    }

    /* renamed from: C */
    private boolean m7564C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1937i.getText();
        TransformationMethod transformationMethod = this.f1937i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1937i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1937i.getMaxLines() : -1;
        m7545q(i);
        StaticLayout m7557e = m7557e(text, (Layout.Alignment) m7544r(this.f1937i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m7557e.getLineCount() <= maxLines && m7557e.getLineEnd(m7557e.getLineCount() - 1) == text.length())) && ((float) m7557e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m7563D() {
        return !(this.f1937i instanceof C0617k);
    }

    /* renamed from: E */
    private void m7562E(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f1929a = 1;
            this.f1932d = f;
            this.f1933e = f2;
            this.f1931c = f3;
            this.f1935g = false;
        }
    }

    /* renamed from: a */
    private static <T> T m7561a(Object obj, String str, T t) {
        try {
            Field m7547o = m7547o(str);
            return m7547o == null ? t : (T) m7547o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m7559c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m7558d() {
        this.f1929a = 0;
        this.f1932d = -1.0f;
        this.f1933e = -1.0f;
        this.f1931c = -1.0f;
        this.f1934f = new int[0];
        this.f1930b = false;
    }

    /* renamed from: f */
    private StaticLayout m7556f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1936h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1937i.getLineSpacingExtra(), this.f1937i.getLineSpacingMultiplier()).setIncludePad(this.f1937i.getIncludeFontPadding()).setBreakStrategy(this.f1937i.getBreakStrategy()).setHyphenationFrequency(this.f1937i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Reader.READ_DONE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            obtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f1937i.getTextDirectionHeuristic() : (TextDirectionHeuristic) m7544r(this.f1937i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m7555g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1936h, i, alignment, ((Float) m7561a(this.f1937i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m7561a(this.f1937i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m7561a(this.f1937i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m7554h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1936h, i, alignment, this.f1937i.getLineSpacingMultiplier(), this.f1937i.getLineSpacingExtra(), this.f1937i.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m7553i(RectF rectF) {
        int length = this.f1934f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m7564C(this.f1934f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1934f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m7547o(String str) {
        try {
            Field field = f1928m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1928m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m7546p(String str) {
        try {
            Method method = f1927l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1927l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    private static <T> T m7544r(Object obj, String str, T t) {
        try {
            return (T) m7546p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m7538x(float f) {
        if (f != this.f1937i.getPaint().getTextSize()) {
            this.f1937i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1937i.isInLayout() : false;
            if (this.f1937i.getLayout() != null) {
                this.f1930b = false;
                try {
                    Method m7546p = m7546p("nullLayouts");
                    if (m7546p != null) {
                        m7546p.invoke(this.f1937i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.f1937i.forceLayout();
                } else {
                    this.f1937i.requestLayout();
                }
                this.f1937i.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m7536z() {
        if (m7563D() && this.f1929a == 1) {
            if (!this.f1935g || this.f1934f.length == 0) {
                int floor = ((int) Math.floor((this.f1933e - this.f1932d) / this.f1931c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1932d + (i * this.f1931c));
                }
                this.f1934f = m7559c(iArr);
            }
            this.f1930b = true;
        } else {
            this.f1930b = false;
        }
        return this.f1930b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7560b() {
        if (m7543s()) {
            if (this.f1930b) {
                if (this.f1937i.getMeasuredHeight() <= 0 || this.f1937i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f1937i.isHorizontallyScrollable() : ((Boolean) m7544r(this.f1937i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1937i.getMeasuredWidth() - this.f1937i.getTotalPaddingLeft()) - this.f1937i.getTotalPaddingRight();
                int height = (this.f1937i.getHeight() - this.f1937i.getCompoundPaddingBottom()) - this.f1937i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (f1926k) {
                    f1926k.setEmpty();
                    f1926k.right = measuredWidth;
                    f1926k.bottom = height;
                    float m7553i = m7553i(f1926k);
                    if (m7553i != this.f1937i.getTextSize()) {
                        m7537y(0, m7553i);
                    }
                }
            }
            this.f1930b = true;
        }
    }

    /* renamed from: e */
    StaticLayout m7557e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 23 ? m7556f(charSequence, alignment, i, i2) : i3 >= 16 ? m7554h(charSequence, alignment, i) : m7555g(charSequence, alignment, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m7552j() {
        return Math.round(this.f1933e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m7551k() {
        return Math.round(this.f1932d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m7550l() {
        return Math.round(this.f1931c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] m7549m() {
        return this.f1934f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m7548n() {
        return this.f1929a;
    }

    /* renamed from: q */
    void m7545q(int i) {
        TextPaint textPaint = this.f1936h;
        if (textPaint == null) {
            this.f1936h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1936h.set(this.f1937i.getPaint());
        this.f1936h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m7543s() {
        return m7563D() && this.f1929a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m7542t(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1938j.obtainStyledAttributes(attributeSet, C0009j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeTextType)) {
            this.f1929a = obtainStyledAttributes.getInt(C0009j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0009j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0009j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0009j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0009j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0009j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m7566A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m7563D()) {
            this.f1929a = 0;
        } else if (this.f1929a == 1) {
            if (!this.f1935g) {
                DisplayMetrics displayMetrics = this.f1938j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m7562E(dimension2, dimension3, dimension);
            }
            m7536z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m7541u(int i, int i2, int i3, int i4) {
        if (m7563D()) {
            DisplayMetrics displayMetrics = this.f1938j.getResources().getDisplayMetrics();
            m7562E(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m7536z()) {
                m7560b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m7540v(int[] iArr, int i) {
        if (m7563D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1938j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1934f = m7559c(iArr2);
                if (!m7565B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1935g = false;
            }
            if (m7536z()) {
                m7560b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m7539w(int i) {
        if (m7563D()) {
            if (i == 0) {
                m7558d();
            } else if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            } else {
                DisplayMetrics displayMetrics = this.f1938j.getResources().getDisplayMetrics();
                m7562E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (m7536z()) {
                    m7560b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m7537y(int i, float f) {
        Context context = this.f1938j;
        m7538x(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
