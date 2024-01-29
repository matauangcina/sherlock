package p000a.p047p;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: a.p.y */
/* loaded from: classes.dex */
class C0400y {

    /* renamed from: a */
    private static LayoutTransition f1040a;

    /* renamed from: b */
    private static Field f1041b;

    /* renamed from: c */
    private static boolean f1042c;

    /* renamed from: d */
    private static Method f1043d;

    /* renamed from: e */
    private static boolean f1044e;

    /* renamed from: a.p.y$a */
    /* loaded from: classes.dex */
    static class C0401a extends LayoutTransition {
        C0401a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m8222a(LayoutTransition layoutTransition) {
        if (!f1044e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f1043d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f1044e = true;
        }
        Method method = f1043d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8221b(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = p000a.p047p.C0400y.f1040a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            a.p.y$a r0 = new a.p.y$a
            r0.<init>()
            p000a.p047p.C0400y.f1040a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p000a.p047p.C0400y.f1040a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = p000a.p047p.C0400y.f1040a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = p000a.p047p.C0400y.f1040a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p000a.p047p.C0400y.f1040a
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            m8222a(r6)
        L39:
            android.animation.LayoutTransition r0 = p000a.p047p.C0400y.f1040a
            if (r6 == r0) goto L42
            int r0 = p000a.p047p.C0368j.transition_layout_save
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = p000a.p047p.C0400y.f1040a
        L44:
            r5.setLayoutTransition(r6)
            goto L94
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = p000a.p047p.C0400y.f1042c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            p000a.p047p.C0400y.f1041b = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            p000a.p047p.C0400y.f1042c = r1
        L66:
            java.lang.reflect.Field r6 = p000a.p047p.C0400y.f1041b
            if (r6 == 0) goto L7f
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7a
            if (r6 == 0) goto L78
            java.lang.reflect.Field r1 = p000a.p047p.C0400y.f1041b     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L78
        L76:
            r2 = r6
            goto L7a
        L78:
            r2 = r6
            goto L7f
        L7a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L7f:
            if (r2 == 0) goto L84
            r5.requestLayout()
        L84:
            int r6 = p000a.p047p.C0368j.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L94
            int r0 = p000a.p047p.C0368j.transition_layout_save
            r5.setTag(r0, r3)
            goto L44
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p047p.C0400y.m8221b(android.view.ViewGroup, boolean):void");
    }
}
