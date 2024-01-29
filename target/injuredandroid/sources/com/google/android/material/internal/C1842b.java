package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes.dex */
public class C1842b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f5475a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f5476b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m2748a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m2746c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m2747b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2747b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: c */
    public static void m2746c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f5475a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f5475a.set(matrix);
        } else {
            matrix.reset();
        }
        m2747b(viewGroup, view, matrix);
        RectF rectF = f5476b.get();
        if (rectF == null) {
            rectF = new RectF();
            f5476b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
