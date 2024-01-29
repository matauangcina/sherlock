package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0665w0;
import p000a.p001a.p007n.C0033d;
import p054b.p059c.p060a.p075b.C1338b;
import p054b.p059c.p060a.p075b.C1349k;
/* renamed from: com.google.android.material.internal.g */
/* loaded from: classes.dex */
public final class C1851g {

    /* renamed from: a */
    private static final int[] f5500a = {C1338b.colorPrimary};

    /* renamed from: b */
    private static final int[] f5501b = {C1338b.colorPrimaryVariant};

    /* renamed from: c */
    private static final int[] f5502c = {16842752, C1338b.theme};

    /* renamed from: d */
    private static final int[] f5503d = {C1338b.materialThemeOverlay};

    /* renamed from: a */
    public static void m2724a(Context context) {
        m2720e(context, f5500a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m2723b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C1349k.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C1338b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m2722c(context);
            }
        }
        m2724a(context);
    }

    /* renamed from: c */
    public static void m2722c(Context context) {
        m2720e(context, f5501b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m2721d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1349k.ThemeEnforcement, i, i2);
        if (!obtainStyledAttributes.getBoolean(C1349k.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z = obtainStyledAttributes.getResourceId(C1349k.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            z = m2718g(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m2720e(Context context, int[] iArr, String str) {
        if (m2717h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    public static Context m2719f(Context context, AttributeSet attributeSet, int i, int i2) {
        int m2715j = m2715j(context, attributeSet, i, i2);
        if (m2715j != 0) {
            if ((context instanceof C0033d) && ((C0033d) context).m9496b() == m2715j) {
                return context;
            }
            C0033d c0033d = new C0033d(context, m2715j);
            int m2716i = m2716i(c0033d, attributeSet);
            return m2716i != 0 ? new C0033d(c0033d, m2716i) : c0033d;
        }
        return context;
    }

    /* renamed from: g */
    private static boolean m2718g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    private static boolean m2717h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: i */
    private static int m2716i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5502c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: j */
    private static int m2715j(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5503d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: k */
    public static TypedArray m2714k(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2723b(context, attributeSet, i, i2);
        m2721d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: l */
    public static C0665w0 m2713l(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m2723b(context, attributeSet, i, i2);
        m2721d(context, attributeSet, iArr, i, i2, iArr2);
        return C0665w0.m7213u(context, attributeSet, iArr, i, i2);
    }
}
