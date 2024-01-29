package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* renamed from: androidx.coordinatorlayout.widget.b */
/* loaded from: classes.dex */
public class C0702b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2529a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f2530b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m7000a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m6998c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m6999b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m6999b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: c */
    static void m6998c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f2529a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f2529a.set(matrix);
        } else {
            matrix.reset();
        }
        m6999b(viewGroup, view, matrix);
        RectF rectF = f2530b.get();
        if (rectF == null) {
            rectF = new RectF();
            f2530b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
