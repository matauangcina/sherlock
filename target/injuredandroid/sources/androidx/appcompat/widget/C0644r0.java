package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import p000a.p019g.p020d.C0122a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.r0 */
/* loaded from: classes.dex */
public class C0644r0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2178a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f2179b = {-16842910};

    /* renamed from: c */
    static final int[] f2180c = {16842908};

    /* renamed from: d */
    static final int[] f2181d = {16842919};

    /* renamed from: e */
    static final int[] f2182e = {16842912};

    /* renamed from: f */
    static final int[] f2183f = new int[0];

    /* renamed from: g */
    private static final int[] f2184g = new int[1];

    /* renamed from: a */
    public static int m7269a(Context context, int i) {
        ColorStateList m7266d = m7266d(context, i);
        if (m7266d == null || !m7266d.isStateful()) {
            TypedValue m7265e = m7265e();
            context.getTheme().resolveAttribute(16842803, m7265e, true);
            return m7267c(context, i, m7265e.getFloat());
        }
        return m7266d.getColorForState(f2179b, m7266d.getDefaultColor());
    }

    /* renamed from: b */
    public static int m7268b(Context context, int i) {
        int[] iArr = f2184g;
        iArr[0] = i;
        C0665w0 m7214t = C0665w0.m7214t(context, null, iArr);
        try {
            return m7214t.m7232b(0, 0);
        } finally {
            m7214t.m7212v();
        }
    }

    /* renamed from: c */
    static int m7267c(Context context, int i, float f) {
        int m7268b = m7268b(context, i);
        return C0122a.m9048d(m7268b, Math.round(Color.alpha(m7268b) * f));
    }

    /* renamed from: d */
    public static ColorStateList m7266d(Context context, int i) {
        int[] iArr = f2184g;
        iArr[0] = i;
        C0665w0 m7214t = C0665w0.m7214t(context, null, iArr);
        try {
            return m7214t.m7231c(0);
        } finally {
            m7214t.m7212v();
        }
    }

    /* renamed from: e */
    private static TypedValue m7265e() {
        TypedValue typedValue = f2178a.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            f2178a.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
