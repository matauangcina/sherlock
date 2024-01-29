package p000a.p047p;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: a.p.i0 */
/* loaded from: classes.dex */
class C0367i0 {

    /* renamed from: a */
    private static Method f943a;

    /* renamed from: b */
    private static boolean f944b;

    /* renamed from: c */
    private static Field f945c;

    /* renamed from: d */
    private static boolean f946d;

    /* renamed from: b */
    private void m8333b() {
        if (f944b) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            f943a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
        }
        f944b = true;
    }

    /* renamed from: a */
    public void mo8334a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0368j.save_non_transition_alpha, null);
        }
    }

    /* renamed from: c */
    public float mo8332c(View view) {
        Float f = (Float) view.getTag(C0368j.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: d */
    public void mo8331d(View view) {
        if (view.getTag(C0368j.save_non_transition_alpha) == null) {
            view.setTag(C0368j.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo8330e(View view, int i, int i2, int i3, int i4) {
        m8333b();
        Method method = f943a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo8329f(View view, float f) {
        Float f2 = (Float) view.getTag(C0368j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: g */
    public void mo8328g(View view, int i) {
        if (!f946d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f945c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f946d = true;
        }
        Field field = f945c;
        if (field != null) {
            try {
                f945c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo8327h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo8327h(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: i */
    public void mo8326i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo8326i(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
